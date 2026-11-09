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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zz0 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ a01 f;

    public zz0(a01 a01Var) {
        this.f = a01Var;
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
        a01 a01Var = this.f;
        ImageReceiver imageReceiver = a01Var.P;
        float f17 = a01Var.e;
        org.telegram.ui.ActionBar.t4 t4Var = a01Var.S;
        org.telegram.ui.ActionBar.t4 t4Var2 = a01Var.R;
        float f18 = a01Var.d;
        float f19 = a01Var.c;
        int i10 = a01Var.K;
        RectF rectF = a01Var.w;
        if (a01Var.W || a01Var.D != null) {
            uo uoVar = a01Var.G;
            f11 = 255.0f;
            int w02 = a01Var.G.a.l() ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, a01Var.y) : ((org.telegram.ui.ActionBar.q3) uoVar.a.f.get(uoVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (a01Var.M * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, a01Var.M, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z9, z9, a01Var.getWidth() - z9, a01Var.getHeight() - z9);
            float f20 = a01Var.a;
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
        rectF.set(f19, f19, a01Var.getWidth() - f19, a01Var.getHeight() - f19);
        org.telegram.ui.ActionBar.r3 r3Var = a01Var.G.a;
        if (r3Var != null) {
            if (!r3Var.l()) {
                if (i10 != 4) {
                    if (i10 == 2) {
                        a01Var.G.getClass();
                        return;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + f19;
                    float L2 = org.telegram.messenger.g0.L(i10 == 3 ? 5.0f : 22.0f) + f19;
                    if (i10 == 0 || i10 == 3) {
                        f14 = f17;
                        rectF.set(L2, L, ((i10 == 3 ? 1.2f : 1.0f) * f14) + L2, L + f18);
                    } else {
                        L = 0.12f * a01Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(a01Var.getMeasuredWidth() - (a01Var.getMeasuredWidth() * 0.65f), L, a01Var.getMeasuredWidth() - (a01Var.getMeasuredWidth() * 0.1f), a01Var.getMeasuredHeight() * 0.32f);
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
                        t4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                        t4Var2.Q = (int) (rectF.height() * f13);
                        t4Var2.c(canvas, paint2);
                    }
                    if (i10 == 0 || i10 == 3) {
                        float L3 = f19 + org.telegram.messenger.g0.L(5.0f);
                        float L4 = f15 + org.telegram.messenger.g0.L(f12) + L;
                        i7 = 3;
                        rectF.set(L3, L4, (f14 * (i10 == 3 ? 0.8f : 1.0f)) + L3, L4 + f15);
                    } else {
                        rectF.set(a01Var.getMeasuredWidth() * 0.1f, a01Var.getMeasuredHeight() * 0.35f, a01Var.getMeasuredWidth() * 0.65f, a01Var.getMeasuredHeight() * 0.55f);
                        i7 = 3;
                    }
                    if (i10 != 0 && i10 != i7) {
                        t4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f16), (int) rectF.right, org.telegram.messenger.g0.L(f16) + ((int) rectF.bottom));
                        t4Var.Q = (int) (rectF.height() * f13);
                        t4Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (a01Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                        imageReceiver.A0(rectF);
                        imageReceiver.h(canvas, null);
                        if (this.e == null) {
                            this.e = a01Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            a01Var.G.a.getClass();
        }
        if (a01Var.T == null) {
            float f21 = a01Var.b;
            canvas.drawRoundRect(rectF, f21, f21, a01Var.s);
            canvas.save();
            noThemeStaticLayout = a01Var.getNoThemeStaticLayout();
            canvas.translate((a01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.r3 r3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        a01 a01Var = this.f;
        if (drawable == null) {
            uo uoVar = a01Var.G;
            if (uoVar == null || (r3Var = uoVar.a) == null || !r3Var.l() || a01Var.N == null) {
                RectF rectF = a01Var.w;
                float f11 = a01Var.b;
                canvas.drawRoundRect(rectF, f11, f11, a01Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(a01Var.x);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > a01Var.getWidth() / a01Var.getHeight()) {
                int width = (int) ((a01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - a01Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, a01Var.getHeight());
            } else {
                int height = (int) ((a01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (a01Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, a01Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, a01Var.getWidth(), a01Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof ra0) && (i7 = (iArr = ((ra0) drawable3).a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
            int alpha = a01Var.r.getAlpha();
            a01Var.r.setAlpha((int) (alpha * f10));
            float f12 = a01Var.c;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f12, f12, a01Var.getWidth() - f12, a01Var.getHeight() - f12);
            float f13 = a01Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, a01Var.r);
            a01Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
