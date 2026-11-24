package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements hp7 {
    private final IOnSelectedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final sr5 mListener;

        public OnSelectedListenerStub(sr5 sr5Var) {
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

    private OnSelectedDelegateImpl(sr5 sr5Var) {
        this.mStub = new OnSelectedListenerStub(sr5Var);
    }

    public static hp7 create(sr5 sr5Var) {
        return new OnSelectedDelegateImpl(sr5Var);
    }

    public void sendSelected(int i, cp7 cp7Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
