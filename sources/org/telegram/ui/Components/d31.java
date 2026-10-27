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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d31 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ e31 f;

    public d31(e31 e31Var) {
        this.f = e31Var;
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
        e31 e31Var = this.f;
        ImageReceiver imageReceiver = e31Var.P;
        float f16 = e31Var.e;
        org.telegram.ui.ActionBar.l5 l5Var = e31Var.S;
        org.telegram.ui.ActionBar.l5 l5Var2 = e31Var.R;
        float f17 = e31Var.d;
        float f18 = e31Var.c;
        int i11 = e31Var.K;
        RectF rectF = e31Var.v;
        if (e31Var.W || e31Var.y != null) {
            yp ypVar = e31Var.G;
            f10 = 255.0f;
            int w02 = e31Var.G.a.l() ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, e31Var.x) : ((org.telegram.ui.ActionBar.g4) ypVar.a.f.get(ypVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (e31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.h0.z(1.0f, e31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, e31Var.getWidth() - z10, e31Var.getHeight() - z10);
            float f19 = e31Var.a;
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
        rectF.set(f18, f18, e31Var.getWidth() - f18, e31Var.getHeight() - f18);
        org.telegram.ui.ActionBar.h4 h4Var = e31Var.G.a;
        if (h4Var != null) {
            if (!h4Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        e31Var.G.getClass();
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * e31Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(e31Var.getMeasuredWidth() - (e31Var.getMeasuredWidth() * 0.65f), dp, e31Var.getMeasuredWidth() - (e31Var.getMeasuredWidth() * 0.1f), e31Var.getMeasuredHeight() * 0.32f);
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
                        l5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        l5Var2.Q = (int) (rectF.height() * f12);
                        l5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(e31Var.getMeasuredWidth() * 0.1f, e31Var.getMeasuredHeight() * 0.35f, e31Var.getMeasuredWidth() * 0.65f, e31Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        l5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        l5Var.Q = (int) (rectF.height() * f12);
                        l5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (e31Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = e31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            e31Var.G.a.getClass();
        }
        if (e31Var.T == null) {
            float f20 = e31Var.b;
            canvas.drawRoundRect(rectF, f20, f20, e31Var.s);
            canvas.save();
            noThemeStaticLayout = e31Var.getNoThemeStaticLayout();
            canvas.translate((e31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.h4 h4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        e31 e31Var = this.f;
        if (drawable == null) {
            yp ypVar = e31Var.G;
            if (ypVar == null || (h4Var = ypVar.a) == null || !h4Var.l() || e31Var.N == null) {
                RectF rectF = e31Var.v;
                float f10 = e31Var.b;
                canvas.drawRoundRect(rectF, f10, f10, e31Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(e31Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > e31Var.getWidth() / e31Var.getHeight()) {
                int width = (int) ((e31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - e31Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, e31Var.getHeight());
            } else {
                int height = (int) ((e31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (e31Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, e31Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, e31Var.getWidth(), e31Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof vc0) && (i10 = (iArr = ((vc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = e31Var.r.getAlpha();
            e31Var.r.setAlpha((int) (alpha * f7));
            float f11 = e31Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, e31Var.getWidth() - f11, e31Var.getHeight() - f11);
            float f12 = e31Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, e31Var.r);
            e31Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
