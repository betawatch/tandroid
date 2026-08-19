package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class NavigationManager {

    class 1 extends INavigationManager.Stub {
        final /* synthetic */ NavigationManager this$0;
        final /* synthetic */ Lifecycle val$lifecycle;

        1(NavigationManager navigationManager, Lifecycle lifecycle) {
            this.val$lifecycle = lifecycle;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.NavigationManager$1$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return NavigationManager.1.$r8$lambda$GO2OrYvvWaXZTH1XkmNcVUSxmKU(NavigationManager.1.this);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$GO2OrYvvWaXZTH1XkmNcVUSxmKU(1 r0) {
            r0.getClass();
            throw null;
        }
    }

    class 2 implements DefaultLifecycleObserver {
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
            throw null;
        }
    }
}
