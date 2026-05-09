package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements AlertCallbackDelegate {
    private final IAlertCallback mCallback;

    static AlertCallbackDelegate create(AlertCallback alertCallback) {
        return new AlertCallbackDelegateImpl(alertCallback);
    }

    private AlertCallbackDelegateImpl(AlertCallback alertCallback) {
        this.mCallback = new AlertCallbackStub(alertCallback);
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }

    public void sendCancel(int i, OnDoneCallback onDoneCallback) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(OnDoneCallback onDoneCallback) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class AlertCallbackStub extends IAlertCallback.Stub {
        private final AlertCallback mCallback;

        AlertCallbackStub(AlertCallback alertCallback) {
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onCancel", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.AlertCallbackDelegateImpl$AlertCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onAlertCancelled$0;
                    lambda$onAlertCancelled$0 = AlertCallbackDelegateImpl.AlertCallbackStub.this.lambda$onAlertCancelled$0(i);
                    return lambda$onAlertCancelled$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onDismiss", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.AlertCallbackDelegateImpl$AlertCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onAlertDismissed$1;
                    lambda$onAlertDismissed$1 = AlertCallbackDelegateImpl.AlertCallbackStub.this.lambda$onAlertDismissed$1();
                    return lambda$onAlertDismissed$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }
    }
}
