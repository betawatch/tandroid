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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n81 implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.p6 a;
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
    public final /* synthetic */ m91 l;
    public final /* synthetic */ m91 m;

    public n81(m91 m91Var) {
        this.m = m91Var;
        this.l = m91Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.tz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.tz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        e91 e91Var = this.m.q1;
        if (e91Var != null) {
            return e91Var.a();
        }
        e91 e91Var2 = this.l.q1;
        if (e91Var2 != null) {
            return e91Var2.a();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        return p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.t6.s(bitmap, bitmapShader, this.k, i10, i11, f7, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
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
                org.telegram.ui.ActionBar.p6 p6Var = this.a;
                return p6Var != null ? p6Var.d(str) : org.telegram.ui.ActionBar.t6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        return org.telegram.messenger.tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean g() {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        return p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        return p6Var != null ? p6Var.getDrawable(str) : org.telegram.ui.ActionBar.t6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        return p6Var != null ? p6Var.j(i10) : h(i10);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f7) {
        int i10 = org.telegram.ui.ActionBar.t6.Zc;
        int h = h(i10);
        int h10 = h(org.telegram.ui.ActionBar.t6.ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.jb0;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.tz.o() != 0 && org.telegram.messenger.sc.e(32)) {
            Bitmap bitmap = z10 ? ((org.telegram.ui.Components.jb0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
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
            int i11 = org.telegram.ui.ActionBar.t6.Wc;
            textPaint2.setColor(h(i11));
            textPaint.setColor(h(i11));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.t6.Xc);
        }
        Paint paint = this.c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h10);
        if (this.j == null || !(this.b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.jb0) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.i0.n2(colorMatrix, a() ? 0.97f : 0.92f);
                org.telegram.messenger.i0.h(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                org.telegram.messenger.i0.n2(colorMatrix, a() ? 0.4f : 0.8f);
                org.telegram.messenger.i0.h(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.i0.n2(colorMatrix, a() ? 0.9f : 0.84f);
            org.telegram.messenger.i0.h(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z10) {
            float f10 = ((org.telegram.ui.Components.jb0) drawable).q;
            if (f7 != null) {
                f10 = f7.floatValue();
            }
            if (f10 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                org.telegram.messenger.i0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.i0.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                org.telegram.messenger.i0.n2(colorMatrix, 0.35f);
                org.telegram.messenger.i0.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.97f);
            org.telegram.messenger.i0.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(org.telegram.messenger.zs.e4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        org.telegram.messenger.i0.n2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(org.telegram.messenger.zs.e4);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void i(int i10, int i11) {
    }
}
