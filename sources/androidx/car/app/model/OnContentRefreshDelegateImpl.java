package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements as7 {
    private final IOnContentRefreshListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final bs7 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(bs7 bs7Var) {
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

    private OnContentRefreshDelegateImpl(bs7 bs7Var) {
        this.mListener = new OnContentRefreshListenerStub(bs7Var);
    }

    public static as7 create(bs7 bs7Var) {
        return new OnContentRefreshDelegateImpl(bs7Var);
    }

    public void sendContentRefreshRequested(cs7 cs7Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
