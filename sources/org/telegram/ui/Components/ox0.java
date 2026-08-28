package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ox0 {
    public final int a;
    public final org.telegram.ui.Cells.w0 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final mi0 d;
    public TL_account.TL_birthday e;
    public nz0 f;
    public nz0[] g;
    public nz0[] h;
    public boolean i;
    public nz0 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final pc m;

    public ox0(int i9, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = i9;
        this.b = w0Var;
        this.c = b6Var;
        mi0 mi0Var = new mi0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = mi0Var;
        mi0Var.F(false);
        this.m = new pc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.b;
        int width = (w0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        mi0 mi0Var = this.d;
        mi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        mi0Var.draw(canvas);
        this.f.c((w0Var.getWidth() - this.f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i9 = 0;
        for (int i10 = 0; i10 < this.g.length; i10++) {
            i9 = (int) (Math.max(this.g[i10].l(), this.h[i10].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i9);
        }
        int width2 = (w0Var.getWidth() - i9) / 2;
        int i11 = 0;
        while (i11 < this.g.length) {
            float max = Math.max(this.g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i12 = (int) (f10 + max);
            nz0 nz0Var = this.g[i11];
            nz0Var.c(f11 - (nz0Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            nz0 nz0Var2 = this.h[i11];
            nz0Var2.c(f11 - (nz0Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i11++;
            width2 = i12;
        }
        if (this.i) {
            int dp3 = AndroidUtilities.dp(38.0f) + j10;
            canvas.save();
            float l10 = this.j.l() + AndroidUtilities.dp(26.0f);
            float dp4 = AndroidUtilities.dp(30.0f);
            float f12 = dp3;
            RectF rectF = this.k;
            rectF.set((w0Var.getWidth() - l10) / 2.0f, f12, (w0Var.getWidth() + l10) / 2.0f, f12 + dp4);
            float a2 = this.m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f13 = dp4 / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, this.l);
            this.j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        y4.m(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new v2(this, 11), null, true, false, this.c).a.show();
    }
}
