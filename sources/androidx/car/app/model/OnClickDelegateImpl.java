package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements yr7 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    static class OnClickListenerStub extends IOnClickListener.Stub {
        private final zr7 mOnClickListener;

        public OnClickListenerStub(zr7 zr7Var) {
            this.mOnClickListener = zr7Var;
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

    private OnClickDelegateImpl(zr7 zr7Var, boolean z) {
        this.mListener = new OnClickListenerStub(zr7Var);
        this.mIsParkedOnly = z;
    }

    public static yr7 create(zr7 zr7Var) {
        return new OnClickDelegateImpl(zr7Var, zr7Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // yr7
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(cs7 cs7Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
