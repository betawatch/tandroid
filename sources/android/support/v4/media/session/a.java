package android.support.v4.media.session;

import a8.i1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.support.v4.media.session.b
    public final void C(List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void F0(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            i1.b(obtain, playbackStateCompat);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void G0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            i1.b(obtain, parcelableVolumeInfo);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void X(CharSequence charSequence) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void Z() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.b
    public final void b0(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            i1.b(obtain, mediaMetadataCompat);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
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
    public final void y(Bundle bundle) {
        throw null;
    }
}
