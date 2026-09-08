package b9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements c, IInterface {
    public final IBinder a;

    public a(IBinder iBinder) {
        this.a = iBinder;
    }

    public final Parcel G0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
