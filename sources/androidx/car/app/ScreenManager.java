package androidx.car.app;

import android.util.Log;
import androidx.car.app.managers.Manager;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ScreenManager implements Manager {
    private final Lifecycle mAppLifecycle;
    private final CarContext mCarContext;
    private final Deque mScreenStack = new ArrayDeque();

    public Screen getTop() {
        ThreadUtils.checkMainThread();
        Screen screen = (Screen) this.mScreenStack.peek();
        Objects.requireNonNull(screen);
        return screen;
    }

    public void push(Screen screen) {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
            }
        } else {
            Objects.requireNonNull(screen);
            pushInternal(screen);
        }
    }

    public void pop() {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
            }
        } else if (this.mScreenStack.size() > 1) {
            popInternal(Collections.singletonList((Screen) this.mScreenStack.pop()));
        }
    }

    static ScreenManager create(CarContext carContext, Lifecycle lifecycle) {
        return new ScreenManager(carContext, lifecycle);
    }

    TemplateWrapper getTopTemplate() {
        ThreadUtils.checkMainThread();
        Screen top = getTop();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Requesting template from Screen " + top);
        }
        TemplateWrapper templateWrapper = top.getTemplateWrapper();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mScreenStack.iterator();
        while (it.hasNext()) {
            arrayList.add(((Screen) it.next()).getLastTemplateInfo());
        }
        templateWrapper.setTemplateInfosForScreenStack(arrayList);
        return templateWrapper;
    }

    void destroyAndClearScreenStack() {
        Iterator it = new ArrayDeque(this.mScreenStack).iterator();
        while (it.hasNext()) {
            stop((Screen) it.next(), true);
        }
        this.mScreenStack.clear();
    }

    protected Deque getScreenStackInternal() {
        return this.mScreenStack;
    }

    private void pushInternal(Screen screen) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Pushing screen " + screen + " to the top of the screen stack");
        }
        if (this.mScreenStack.contains(screen)) {
            moveToTop(screen);
            return;
        }
        Screen screen2 = (Screen) this.mScreenStack.peek();
        pushAndStart(screen, true);
        if (this.mScreenStack.contains(screen)) {
            if (screen2 != null) {
                stop(screen2, false);
            }
            if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
        }
    }

    private void popInternal(List list) {
        Screen top = getTop();
        top.setUseLastTemplateId(true);
        ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            top.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Screen screen = (Screen) it.next();
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Popping screen " + screen + " off the screen stack");
            }
            stop(screen, true);
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Screen " + top + " is at the top of the screen stack");
        }
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && this.mScreenStack.contains(top)) {
            top.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    private void pushAndStart(Screen screen, boolean z) {
        this.mScreenStack.push(screen);
        if (z && this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
        if (screen.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    private void stop(Screen screen, boolean z) {
        Lifecycle.State currentState = screen.getLifecycle().getCurrentState();
        if (currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        if (currentState.isAtLeast(Lifecycle.State.STARTED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        if (z) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }

    private void moveToTop(Screen screen) {
        Screen screen2 = (Screen) this.mScreenStack.peek();
        if (screen2 == null || screen2 == screen) {
            return;
        }
        this.mScreenStack.remove(screen);
        pushAndStart(screen, false);
        stop(screen2, false);
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    protected ScreenManager(CarContext carContext, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mAppLifecycle = lifecycle;
        lifecycle.addObserver(new LifecycleObserverImpl());
    }

    class LifecycleObserverImpl implements DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
        }

        LifecycleObserverImpl() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            Screen screen = (Screen) ScreenManager.this.getScreenStackInternal().peek();
            if (screen == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
            } else {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            Screen screen = (Screen) ScreenManager.this.getScreenStackInternal().peek();
            if (screen == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
            } else {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            Screen screen = (Screen) ScreenManager.this.getScreenStackInternal().peek();
            if (screen == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
            } else {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            Screen screen = (Screen) ScreenManager.this.getScreenStackInternal().peek();
            if (screen == null) {
                Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
            } else {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_STOP);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            ScreenManager.this.destroyAndClearScreenStack();
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
