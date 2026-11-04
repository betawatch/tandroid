package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import b8.i0;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends Binder implements b {
    public final WeakReference a;

    public g(androidx.mediarouter.app.q qVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(qVar);
    }

    @Override // android.support.v4.media.session.b
    public final void B(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void E(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void F0(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void G0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void a0(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void c(int i3) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(9, Integer.valueOf(i3), null);
        }
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
    public final void i(int i3) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(12, Integer.valueOf(i3), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i3) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) i0.a(parcel, Bundle.CREATOR);
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar != null) {
                    qVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                e0();
                return true;
            case 3:
                F0((PlaybackStateCompat) i0.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                g0((MediaMetadataCompat) i0.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                E(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                a0((CharSequence) i0.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                B((Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                G0((ParcelableVolumeInfo) i0.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                c(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z10 = parcel.readInt() != 0;
                androidx.mediarouter.app.q qVar2 = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar2 != null) {
                    qVar2.e(11, Boolean.valueOf(z10), null);
                    return true;
                }
                return true;
            case 12:
                i(parcel.readInt());
                return true;
            case 13:
                androidx.mediarouter.app.q qVar3 = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar3 != null) {
                    qVar3.e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
