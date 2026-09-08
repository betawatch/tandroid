package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public u(v vVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(vVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void A0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String C0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void E(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence G() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat J() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void K(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle L() {
        ((v) this.a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void M(b bVar) {
        v vVar = (v) this.a.get();
        if (vVar == null) {
            return;
        }
        vVar.e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (vVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void N(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void U() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void V(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a(float f7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean a0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat d() {
        v vVar = (v) this.a.get();
        if (vVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = vVar.f;
        MediaMetadataCompat mediaMetadataCompat = vVar.h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f7 = playbackStateCompat.d;
        long j3 = playbackStateCompat.n;
        int i10 = playbackStateCompat.a;
        long j10 = playbackStateCompat.b;
        long j11 = -1;
        if (j10 == -1) {
            return playbackStateCompat;
        }
        if ((i10 != 3 && i10 != 4 && i10 != 5) || j3 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = ((long) (f7 * (elapsedRealtime - j3))) + j10;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j11 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j13 = (j11 < 0 || j12 <= j11) ? j12 < 0 ? 0L : j12 : j11;
        ArrayList arrayList = new ArrayList();
        long j14 = playbackStateCompat.c;
        long j15 = playbackStateCompat.e;
        int i11 = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.h;
        ArrayList arrayList2 = playbackStateCompat.r;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, j13, j14, playbackStateCompat.d, j15, i11, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.v);
    }

    @Override // android.support.v4.media.session.d
    public final void d0(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void g(long j3) {
        throw new AssertionError();
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
    public final void i() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i0(boolean z10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long k() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int l() {
        v vVar = (v) this.a.get();
        if (vVar != null) {
            return vVar.i;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final int l0() {
        v vVar = (v) this.a.get();
        if (vVar != null) {
            return vVar.j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void m0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n0() {
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o(b bVar) {
        v vVar = (v) this.a.get();
        if (vVar == null) {
            return;
        }
        vVar.e.register(bVar, new y1.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (vVar.d) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i10) {
            case 1:
                r0(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) v7.l.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean a02 = a0((KeyEvent) v7.l.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(a02 ? 1 : 0);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.a = readStrongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) queryLocalInterface;
                    }
                }
                o(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.a = readStrongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) queryLocalInterface2;
                    }
                }
                M(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean w10 = w();
                parcel2.writeNoException();
                parcel2.writeInt(w10 ? 1 : 0);
                return true;
            case 6:
                String C0 = C0();
                parcel2.writeNoException();
                parcel2.writeString(C0);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent y3 = y();
                parcel2.writeNoException();
                v7.l.b(parcel2, y3);
                return true;
            case 9:
                long k10 = k();
                parcel2.writeNoException();
                parcel2.writeLong(k10);
                return true;
            case 10:
                ParcelableVolumeInfo y02 = y0();
                parcel2.writeNoException();
                v7.l.b(parcel2, y02);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                E(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                R(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                i();
                parcel2.writeNoException();
                return true;
            case 14:
                N(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                Q(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                V((Uri) v7.l.a(parcel, Uri.CREATOR), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                x0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                e();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                U();
                parcel2.writeNoException();
                return true;
            case 23:
                v0();
                parcel2.writeNoException();
                return true;
            case 24:
                g(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                p((RatingCompat) v7.l.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                n(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat J = J();
                parcel2.writeNoException();
                v7.l.b(parcel2, J);
                return true;
            case 28:
                PlaybackStateCompat d = d();
                parcel2.writeNoException();
                v7.l.b(parcel2, d);
                return true;
            case 29:
                List s02 = s0();
                parcel2.writeNoException();
                if (s02 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = s02.size();
                parcel2.writeInt(size);
                for (int i12 = 0; i12 < size; i12++) {
                    v7.l.b(parcel2, (Parcelable) s02.get(i12));
                }
                return true;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                CharSequence G = G();
                parcel2.writeNoException();
                if (G == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(G, parcel2, 1);
                return true;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                v7.l.b(parcel2, extras);
                return true;
            case 32:
                z();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                b();
                parcel2.writeNoException();
                return true;
            case 34:
                K(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                A(parcel.readString(), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                q((Uri) v7.l.a(parcel, Uri.CREATOR), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int l4 = l();
                parcel2.writeNoException();
                parcel2.writeInt(l4);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                j(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                x((MediaDescriptionCompat) v7.l.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                f0((MediaDescriptionCompat) v7.l.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                u((MediaDescriptionCompat) v7.l.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                m0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                n0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                i0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                int l02 = l0();
                parcel2.writeNoException();
                parcel2.writeInt(l02);
                return true;
            case 48:
                A0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                Bundle L = L();
                parcel2.writeNoException();
                v7.l.b(parcel2, L);
                return true;
            case 51:
                d0((RatingCompat) v7.l.a(parcel, RatingCompat.CREATOR), (Bundle) v7.l.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List s0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean w() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x0(long j3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent y() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo y0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
