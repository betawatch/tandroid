package e9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements c, IInterface {
    public final IBinder a;

    public a(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel h1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
