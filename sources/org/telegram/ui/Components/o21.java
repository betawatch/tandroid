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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class o21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ p21 f;

    public o21(p21 p21Var) {
        this.f = p21Var;
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
        p21 p21Var = this.f;
        ImageReceiver imageReceiver = p21Var.P;
        float f16 = p21Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = p21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = p21Var.R;
        float f17 = p21Var.d;
        float f18 = p21Var.c;
        int i11 = p21Var.K;
        RectF rectF = p21Var.v;
        if (p21Var.W || p21Var.y != null) {
            vp vpVar = p21Var.G;
            f10 = 255.0f;
            int w02 = p21Var.G.a.l() ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, p21Var.x) : ((org.telegram.ui.ActionBar.b4) vpVar.a.f.get(vpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (p21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float x10 = com.google.android.gms.internal.cast.a6.x(1.0f, p21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(x10, x10, p21Var.getWidth() - x10, p21Var.getHeight() - x10);
            float f19 = p21Var.a;
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
        rectF.set(f18, f18, p21Var.getWidth() - f18, p21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.c4 c4Var = p21Var.G.a;
        if (c4Var != null) {
            if (!c4Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        p21Var.G.getClass();
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * p21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(p21Var.getMeasuredWidth() - (p21Var.getMeasuredWidth() * 0.65f), dp, p21Var.getMeasuredWidth() - (p21Var.getMeasuredWidth() * 0.1f), p21Var.getMeasuredHeight() * 0.32f);
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
                        f5Var2.Q = (int) (rectF.height() * f12);
                        f5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(p21Var.getMeasuredWidth() * 0.1f, p21Var.getMeasuredHeight() * 0.35f, p21Var.getMeasuredWidth() * 0.65f, p21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        f5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        f5Var.Q = (int) (rectF.height() * f12);
                        f5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (p21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = p21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            p21Var.G.a.getClass();
        }
        if (p21Var.T == null) {
            float f20 = p21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, p21Var.s);
            canvas.save();
            noThemeStaticLayout = p21Var.getNoThemeStaticLayout();
            canvas.translate((p21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        p21 p21Var = this.f;
        if (drawable == null) {
            vp vpVar = p21Var.G;
            if (vpVar == null || (c4Var = vpVar.a) == null || !c4Var.l() || p21Var.N == null) {
                RectF rectF = p21Var.v;
                float f10 = p21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, p21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(p21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > p21Var.getWidth() / p21Var.getHeight()) {
                int width = (int) ((p21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - p21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, p21Var.getHeight());
            } else {
                int height = (int) ((p21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (p21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, p21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, p21Var.getWidth(), p21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof wc0) && (i10 = (iArr = ((wc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = p21Var.r.getAlpha();
            p21Var.r.setAlpha((int) (alpha * f7));
            float f11 = p21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, p21Var.getWidth() - f11, p21Var.getHeight() - f11);
            float f12 = p21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, p21Var.r);
            p21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
