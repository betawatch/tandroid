package j6;

import java.util.concurrent.atomic.AtomicReference;
import q6.c0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class v extends g {
    public final AtomicReference b;
    public final com.google.android.gms.internal.cast.y c;

    public v(w wVar) {
        this.b = new AtomicReference(wVar);
        this.c = new com.google.android.gms.internal.cast.y(wVar.i, 0);
    }

    @Override // j6.h
    public final void K0(d dVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new m9.u(20, wVar, dVar));
    }

    @Override // j6.h
    public final void N0(c cVar) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new m9.u(21, wVar, cVar));
    }

    @Override // j6.h
    public final void S0(f6.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.F = dVar;
        wVar.U = dVar.a;
        wVar.V = str2;
        wVar.M = str;
        synchronized (w.Z) {
        }
    }

    @Override // j6.h
    public final void W(int i7) {
        w wVar = null;
        w wVar2 = (w) this.b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.S = -1;
            wVar2.T = -1;
            wVar2.F = null;
            wVar2.M = null;
            wVar2.Q = 0.0d;
            wVar2.D();
            wVar2.N = false;
            wVar2.R = null;
            wVar = wVar2;
        }
        if (wVar == null) {
            return;
        }
        w.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i7));
        if (i7 != 0) {
            int i10 = wVar.C.get();
            c0 c0Var = wVar.k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
        }
    }

    @Override // j6.h
    public final void Y0(String str, byte[] bArr) {
        if (((w) this.b.get()) == null) {
            return;
        }
        w.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // j6.h
    public final void Z(String str, String str2) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new a9.h(wVar, str, str2, 6));
    }

    @Override // j6.h
    public final void c0(int i7) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.Z) {
        }
    }

    @Override // j6.h
    public final void f0(long j3) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.B(wVar, j3, 0);
    }

    @Override // j6.h
    public final void g(int i7) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.a0) {
        }
    }

    @Override // j6.h
    public final void zzd(int i7) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        wVar.U = null;
        wVar.V = null;
        synchronized (w.a0) {
        }
        if (wVar.H != null) {
            this.c.post(new androidx.emoji2.text.j(wVar, i7, 2));
        }
    }

    @Override // j6.h
    public final void zzg(int i7) {
        if (((w) this.b.get()) == null) {
            return;
        }
        synchronized (w.a0) {
        }
    }

    @Override // j6.h
    public final void zzm(int i7, long j3) {
        w wVar = (w) this.b.get();
        if (wVar == null) {
            return;
        }
        w.B(wVar, j3, i7);
    }

    @Override // j6.h
    public final void zzn() {
        w.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // j6.h
    public final void O0(int i7) {
    }

    @Override // j6.h
    public final void h(int i7) {
    }
}
