package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface ICarHardwareResult extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareResult".replace('$', '.');

    void onCarHardwareResult(int i, boolean z, g41 g41Var, IBinder iBinder);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class Stub extends Binder implements ICarHardwareResult {
        static final int TRANSACTION_onCarHardwareResult = 2;

        /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
        private static class Proxy implements ICarHardwareResult {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareResult.DESCRIPTOR;
            }

            @Override // androidx.car.app.hardware.ICarHardwareResult
            public void onCarHardwareResult(int i, boolean z, g41 g41Var, IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareResult.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (g41Var != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(g41Var.a);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareResult.DESCRIPTOR);
        }

        public static ICarHardwareResult asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHardwareResult.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHardwareResult)) ? new Proxy(iBinder) : (ICarHardwareResult) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICarHardwareResult.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onCarHardwareResult(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Default implements ICarHardwareResult {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareResult
        public void onCarHardwareResult(int i, boolean z, g41 g41Var, IBinder iBinder) {
        }
    }
}
