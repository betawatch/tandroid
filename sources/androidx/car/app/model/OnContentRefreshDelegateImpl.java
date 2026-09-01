package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements d0 {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            androidx.car.app.utils.j.b(iOnDoneCallback, "onClick", new f(this, 2));
        }
    }

    private OnContentRefreshDelegateImpl(e0 e0Var) {
        this.mListener = new OnContentRefreshListenerStub(e0Var);
    }

    public static d0 create(e0 e0Var) {
        return new OnContentRefreshDelegateImpl(e0Var);
    }

    public void sendContentRefreshRequested(androidx.car.app.j jVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.j.a());
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
