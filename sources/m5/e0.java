package m5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e0 extends q5.g {
    public final /* synthetic */ f0 b;

    public e0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // q5.h
    public final void A0(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // q5.h
    public final void L(d dVar, String str, String str2, boolean z10) {
        f0 f0Var = this.b;
        f0Var.t = dVar;
        f0Var.u = str;
        q5.u uVar = new q5.u(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (f0Var.r) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                f0Var.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q5.h
    public final void M(int i9) {
        f0.k(this.b).post(new d0(this, i9, 0));
    }

    @Override // q5.h
    public final void P(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.k(this.b).post(new q1(this, str, str2, false, 7));
    }

    @Override // q5.h
    public final void T(int i9) {
        this.b.i(i9);
    }

    @Override // q5.h
    public final void V(long j10) {
        f0.f(this.b, j10, 0);
    }

    @Override // q5.h
    public final void c(int i9) {
        f0.g(this.b, i9);
    }

    @Override // q5.h
    public final void d(int i9) {
        f0.k(this.b).post(new d0(this, i9, 1));
    }

    @Override // q5.h
    public final void u0(int i9) {
        f0.k(this.b).post(new d0(this, i9, 3));
    }

    @Override // q5.h
    public final void v(q5.d dVar) {
        f0.k(this.b).post(new androidx.biometric.j(this, dVar, false, 21));
    }

    @Override // q5.h
    public final void v0(q5.c cVar) {
        f0.k(this.b).post(new androidx.biometric.j(this, cVar, false, 22));
    }

    @Override // q5.h
    public final void zzd(int i9) {
        f0 f0Var = this.b;
        f0.g(f0Var, i9);
        if (f0Var.D != null) {
            f0.k(f0Var).post(new d0(this, i9, 2));
        }
    }

    @Override // q5.h
    public final void zzg(int i9) {
        f0.g(this.b, i9);
    }

    @Override // q5.h
    public final void zzm(int i9, long j10) {
        f0.f(this.b, j10, i9);
    }

    @Override // q5.h
    public final void zzn() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
