package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ic0 {
    public final Paint a;
    public final jc0 b;
    public final jc0 c;
    public final jc0 d;
    public final hc0 e;
    public final hc0 f;
    public final float[] g;
    public int h;
    public float i;

    public ic0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new jc0(tileMode);
        this.c = new jc0(tileMode);
        this.d = new jc0(Shader.TileMode.REPEAT);
        this.e = new hc0(R.raw.wallpaper_pos_intensity);
        this.f = new hc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        jc0 jc0Var = this.b;
        boolean b10 = jc0Var.b(bitmap);
        jc0 jc0Var2 = this.d;
        boolean b11 = b10 | jc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            jc0 jc0Var3 = this.c;
            if ((b11 | jc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                hc0 hc0Var = this.e;
                hc0Var.a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var.a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var.a.setInputBuffer("shaderGradientSoftLight", jc0Var3.d);
                hc0Var.a.setFloatUniform("transformGradient", hc0Var.b);
                hc0Var.a.setFloatUniform("transformPattern", hc0Var.c);
                paint.setShader(hc0Var.a);
                return paint;
            }
        } else {
            float a2 = k7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                hc0 hc0Var2 = this.f;
                hc0Var2.a.setInputBuffer("shaderPattern", jc0Var2.d);
                hc0Var2.a.setInputBuffer("shaderGradient", jc0Var.d);
                hc0Var2.a.setFloatUniform("intensity", a2);
                hc0Var2.a.setFloatUniform("transformGradient", hc0Var2.b);
                hc0Var2.a.setFloatUniform("transformPattern", hc0Var2.c);
                paint.setShader(hc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
