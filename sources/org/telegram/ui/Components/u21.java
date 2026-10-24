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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u21 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ v21 f;

    public u21(v21 v21Var) {
        this.f = v21Var;
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
        v21 v21Var = this.f;
        ImageReceiver imageReceiver = v21Var.P;
        float f16 = v21Var.e;
        org.telegram.ui.ActionBar.j5 j5Var = v21Var.S;
        org.telegram.ui.ActionBar.j5 j5Var2 = v21Var.R;
        float f17 = v21Var.d;
        float f18 = v21Var.c;
        int i11 = v21Var.K;
        RectF rectF = v21Var.v;
        if (v21Var.W || v21Var.y != null) {
            vp vpVar = v21Var.G;
            f10 = 255.0f;
            int w02 = v21Var.G.a.l() ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, v21Var.x) : ((org.telegram.ui.ActionBar.e4) vpVar.a.f.get(vpVar.c)).j;
            Paint paint = this.a;
            paint.setColor(w02);
            paint.setAlpha((int) (v21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, v21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, v21Var.getWidth() - y3, v21Var.getHeight() - y3);
            float f19 = v21Var.a;
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
        rectF.set(f18, f18, v21Var.getWidth() - f18, v21Var.getHeight() - f18);
        org.telegram.ui.ActionBar.f4 f4Var = v21Var.G.a;
        if (f4Var != null) {
            if (!f4Var.l()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        v21Var.G.getClass();
                        return;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + f18;
                    float dp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f13 = f16;
                        rectF.set(dp2, dp, ((i11 == 3 ? 1.2f : 1.0f) * f13) + dp2, dp + f17);
                    } else {
                        dp = 0.12f * v21Var.getMeasuredHeight();
                        f13 = f16;
                        rectF.set(v21Var.getMeasuredWidth() - (v21Var.getMeasuredWidth() * 0.65f), dp, v21Var.getMeasuredWidth() - (v21Var.getMeasuredWidth() * 0.1f), v21Var.getMeasuredHeight() * 0.32f);
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
                        j5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        j5Var2.Q = (int) (rectF.height() * f12);
                        j5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float dp3 = f18 + AndroidUtilities.dp(5.0f);
                        float dp4 = f14 + AndroidUtilities.dp(f11) + dp;
                        i10 = 3;
                        rectF.set(dp3, dp4, (f13 * (i11 == 3 ? 0.8f : 1.0f)) + dp3, dp4 + f14);
                    } else {
                        rectF.set(v21Var.getMeasuredWidth() * 0.1f, v21Var.getMeasuredHeight() * 0.35f, v21Var.getMeasuredWidth() * 0.65f, v21Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        j5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        j5Var.Q = (int) (rectF.height() * f12);
                        j5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                    if (v21Var.U != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f15) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f15);
                        rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.e == null) {
                            this.e = v21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
            v21Var.G.a.getClass();
        }
        if (v21Var.T == null) {
            float f20 = v21Var.b;
            canvas.drawRoundRect(rectF, f20, f20, v21Var.s);
            canvas.save();
            noThemeStaticLayout = v21Var.getNoThemeStaticLayout();
            canvas.translate((v21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        v21 v21Var = this.f;
        if (drawable == null) {
            vp vpVar = v21Var.G;
            if (vpVar == null || (f4Var = vpVar.a) == null || !f4Var.l() || v21Var.N == null) {
                RectF rectF = v21Var.v;
                float f10 = v21Var.b;
                canvas.drawRoundRect(rectF, f10, f10, v21Var.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(v21Var.w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > v21Var.getWidth() / v21Var.getHeight()) {
                int width = (int) ((v21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - v21Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, v21Var.getHeight());
            } else {
                int height = (int) ((v21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (v21Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, v21Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, v21Var.getWidth(), v21Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f7));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof yc0) && (i10 = (iArr = ((yc0) drawable3).a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = v21Var.r.getAlpha();
            v21Var.r.setAlpha((int) (alpha * f7));
            float f11 = v21Var.c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f11, f11, v21Var.getWidth() - f11, v21Var.getHeight() - f11);
            float f12 = v21Var.b;
            canvas.drawRoundRect(rectF2, f12, f12, v21Var.r);
            v21Var.r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
