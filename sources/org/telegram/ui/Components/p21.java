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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ q21 f;

    public p21(q21 q21Var) {
        this.f = q21Var;
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
        q21 q21Var = this.f;
        ImageReceiver imageReceiver = q21Var.P;
        float f16 = q21Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = q21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = q21Var.R;
        float f17 = q21Var.d;
        float f18 = q21Var.c;
        int i11 = q21Var.K;
        RectF rectF = q21Var.v;
        if (q21Var.W || q21Var.y != null) {
            vp vpVar = q21Var.G;
            f10 = 255.0f;
            int w02 = q21Var.G.a.l() ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, q21Var.x) : ((org.telegram.ui.ActionBar.b4) vpVar.a.f.get(vpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (q21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, q21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, q21Var.getWidth() - y3, q21Var.getHeight() - y3);
            float f19 = q21Var.a;
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
        rectF.set(f18, f18, q21Var.getWidth() - f18, q21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.c4 c4Var = q21Var.G.a;
        if (c4Var != null) {
            if (!c4Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        q21Var.G.getClass();
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * q21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(q21Var.getMeasuredWidth() - (q21Var.getMeasuredWidth() * 0.65f), dp, q21Var.getMeasuredWidth() - (q21Var.getMeasuredWidth() * 0.1f), q21Var.getMeasuredHeight() * 0.32f);
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
                        rectF.set(q21Var.getMeasuredWidth() * 0.1f, q21Var.getMeasuredHeight() * 0.35f, q21Var.getMeasuredWidth() * 0.65f, q21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        f5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        f5Var.Q = (int) (rectF.height() * f12);
                        f5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (q21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = q21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            q21Var.G.a.getClass();
        }
        if (q21Var.T == null) {
            float f20 = q21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, q21Var.s);
            canvas.save();
            noThemeStaticLayout = q21Var.getNoThemeStaticLayout();
            canvas.translate((q21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        q21 q21Var = this.f;
        if (drawable == null) {
            vp vpVar = q21Var.G;
            if (vpVar == null || (c4Var = vpVar.a) == null || !c4Var.l() || q21Var.N == null) {
                RectF rectF = q21Var.v;
                float f10 = q21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, q21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(q21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > q21Var.getWidth() / q21Var.getHeight()) {
                int width = (int) ((q21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - q21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, q21Var.getHeight());
            } else {
                int height = (int) ((q21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (q21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, q21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, q21Var.getWidth(), q21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof wc0) && (i10 = (iArr = ((wc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = q21Var.r.getAlpha();
            q21Var.r.setAlpha((int) (alpha * f7));
            float f11 = q21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, q21Var.getWidth() - f11, q21Var.getHeight() - f11);
            float f12 = q21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, q21Var.r);
            q21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
