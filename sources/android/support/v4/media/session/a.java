package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.support.v4.media.session.b
    public final void B(List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void C0(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(3, obtain, null, 1)) {
                int i9 = g.b;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.b
    public final void D0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            parcelableVolumeInfo.writeToParcel(obtain, 0);
            if (!this.a.transact(8, obtain, null, 1)) {
                int i9 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void Z(CharSequence charSequence) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.b
    public final void b0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (!this.a.transact(2, obtain, null, 1)) {
                int i9 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void d0(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (mediaMetadataCompat != null) {
                obtain.writeInt(1);
                obtain.writeBundle(mediaMetadataCompat.a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(4, obtain, null, 1)) {
                int i9 = g.b;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.b
    public final void l0(int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i9);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i10 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void onRepeatModeChanged(int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i9);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i10 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void w(Bundle bundle) {
        throw null;
    }
}
