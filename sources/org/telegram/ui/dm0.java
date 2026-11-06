package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dm0 {
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
    public final /* synthetic */ em0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public dm0(em0 em0Var) {
        this.r = em0Var;
        this.l = new org.telegram.ui.Components.ic(em0Var);
        this.n = new org.telegram.ui.Components.w5(em0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        em0 em0Var = this.r;
        org.telegram.ui.ActionBar.f6 f6Var = em0Var.a;
        if (fpVar == null) {
            return;
        }
        int[] iArr = fpVar.g;
        int[] iArr2 = fpVar.h;
        boolean q10 = f6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : f6Var.a();
        int i7 = em0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(fpVar.e(0, f6Var));
            paint.setColor(fpVar.o(q10) ? fpVar.e(1, f6Var) : fpVar.e(0, f6Var));
            this.f = fpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
            paint2.setColor(fpVar.e(1, f6Var));
            paint.setColor(fpVar.e(0, f6Var));
        } else {
            paint2.setColor(fpVar.e(0, f6Var));
            paint.setColor(fpVar.e(1, f6Var));
        }
        this.c.setColor(fpVar.e(2, f6Var));
        this.f = fpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = fpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
