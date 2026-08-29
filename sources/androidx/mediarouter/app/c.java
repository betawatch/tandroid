package androidx.mediarouter.app;

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends c2.x {
    public final /* synthetic */ int a;
    public final /* synthetic */ g.s b;

    public /* synthetic */ c(g.s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // c2.x
    public void d(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((f) this.b).f();
                break;
            case 2:
                ((b0) this.b).e();
                break;
            case 3:
                ((m0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public final void e(c2.b0 b0Var) {
        za.c b10;
        c2.q qVar;
        switch (this.a) {
            case 0:
                ((f) this.b).f();
                break;
            case 1:
                ((s) this.b).q(true);
                break;
            case 2:
                ((b0) this.b).e();
                break;
            default:
                m0 m0Var = (m0) this.b;
                if (b0Var == m0Var.r && c2.b0.a() != null) {
                    c2.a0 a0Var = b0Var.a;
                    a0Var.getClass();
                    c2.d0.b();
                    for (c2.b0 b0Var2 : DesugarCollections.unmodifiableList(a0Var.b)) {
                        if (!DesugarCollections.unmodifiableList(m0Var.r.v).contains(b0Var2) && (b10 = m0Var.r.b(b0Var2)) != null && (qVar = (c2.q) b10.b) != null && qVar.d && !m0Var.v.contains(b0Var2)) {
                            m0Var.o();
                            m0Var.l();
                            break;
                        }
                    }
                }
                m0Var.n();
                break;
        }
    }

    @Override // c2.x
    public void f(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((f) this.b).f();
                break;
            case 2:
                ((b0) this.b).e();
                break;
            case 3:
                ((m0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public void g(c2.b0 b0Var) {
        switch (this.a) {
            case 0:
                ((f) this.b).dismiss();
                break;
            case 2:
                ((b0) this.b).dismiss();
                break;
            case 3:
                m0 m0Var = (m0) this.b;
                m0Var.r = b0Var;
                m0Var.o();
                m0Var.l();
                break;
        }
    }

    @Override // c2.x
    public void i() {
        switch (this.a) {
            case 1:
                ((s) this.b).q(false);
                break;
            case 3:
                ((m0) this.b).n();
                break;
        }
    }

    @Override // c2.x
    public void k(c2.b0 b0Var) {
        e0 e0Var;
        int i10 = this.a;
        g.s sVar = this.b;
        switch (i10) {
            case 1:
                s sVar2 = (s) sVar;
                SeekBar seekBar = (SeekBar) sVar2.d0.get(b0Var);
                int i11 = b0Var.p;
                int i12 = s.B0;
                if (seekBar != null && sVar2.Y != b0Var) {
                    seekBar.setProgress(i11);
                    break;
                }
                break;
            case 3:
                int i13 = m0.f0;
                m0 m0Var = (m0) sVar;
                if (m0Var.I != b0Var && (e0Var = (e0) m0Var.H.get(b0Var.c)) != null) {
                    int i14 = e0Var.v.p;
                    e0Var.u(i14 == 0);
                    e0Var.x.setProgress(i14);
                    break;
                }
                break;
        }
    }
}
