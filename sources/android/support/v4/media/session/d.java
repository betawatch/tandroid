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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d extends Binder implements ok5 {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public d(ex6 ex6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(ex6Var);
    }

    @Override // ok5
    public final void C(kk5 kk5Var) {
        ex6 ex6Var = (ex6) this.a.get();
        if (ex6Var == null) {
            return;
        }
        ex6Var.e.unregister(kk5Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (ex6Var.d) {
        }
    }

    @Override // ok5
    public final void F(kk5 kk5Var) {
        ex6 ex6Var = (ex6) this.a.get();
        if (ex6Var == null) {
            return;
        }
        ex6Var.e.register(kk5Var, new sy6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (ex6Var.d) {
        }
    }

    @Override // ok5
    public final PlaybackStateCompat h() {
        ex6 ex6Var = (ex6) this.a.get();
        if (ex6Var == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = ex6Var.f;
        MediaMetadataCompat mediaMetadataCompat = ex6Var.h;
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
        kk5 kk5Var = null;
        kk5 kk5Var2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.readString();
                lq5.f();
                return false;
            case 2:
                lq5.f();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof kk5)) {
                        ik5 ik5Var = new ik5();
                        ik5Var.a = readStrongBinder;
                        kk5Var = ik5Var;
                    } else {
                        kk5Var = (kk5) queryLocalInterface;
                    }
                }
                F(kk5Var);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof kk5)) {
                        ik5 ik5Var2 = new ik5();
                        ik5Var2.a = readStrongBinder2;
                        kk5Var2 = ik5Var2;
                    } else {
                        kk5Var2 = (kk5) queryLocalInterface2;
                    }
                }
                C(kk5Var2);
                parcel2.writeNoException();
                return true;
            case 5:
                lq5.f();
                return false;
            case 6:
                lq5.f();
                return false;
            case 7:
                lq5.f();
                return false;
            case 8:
                lq5.f();
                return false;
            case 9:
                lq5.f();
                return false;
            case 10:
                lq5.f();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                lq5.f();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                lq5.f();
                return false;
            case 13:
                lq5.f();
                return false;
            case 14:
                parcel.readString();
                lq5.f();
                return false;
            case 15:
                parcel.readString();
                lq5.f();
                return false;
            case 16:
                lq5.f();
                return false;
            case 17:
                parcel.readLong();
                lq5.f();
                return false;
            case 18:
                lq5.f();
                return false;
            case 19:
                lq5.f();
                return false;
            case 20:
                lq5.f();
                return false;
            case 21:
                lq5.f();
                return false;
            case 22:
                lq5.f();
                return false;
            case 23:
                lq5.f();
                return false;
            case 24:
                parcel.readLong();
                lq5.f();
                return false;
            case 25:
                lq5.f();
                return false;
            case 26:
                parcel.readString();
                lq5.f();
                return false;
            case 27:
                lq5.f();
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
            case jn7.S /* 30 */:
                lq5.f();
                return false;
            case 31:
                lq5.f();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                lq5.f();
                return false;
            case 34:
                parcel.readString();
                lq5.f();
                return false;
            case 35:
                parcel.readString();
                lq5.f();
                return false;
            case 36:
                lq5.f();
                return false;
            case 37:
                ex6 ex6Var = (ex6) atomicReference.get();
                i3 = ex6Var != null ? ex6Var.i : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                lq5.f();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                lq5.f();
                return false;
            case 42:
                parcel.readInt();
                lq5.f();
                return false;
            case 43:
                lq5.f();
                return false;
            case 44:
                parcel.readInt();
                lq5.f();
                return false;
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                lq5.f();
                return false;
            case 47:
                ex6 ex6Var2 = (ex6) atomicReference.get();
                i3 = ex6Var2 != null ? ex6Var2.j : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                lq5.f();
                return false;
            case 49:
                parcel.readFloat();
                lq5.f();
                return false;
            case 50:
                ((ex6) atomicReference.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case jn7.n0 /* 51 */:
                lq5.f();
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
