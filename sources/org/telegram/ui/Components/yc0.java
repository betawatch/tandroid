package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yc0 {
    public final Paint a;
    public final zc0 b;
    public final zc0 c;
    public final zc0 d;
    public final xc0 e;
    public final xc0 f;
    public final float[] g;
    public int h;
    public float i;

    public yc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new zc0(tileMode);
        this.c = new zc0(tileMode);
        this.d = new zc0(Shader.TileMode.REPEAT);
        this.e = new xc0(R.raw.wallpaper_pos_intensity);
        this.f = new xc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        zc0 zc0Var = this.b;
        boolean b10 = zc0Var.b(bitmap);
        zc0 zc0Var2 = this.d;
        boolean b11 = b10 | zc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            zc0 zc0Var3 = this.c;
            if ((b11 | zc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                xc0 xc0Var = this.e;
                xc0Var.a.setInputBuffer("shaderPattern", zc0Var2.d);
                xc0Var.a.setInputBuffer("shaderGradient", zc0Var.d);
                xc0Var.a.setInputBuffer("shaderGradientSoftLight", zc0Var3.d);
                xc0Var.a.setFloatUniform("transformGradient", xc0Var.b);
                xc0Var.a.setFloatUniform("transformPattern", xc0Var.c);
                paint.setShader(xc0Var.a);
                return paint;
            }
        } else {
            float a2 = a8.ee.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                xc0 xc0Var2 = this.f;
                xc0Var2.a.setInputBuffer("shaderPattern", zc0Var2.d);
                xc0Var2.a.setInputBuffer("shaderGradient", zc0Var.d);
                xc0Var2.a.setFloatUniform("intensity", a2);
                xc0Var2.a.setFloatUniform("transformGradient", xc0Var2.b);
                xc0Var2.a.setFloatUniform("transformPattern", xc0Var2.c);
                paint.setShader(xc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
