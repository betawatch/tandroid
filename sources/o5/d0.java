package o5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d0 extends s5.g {
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // s5.h
    public final void K(int i10) {
        e0.k(this.b).post(new c0(this, i10, 0));
    }

    @Override // s5.h
    public final void N(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.b).post(new q1(this, str, str2, false, 8));
    }

    @Override // s5.h
    public final void S(int i10) {
        this.b.i(i10);
    }

    @Override // s5.h
    public final void T(s5.d dVar) {
        e0.k(this.b).post(new ab.o(28, this, dVar));
    }

    @Override // s5.h
    public final void U(long j10) {
        e0.f(this.b, j10, 0);
    }

    @Override // s5.h
    public final void c(int i10) {
        e0.g(this.b, i10);
    }

    @Override // s5.h
    public final void d(int i10) {
        e0.k(this.b).post(new c0(this, i10, 1));
    }

    @Override // s5.h
    public final void h(s5.c cVar) {
        e0.k(this.b).post(new ab.o(29, this, cVar));
    }

    @Override // s5.h
    public final void s0(int i10) {
        e0.k(this.b).post(new c0(this, i10, 3));
    }

    @Override // s5.h
    public final void z(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.b;
        e0Var.t = dVar;
        e0Var.u = str;
        s5.u uVar = new s5.u(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.r) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                e0Var.o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s5.h
    public final void z0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // s5.h
    public final void zzd(int i10) {
        e0 e0Var = this.b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override // s5.h
    public final void zzg(int i10) {
        e0.g(this.b, i10);
    }

    @Override // s5.h
    public final void zzm(int i10, long j10) {
        e0.f(this.b, j10, i10);
    }

    @Override // s5.h
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
