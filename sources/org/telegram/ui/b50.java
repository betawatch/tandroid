package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b50 {
    public final org.telegram.ui.Components.zz0 d;
    public final org.telegram.ui.Components.zz0 e;
    public final org.telegram.ui.Components.zz0 f;
    public cg.h0 g;
    public int j;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final d50[] c = new d50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.d6 i = new org.telegram.ui.Components.d6(new q00(this, 7), 320, org.telegram.ui.Components.jr.h, 0);
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public b50() {
        int i10 = 0;
        while (true) {
            d50[] d50VarArr = this.c;
            if (i10 >= d50VarArr.length) {
                this.a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.tg, false));
                this.d = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                zz0Var.n(99);
                zz0Var.q(AndroidUtilities.dp(200.0f));
                zz0Var.m(AndroidUtilities.dp(2.66f));
                this.e = zz0Var;
                this.f = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            d50VarArr[i10] = new d50(i10);
            i10++;
        }
    }

    public final boolean a(Canvas canvas, float f9, float f10) {
        canvas.save();
        org.telegram.ui.Components.zz0 zz0Var = this.d;
        zz0Var.p = f9 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.tg, false));
        Paint paint = this.a;
        paint.setColor(d);
        float e10 = this.i.e(this.h);
        float l10 = zz0Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float dp = AndroidUtilities.dp(28.0f);
        float dp2 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp2, f10);
        float lerp2 = AndroidUtilities.lerp(dp, j10, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f9 - lerp) / 2.0f, 0.0f, (f9 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp3 = AndroidUtilities.dp(18.0f);
        int dp4 = AndroidUtilities.dp(30.0f);
        int i10 = dp3 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        float dp5 = AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f11 = dp3 / 2.0f;
        float f12 = centerY;
        float f13 = centerY2;
        RectF rectF2 = this.k;
        rectF2.set(dp5 - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f11, f13);
        float f14 = f9 / 2.0f;
        float f15 = f14 - (r3 * 2);
        float dp6 = (int) ((dp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp6) + f15);
        float f17 = dp4 / 2.0f;
        float dp7 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17);
        RectF rectF3 = this.l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, dp7);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        d50[] d50VarArr = this.c;
        boolean b10 = d50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp6) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (d50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.zz0 zz0Var2 = this.d;
        zz0Var2.c(f14 - (zz0Var2.l() / 2.0f), dp / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e10) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp6 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (d50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp6 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = d50VarArr[3].b(canvas, rectF3, f10) ? true : z10;
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp2 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f.c(rectF.centerX() - (this.f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        this.h = strArr == null;
        for (int i10 = 0; i10 < 4; i10++) {
            d50 d50Var = this.c[i10];
            String str = strArr == null ? null : strArr[i10];
            c50 c50Var = d50Var.k;
            boolean z10 = d50Var.f;
            d50Var.f = str != null;
            if (str != null && (d50Var.d == null || !TextUtils.equals(d50Var.l, str))) {
                org.telegram.ui.Components.p5 p5Var = d50Var.d;
                if (p5Var != null) {
                    p5Var.p(c50Var);
                }
                d50Var.c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5();
                p5Var2.l = 1.0f;
                p5Var2.n = null;
                p5Var2.o = null;
                p5Var2.g = 21;
                p5Var2.h = productionAccount;
                p5Var2.y();
                org.telegram.ui.Components.p5.x();
                d50Var.d = p5Var2;
                d50Var.l = str;
                p5Var2.r(str);
                d50Var.c();
                if (d50Var.j) {
                    d50Var.d.b(c50Var);
                }
            }
            if (d50Var.f && !z10) {
                d50Var.e = false;
            }
        }
        cg.h0 h0Var = this.g;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
