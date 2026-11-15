package android.support.v4.media.session;

import a8.j1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.support.v4.media.session.b
    public final void F(Bundle bundle) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void M(List list) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.b
    public final void e(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void e1(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            j1.b(obtain, playbackStateCompat);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void g1(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            j1.b(obtain, parcelableVolumeInfo);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void j(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void l0(CharSequence charSequence) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void n0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void p0(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            j1.b(obtain, mediaMetadataCompat);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
