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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ v11 f;

    public u11(v11 v11Var) {
        this.f = v11Var;
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
        v11 v11Var = this.f;
        ImageReceiver imageReceiver = v11Var.P;
        float f16 = v11Var.e;
        org.telegram.ui.ActionBar.g5 g5Var = v11Var.S;
        org.telegram.ui.ActionBar.g5 g5Var2 = v11Var.R;
        float f17 = v11Var.d;
        float f18 = v11Var.c;
        int i11 = v11Var.K;
        RectF rectF = v11Var.v;
        if (v11Var.W || v11Var.y != null) {
            lp lpVar = v11Var.G;
            f10 = 255.0f;
            int v02 = v11Var.G.a.m() ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, v11Var.x) : ((org.telegram.ui.ActionBar.d4) lpVar.a.f.get(lpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (v11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, v11Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, v11Var.getWidth() - z10, v11Var.getHeight() - z10);
            float f19 = v11Var.a;
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
        rectF.set(f18, f18, v11Var.getWidth() - f18, v11Var.getHeight() - f18);
        org.telegram.ui.ActionBar.e4 e4Var = v11Var.G.a;
        if (e4Var != null) {
            if (!e4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (v11Var.G.e != null) {
                            canvas.drawBitmap(v11Var.G.e, (v11Var.getWidth() - v11Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * v11Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(v11Var.getMeasuredWidth() - (v11Var.getMeasuredWidth() * 0.65f), dp, v11Var.getMeasuredWidth() - (v11Var.getMeasuredWidth() * 0.1f), v11Var.getMeasuredHeight() * 0.32f);
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
                        g5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        g5Var2.O = (int) (rectF.height() * f12);
                        g5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(v11Var.getMeasuredWidth() * 0.1f, v11Var.getMeasuredHeight() * 0.35f, v11Var.getMeasuredWidth() * 0.65f, v11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        g5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        g5Var.O = (int) (rectF.height() * f12);
                        g5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (v11Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = v11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            v11Var.G.a.getClass();
        }
        if (v11Var.T == null) {
            float f20 = v11Var.b;
            canvas.drawRoundRect(rectF, f20, f20, v11Var.s);
            canvas.save();
            noThemeStaticLayout = v11Var.getNoThemeStaticLayout();
            canvas.translate((v11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.e4 e4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        v11 v11Var = this.f;
        if (drawable == null) {
            lp lpVar = v11Var.G;
            if (lpVar == null || (e4Var = lpVar.a) == null || !e4Var.m() || v11Var.N == null) {
                RectF rectF = v11Var.v;
                float f10 = v11Var.b;
                canvas.drawRoundRect(rectF, f10, f10, v11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(v11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > v11Var.getWidth() / v11Var.getHeight()) {
                int width = (int) ((v11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - v11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, v11Var.getHeight());
            } else {
                int height = (int) ((v11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (v11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, v11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, v11Var.getWidth(), v11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cc0) && (i10 = (iArr = ((cc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = v11Var.r.getAlpha();
            v11Var.r.setAlpha((int) (alpha * f7));
            float f11 = v11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, v11Var.getWidth() - f11, v11Var.getHeight() - f11);
            float f12 = v11Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, v11Var.r);
            v11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
