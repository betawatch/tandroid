package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements dp7 {
    private final IOnItemVisibilityChangedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final rr5 mListener;

        public OnItemVisibilityChangedListenerStub(rr5 rr5Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onItemVisibilityChanged", new q69() { // from class: androidx.car.app.model.e
                @Override // q69
                public final Object a() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i, i2);
                    return lambda$onItemVisibilityChanged$0;
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(rr5 rr5Var) {
        this.mStub = new OnItemVisibilityChangedListenerStub(rr5Var);
    }

    public static dp7 create(rr5 rr5Var) {
        return new OnItemVisibilityChangedDelegateImpl(rr5Var);
    }

    public void sendItemVisibilityChanged(int i, int i2, cp7 cp7Var) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
