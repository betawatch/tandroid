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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ic1 implements org.telegram.ui.ActionBar.g6 {
    public org.telegram.ui.ActionBar.g6 a;
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
    public final /* synthetic */ jd1 w;
    public final /* synthetic */ jd1 x;

    public ic1(jd1 jd1Var) {
        this.x = jd1Var;
        this.w = jd1Var;
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

    @Override // org.telegram.ui.ActionBar.g6
    public final int B0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.B0(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint F(String str) {
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
                org.telegram.ui.ActionBar.g6 g6Var = this.a;
                return g6Var != null ? g6Var.F(str) : org.telegram.ui.ActionBar.k6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int Z0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.Z0(i10) : B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        ad1 ad1Var = this.x.m1;
        if (ad1Var != null) {
            return ad1Var.a();
        }
        ad1 ad1Var2 = this.w.m1;
        if (ad1Var2 != null) {
            return ad1Var2.a();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f10) {
        int i10 = org.telegram.ui.ActionBar.k6.lc;
        int B0 = B0(i10);
        int B02 = B0(org.telegram.ui.ActionBar.k6.mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z4 = drawable instanceof org.telegram.ui.Components.fc0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f;
        if ((z4 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            Bitmap bitmap = z4 ? ((org.telegram.ui.Components.fc0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
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
            int i11 = org.telegram.ui.ActionBar.k6.ic;
            textPaint2.setColor(B0(i11));
            textPaint.setColor(B0(i11));
            textPaint2.linkColor = B0(org.telegram.ui.ActionBar.k6.jc);
        }
        Paint paint = this.c;
        paint.setColor(B0);
        Paint paint2 = this.d;
        paint2.setColor(B02);
        if (this.s == null || !(this.b.indexOfKey(i10) < 0 || z4 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z4) {
            if (((org.telegram.ui.Components.fc0) drawable).q >= 0.0f) {
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
        if (z4) {
            float f11 = ((org.telegram.ui.Components.fc0) drawable).q;
            if (f10 != null) {
                f11 = f10.floatValue();
            }
            if (f11 >= 0.0f) {
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

    @Override // org.telegram.ui.ActionBar.g6
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void l(float f10, float f11, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.r;
        if (bitmap == null || (bitmapShader = this.s) == null) {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.r(bitmap, bitmapShader, this.v, i10, i11, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean o0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.o0() : org.telegram.ui.ActionBar.k6.a1();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void J0(int i10, int i11) {
    }
}
