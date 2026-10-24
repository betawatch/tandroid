package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements d0 {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
