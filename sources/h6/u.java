package h6;

import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.atomic.AtomicReference;
import o6.a0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u extends g {
    public final AtomicReference b;
    public final y c;

    public u(v vVar) {
        this.b = new AtomicReference(vVar);
        this.c = new y(vVar.r, 0);
    }

    @Override // h6.h
    public final void A0(String str, byte[] bArr) {
        if (((v) this.b.get()) == null) {
            return;
        }
        v.n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // h6.h
    public final void H(d6.d dVar, String str, String str2, boolean z10) {
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

    @Override // h6.h
    public final void O(int i10) {
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
            a0 a0Var = vVar.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override // h6.h
    public final void R(String str, String str2) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new q1(vVar, str, str2, false, 6));
    }

    @Override // h6.h
    public final void U(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.o0) {
        }
    }

    @Override // h6.h
    public final void W(long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, 0);
    }

    @Override // h6.h
    public final void Z(c cVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new k9.u(15, vVar, cVar));
    }

    @Override // h6.h
    public final void c(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.p0) {
        }
    }

    @Override // h6.h
    public final void z0(d dVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.n0.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new k9.u(14, vVar, dVar));
    }

    @Override // h6.h
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

    @Override // h6.h
    public final void zzg(int i10) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.p0) {
        }
    }

    @Override // h6.h
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, i10);
    }

    @Override // h6.h
    public final void zzn() {
        v.n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // h6.h
    public final void f(int i10) {
    }

    @Override // h6.h
    public final void r0(int i10) {
    }
}
