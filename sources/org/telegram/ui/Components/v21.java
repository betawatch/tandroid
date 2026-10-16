package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ w21 f;

    public v21(w21 w21Var) {
        this.f = w21Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        float f11;
        float f12;
        StaticLayout noThemeStaticLayout;
        float f13;
        float f14;
        float f15;
        int i10;
        w21 w21Var = this.f;
        ImageReceiver imageReceiver = w21Var.P;
        float f16 = w21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = w21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = w21Var.R;
        float f17 = w21Var.d;
        float f18 = w21Var.c;
        int i11 = w21Var.K;
        RectF rectF = w21Var.v;
        if (w21Var.W || w21Var.y != null) {
            yp ypVar = w21Var.G;
            f10 = 255.0f;
            int w02 = w21Var.G.a.m() ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, w21Var.x) : ((org.telegram.ui.ActionBar.a4) ypVar.a.f.get(ypVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (w21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, w21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, w21Var.getWidth() - y3, w21Var.getHeight() - y3);
            float f19 = w21Var.a;
            canvas.drawRoundRect(rectF, f19, f19, paint);
        } else {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        }
        int i12 = (int) (f7 * f10);
        Paint paint2 = this.b;
        paint2.setAlpha(i12);
        Paint paint3 = this.c;
        paint3.setAlpha(i12);
        rectF.set(f18, f18, w21Var.getWidth() - f18, w21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.b4 b4Var = w21Var.G.a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (w21Var.G.e != null) {
                            canvas.drawBitmap(w21Var.G.e, (w21Var.getWidth() - w21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
                            return;
                        }
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * w21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(w21Var.getMeasuredWidth() - (w21Var.getMeasuredWidth() * 0.65f), dp, w21Var.getMeasuredWidth() - (w21Var.getMeasuredWidth() * 0.1f), w21Var.getMeasuredHeight() * 0.32f);
                    }
                    if (i11 == 3) {
                        paint2 = paint3;
                    }
                    if (i11 == 0 || i11 == 3) {
                        f14 = f17;
                        f15 = 2.0f;
                        canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint2);
                    } else {
                        f15 = 2.0f;
                        f14 = f17;
                        d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        d5Var2.Q = (int) (rectF.height() * f12);
                        d5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(w21Var.getMeasuredWidth() * 0.1f, w21Var.getMeasuredHeight() * 0.35f, w21Var.getMeasuredWidth() * 0.65f, w21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        d5Var.Q = (int) (rectF.height() * f12);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (w21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = w21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                        }
                        int i13 = (int) height2;
                        int i14 = (int) centerY;
                        this.e.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(8.0f) + i14);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            w21Var.G.a.getClass();
        }
        if (w21Var.T == null) {
            float f20 = w21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, w21Var.s);
            canvas.save();
            noThemeStaticLayout = w21Var.getNoThemeStaticLayout();
            canvas.translate((w21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        w21 w21Var = this.f;
        if (drawable == null) {
            yp ypVar = w21Var.G;
            if (ypVar == null || (b4Var = ypVar.a) == null || !b4Var.m() || w21Var.N == null) {
                RectF rectF = w21Var.v;
                float f10 = w21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, w21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(w21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > w21Var.getWidth() / w21Var.getHeight()) {
                int width = (int) ((w21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - w21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, w21Var.getHeight());
            } else {
                int height = (int) ((w21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (w21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, w21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, w21Var.getWidth(), w21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cd0) && (i10 = (iArr = ((cd0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = w21Var.r.getAlpha();
            w21Var.r.setAlpha((int) (alpha * f7));
            float f11 = w21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, w21Var.getWidth() - f11, w21Var.getHeight() - f11);
            float f12 = w21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, w21Var.r);
            w21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
