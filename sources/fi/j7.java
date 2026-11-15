package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j7 {
    public final int a;
    public final ut b;
    public final i10 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.x4 f;
    public final org.telegram.ui.Components.x4 g;
    public boolean h;
    public cp i;
    public int j;

    public j7(View view) {
        ut utVar = new ut(1, view);
        this.a = m10.t0;
        this.b = utVar;
        er erVar = er.h;
        this.f = new org.telegram.ui.Components.x4(utVar, 350L, erVar);
        this.g = new org.telegram.ui.Components.x4(utVar, 350L, erVar);
        i10 i10Var = new i10();
        this.c = i10Var;
        i10Var.a = true;
        i10Var.b = true;
        b(false);
        i10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        i10Var.c.setStyle(Paint.Style.STROKE);
        i10Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.j;
        int i10 = org.telegram.ui.ActionBar.q6.b;
        org.telegram.ui.Components.x4 x4Var = this.g;
        org.telegram.ui.Components.x4 x4Var2 = this.f;
        if (i7 != i10) {
            this.j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zk, false);
                } else {
                    cp cpVar = this.i;
                    if (cpVar != null) {
                        m10 = cpVar.m(org.telegram.ui.ActionBar.j6.I.q());
                        n10 = this.i.n(org.telegram.ui.ActionBar.j6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    x4Var2.a(m10, true);
                    x4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = x4Var2.a(this.d, false);
        int a11 = x4Var.a(this.e, false);
        i10 i10Var = this.c;
        i10Var.d(a10, a11, 0, 0);
        i10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return i10Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.q6.b;
        d(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yk, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zk, false), z10);
    }

    public final void c(cp cpVar, boolean z10) {
        this.i = cpVar;
        this.j = org.telegram.ui.ActionBar.q6.b;
        if (cpVar == null) {
            b(z10);
        } else {
            this.h = false;
            d(cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), cpVar.n(org.telegram.ui.ActionBar.j6.I.q()), z10);
        }
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.e = i10;
        if (!z10) {
            this.f.a(i7, true);
            this.g.a(i10, true);
        }
        ut utVar = this.b;
        if (utVar != null) {
            utVar.run();
        }
    }
}
