package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements f0 {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final s mListener;

        public OnItemVisibilityChangedListenerStub(s sVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i9, int i10) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i9, final int i10, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onItemVisibilityChanged", new androidx.car.app.utils.d() { // from class: androidx.car.app.model.g0
                @Override // androidx.car.app.utils.d
                public final Object a() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i9, i10);
                    return lambda$onItemVisibilityChanged$0;
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(s sVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(sVar);
    }

    public static f0 create(s sVar) {
        return new OnItemVisibilityChangedDelegateImpl(sVar);
    }

    public void sendItemVisibilityChanged(int i9, int i10, androidx.car.app.k kVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i9, i10, androidx.car.app.utils.j.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
