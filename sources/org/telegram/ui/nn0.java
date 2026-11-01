package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nn0 {
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
    public final /* synthetic */ on0 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public nn0(on0 on0Var) {
        this.r = on0Var;
        this.l = new org.telegram.ui.Components.dc(on0Var);
        this.n = new org.telegram.ui.Components.t5(on0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(org.telegram.messenger.lp lpVar) {
        on0 on0Var = this.r;
        org.telegram.ui.ActionBar.p6 p6Var = on0Var.a;
        if (lpVar == null) {
            return;
        }
        int[] iArr = lpVar.g;
        int[] iArr2 = lpVar.h;
        boolean q6 = p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a();
        int i10 = on0Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (i10 != 1) {
            paint2.setColor(lpVar.e(0, p6Var));
            paint.setColor(lpVar.o(q6) ? lpVar.e(1, p6Var) : lpVar.e(0, p6Var));
            this.f = lpVar.o(q6);
            this.g = false;
            return;
        }
        if (q6 && lpVar.g() != lpVar.f() && lpVar.i() == lpVar.f()) {
            paint2.setColor(lpVar.e(1, p6Var));
            paint.setColor(lpVar.e(0, p6Var));
        } else {
            paint2.setColor(lpVar.e(0, p6Var));
            paint.setColor(lpVar.e(1, p6Var));
        }
        this.c.setColor(lpVar.e(2, p6Var));
        this.f = lpVar.h(q6) != (q6 ? iArr2 : iArr)[0];
        int j10 = lpVar.j(q6);
        if (q6) {
            iArr = iArr2;
        }
        this.g = j10 != iArr[0];
    }
}
