package androidx.car.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface IOnRequestPermissionsListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IOnRequestPermissionsListener".replace('$', '.');

    void onRequestPermissionsResult(String[] strArr, String[] strArr2);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class Stub extends Binder implements IOnRequestPermissionsListener {
        static final int TRANSACTION_onRequestPermissionsResult = 2;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static class Proxy implements IOnRequestPermissionsListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnRequestPermissionsListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.IOnRequestPermissionsListener
            public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnRequestPermissionsListener.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnRequestPermissionsListener.DESCRIPTOR);
        }

        public static IOnRequestPermissionsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnRequestPermissionsListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnRequestPermissionsListener)) ? new Proxy(iBinder) : (IOnRequestPermissionsListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            String str = IOnRequestPermissionsListener.DESCRIPTOR;
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i9 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i9 != 2) {
                return super.onTransact(i9, parcel, parcel2, i10);
            }
            onRequestPermissionsResult(parcel.createStringArray(), parcel.createStringArray());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Default implements IOnRequestPermissionsListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IOnRequestPermissionsListener
        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        }
    }
}
