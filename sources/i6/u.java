package i6;

import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.atomic.AtomicReference;
import p6.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends g {
    public final AtomicReference b;
    public final z c;

    public u(v vVar) {
        this.b = new AtomicReference(vVar);
        this.c = new z(vVar.i, 0);
    }

    @Override // i6.h
    public final void C0(String str, byte[] bArr) {
        if (((v) this.b.get()) == null) {
            return;
        }
        v.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // i6.h
    public final void D0(d dVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onDeviceStatusChanged", new Object[0]);
        this.c.post(new l9.u(14, vVar, dVar));
    }

    @Override // i6.h
    public final void N(int i3) {
        v vVar = null;
        v vVar2 = (v) this.b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.S = -1;
            vVar2.T = -1;
            vVar2.F = null;
            vVar2.M = null;
            vVar2.Q = 0.0d;
            vVar2.C();
            vVar2.N = false;
            vVar2.R = null;
            vVar = vVar2;
        }
        if (vVar == null) {
            return;
        }
        v.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i3));
        if (i3 != 0) {
            int i10 = vVar.C.get();
            c0 c0Var = vVar.k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
        }
    }

    @Override // i6.h
    public final void Q(String str, String str2) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.c.post(new j1(vVar, str, str2, false, 5));
    }

    @Override // i6.h
    public final void T(c cVar) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onApplicationStatusChanged", new Object[0]);
        this.c.post(new l9.u(15, vVar, cVar));
    }

    @Override // i6.h
    public final void U(int i3) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.Z) {
        }
    }

    @Override // i6.h
    public final void V(long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.A(vVar, j10, 0);
    }

    @Override // i6.h
    public final void b0(e6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        vVar.F = dVar;
        vVar.U = dVar.a;
        vVar.V = str2;
        vVar.M = str;
        synchronized (v.Z) {
        }
    }

    @Override // i6.h
    public final void d(int i3) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.a0) {
        }
    }

    @Override // i6.h
    public final void zzd(int i3) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = null;
        vVar.V = null;
        synchronized (v.a0) {
        }
        if (vVar.H != null) {
            this.c.post(new androidx.emoji2.text.j(vVar, i3, 2));
        }
    }

    @Override // i6.h
    public final void zzg(int i3) {
        if (((v) this.b.get()) == null) {
            return;
        }
        synchronized (v.a0) {
        }
    }

    @Override // i6.h
    public final void zzm(int i3, long j10) {
        v vVar = (v) this.b.get();
        if (vVar == null) {
            return;
        }
        v.A(vVar, j10, i3);
    }

    @Override // i6.h
    public final void zzn() {
        v.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // i6.h
    public final void g(int i3) {
    }

    @Override // i6.h
    public final void x0(int i3) {
    }
}
