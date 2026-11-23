package j6;

import java.util.concurrent.atomic.AtomicReference;
import q6.c0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w extends g {
    public final AtomicReference b;
    public final com.google.android.gms.internal.cast.y c;

    public w(x xVar) {
        this.b = new AtomicReference(xVar);
        this.c = new com.google.android.gms.internal.cast.y(xVar.i, 0);
    }

    @Override // j6.h
    public final void K0(d dVar) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new m9.u(20, xVar, dVar));
    }

    @Override // j6.h
    public final void N0(c cVar) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new m9.u(21, xVar, cVar));
    }

    @Override // j6.h
    public final void S0(f6.d dVar, String str, String str2, boolean z10) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        xVar.F = dVar;
        xVar.U = dVar.a;
        xVar.V = str2;
        xVar.M = str;
        synchronized (x.Z) {
        }
    }

    @Override // j6.h
    public final void W(int i7) {
        x xVar = null;
        x xVar2 = (x) this.b.getAndSet(null);
        if (xVar2 != null) {
            xVar2.S = -1;
            xVar2.T = -1;
            xVar2.F = null;
            xVar2.M = null;
            xVar2.Q = 0.0d;
            xVar2.D();
            xVar2.N = false;
            xVar2.R = null;
            xVar = xVar2;
        }
        if (xVar == null) {
            return;
        }
        x.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i7));
        if (i7 != 0) {
            int i10 = xVar.C.get();
            c0 c0Var = xVar.k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
        }
    }

    @Override // j6.h
    public final void Y0(String str, byte[] bArr) {
        if (((x) this.b.get()) == null) {
            return;
        }
        x.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // j6.h
    public final void Z(String str, String str2) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new a9.h(xVar, str, str2, 6));
    }

    @Override // j6.h
    public final void c0(int i7) {
        if (((x) this.b.get()) == null) {
            return;
        }
        synchronized (x.Z) {
        }
    }

    @Override // j6.h
    public final void f0(long j3) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        x.B(xVar, j3, 0);
    }

    @Override // j6.h
    public final void g(int i7) {
        if (((x) this.b.get()) == null) {
            return;
        }
        synchronized (x.a0) {
        }
    }

    @Override // j6.h
    public final void zzd(int i7) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        xVar.U = null;
        xVar.V = null;
        synchronized (x.a0) {
        }
        if (xVar.H != null) {
            this.c.post(new androidx.emoji2.text.j(xVar, i7, 2));
        }
    }

    @Override // j6.h
    public final void zzg(int i7) {
        if (((x) this.b.get()) == null) {
            return;
        }
        synchronized (x.a0) {
        }
    }

    @Override // j6.h
    public final void zzm(int i7, long j3) {
        x xVar = (x) this.b.get();
        if (xVar == null) {
            return;
        }
        x.B(xVar, j3, i7);
    }

    @Override // j6.h
    public final void zzn() {
        x.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // j6.h
    public final void O0(int i7) {
    }

    @Override // j6.h
    public final void h(int i7) {
    }
}
