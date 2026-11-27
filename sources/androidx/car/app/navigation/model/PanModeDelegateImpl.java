package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.utils.e;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements wx7 {
    private final IPanModeListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class PanModeListenerStub extends IPanModeListener.Stub {
        private final xx7 mListener;

        public PanModeListenerStub(xx7 xx7Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            e.c(iOnDoneCallback, "onPanModeChanged", new da9() { // from class: androidx.car.app.navigation.model.a
                @Override // da9
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z);
                    return lambda$onPanModeChanged$0;
                }
            });
        }
    }

    private PanModeDelegateImpl(xx7 xx7Var) {
        this.mStub = new PanModeListenerStub(xx7Var);
    }

    public static wx7 create(xx7 xx7Var) {
        return new PanModeDelegateImpl(xx7Var);
    }

    public void sendPanModeChanged(boolean z, cs7 cs7Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
