package g6;

import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.atomic.AtomicReference;
import n6.b0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u extends g {
    public final AtomicReference b;
    public final a0 c;

    public u(v vVar) {
        this.b = new AtomicReference(vVar);
        this.c = new a0(vVar.r, 0);
    }

    @Override // g6.h
    public final void A0(String str, byte[] bArr) {
        if (((v) this.b.get()) == null) {
            return;
        }
        v.n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // g6.h
    public final void P(int i10) {
        v vVar = null;
        v vVar2 = (v) this.b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.h0 = -1;
            vVar2.i0 = -1;
            vVar2.U = null;
            vVar2.b0 = null;
            vVar2.f0 = 0.0d;
            vVar2.I();
            vVar2.c0 = false;
            vVar2.g0 = null;
            vVar = vVar2;
        }
        if (vVar == null) {
            return;
        }
        v.n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
        if (i10 != 0) {
            int i11 = vVar.R.get();
            b0 b0Var = vVar.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override // g6.h
    public final void T(String str, String str2) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new c5.v(vVar, str, str2, 6));
    }

    @Override // g6.h
    public final void X(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.o0) {
        }
    }

    @Override // g6.h
    public final void Y(long j3) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, 0);
    }

    @Override // g6.h
    public final void c(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.p0) {
        }
    }

    @Override // g6.h
    public final void m(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.j0 = dVar.a;
        vVar.k0 = str2;
        vVar.b0 = str;
        synchronized (v.o0) {
        }
    }

    @Override // g6.h
    public final void t0(d dVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new i9.s(15, vVar, dVar));
    }

    @Override // g6.h
    public final void y0(c cVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new i9.s(16, vVar, cVar));
    }

    @Override // g6.h
    public final void zzd(int i10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        vVar.j0 = null;
        vVar.k0 = null;
        synchronized (v.p0) {
        }
        if (vVar.W != null) {
            this.c.post(new androidx.emoji2.text.j(vVar, i10, 2));
        }
    }

    @Override // g6.h
    public final void zzg(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.p0) {
        }
    }

    @Override // g6.h
    public final void zzm(int i10, long j3) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, i10);
    }

    @Override // g6.h
    public final void zzn() {
        v.n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // g6.h
    public final void f(int i10) {
    }

    @Override // g6.h
    public final void v0(int i10) {
    }
}
