package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface IOnItemVisibilityChangedListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnItemVisibilityChangedListener".replace('$', '.');

    void onItemVisibilityChanged(int i9, int i10, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class Stub extends Binder implements IOnItemVisibilityChangedListener {
        static final int TRANSACTION_onItemVisibilityChanged = 2;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static class Proxy implements IOnItemVisibilityChangedListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnItemVisibilityChangedListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
            public void onItemVisibilityChanged(int i9, int i10, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnItemVisibilityChangedListener.DESCRIPTOR);
                    obtain.writeInt(i9);
                    obtain.writeInt(i10);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnItemVisibilityChangedListener.DESCRIPTOR);
        }

        public static IOnItemVisibilityChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnItemVisibilityChangedListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnItemVisibilityChangedListener)) ? new Proxy(iBinder) : (IOnItemVisibilityChangedListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            String str = IOnItemVisibilityChangedListener.DESCRIPTOR;
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
            onItemVisibilityChanged(parcel.readInt(), parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Default implements IOnItemVisibilityChangedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(int i9, int i10, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
