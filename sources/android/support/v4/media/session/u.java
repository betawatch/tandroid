package android.support.v4.media.session;

import a8.y0;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public u(v vVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(vVar);
    }

    @Override // android.support.v4.media.session.d
    public final void B(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String B0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence E() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat I() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void J(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle K() {
        ((v) this.a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void L(b bVar) {
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
    public final void M(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void P(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void T(Uri uri, Bundle bundle) {
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
    public final void b(float f7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b0(RatingCompat ratingCompat, Bundle bundle) {
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
        long j13 = ((long) (f7 * (elapsedRealtime - j10))) + j11;
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
    public final void e() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void g(long j10) {
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
    public final void h0(boolean z10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i() {
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
    public final int k0() {
        v vVar = (v) this.a.get();
        if (vVar != null) {
            return vVar.j;
        }
        return -1;
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
    public final void l0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m0() {
    }

    @Override // android.support.v4.media.session.d
    public final void n(String str, Bundle bundle) {
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
    public final void o(b bVar) {
        v vVar = (v) this.a.get();
        if (vVar == null) {
            return;
        }
        vVar.e.register(bVar, new y1.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (vVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final List o0() {
        return null;
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
                n0(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) y0.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean Y = Y((KeyEvent) y0.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(Y ? 1 : 0);
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
                L(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean t10 = t();
                parcel2.writeNoException();
                parcel2.writeInt(t10 ? 1 : 0);
                return true;
            case 6:
                String B0 = B0();
                parcel2.writeNoException();
                parcel2.writeString(B0);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent v = v();
                parcel2.writeNoException();
                y0.b(parcel2, v);
                return true;
            case 9:
                long k10 = k();
                parcel2.writeNoException();
                parcel2.writeLong(k10);
                return true;
            case 10:
                ParcelableVolumeInfo u02 = u0();
                parcel2.writeNoException();
                y0.b(parcel2, u02);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                B(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                Q(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                i();
                parcel2.writeNoException();
                return true;
            case 14:
                M(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                P(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                T((Uri) y0.a(parcel, Uri.CREATOR), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                t0(parcel.readLong());
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
                S();
                parcel2.writeNoException();
                return true;
            case 23:
                q0();
                parcel2.writeNoException();
                return true;
            case 24:
                g(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                p((RatingCompat) y0.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                n(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat I = I();
                parcel2.writeNoException();
                y0.b(parcel2, I);
                return true;
            case 28:
                PlaybackStateCompat d = d();
                parcel2.writeNoException();
                y0.b(parcel2, d);
                return true;
            case 29:
                List o02 = o0();
                parcel2.writeNoException();
                if (o02 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = o02.size();
                parcel2.writeInt(size);
                for (int i12 = 0; i12 < size; i12++) {
                    y0.b(parcel2, (Parcelable) o02.get(i12));
                }
                return true;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                CharSequence E = E();
                parcel2.writeNoException();
                if (E == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(E, parcel2, 1);
                return true;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                y0.b(parcel2, extras);
                return true;
            case 32:
                x();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                J(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                y(parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                q((Uri) y0.a(parcel, Uri.CREATOR), (Bundle) y0.a(parcel, Bundle.CREATOR));
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
                u((MediaDescriptionCompat) y0.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                e0((MediaDescriptionCompat) y0.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                s((MediaDescriptionCompat) y0.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                l0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                m0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                h0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                int k02 = k0();
                parcel2.writeNoException();
                parcel2.writeInt(k02);
                return true;
            case 48:
                x0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                Bundle K = K();
                parcel2.writeNoException();
                y0.b(parcel2, K);
                return true;
            case 51:
                b0((RatingCompat) y0.a(parcel, RatingCompat.CREATOR), (Bundle) y0.a(parcel, Bundle.CREATOR));
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
    public final void q0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean t() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void t0(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo u0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent v() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x() {
    }

    @Override // android.support.v4.media.session.d
    public final void x0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
