package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fm0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.ic l;
    public boolean m;
    public final org.telegram.ui.Components.w5 n;
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
        this.l = new org.telegram.ui.Components.ic(gm0Var);
        this.n = new org.telegram.ui.Components.w5(gm0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        gm0 gm0Var = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = gm0Var.a;
        if (fpVar == null) {
            return;
        }
        int[] iArr = fpVar.g;
        int[] iArr2 = fpVar.h;
        boolean q10 = g6Var == null ? org.telegram.ui.ActionBar.l6.I.q() : g6Var.a();
        int i7 = gm0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(fpVar.e(0, g6Var));
            paint.setColor(fpVar.o(q10) ? fpVar.e(1, g6Var) : fpVar.e(0, g6Var));
            this.f = fpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
            paint2.setColor(fpVar.e(1, g6Var));
            paint.setColor(fpVar.e(0, g6Var));
        } else {
            paint2.setColor(fpVar.e(0, g6Var));
            paint.setColor(fpVar.e(1, g6Var));
        }
        this.c.setColor(fpVar.e(2, g6Var));
        this.f = fpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = fpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
