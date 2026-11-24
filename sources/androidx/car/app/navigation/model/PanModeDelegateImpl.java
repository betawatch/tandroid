package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.utils.e;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements pu7 {
    private final IPanModeListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class PanModeListenerStub extends IPanModeListener.Stub {
        private final qu7 mListener;

        public PanModeListenerStub(qu7 qu7Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            e.c(iOnDoneCallback, "onPanModeChanged", new q69() { // from class: androidx.car.app.navigation.model.a
                @Override // q69
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z);
                    return lambda$onPanModeChanged$0;
                }
            });
        }
    }

    private PanModeDelegateImpl(qu7 qu7Var) {
        this.mStub = new PanModeListenerStub(qu7Var);
    }

    public static pu7 create(qu7 qu7Var) {
        return new PanModeDelegateImpl(qu7Var);
    }

    public void sendPanModeChanged(boolean z, cp7 cp7Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
