package l4;

import d5.g0;
import d5.z;
import h3.t0;
import m3.v;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements w {
    public final int a;
    public final t0 b;
    public final m3.j c = new m3.j();
    public t0 d;
    public w e;
    public long f;

    public c(int i10, int i11, t0 t0Var) {
        this.a = i11;
        this.b = t0Var;
    }

    @Override // m3.w
    public final /* synthetic */ void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w wVar = this.e;
        int i11 = g0.a;
        return wVar.b(jVar, i10, z10);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
        t0 t0Var2 = this.b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.e;
        int i10 = g0.a;
        wVar.c(t0Var);
    }

    @Override // m3.w
    public final void d(int i10, z zVar) {
        w wVar = this.e;
        int i11 = g0.a;
        wVar.a(i10, zVar);
    }

    @Override // m3.w
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
        long j11 = this.f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.e = this.c;
        }
        w wVar = this.e;
        int i13 = g0.a;
        wVar.e(j10, i10, i11, i12, vVar);
    }
}
