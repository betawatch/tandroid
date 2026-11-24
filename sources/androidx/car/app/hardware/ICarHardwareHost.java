package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.hardware.ICarHardwareResult;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface ICarHardwareHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareHost".replace('$', '.');

    void getCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult);

    void subscribeCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult);

    void unsubscribeCarHardwareResult(int i, g41 g41Var);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class Stub extends Binder implements ICarHardwareHost {
        static final int TRANSACTION_getCarHardwareResult = 2;
        static final int TRANSACTION_subscribeCarHardwareResult = 3;
        static final int TRANSACTION_unsubscribeCarHardwareResult = 4;

        /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
        private static class Proxy implements ICarHardwareHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void getCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        g41Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iCarHardwareResult);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void subscribeCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        g41Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iCarHardwareResult);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void unsubscribeCarHardwareResult(int i, g41 g41Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        g41Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareHost.DESCRIPTOR);
        }

        public static ICarHardwareHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHardwareHost.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHardwareHost)) ? new Proxy(iBinder) : (ICarHardwareHost) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICarHardwareHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                getCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null, ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                subscribeCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null, ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            unsubscribeCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Default implements ICarHardwareHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void unsubscribeCarHardwareResult(int i, g41 g41Var) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void getCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void subscribeCarHardwareResult(int i, g41 g41Var, ICarHardwareResult iCarHardwareResult) {
        }
    }
}
