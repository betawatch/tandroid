package f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d0 extends j6.g {
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // j6.h
    public final void C0(String str, byte[] bArr) {
        e0.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // j6.h
    public final void M(int i7) {
        e0.k(this.b).post(new c0(this, i7, 0));
    }

    @Override // j6.h
    public final void P(String str, String str2) {
        e0.H.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.b).post(new a9.h(this, str, str2, 4));
    }

    @Override // j6.h
    public final void S(int i7) {
        this.b.i(i7);
    }

    @Override // j6.h
    public final void U(long j3) {
        e0.f(this.b, j3, 0);
    }

    @Override // j6.h
    public final void g(int i7) {
        e0.g(this.b, i7);
    }

    @Override // j6.h
    public final void h(int i7) {
        e0.k(this.b).post(new c0(this, i7, 1));
    }

    @Override // j6.h
    public final void r0(j6.d dVar) {
        e0.k(this.b).post(new m9.u(18, this, dVar));
    }

    @Override // j6.h
    public final void t0(j6.c cVar) {
        e0.k(this.b).post(new m9.u(19, this, cVar));
    }

    @Override // j6.h
    public final void u0(int i7) {
        e0.k(this.b).post(new c0(this, i7, 3));
    }

    @Override // j6.h
    public final void w0(d dVar, String str, String str2, boolean z9) {
        e0 e0Var = this.b;
        e0Var.u = dVar;
        e0Var.v = str;
        j6.t tVar = new j6.t(new Status(0, null, null, null), dVar, str, str2, z9);
        synchronized (e0Var.s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j6.h
    public final void zzd(int i7) {
        e0 e0Var = this.b;
        e0.g(e0Var, i7);
        if (e0Var.E != null) {
            e0.k(e0Var).post(new c0(this, i7, 2));
        }
    }

    @Override // j6.h
    public final void zzg(int i7) {
        e0.g(this.b, i7);
    }

    @Override // j6.h
    public final void zzm(int i7, long j3) {
        e0.f(this.b, j3, i7);
    }

    @Override // j6.h
    public final void zzn() {
        e0.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
