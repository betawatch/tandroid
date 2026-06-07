package androidx.car.app;

import android.content.ContextWrapper;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class CarContext extends ContextWrapper {

    class 1 extends IOnRequestPermissionsListener.Stub {
        final /* synthetic */ CarContext this$0;
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ OnRequestPermissionsListener val$listener;

        1(CarContext carContext, Lifecycle lifecycle, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
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
