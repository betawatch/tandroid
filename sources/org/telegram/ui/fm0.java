package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fm0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.dc l;
    public boolean m;
    public final org.telegram.ui.Components.u5 n;
    public int o;
    public final /* synthetic */ gm0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public fm0(gm0 gm0Var) {
        this.r = gm0Var;
        this.l = new org.telegram.ui.Components.dc(gm0Var);
        this.n = new org.telegram.ui.Components.u5(gm0Var, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(org.telegram.messenger.cp cpVar) {
        gm0 gm0Var = this.r;
        org.telegram.ui.ActionBar.e6 e6Var = gm0Var.a;
        if (cpVar == null) {
            return;
        }
        int[] iArr = cpVar.g;
        int[] iArr2 = cpVar.h;
        boolean q10 = e6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : e6Var.a();
        int i7 = gm0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(cpVar.e(0, e6Var));
            paint.setColor(cpVar.o(q10) ? cpVar.e(1, e6Var) : cpVar.e(0, e6Var));
            this.f = cpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && cpVar.g() != cpVar.f() && cpVar.i() == cpVar.f()) {
            paint2.setColor(cpVar.e(1, e6Var));
            paint.setColor(cpVar.e(0, e6Var));
        } else {
            paint2.setColor(cpVar.e(0, e6Var));
            paint.setColor(cpVar.e(1, e6Var));
        }
        this.c.setColor(cpVar.e(2, e6Var));
        this.f = cpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = cpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
