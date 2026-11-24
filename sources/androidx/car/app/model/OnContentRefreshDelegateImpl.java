package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements ap7 {
    private final IOnContentRefreshListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final bp7 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(bp7 bp7Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onClick", new a(this, (byte) 2));
        }
    }

    private OnContentRefreshDelegateImpl(bp7 bp7Var) {
        this.mListener = new OnContentRefreshListenerStub(bp7Var);
    }

    public static ap7 create(bp7 bp7Var) {
        return new OnContentRefreshDelegateImpl(bp7Var);
    }

    public void sendContentRefreshRequested(cp7 cp7Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
