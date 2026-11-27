package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements oc {
    private final IAlertCallback mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class AlertCallbackStub extends IAlertCallback.Stub {
        private final nc mCallback;

        public AlertCallbackStub(nc ncVar) {
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

    private AlertCallbackDelegateImpl(nc ncVar) {
        this.mCallback = new AlertCallbackStub(ncVar);
    }

    public static oc create(nc ncVar) {
        return new AlertCallbackDelegateImpl(ncVar);
    }

    public void sendCancel(int i, cs7 cs7Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    public void sendDismiss(cs7 cs7Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
