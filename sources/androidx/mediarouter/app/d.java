package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d extends p4.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.u b;

    public /* synthetic */ d(g.u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // p4.s
    public void d(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((h) this.b).f();
                break;
            case 2:
                ((d0) this.b).e();
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public final void e(p4.v vVar) {
        mg.n b10;
        p4.o oVar;
        switch (this.a) {
            case 0:
                ((h) this.b).f();
                break;
            case 1:
                ((u) this.b).q(true);
                break;
            case 2:
                ((d0) this.b).e();
                break;
            default:
                o0 o0Var = (o0) this.b;
                if (vVar == o0Var.r && p4.v.a() != null) {
                    p4.u uVar = vVar.a;
                    uVar.getClass();
                    p4.x.b();
                    for (p4.v vVar2 : DesugarCollections.unmodifiableList(uVar.b)) {
                        if (!DesugarCollections.unmodifiableList(o0Var.r.v).contains(vVar2) && (b10 = o0Var.r.b(vVar2)) != null && (oVar = (p4.o) b10.b) != null && oVar.d && !o0Var.v.contains(vVar2)) {
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

    @Override // p4.s
    public void f(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((h) this.b).f();
                break;
            case 2:
                ((d0) this.b).e();
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public void g(p4.v vVar) {
        switch (this.a) {
            case 0:
                ((h) this.b).dismiss();
                break;
            case 2:
                ((d0) this.b).dismiss();
                break;
            case 3:
                o0 o0Var = (o0) this.b;
                o0Var.r = vVar;
                o0Var.o();
                o0Var.l();
                break;
        }
    }

    @Override // p4.s
    public void i() {
        switch (this.a) {
            case 1:
                ((u) this.b).q(false);
                break;
            case 3:
                ((o0) this.b).n();
                break;
        }
    }

    @Override // p4.s
    public void k(p4.v vVar) {
        g0 g0Var;
        int i10 = this.a;
        g.u uVar = this.b;
        switch (i10) {
            case 1:
                u uVar2 = (u) uVar;
                SeekBar seekBar = (SeekBar) uVar2.h0.get(vVar);
                int i11 = vVar.p;
                int i12 = u.F0;
                if (seekBar != null && uVar2.c0 != vVar) {
                    seekBar.setProgress(i11);
                    break;
                }
                break;
            case 3:
                int i13 = o0.j0;
                o0 o0Var = (o0) uVar;
                if (o0Var.M != vVar && (g0Var = (g0) o0Var.L.get(vVar.c)) != null) {
                    int i14 = g0Var.v.p;
                    g0Var.u(i14 == 0);
                    g0Var.x.setProgress(i14);
                    break;
                }
                break;
        }
    }
}
