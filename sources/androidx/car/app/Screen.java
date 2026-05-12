package androidx.car.app;

import android.util.Log;
import androidx.car.app.model.Template;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class Screen implements LifecycleOwner {
    private final CarContext mCarContext;
    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
    private OnScreenResultListener mOnScreenResultListener = new OnScreenResultListener() { // from class: androidx.car.app.Screen$$ExternalSyntheticLambda0
        @Override // androidx.car.app.OnScreenResultListener
        public final void onScreenResult(Object obj) {
            Screen.lambda$new$0(obj);
        }
    };
    private Object mResult;
    private TemplateWrapper mTemplateWrapper;
    private boolean mUseLastTemplateId;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Object obj) {
    }

    public abstract Template onGetTemplate();

    protected Screen(CarContext carContext) {
        Objects.requireNonNull(carContext);
        this.mCarContext = carContext;
    }

    public final void invalidate() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final CarContext getCarContext() {
        return this.mCarContext;
    }

    public final ScreenManager getScreenManager() {
        return (ScreenManager) this.mCarContext.getCarService(ScreenManager.class);
    }

    public void dispatchLifecycleEvent(final Lifecycle.Event event) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.Screen$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Screen.this.lambda$dispatchLifecycleEvent$1(event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchLifecycleEvent$1(Lifecycle.Event event) {
        if (this.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.mOnScreenResultListener.onScreenResult(this.mResult);
            }
            this.mLifecycleRegistry.handleLifecycleEvent(event);
        }
    }

    TemplateWrapper getTemplateWrapper() {
        TemplateWrapper wrap;
        TemplateWrapper templateWrapper;
        Template onGetTemplate = onGetTemplate();
        if (this.mUseLastTemplateId && (templateWrapper = this.mTemplateWrapper) != null) {
            wrap = TemplateWrapper.wrap(onGetTemplate, getLastTemplateInfo(templateWrapper).getTemplateId());
        } else {
            wrap = TemplateWrapper.wrap(onGetTemplate);
        }
        this.mUseLastTemplateId = false;
        this.mTemplateWrapper = wrap;
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Returning " + onGetTemplate + " from screen " + this);
        }
        return wrap;
    }

    TemplateInfo getLastTemplateInfo() {
        if (this.mTemplateWrapper == null) {
            this.mTemplateWrapper = TemplateWrapper.wrap(onGetTemplate());
        }
        return new TemplateInfo(this.mTemplateWrapper.getTemplate().getClass(), this.mTemplateWrapper.getId());
    }

    private static TemplateInfo getLastTemplateInfo(TemplateWrapper templateWrapper) {
        return new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId());
    }

    void setUseLastTemplateId(boolean z) {
        this.mUseLastTemplateId = z;
    }
}
