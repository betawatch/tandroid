package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public interface IOnContentRefreshListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnContentRefreshListener".replace('$', '.');

    void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static abstract class Stub extends Binder implements IOnContentRefreshListener {
        static final int TRANSACTION_onContentRefreshRequested = 2;

        /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
        public static class Proxy implements IOnContentRefreshListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnContentRefreshListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnContentRefreshListener
            public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnContentRefreshListener.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnContentRefreshListener.DESCRIPTOR);
        }

        public static IOnContentRefreshListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnContentRefreshListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnContentRefreshListener)) ? new Proxy(iBinder) : (IOnContentRefreshListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            String str = IOnContentRefreshListener.DESCRIPTOR;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 2) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            onContentRefreshRequested(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class Default implements IOnContentRefreshListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
        }
    }
}
