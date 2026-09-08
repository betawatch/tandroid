package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends Binder implements b {
    public final WeakReference a;

    public g(androidx.mediarouter.app.r rVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(rVar);
    }

    @Override // android.support.v4.media.session.b
    public final void C(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void D0(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar != null) {
            rVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void F(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void F0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void c0(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void e0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void g0(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void h(int i10) {
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar != null) {
            rVar.e(12, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void onRepeatModeChanged(int i10) {
        androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.a.get();
        if (rVar != null) {
            rVar.e(9, Integer.valueOf(i10), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) v7.k.a(parcel, Bundle.CREATOR);
                androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) weakReference.get();
                if (rVar != null) {
                    rVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                e0();
                return true;
            case 3:
                D0((PlaybackStateCompat) v7.k.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                g0((MediaMetadataCompat) v7.k.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                F(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                c0((CharSequence) v7.k.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                C((Bundle) v7.k.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                F0((ParcelableVolumeInfo) v7.k.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z10 = parcel.readInt() != 0;
                androidx.mediarouter.app.r rVar2 = (androidx.mediarouter.app.r) weakReference.get();
                if (rVar2 != null) {
                    rVar2.e(11, Boolean.valueOf(z10), null);
                    return true;
                }
                return true;
            case 12:
                h(parcel.readInt());
                return true;
            case 13:
                androidx.mediarouter.app.r rVar3 = (androidx.mediarouter.app.r) weakReference.get();
                if (rVar3 != null) {
                    rVar3.e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
