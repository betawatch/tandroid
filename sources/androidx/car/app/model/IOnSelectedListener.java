package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public interface IOnSelectedListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnSelectedListener".replace('$', '.');

    void onSelected(int i7, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static abstract class Stub extends Binder implements IOnSelectedListener {
        static final int TRANSACTION_onSelected = 2;

        /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
        public static class Proxy implements IOnSelectedListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnSelectedListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnSelectedListener
            public void onSelected(int i7, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnSelectedListener.DESCRIPTOR);
                    obtain.writeInt(i7);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnSelectedListener.DESCRIPTOR);
        }

        public static IOnSelectedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnSelectedListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnSelectedListener)) ? new Proxy(iBinder) : (IOnSelectedListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            String str = IOnSelectedListener.DESCRIPTOR;
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
            onSelected(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class Default implements IOnSelectedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i7, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
