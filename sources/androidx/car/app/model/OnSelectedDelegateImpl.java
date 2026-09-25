package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements h0 {
    private final IOnSelectedListener mStub;

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final t mListener;

        public OnSelectedListenerStub(t tVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i10) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i10, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onSelectedListener", new g(this, i10, 1));
        }
    }

    private OnSelectedDelegateImpl(t tVar) {
        this.mStub = new OnSelectedListenerStub(tVar);
    }

    public static h0 create(t tVar) {
        return new OnSelectedDelegateImpl(tVar);
    }

    public void sendSelected(int i10, androidx.car.app.k kVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i10, androidx.car.app.utils.g.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
