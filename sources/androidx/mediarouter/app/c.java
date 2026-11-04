package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends r4.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.u b;

    public /* synthetic */ c(g.u uVar, int i3) {
        this.a = i3;
        this.b = uVar;
    }

    @Override // r4.s
    public void d(r4.w wVar) {
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

    @Override // r4.s
    public final void e(r4.w wVar) {
        y00 b10;
        r4.o oVar;
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
                if (wVar == o0Var.r && r4.w.a() != null) {
                    r4.v vVar = wVar.a;
                    vVar.getClass();
                    r4.y.b();
                    for (r4.w wVar2 : DesugarCollections.unmodifiableList(vVar.b)) {
                        if (!DesugarCollections.unmodifiableList(o0Var.r.v).contains(wVar2) && (b10 = o0Var.r.b(wVar2)) != null && (oVar = (r4.o) b10.a) != null && oVar.d && !o0Var.w.contains(wVar2)) {
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

    @Override // r4.s
    public void f(r4.w wVar) {
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

    @Override // r4.s
    public void g(r4.w wVar) {
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

    @Override // r4.s
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

    @Override // r4.s
    public void k(r4.w wVar) {
        f0 f0Var;
        int i3 = this.a;
        g.u uVar = this.b;
        switch (i3) {
            case 1:
                t tVar = (t) uVar;
                SeekBar seekBar = (SeekBar) tVar.i0.get(wVar);
                int i10 = wVar.p;
                int i11 = t.G0;
                if (seekBar != null && tVar.d0 != wVar) {
                    seekBar.setProgress(i10);
                    break;
                }
                break;
            case 3:
                int i12 = o0.k0;
                o0 o0Var = (o0) uVar;
                if (o0Var.N != wVar && (f0Var = (f0) o0Var.M.get(wVar.c)) != null) {
                    int i13 = f0Var.v.p;
                    f0Var.u(i13 == 0);
                    f0Var.x.setProgress(i13);
                    break;
                }
                break;
        }
    }
}
