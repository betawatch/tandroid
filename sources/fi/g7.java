package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g7 {
    public final int a;
    public final zt b;
    public final p10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.f5 f;
    public final org.telegram.ui.Components.f5 g;
    public boolean h;
    public bp i;
    public int j;

    public g7(View view) {
        zt ztVar = new zt(1, view);
        this.a = j10.t0;
        this.b = ztVar;
        lr lrVar = lr.h;
        this.f = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        this.g = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        p10 p10Var = new p10();
        this.c = p10Var;
        p10Var.a = true;
        p10Var.b = true;
        b(false);
        p10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        p10Var.c.setStyle(Paint.Style.STROKE);
        p10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.j;
        int i10 = org.telegram.ui.ActionBar.u6.b;
        org.telegram.ui.Components.f5 f5Var = this.g;
        org.telegram.ui.Components.f5 f5Var2 = this.f;
        if (i7 != i10) {
            this.j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false);
                } else {
                    bp bpVar = this.i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.n6.I.q());
                        n10 = this.i.n(org.telegram.ui.ActionBar.n6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    f5Var2.a(m10, true);
                    f5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = f5Var2.a(this.d, false);
        int a11 = f5Var.a(this.e, false);
        p10 p10Var = this.c;
        p10Var.d(a10, a11, 0, 0);
        p10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p10Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.u6.b;
        d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.i = bpVar;
        this.j = org.telegram.ui.ActionBar.u6.b;
        if (bpVar == null) {
            b(z10);
        } else {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), bpVar.n(org.telegram.ui.ActionBar.n6.I.q()), z10);
        }
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.e = i10;
        if (!z10) {
            this.f.a(i7, true);
            this.g.a(i10, true);
        }
        zt ztVar = this.b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
