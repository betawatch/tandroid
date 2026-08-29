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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k11 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ l11 f;

    public k11(l11 l11Var) {
        this.f = l11Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f9) {
        float f10;
        float f11;
        float f12;
        StaticLayout noThemeStaticLayout;
        float f13;
        float f14;
        float f15;
        int i10;
        l11 l11Var = this.f;
        ImageReceiver imageReceiver = l11Var.L;
        float f16 = l11Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = l11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = l11Var.N;
        float f17 = l11Var.d;
        float f18 = l11Var.c;
        int i11 = l11Var.G;
        RectF rectF = l11Var.v;
        if (l11Var.S || l11Var.y != null) {
            fp fpVar = l11Var.C;
            f10 = 255.0f;
            int v02 = l11Var.C.a.m() ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, l11Var.x) : ((org.telegram.ui.ActionBar.a4) fpVar.a.f.get(fpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(v02);
            paint.setAlpha((int) (l11Var.I * f9 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, l11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, l11Var.getWidth() - z10, l11Var.getHeight() - z10);
            float f19 = l11Var.a;
            canvas.drawRoundRect(rectF, f19, f19, paint);
        } else {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        }
        int i12 = (int) (f9 * f10);
        Paint paint2 = this.b;
        paint2.setAlpha(i12);
        Paint paint3 = this.c;
        paint3.setAlpha(i12);
        rectF.set(f18, f18, l11Var.getWidth() - f18, l11Var.getHeight() - f18);
        org.telegram.ui.ActionBar.b4 b4Var = l11Var.C.a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (l11Var.C.e != null) {
                            canvas.drawBitmap(l11Var.C.e, (l11Var.getWidth() - l11Var.C.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                        dp = 0.12f * l11Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(l11Var.getMeasuredWidth() - (l11Var.getMeasuredWidth() * 0.65f), dp, l11Var.getMeasuredWidth() - (l11Var.getMeasuredWidth() * 0.1f), l11Var.getMeasuredHeight() * 0.32f);
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
                        rectF.set(l11Var.getMeasuredWidth() * 0.1f, l11Var.getMeasuredHeight() * 0.35f, l11Var.getMeasuredWidth() * 0.65f, l11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        d5Var.O = (int) (rectF.height() * f12);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (l11Var.Q != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = l11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            l11Var.C.a.getClass();
        }
        if (l11Var.P == null) {
            float f20 = l11Var.b;
            canvas.drawRoundRect(rectF, f20, f20, l11Var.s);
            canvas.save();
            noThemeStaticLayout = l11Var.getNoThemeStaticLayout();
            canvas.translate((l11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f9) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        l11 l11Var = this.f;
        if (drawable == null) {
            fp fpVar = l11Var.C;
            if (fpVar == null || (b4Var = fpVar.a) == null || !b4Var.m() || l11Var.J == null) {
                RectF rectF = l11Var.v;
                float f10 = l11Var.b;
                canvas.drawRoundRect(rectF, f10, f10, l11Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(l11Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > l11Var.getWidth() / l11Var.getHeight()) {
                int width = (int) ((l11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - l11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, l11Var.getHeight());
            } else {
                int height = (int) ((l11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (l11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, l11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, l11Var.getWidth(), l11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f9));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof yb0) && (i10 = (iArr = ((yb0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = l11Var.r.getAlpha();
            l11Var.r.setAlpha((int) (alpha * f9));
            float f11 = l11Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, l11Var.getWidth() - f11, l11Var.getHeight() - f11);
            float f12 = l11Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, l11Var.r);
            l11Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
