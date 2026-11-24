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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class av6 extends Binder implements li5 {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public av6(bv6 bv6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(bv6Var);
    }

    public final void a(hi5 hi5Var) {
        bv6 bv6Var = (bv6) this.a.get();
        if (bv6Var == null || hi5Var == null) {
            return;
        }
        bv6Var.f.register(hi5Var, new mw6("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (bv6Var.d) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [hi5] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Bundle bundle;
        hi5 hi5Var = null;
        r5 = null;
        Bundle bundle2 = null;
        dc8 dc8Var = null;
        fi5 fi5Var = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof hi5)) {
                    fi5 fi5Var2 = new fi5();
                    fi5Var2.a = readStrongBinder;
                    hi5Var = fi5Var2;
                } else {
                    hi5Var = (hi5) queryLocalInterface;
                }
            }
            a(hi5Var);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof hi5)) {
                    fi5 fi5Var3 = new fi5();
                    fi5Var3.a = readStrongBinder2;
                    fi5Var = fi5Var3;
                } else {
                    fi5Var = (hi5) queryLocalInterface2;
                }
            }
            bv6 bv6Var = (bv6) this.a.get();
            if (bv6Var != null && fi5Var != null) {
                bv6Var.f.unregister(fi5Var);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (bv6Var.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            bv6 bv6Var2 = (bv6) this.a.get();
            if (bv6Var2 != null) {
                dc8Var = bv6Var2.g;
                kr6 kr6Var = bv6Var2.i;
                if (dc8Var != null) {
                    float f = dc8Var.d;
                    long j = dc8Var.n;
                    int i4 = dc8Var.a;
                    long j2 = dc8Var.b;
                    long j3 = -1;
                    if (j2 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j > 0)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                        if (kr6Var != null) {
                            Bundle bundle3 = kr6Var.a;
                            if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                j3 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                        ArrayList arrayList = new ArrayList();
                        long j6 = dc8Var.c;
                        long j7 = dc8Var.e;
                        int i5 = dc8Var.f;
                        CharSequence charSequence = dc8Var.h;
                        List list = dc8Var.r;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        dc8Var = new dc8(dc8Var.a, j5, j6, dc8Var.d, j7, i5, charSequence, elapsedRealtime, arrayList, dc8Var.s, dc8Var.w);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (dc8Var == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            dc8Var.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            bv6 bv6Var3 = (bv6) this.a.get();
            i3 = bv6Var3 != null ? bv6Var3.j : -1;
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
            bv6 bv6Var4 = (bv6) this.a.get();
            i3 = bv6Var4 != null ? bv6Var4.k : -1;
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
        bv6 bv6Var5 = (bv6) this.a.get();
        if (bv6Var5 != null && (bundle = bv6Var5.e) != null) {
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
