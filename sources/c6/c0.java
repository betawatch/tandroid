package c6;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(d0 d0Var, int i10, int i11) {
        this.a = i11;
        this.b = d0Var;
        this.c = i10;
    }

    private final void a() {
        d0 d0Var = this.b;
        e0 e0Var = d0Var.b;
        e0Var.x = -1;
        e0Var.y = -1;
        e0Var.t = null;
        e0Var.u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.w = false;
        e0Var.z = null;
        e0 e0Var2 = d0Var.b;
        e0Var2.F = 1;
        int i10 = this.c;
        synchronized (e0Var2.E) {
            try {
                Iterator it = d0Var.b.E.iterator();
                while (it.hasNext()) {
                    d6.q qVar = ((d6.i) it.next()).a.e;
                    if (qVar != null) {
                        try {
                            k6.a aVar = new k6.a(i10);
                            d6.o oVar = (d6.o) qVar;
                            Parcel N0 = oVar.N0();
                            com.google.android.gms.internal.cast.v.c(N0, aVar);
                            oVar.R0(N0, 3);
                        } catch (RemoteException e) {
                            d6.c.m.a(e, "Unable to call %s on %s.", "onDisconnected", d6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.b.h();
        e0 e0Var3 = d0Var.b;
        com.google.android.gms.common.api.internal.n nVar = qb.c.d(e0Var3.f, e0Var3.k, "castDeviceControllerListenerKey").c;
        n6.l.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        Iterator it;
        d0 d0Var = this.b;
        int i10 = this.c;
        if (i10 == 0) {
            e0 e0Var = d0Var.b;
            e0Var.F = 2;
            e0Var.m = true;
            e0Var.n = true;
            synchronized (e0Var.E) {
                try {
                    Iterator it2 = d0Var.b.E.iterator();
                    while (it2.hasNext()) {
                        ((d6.i) it2.next()).a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
                it = d0Var.b.E.iterator();
            } catch (RemoteException e) {
                d6.c.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", d6.q.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                d6.q qVar = ((d6.i) it.next()).a.e;
                if (qVar != null) {
                    k6.a aVar = new k6.a(i10);
                    d6.o oVar = (d6.o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.v.c(N0, aVar);
                    oVar.R0(N0, 3);
                }
            }
        }
        d0Var.b.h();
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
                d0 d0Var = this.b;
                e0 e0Var = d0Var.b;
                e0Var.F = 3;
                int i10 = this.c;
                synchronized (e0Var.E) {
                    try {
                        Iterator it = d0Var.b.E.iterator();
                        while (it.hasNext()) {
                            d6.q qVar = ((d6.i) it.next()).a.e;
                            if (qVar != null) {
                                try {
                                    d6.o oVar = (d6.o) qVar;
                                    Parcel N0 = oVar.N0();
                                    N0.writeInt(i10);
                                    oVar.R0(N0, 2);
                                } catch (RemoteException e) {
                                    d6.c.m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", d6.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
