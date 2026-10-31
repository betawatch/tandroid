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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public t(u uVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(uVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A() {
    }

    @Override // android.support.v4.media.session.d
    public final void B(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String D0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void F(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence H() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat K() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void L(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle M() {
        ((u) this.a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void N(b bVar) {
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
    public final void O(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void V() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void W(Uri uri, Bundle bundle) {
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
    public final boolean b0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e0(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void g0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
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
        return new PlaybackStateCompat(playbackStateCompat.a, j14, j15, playbackStateCompat.d, j16, i11, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.w);
    }

    @Override // android.support.v4.media.session.d
    public final String i0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(int i10) {
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
    public final int n0() {
        u uVar = (u) this.a.get();
        if (uVar != null) {
            return uVar.j;
        }
        return -1;
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
    public final void o0(int i10) {
        throw new AssertionError();
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
                t0(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) t7.s.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean b02 = b0((KeyEvent) t7.s.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(b02 ? 1 : 0);
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
                N(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean x10 = x();
                parcel2.writeNoException();
                parcel2.writeInt(x10 ? 1 : 0);
                return true;
            case 6:
                String D0 = D0();
                parcel2.writeNoException();
                parcel2.writeString(D0);
                return true;
            case 7:
                String i02 = i0();
                parcel2.writeNoException();
                parcel2.writeString(i02);
                return true;
            case 8:
                PendingIntent z10 = z();
                parcel2.writeNoException();
                t7.s.b(parcel2, z10);
                return true;
            case 9:
                long l4 = l();
                parcel2.writeNoException();
                parcel2.writeLong(l4);
                return true;
            case 10:
                ParcelableVolumeInfo z02 = z0();
                parcel2.writeNoException();
                t7.s.b(parcel2, z02);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                F(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                S(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                j();
                parcel2.writeNoException();
                return true;
            case 14:
                O(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                R(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                W((Uri) t7.s.a(parcel, Uri.CREATOR), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
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
                V();
                parcel2.writeNoException();
                return true;
            case 23:
                w0();
                parcel2.writeNoException();
                return true;
            case 24:
                f(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                q((RatingCompat) t7.s.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                o(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat K = K();
                parcel2.writeNoException();
                t7.s.b(parcel2, K);
                return true;
            case 28:
                PlaybackStateCompat h = h();
                parcel2.writeNoException();
                t7.s.b(parcel2, h);
                return true;
            case 29:
                List u02 = u0();
                parcel2.writeNoException();
                if (u02 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = u02.size();
                parcel2.writeInt(size);
                for (int i12 = 0; i12 < size; i12++) {
                    t7.s.b(parcel2, (Parcelable) u02.get(i12));
                }
                return true;
            case zs.T /* 30 */:
                CharSequence H = H();
                parcel2.writeNoException();
                if (H == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(H, parcel2, 1);
                return true;
            case zs.U /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                t7.s.b(parcel2, extras);
                return true;
            case 32:
                A();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                L(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                B(parcel.readString(), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                r((Uri) t7.s.a(parcel, Uri.CREATOR), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
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
                y((MediaDescriptionCompat) t7.s.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                g0((MediaDescriptionCompat) t7.s.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                v((MediaDescriptionCompat) t7.s.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                o0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                p0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                k0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int n02 = n0();
                parcel2.writeNoException();
                parcel2.writeInt(n02);
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
                Bundle M = M();
                parcel2.writeNoException();
                t7.s.b(parcel2, M);
                return true;
            case zs.o0 /* 51 */:
                e0((RatingCompat) t7.s.a(parcel, RatingCompat.CREATOR), (Bundle) t7.s.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(b bVar) {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return;
        }
        uVar.e.register(bVar, new y1.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (uVar.d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p0() {
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
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void t0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List u0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void v(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean x() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y0(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent z() {
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
