package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements d, IInterface {
    public final IBinder a;

    public b(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void H0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i7, parcel, obtain, 0);
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
