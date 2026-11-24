// default package

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fi5 implements hi5 {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // hi5
    public final void g(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // hi5
    public final void i(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // hi5
    public final void j(dc8 dc8Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            dc8Var.writeToParcel(obtain, 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
