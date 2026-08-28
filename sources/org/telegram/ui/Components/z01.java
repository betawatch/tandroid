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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z01 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ a11 f;

    public z01(a11 a11Var) {
        this.f = a11Var;
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
        int i9;
        a11 a11Var = this.f;
        ImageReceiver imageReceiver = a11Var.L;
        float f17 = a11Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = a11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = a11Var.N;
        float f18 = a11Var.d;
        float f19 = a11Var.c;
        int i10 = a11Var.G;
        RectF rectF = a11Var.v;
        if (a11Var.S || a11Var.y != null) {
            bp bpVar = a11Var.C;
            f11 = 255.0f;
            int v02 = a11Var.C.a.m() ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, a11Var.x) : ((org.telegram.ui.ActionBar.a4) bpVar.a.f.get(bpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (a11Var.I * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = e2.c.z(1.0f, a11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, a11Var.getWidth() - z10, a11Var.getHeight() - z10);
            float f20 = a11Var.a;
            canvas.drawRoundRect(rectF, f20, f20, paint);
        } else {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        }
        int i11 = (int) (f10 * f11);
        Paint paint2 = this.b;
        paint2.setAlpha(i11);
        Paint paint3 = this.c;
        paint3.setAlpha(i11);
        rectF.set(f19, f19, a11Var.getWidth() - f19, a11Var.getHeight() - f19);
        org.telegram.ui.ActionBar.b4 b4Var = a11Var.C.a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i10 != 4) {
                    if (i10 == 2) {
                        if (a11Var.C.e != null) {
                            canvas.drawBitmap(a11Var.C.e, (a11Var.getWidth() - a11Var.C.e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
                            return;
                        }
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f19;
                    float dp2 = AndroidUtilities.dp(i10 == 3 ? 5.0f : 22.0f) + f19;
                    if (i10 == 0 || i10 == 3) {
                        f14 = f17;
                        rectF.set(dp2, dp, ((i10 == 3 ? 1.2f : 1.0f) * f14) + dp2, dp + f18);
                    } else {
                        dp = 0.12f * a11Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(a11Var.getMeasuredWidth() - (a11Var.getMeasuredWidth() * 0.65f), dp, a11Var.getMeasuredWidth() - (a11Var.getMeasuredWidth() * 0.1f), a11Var.getMeasuredHeight() * 0.32f);
                    }
                    if (i10 == 3) {
                        paint2 = paint3;
                    }
                    if (i10 == 0 || i10 == 3) {
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
                    if (i10 == 0 || i10 == 3) {
                        float dp3 = f19 + AndroidUtilities.dp(5.0f);
                        float dp4 = f15 + AndroidUtilities.dp(f12) + dp;
                        i9 = 3;
                        rectF.set(dp3, dp4, (f14 * (i10 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f15);
                    } else {
                        rectF.set(a11Var.getMeasuredWidth() * 0.1f, a11Var.getMeasuredHeight() * 0.35f, a11Var.getMeasuredWidth() * 0.65f, a11Var.getMeasuredHeight() * 0.55f);
                        i9 = 3;
                    }
                    if (i10 != 0 && i10 != i9) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f16), (int) rectF.right, AndroidUtilities.dp(f16) + ((int) rectF.bottom));
                        d5Var.O = (int) (rectF.height() * f13);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (a11Var.Q != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = a11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                        }
                        int i12 = (int) height2;
                        int i13 = (int) centerY;
                        this.e.setBounds(i12 - AndroidUtilities.dp(8.0f), i13 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i12, AndroidUtilities.dp(8.0f) + i13);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            a11Var.C.a.getClass();
        }
        if (a11Var.P == null) {
            float f21 = a11Var.b;
            canvas.drawRoundRect(rectF, f21, f21, a11Var.s);
            canvas.save();
            noThemeStaticLayout = a11Var.getNoThemeStaticLayout();
            canvas.translate((a11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i9;
        Drawable drawable = this.d;
        a11 a11Var = this.f;
        if (drawable == null) {
            bp bpVar = a11Var.C;
            if (bpVar == null || (b4Var = bpVar.a) == null || !b4Var.m() || a11Var.J == null) {
                RectF rectF = a11Var.v;
                float f11 = a11Var.b;
                canvas.drawRoundRect(rectF, f11, f11, a11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(a11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > a11Var.getWidth() / a11Var.getHeight()) {
                int width = (int) ((a11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - a11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, a11Var.getHeight());
            } else {
                int height = (int) ((a11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (a11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, a11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, a11Var.getWidth(), a11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof jb0) && (i9 = (iArr = ((jb0) drawable3).a)[0]) == iArr[1] && i9 == iArr[2] && i9 == iArr[3])) {
            int alpha = a11Var.r.getAlpha();
            a11Var.r.setAlpha((int) (alpha * f10));
            float f12 = a11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f12, a11Var.getWidth() - f12, a11Var.getHeight() - f12);
            float f13 = a11Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, a11Var.r);
            a11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
