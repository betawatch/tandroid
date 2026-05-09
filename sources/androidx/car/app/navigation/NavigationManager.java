package androidx.car.app.navigation;

import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.managers.Manager;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import j$.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class NavigationManager implements Manager {
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private boolean mIsAutoDriveEnabled;
    private boolean mIsNavigating;
    private final INavigationManager.Stub mNavigationManager;
    private Executor mNavigationManagerCallbackExecutor;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopNavigation$3() {
    }

    public static NavigationManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new NavigationManager(carContext, hostDispatcher, lifecycle);
    }

    public INavigationManager.Stub getIInterface() {
        return this.mNavigationManager;
    }

    public void onStopNavigation() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            this.mIsNavigating = false;
            Executor executor = this.mNavigationManagerCallbackExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NavigationManager.this.lambda$onStopNavigation$3();
                }
            });
        }
    }

    public void onAutoDriveEnabled() {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable("CarApp.Nav", 3)) {
            Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
        }
        this.mIsAutoDriveEnabled = true;
        Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
    }

    protected NavigationManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        this.mCarContext = carContext;
        Objects.requireNonNull(hostDispatcher);
        this.mHostDispatcher = hostDispatcher;
        this.mNavigationManager = new 1(lifecycle);
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.navigation.NavigationManager.2
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
                NavigationManager.this.onStopNavigation();
                lifecycle.removeObserver(this);
            }
        });
    }

    class 1 extends INavigationManager.Stub {
        final /* synthetic */ Lifecycle val$lifecycle;

        1(Lifecycle lifecycle) {
            this.val$lifecycle = lifecycle;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.NavigationManager$1$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onStopNavigation$0;
                    lambda$onStopNavigation$0 = NavigationManager.1.this.lambda$onStopNavigation$0();
                    return lambda$onStopNavigation$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onStopNavigation$0() {
            NavigationManager.this.onStopNavigation();
            return null;
        }
    }
}
