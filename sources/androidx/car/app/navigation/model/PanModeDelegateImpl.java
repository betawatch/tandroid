package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements g {
    private final IPanModeListener mStub;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final i mListener;

        public PanModeListenerStub(i iVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z10) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z10, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onPanModeChanged", new androidx.car.app.utils.d() { // from class: androidx.car.app.navigation.model.h
                @Override // androidx.car.app.utils.d
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z10);
                    return lambda$onPanModeChanged$0;
                }
            });
        }
    }

    private PanModeDelegateImpl(i iVar) {
        this.mStub = new PanModeListenerStub(iVar);
    }

    public static g create(i iVar) {
        return new PanModeDelegateImpl(iVar);
    }

    public void sendPanModeChanged(boolean z10, androidx.car.app.k kVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z10, androidx.car.app.utils.j.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
