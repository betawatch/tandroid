package c6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 extends g6.g {
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // g6.h
    public final void A0(g6.c cVar) {
        e0.k(this.b).post(new j9.u(8, this, cVar));
    }

    @Override // g6.h
    public final void C0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // g6.h
    public final void Q(int i10) {
        e0.k(this.b).post(new c0(this, i10, 0));
    }

    @Override // g6.h
    public final void U(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.b).post(new c5.w(this, str, str2, 2));
    }

    @Override // g6.h
    public final void Y(int i10) {
        this.b.i(i10);
    }

    @Override // g6.h
    public final void Z(long j10) {
        e0.f(this.b, j10, 0);
    }

    @Override // g6.h
    public final void d(int i10) {
        e0.g(this.b, i10);
    }

    @Override // g6.h
    public final void g(int i10) {
        e0.k(this.b).post(new c0(this, i10, 1));
    }

    @Override // g6.h
    public final void n(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.b;
        e0Var.t = dVar;
        e0Var.u = str;
        g6.t tVar = new g6.t(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.r) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g6.h
    public final void v0(g6.d dVar) {
        e0.k(this.b).post(new j9.u(7, this, dVar));
    }

    @Override // g6.h
    public final void x0(int i10) {
        e0.k(this.b).post(new c0(this, i10, 3));
    }

    @Override // g6.h
    public final void zzd(int i10) {
        e0 e0Var = this.b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override // g6.h
    public final void zzg(int i10) {
        e0.g(this.b, i10);
    }

    @Override // g6.h
    public final void zzm(int i10, long j10) {
        e0.f(this.b, j10, i10);
    }

    @Override // g6.h
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
