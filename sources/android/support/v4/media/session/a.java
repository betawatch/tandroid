package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.support.v4.media.session.b
    public final void D(Bundle bundle) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void E0(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            me.b.c(obtain, playbackStateCompat);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void G(List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void G0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            me.b.c(obtain, parcelableVolumeInfo);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.b
    public final void c(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void d0(CharSequence charSequence) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void f0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void h0(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            me.b.c(obtain, mediaMetadataCompat);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void i(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
