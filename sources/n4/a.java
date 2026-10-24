package n4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
    public final void t(y yVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            yVar.writeToParcel(obtain, 0);
            if (!this.a.transact(3, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
