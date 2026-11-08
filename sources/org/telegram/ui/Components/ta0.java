package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ta0 {
    public final Paint a;
    public final ua0 b;
    public final ua0 c;
    public final ua0 d;
    public final sa0 e;
    public final sa0 f;
    public final float[] g;
    public int h;
    public float i;

    public ta0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new ua0(tileMode);
        this.c = new ua0(tileMode);
        this.d = new ua0(Shader.TileMode.REPEAT);
        this.e = new sa0(R.raw.wallpaper_pos_intensity);
        this.f = new sa0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        ua0 ua0Var = this.b;
        boolean b10 = ua0Var.b(bitmap);
        ua0 ua0Var2 = this.d;
        boolean b11 = b10 | ua0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            ua0 ua0Var3 = this.c;
            if ((b11 | ua0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                sa0 sa0Var = this.e;
                sa0Var.a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var.a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var.a.setInputBuffer("shaderGradientSoftLight", ua0Var3.d);
                sa0Var.a.setFloatUniform("transformGradient", sa0Var.b);
                sa0Var.a.setFloatUniform("transformPattern", sa0Var.c);
                paint.setShader(sa0Var.a);
                return paint;
            }
        } else {
            float a10 = c8.j9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                sa0 sa0Var2 = this.f;
                sa0Var2.a.setInputBuffer("shaderPattern", ua0Var2.d);
                sa0Var2.a.setInputBuffer("shaderGradient", ua0Var.d);
                sa0Var2.a.setFloatUniform("intensity", a10);
                sa0Var2.a.setFloatUniform("transformGradient", sa0Var2.b);
                sa0Var2.a.setFloatUniform("transformPattern", sa0Var2.c);
                paint.setShader(sa0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
