package m5;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(e0 e0Var, int i10, int i11) {
        this.a = i11;
        this.b = e0Var;
        this.c = i10;
    }

    private final void a() {
        e0 e0Var = this.b;
        f0 f0Var = e0Var.b;
        f0Var.x = -1;
        f0Var.y = -1;
        f0Var.t = null;
        f0Var.u = null;
        f0Var.v = 0.0d;
        f0Var.j();
        f0Var.w = false;
        f0Var.z = null;
        f0 f0Var2 = e0Var.b;
        f0Var2.F = 1;
        int i10 = this.c;
        synchronized (f0Var2.E) {
            try {
                Iterator it = e0Var.b.E.iterator();
                while (it.hasNext()) {
                    n5.r rVar = ((n5.j) it.next()).a.e;
                    if (rVar != null) {
                        try {
                            v5.a aVar = new v5.a(i10);
                            n5.p pVar = (n5.p) rVar;
                            Parcel M0 = pVar.M0();
                            com.google.android.gms.internal.cast.t.c(M0, aVar);
                            pVar.Q0(M0, 3);
                        } catch (RemoteException e9) {
                            n5.c.m.a(e9, "Unable to call %s on %s.", "onDisconnected", n5.r.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e0Var.b.h();
        f0 f0Var3 = e0Var.b;
        com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var3.f, f0Var3.k, "castDeviceControllerListenerKey").c;
        y5.l.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        Iterator it;
        e0 e0Var = this.b;
        int i10 = this.c;
        if (i10 == 0) {
            f0 f0Var = e0Var.b;
            f0Var.F = 2;
            f0Var.m = true;
            f0Var.n = true;
            synchronized (f0Var.E) {
                try {
                    Iterator it2 = e0Var.b.E.iterator();
                    while (it2.hasNext()) {
                        ((n5.j) it2.next()).a();
                    }
                } finally {
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            try {
                it = e0Var.b.E.iterator();
            } catch (RemoteException e9) {
                n5.c.m.a(e9, "Unable to call %s on %s.", "onConnectionFailed", n5.r.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                n5.r rVar = ((n5.j) it.next()).a.e;
                if (rVar != null) {
                    v5.a aVar = new v5.a(i10);
                    n5.p pVar = (n5.p) rVar;
                    Parcel M0 = pVar.M0();
                    com.google.android.gms.internal.cast.t.c(M0, aVar);
                    pVar.Q0(M0, 3);
                }
            }
        }
        e0Var.b.h();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.b.b.D.b(this.c);
                return;
            default:
                e0 e0Var = this.b;
                f0 f0Var = e0Var.b;
                f0Var.F = 3;
                int i10 = this.c;
                synchronized (f0Var.E) {
                    try {
                        Iterator it = e0Var.b.E.iterator();
                        while (it.hasNext()) {
                            n5.r rVar = ((n5.j) it.next()).a.e;
                            if (rVar != null) {
                                try {
                                    n5.p pVar = (n5.p) rVar;
                                    Parcel M0 = pVar.M0();
                                    M0.writeInt(i10);
                                    pVar.Q0(M0, 2);
                                } catch (RemoteException e9) {
                                    n5.c.m.a(e9, "Unable to call %s on %s.", "onConnectionSuspended", n5.r.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
