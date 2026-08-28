package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements e {
    private final IAlertCallback mCallback;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final d mCallback;

        public AlertCallbackStub(d dVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i9) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(int i9, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onCancel", new g(this, i9, 0));
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onDismiss", new f(this, 0));
        }
    }

    private AlertCallbackDelegateImpl(d dVar) {
        this.mCallback = new AlertCallbackStub(dVar);
    }

    public static e create(d dVar) {
        return new AlertCallbackDelegateImpl(dVar);
    }

    public void sendCancel(int i9, androidx.car.app.k kVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i9, androidx.car.app.utils.j.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void sendDismiss(androidx.car.app.k kVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(androidx.car.app.utils.j.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
