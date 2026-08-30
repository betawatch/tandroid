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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n50 {
    public final org.telegram.ui.Components.k01 d;
    public final org.telegram.ui.Components.k01 e;
    public final org.telegram.ui.Components.k01 f;
    public eg.h0 g;
    public int j;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final p50[] c = new p50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.z5 i = new org.telegram.ui.Components.z5(new c10(this, 7), 320, org.telegram.ui.Components.nr.h, 0);
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public n50() {
        int i10 = 0;
        while (true) {
            p50[] p50VarArr = this.c;
            if (i10 >= p50VarArr.length) {
                this.a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
                this.d = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.k01 k01Var = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                k01Var.n(99);
                k01Var.q(AndroidUtilities.dp(200.0f));
                k01Var.m(AndroidUtilities.dp(2.66f));
                this.e = k01Var;
                this.f = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            p50VarArr[i10] = new p50(i10);
            i10++;
        }
    }

    public final boolean a(Canvas canvas, float f10, float f11) {
        canvas.save();
        org.telegram.ui.Components.k01 k01Var = this.d;
        k01Var.p = f10 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f11, this.j, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
        Paint paint = this.a;
        paint.setColor(d);
        float e = this.i.e(this.h);
        float l10 = k01Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float dp = AndroidUtilities.dp(28.0f);
        float dp2 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp2, f11);
        float lerp2 = AndroidUtilities.lerp(dp, j10, f11);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f11);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f10 - lerp) / 2.0f, 0.0f, (f10 + lerp) / 2.0f, lerp2);
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
        float f12 = dp3 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        RectF rectF2 = this.k;
        rectF2.set(dp5 - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (r3 * 2);
        float dp6 = (int) ((dp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp6) + f16);
        float f18 = dp4 / 2.0f;
        float dp7 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18);
        RectF rectF3 = this.l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, dp7);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        p50[] p50VarArr = this.c;
        boolean b10 = p50VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp6) + f16);
        boolean z4 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (p50VarArr[1].b(canvas, rectF3, f11)) {
            z4 = true;
        }
        org.telegram.ui.Components.k01 k01Var2 = this.d;
        k01Var2.c(f15 - (k01Var2.l() / 2.0f), dp / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f11), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp6 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (p50VarArr[2].b(canvas, rectF3, f11)) {
            z4 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp6 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        boolean z10 = p50VarArr[3].b(canvas, rectF3, f11) ? true : z4;
        if (f11 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp2 / 2.0f)), AndroidUtilities.dp(54.0f), f11, -1, canvas);
            Paint paint2 = this.b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f.c(rectF.centerX() - (this.f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z10;
    }

    public final void b(String[] strArr) {
        this.h = strArr == null;
        for (int i10 = 0; i10 < 4; i10++) {
            p50 p50Var = this.c[i10];
            String str = strArr == null ? null : strArr[i10];
            o50 o50Var = p50Var.k;
            boolean z4 = p50Var.f;
            p50Var.f = str != null;
            if (str != null && (p50Var.d == null || !TextUtils.equals(p50Var.l, str))) {
                org.telegram.ui.Components.l5 l5Var = p50Var.d;
                if (l5Var != null) {
                    l5Var.p(o50Var);
                }
                p50Var.c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.l5 l5Var2 = new org.telegram.ui.Components.l5();
                l5Var2.l = 1.0f;
                l5Var2.n = null;
                l5Var2.o = null;
                l5Var2.g = 21;
                l5Var2.h = productionAccount;
                l5Var2.y();
                org.telegram.ui.Components.l5.x();
                p50Var.d = l5Var2;
                p50Var.l = str;
                l5Var2.r(str);
                p50Var.c();
                if (p50Var.j) {
                    p50Var.d.b(o50Var);
                }
            }
            if (p50Var.f && !z4) {
                p50Var.e = false;
            }
        }
        eg.h0 h0Var = this.g;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
