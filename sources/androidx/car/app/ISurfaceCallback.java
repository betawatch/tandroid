package androidx.car.app;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$ISurfaceCallback".replace('$', '.');

    void onClick(float f, float f2);

    void onFling(float f, float f2);

    void onScale(float f, float f2, float f3);

    void onScroll(float f, float f2);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(g41 g41Var, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(g41 g41Var, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class Stub extends Binder implements ISurfaceCallback {
        static final int TRANSACTION_onClick = 9;
        static final int TRANSACTION_onFling = 7;
        static final int TRANSACTION_onScale = 8;
        static final int TRANSACTION_onScroll = 6;
        static final int TRANSACTION_onStableAreaChanged = 4;
        static final int TRANSACTION_onSurfaceAvailable = 2;
        static final int TRANSACTION_onSurfaceDestroyed = 5;
        static final int TRANSACTION_onVisibleAreaChanged = 3;

        /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                    ime.a(obtain, rect);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceAvailable(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    ime.a(obtain, g41Var);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceDestroyed(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    ime.a(obtain, g41Var);
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
                    ime.a(obtain, rect);
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
                    onSurfaceAvailable((g41) (parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onVisibleAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onStableAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onSurfaceDestroyed((g41) (parcel.readInt() != 0 ? g41.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
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

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        public void onSurfaceAvailable(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(float f, float f2, float f3) {
        }
    }
}
