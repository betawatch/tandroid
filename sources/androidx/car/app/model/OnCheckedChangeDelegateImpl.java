package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements ar7 {
    private final IOnCheckedChangeListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final mrb mListener;

        public OnCheckedChangeListenerStub(mrb mrbVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onCheckedChange", new s89() { // from class: androidx.car.app.model.d
                @Override // s89
                public final Object a() {
                    Object lambda$onCheckedChange$0;
                    lambda$onCheckedChange$0 = OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.lambda$onCheckedChange$0(z);
                    return lambda$onCheckedChange$0;
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(mrb mrbVar) {
        this.mStub = new OnCheckedChangeListenerStub(mrbVar);
    }

    public static ar7 create(mrb mrbVar) {
        return new OnCheckedChangeDelegateImpl(mrbVar);
    }

    public void sendCheckedChange(boolean z, fr7 fr7Var) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
