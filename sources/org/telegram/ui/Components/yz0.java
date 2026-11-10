package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yz0 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ zz0 f;

    public yz0(zz0 zz0Var) {
        this.f = zz0Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        float f12;
        float f13;
        StaticLayout noThemeStaticLayout;
        float f14;
        float f15;
        float f16;
        int i7;
        zz0 zz0Var = this.f;
        ImageReceiver imageReceiver = zz0Var.P;
        float f17 = zz0Var.e;
        org.telegram.ui.ActionBar.u4 u4Var = zz0Var.S;
        org.telegram.ui.ActionBar.u4 u4Var2 = zz0Var.R;
        float f18 = zz0Var.d;
        float f19 = zz0Var.c;
        int i10 = zz0Var.K;
        RectF rectF = zz0Var.w;
        if (zz0Var.W || zz0Var.D != null) {
            uo uoVar = zz0Var.G;
            f11 = 255.0f;
            int w02 = zz0Var.G.a.l() ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, zz0Var.y) : ((org.telegram.ui.ActionBar.r3) uoVar.a.f.get(uoVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (zz0Var.M * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, zz0Var.M, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z9, z9, zz0Var.getWidth() - z9, zz0Var.getHeight() - z9);
            float f20 = zz0Var.a;
            canvas.drawRoundRect(rectF, f20, f20, paint);
        } else {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        }
        int i11 = (int) (f10 * f11);
        Paint paint2 = this.b;
        paint2.setAlpha(i11);
        Paint paint3 = this.c;
        paint3.setAlpha(i11);
        rectF.set(f19, f19, zz0Var.getWidth() - f19, zz0Var.getHeight() - f19);
        org.telegram.ui.ActionBar.s3 s3Var = zz0Var.G.a;
        if (s3Var != null) {
            if (!s3Var.l()) {
                if (i10 != 4) {
                    if (i10 == 2) {
                        zz0Var.G.getClass();
                        return;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + f19;
                    float L2 = org.telegram.messenger.g0.L(i10 == 3 ? 5.0f : 22.0f) + f19;
                    if (i10 == 0 || i10 == 3) {
                        f14 = f17;
                        rectF.set(L2, L, ((i10 == 3 ? 1.2f : 1.0f) * f14) + L2, L + f18);
                    } else {
                        L = 0.12f * zz0Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(zz0Var.getMeasuredWidth() - (zz0Var.getMeasuredWidth() * 0.65f), L, zz0Var.getMeasuredWidth() - (zz0Var.getMeasuredWidth() * 0.1f), zz0Var.getMeasuredHeight() * 0.32f);
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
                        u4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                        u4Var2.Q = (int) (rectF.height() * f13);
                        u4Var2.c(canvas, paint2);
                    }
                    if (i10 == 0 || i10 == 3) {
                        float L3 = f19 + org.telegram.messenger.g0.L(5.0f);
                        float L4 = f15 + org.telegram.messenger.g0.L(f12) + L;
                        i7 = 3;
                        rectF.set(L3, L4, (f14 * (i10 == 3 ? 0.8f : 1.0f)) + L3, L4 + f15);
                    } else {
                        rectF.set(zz0Var.getMeasuredWidth() * 0.1f, zz0Var.getMeasuredHeight() * 0.35f, zz0Var.getMeasuredWidth() * 0.65f, zz0Var.getMeasuredHeight() * 0.55f);
                        i7 = 3;
                    }
                    if (i10 != 0 && i10 != i7) {
                        u4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f16), (int) rectF.right, org.telegram.messenger.g0.L(f16) + ((int) rectF.bottom));
                        u4Var.Q = (int) (rectF.height() * f13);
                        u4Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (zz0Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                        imageReceiver.A0(rectF);
                        imageReceiver.h(canvas, null);
                        if (this.e == null) {
                            this.e = zz0Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                        }
                        int i12 = (int) height2;
                        int i13 = (int) centerY;
                        this.e.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(8.0f) + i13);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            zz0Var.G.a.getClass();
        }
        if (zz0Var.T == null) {
            float f21 = zz0Var.b;
            canvas.drawRoundRect(rectF, f21, f21, zz0Var.s);
            canvas.save();
            noThemeStaticLayout = zz0Var.getNoThemeStaticLayout();
            canvas.translate((zz0Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.s3 s3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        zz0 zz0Var = this.f;
        if (drawable == null) {
            uo uoVar = zz0Var.G;
            if (uoVar == null || (s3Var = uoVar.a) == null || !s3Var.l() || zz0Var.N == null) {
                RectF rectF = zz0Var.w;
                float f11 = zz0Var.b;
                canvas.drawRoundRect(rectF, f11, f11, zz0Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(zz0Var.x);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > zz0Var.getWidth() / zz0Var.getHeight()) {
                int width = (int) ((zz0Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - zz0Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, zz0Var.getHeight());
            } else {
                int height = (int) ((zz0Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (zz0Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, zz0Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, zz0Var.getWidth(), zz0Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof qa0) && (i7 = (iArr = ((qa0) drawable3).a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
            int alpha = zz0Var.r.getAlpha();
            zz0Var.r.setAlpha((int) (alpha * f10));
            float f12 = zz0Var.c;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f12, f12, zz0Var.getWidth() - f12, zz0Var.getHeight() - f12);
            float f13 = zz0Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, zz0Var.r);
            zz0Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
