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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ h21 f;

    public g21(h21 h21Var) {
        this.f = h21Var;
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
        h21 h21Var = this.f;
        ImageReceiver imageReceiver = h21Var.P;
        float f16 = h21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = h21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = h21Var.R;
        float f17 = h21Var.d;
        float f18 = h21Var.c;
        int i11 = h21Var.K;
        RectF rectF = h21Var.v;
        if (h21Var.W || h21Var.y != null) {
            mp mpVar = h21Var.G;
            f10 = 255.0f;
            int v02 = h21Var.G.a.m() ? org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, h21Var.x) : ((org.telegram.ui.ActionBar.a4) mpVar.a.f.get(mpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (h21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, h21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, h21Var.getWidth() - z10, h21Var.getHeight() - z10);
            float f19 = h21Var.a;
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
        rectF.set(f18, f18, h21Var.getWidth() - f18, h21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.b4 b4Var = h21Var.G.a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (h21Var.G.e != null) {
                            canvas.drawBitmap(h21Var.G.e, (h21Var.getWidth() - h21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * h21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(h21Var.getMeasuredWidth() - (h21Var.getMeasuredWidth() * 0.65f), dp, h21Var.getMeasuredWidth() - (h21Var.getMeasuredWidth() * 0.1f), h21Var.getMeasuredHeight() * 0.32f);
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
                        d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        d5Var2.O = (int) (rectF.height() * f12);
                        d5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(h21Var.getMeasuredWidth() * 0.1f, h21Var.getMeasuredHeight() * 0.35f, h21Var.getMeasuredWidth() * 0.65f, h21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        d5Var.O = (int) (rectF.height() * f12);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (h21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = h21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            h21Var.G.a.getClass();
        }
        if (h21Var.T == null) {
            float f20 = h21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, h21Var.s);
            canvas.save();
            noThemeStaticLayout = h21Var.getNoThemeStaticLayout();
            canvas.translate((h21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        h21 h21Var = this.f;
        if (drawable == null) {
            mp mpVar = h21Var.G;
            if (mpVar == null || (b4Var = mpVar.a) == null || !b4Var.m() || h21Var.N == null) {
                RectF rectF = h21Var.v;
                float f10 = h21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, h21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(h21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > h21Var.getWidth() / h21Var.getHeight()) {
                int width = (int) ((h21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - h21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, h21Var.getHeight());
            } else {
                int height = (int) ((h21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (h21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, h21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, h21Var.getWidth(), h21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof mc0) && (i10 = (iArr = ((mc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = h21Var.r.getAlpha();
            h21Var.r.setAlpha((int) (alpha * f7));
            float f11 = h21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, h21Var.getWidth() - f11, h21Var.getHeight() - f11);
            float f12 = h21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, h21Var.r);
            h21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
