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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ t11 f;

    public s11(t11 t11Var) {
        this.f = t11Var;
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
        t11 t11Var = this.f;
        ImageReceiver imageReceiver = t11Var.P;
        float f16 = t11Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = t11Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = t11Var.R;
        float f17 = t11Var.d;
        float f18 = t11Var.c;
        int i11 = t11Var.K;
        RectF rectF = t11Var.v;
        if (t11Var.W || t11Var.y != null) {
            kp kpVar = t11Var.G;
            f10 = 255.0f;
            int v02 = t11Var.G.a.m() ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, t11Var.x) : ((org.telegram.ui.ActionBar.c4) kpVar.a.f.get(kpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (t11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, t11Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, t11Var.getWidth() - z10, t11Var.getHeight() - z10);
            float f19 = t11Var.a;
            canvas.drawRoundRect(rectF, f19, f19, paint);
        } else {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        }
        int i12 = (int) (f7 * f10);
        Paint paint2 = this.b;
        paint2.setAlpha(i12);
        Paint paint3 = this.c;
        paint3.setAlpha(i12);
        rectF.set(f18, f18, t11Var.getWidth() - f18, t11Var.getHeight() - f18);
        org.telegram.ui.ActionBar.d4 d4Var = t11Var.G.a;
        if (d4Var != null) {
            if (!d4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (t11Var.G.e != null) {
                            canvas.drawBitmap(t11Var.G.e, (t11Var.getWidth() - t11Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * t11Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(t11Var.getMeasuredWidth() - (t11Var.getMeasuredWidth() * 0.65f), dp, t11Var.getMeasuredWidth() - (t11Var.getMeasuredWidth() * 0.1f), t11Var.getMeasuredHeight() * 0.32f);
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
                        f5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        f5Var2.O = (int) (rectF.height() * f12);
                        f5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(t11Var.getMeasuredWidth() * 0.1f, t11Var.getMeasuredHeight() * 0.35f, t11Var.getMeasuredWidth() * 0.65f, t11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        f5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        f5Var.O = (int) (rectF.height() * f12);
                        f5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (t11Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = t11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            t11Var.G.a.getClass();
        }
        if (t11Var.T == null) {
            float f20 = t11Var.b;
            canvas.drawRoundRect(rectF, f20, f20, t11Var.s);
            canvas.save();
            noThemeStaticLayout = t11Var.getNoThemeStaticLayout();
            canvas.translate((t11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.d4 d4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        t11 t11Var = this.f;
        if (drawable == null) {
            kp kpVar = t11Var.G;
            if (kpVar == null || (d4Var = kpVar.a) == null || !d4Var.m() || t11Var.N == null) {
                RectF rectF = t11Var.v;
                float f10 = t11Var.b;
                canvas.drawRoundRect(rectF, f10, f10, t11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(t11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > t11Var.getWidth() / t11Var.getHeight()) {
                int width = (int) ((t11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - t11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, t11Var.getHeight());
            } else {
                int height = (int) ((t11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (t11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, t11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, t11Var.getWidth(), t11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof dc0) && (i10 = (iArr = ((dc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = t11Var.r.getAlpha();
            t11Var.r.setAlpha((int) (alpha * f7));
            float f11 = t11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, t11Var.getWidth() - f11, t11Var.getHeight() - f11);
            float f12 = t11Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, t11Var.r);
            t11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
