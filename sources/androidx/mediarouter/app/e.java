package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends c2.x {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.s b;

    public /* synthetic */ e(g.s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // c2.x
    public void d(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((i) this.b).f();
                break;
            case 2:
                ((e0) this.b).e();
                break;
            case 3:
                ((p0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public final void e(c2.b0 b0Var) {
        bb.b b10;
        c2.q qVar;
        switch (this.a) {
            case 0:
                ((i) this.b).f();
                break;
            case 1:
                ((v) this.b).q(true);
                break;
            case 2:
                ((e0) this.b).e();
                break;
            default:
                p0 p0Var = (p0) this.b;
                if (b0Var == p0Var.r && c2.b0.a() != null) {
                    c2.a0 a0Var = b0Var.a;
                    a0Var.getClass();
                    c2.d0.b();
                    for (c2.b0 b0Var2 : DesugarCollections.unmodifiableList(a0Var.b)) {
                        if (!DesugarCollections.unmodifiableList(p0Var.r.v).contains(b0Var2) && (b10 = p0Var.r.b(b0Var2)) != null && (qVar = (c2.q) b10.b) != null && qVar.d && !p0Var.v.contains(b0Var2)) {
                            p0Var.o();
                            p0Var.l();
                            break;
                        }
                    }
                }
                p0Var.n();
                break;
        }
    }

    @Override // c2.x
    public void f(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((i) this.b).f();
                break;
            case 2:
                ((e0) this.b).e();
                break;
            case 3:
                ((p0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public void g(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((i) this.b).dismiss();
                break;
            case 2:
                ((e0) this.b).dismiss();
                break;
            case 3:
                p0 p0Var = (p0) this.b;
                p0Var.r = b0Var;
                p0Var.o();
                p0Var.l();
                break;
        }
    }

    @Override // c2.x
    public void i() {
        switch (this.a) {
            case 1:
                ((v) this.b).q(false);
                break;
            case 3:
                ((p0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public void k(c2.b0 b0Var) {
        h0 h0Var;
        int i10 = this.a;
        g.s sVar = this.b;
        switch (i10) {
            case 1:
                v vVar = (v) sVar;
                SeekBar seekBar = (SeekBar) vVar.e0.get(b0Var);
                int i11 = b0Var.p;
                int i12 = v.C0;
                if (seekBar != null && vVar.Z != b0Var) {
                    seekBar.setProgress(i11);
                    break;
                }
                break;
            case 3:
                int i13 = p0.g0;
                p0 p0Var = (p0) sVar;
                if (p0Var.J != b0Var && (h0Var = (h0) p0Var.I.get(b0Var.c)) != null) {
                    int i14 = h0Var.v.p;
                    h0Var.u(i14 == 0);
                    h0Var.x.setProgress(i14);
                    break;
                }
                break;
        }
    }
}
