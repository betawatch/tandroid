package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements h0 {
    private final IOnSelectedListener mStub;

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final t mListener;

        public OnSelectedListenerStub(t tVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i7) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i7, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onSelectedListener", new g(this, i7, 1));
        }
    }

    private OnSelectedDelegateImpl(t tVar) {
        this.mStub = new OnSelectedListenerStub(tVar);
    }

    public static h0 create(t tVar) {
        return new OnSelectedDelegateImpl(tVar);
    }

    public void sendSelected(int i7, androidx.car.app.k kVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i7, androidx.car.app.utils.g.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
