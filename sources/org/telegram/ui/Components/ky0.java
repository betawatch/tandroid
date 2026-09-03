package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ky0 {
    public final int a;
    public final org.telegram.ui.Cells.v0 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final hj0 d;
    public TL_account.TL_birthday e;
    public k01 f;
    public k01[] g;
    public k01[] h;
    public boolean i;
    public k01 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final rc m;

    public ky0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = i10;
        this.b = v0Var;
        this.c = g6Var;
        hj0 hj0Var = new hj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = hj0Var;
        hj0Var.F(false);
        this.m = new rc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.b;
        int width = (v0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        hj0 hj0Var = this.d;
        hj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        hj0Var.draw(canvas);
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
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            k01 k01Var = this.g[i12];
            k01Var.c(f11 - (k01Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            k01 k01Var2 = this.h[i12];
            k01Var2.c(f11 - (k01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j10;
            canvas.save();
            float l10 = this.j.l() + AndroidUtilities.dp(26.0f);
            float dp4 = AndroidUtilities.dp(30.0f);
            float f12 = dp3;
            RectF rectF = this.k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, f12, (v0Var.getWidth() + l10) / 2.0f, f12 + dp4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f13 = dp4 / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, this.l);
            this.j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        z4.m(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new v2(this, 11), null, true, false, this.c).a.show();
    }
}
