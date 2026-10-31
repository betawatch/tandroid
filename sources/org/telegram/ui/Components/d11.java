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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ e11 f;

    public d11(e11 e11Var) {
        this.f = e11Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
        e11 e11Var = this.f;
        ImageReceiver imageReceiver = e11Var.P;
        float f16 = e11Var.e;
        org.telegram.ui.ActionBar.c5 c5Var = e11Var.S;
        org.telegram.ui.ActionBar.c5 c5Var2 = e11Var.R;
        float f17 = e11Var.d;
        float f18 = e11Var.c;
        int i11 = e11Var.K;
        RectF rectF = e11Var.w;
        if (e11Var.W || e11Var.D != null) {
            cp cpVar = e11Var.G;
            f10 = 255.0f;
            int w02 = e11Var.G.a.l() ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, e11Var.y) : ((org.telegram.ui.ActionBar.x3) cpVar.a.f.get(cpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (e11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.i0.z(1.0f, e11Var.M, org.telegram.messenger.i0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, e11Var.getWidth() - z10, e11Var.getHeight() - z10);
            float f19 = e11Var.a;
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
        rectF.set(f18, f18, e11Var.getWidth() - f18, e11Var.getHeight() - f18);
        org.telegram.ui.ActionBar.y3 y3Var = e11Var.G.a;
        if (y3Var != null) {
            if (!y3Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        e11Var.G.getClass();
                        return;
                    }
                    float L = org.telegram.messenger.i0.L(8.0f) + f18;
                    float L2 = org.telegram.messenger.i0.L(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(L2, L, ((i11 == 3 ? 1.2f : 1.0f) * f13) + L2, L + f17);
                    } else {
                        L = 0.12f * e11Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(e11Var.getMeasuredWidth() - (e11Var.getMeasuredWidth() * 0.65f), L, e11Var.getMeasuredWidth() - (e11Var.getMeasuredWidth() * 0.1f), e11Var.getMeasuredHeight() * 0.32f);
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
                        c5Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(f11) + ((int) rectF.right), org.telegram.messenger.i0.L(2.0f) + ((int) rectF.bottom));
                        c5Var2.Q = (int) (rectF.height() * f12);
                        c5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float L3 = f18 + org.telegram.messenger.i0.L(5.0f);
                        float L4 = f14 + org.telegram.messenger.i0.L(f11) + L;
                        i10 = 3;
                        rectF.set(L3, L4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + L3, L4 + f14);
                    } else {
                        rectF.set(e11Var.getMeasuredWidth() * 0.1f, e11Var.getMeasuredHeight() * 0.35f, e11Var.getMeasuredWidth() * 0.65f, e11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        c5Var.setBounds(((int) rectF.left) - org.telegram.messenger.i0.L(f11), ((int) rectF.top) - org.telegram.messenger.i0.L(f15), (int) rectF.right, org.telegram.messenger.i0.L(f15) + ((int) rectF.bottom));
                        c5Var.Q = (int) (rectF.height() * f12);
                        c5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (e11Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - org.telegram.messenger.i0.L(8.0f), centerY - org.telegram.messenger.i0.L(8.0f), height + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + centerY);
                        imageReceiver.A0(rectF);
                        imageReceiver.h(canvas, null);
                        if (this.e == null) {
                            this.e = e11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                        }
                        int i13 = (int) height2;
                        int i14 = (int) centerY;
                        this.e.setBounds(i13 - org.telegram.messenger.i0.L(8.0f), i14 - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + i13, org.telegram.messenger.i0.L(8.0f) + i14);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            e11Var.G.a.getClass();
        }
        if (e11Var.T == null) {
            float f20 = e11Var.b;
            canvas.drawRoundRect(rectF, f20, f20, e11Var.s);
            canvas.save();
            noThemeStaticLayout = e11Var.getNoThemeStaticLayout();
            canvas.translate((e11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, org.telegram.messenger.i0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.y3 y3Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        e11 e11Var = this.f;
        if (drawable == null) {
            cp cpVar = e11Var.G;
            if (cpVar == null || (y3Var = cpVar.a) == null || !y3Var.l() || e11Var.N == null) {
                RectF rectF = e11Var.w;
                float f10 = e11Var.b;
                canvas.drawRoundRect(rectF, f10, f10, e11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(e11Var.x);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > e11Var.getWidth() / e11Var.getHeight()) {
                int width = (int) ((e11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - e11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, e11Var.getHeight());
            } else {
                int height = (int) ((e11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (e11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, e11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, e11Var.getWidth(), e11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof jb0) && (i10 = (iArr = ((jb0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = e11Var.r.getAlpha();
            e11Var.r.setAlpha((int) (alpha * f7));
            float f11 = e11Var.c;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f11, f11, e11Var.getWidth() - f11, e11Var.getHeight() - f11);
            float f12 = e11Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, e11Var.r);
            e11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
