package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends s4.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.u b;

    public /* synthetic */ c(g.u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // s4.s
    public void d(s4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((b0) this.b).e();
                break;
            case 3:
                ((n0) this.b).n();
                break;
        }
    }

    @Override // s4.s
    public final void e(s4.v vVar) {
        org.telegram.ui.Components.n b10;
        s4.o oVar;
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 1:
                ((t) this.b).q(true);
                break;
            case 2:
                ((b0) this.b).e();
                break;
            default:
                n0 n0Var = (n0) this.b;
                if (vVar == n0Var.r && s4.v.a() != null) {
                    s4.u uVar = vVar.a;
                    uVar.getClass();
                    s4.x.b();
                    for (s4.v vVar2 : DesugarCollections.unmodifiableList(uVar.b)) {
                        if (!DesugarCollections.unmodifiableList(n0Var.r.v).contains(vVar2) && (b10 = n0Var.r.b(vVar2)) != null && (oVar = (s4.o) b10.a) != null && oVar.d && !n0Var.w.contains(vVar2)) {
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

    @Override // s4.s
    public void f(s4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).f();
                break;
            case 2:
                ((b0) this.b).e();
                break;
            case 3:
                ((n0) this.b).n();
                break;
        }
    }

    @Override // s4.s
    public void g(s4.v vVar) {
        switch (this.a) {
            case 0:
                ((g) this.b).dismiss();
                break;
            case 2:
                ((b0) this.b).dismiss();
                break;
            case 3:
                n0 n0Var = (n0) this.b;
                n0Var.r = vVar;
                n0Var.o();
                n0Var.l();
                break;
        }
    }

    @Override // s4.s
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

    @Override // s4.s
    public void k(s4.v vVar) {
        e0 e0Var;
        int i7 = this.a;
        g.u uVar = this.b;
        switch (i7) {
            case 1:
                t tVar = (t) uVar;
                SeekBar seekBar = (SeekBar) tVar.h0.get(vVar);
                int i10 = vVar.p;
                int i11 = t.F0;
                if (seekBar != null && tVar.c0 != vVar) {
                    seekBar.setProgress(i10);
                    break;
                }
                break;
            case 3:
                int i12 = n0.j0;
                n0 n0Var = (n0) uVar;
                if (n0Var.M != vVar && (e0Var = (e0) n0Var.L.get(vVar.c)) != null) {
                    int i13 = e0Var.v.p;
                    e0Var.u(i13 == 0);
                    e0Var.x.setProgress(i13);
                    break;
                }
                break;
        }
    }
}
