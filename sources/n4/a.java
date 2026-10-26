package n4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // n4.b
    public final void h(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i11 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // n4.b
    public final void onRepeatModeChanged(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i11 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // n4.b
    public final void r(z zVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            zVar.writeToParcel(obtain, 0);
            if (!this.a.transact(3, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
