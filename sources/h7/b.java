package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b implements d, IInterface {
    public final IBinder a;

    public b(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void H0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i10, parcel, obtain, 0);
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
