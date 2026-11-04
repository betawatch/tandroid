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
import b8.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public t(u uVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(uVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B0(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D(int i3, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String E0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence F() {
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
        ((u) this.a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void L(b bVar) {
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
    public final void M(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void P(int i3, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean Z(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b(float f10) {
        throw new AssertionError();
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
    public final void f(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f0(MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat h() {
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
        long j10 = playbackStateCompat.n;
        int i3 = playbackStateCompat.a;
        long j11 = playbackStateCompat.b;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i3 != 3 && i3 != 4 && i3 != 5) || j10 <= 0) {
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
        return new PlaybackStateCompat(playbackStateCompat.a, j14, j15, playbackStateCompat.d, j16, i10, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.w);
    }

    @Override // android.support.v4.media.session.d
    public final String h0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k0(boolean z10) {
        throw new AssertionError();
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
    public final void n(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int o0() {
        u uVar = (u) this.a.get();
        if (uVar != null) {
            return uVar.j;
        }
        return -1;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i3) {
            case 1:
                r0(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) j0.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean Z = Z((KeyEvent) j0.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(Z ? 1 : 0);
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
                L(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean v = v();
                parcel2.writeNoException();
                parcel2.writeInt(v ? 1 : 0);
                return true;
            case 6:
                String E0 = E0();
                parcel2.writeNoException();
                parcel2.writeString(E0);
                return true;
            case 7:
                String h02 = h0();
                parcel2.writeNoException();
                parcel2.writeString(h02);
                return true;
            case 8:
                PendingIntent x10 = x();
                parcel2.writeNoException();
                j0.b(parcel2, x10);
                return true;
            case 9:
                long l10 = l();
                parcel2.writeNoException();
                parcel2.writeLong(l10);
                return true;
            case 10:
                ParcelableVolumeInfo z02 = z0();
                parcel2.writeNoException();
                j0.b(parcel2, z02);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                D(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                P(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                j();
                parcel2.writeNoException();
                return true;
            case 14:
                M(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                O(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                S((Uri) j0.a(parcel, Uri.CREATOR), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                y0(parcel.readLong());
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
                R();
                parcel2.writeNoException();
                return true;
            case 23:
                v0();
                parcel2.writeNoException();
                return true;
            case 24:
                f(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                r((RatingCompat) j0.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                n(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat I = I();
                parcel2.writeNoException();
                j0.b(parcel2, I);
                return true;
            case 28:
                PlaybackStateCompat h = h();
                parcel2.writeNoException();
                j0.b(parcel2, h);
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
                for (int i11 = 0; i11 < size; i11++) {
                    j0.b(parcel2, (Parcelable) s02.get(i11));
                }
                return true;
            case hs.T /* 30 */:
                CharSequence F = F();
                parcel2.writeNoException();
                if (F == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(F, parcel2, 1);
                return true;
            case hs.U /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                j0.b(parcel2, extras);
                return true;
            case 32:
                z();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                J(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                A(parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                s((Uri) j0.a(parcel, Uri.CREATOR), (Bundle) j0.a(parcel, Bundle.CREATOR));
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
                w((MediaDescriptionCompat) j0.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                f0((MediaDescriptionCompat) j0.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                u((MediaDescriptionCompat) j0.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                p0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                q0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                k0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int o02 = o0();
                parcel2.writeNoException();
                parcel2.writeInt(o02);
                return true;
            case 48:
                B0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle K = K();
                parcel2.writeNoException();
                j0.b(parcel2, K);
                return true;
            case hs.o0 /* 51 */:
                d0((RatingCompat) j0.a(parcel, RatingCompat.CREATOR), (Bundle) j0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(b bVar) {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return;
        }
        uVar.e.register(bVar, new a2.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (uVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p0(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q0() {
    }

    @Override // android.support.v4.media.session.d
    public final void r(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s(Uri uri, Bundle bundle) {
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
    public final boolean v() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent x() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y0(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z() {
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
