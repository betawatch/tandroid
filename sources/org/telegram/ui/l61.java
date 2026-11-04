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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l61 implements org.telegram.ui.ActionBar.e6 {
    public org.telegram.ui.ActionBar.e6 a;
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
    public final /* synthetic */ l71 l;
    public final /* synthetic */ l71 m;

    public l61(l71 l71Var) {
        this.m = l71Var;
        this.l = l71Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.az.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.az.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        d71 d71Var = this.m.r1;
        if (d71Var != null) {
            return d71Var.a();
        }
        d71 d71Var2 = this.l.r1;
        if (d71Var2 != null) {
            return d71Var2.a();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        return e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
        } else {
            org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, this.k, i3, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
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
                org.telegram.ui.ActionBar.e6 e6Var = this.a;
                return e6Var != null ? e6Var.d(str) : org.telegram.ui.ActionBar.k6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        return org.telegram.messenger.az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean g() {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        return e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.v0(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        return e6Var != null ? e6Var.j(i3) : h(i3);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f10) {
        int i3 = org.telegram.ui.ActionBar.k6.Zc;
        int h = h(i3);
        int h7 = h(org.telegram.ui.ActionBar.k6.ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.la0;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.az.o() != 0 && org.telegram.messenger.lc.e(32)) {
            Bitmap bitmap = z10 ? ((org.telegram.ui.Components.la0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
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
            int i10 = org.telegram.ui.ActionBar.k6.Wc;
            textPaint2.setColor(h(i10));
            textPaint.setColor(h(i10));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.k6.Xc);
        }
        Paint paint = this.c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h7);
        if (this.j == null || !(this.b.indexOfKey(i3) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.la0) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.g0.n2(colorMatrix, a() ? 0.97f : 0.92f);
                org.telegram.messenger.g0.h(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                org.telegram.messenger.g0.n2(colorMatrix, a() ? 0.4f : 0.8f);
                org.telegram.messenger.g0.h(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, a() ? 0.9f : 0.84f);
            org.telegram.messenger.g0.h(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z10) {
            float f11 = ((org.telegram.ui.Components.la0) drawable).q;
            if (f10 != null) {
                f11 = f10.floatValue();
            }
            if (f11 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.g0.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
                org.telegram.messenger.g0.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
            org.telegram.messenger.g0.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(org.telegram.messenger.hs.e4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        org.telegram.messenger.g0.n2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(org.telegram.messenger.hs.e4);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i3, int i10) {
    }
}
