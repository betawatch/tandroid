package androidx.car.app;

import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;
import j7.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface ISurfaceCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$ISurfaceCallback".replace('$', '.');

    void onClick(float f10, float f11);

    void onFling(float f10, float f11);

    void onScale(float f10, float f11, float f12);

    void onScroll(float f10, float f11);

    void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback);

    void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback);

    void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static abstract class Stub extends Binder implements ISurfaceCallback {
        static final int TRANSACTION_onClick = 9;
        static final int TRANSACTION_onFling = 7;
        static final int TRANSACTION_onScale = 8;
        static final int TRANSACTION_onScroll = 6;
        static final int TRANSACTION_onStableAreaChanged = 4;
        static final int TRANSACTION_onSurfaceAvailable = 2;
        static final int TRANSACTION_onSurfaceDestroyed = 5;
        static final int TRANSACTION_onVisibleAreaChanged = 3;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static class Proxy implements ISurfaceCallback {
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
            public void onClick(float f10, float f11) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f10);
                    obtain.writeFloat(f11);
                    this.mRemote.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onFling(float f10, float f11) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f10);
                    obtain.writeFloat(f11);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScale(float f10, float f11, float f12) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f10);
                    obtain.writeFloat(f11);
                    obtain.writeFloat(f12);
                    this.mRemote.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScroll(float f10, float f11) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    obtain.writeFloat(f10);
                    obtain.writeFloat(f11);
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
                    p.a(obtain, rect);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    p.a(obtain, bVar);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISurfaceCallback.DESCRIPTOR);
                    p.a(obtain, bVar);
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
                    p.a(obtain, rect);
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
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ISurfaceCallback.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    onSurfaceAvailable((w.b) (parcel.readInt() != 0 ? w.b.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onVisibleAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onStableAreaChanged((Rect) (parcel.readInt() != 0 ? Rect.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onSurfaceDestroyed((w.b) (parcel.readInt() != 0 ? w.b.CREATOR.createFromParcel(parcel) : null), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
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
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class Default implements ISurfaceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(float f10, float f11) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(float f10, float f11) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(float f10, float f11) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(float f10, float f11, float f12) {
        }
    }
}
