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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fx6 extends Binder implements nk5 {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public fx6(gx6 gx6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(gx6Var);
    }

    public final void a(jk5 jk5Var) {
        gx6 gx6Var = (gx6) this.a.get();
        if (gx6Var == null || jk5Var == null) {
            return;
        }
        gx6Var.f.register(jk5Var, new ry6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (gx6Var.d) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [jk5] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Bundle bundle;
        jk5 jk5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        sf8 sf8Var = null;
        hk5 hk5Var = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof jk5)) {
                    hk5 hk5Var2 = new hk5();
                    hk5Var2.a = readStrongBinder;
                    jk5Var = hk5Var2;
                } else {
                    jk5Var = (jk5) queryLocalInterface;
                }
            }
            a(jk5Var);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof jk5)) {
                    hk5 hk5Var3 = new hk5();
                    hk5Var3.a = readStrongBinder2;
                    hk5Var = hk5Var3;
                } else {
                    hk5Var = (jk5) queryLocalInterface2;
                }
            }
            gx6 gx6Var = (gx6) this.a.get();
            if (gx6Var != null && hk5Var != null) {
                gx6Var.f.unregister(hk5Var);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (gx6Var.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            gx6 gx6Var2 = (gx6) this.a.get();
            if (gx6Var2 != null) {
                sf8Var = gx6Var2.g;
                pt6 pt6Var = gx6Var2.i;
                if (sf8Var != null) {
                    float f = sf8Var.d;
                    long j = sf8Var.n;
                    int i4 = sf8Var.a;
                    long j2 = sf8Var.b;
                    long j3 = -1;
                    if (j2 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j > 0)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                        if (pt6Var != null) {
                            Bundle bundle3 = pt6Var.a;
                            if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                j3 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                        ArrayList arrayList = new ArrayList();
                        long j6 = sf8Var.c;
                        long j7 = sf8Var.e;
                        int i5 = sf8Var.f;
                        CharSequence charSequence = sf8Var.h;
                        List list = sf8Var.r;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        sf8Var = new sf8(sf8Var.a, j5, j6, sf8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, sf8Var.s, sf8Var.w);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (sf8Var == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            sf8Var.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            gx6 gx6Var3 = (gx6) this.a.get();
            i3 = gx6Var3 != null ? gx6Var3.j : -1;
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
            gx6 gx6Var4 = (gx6) this.a.get();
            i3 = gx6Var4 != null ? gx6Var4.k : -1;
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
        gx6 gx6Var5 = (gx6) this.a.get();
        if (gx6Var5 != null && (bundle = gx6Var5.e) != null) {
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
