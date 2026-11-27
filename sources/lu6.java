// default package

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lu6 extends ew6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ep b;

    public /* synthetic */ lu6(ep epVar, byte b) {
        this.a = b;
        this.b = epVar;
    }

    @Override // ew6
    public final void d(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).f();
                break;
            case 2:
                ((lv6) epVar).e();
                break;
            case 3:
                ((wv6) epVar).n();
                break;
        }
    }

    @Override // ew6
    public final void e(jw6 jw6Var) {
        v34 b;
        yv6 yv6Var;
        byte b2 = this.a;
        ep epVar = this.b;
        switch (b2) {
            case 0:
                ((ou6) epVar).f();
                break;
            case 1:
                ((bv6) epVar).q(true);
                break;
            case 2:
                ((lv6) epVar).e();
                break;
            default:
                wv6 wv6Var = (wv6) epVar;
                if (jw6Var == wv6Var.r && jw6.a() != null) {
                    iw6 iw6Var = jw6Var.a;
                    lw6.b();
                    for (jw6 jw6Var2 : DesugarCollections.unmodifiableList(iw6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(wv6Var.r.v).contains(jw6Var2) && (b = wv6Var.r.b(jw6Var2)) != null && (yv6Var = (yv6) b.b) != null && yv6Var.d && !wv6Var.w.contains(jw6Var2)) {
                            wv6Var.o();
                            wv6Var.l();
                            break;
                        }
                    }
                }
                wv6Var.n();
                break;
        }
    }

    @Override // ew6
    public final void f(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).f();
                break;
            case 2:
                ((lv6) epVar).e();
                break;
            case 3:
                ((wv6) epVar).n();
                break;
        }
    }

    @Override // ew6
    public final void g(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).dismiss();
                break;
            case 2:
                ((lv6) epVar).dismiss();
                break;
            case 3:
                wv6 wv6Var = (wv6) epVar;
                wv6Var.r = jw6Var;
                wv6Var.o();
                wv6Var.l();
                break;
        }
    }

    @Override // ew6
    public final void i() {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 1:
                ((bv6) epVar).q(false);
                break;
            case 3:
                ((wv6) epVar).n();
                break;
        }
    }

    @Override // ew6
    public final void k(jw6 jw6Var) {
        ov6 ov6Var;
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 1:
                bv6 bv6Var = (bv6) epVar;
                SeekBar seekBar = (SeekBar) bv6Var.i0.get(jw6Var);
                int i = jw6Var.p;
                short s = bv6.G0;
                if (seekBar != null && bv6Var.d0 != jw6Var) {
                    seekBar.setProgress(i);
                    break;
                }
                break;
            case 3:
                int i2 = wv6.k0;
                wv6 wv6Var = (wv6) epVar;
                if (wv6Var.N != jw6Var && (ov6Var = (ov6) wv6Var.M.get(jw6Var.c)) != null) {
                    int i3 = ov6Var.v.p;
                    ov6Var.u(i3 == 0);
                    ov6Var.x.setProgress(i3);
                    break;
                }
                break;
        }
    }
}
