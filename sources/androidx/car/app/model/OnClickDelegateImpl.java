package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements b0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final c0 mOnClickListener;

        public OnClickListenerStub(c0 c0Var) {
            this.mOnClickListener = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.i.b(iOnDoneCallback, "onClick", new f(this, 1));
        }
    }

    private OnClickDelegateImpl(c0 c0Var, boolean z10) {
        this.mListener = new OnClickListenerStub(c0Var);
        this.mIsParkedOnly = z10;
    }

    public static b0 create(c0 c0Var) {
        return new OnClickDelegateImpl(c0Var, c0Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // androidx.car.app.model.b0
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(androidx.car.app.k kVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.i.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
