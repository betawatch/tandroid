package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements xr7 {
    private final IOnCheckedChangeListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final mtb mListener;

        public OnCheckedChangeListenerStub(mtb mtbVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onCheckedChange", new da9() { // from class: androidx.car.app.model.d
                @Override // da9
                public final Object a() {
                    Object lambda$onCheckedChange$0;
                    lambda$onCheckedChange$0 = OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.lambda$onCheckedChange$0(z);
                    return lambda$onCheckedChange$0;
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(mtb mtbVar) {
        this.mStub = new OnCheckedChangeListenerStub(mtbVar);
    }

    public static xr7 create(mtb mtbVar) {
        return new OnCheckedChangeDelegateImpl(mtbVar);
    }

    public void sendCheckedChange(boolean z, cs7 cs7Var) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
