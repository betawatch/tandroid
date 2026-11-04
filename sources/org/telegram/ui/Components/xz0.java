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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xz0 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ yz0 f;

    public xz0(yz0 yz0Var) {
        this.f = yz0Var;
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
        int i3;
        yz0 yz0Var = this.f;
        ImageReceiver imageReceiver = yz0Var.Q;
        float f17 = yz0Var.e;
        org.telegram.ui.ActionBar.t4 t4Var = yz0Var.T;
        org.telegram.ui.ActionBar.t4 t4Var2 = yz0Var.S;
        float f18 = yz0Var.d;
        float f19 = yz0Var.c;
        int i10 = yz0Var.L;
        RectF rectF = yz0Var.w;
        if (yz0Var.a0 || yz0Var.E != null) {
            uo uoVar = yz0Var.H;
            f11 = 255.0f;
            int w02 = yz0Var.H.a.l() ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, yz0Var.y) : ((org.telegram.ui.ActionBar.o3) uoVar.a.f.get(uoVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (yz0Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, yz0Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y9, y9, yz0Var.getWidth() - y9, yz0Var.getHeight() - y9);
            float f20 = yz0Var.a;
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
        rectF.set(f19, f19, yz0Var.getWidth() - f19, yz0Var.getHeight() - f19);
        org.telegram.ui.ActionBar.p3 p3Var = yz0Var.H.a;
        if (p3Var != null) {
            if (!p3Var.l()) {
                if (i10 != 4) {
                    if (i10 == 2) {
                        yz0Var.H.getClass();
                        return;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + f19;
                    float L2 = org.telegram.messenger.g0.L(i10 == 3 ? 5.0f : 22.0f) + f19;
                    if (i10 == 0 || i10 == 3) {
                        f14 = f17;
                        rectF.set(L2, L, ((i10 == 3 ? 1.2f : 1.0f) * f14) + L2, L + f18);
                    } else {
                        L = 0.12f * yz0Var.getMeasuredHeight();
                        f14 = f17;
                        rectF.set(yz0Var.getMeasuredWidth() - (yz0Var.getMeasuredWidth() * 0.65f), L, yz0Var.getMeasuredWidth() - (yz0Var.getMeasuredWidth() * 0.1f), yz0Var.getMeasuredHeight() * 0.32f);
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
                        i3 = 3;
                        rectF.set(L3, L4, (f14 * (i10 == 3 ? 0.8f : 1.0f)) + L3, L4 + f15);
                    } else {
                        rectF.set(yz0Var.getMeasuredWidth() * 0.1f, yz0Var.getMeasuredHeight() * 0.35f, yz0Var.getMeasuredWidth() * 0.65f, yz0Var.getMeasuredHeight() * 0.55f);
                        i3 = 3;
                    }
                    if (i10 != 0 && i10 != i3) {
                        t4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f16), (int) rectF.right, org.telegram.messenger.g0.L(f16) + ((int) rectF.bottom));
                        t4Var.Q = (int) (rectF.height() * f13);
                        t4Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (yz0Var.V != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f16) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f16);
                        rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                        imageReceiver.A0(rectF);
                        imageReceiver.h(canvas, null);
                        if (this.e == null) {
                            this.e = yz0Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            yz0Var.H.a.getClass();
        }
        if (yz0Var.U == null) {
            float f21 = yz0Var.b;
            canvas.drawRoundRect(rectF, f21, f21, yz0Var.s);
            canvas.save();
            noThemeStaticLayout = yz0Var.getNoThemeStaticLayout();
            canvas.translate((yz0Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.p3 p3Var;
        int[] iArr;
        int i3;
        Drawable drawable = this.d;
        yz0 yz0Var = this.f;
        if (drawable == null) {
            uo uoVar = yz0Var.H;
            if (uoVar == null || (p3Var = uoVar.a) == null || !p3Var.l() || yz0Var.O == null) {
                RectF rectF = yz0Var.w;
                float f11 = yz0Var.b;
                canvas.drawRoundRect(rectF, f11, f11, yz0Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(yz0Var.x);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > yz0Var.getWidth() / yz0Var.getHeight()) {
                int width = (int) ((yz0Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - yz0Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, yz0Var.getHeight());
            } else {
                int height = (int) ((yz0Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (yz0Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, yz0Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, yz0Var.getWidth(), yz0Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof la0) && (i3 = (iArr = ((la0) drawable3).a)[0]) == iArr[1] && i3 == iArr[2] && i3 == iArr[3])) {
            int alpha = yz0Var.r.getAlpha();
            yz0Var.r.setAlpha((int) (alpha * f10));
            float f12 = yz0Var.c;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f12, f12, yz0Var.getWidth() - f12, yz0Var.getHeight() - f12);
            float f13 = yz0Var.b;
            canvas.drawRoundRect(rectF2, f13, f13, yz0Var.r);
            yz0Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
