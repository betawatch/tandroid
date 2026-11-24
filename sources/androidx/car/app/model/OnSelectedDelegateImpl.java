package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements hp7 {
    private final IOnSelectedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
