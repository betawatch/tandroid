package android.support.v4.media.session;

import a8.j1;
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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class t extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public t(u uVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(uVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A(int i7, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B0(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence D() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String E0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat H() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void I(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle J() {
        ((u) this.a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void K(b bVar) {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return;
        }
        uVar.e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (uVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void L(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void N(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O(int i7, int i10) {
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
    public final boolean W(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Y(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a0(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c(long j3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String c0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void d(float f10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e0(boolean z9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat i() {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = uVar.f;
        MediaMetadataCompat mediaMetadataCompat = uVar.h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f10 = playbackStateCompat.d;
        long j3 = playbackStateCompat.n;
        int i7 = playbackStateCompat.a;
        long j10 = playbackStateCompat.b;
        long j11 = -1;
        if (j10 == -1) {
            return playbackStateCompat;
        }
        if ((i7 != 3 && i7 != 4 && i7 != 5) || j3 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = ((long) (f10 * (elapsedRealtime - j3))) + j10;
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
        int i10 = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.h;
        ArrayList arrayList2 = playbackStateCompat.r;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, j13, j14, playbackStateCompat.d, j15, i10, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.w);
    }

    @Override // android.support.v4.media.session.d
    public final int i0() {
        u uVar = (u) this.a.get();
        if (uVar != null) {
            return uVar.j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void j0(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k0() {
    }

    @Override // android.support.v4.media.session.d
    public final long l() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int m() {
        u uVar = (u) this.a.get();
        if (uVar != null) {
            return uVar.i;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void m0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List o0() {
        return null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i7) {
            case 1:
                m0(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) j1.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean W = W((KeyEvent) j1.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(W ? 1 : 0);
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
                p(bVar);
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
                K(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean t6 = t();
                parcel2.writeNoException();
                parcel2.writeInt(t6 ? 1 : 0);
                return true;
            case 6:
                String E0 = E0();
                parcel2.writeNoException();
                parcel2.writeString(E0);
                return true;
            case 7:
                String c02 = c0();
                parcel2.writeNoException();
                parcel2.writeString(c02);
                return true;
            case 8:
                PendingIntent v = v();
                parcel2.writeNoException();
                j1.b(parcel2, v);
                return true;
            case 9:
                long l10 = l();
                parcel2.writeNoException();
                parcel2.writeLong(l10);
                return true;
            case 10:
                ParcelableVolumeInfo z02 = z0();
                parcel2.writeNoException();
                j1.b(parcel2, z02);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                A(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                O(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                f();
                parcel2.writeNoException();
                return true;
            case 14:
                L(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                N(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                R((Uri) j1.a(parcel, Uri.CREATOR), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                y0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                b();
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
                Q();
                parcel2.writeNoException();
                return true;
            case 23:
                s0();
                parcel2.writeNoException();
                return true;
            case 24:
                c(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                q((RatingCompat) j1.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                o(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat H = H();
                parcel2.writeNoException();
                j1.b(parcel2, H);
                return true;
            case 28:
                PlaybackStateCompat i11 = i();
                parcel2.writeNoException();
                j1.b(parcel2, i11);
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
                    j1.b(parcel2, (Parcelable) o02.get(i12));
                }
                return true;
            case qs.T /* 30 */:
                CharSequence D = D();
                parcel2.writeNoException();
                if (D == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(D, parcel2, 1);
                return true;
            case qs.U /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                j1.b(parcel2, extras);
                return true;
            case 32:
                w();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                I(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                x(parcel.readString(), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                r((Uri) j1.a(parcel, Uri.CREATOR), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int m10 = m();
                parcel2.writeNoException();
                parcel2.writeInt(m10);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                k(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                u((MediaDescriptionCompat) j1.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                a0((MediaDescriptionCompat) j1.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                s((MediaDescriptionCompat) j1.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                j0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                k0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                e0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int i02 = i0();
                parcel2.writeNoException();
                parcel2.writeInt(i02);
                return true;
            case 48:
                B0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                d(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle J = J();
                parcel2.writeNoException();
                j1.b(parcel2, J);
                return true;
            case qs.o0 /* 51 */:
                Y((RatingCompat) j1.a(parcel, RatingCompat.CREATOR), (Bundle) j1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(b bVar) {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return;
        }
        uVar.e.register(bVar, new b2.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (uVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s0() {
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
    public final void u(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent v() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w() {
    }

    @Override // android.support.v4.media.session.d
    public final void x(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y0(long j3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo z0() {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
