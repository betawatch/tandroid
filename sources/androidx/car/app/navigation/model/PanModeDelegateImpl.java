package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements g {
    private final IPanModeListener mStub;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            androidx.car.app.utils.i.b(iOnDoneCallback, "onPanModeChanged", new androidx.car.app.utils.c() { // from class: androidx.car.app.navigation.model.h
                @Override // androidx.car.app.utils.c
                public final Object b() {
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

    public void sendPanModeChanged(boolean z10, androidx.car.app.j jVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z10, androidx.car.app.utils.i.a());
        } catch (RemoteException e9) {
            throw new RuntimeException(e9);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
