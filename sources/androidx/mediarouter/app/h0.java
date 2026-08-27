package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 extends c2.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.t b;

    public /* synthetic */ h0(g.t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // c2.v
    public void d(c2.z zVar) {
        switch (this.a) {
            case 0:
                ((p0) this.b).n();
                break;
            case 1:
                ((g) this.b).f();
                break;
            case 3:
                ((c0) this.b).e();
                break;
        }
    }

    @Override // c2.v
    public final void e(c2.z zVar) {
        ae.b b10;
        c2.p pVar;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                if (zVar == p0Var.r && c2.z.a() != null) {
                    c2.y yVar = zVar.a;
                    yVar.getClass();
                    c2.b0.b();
                    for (c2.z zVar2 : DesugarCollections.unmodifiableList(yVar.b)) {
                        if (!DesugarCollections.unmodifiableList(p0Var.r.v).contains(zVar2) && (b10 = p0Var.r.b(zVar2)) != null && (pVar = (c2.p) b10.b) != null && pVar.d && !p0Var.v.contains(zVar2)) {
                            p0Var.o();
                            p0Var.l();
                            break;
                        }
                    }
                }
                p0Var.n();
                break;
            case 1:
                ((g) this.b).f();
                break;
            case 2:
                ((u) this.b).q(true);
                break;
            default:
                ((c0) this.b).e();
                break;
        }
    }

    @Override // c2.v
    public void f(c2.z zVar) {
        switch (this.a) {
            case 0:
                ((p0) this.b).n();
                break;
            case 1:
                ((g) this.b).f();
                break;
            case 3:
                ((c0) this.b).e();
                break;
        }
    }

    @Override // c2.v
    public void g(c2.z zVar) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                p0Var.r = zVar;
                p0Var.o();
                p0Var.l();
                break;
            case 1:
                ((g) this.b).dismiss();
                break;
            case 3:
                ((c0) this.b).dismiss();
                break;
        }
    }

    @Override // c2.v
    public void i() {
        switch (this.a) {
            case 0:
                ((p0) this.b).n();
                break;
            case 2:
                ((u) this.b).q(false);
                break;
        }
    }

    @Override // c2.v
    public void k(c2.z zVar) {
        g0 g0Var;
        int i10 = this.a;
        g.t tVar = this.b;
        switch (i10) {
            case 0:
                int i11 = p0.f0;
                p0 p0Var = (p0) tVar;
                if (p0Var.I != zVar && (g0Var = (g0) p0Var.H.get(zVar.c)) != null) {
                    int i12 = g0Var.v.p;
                    g0Var.u(i12 == 0);
                    g0Var.x.setProgress(i12);
                    break;
                }
                break;
            case 2:
                u uVar = (u) tVar;
                SeekBar seekBar = (SeekBar) uVar.d0.get(zVar);
                int i13 = zVar.p;
                int i14 = u.B0;
                if (seekBar != null && uVar.Y != zVar) {
                    seekBar.setProgress(i13);
                    break;
                }
                break;
        }
    }
}
