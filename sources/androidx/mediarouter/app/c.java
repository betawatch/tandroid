package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends p4.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.t b;

    public /* synthetic */ c(g.t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // p4.t
    public void d(p4.w wVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((c0) this.b).e();
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.t
    public final void e(p4.w wVar) {
        k2.m0 b10;
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
                o0 o0Var = (o0) this.b;
                if (wVar == o0Var.r && p4.w.a() != null) {
                    p4.v vVar = wVar.a;
                    vVar.getClass();
                    p4.y.b();
                    for (p4.w wVar2 : DesugarCollections.unmodifiableList(vVar.b)) {
                        if (!DesugarCollections.unmodifiableList(o0Var.r.v).contains(wVar2) && (b10 = o0Var.r.b(wVar2)) != null && (oVar = (p4.o) b10.a) != null && oVar.d && !o0Var.w.contains(wVar2)) {
                            o0Var.o();
                            o0Var.l();
                            break;
                        }
                    }
                }
                o0Var.n();
                break;
        }
    }

    @Override // p4.t
    public void f(p4.w wVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((c0) this.b).e();
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.t
    public void g(p4.w wVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).dismiss();
                break;
            case 2:
                ((c0) this.b).dismiss();
                break;
            case 3:
                o0 o0Var = (o0) this.b;
                o0Var.r = wVar;
                o0Var.o();
                o0Var.l();
                break;
        }
    }

    @Override // p4.t
    public void i() {
        switch (this.a) {
            case 1:
                ((t) this.b).q(false);
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.t
    public void k(p4.w wVar) {
        f0 f0Var;
        int i10 = this.a;
        g.t tVar = this.b;
        switch (i10) {
            case 1:
                t tVar2 = (t) tVar;
                SeekBar seekBar = (SeekBar) tVar2.h0.get(wVar);
                int i11 = wVar.p;
                int i12 = t.F0;
                if (seekBar != null && tVar2.c0 != wVar) {
                    seekBar.setProgress(i11);
                    break;
                }
                break;
            case 3:
                int i13 = o0.j0;
                o0 o0Var = (o0) tVar;
                if (o0Var.M != wVar && (f0Var = (f0) o0Var.L.get(wVar.c)) != null) {
                    int i14 = f0Var.v.p;
                    f0Var.u(i14 == 0);
                    f0Var.x.setProgress(i14);
                    break;
                }
                break;
        }
    }
}
