package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.fp;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p7 {
    public final int a;
    public final ot b;
    public final f10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.z4 f;
    public final org.telegram.ui.Components.z4 g;
    public boolean h;
    public fp i;
    public int j;

    public p7(View view) {
        ot otVar = new ot(1, view);
        this.a = p10.s0;
        this.b = otVar;
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.z4(otVar, 350L, xqVar);
        this.g = new org.telegram.ui.Components.z4(otVar, 350L, xqVar);
        f10 f10Var = new f10();
        this.c = f10Var;
        f10Var.a = true;
        f10Var.b = true;
        b(false);
        f10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        f10Var.c.setStyle(Paint.Style.STROKE);
        f10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.j;
        int i10 = org.telegram.ui.ActionBar.r6.b;
        org.telegram.ui.Components.z4 z4Var = this.g;
        org.telegram.ui.Components.z4 z4Var2 = this.f;
        if (i7 != i10) {
            this.j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false);
                } else {
                    fp fpVar = this.i;
                    if (fpVar != null) {
                        m10 = fpVar.m(org.telegram.ui.ActionBar.k6.I.q());
                        n10 = this.i.n(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    z4Var2.a(m10, true);
                    z4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = z4Var2.a(this.d, false);
        int a11 = z4Var.a(this.e, false);
        f10 f10Var = this.c;
        f10Var.d(a10, a11, 0, 0);
        f10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return f10Var.c;
    }

    public final void b(boolean z9) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.r6.b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), z9);
    }

    public final void c(fp fpVar, boolean z9) {
        this.i = fpVar;
        this.j = org.telegram.ui.ActionBar.r6.b;
        if (fpVar == null) {
            b(z9);
        } else {
            this.h = false;
            d(fpVar.m(org.telegram.ui.ActionBar.k6.I.q()), fpVar.n(org.telegram.ui.ActionBar.k6.I.q()), z9);
        }
    }

    public final void d(int i7, int i10, boolean z9) {
        this.d = i7;
        this.e = i10;
        if (!z9) {
            this.f.a(i7, true);
            this.g.a(i10, true);
        }
        ot otVar = this.b;
        if (otVar != null) {
            otVar.run();
        }
    }
}
