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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c31 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ d31 f;

    public c31(d31 d31Var) {
        this.f = d31Var;
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
        d31 d31Var = this.f;
        ImageReceiver imageReceiver = d31Var.P;
        float f16 = d31Var.e;
        org.telegram.ui.ActionBar.l5 l5Var = d31Var.S;
        org.telegram.ui.ActionBar.l5 l5Var2 = d31Var.R;
        float f17 = d31Var.d;
        float f18 = d31Var.c;
        int i11 = d31Var.K;
        RectF rectF = d31Var.v;
        if (d31Var.W || d31Var.y != null) {
            xp xpVar = d31Var.G;
            f10 = 255.0f;
            int w02 = d31Var.G.a.l() ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, d31Var.x) : ((org.telegram.ui.ActionBar.g4) xpVar.a.f.get(xpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (d31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.h0.z(1.0f, d31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, d31Var.getWidth() - z10, d31Var.getHeight() - z10);
            float f19 = d31Var.a;
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
        rectF.set(f18, f18, d31Var.getWidth() - f18, d31Var.getHeight() - f18);
        org.telegram.ui.ActionBar.h4 h4Var = d31Var.G.a;
        if (h4Var != null) {
            if (!h4Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        d31Var.G.getClass();
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * d31Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(d31Var.getMeasuredWidth() - (d31Var.getMeasuredWidth() * 0.65f), dp, d31Var.getMeasuredWidth() - (d31Var.getMeasuredWidth() * 0.1f), d31Var.getMeasuredHeight() * 0.32f);
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
                        rectF.set(d31Var.getMeasuredWidth() * 0.1f, d31Var.getMeasuredHeight() * 0.35f, d31Var.getMeasuredWidth() * 0.65f, d31Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        l5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        l5Var.Q = (int) (rectF.height() * f12);
                        l5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (d31Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = d31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            d31Var.G.a.getClass();
        }
        if (d31Var.T == null) {
            float f20 = d31Var.b;
            canvas.drawRoundRect(rectF, f20, f20, d31Var.s);
            canvas.save();
            noThemeStaticLayout = d31Var.getNoThemeStaticLayout();
            canvas.translate((d31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.h4 h4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        d31 d31Var = this.f;
        if (drawable == null) {
            xp xpVar = d31Var.G;
            if (xpVar == null || (h4Var = xpVar.a) == null || !h4Var.l() || d31Var.N == null) {
                RectF rectF = d31Var.v;
                float f10 = d31Var.b;
                canvas.drawRoundRect(rectF, f10, f10, d31Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(d31Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > d31Var.getWidth() / d31Var.getHeight()) {
                int width = (int) ((d31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - d31Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, d31Var.getHeight());
            } else {
                int height = (int) ((d31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (d31Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, d31Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, d31Var.getWidth(), d31Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof uc0) && (i10 = (iArr = ((uc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = d31Var.r.getAlpha();
            d31Var.r.setAlpha((int) (alpha * f7));
            float f11 = d31Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, d31Var.getWidth() - f11, d31Var.getHeight() - f11);
            float f12 = d31Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, d31Var.r);
            d31Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
