package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public g(androidx.mediarouter.app.s sVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(sVar);
    }

    @Override // android.support.v4.media.session.b
    public final void B(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void C0(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar != null) {
            sVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void D0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void Z(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void b0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void d0(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void l0(int i9) {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar != null) {
            sVar.e(12, Integer.valueOf(i9), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void onRepeatModeChanged(int i9) {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.a.get();
        if (sVar != null) {
            sVar.e(9, Integer.valueOf(i9), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i9) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar != null) {
                    sVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b0();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                C0(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                d0(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                B(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                Z(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                w(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                D0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z10 = parcel.readInt() != 0;
                androidx.mediarouter.app.s sVar2 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar2 != null) {
                    sVar2.e(11, Boolean.valueOf(z10), null);
                    return true;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                l0(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                androidx.mediarouter.app.s sVar3 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar3 != null) {
                    sVar3.e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i9, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void w(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
