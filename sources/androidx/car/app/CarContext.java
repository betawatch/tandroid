package androidx.car.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.constraints.ConstraintManager;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.managers.Manager;
import androidx.car.app.managers.ManagerCache;
import androidx.car.app.managers.ManagerFactory;
import androidx.car.app.managers.ResultManager;
import androidx.car.app.media.MediaPlaybackManager;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.suggestion.SuggestionManager;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class CarContext extends ContextWrapper {
    private int mCarAppApiLevel;
    private final HostDispatcher mHostDispatcher;
    private HostInfo mHostInfo;
    private final Lifecycle mLifecycle;
    private final ManagerCache mManagers;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;

    public static /* synthetic */ ResultManager $r8$lambda$PLFyesAEudIcWeAhSdKCU9rg_lM(CarContext carContext) {
        carContext.lambda$new$8();
        return null;
    }

    public static CarContext create(Lifecycle lifecycle) {
        return new CarContext(lifecycle, new HostDispatcher());
    }

    public Object getCarService(Class cls) {
        Objects.requireNonNull(cls);
        return this.mManagers.getOrCreate(cls);
    }

    public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public int getCarAppApiLevel() {
        int i = this.mCarAppApiLevel;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Car App API level hasn't been established yet");
    }

    class 1 extends IOnRequestPermissionsListener.Stub {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ OnRequestPermissionsListener val$listener;

        1(Lifecycle lifecycle, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
            this.val$lifecycle = lifecycle;
            this.val$executor = executor;
        }

        @Override // androidx.car.app.IOnRequestPermissionsListener
        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
            if (this.val$lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                final List asList = Arrays.asList(strArr);
                final List asList2 = Arrays.asList(strArr2);
                final OnRequestPermissionsListener onRequestPermissionsListener = null;
                this.val$executor.execute(new Runnable(onRequestPermissionsListener, asList, asList2) { // from class: androidx.car.app.CarContext$1$$ExternalSyntheticLambda0
                    public final /* synthetic */ List f$1;
                    public final /* synthetic */ List f$2;

                    {
                        this.f$1 = asList;
                        this.f$2 = asList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((OnRequestPermissionsListener) null).onRequestPermissionsResult(this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    public void setCarHost(ICarHost iCarHost) {
        ThreadUtils.checkMainThread();
        HostDispatcher hostDispatcher = this.mHostDispatcher;
        Objects.requireNonNull(iCarHost);
        hostDispatcher.setCarHost(iCarHost);
    }

    void onCarConfigurationChanged(Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        Objects.requireNonNull(configuration);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    public void updateHandshakeInfo(HandshakeInfo handshakeInfo) {
        this.mCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
    }

    void updateHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    void attachBaseContext(Context context, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            Objects.requireNonNull(systemService);
            attachBaseContext(context.createDisplayContext(((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8).getDisplay()).createConfigurationContext(configuration));
        }
        onCarConfigurationChanged(configuration);
    }

    protected CarContext(final Lifecycle lifecycle, final HostDispatcher hostDispatcher) {
        super(null);
        ManagerCache managerCache = new ManagerCache();
        this.mManagers = managerCache;
        this.mCarAppApiLevel = 0;
        this.mHostInfo = null;
        this.mHostDispatcher = hostDispatcher;
        managerCache.addFactory(AppManager.class, "app", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda0
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                AppManager lambda$new$3;
                lambda$new$3 = CarContext.this.lambda$new$3(hostDispatcher, lifecycle);
                return lambda$new$3;
            }
        });
        managerCache.addFactory(NavigationManager.class, "navigation", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda1
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                NavigationManager lambda$new$4;
                lambda$new$4 = CarContext.this.lambda$new$4(hostDispatcher, lifecycle);
                return lambda$new$4;
            }
        });
        managerCache.addFactory(ScreenManager.class, "screen", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda2
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                ScreenManager lambda$new$5;
                lambda$new$5 = CarContext.this.lambda$new$5(lifecycle);
                return lambda$new$5;
            }
        });
        managerCache.addFactory(ConstraintManager.class, "constraints", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda3
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                ConstraintManager lambda$new$6;
                lambda$new$6 = CarContext.this.lambda$new$6(hostDispatcher);
                return lambda$new$6;
            }
        });
        managerCache.addFactory(CarHardwareManager.class, "hardware", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda4
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                CarHardwareManager lambda$new$7;
                lambda$new$7 = CarContext.this.lambda$new$7(hostDispatcher);
                return lambda$new$7;
            }
        });
        managerCache.addFactory(ResultManager.class, null, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda5
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                CarContext.$r8$lambda$PLFyesAEudIcWeAhSdKCU9rg_lM(CarContext.this);
                return null;
            }
        });
        managerCache.addFactory(SuggestionManager.class, "suggestion", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda6
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                SuggestionManager lambda$new$9;
                lambda$new$9 = CarContext.this.lambda$new$9(hostDispatcher, lifecycle);
                return lambda$new$9;
            }
        });
        managerCache.addFactory(MediaPlaybackManager.class, "media_playback", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda7
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                MediaPlaybackManager lambda$new$10;
                lambda$new$10 = CarContext.this.lambda$new$10(hostDispatcher, lifecycle);
                return lambda$new$10;
            }
        });
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                CarContext.this.lambda$new$11();
            }
        });
        this.mLifecycle = lifecycle;
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.CarContext.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                hostDispatcher.resetHosts();
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppManager lambda$new$3(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return AppManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NavigationManager lambda$new$4(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return NavigationManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScreenManager lambda$new$5(Lifecycle lifecycle) {
        return ScreenManager.create(this, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstraintManager lambda$new$6(HostDispatcher hostDispatcher) {
        return ConstraintManager.create(this, hostDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CarHardwareManager lambda$new$7(HostDispatcher hostDispatcher) {
        return CarHardwareManager.-CC.create(this, hostDispatcher);
    }

    private /* synthetic */ ResultManager lambda$new$8() {
        ResultManager.-CC.create(this);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SuggestionManager lambda$new$9(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return SuggestionManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MediaPlaybackManager lambda$new$10(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return MediaPlaybackManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11() {
        ((ScreenManager) getCarService(ScreenManager.class)).pop();
    }
}
