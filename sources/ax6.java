// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ax6 extends Binder implements kk5 {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public ax6(bx6 bx6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(bx6Var);
    }

    public final void a(gk5 gk5Var) {
        bx6 bx6Var = (bx6) this.a.get();
        if (bx6Var == null || gk5Var == null) {
            return;
        }
        bx6Var.f.register(gk5Var, new my6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (bx6Var.d) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [gk5] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Bundle bundle;
        gk5 gk5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        ge8 ge8Var = null;
        ek5 ek5Var = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof gk5)) {
                    ek5 ek5Var2 = new ek5();
                    ek5Var2.a = readStrongBinder;
                    gk5Var = ek5Var2;
                } else {
                    gk5Var = (gk5) queryLocalInterface;
                }
            }
            a(gk5Var);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof gk5)) {
                    ek5 ek5Var3 = new ek5();
                    ek5Var3.a = readStrongBinder2;
                    ek5Var = ek5Var3;
                } else {
                    ek5Var = (gk5) queryLocalInterface2;
                }
            }
            bx6 bx6Var = (bx6) this.a.get();
            if (bx6Var != null && ek5Var != null) {
                bx6Var.f.unregister(ek5Var);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (bx6Var.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            bx6 bx6Var2 = (bx6) this.a.get();
            if (bx6Var2 != null) {
                ge8Var = bx6Var2.g;
                lt6 lt6Var = bx6Var2.i;
                if (ge8Var != null) {
                    float f = ge8Var.d;
                    long j = ge8Var.n;
                    int i4 = ge8Var.a;
                    long j2 = ge8Var.b;
                    long j3 = -1;
                    if (j2 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j > 0)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                        if (lt6Var != null) {
                            Bundle bundle3 = lt6Var.a;
                            if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                j3 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                        ArrayList arrayList = new ArrayList();
                        long j6 = ge8Var.c;
                        long j7 = ge8Var.e;
                        int i5 = ge8Var.f;
                        CharSequence charSequence = ge8Var.h;
                        List list = ge8Var.r;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        ge8Var = new ge8(ge8Var.a, j5, j6, ge8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, ge8Var.s, ge8Var.w);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (ge8Var == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            ge8Var.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            bx6 bx6Var3 = (bx6) this.a.get();
            i3 = bx6Var3 != null ? bx6Var3.j : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            bx6 bx6Var4 = (bx6) this.a.get();
            i3 = bx6Var4 != null ? bx6Var4.k : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        bx6 bx6Var5 = (bx6) this.a.get();
        if (bx6Var5 != null && (bundle = bx6Var5.e) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
