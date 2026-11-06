package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public interface ITabCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$ITabCallback".replace('$', '.');

    void onTabSelected(String str, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static abstract class Stub extends Binder implements ITabCallback {
        static final int TRANSACTION_onTabSelected = 2;

        /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            String str = ITabCallback.DESCRIPTOR;
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
            onTabSelected(parcel.readString(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
