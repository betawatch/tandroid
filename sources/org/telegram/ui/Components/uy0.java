package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uy0 {
    public final int a;
    public final org.telegram.ui.Cells.w0 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final kj0 d;
    public TL_account.TL_birthday e;
    public w01 f;
    public w01[] g;
    public w01[] h;
    public boolean i;
    public w01 j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final yc m;

    public uy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i10;
        this.b = w0Var;
        this.c = f6Var;
        kj0 kj0Var = new kj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = kj0Var;
        kj0Var.H(false);
        this.m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.b;
        int width = (w0Var.getWidth() - dp) / 2;
        int dp2 = AndroidUtilities.dp(13.0f) + dp;
        kj0 kj0Var = this.d;
        kj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, dp2);
        kj0Var.draw(canvas);
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
            w01 w01Var = this.g[i12];
            w01Var.c(f10 - (w01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            w01 w01Var2 = this.h[i12];
            w01Var2.c(f10 - (w01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
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
        d5.m(this.b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 11), null, true, false, this.c).a.show();
    }
}
