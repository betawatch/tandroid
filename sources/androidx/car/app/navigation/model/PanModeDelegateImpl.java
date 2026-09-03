package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements g {
    private final IPanModeListener mStub;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final i mListener;

        public PanModeListenerStub(i iVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z4) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z4, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onPanModeChanged", new androidx.car.app.utils.d() { // from class: androidx.car.app.navigation.model.h
                @Override // androidx.car.app.utils.d
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z4);
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

    public void sendPanModeChanged(boolean z4, androidx.car.app.j jVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z4, androidx.car.app.utils.j.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
