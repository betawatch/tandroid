package m5;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(e0 e0Var, int i9, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = i9;
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
        int i9 = this.c;
        synchronized (f0Var2.E) {
            try {
                Iterator it = e0Var.b.E.iterator();
                while (it.hasNext()) {
                    n5.q qVar = ((n5.i) it.next()).a.e;
                    if (qVar != null) {
                        try {
                            u5.a aVar = new u5.a(i9);
                            n5.o oVar = (n5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.u.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e10) {
                            n5.c.m.a(e10, "Unable to call %s on %s.", "onDisconnected", n5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e0Var.b.h();
        f0 f0Var3 = e0Var.b;
        com.google.android.gms.common.api.internal.n nVar = fa.c.D(f0Var3.f, f0Var3.k, "castDeviceControllerListenerKey").c;
        x5.l.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        Iterator it;
        e0 e0Var = this.b;
        int i9 = this.c;
        if (i9 == 0) {
            f0 f0Var = e0Var.b;
            f0Var.F = 2;
            f0Var.m = true;
            f0Var.n = true;
            synchronized (f0Var.E) {
                try {
                    Iterator it2 = e0Var.b.E.iterator();
                    while (it2.hasNext()) {
                        ((n5.i) it2.next()).a();
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
            } catch (RemoteException e10) {
                n5.c.m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", n5.q.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                n5.q qVar = ((n5.i) it.next()).a.e;
                if (qVar != null) {
                    u5.a aVar = new u5.a(i9);
                    n5.o oVar = (n5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.u.c(M0, aVar);
                    oVar.Q0(M0, 3);
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
                int i9 = this.c;
                synchronized (f0Var.E) {
                    try {
                        Iterator it = e0Var.b.E.iterator();
                        while (it.hasNext()) {
                            n5.q qVar = ((n5.i) it.next()).a.e;
                            if (qVar != null) {
                                try {
                                    n5.o oVar = (n5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i9);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e10) {
                                    n5.c.m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", n5.q.class.getSimpleName());
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
