package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements br7 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnClickListenerStub extends IOnClickListener.Stub {
        private final cr7 mOnClickListener;

        public OnClickListenerStub(cr7 cr7Var) {
            this.mOnClickListener = cr7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onClick", new a(this, (byte) 1));
        }
    }

    private OnClickDelegateImpl(cr7 cr7Var, boolean z) {
        this.mListener = new OnClickListenerStub(cr7Var);
        this.mIsParkedOnly = z;
    }

    public static br7 create(cr7 cr7Var) {
        return new OnClickDelegateImpl(cr7Var, cr7Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // br7
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(fr7 fr7Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
