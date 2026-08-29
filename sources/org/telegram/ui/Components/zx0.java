package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zx0 {
    public final int a;
    public final org.telegram.ui.Cells.v0 b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final xi0 d;
    public TL_account.TL_birthday e;
    public zz0 f;
    public zz0[] g;
    public zz0[] h;
    public boolean i;
    public zz0 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final uc m;

    public zx0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = i10;
        this.b = v0Var;
        this.c = c6Var;
        xi0 xi0Var = new xi0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xi0Var;
        xi0Var.F(false);
        this.m = new uc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.b;
        int width = (v0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        xi0 xi0Var = this.d;
        xi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        xi0Var.draw(canvas);
        this.f.c((v0Var.getWidth() - this.f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.g.length; i11++) {
            i10 = (int) (Math.max(this.g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.g.length) {
            float max = Math.max(this.g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f9 = width2;
            float f10 = (max / 2.0f) + f9;
            int i13 = (int) (f9 + max);
            zz0 zz0Var = this.g[i12];
            zz0Var.c(f10 - (zz0Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            zz0 zz0Var2 = this.h[i12];
            zz0Var2.c(f10 - (zz0Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j10;
            canvas.save();
            float l10 = this.j.l() + AndroidUtilities.dp(26.0f);
            float dp4 = AndroidUtilities.dp(30.0f);
            float f11 = dp3;
            RectF rectF = this.k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, f11, (v0Var.getWidth() + l10) / 2.0f, f11 + dp4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp4 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.l);
            this.j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.m(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new y2(this, 11), null, true, false, this.c).a.show();
    }
}
