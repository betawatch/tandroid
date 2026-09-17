package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements d0 {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
