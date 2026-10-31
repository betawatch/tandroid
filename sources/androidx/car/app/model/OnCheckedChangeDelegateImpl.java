package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements z {
    private final IOnCheckedChangeListener mStub;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final z0 mListener;

        public OnCheckedChangeListenerStub(z0 z0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z10) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z10, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.h.b(iOnDoneCallback, "onCheckedChange", new androidx.car.app.utils.b() { // from class: androidx.car.app.model.a0
                @Override // androidx.car.app.utils.b
                public final Object a() {
                    Object lambda$onCheckedChange$0;
                    lambda$onCheckedChange$0 = OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.lambda$onCheckedChange$0(z10);
                    return lambda$onCheckedChange$0;
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(z0 z0Var) {
        this.mStub = new OnCheckedChangeListenerStub(z0Var);
    }

    public static z create(z0 z0Var) {
        return new OnCheckedChangeDelegateImpl(z0Var);
    }

    public void sendCheckedChange(boolean z10, androidx.car.app.j jVar) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z10, androidx.car.app.utils.h.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
