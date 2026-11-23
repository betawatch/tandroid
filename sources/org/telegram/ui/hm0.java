package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hm0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.mc l;
    public boolean m;
    public final org.telegram.ui.Components.d6 n;
    public int o;
    public final /* synthetic */ im0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public hm0(im0 im0Var) {
        this.r = im0Var;
        this.l = new org.telegram.ui.Components.mc(im0Var);
        this.n = new org.telegram.ui.Components.d6(im0Var, 0L, 320L, org.telegram.ui.Components.nr.h);
    }

    public final void a(org.telegram.messenger.cp cpVar) {
        im0 im0Var = this.r;
        org.telegram.ui.ActionBar.h6 h6Var = im0Var.a;
        if (cpVar == null) {
            return;
        }
        int[] iArr = cpVar.g;
        int[] iArr2 = cpVar.h;
        boolean q10 = h6Var == null ? org.telegram.ui.ActionBar.m6.I.q() : h6Var.d();
        int i7 = im0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(cpVar.e(0, h6Var));
            paint.setColor(cpVar.o(q10) ? cpVar.e(1, h6Var) : cpVar.e(0, h6Var));
            this.f = cpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && cpVar.g() != cpVar.f() && cpVar.i() == cpVar.f()) {
            paint2.setColor(cpVar.e(1, h6Var));
            paint.setColor(cpVar.e(0, h6Var));
        } else {
            paint2.setColor(cpVar.e(0, h6Var));
            paint.setColor(cpVar.e(1, h6Var));
        }
        this.c.setColor(cpVar.e(2, h6Var));
        this.f = cpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = cpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
