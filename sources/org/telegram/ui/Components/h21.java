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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ i21 f;

    public h21(i21 i21Var) {
        this.f = i21Var;
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
        i21 i21Var = this.f;
        ImageReceiver imageReceiver = i21Var.P;
        float f16 = i21Var.e;
        org.telegram.ui.ActionBar.h5 h5Var = i21Var.S;
        org.telegram.ui.ActionBar.h5 h5Var2 = i21Var.R;
        float f17 = i21Var.d;
        float f18 = i21Var.c;
        int i11 = i21Var.K;
        RectF rectF = i21Var.v;
        if (i21Var.W || i21Var.y != null) {
            rp rpVar = i21Var.G;
            f10 = 255.0f;
            int v02 = i21Var.G.a.m() ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, i21Var.x) : ((org.telegram.ui.ActionBar.e4) rpVar.a.f.get(rpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (i21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, i21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, i21Var.getWidth() - z10, i21Var.getHeight() - z10);
            float f19 = i21Var.a;
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
        rectF.set(f18, f18, i21Var.getWidth() - f18, i21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.f4 f4Var = i21Var.G.a;
        if (f4Var != null) {
            if (!f4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (i21Var.G.e != null) {
                            canvas.drawBitmap(i21Var.G.e, (i21Var.getWidth() - i21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * i21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(i21Var.getMeasuredWidth() - (i21Var.getMeasuredWidth() * 0.65f), dp, i21Var.getMeasuredWidth() - (i21Var.getMeasuredWidth() * 0.1f), i21Var.getMeasuredHeight() * 0.32f);
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
                        h5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        h5Var2.O = (int) (rectF.height() * f12);
                        h5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(i21Var.getMeasuredWidth() * 0.1f, i21Var.getMeasuredHeight() * 0.35f, i21Var.getMeasuredWidth() * 0.65f, i21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        h5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        h5Var.O = (int) (rectF.height() * f12);
                        h5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (i21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = i21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            i21Var.G.a.getClass();
        }
        if (i21Var.T == null) {
            float f20 = i21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, i21Var.s);
            canvas.save();
            noThemeStaticLayout = i21Var.getNoThemeStaticLayout();
            canvas.translate((i21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        i21 i21Var = this.f;
        if (drawable == null) {
            rp rpVar = i21Var.G;
            if (rpVar == null || (f4Var = rpVar.a) == null || !f4Var.m() || i21Var.N == null) {
                RectF rectF = i21Var.v;
                float f10 = i21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, i21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(i21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > i21Var.getWidth() / i21Var.getHeight()) {
                int width = (int) ((i21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - i21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, i21Var.getHeight());
            } else {
                int height = (int) ((i21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (i21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, i21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, i21Var.getWidth(), i21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof lc0) && (i10 = (iArr = ((lc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = i21Var.r.getAlpha();
            i21Var.r.setAlpha((int) (alpha * f7));
            float f11 = i21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, i21Var.getWidth() - f11, i21Var.getHeight() - f11);
            float f12 = i21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, i21Var.r);
            i21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
