package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 extends i6.g {
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // i6.h
    public final void C0(String str, byte[] bArr) {
        e0.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // i6.h
    public final void D0(i6.d dVar) {
        e0.k(this.b).post(new l9.u(12, this, dVar));
    }

    @Override // i6.h
    public final void N(int i3) {
        e0.k(this.b).post(new c0(this, i3, 0));
    }

    @Override // i6.h
    public final void Q(String str, String str2) {
        e0.H.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.b).post(new j1(this, str, str2, false, 3));
    }

    @Override // i6.h
    public final void T(i6.c cVar) {
        e0.k(this.b).post(new l9.u(13, this, cVar));
    }

    @Override // i6.h
    public final void U(int i3) {
        this.b.i(i3);
    }

    @Override // i6.h
    public final void V(long j10) {
        e0.f(this.b, j10, 0);
    }

    @Override // i6.h
    public final void b0(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.b;
        e0Var.u = dVar;
        e0Var.v = str;
        i6.t tVar = new i6.t(new Status(0, null, null, null), dVar, str, str2, z10);
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

    @Override // i6.h
    public final void d(int i3) {
        e0.g(this.b, i3);
    }

    @Override // i6.h
    public final void g(int i3) {
        e0.k(this.b).post(new c0(this, i3, 1));
    }

    @Override // i6.h
    public final void x0(int i3) {
        e0.k(this.b).post(new c0(this, i3, 3));
    }

    @Override // i6.h
    public final void zzd(int i3) {
        e0 e0Var = this.b;
        e0.g(e0Var, i3);
        if (e0Var.E != null) {
            e0.k(e0Var).post(new c0(this, i3, 2));
        }
    }

    @Override // i6.h
    public final void zzg(int i3) {
        e0.g(this.b, i3);
    }

    @Override // i6.h
    public final void zzm(int i3, long j10) {
        e0.f(this.b, j10, i3);
    }

    @Override // i6.h
    public final void zzn() {
        e0.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
