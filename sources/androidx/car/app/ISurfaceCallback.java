package androidx.car.app;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$ISurfaceCallback".replace('$', '.');

    void onClick(float f, float f2);

    void onFling(float f, float f2);

    void onScale(float f, float f2, float f3);

    void onScroll(float f, float f2);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(y21 y21Var, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(y21 y21Var, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static abstract class Stub extends Binder implements ISurfaceCallback {
        static final int TRANSACTION_onClick = 9;
        static final int TRANSACTION_onFling = 7;
        static final int TRANSACTION_onScale = 8;
        static final int TRANSACTION_onScroll = 6;
        static final int TRANSACTION_onStableAreaChanged = 4;
        static final int TRANSACTION_onSurfaceAvailable = 2;
        static final int TRANSACTION_onSurfaceDestroyed = 5;
        static final int TRANSACTION_onVisibleAreaChanged = 3;

        /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
        private static class Proxy implements ISurfaceCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISurfaceCallback.DESCRIPTOR;
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onClick(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onFling(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScale(float f, float f2, float f3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.mRemote.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScroll(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    gke.a(obtain, rect);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceAvailable(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    gke.a(obtain, y21Var);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceDestroyed(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    gke.a(obtain, y21Var);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    gke.a(obtain, rect);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISurfaceCallback.DESCRIPTOR);
        }

        public static ISurfaceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISurfaceCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISurfaceCallback)) ? new Proxy(iBinder) : (ISurfaceCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ISurfaceCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    onSurfaceAvailable((y21) (parcel.readInt() != 0 ? y21.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onVisibleAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onStableAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onSurfaceDestroyed((y21) (parcel.readInt() != 0 ? y21.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    onScroll(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 7:
                    onFling(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 8:
                    onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    return true;
                case 9:
                    onClick(parcel.readFloat(), parcel.readFloat());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class Default implements ISurfaceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(float f, float f2) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(float f, float f2, float f3) {
        }
    }
}
