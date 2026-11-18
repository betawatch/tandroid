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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i01 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ j01 f;

    public i01(j01 j01Var) {
        this.f = j01Var;
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
        j01 j01Var = this.f;
        ImageReceiver imageReceiver = j01Var.Q;
        float f17 = j01Var.e;
        org.telegram.ui.ActionBar.v4 v4Var = j01Var.T;
        org.telegram.ui.ActionBar.v4 v4Var2 = j01Var.S;
        float f18 = j01Var.d;
        float f19 = j01Var.c;
        int i10 = j01Var.L;
        RectF rectF = j01Var.w;
        if (j01Var.a0 || j01Var.E != null) {
            kp kpVar = j01Var.H;
            f11 = 255.0f;
            int w02 = j01Var.H.a.l() ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, j01Var.y) : ((org.telegram.ui.ActionBar.s3) kpVar.a.f.get(kpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (j01Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, j01Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, j01Var.getWidth() - z10, j01Var.getHeight() - z10);
            float f20 = j01Var.a;
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
        rectF.set(f19, f19, j01Var.getWidth() - f19, j01Var.getHeight() - f19);
        org.telegram.ui.ActionBar.t3 t3Var = j01Var.H.a;
        if (t3Var != null) {
            if (!t3Var.l()) {
                if (i10 != 4) {
                    if (i10 == 2) {
                        j01Var.H.getClass();
                        return;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + f19;
                    float L2 = org.telegram.messenger.g0.L(i10 == 3 ? 5.0f : 22.0f) + f19;
                    if (i10 == 0 || i10 == 3) {
                        f14 = f17;
                        rectF.set(L2, L, ((i10 == 3 ? 1.2f : 1.0f) * f14) + L2, L + f18);
                    } else {
                        L = 0.12f * j01Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(j01Var.getMeasuredWidth() - (j01Var.getMeasuredWidth() * 0.65f), L, j01Var.getMeasuredWidth() - (j01Var.getMeasuredWidth() * 0.1f), j01Var.getMeasuredHeight() * 0.32f);
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
                        v4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                        v4Var2.Q = (int) (rectF.height() * f13);
                        v4Var2.c(canvas, paint2);
                    }
                    if (i10 == 0 || i10 == 3) {
                        float L3 = f19 + org.telegram.messenger.g0.L(5.0f);
                        float L4 = f15 + org.telegram.messenger.g0.L(f12) + L;
                        i7 = 3;
                        rectF.set(L3, L4, (f14 * (i10 == 3 ? 0.8f : 1.0f)) + L3, L4 + f15);
                    } else {
                        rectF.set(j01Var.getMeasuredWidth() * 0.1f, j01Var.getMeasuredHeight() * 0.35f, j01Var.getMeasuredWidth() * 0.65f, j01Var.getMeasuredHeight() * 0.55f);
                        i7 = 3;
                    }
                    if (i10 != 0 && i10 != i7) {
                        v4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f16), (int) rectF.right, org.telegram.messenger.g0.L(f16) + ((int) rectF.bottom));
                        v4Var.Q = (int) (rectF.height() * f13);
                        v4Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (j01Var.V != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                        imageReceiver.A0(rectF);
                        imageReceiver.h(canvas, null);
                        if (this.e == null) {
                            this.e = j01Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            j01Var.H.a.getClass();
        }
        if (j01Var.U == null) {
            float f21 = j01Var.b;
            canvas.drawRoundRect(rectF, f21, f21, j01Var.s);
            canvas.save();
            noThemeStaticLayout = j01Var.getNoThemeStaticLayout();
            canvas.translate((j01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.t3 t3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        j01 j01Var = this.f;
        if (drawable == null) {
            kp kpVar = j01Var.H;
            if (kpVar == null || (t3Var = kpVar.a) == null || !t3Var.l() || j01Var.O == null) {
                RectF rectF = j01Var.w;
                float f11 = j01Var.b;
                canvas.drawRoundRect(rectF, f11, f11, j01Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(j01Var.x);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > j01Var.getWidth() / j01Var.getHeight()) {
                int width = (int) ((j01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - j01Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, j01Var.getHeight());
            } else {
                int height = (int) ((j01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (j01Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, j01Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, j01Var.getWidth(), j01Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof bb0) && (i7 = (iArr = ((bb0) drawable3).a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
            int alpha = j01Var.r.getAlpha();
            j01Var.r.setAlpha((int) (alpha * f10));
            float f12 = j01Var.c;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f12, f12, j01Var.getWidth() - f12, j01Var.getHeight() - f12);
            float f13 = j01Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, j01Var.r);
            j01Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
