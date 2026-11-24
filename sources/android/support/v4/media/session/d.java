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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d extends Binder implements lk5 {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public d(zw6 zw6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(zw6Var);
    }

    @Override // lk5
    public final void C(hk5 hk5Var) {
        zw6 zw6Var = (zw6) this.a.get();
        if (zw6Var == null) {
            return;
        }
        zw6Var.e.unregister(hk5Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (zw6Var.d) {
        }
    }

    @Override // lk5
    public final void F(hk5 hk5Var) {
        zw6 zw6Var = (zw6) this.a.get();
        if (zw6Var == null) {
            return;
        }
        zw6Var.e.register(hk5Var, new ny6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (zw6Var.d) {
        }
    }

    @Override // lk5
    public final PlaybackStateCompat h() {
        zw6 zw6Var = (zw6) this.a.get();
        if (zw6Var == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = zw6Var.f;
        MediaMetadataCompat mediaMetadataCompat = zw6Var.h;
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
        hk5 hk5Var = null;
        hk5 hk5Var2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.readString();
                zo4.f();
                return false;
            case 2:
                zo4.f();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof hk5)) {
                        fk5 fk5Var = new fk5();
                        fk5Var.a = readStrongBinder;
                        hk5Var = fk5Var;
                    } else {
                        hk5Var = (hk5) queryLocalInterface;
                    }
                }
                F(hk5Var);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof hk5)) {
                        fk5 fk5Var2 = new fk5();
                        fk5Var2.a = readStrongBinder2;
                        hk5Var2 = fk5Var2;
                    } else {
                        hk5Var2 = (hk5) queryLocalInterface2;
                    }
                }
                C(hk5Var2);
                parcel2.writeNoException();
                return true;
            case 5:
                zo4.f();
                return false;
            case 6:
                zo4.f();
                return false;
            case 7:
                zo4.f();
                return false;
            case 8:
                zo4.f();
                return false;
            case 9:
                zo4.f();
                return false;
            case 10:
                zo4.f();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                zo4.f();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                zo4.f();
                return false;
            case 13:
                zo4.f();
                return false;
            case 14:
                parcel.readString();
                zo4.f();
                return false;
            case 15:
                parcel.readString();
                zo4.f();
                return false;
            case 16:
                zo4.f();
                return false;
            case 17:
                parcel.readLong();
                zo4.f();
                return false;
            case 18:
                zo4.f();
                return false;
            case 19:
                zo4.f();
                return false;
            case 20:
                zo4.f();
                return false;
            case 21:
                zo4.f();
                return false;
            case 22:
                zo4.f();
                return false;
            case 23:
                zo4.f();
                return false;
            case 24:
                parcel.readLong();
                zo4.f();
                return false;
            case 25:
                zo4.f();
                return false;
            case 26:
                parcel.readString();
                zo4.f();
                return false;
            case 27:
                zo4.f();
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
            case nm7.S /* 30 */:
                zo4.f();
                return false;
            case 31:
                zo4.f();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                zo4.f();
                return false;
            case 34:
                parcel.readString();
                zo4.f();
                return false;
            case 35:
                parcel.readString();
                zo4.f();
                return false;
            case 36:
                zo4.f();
                return false;
            case 37:
                zw6 zw6Var = (zw6) atomicReference.get();
                i3 = zw6Var != null ? zw6Var.i : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                zo4.f();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                zo4.f();
                return false;
            case 42:
                parcel.readInt();
                zo4.f();
                return false;
            case 43:
                zo4.f();
                return false;
            case 44:
                parcel.readInt();
                zo4.f();
                return false;
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                zo4.f();
                return false;
            case 47:
                zw6 zw6Var2 = (zw6) atomicReference.get();
                i3 = zw6Var2 != null ? zw6Var2.j : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                zo4.f();
                return false;
            case 49:
                parcel.readFloat();
                zo4.f();
                return false;
            case 50:
                ((zw6) atomicReference.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case nm7.n0 /* 51 */:
                zo4.f();
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
