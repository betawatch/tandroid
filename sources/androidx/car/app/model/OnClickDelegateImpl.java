package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements b0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
            androidx.car.app.utils.g.b(iOnDoneCallback, "onClick", new f(this, 1));
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
            iOnClickListener.onClick(androidx.car.app.utils.g.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
