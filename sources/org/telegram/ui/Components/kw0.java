package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kw0 {
    public final int a;
    public final org.telegram.ui.Cells.t0 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final ah0 d;
    public TL_account.TL_birthday e;
    public ny0 f;
    public ny0[] g;
    public ny0[] h;
    public boolean i;
    public ny0 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final ic m;

    public kw0(int i7, org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = i7;
        this.b = t0Var;
        this.c = g6Var;
        ah0 ah0Var = new ah0(R.raw.cake, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = ah0Var;
        ah0Var.H(false);
        this.m = new ic(t0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.t0 t0Var = this.b;
        int width = (t0Var.getWidth() - L) / 2;
        int L2 = org.telegram.messenger.g0.L(13.0f) + L;
        ah0 ah0Var = this.d;
        ah0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, L2);
        ah0Var.draw(canvas);
        this.f.c((t0Var.getWidth() - this.f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.g.length; i11++) {
            i10 = (int) (Math.max(this.g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (t0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.g.length) {
            float max = Math.max(this.g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            ny0 ny0Var = this.g[i12];
            ny0Var.c(f11 - (ny0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            ny0 ny0Var2 = this.h[i12];
            ny0Var2.c(f11 - (ny0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            canvas.save();
            float k10 = this.j.k() + org.telegram.messenger.g0.L(26.0f);
            float L4 = org.telegram.messenger.g0.L(30.0f);
            float f12 = L3;
            RectF rectF = this.k;
            rectF.set((t0Var.getWidth() - k10) / 2.0f, f12, (t0Var.getWidth() + k10) / 2.0f, f12 + L4);
            float a10 = this.m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f13 = L4 / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, this.l);
            this.j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.v2) v4.l(this.b.getContext(), org.telegram.messenger.id.M0(2131751672, null), org.telegram.messenger.id.M0(2131751671, null), this.e, new s2(this, 11), null, true, false, this.c).b).show();
    }
}
