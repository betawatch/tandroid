package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface IOnContentRefreshListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnContentRefreshListener".replace('$', '.');

    void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static abstract class Stub extends Binder implements IOnContentRefreshListener {
        static final int TRANSACTION_onContentRefreshRequested = 2;

        /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
        private static class Proxy implements IOnContentRefreshListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnContentRefreshListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnContentRefreshListener
            public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnContentRefreshListener.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnContentRefreshListener.DESCRIPTOR);
        }

        public static IOnContentRefreshListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnContentRefreshListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnContentRefreshListener)) ? new Proxy(iBinder) : (IOnContentRefreshListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IOnContentRefreshListener.DESCRIPTOR;
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
            onContentRefreshRequested(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Default implements IOnContentRefreshListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
        }
    }
}
