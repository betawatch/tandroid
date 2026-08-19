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
                    return AlertCallbackDelegateImpl.AlertCallbackStub.$r8$lambda$KnQ-FnNRyUyR5iddrT6-wu_j5-U(AlertCallbackDelegateImpl.AlertCallbackStub.this, i);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$KnQ-FnNRyUyR5iddrT6-wu_j5-U(AlertCallbackStub alertCallbackStub, int i) {
            alertCallbackStub.getClass();
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onDismiss", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.AlertCallbackDelegateImpl$AlertCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return AlertCallbackDelegateImpl.AlertCallbackStub.$r8$lambda$TaRFdnKZJVRXV72MsEkaaZoD3dg(AlertCallbackDelegateImpl.AlertCallbackStub.this);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$TaRFdnKZJVRXV72MsEkaaZoD3dg(AlertCallbackStub alertCallbackStub) {
            alertCallbackStub.getClass();
            throw null;
        }
    }
}
