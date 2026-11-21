package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    public final void a(org.telegram.messenger.bp bpVar) {
        im0 im0Var = this.r;
        org.telegram.ui.ActionBar.h6 h6Var = im0Var.a;
        if (bpVar == null) {
            return;
        }
        int[] iArr = bpVar.g;
        int[] iArr2 = bpVar.h;
        boolean q10 = h6Var == null ? org.telegram.ui.ActionBar.m6.I.q() : h6Var.d();
        int i7 = im0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(bpVar.e(0, h6Var));
            paint.setColor(bpVar.o(q10) ? bpVar.e(1, h6Var) : bpVar.e(0, h6Var));
            this.f = bpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && bpVar.g() != bpVar.f() && bpVar.i() == bpVar.f()) {
            paint2.setColor(bpVar.e(1, h6Var));
            paint.setColor(bpVar.e(0, h6Var));
        } else {
            paint2.setColor(bpVar.e(0, h6Var));
            paint.setColor(bpVar.e(1, h6Var));
        }
        this.c.setColor(bpVar.e(2, h6Var));
        this.f = bpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = bpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
