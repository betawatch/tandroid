package g6;

import com.google.android.gms.internal.cast.z;
import java.util.concurrent.atomic.AtomicReference;
import n6.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends g {
    public final AtomicReference b;
    public final z c;

    public u(v vVar) {
        this.b = new AtomicReference(vVar);
        this.c = new z(vVar.r, 0);
    }

    @Override // g6.h
    public final void A0(c cVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new j9.u(15, vVar, cVar));
    }

    @Override // g6.h
    public final void C0(String str, byte[] bArr) {
        if (((v) this.b.get()) == null) {
            return;
        }
        v.n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // g6.h
    public final void Q(int i10) {
        v vVar = null;
        v vVar2 = (v) this.b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.h0 = -1;
            vVar2.i0 = -1;
            vVar2.U = null;
            vVar2.b0 = null;
            vVar2.f0 = 0.0d;
            vVar2.J();
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
            a0 a0Var = vVar.w;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override // g6.h
    public final void U(String str, String str2) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new c5.w(vVar, str, str2, 5));
    }

    @Override // g6.h
    public final void Y(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.o0) {
        }
    }

    @Override // g6.h
    public final void Z(long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.H(vVar, j10, 0);
    }

    @Override // g6.h
    public final void d(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.p0) {
        }
    }

    @Override // g6.h
    public final void n(c6.d dVar, String str, String str2, boolean z10) {
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
    public final void v0(d dVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new j9.u(14, vVar, dVar));
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
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.H(vVar, j10, i10);
    }

    @Override // g6.h
    public final void zzn() {
        v.n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // g6.h
    public final void g(int i10) {
    }

    @Override // g6.h
    public final void x0(int i10) {
    }
}
