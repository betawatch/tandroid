package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pn0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.dc l;
    public boolean m;
    public final org.telegram.ui.Components.t5 n;
    public int o;
    public final /* synthetic */ qn0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public pn0(qn0 qn0Var) {
        this.r = qn0Var;
        this.l = new org.telegram.ui.Components.dc(qn0Var);
        this.n = new org.telegram.ui.Components.t5(qn0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(org.telegram.messenger.kp kpVar) {
        qn0 qn0Var = this.r;
        org.telegram.ui.ActionBar.p6 p6Var = qn0Var.a;
        if (kpVar == null) {
            return;
        }
        int[] iArr = kpVar.g;
        int[] iArr2 = kpVar.h;
        boolean q6 = p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a();
        int i10 = qn0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(kpVar.e(0, p6Var));
            paint.setColor(kpVar.o(q6) ? kpVar.e(1, p6Var) : kpVar.e(0, p6Var));
            this.f = kpVar.o(q6);
            this.g = false;
            return;
        }
        if (q6 && kpVar.g() != kpVar.f() && kpVar.i() == kpVar.f()) {
            paint2.setColor(kpVar.e(1, p6Var));
            paint.setColor(kpVar.e(0, p6Var));
        } else {
            paint2.setColor(kpVar.e(0, p6Var));
            paint.setColor(kpVar.e(1, p6Var));
        }
        this.c.setColor(kpVar.e(2, p6Var));
        this.f = kpVar.h(q6) != (q6 ? iArr2 : iArr)[0];
        int j10 = kpVar.j(q6);
        if (q6) {
            iArr = iArr2;
        }
        this.g = j10 != iArr[0];
    }
}
