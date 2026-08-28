package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface IOnCheckedChangeListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnCheckedChangeListener".replace('$', '.');

    void onCheckedChange(boolean z10, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class Stub extends Binder implements IOnCheckedChangeListener {
        static final int TRANSACTION_onCheckedChange = 2;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static class Proxy implements IOnCheckedChangeListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnCheckedChangeListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnCheckedChangeListener
            public void onCheckedChange(boolean z10, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnCheckedChangeListener.DESCRIPTOR);
                    obtain.writeInt(z10 ? 1 : 0);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnCheckedChangeListener.DESCRIPTOR);
        }

        public static IOnCheckedChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnCheckedChangeListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnCheckedChangeListener)) ? new Proxy(iBinder) : (IOnCheckedChangeListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            String str = IOnCheckedChangeListener.DESCRIPTOR;
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
            onCheckedChange(parcel.readInt() != 0, IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Default implements IOnCheckedChangeListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(boolean z10, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
