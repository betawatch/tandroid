// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hj5 implements jj5, IInterface {
    public final IBinder a;

    public hj5(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
