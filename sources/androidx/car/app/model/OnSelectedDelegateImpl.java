package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements hs7 {
    private final IOnSelectedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ut5 mListener;

        public OnSelectedListenerStub(ut5 ut5Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onSelectedListener", new b(this, i, (byte) 1));
        }
    }

    private OnSelectedDelegateImpl(ut5 ut5Var) {
        this.mStub = new OnSelectedListenerStub(ut5Var);
    }

    public static hs7 create(ut5 ut5Var) {
        return new OnSelectedDelegateImpl(ut5Var);
    }

    public void sendSelected(int i, cs7 cs7Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
