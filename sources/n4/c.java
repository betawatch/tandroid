package n4;

import f5.d0;
import j3.t0;
import j7.l1;
import o3.v;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements w {
    public final int a;
    public final t0 b;
    public final o3.j c = new o3.j();
    public t0 d;
    public w e;
    public long f;

    public c(int i10, int i11, t0 t0Var) {
        this.a = i11;
        this.b = t0Var;
    }

    @Override // o3.w
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w wVar = this.e;
        int i11 = d0.a;
        return wVar.a(jVar, i10, z10);
    }

    @Override // o3.w
    public final void b(t0 t0Var) {
        t0 t0Var2 = this.b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.e;
        int i10 = d0.a;
        wVar.b(t0Var);
    }

    @Override // o3.w
    public final void c(long j10, int i10, int i11, int i12, v vVar) {
        long j11 = this.f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.e = this.c;
        }
        w wVar = this.e;
        int i13 = d0.a;
        wVar.c(j10, i10, i11, i12, vVar);
    }

    @Override // o3.w
    public final void d(int i10, f5.w wVar) {
        w wVar2 = this.e;
        int i11 = d0.a;
        wVar2.e(i10, wVar);
    }

    @Override // o3.w
    public final /* synthetic */ void e(int i10, f5.w wVar) {
        l1.a(this, wVar, i10);
    }
}
