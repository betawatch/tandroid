package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence A() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String B0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat F() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void G(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle H() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void I(b bVar) {
        this.a.e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.a.c) {
            this.a.getClass();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void J(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void L(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void P(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void W(float f9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean X(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Z(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat b() {
        w wVar = this.a;
        PlaybackStateCompat playbackStateCompat = wVar.f;
        MediaMetadataCompat mediaMetadataCompat = wVar.h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f9 = playbackStateCompat.d;
        long j10 = playbackStateCompat.n;
        int i10 = playbackStateCompat.a;
        long j11 = playbackStateCompat.b;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i10 != 3 && i10 != 4 && i10 != 5) || j10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = ((long) (f9 * (elapsedRealtime - j10))) + j11;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j12 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j14 = (j12 < 0 || j13 <= j12) ? j13 < 0 ? 0L : j13 : j12;
        ArrayList arrayList = new ArrayList();
        long j15 = playbackStateCompat.c;
        long j16 = playbackStateCompat.e;
        int i11 = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.h;
        ArrayList arrayList2 = playbackStateCompat.r;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, j14, j15, playbackStateCompat.d, j16, i11, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.v);
    }

    @Override // android.support.v4.media.session.d
    public final void b0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e0(boolean z10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int g() {
        return this.a.i;
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int j0() {
        return this.a.j;
    }

    @Override // android.support.v4.media.session.d
    public final void k(b bVar) {
        if (this.a.d) {
            return;
        }
        this.a.e.register(bVar, new y1.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (this.a.c) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void k0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void l(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean o() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o0() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean X = X(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(X ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.a = readStrongBinder;
                        bVar2 = aVar;
                    } else {
                        bVar2 = (b) queryLocalInterface;
                    }
                }
                k(bVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.a = readStrongBinder2;
                        bVar = aVar2;
                    } else {
                        bVar = (b) queryLocalInterface2;
                    }
                }
                I(bVar);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean o10 = o();
                parcel2.writeNoException();
                parcel2.writeInt(o10 ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String B0 = B0();
                parcel2.writeNoException();
                parcel2.writeString(B0);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PendingIntent r6 = r();
                parcel2.writeNoException();
                if (r6 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                r6.writeToParcel(parcel2, 1);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long f9 = f();
                parcel2.writeNoException();
                parcel2.writeLong(f9);
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ParcelableVolumeInfo x02 = x0();
                parcel2.writeNoException();
                if (x02 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                x02.writeToParcel(parcel2, 1);
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                x(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                M(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                o0();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                J(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                L(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                P(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                w0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                D();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                O();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r0();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                R(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                l(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                j(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                MediaMetadataCompat F = F();
                parcel2.writeNoException();
                if (F == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle(F.a);
                return true;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat b10 = b();
                parcel2.writeNoException();
                if (b10 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b10.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                List q02 = q0();
                parcel2.writeNoException();
                parcel2.writeTypedList(q02);
                return true;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence A = A();
                parcel2.writeNoException();
                if (A == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(A, parcel2, 1);
                return true;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle extras = getExtras();
                parcel2.writeNoException();
                if (extras == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                extras.writeToParcel(parcel2, 1);
                return true;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                G(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                t(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int g10 = g();
                parcel2.writeNoException();
                parcel2.writeInt(g10);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                e(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                q(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                b0(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                n(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                k0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                e0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int j02 = j0();
                parcel2.writeNoException();
                parcel2.writeInt(j02);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                y0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                W(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle H = H();
                parcel2.writeNoException();
                if (H == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                H.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Z(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List q0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent r() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void t(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w0(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo x0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y0(int i10) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void l0() {
    }

    @Override // android.support.v4.media.session.d
    public final void s() {
    }
}
