package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d extends Binder implements mi5 {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public d(zu6 zu6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(zu6Var);
    }

    @Override // mi5
    public final void D(ii5 ii5Var) {
        zu6 zu6Var = (zu6) this.a.get();
        if (zu6Var == null) {
            return;
        }
        zu6Var.e.unregister(ii5Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (zu6Var.d) {
        }
    }

    @Override // mi5
    public final void G(ii5 ii5Var) {
        zu6 zu6Var = (zu6) this.a.get();
        if (zu6Var == null) {
            return;
        }
        zu6Var.e.register(ii5Var, new nw6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (zu6Var.d) {
        }
    }

    @Override // mi5
    public final PlaybackStateCompat h() {
        zu6 zu6Var = (zu6) this.a.get();
        if (zu6Var == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = zu6Var.f;
        MediaMetadataCompat mediaMetadataCompat = zu6Var.h;
        if (playbackStateCompat != null) {
            float f = playbackStateCompat.d;
            long j = playbackStateCompat.n;
            int i = playbackStateCompat.a;
            long j2 = playbackStateCompat.b;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey("android.media.metadata.DURATION")) {
                        j3 = bundle.getLong("android.media.metadata.DURATION", 0L);
                    }
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.h;
                ArrayList arrayList2 = playbackStateCompat.r;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.d, j7, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.s, playbackStateCompat.w);
            }
        }
        return playbackStateCompat;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        ii5 ii5Var = null;
        ii5 ii5Var2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.readString();
                wn4.f();
                return false;
            case 2:
                wn4.f();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof ii5)) {
                        gi5 gi5Var = new gi5();
                        gi5Var.a = readStrongBinder;
                        ii5Var = gi5Var;
                    } else {
                        ii5Var = (ii5) queryLocalInterface;
                    }
                }
                G(ii5Var);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ii5)) {
                        gi5 gi5Var2 = new gi5();
                        gi5Var2.a = readStrongBinder2;
                        ii5Var2 = gi5Var2;
                    } else {
                        ii5Var2 = (ii5) queryLocalInterface2;
                    }
                }
                D(ii5Var2);
                parcel2.writeNoException();
                return true;
            case 5:
                wn4.f();
                return false;
            case 6:
                wn4.f();
                return false;
            case 7:
                wn4.f();
                return false;
            case 8:
                wn4.f();
                return false;
            case 9:
                wn4.f();
                return false;
            case 10:
                wn4.f();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wn4.f();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wn4.f();
                return false;
            case 13:
                wn4.f();
                return false;
            case 14:
                parcel.readString();
                wn4.f();
                return false;
            case 15:
                parcel.readString();
                wn4.f();
                return false;
            case 16:
                wn4.f();
                return false;
            case 17:
                parcel.readLong();
                wn4.f();
                return false;
            case 18:
                wn4.f();
                return false;
            case 19:
                wn4.f();
                return false;
            case 20:
                wn4.f();
                return false;
            case 21:
                wn4.f();
                return false;
            case 22:
                wn4.f();
                return false;
            case 23:
                wn4.f();
                return false;
            case 24:
                parcel.readLong();
                wn4.f();
                return false;
            case 25:
                wn4.f();
                return false;
            case 26:
                parcel.readString();
                wn4.f();
                return false;
            case 27:
                wn4.f();
                return false;
            case 28:
                PlaybackStateCompat h = h();
                parcel2.writeNoException();
                if (h == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                h.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case kk7.S /* 30 */:
                wn4.f();
                return false;
            case 31:
                wn4.f();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                wn4.f();
                return false;
            case 34:
                parcel.readString();
                wn4.f();
                return false;
            case 35:
                parcel.readString();
                wn4.f();
                return false;
            case 36:
                wn4.f();
                return false;
            case 37:
                zu6 zu6Var = (zu6) atomicReference.get();
                i3 = zu6Var != null ? zu6Var.i : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                wn4.f();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                wn4.f();
                return false;
            case 42:
                parcel.readInt();
                wn4.f();
                return false;
            case 43:
                wn4.f();
                return false;
            case 44:
                parcel.readInt();
                wn4.f();
                return false;
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                wn4.f();
                return false;
            case 47:
                zu6 zu6Var2 = (zu6) atomicReference.get();
                i3 = zu6Var2 != null ? zu6Var2.j : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                wn4.f();
                return false;
            case 49:
                parcel.readFloat();
                wn4.f();
                return false;
            case 50:
                ((zu6) atomicReference.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case kk7.n0 /* 51 */:
                wn4.f();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
