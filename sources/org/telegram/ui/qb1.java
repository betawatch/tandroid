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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class qb1 implements org.telegram.ui.ActionBar.g6 {
    public org.telegram.ui.ActionBar.g6 a;
    public final SparseIntArray b = new SparseIntArray();
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f;
    public final TextPaint g;
    public final TextPaint h;
    public Bitmap i;
    public BitmapShader j;
    public Matrix k;
    public final /* synthetic */ qc1 l;
    public final /* synthetic */ qc1 m;

    public qb1(qc1 qc1Var) {
        this.m = qc1Var;
        this.l = qc1Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        hc1 hc1Var = this.m.q1;
        if (hc1Var != null) {
            return hc1Var.a();
        }
        hc1 hc1Var2 = this.l.q1;
        if (hc1Var2 != null) {
            return hc1Var2.a();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.r(bitmap, bitmapShader, this.k, i10, i11, f7, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint d(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.g;
            case "paintChatActionBackground":
                return this.c;
            case "paintChatBotButton":
                return this.h;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.f;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = this.a;
                return g6Var != null ? g6Var.d(str) : org.telegram.ui.ActionBar.k6.U0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean f() {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.f() : org.telegram.ui.ActionBar.k6.c1();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int g(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.Q0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int i(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        return g6Var != null ? g6Var.i(i10) : g(i10);
    }

    public final void j(Drawable drawable, Drawable drawable2, Float f7) {
        int i10 = org.telegram.ui.ActionBar.k6.lc;
        int g10 = g(i10);
        int g11 = g(org.telegram.ui.ActionBar.k6.mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.yc0;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            Bitmap bitmap = z10 ? ((org.telegram.ui.Components.yc0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            if (this.i != bitmap) {
                this.i = bitmap;
                Bitmap bitmap2 = this.i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.k == null) {
                    this.k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.i = null;
            this.j = null;
            int i11 = org.telegram.ui.ActionBar.k6.ic;
            textPaint2.setColor(g(i11));
            textPaint.setColor(g(i11));
            textPaint2.linkColor = g(org.telegram.ui.ActionBar.k6.jc);
        }
        Paint paint = this.c;
        paint.setColor(g10);
        Paint paint2 = this.d;
        paint2.setColor(g11);
        if (this.j == null || !(this.b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.yc0) drawable).q >= 0.0f) {
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
            float f10 = ((org.telegram.ui.Components.yc0) drawable).q;
            if (f7 != null) {
                f10 = f7.floatValue();
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
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(255);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(255);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
