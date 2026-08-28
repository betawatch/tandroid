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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.support.v4.media.session.d
    public final void A(int i9, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String B0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence C() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void F() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat G() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void H(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle I() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void J(b bVar) {
        this.a.e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.a.c) {
            this.a.getClass();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void K(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void N(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O(int i9, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void X(float f10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean Y(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a0(RatingCompat ratingCompat, Bundle bundle) {
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
        float f10 = playbackStateCompat.d;
        long j10 = playbackStateCompat.n;
        int i9 = playbackStateCompat.a;
        long j11 = playbackStateCompat.b;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i9 != 3 && i9 != 4 && i9 != 5) || j10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = ((long) (f10 * (elapsedRealtime - j10))) + j11;
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
        int i10 = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.h;
        ArrayList arrayList2 = playbackStateCompat.r;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, j14, j15, playbackStateCompat.d, j16, i10, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.v);
    }

    @Override // android.support.v4.media.session.d
    public final void c0(MediaDescriptionCompat mediaDescriptionCompat, int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f0(boolean z10) {
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
    public final int i0() {
        return this.a.j;
    }

    @Override // android.support.v4.media.session.d
    public final void j(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j0(int i9) {
        throw new AssertionError();
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
    public final void l(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List o0() {
        return null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i9) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                n0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean Y = Y(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(Y ? 1 : 0);
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
                J(bVar);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean q10 = q();
                parcel2.writeNoException();
                parcel2.writeInt(q10 ? 1 : 0);
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
                PendingIntent s10 = s();
                parcel2.writeNoException();
                if (s10 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                s10.writeToParcel(parcel2, 1);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long f10 = f();
                parcel2.writeNoException();
                parcel2.writeLong(f10);
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ParcelableVolumeInfo y02 = y0();
                parcel2.writeNoException();
                if (y02 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                y02.writeToParcel(parcel2, 1);
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                A(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                O(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m0();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                K(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                N(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                R(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                w0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                F();
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
                Q();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                q0();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                S(parcel.readLong());
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
                MediaMetadataCompat G = G();
                parcel2.writeNoException();
                if (G == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle(G.a);
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
                List o02 = o0();
                parcel2.writeNoException();
                parcel2.writeTypedList(o02);
                return true;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence C = C();
                parcel2.writeNoException();
                if (C == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(C, parcel2, 1);
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
                H(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                u(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
                r(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                c0(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                j0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                f0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i02 = i0();
                parcel2.writeNoException();
                parcel2.writeInt(i02);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                z0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                X(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle I = I();
                parcel2.writeNoException();
                if (I == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                I.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                a0(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i9, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent s() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w0(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo y0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z0(int i9) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void k0() {
    }

    @Override // android.support.v4.media.session.d
    public final void t() {
    }
}
