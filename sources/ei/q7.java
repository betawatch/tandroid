package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.wo;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q7 {
    public final int a;
    public final nt b;
    public final b10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.x4 f;
    public final org.telegram.ui.Components.x4 g;
    public boolean h;
    public wo i;
    public int j;

    public q7(View view) {
        nt ntVar = new nt(1, view);
        this.a = h10.t0;
        this.b = ntVar;
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.x4(ntVar, 350L, xqVar);
        this.g = new org.telegram.ui.Components.x4(ntVar, 350L, xqVar);
        b10 b10Var = new b10();
        this.c = b10Var;
        b10Var.a = true;
        b10Var.b = true;
        b(false);
        b10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        b10Var.c.setStyle(Paint.Style.STROKE);
        b10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n4;
        int i3 = this.j;
        int i10 = org.telegram.ui.ActionBar.r6.b;
        org.telegram.ui.Components.x4 x4Var = this.g;
        org.telegram.ui.Components.x4 x4Var2 = this.f;
        if (i3 != i10) {
            this.j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false);
                    n4 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false);
                } else {
                    wo woVar = this.i;
                    if (woVar != null) {
                        m10 = woVar.m(org.telegram.ui.ActionBar.k6.I.q());
                        n4 = this.i.n(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (m10 != this.d || n4 != this.e) {
                    this.d = m10;
                    this.e = n4;
                    x4Var2.a(m10, true);
                    x4Var.a(n4, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = x4Var2.a(this.d, false);
        int a11 = x4Var.a(this.e, false);
        b10 b10Var = this.c;
        b10Var.d(a10, a11, 0, 0);
        b10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return b10Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.r6.b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), z10);
    }

    public final void c(wo woVar, boolean z10) {
        this.i = woVar;
        this.j = org.telegram.ui.ActionBar.r6.b;
        if (woVar == null) {
            b(z10);
        } else {
            this.h = false;
            d(woVar.m(org.telegram.ui.ActionBar.k6.I.q()), woVar.n(org.telegram.ui.ActionBar.k6.I.q()), z10);
        }
    }

    public final void d(int i3, int i10, boolean z10) {
        this.d = i3;
        this.e = i10;
        if (!z10) {
            this.f.a(i3, true);
            this.g.a(i10, true);
        }
        nt ntVar = this.b;
        if (ntVar != null) {
            ntVar.run();
        }
    }
}
