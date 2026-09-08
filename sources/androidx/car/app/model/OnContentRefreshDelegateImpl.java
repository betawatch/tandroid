package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements d0 {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            androidx.car.app.utils.i.b(iOnDoneCallback, "onClick", new f(this, 2));
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
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.i.a());
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
