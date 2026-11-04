package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oa0 {
    public final Paint a;
    public final pa0 b;
    public final pa0 c;
    public final pa0 d;
    public final na0 e;
    public final na0 f;
    public final float[] g;
    public int h;
    public float i;

    public oa0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new pa0(tileMode);
        this.c = new pa0(tileMode);
        this.d = new pa0(Shader.TileMode.REPEAT);
        this.e = new na0(R.raw.wallpaper_pos_intensity);
        this.f = new na0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i3, int i10) {
        pa0 pa0Var = this.b;
        boolean b10 = pa0Var.b(bitmap);
        pa0 pa0Var2 = this.d;
        boolean b11 = b10 | pa0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            pa0 pa0Var3 = this.c;
            if ((b11 | pa0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                na0 na0Var = this.e;
                na0Var.a.setInputBuffer("shaderPattern", pa0Var2.d);
                na0Var.a.setInputBuffer("shaderGradient", pa0Var.d);
                na0Var.a.setInputBuffer("shaderGradientSoftLight", pa0Var3.d);
                na0Var.a.setFloatUniform("transformGradient", na0Var.b);
                na0Var.a.setFloatUniform("transformPattern", na0Var.c);
                paint.setShader(na0Var.a);
                return paint;
            }
        } else {
            float a10 = b8.be.a((i3 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                na0 na0Var2 = this.f;
                na0Var2.a.setInputBuffer("shaderPattern", pa0Var2.d);
                na0Var2.a.setInputBuffer("shaderGradient", pa0Var.d);
                na0Var2.a.setFloatUniform("intensity", a10);
                na0Var2.a.setFloatUniform("transformGradient", na0Var2.b);
                na0Var2.a.setFloatUniform("transformPattern", na0Var2.c);
                paint.setShader(na0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
