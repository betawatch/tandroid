package android.support.v4.media.session;

import a8.i1;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends Binder implements b {
    public final WeakReference a;

    public g(androidx.mediarouter.app.q qVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(qVar);
    }

    @Override // android.support.v4.media.session.b
    public final void C(List list) {
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
    public final void X(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void Z() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void b0(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void e(int i7) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(9, Integer.valueOf(i7), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void j(int i7) {
        androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.a.get();
        if (qVar != null) {
            qVar.e(12, Integer.valueOf(i7), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) i1.a(parcel, Bundle.CREATOR);
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar != null) {
                    qVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                Z();
                return true;
            case 3:
                F0((PlaybackStateCompat) i1.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                b0((MediaMetadataCompat) i1.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                C(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                X((CharSequence) i1.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                y((Bundle) i1.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                G0((ParcelableVolumeInfo) i1.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                e(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z9 = parcel.readInt() != 0;
                androidx.mediarouter.app.q qVar2 = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar2 != null) {
                    qVar2.e(11, Boolean.valueOf(z9), null);
                    return true;
                }
                return true;
            case 12:
                j(parcel.readInt());
                return true;
            case 13:
                androidx.mediarouter.app.q qVar3 = (androidx.mediarouter.app.q) weakReference.get();
                if (qVar3 != null) {
                    qVar3.e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void y(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
