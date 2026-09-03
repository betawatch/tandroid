package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements b0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            androidx.car.app.utils.j.b(iOnDoneCallback, "onClick", new f(this, 1));
        }
    }

    private OnClickDelegateImpl(c0 c0Var, boolean z4) {
        this.mListener = new OnClickListenerStub(c0Var);
        this.mIsParkedOnly = z4;
    }

    public static b0 create(c0 c0Var) {
        return new OnClickDelegateImpl(c0Var, c0Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // androidx.car.app.model.b0
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(androidx.car.app.j jVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.j.a());
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
