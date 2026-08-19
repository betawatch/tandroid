package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class PanModeDelegateImpl implements PanModeDelegate {
    private final IPanModeListener mStub;

    public void sendPanModeChanged(boolean z, OnDoneCallback onDoneCallback) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl(PanModeListener panModeListener) {
        this.mStub = new PanModeListenerStub(panModeListener);
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }

    static PanModeDelegate create(PanModeListener panModeListener) {
        return new PanModeDelegateImpl(panModeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PanModeListenerStub extends IPanModeListener.Stub {
        private final PanModeListener mListener;

        PanModeListenerStub(PanModeListener panModeListener) {
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onPanModeChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.model.PanModeDelegateImpl$PanModeListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return PanModeDelegateImpl.PanModeListenerStub.$r8$lambda$Cc5fbnjHwTbzO2_Zd3zE93Unv3c(PanModeDelegateImpl.PanModeListenerStub.this, z);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$Cc5fbnjHwTbzO2_Zd3zE93Unv3c(PanModeListenerStub panModeListenerStub, boolean z) {
            panModeListenerStub.getClass();
            throw null;
        }
    }
}
