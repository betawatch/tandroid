package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public interface ITabCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$ITabCallback".replace('$', '.');

    void onTabSelected(String str, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static abstract class Stub extends Binder implements ITabCallback {
        static final int TRANSACTION_onTabSelected = 2;

        /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
        public static class Proxy implements ITabCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ITabCallback.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.ITabCallback
            public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITabCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITabCallback.DESCRIPTOR);
        }

        public static ITabCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITabCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITabCallback)) ? new Proxy(iBinder) : (ITabCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ITabCallback.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 2) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            onTabSelected(parcel.readString(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static class Default implements ITabCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
