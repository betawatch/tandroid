package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class eb0 {
    public final Paint a;
    public final fb0 b;
    public final fb0 c;
    public final fb0 d;
    public final db0 e;
    public final db0 f;
    public final float[] g;
    public int h;
    public float i;

    public eb0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new fb0(tileMode);
        this.c = new fb0(tileMode);
        this.d = new fb0(Shader.TileMode.REPEAT);
        this.e = new db0(R.raw.wallpaper_pos_intensity);
        this.f = new db0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        fb0 fb0Var = this.b;
        boolean b10 = fb0Var.b(bitmap);
        fb0 fb0Var2 = this.d;
        boolean b11 = b10 | fb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            fb0 fb0Var3 = this.c;
            if ((b11 | fb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                db0 db0Var = this.e;
                db0Var.a.setInputBuffer("shaderPattern", fb0Var2.d);
                db0Var.a.setInputBuffer("shaderGradient", fb0Var.d);
                db0Var.a.setInputBuffer("shaderGradientSoftLight", fb0Var3.d);
                db0Var.a.setFloatUniform("transformGradient", db0Var.b);
                db0Var.a.setFloatUniform("transformPattern", db0Var.c);
                paint.setShader(db0Var.a);
                return paint;
            }
        } else {
            float a10 = c8.l9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                db0 db0Var2 = this.f;
                db0Var2.a.setInputBuffer("shaderPattern", fb0Var2.d);
                db0Var2.a.setInputBuffer("shaderGradient", fb0Var.d);
                db0Var2.a.setFloatUniform("intensity", a10);
                db0Var2.a.setFloatUniform("transformGradient", db0Var2.b);
                db0Var2.a.setFloatUniform("transformPattern", db0Var2.c);
                paint.setShader(db0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
