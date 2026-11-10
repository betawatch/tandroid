package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gm0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.hc l;
    public boolean m;
    public final org.telegram.ui.Components.v5 n;
    public int o;
    public final /* synthetic */ hm0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public gm0(hm0 hm0Var) {
        this.r = hm0Var;
        this.l = new org.telegram.ui.Components.hc(hm0Var);
        this.n = new org.telegram.ui.Components.v5(hm0Var, 0L, 320L, org.telegram.ui.Components.wq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        hm0 hm0Var = this.r;
        org.telegram.ui.ActionBar.h6 h6Var = hm0Var.a;
        if (fpVar == null) {
            return;
        }
        int[] iArr = fpVar.g;
        int[] iArr2 = fpVar.h;
        boolean q10 = h6Var == null ? org.telegram.ui.ActionBar.m6.I.q() : h6Var.a();
        int i7 = hm0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(fpVar.e(0, h6Var));
            paint.setColor(fpVar.o(q10) ? fpVar.e(1, h6Var) : fpVar.e(0, h6Var));
            this.f = fpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
            paint2.setColor(fpVar.e(1, h6Var));
            paint.setColor(fpVar.e(0, h6Var));
        } else {
            paint2.setColor(fpVar.e(0, h6Var));
            paint.setColor(fpVar.e(1, h6Var));
        }
        this.c.setColor(fpVar.e(2, h6Var));
        this.f = fpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = fpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
