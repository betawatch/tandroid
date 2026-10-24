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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f50 {
    public final org.telegram.ui.Components.i11 d;
    public final org.telegram.ui.Components.i11 e;
    public final org.telegram.ui.Components.i11 f;
    public e50 g;
    public int j;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final h50[] c = new h50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.f6 i = new org.telegram.ui.Components.f6(new fz(this, 8), 320, org.telegram.ui.Components.bs.h, 0);
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public f50() {
        int i10 = 0;
        while (true) {
            h50[] h50VarArr = this.c;
            if (i10 >= h50VarArr.length) {
                this.a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.tg, false));
                this.d = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.i11 i11Var = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                i11Var.n(99);
                i11Var.q(AndroidUtilities.dp(200.0f));
                i11Var.m(AndroidUtilities.dp(2.66f));
                this.e = i11Var;
                this.f = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            h50VarArr[i10] = new h50(i10);
            i10++;
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        canvas.save();
        org.telegram.ui.Components.i11 i11Var = this.d;
        i11Var.p = f7 - AndroidUtilities.dp(132.0f);
        int f11 = i0.a.f(f10, this.j, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.tg, false));
        Paint paint = this.a;
        paint.setColor(f11);
        float e = this.i.e(this.h);
        float l4 = i11Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float dp = AndroidUtilities.dp(28.0f);
        float dp2 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp2, f10);
        float lerp2 = AndroidUtilities.lerp(dp, j10, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
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
        float f15 = f7 / 2.0f;
        float f16 = f15 - (r3 * 2);
        float dp6 = (int) ((dp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp6) + f16);
        float f18 = dp4 / 2.0f;
        float dp7 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18);
        RectF rectF3 = this.l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, dp7);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        h50[] h50VarArr = this.c;
        boolean b10 = h50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp6) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (h50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.i11 i11Var2 = this.d;
        i11Var2.c(f15 - (i11Var2.l() / 2.0f), dp / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp6 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (h50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp6 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = h50VarArr[3].b(canvas, rectF3, f10) ? true : z10;
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
            h50 h50Var = this.c[i10];
            String str = strArr == null ? null : strArr[i10];
            g50 g50Var = h50Var.k;
            boolean z10 = h50Var.f;
            h50Var.f = str != null;
            if (str != null && (h50Var.d == null || !TextUtils.equals(h50Var.l, str))) {
                org.telegram.ui.Components.r5 r5Var = h50Var.d;
                if (r5Var != null) {
                    r5Var.p(g50Var);
                }
                h50Var.c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.r5 r5Var2 = new org.telegram.ui.Components.r5();
                r5Var2.l = 1.0f;
                r5Var2.n = null;
                r5Var2.o = null;
                r5Var2.g = 21;
                r5Var2.h = productionAccount;
                r5Var2.y();
                org.telegram.ui.Components.r5.x();
                h50Var.d = r5Var2;
                h50Var.l = str;
                r5Var2.r(str);
                h50Var.c();
                if (h50Var.j) {
                    h50Var.d.b(g50Var);
                }
            }
            if (h50Var.f && !z10) {
                h50Var.e = false;
            }
        }
        e50 e50Var = this.g;
        if (e50Var != null) {
            e50Var.invalidate();
        }
    }
}
