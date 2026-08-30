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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ w11 f;

    public v11(w11 w11Var) {
        this.f = w11Var;
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
        w11 w11Var = this.f;
        ImageReceiver imageReceiver = w11Var.M;
        float f17 = w11Var.e;
        org.telegram.ui.ActionBar.g5 g5Var = w11Var.P;
        org.telegram.ui.ActionBar.g5 g5Var2 = w11Var.O;
        float f18 = w11Var.d;
        float f19 = w11Var.c;
        int i11 = w11Var.H;
        RectF rectF = w11Var.v;
        if (w11Var.T || w11Var.y != null) {
            jp jpVar = w11Var.D;
            f11 = 255.0f;
            int v02 = w11Var.D.a.m() ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, w11Var.x) : ((org.telegram.ui.ActionBar.d4) jpVar.a.f.get(jpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (w11Var.J * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float w10 = e2.c.w(1.0f, w11Var.J, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(w10, w10, w11Var.getWidth() - w10, w11Var.getHeight() - w10);
            float f20 = w11Var.a;
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
        rectF.set(f19, f19, w11Var.getWidth() - f19, w11Var.getHeight() - f19);
        org.telegram.ui.ActionBar.e4 e4Var = w11Var.D.a;
        if (e4Var != null) {
            if (!e4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (w11Var.D.e != null) {
                            canvas.drawBitmap(w11Var.D.e, (w11Var.getWidth() - w11Var.D.e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * w11Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(w11Var.getMeasuredWidth() - (w11Var.getMeasuredWidth() * 0.65f), dp, w11Var.getMeasuredWidth() - (w11Var.getMeasuredWidth() * 0.1f), w11Var.getMeasuredHeight() * 0.32f);
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
                        g5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        g5Var2.O = (int) (rectF.height() * f13);
                        g5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f19 + AndroidUtilities.dp(5.0f);
                        float dp4 = f15 + AndroidUtilities.dp(f12) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f14 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f15);
                    } else {
                        rectF.set(w11Var.getMeasuredWidth() * 0.1f, w11Var.getMeasuredHeight() * 0.35f, w11Var.getMeasuredWidth() * 0.65f, w11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        g5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f16), (int) rectF.right, AndroidUtilities.dp(f16) + ((int) rectF.bottom));
                        g5Var.O = (int) (rectF.height() * f13);
                        g5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (w11Var.R != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = w11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            w11Var.D.a.getClass();
        }
        if (w11Var.Q == null) {
            float f21 = w11Var.b;
            canvas.drawRoundRect(rectF, f21, f21, w11Var.s);
            canvas.save();
            noThemeStaticLayout = w11Var.getNoThemeStaticLayout();
            canvas.translate((w11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.e4 e4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        w11 w11Var = this.f;
        if (drawable == null) {
            jp jpVar = w11Var.D;
            if (jpVar == null || (e4Var = jpVar.a) == null || !e4Var.m() || w11Var.K == null) {
                RectF rectF = w11Var.v;
                float f11 = w11Var.b;
                canvas.drawRoundRect(rectF, f11, f11, w11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(w11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > w11Var.getWidth() / w11Var.getHeight()) {
                int width = (int) ((w11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - w11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, w11Var.getHeight());
            } else {
                int height = (int) ((w11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (w11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, w11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, w11Var.getWidth(), w11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof dc0) && (i10 = (iArr = ((dc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = w11Var.r.getAlpha();
            w11Var.r.setAlpha((int) (alpha * f10));
            float f12 = w11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f12, w11Var.getWidth() - f12, w11Var.getHeight() - f12);
            float f13 = w11Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, w11Var.r);
            w11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
