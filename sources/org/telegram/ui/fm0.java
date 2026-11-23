package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fm0 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final org.telegram.ui.Components.lc l;
    public boolean m;
    public final org.telegram.ui.Components.c6 n;
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
        this.l = new org.telegram.ui.Components.lc(gm0Var);
        this.n = new org.telegram.ui.Components.c6(gm0Var, 0L, 320L, org.telegram.ui.Components.kr.h);
    }

    public final void a(org.telegram.messenger.bp bpVar) {
        gm0 gm0Var = this.r;
        org.telegram.ui.ActionBar.i6 i6Var = gm0Var.a;
        if (bpVar == null) {
            return;
        }
        int[] iArr = bpVar.g;
        int[] iArr2 = bpVar.h;
        boolean q10 = i6Var == null ? org.telegram.ui.ActionBar.n6.I.q() : i6Var.b();
        int i7 = gm0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i7 != 1) {
            paint2.setColor(bpVar.e(0, i6Var));
            paint.setColor(bpVar.o(q10) ? bpVar.e(1, i6Var) : bpVar.e(0, i6Var));
            this.f = bpVar.o(q10);
            this.g = false;
            return;
        }
        if (q10 && bpVar.g() != bpVar.f() && bpVar.i() == bpVar.f()) {
            paint2.setColor(bpVar.e(1, i6Var));
            paint.setColor(bpVar.e(0, i6Var));
        } else {
            paint2.setColor(bpVar.e(0, i6Var));
            paint.setColor(bpVar.e(1, i6Var));
        }
        this.c.setColor(bpVar.e(2, i6Var));
        this.f = bpVar.h(q10) != (q10 ? iArr2 : iArr)[0];
        int j3 = bpVar.j(q10);
        if (q10) {
            iArr = iArr2;
        }
        this.g = j3 != iArr[0];
    }
}
