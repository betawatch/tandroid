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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ x11 f;

    public w11(x11 x11Var) {
        this.f = x11Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        float f12;
        float f13;
        StaticLayout noThemeStaticLayout;
        float f14;
        float f15;
        float f16;
        int i10;
        x11 x11Var = this.f;
        ImageReceiver imageReceiver = x11Var.M;
        float f17 = x11Var.e;
        org.telegram.ui.ActionBar.h5 h5Var = x11Var.P;
        org.telegram.ui.ActionBar.h5 h5Var2 = x11Var.O;
        float f18 = x11Var.d;
        float f19 = x11Var.c;
        int i11 = x11Var.H;
        RectF rectF = x11Var.v;
        if (x11Var.T || x11Var.y != null) {
            lp lpVar = x11Var.D;
            f11 = 255.0f;
            int v02 = x11Var.D.a.m() ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, x11Var.x) : ((org.telegram.ui.ActionBar.e4) lpVar.a.f.get(lpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (x11Var.J * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float w10 = e2.c.w(1.0f, x11Var.J, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(w10, w10, x11Var.getWidth() - w10, x11Var.getHeight() - w10);
            float f20 = x11Var.a;
            canvas.drawRoundRect(rectF, f20, f20, paint);
        } else {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.b;
        paint2.setAlpha(i12);
        Paint paint3 = this.c;
        paint3.setAlpha(i12);
        rectF.set(f19, f19, x11Var.getWidth() - f19, x11Var.getHeight() - f19);
        org.telegram.ui.ActionBar.f4 f4Var = x11Var.D.a;
        if (f4Var != null) {
            if (!f4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (x11Var.D.e != null) {
                            canvas.drawBitmap(x11Var.D.e, (x11Var.getWidth() - x11Var.D.e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
                            return;
                        }
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f19;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f19;
                    if (i11 == 0 || i11 == 3) {
                        f14 = f17;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f14) + dp2, dp + f18);
                    } else {
                        dp = 0.12f * x11Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(x11Var.getMeasuredWidth() - (x11Var.getMeasuredWidth() * 0.65f), dp, x11Var.getMeasuredWidth() - (x11Var.getMeasuredWidth() * 0.1f), x11Var.getMeasuredHeight() * 0.32f);
                    }
                    if (i11 == 3) {
                        paint2 = paint3;
                    }
                    if (i11 == 0 || i11 == 3) {
                        f15 = f18;
                        f16 = 2.0f;
                        canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint2);
                    } else {
                        f16 = 2.0f;
                        f15 = f18;
                        h5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        h5Var2.O = (int) (rectF.height() * f13);
                        h5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f19 + AndroidUtilities.dp(5.0f);
                        float dp4 = f15 + AndroidUtilities.dp(f12) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f14 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f15);
                    } else {
                        rectF.set(x11Var.getMeasuredWidth() * 0.1f, x11Var.getMeasuredHeight() * 0.35f, x11Var.getMeasuredWidth() * 0.65f, x11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        h5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f16), (int) rectF.right, AndroidUtilities.dp(f16) + ((int) rectF.bottom));
                        h5Var.O = (int) (rectF.height() * f13);
                        h5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (x11Var.R != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = x11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            x11Var.D.a.getClass();
        }
        if (x11Var.Q == null) {
            float f21 = x11Var.b;
            canvas.drawRoundRect(rectF, f21, f21, x11Var.s);
            canvas.save();
            noThemeStaticLayout = x11Var.getNoThemeStaticLayout();
            canvas.translate((x11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        x11 x11Var = this.f;
        if (drawable == null) {
            lp lpVar = x11Var.D;
            if (lpVar == null || (f4Var = lpVar.a) == null || !f4Var.m() || x11Var.K == null) {
                RectF rectF = x11Var.v;
                float f11 = x11Var.b;
                canvas.drawRoundRect(rectF, f11, f11, x11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(x11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > x11Var.getWidth() / x11Var.getHeight()) {
                int width = (int) ((x11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - x11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, x11Var.getHeight());
            } else {
                int height = (int) ((x11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (x11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, x11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, x11Var.getWidth(), x11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof fc0) && (i10 = (iArr = ((fc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = x11Var.r.getAlpha();
            x11Var.r.setAlpha((int) (alpha * f10));
            float f12 = x11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f12, x11Var.getWidth() - f12, x11Var.getHeight() - f12);
            float f13 = x11Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, x11Var.r);
            x11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
