package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ua0 {
    public final Paint a;
    public final va0 b;
    public final va0 c;
    public final va0 d;
    public final ta0 e;
    public final ta0 f;
    public final float[] g;
    public int h;
    public float i;

    public ua0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new va0(tileMode);
        this.c = new va0(tileMode);
        this.d = new va0(Shader.TileMode.REPEAT);
        this.e = new ta0(R.raw.wallpaper_pos_intensity);
        this.f = new ta0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        va0 va0Var = this.b;
        boolean b10 = va0Var.b(bitmap);
        va0 va0Var2 = this.d;
        boolean b11 = b10 | va0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            va0 va0Var3 = this.c;
            if ((b11 | va0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ta0 ta0Var = this.e;
                ta0Var.a.setInputBuffer("shaderPattern", va0Var2.d);
                ta0Var.a.setInputBuffer("shaderGradient", va0Var.d);
                ta0Var.a.setInputBuffer("shaderGradientSoftLight", va0Var3.d);
                ta0Var.a.setFloatUniform("transformGradient", ta0Var.b);
                ta0Var.a.setFloatUniform("transformPattern", ta0Var.c);
                paint.setShader(ta0Var.a);
                return paint;
            }
        } else {
            float a10 = c8.j9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                ta0 ta0Var2 = this.f;
                ta0Var2.a.setInputBuffer("shaderPattern", va0Var2.d);
                ta0Var2.a.setInputBuffer("shaderGradient", va0Var.d);
                ta0Var2.a.setFloatUniform("intensity", a10);
                ta0Var2.a.setFloatUniform("transformGradient", ta0Var2.b);
                ta0Var2.a.setFloatUniform("transformPattern", ta0Var2.c);
                paint.setShader(ta0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
