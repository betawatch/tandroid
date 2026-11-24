package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.utils.e;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements qw7 {
    private final IPanModeListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class PanModeListenerStub extends IPanModeListener.Stub {
        private final rw7 mListener;

        public PanModeListenerStub(rw7 rw7Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            e.c(iOnDoneCallback, "onPanModeChanged", new s89() { // from class: androidx.car.app.navigation.model.a
                @Override // s89
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z);
                    return lambda$onPanModeChanged$0;
                }
            });
        }
    }

    private PanModeDelegateImpl(rw7 rw7Var) {
        this.mStub = new PanModeListenerStub(rw7Var);
    }

    public static qw7 create(rw7 rw7Var) {
        return new PanModeDelegateImpl(rw7Var);
    }

    public void sendPanModeChanged(boolean z, fr7 fr7Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
