package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements kr7 {
    private final IOnSelectedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final rt5 mListener;

        public OnSelectedListenerStub(rt5 rt5Var) {
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

    private OnSelectedDelegateImpl(rt5 rt5Var) {
        this.mStub = new OnSelectedListenerStub(rt5Var);
    }

    public static kr7 create(rt5 rt5Var) {
        return new OnSelectedDelegateImpl(rt5Var);
    }

    public void sendSelected(int i, fr7 fr7Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
