package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iy0 {
    public final int a;
    public final org.telegram.ui.Cells.w0 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final yi0 d;
    public TL_account.TL_birthday e;
    public h01 f;
    public h01[] g;
    public h01[] h;
    public boolean i;
    public h01 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final wc m;

    public iy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i10;
        this.b = w0Var;
        this.c = f6Var;
        yi0 yi0Var = new yi0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = yi0Var;
        yi0Var.H(false);
        this.m = new wc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.b;
        int width = (w0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        yi0 yi0Var = this.d;
        yi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        yi0Var.draw(canvas);
        this.f.c((w0Var.getWidth() - this.f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.g.length; i11++) {
            i10 = (int) (Math.max(this.g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.g.length) {
            float max = Math.max(this.g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            h01 h01Var = this.g[i12];
            h01Var.c(f10 - (h01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            h01 h01Var2 = this.h[i12];
            h01Var2.c(f10 - (h01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j3;
            canvas.save();
            float l4 = this.j.l() + AndroidUtilities.dp(26.0f);
            float dp4 = AndroidUtilities.dp(30.0f);
            float f11 = dp3;
            RectF rectF = this.k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, f11, (w0Var.getWidth() + l4) / 2.0f, f11 + dp4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp4 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.l);
            this.j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.m(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 11), null, true, false, this.c).a.show();
    }
}
