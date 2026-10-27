package d6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 extends h6.g {
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // h6.h
    public final void A0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // h6.h
    public final void H(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.b;
        e0Var.t = dVar;
        e0Var.u = str;
        h6.t tVar = new h6.t(new Status(0, null, null, null), dVar, str, str2, z10);
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

    @Override // h6.h
    public final void O(int i10) {
        e0.k(this.b).post(new c0(this, i10, 0));
    }

    @Override // h6.h
    public final void R(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.b).post(new q1(this, str, str2, false, 4));
    }

    @Override // h6.h
    public final void U(int i10) {
        this.b.i(i10);
    }

    @Override // h6.h
    public final void W(long j10) {
        e0.f(this.b, j10, 0);
    }

    @Override // h6.h
    public final void Z(h6.c cVar) {
        e0.k(this.b).post(new k9.u(9, this, cVar));
    }

    @Override // h6.h
    public final void c(int i10) {
        e0.g(this.b, i10);
    }

    @Override // h6.h
    public final void f(int i10) {
        e0.k(this.b).post(new c0(this, i10, 1));
    }

    @Override // h6.h
    public final void r0(int i10) {
        e0.k(this.b).post(new c0(this, i10, 3));
    }

    @Override // h6.h
    public final void z0(h6.d dVar) {
        e0.k(this.b).post(new k9.u(8, this, dVar));
    }

    @Override // h6.h
    public final void zzd(int i10) {
        e0 e0Var = this.b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override // h6.h
    public final void zzg(int i10) {
        e0.g(this.b, i10);
    }

    @Override // h6.h
    public final void zzm(int i10, long j10) {
        e0.f(this.b, j10, i10);
    }

    @Override // h6.h
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
