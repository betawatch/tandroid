package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements dr7 {
    private final IOnContentRefreshListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final er7 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(er7 er7Var) {
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

    private OnContentRefreshDelegateImpl(er7 er7Var) {
        this.mListener = new OnContentRefreshListenerStub(er7Var);
    }

    public static dr7 create(er7 er7Var) {
        return new OnContentRefreshDelegateImpl(er7Var);
    }

    public void sendContentRefreshRequested(fr7 fr7Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
