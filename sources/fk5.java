// default package

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fk5 implements hk5 {
    public IBinder a;

    @Override // hk5
    public final void N(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            playbackStateCompat.writeToParcel(obtain, 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // hk5
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

    @Override // hk5
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
}
