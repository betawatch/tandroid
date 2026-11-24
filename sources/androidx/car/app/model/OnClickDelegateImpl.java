package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements yo7 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class OnClickListenerStub extends IOnClickListener.Stub {
        private final zo7 mOnClickListener;

        public OnClickListenerStub(zo7 zo7Var) {
            this.mOnClickListener = zo7Var;
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

    private OnClickDelegateImpl(zo7 zo7Var, boolean z) {
        this.mListener = new OnClickListenerStub(zo7Var);
        this.mIsParkedOnly = z;
    }

    public static yo7 create(zo7 zo7Var) {
        return new OnClickDelegateImpl(zo7Var, zo7Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // yo7
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(cp7 cp7Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
