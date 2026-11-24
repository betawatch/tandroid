package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements gr7 {
    private final IOnItemVisibilityChangedListener mStub;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final qt5 mListener;

        public OnItemVisibilityChangedListenerStub(qt5 qt5Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onItemVisibilityChanged", new s89() { // from class: androidx.car.app.model.e
                @Override // s89
                public final Object a() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i, i2);
                    return lambda$onItemVisibilityChanged$0;
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(qt5 qt5Var) {
        this.mStub = new OnItemVisibilityChangedListenerStub(qt5Var);
    }

    public static gr7 create(qt5 qt5Var) {
        return new OnItemVisibilityChangedDelegateImpl(qt5Var);
    }

    public void sendItemVisibilityChanged(int i, int i2, fr7 fr7Var) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
