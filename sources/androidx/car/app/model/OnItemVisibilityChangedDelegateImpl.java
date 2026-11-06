package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements f0 {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final s mListener;

        public OnItemVisibilityChangedListenerStub(s sVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i7, int i10) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i7, final int i10, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onItemVisibilityChanged", new androidx.car.app.utils.a() { // from class: androidx.car.app.model.g0
                @Override // androidx.car.app.utils.a
                public final Object a() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i7, i10);
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

    public void sendItemVisibilityChanged(int i7, int i10, androidx.car.app.k kVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i7, i10, androidx.car.app.utils.g.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
