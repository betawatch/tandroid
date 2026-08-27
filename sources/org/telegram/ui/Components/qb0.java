package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qb0 {
    public final Paint a;
    public final rb0 b;
    public final rb0 c;
    public final rb0 d;
    public final pb0 e;
    public final pb0 f;
    public final float[] g;
    public int h;
    public float i;

    public qb0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new rb0(tileMode);
        this.c = new rb0(tileMode);
        this.d = new rb0(Shader.TileMode.REPEAT);
        this.e = new pb0(R.raw.wallpaper_pos_intensity);
        this.f = new pb0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        rb0 rb0Var = this.b;
        boolean b10 = rb0Var.b(bitmap);
        rb0 rb0Var2 = this.d;
        boolean b11 = b10 | rb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            rb0 rb0Var3 = this.c;
            if ((b11 | rb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                pb0 pb0Var = this.e;
                pb0Var.a.setInputBuffer("shaderPattern", rb0Var2.d);
                pb0Var.a.setInputBuffer("shaderGradient", rb0Var.d);
                pb0Var.a.setInputBuffer("shaderGradientSoftLight", rb0Var3.d);
                pb0Var.a.setFloatUniform("transformGradient", pb0Var.b);
                pb0Var.a.setFloatUniform("transformPattern", pb0Var.c);
                paint.setShader(pb0Var.a);
                return paint;
            }
        } else {
            float a2 = h7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                pb0 pb0Var2 = this.f;
                pb0Var2.a.setInputBuffer("shaderPattern", rb0Var2.d);
                pb0Var2.a.setInputBuffer("shaderGradient", rb0Var.d);
                pb0Var2.a.setFloatUniform("intensity", a2);
                pb0Var2.a.setFloatUniform("transformGradient", pb0Var2.b);
                pb0Var2.a.setFloatUniform("transformPattern", pb0Var2.c);
                paint.setShader(pb0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
