package l4;

import d5.f0;
import d5.y;
import h3.t0;
import j3.r0;
import m3.v;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements w {
    public final int a;
    public final t0 b;
    public final m3.j c = new m3.j();
    public t0 d;
    public w e;
    public long f;

    public c(int i9, int i10, t0 t0Var) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // m3.w
    public final /* synthetic */ void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        w wVar = this.e;
        int i10 = f0.a;
        return wVar.b(jVar, i9, z10);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
        t0 t0Var2 = this.b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.e;
        int i9 = f0.a;
        wVar.c(t0Var);
    }

    @Override // m3.w
    public final void d(int i9, y yVar) {
        w wVar = this.e;
        int i10 = f0.a;
        wVar.a(i9, yVar);
    }

    @Override // m3.w
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
        long j11 = this.f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.e = this.c;
        }
        w wVar = this.e;
        int i12 = f0.a;
        wVar.e(j10, i9, i10, i11, vVar);
    }
}
