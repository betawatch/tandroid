package androidx.car.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface IOnDoneCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IOnDoneCallback".replace('$', '.');

    void onFailure(g41 g41Var);

    void onSuccess(g41 g41Var);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class Stub extends Binder implements IOnDoneCallback {
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onSuccess = 2;

        /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
        private static class Proxy implements IOnDoneCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnDoneCallback.DESCRIPTOR;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(g41 g41Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnDoneCallback.DESCRIPTOR);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        g41Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(g41 g41Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnDoneCallback.DESCRIPTOR);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        g41Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnDoneCallback.DESCRIPTOR);
        }

        public static IOnDoneCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnDoneCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnDoneCallback)) ? new Proxy(iBinder) : (IOnDoneCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IOnDoneCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                onSuccess(parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onFailure(parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Default implements IOnDoneCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onFailure(g41 g41Var) {
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onSuccess(g41 g41Var) {
        }
    }
}
