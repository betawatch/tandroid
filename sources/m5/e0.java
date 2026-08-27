package m5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e0 extends r5.g {
    public final /* synthetic */ f0 b;

    public e0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // r5.h
    public final void A0(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // r5.h
    public final void D(r5.d dVar) {
        f0.k(this.b).post(new a9.o(this, dVar, false, 22));
    }

    @Override // r5.h
    public final void L(d dVar, String str, String str2, boolean z10) {
        f0 f0Var = this.b;
        f0Var.t = dVar;
        f0Var.u = str;
        r5.u uVar = new r5.u(new Status(0, null, null, null), dVar, str, str2, z10);
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

    @Override // r5.h
    public final void M(int i10) {
        f0.k(this.b).post(new d0(this, i10, 0));
    }

    @Override // r5.h
    public final void P(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.k(this.b).post(new q1(this, str, str2, false, 7));
    }

    @Override // r5.h
    public final void T(int i10) {
        this.b.i(i10);
    }

    @Override // r5.h
    public final void V(long j10) {
        f0.f(this.b, j10, 0);
    }

    @Override // r5.h
    public final void c(int i10) {
        f0.g(this.b, i10);
    }

    @Override // r5.h
    public final void d(int i10) {
        f0.k(this.b).post(new d0(this, i10, 1));
    }

    @Override // r5.h
    public final void w0(int i10) {
        f0.k(this.b).post(new d0(this, i10, 3));
    }

    @Override // r5.h
    public final void y(r5.c cVar) {
        f0.k(this.b).post(new a9.o(this, cVar, false, 23));
    }

    @Override // r5.h
    public final void zzd(int i10) {
        f0 f0Var = this.b;
        f0.g(f0Var, i10);
        if (f0Var.D != null) {
            f0.k(f0Var).post(new d0(this, i10, 2));
        }
    }

    @Override // r5.h
    public final void zzg(int i10) {
        f0.g(this.b, i10);
    }

    @Override // r5.h
    public final void zzm(int i10, long j10) {
        f0.f(this.b, j10, i10);
    }

    @Override // r5.h
    public final void zzn() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
