package f6;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(d0 d0Var, int i7, int i10) {
        this.a = i10;
        this.b = d0Var;
        this.c = i7;
    }

    private final void a() {
        d0 d0Var = this.b;
        e0 e0Var = d0Var.b;
        e0Var.y = -1;
        e0Var.z = -1;
        e0Var.u = null;
        e0Var.v = null;
        e0Var.w = 0.0d;
        e0Var.j();
        e0Var.x = false;
        e0Var.A = null;
        e0 e0Var2 = d0Var.b;
        e0Var2.G = 1;
        int i7 = this.c;
        synchronized (e0Var2.F) {
            try {
                Iterator it = d0Var.b.F.iterator();
                while (it.hasNext()) {
                    g6.q qVar = ((g6.i) it.next()).a.e;
                    if (qVar != null) {
                        try {
                            n6.a aVar = new n6.a(i7, null, null);
                            g6.o oVar = (g6.o) qVar;
                            Parcel P0 = oVar.P0();
                            com.google.android.gms.internal.cast.t.c(P0, aVar);
                            oVar.T0(P0, 3);
                        } catch (RemoteException e10) {
                            g6.c.m.a(e10, "Unable to call %s on %s.", "onDisconnected", g6.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.b.h();
        e0 e0Var3 = d0Var.b;
        com.google.android.gms.common.api.internal.m mVar = cb.c.o(e0Var3.g, e0Var3.l, "castDeviceControllerListenerKey").b;
        q6.m.h(mVar, "Key must not be null");
        e0Var3.c(mVar, 8415);
    }

    private final void b() {
        Iterator it;
        d0 d0Var = this.b;
        int i7 = this.c;
        if (i7 == 0) {
            e0 e0Var = d0Var.b;
            e0Var.G = 2;
            e0Var.n = true;
            e0Var.o = true;
            synchronized (e0Var.F) {
                try {
                    Iterator it2 = d0Var.b.F.iterator();
                    while (it2.hasNext()) {
                        ((g6.i) it2.next()).a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.b;
        e0Var2.G = 1;
        synchronized (e0Var2.F) {
            try {
                it = d0Var.b.F.iterator();
            } catch (RemoteException e10) {
                g6.c.m.a(e10, "Unable to call %s on %s.", "onConnectionFailed", g6.q.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                g6.q qVar = ((g6.i) it.next()).a.e;
                if (qVar != null) {
                    n6.a aVar = new n6.a(i7, null, null);
                    g6.o oVar = (g6.o) qVar;
                    Parcel P0 = oVar.P0();
                    com.google.android.gms.internal.cast.t.c(P0, aVar);
                    oVar.T0(P0, 3);
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
                this.b.b.E.b(this.c);
                return;
            default:
                d0 d0Var = this.b;
                e0 e0Var = d0Var.b;
                e0Var.G = 3;
                int i7 = this.c;
                synchronized (e0Var.F) {
                    try {
                        Iterator it = d0Var.b.F.iterator();
                        while (it.hasNext()) {
                            g6.q qVar = ((g6.i) it.next()).a.e;
                            if (qVar != null) {
                                try {
                                    g6.o oVar = (g6.o) qVar;
                                    Parcel P0 = oVar.P0();
                                    P0.writeInt(i7);
                                    oVar.T0(P0, 2);
                                } catch (RemoteException e10) {
                                    g6.c.m.a(e10, "Unable to call %s on %s.", "onConnectionSuspended", g6.q.class.getSimpleName());
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
