package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xc0 {
    public final Paint a;
    public final yc0 b;
    public final yc0 c;
    public final yc0 d;
    public final wc0 e;
    public final wc0 f;
    public final float[] g;
    public int h;
    public float i;

    public xc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new yc0(tileMode);
        this.c = new yc0(tileMode);
        this.d = new yc0(Shader.TileMode.REPEAT);
        this.e = new wc0(R.raw.wallpaper_pos_intensity);
        this.f = new wc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        yc0 yc0Var = this.b;
        boolean b10 = yc0Var.b(bitmap);
        yc0 yc0Var2 = this.d;
        boolean b11 = b10 | yc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            yc0 yc0Var3 = this.c;
            if ((b11 | yc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                wc0 wc0Var = this.e;
                wc0Var.a.setInputBuffer("shaderPattern", yc0Var2.d);
                wc0Var.a.setInputBuffer("shaderGradient", yc0Var.d);
                wc0Var.a.setInputBuffer("shaderGradientSoftLight", yc0Var3.d);
                wc0Var.a.setFloatUniform("transformGradient", wc0Var.b);
                wc0Var.a.setFloatUniform("transformPattern", wc0Var.c);
                paint.setShader(wc0Var.a);
                return paint;
            }
        } else {
            float a2 = a8.ee.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                wc0 wc0Var2 = this.f;
                wc0Var2.a.setInputBuffer("shaderPattern", yc0Var2.d);
                wc0Var2.a.setInputBuffer("shaderGradient", yc0Var.d);
                wc0Var2.a.setFloatUniform("intensity", a2);
                wc0Var2.a.setFloatUniform("transformGradient", wc0Var2.b);
                wc0Var2.a.setFloatUniform("transformPattern", wc0Var2.c);
                paint.setShader(wc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
