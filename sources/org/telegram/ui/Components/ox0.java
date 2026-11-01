package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ox0 {
    public final int a;
    public final org.telegram.ui.Cells.s0 b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final ci0 d;
    public TL_account.TL_birthday e;
    public rz0 f;
    public rz0[] g;
    public rz0[] h;
    public boolean i;
    public rz0 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final dc m;

    public ox0(int i10, org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = i10;
        this.b = s0Var;
        this.c = p6Var;
        ci0 ci0Var = new ci0(R.raw.cake, org.telegram.messenger.i0.L(66.0f), org.telegram.messenger.i0.L(66.0f), true, null);
        this.d = ci0Var;
        ci0Var.H(false);
        this.m = new dc(s0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(66.0f);
        org.telegram.ui.Cells.s0 s0Var = this.b;
        int width = (s0Var.getWidth() - L) / 2;
        int L2 = org.telegram.messenger.i0.L(13.0f) + L;
        ci0 ci0Var = this.d;
        ci0Var.setBounds(width, org.telegram.messenger.i0.L(13.0f), width + L, L2);
        ci0Var.draw(canvas);
        this.f.c((s0Var.getWidth() - this.f.k()) / 2.0f, org.telegram.messenger.i0.L(19.0f) + L, 1.0f, -1, canvas);
        int i10 = (int) (this.f.i() + org.telegram.messenger.i0.L(19.0f) + L + org.telegram.messenger.i0.L(17.0f));
        int i11 = 0;
        for (int i12 = 0; i12 < this.g.length; i12++) {
            i11 = (int) (Math.max(this.g[i12].k(), this.h[i12].k()) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(9.0f) + i11);
        }
        int width2 = (s0Var.getWidth() - i11) / 2;
        int i13 = 0;
        while (i13 < this.g.length) {
            float max = Math.max(this.g[i13].k(), this.h[i13].k()) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i14 = (int) (f7 + max);
            rz0 rz0Var = this.g[i13];
            rz0Var.c(f10 - (rz0Var.k() / 2.0f), i10, 0.75f, -1, canvas);
            rz0 rz0Var2 = this.h[i13];
            rz0Var2.c(f10 - (rz0Var2.k() / 2.0f), org.telegram.messenger.i0.L(16.0f) + i10, 1.0f, -1, canvas);
            i13++;
            width2 = i14;
        }
        if (this.i) {
            int L3 = org.telegram.messenger.i0.L(38.0f) + i10;
            canvas.save();
            float k10 = this.j.k() + org.telegram.messenger.i0.L(26.0f);
            float L4 = org.telegram.messenger.i0.L(30.0f);
            float f11 = L3;
            RectF rectF = this.k;
            rectF.set((s0Var.getWidth() - k10) / 2.0f, f11, (s0Var.getWidth() + k10) / 2.0f, f11 + L4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = L4 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.l);
            this.j.c(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.z2) s4.l(this.b.getContext(), org.telegram.messenger.dd.L0(2131751673, null), org.telegram.messenger.dd.L0(2131751672, null), this.e, new r2(this, 11), null, true, false, this.c).b).show();
    }
}
