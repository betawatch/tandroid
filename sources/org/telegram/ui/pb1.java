package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pb1 implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.c6 a;
    public final SparseIntArray b = new SparseIntArray();
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f;
    public final TextPaint h;
    public final TextPaint n;
    public Bitmap r;
    public BitmapShader s;
    public Matrix v;
    public final /* synthetic */ qc1 w;
    public final /* synthetic */ qc1 x;

    public pb1(qc1 qc1Var) {
        this.x = qc1Var;
        this.w = qc1Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int C0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint G(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.h;
            case "paintChatActionBackground":
                return this.c;
            case "paintChatBotButton":
                return this.n;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.f;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = this.a;
                return c6Var != null ? c6Var.G(str) : org.telegram.ui.ActionBar.g6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        hc1 hc1Var = this.x.l1;
        if (hc1Var != null) {
            return hc1Var.a();
        }
        hc1 hc1Var2 = this.w.l1;
        if (hc1Var2 != null) {
            return hc1Var2.a();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        return c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f9) {
        int i10 = org.telegram.ui.ActionBar.g6.lc;
        int C0 = C0(i10);
        int C02 = C0(org.telegram.ui.ActionBar.g6.mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.yb0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            Bitmap bitmap = z10 ? ((org.telegram.ui.Components.yb0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            if (this.r != bitmap) {
                this.r = bitmap;
                Bitmap bitmap2 = this.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.n.setColor(-1);
        } else {
            this.r = null;
            this.s = null;
            int i11 = org.telegram.ui.ActionBar.g6.ic;
            textPaint2.setColor(C0(i11));
            textPaint.setColor(C0(i11));
            textPaint2.linkColor = C0(org.telegram.ui.ActionBar.g6.jc);
        }
        Paint paint = this.c;
        paint.setColor(C0);
        Paint paint2 = this.d;
        paint2.setColor(C02);
        if (this.s == null || !(this.b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.yb0) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.97f : 0.92f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.4f : 0.8f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.9f : 0.84f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z10) {
            float f10 = ((org.telegram.ui.Components.yb0) drawable).q;
            if (f9 != null) {
                f10 = f9.floatValue();
            }
            if (f10 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.06f);
        }
        paint.setShader(this.s);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(255);
        paint2.setShader(this.s);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(255);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int g1(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        return c6Var != null ? c6Var.g1(i10) : C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int h0(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void l(float f9, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.r;
        if (bitmap == null || (bitmapShader = this.s) == null) {
            org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, this.v, i10, i11, f9, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean l0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        return c6Var != null ? c6Var.l0() : org.telegram.ui.ActionBar.g6.a1();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
