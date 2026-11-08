package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements d0 {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final e0 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(e0 e0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onClick", new f(this, 2));
        }
    }

    private OnContentRefreshDelegateImpl(e0 e0Var) {
        this.mListener = new OnContentRefreshListenerStub(e0Var);
    }

    public static d0 create(e0 e0Var) {
        return new OnContentRefreshDelegateImpl(e0Var);
    }

    public void sendContentRefreshRequested(androidx.car.app.k kVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.g.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
