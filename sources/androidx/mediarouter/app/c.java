package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class c extends p4.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.t b;

    public /* synthetic */ c(g.t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // p4.s
    public void d(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((c0) this.b).e();
                break;
            case 3:
                ((n0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public final void e(p4.v vVar) {
        l2.f b10;
        p4.o oVar;
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 1:
                ((t) this.b).q(true);
                break;
            case 2:
                ((c0) this.b).e();
                break;
            default:
                n0 n0Var = (n0) this.b;
                if (vVar == n0Var.r && p4.v.a() != null) {
                    p4.u uVar = vVar.a;
                    uVar.getClass();
                    p4.x.b();
                    for (p4.v vVar2 : DesugarCollections.unmodifiableList(uVar.b)) {
                        if (!DesugarCollections.unmodifiableList(n0Var.r.v).contains(vVar2) && (b10 = n0Var.r.b(vVar2)) != null && (oVar = (p4.o) b10.b) != null && oVar.d && !n0Var.v.contains(vVar2)) {
                            n0Var.o();
                            n0Var.l();
                            break;
                        }
                    }
                }
                n0Var.n();
                break;
        }
    }

    @Override // p4.s
    public void f(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((c0) this.b).e();
                break;
            case 3:
                ((n0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public void g(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).dismiss();
                break;
            case 2:
                ((c0) this.b).dismiss();
                break;
            case 3:
                n0 n0Var = (n0) this.b;
                n0Var.r = vVar;
                n0Var.o();
                n0Var.l();
                break;
        }
    }

    @Override // p4.s
    public void i() {
        switch (this.a) {
            case 1:
                ((t) this.b).q(false);
                break;
            case 3:
                ((n0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public void k(p4.v vVar) {
        f0 f0Var;
        int i10 = this.a;
        g.t tVar = this.b;
        switch (i10) {
            case 1:
                t tVar2 = (t) tVar;
                SeekBar seekBar = (SeekBar) tVar2.h0.get(vVar);
                int i11 = vVar.p;
                int i12 = t.F0;
                if (seekBar != null && tVar2.c0 != vVar) {
                    seekBar.setProgress(i11);
                    break;
                }
                break;
            case 3:
                int i13 = n0.j0;
                n0 n0Var = (n0) tVar;
                if (n0Var.M != vVar && (f0Var = (f0) n0Var.L.get(vVar.c)) != null) {
                    int i14 = f0Var.v.p;
                    f0Var.u(i14 == 0);
                    f0Var.x.setProgress(i14);
                    break;
                }
                break;
        }
    }
}
