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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ b11 f;

    public a11(b11 b11Var) {
        this.f = b11Var;
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
        b11 b11Var = this.f;
        ImageReceiver imageReceiver = b11Var.L;
        float f17 = b11Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = b11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = b11Var.N;
        float f18 = b11Var.d;
        float f19 = b11Var.c;
        int i11 = b11Var.G;
        RectF rectF = b11Var.v;
        if (b11Var.S || b11Var.y != null) {
            zo zoVar = b11Var.C;
            f11 = 255.0f;
            int v02 = b11Var.C.a.m() ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, b11Var.x) : ((org.telegram.ui.ActionBar.a4) zoVar.a.f.get(zoVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (b11Var.I * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, b11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, b11Var.getWidth() - z10, b11Var.getHeight() - z10);
            float f20 = b11Var.a;
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
        rectF.set(f19, f19, b11Var.getWidth() - f19, b11Var.getHeight() - f19);
        org.telegram.ui.ActionBar.b4 b4Var = b11Var.C.a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (b11Var.C.e != null) {
                            canvas.drawBitmap(b11Var.C.e, (b11Var.getWidth() - b11Var.C.e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * b11Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(b11Var.getMeasuredWidth() - (b11Var.getMeasuredWidth() * 0.65f), dp, b11Var.getMeasuredWidth() - (b11Var.getMeasuredWidth() * 0.1f), b11Var.getMeasuredHeight() * 0.32f);
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
                        d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        d5Var2.O = (int) (rectF.height() * f13);
                        d5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f19 + AndroidUtilities.dp(5.0f);
                        float dp4 = f15 + AndroidUtilities.dp(f12) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f14 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f15);
                    } else {
                        rectF.set(b11Var.getMeasuredWidth() * 0.1f, b11Var.getMeasuredHeight() * 0.35f, b11Var.getMeasuredWidth() * 0.65f, b11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f16), (int) rectF.right, AndroidUtilities.dp(f16) + ((int) rectF.bottom));
                        d5Var.O = (int) (rectF.height() * f13);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (b11Var.Q != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = b11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            b11Var.C.a.getClass();
        }
        if (b11Var.P == null) {
            float f21 = b11Var.b;
            canvas.drawRoundRect(rectF, f21, f21, b11Var.s);
            canvas.save();
            noThemeStaticLayout = b11Var.getNoThemeStaticLayout();
            canvas.translate((b11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        b11 b11Var = this.f;
        if (drawable == null) {
            zo zoVar = b11Var.C;
            if (zoVar == null || (b4Var = zoVar.a) == null || !b4Var.m() || b11Var.J == null) {
                RectF rectF = b11Var.v;
                float f11 = b11Var.b;
                canvas.drawRoundRect(rectF, f11, f11, b11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(b11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > b11Var.getWidth() / b11Var.getHeight()) {
                int width = (int) ((b11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - b11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, b11Var.getHeight());
            } else {
                int height = (int) ((b11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (b11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, b11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, b11Var.getWidth(), b11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof nb0) && (i10 = (iArr = ((nb0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = b11Var.r.getAlpha();
            b11Var.r.setAlpha((int) (alpha * f10));
            float f12 = b11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f12, b11Var.getWidth() - f12, b11Var.getHeight() - f12);
            float f13 = b11Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, b11Var.r);
            b11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
