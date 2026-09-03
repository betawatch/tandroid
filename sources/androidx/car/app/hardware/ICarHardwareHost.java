package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.hardware.ICarHardwareResult;
import w.b;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface ICarHardwareHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareHost".replace('$', '.');

    void getCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult);

    void subscribeCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult);

    void unsubscribeCarHardwareResult(int i10, b bVar);

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static abstract class Stub extends Binder implements ICarHardwareHost {
        static final int TRANSACTION_getCarHardwareResult = 2;
        static final int TRANSACTION_subscribeCarHardwareResult = 3;
        static final int TRANSACTION_unsubscribeCarHardwareResult = 4;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static class Proxy implements ICarHardwareHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void getCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(bVar.a);
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
            public void subscribeCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(bVar.a);
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
            public void unsubscribeCarHardwareResult(int i10, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(bVar.a);
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
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ICarHardwareHost.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                getCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null, ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                subscribeCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null, ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 4) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            unsubscribeCarHardwareResult(parcel.readInt(), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class Default implements ICarHardwareHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void unsubscribeCarHardwareResult(int i10, b bVar) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void getCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void subscribeCarHardwareResult(int i10, b bVar, ICarHardwareResult iCarHardwareResult) {
        }
    }
}
