package androidx.car.app;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public abstract class ScreenManager {

    class LifecycleObserverImpl implements DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            throw null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            throw null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            throw null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            throw null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            throw null;
        }
    }
}
