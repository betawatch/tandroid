package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class g7 {
    public final int a;
    public final bu b;
    public final s10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.g5 f;
    public final org.telegram.ui.Components.g5 g;
    public boolean h;
    public bp i;
    public int j;

    public g7(View view) {
        bu buVar = new bu(1, view);
        this.a = j10.t0;
        this.b = buVar;
        nr nrVar = nr.h;
        this.f = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        this.g = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        s10 s10Var = new s10();
        this.c = s10Var;
        s10Var.a = true;
        s10Var.b = true;
        b(false);
        s10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        s10Var.c.setStyle(Paint.Style.STROKE);
        s10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.j;
        int i10 = org.telegram.ui.ActionBar.t6.b;
        org.telegram.ui.Components.g5 g5Var = this.g;
        org.telegram.ui.Components.g5 g5Var2 = this.f;
        if (i7 != i10) {
            this.j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false);
                } else {
                    bp bpVar = this.i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.m6.I.q());
                        n10 = this.i.n(org.telegram.ui.ActionBar.m6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    g5Var2.a(m10, true);
                    g5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = g5Var2.a(this.d, false);
        int a11 = g5Var.a(this.e, false);
        s10 s10Var = this.c;
        s10Var.d(a10, a11, 0, 0);
        s10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s10Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.t6.b;
        d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.i = bpVar;
        this.j = org.telegram.ui.ActionBar.t6.b;
        if (bpVar == null) {
            b(z10);
        } else {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.m6.I.q()), bpVar.n(org.telegram.ui.ActionBar.m6.I.q()), z10);
        }
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.e = i10;
        if (!z10) {
            this.f.a(i7, true);
            this.g.a(i10, true);
        }
        bu buVar = this.b;
        if (buVar != null) {
            buVar.run();
        }
    }
}
