package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public abstract class RemoteUtils {

    public interface HostCall {
        Object dispatch();
    }

    public interface RemoteCall {
        Object call();
    }

    public static Object dispatchCallToHostForResult(String str, RemoteCall remoteCall) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            return remoteCall.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException("Remote " + str + " call failed", e2);
        }
    }

    public static void dispatchCallToHost(String str, RemoteCall remoteCall) {
        try {
            dispatchCallToHostForResult(str, remoteCall);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e);
        }
    }

    public static void dispatchCallFromHost(final IOnDoneCallback iOnDoneCallback, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$0(IOnDoneCallback.this, str, hostCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$0(IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        try {
            sendSuccessResponseToHost(iOnDoneCallback, str, hostCall.dispatch());
        } catch (BundlerException e) {
            sendFailureResponseToHost(iOnDoneCallback, str, e);
        } catch (RuntimeException e2) {
            sendFailureResponseToHost(iOnDoneCallback, str, e2);
            throw new RuntimeException(e2);
        }
    }

    public static void dispatchCallFromHost(final Lifecycle lifecycle, final IOnDoneCallback iOnDoneCallback, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$1(Lifecycle.this, iOnDoneCallback, str, hostCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$1(Lifecycle lifecycle, IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        if (lifecycle == null || !lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            sendFailureResponseToHost(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + hostCall));
            return;
        }
        dispatchCallFromHost(iOnDoneCallback, str, hostCall);
    }

    public static void dispatchCallFromHost(final Lifecycle lifecycle, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$2(Lifecycle.this, hostCall, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$2(Lifecycle lifecycle, HostCall hostCall, String str) {
        if (lifecycle != null) {
            try {
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    hostCall.dispatch();
                    return;
                }
            } catch (BundlerException e) {
                Log.e("CarApp.Dispatch", "Serialization failure in " + str, e);
                return;
            }
        }
        Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + hostCall);
    }

    public static void sendSuccessResponseToHost(final IOnDoneCallback iOnDoneCallback, final String str, final Object obj) {
        dispatchCallToHost(str + " onSuccess", new RemoteCall() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$sendSuccessResponseToHost$3;
                lambda$sendSuccessResponseToHost$3 = RemoteUtils.lambda$sendSuccessResponseToHost$3(IOnDoneCallback.this, obj, str);
                return lambda$sendSuccessResponseToHost$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendSuccessResponseToHost$3(IOnDoneCallback iOnDoneCallback, Object obj, String str) {
        Bundleable create;
        if (obj == null) {
            create = null;
        } else {
            try {
                create = Bundleable.create(obj);
            } catch (BundlerException e) {
                sendFailureResponseToHost(iOnDoneCallback, str, e);
            }
        }
        iOnDoneCallback.onSuccess(create);
        return null;
    }

    public static void sendFailureResponseToHost(final IOnDoneCallback iOnDoneCallback, final String str, final Throwable th) {
        dispatchCallToHost(str + " onFailure", new RemoteCall() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$sendFailureResponseToHost$4;
                lambda$sendFailureResponseToHost$4 = RemoteUtils.lambda$sendFailureResponseToHost$4(IOnDoneCallback.this, th, str);
                return lambda$sendFailureResponseToHost$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendFailureResponseToHost$4(IOnDoneCallback iOnDoneCallback, Throwable th, String str) {
        try {
            iOnDoneCallback.onFailure(Bundleable.create(new FailureResponse(th)));
            return null;
        } catch (BundlerException e) {
            Log.e("CarApp.Dispatch", "Serialization failure in " + str, e);
            return null;
        }
    }

    public static IOnDoneCallback createOnDoneCallbackStub(OnDoneCallback onDoneCallback) {
        return new IOnDoneCallback.Stub(onDoneCallback) { // from class: androidx.car.app.utils.RemoteUtils.1
            final /* synthetic */ OnDoneCallback val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(Bundleable bundleable) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(Bundleable bundleable) {
                throw null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final Lifecycle mLifecycle;
        private final SurfaceCallback mSurfaceCallback;

        SurfaceCallbackStub(Lifecycle lifecycle, SurfaceCallback surfaceCallback) {
            this.mLifecycle = lifecycle;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda3
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onSurfaceAvailable$0;
                    lambda$onSurfaceAvailable$0 = RemoteUtils.SurfaceCallbackStub.this.lambda$onSurfaceAvailable$0(bundleable);
                    return lambda$onSurfaceAvailable$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceAvailable$0(Bundleable bundleable) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda2
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onVisibleAreaChanged$1;
                    lambda$onVisibleAreaChanged$1 = RemoteUtils.SurfaceCallbackStub.this.lambda$onVisibleAreaChanged$1(rect);
                    return lambda$onVisibleAreaChanged$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda7
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onStableAreaChanged$2;
                    lambda$onStableAreaChanged$2 = RemoteUtils.SurfaceCallbackStub.this.lambda$onStableAreaChanged$2(rect);
                    return lambda$onStableAreaChanged$2;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onSurfaceDestroyed$3;
                    lambda$onSurfaceDestroyed$3 = RemoteUtils.SurfaceCallbackStub.this.lambda$onSurfaceDestroyed$3(bundleable);
                    return lambda$onSurfaceDestroyed$3;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceDestroyed$3(Bundleable bundleable) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(final float f, final float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScroll", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda4
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onScroll$4;
                    lambda$onScroll$4 = RemoteUtils.SurfaceCallbackStub.this.lambda$onScroll$4(f, f2);
                    return lambda$onScroll$4;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(final float f, final float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onFling", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda5
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onFling$5;
                    lambda$onFling$5 = RemoteUtils.SurfaceCallbackStub.this.lambda$onFling$5(f, f2);
                    return lambda$onFling$5;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(final float f, final float f2, final float f3) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScale", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda6
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onScale$6;
                    lambda$onScale$6 = RemoteUtils.SurfaceCallbackStub.this.lambda$onScale$6(f, f2, f3);
                    return lambda$onScale$6;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
            throw null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(final float f, final float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onClick", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onClick$7;
                    lambda$onClick$7 = RemoteUtils.SurfaceCallbackStub.this.lambda$onClick$7(f, f2);
                    return lambda$onClick$7;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
            throw null;
        }
    }
}
