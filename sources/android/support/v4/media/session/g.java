package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g extends Binder implements b {
    public final WeakReference a;

    public g(androidx.mediarouter.app.q qVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(qVar);
    }

    @Override // android.support.v4.media.session.b
    public final void C(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void C0(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void E0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void F(List list) {
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
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(12, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void onRepeatModeChanged(int i10) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(9, Integer.valueOf(i10), null);
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
                Bundle bundle = (Bundle) qb.a.a(parcel, Bundle.CREATOR);
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar != null) {
                    qVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                e0();
                return true;
            case 3:
                C0((PlaybackStateCompat) qb.a.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                g0((MediaMetadataCompat) qb.a.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                F(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                c0((CharSequence) qb.a.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                C((Bundle) qb.a.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                E0((ParcelableVolumeInfo) qb.a.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                onRepeatModeChanged(parcel.readInt());
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
                h(parcel.readInt());
                return true;
            case 13:
                androidx.mediarouter.app.q qVar3 = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar3 != null) {
                    qVar3.e(13, null, null);
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
