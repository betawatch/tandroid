package androidx.car.app.navigation.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public interface IPanModeListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$navigation$model$IPanModeListener".replace('$', '.');

    void onPanModeChanged(boolean z10, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
    public static abstract class Stub extends Binder implements IPanModeListener {
        static final int TRANSACTION_onPanModeChanged = 2;

        /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
        public static class Proxy implements IPanModeListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPanModeListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.navigation.model.IPanModeListener
            public void onPanModeChanged(boolean z10, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPanModeListener.DESCRIPTOR);
                    obtain.writeInt(z10 ? 1 : 0);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPanModeListener.DESCRIPTOR);
        }

        public static IPanModeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPanModeListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPanModeListener)) ? new Proxy(iBinder) : (IPanModeListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            String str = IPanModeListener.DESCRIPTOR;
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
            onPanModeChanged(parcel.readInt() != 0, IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
    public static class Default implements IPanModeListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(boolean z10, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
