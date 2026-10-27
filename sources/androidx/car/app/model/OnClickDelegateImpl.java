package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements b0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            androidx.car.app.utils.h.b(iOnDoneCallback, "onClick", new f(this, 1));
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
            iOnClickListener.onClick(androidx.car.app.utils.h.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
