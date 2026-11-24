package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements nc {
    private final IAlertCallback mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class AlertCallbackStub extends IAlertCallback.Stub {
        private final mc mCallback;

        public AlertCallbackStub(mc mcVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onCancel", new b(this, i, (byte) 0));
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onDismiss", new a(this, (byte) 0));
        }
    }

    private AlertCallbackDelegateImpl(mc mcVar) {
        this.mCallback = new AlertCallbackStub(mcVar);
    }

    public static nc create(mc mcVar) {
        return new AlertCallbackDelegateImpl(mcVar);
    }

    public void sendCancel(int i, cp7 cp7Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    public void sendDismiss(cp7 cp7Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
