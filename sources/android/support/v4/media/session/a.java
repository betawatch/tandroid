package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

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
                int i10 = g.b;
            }
            obtain.recycle();
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
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
                int i10 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void a0(CharSequence charSequence) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.b
    public final void c0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (!this.a.transact(2, obtain, null, 1)) {
                int i10 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void e0(MediaMetadataCompat mediaMetadataCompat) {
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
                int i10 = g.b;
            }
            obtain.recycle();
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.b
    public final void o0(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i11 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void onRepeatModeChanged(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i11 = g.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void u(Bundle bundle) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void x(List list) {
        throw null;
    }
}
