package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.i10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g7 {
    public final int a;
    public final zt b;
    public final q10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.f5 f;
    public final org.telegram.ui.Components.f5 g;
    public boolean h;
    public bp i;
    public int j;

    public g7(View view) {
        zt ztVar = new zt(1, view);
        this.a = i10.t0;
        this.b = ztVar;
        kr krVar = kr.h;
        this.f = new org.telegram.ui.Components.f5(ztVar, 350L, krVar);
        this.g = new org.telegram.ui.Components.f5(ztVar, 350L, krVar);
        q10 q10Var = new q10();
        this.c = q10Var;
        q10Var.a = true;
        q10Var.b = true;
        b(false);
        q10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        q10Var.c.setStyle(Paint.Style.STROKE);
        q10Var.c.setStrokeCap(Paint.Cap.ROUND);
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
        q10 q10Var = this.c;
        q10Var.d(a10, a11, 0, 0);
        q10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q10Var.c;
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
