package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class db0 {
    public final Paint a;
    public final eb0 b;
    public final eb0 c;
    public final eb0 d;
    public final cb0 e;
    public final cb0 f;
    public final float[] g;
    public int h;
    public float i;

    public db0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new eb0(tileMode);
        this.c = new eb0(tileMode);
        this.d = new eb0(Shader.TileMode.REPEAT);
        this.e = new cb0(R.raw.wallpaper_pos_intensity);
        this.f = new cb0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        eb0 eb0Var = this.b;
        boolean b10 = eb0Var.b(bitmap);
        eb0 eb0Var2 = this.d;
        boolean b11 = b10 | eb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            eb0 eb0Var3 = this.c;
            if ((b11 | eb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                cb0 cb0Var = this.e;
                cb0Var.a.setInputBuffer("shaderPattern", eb0Var2.d);
                cb0Var.a.setInputBuffer("shaderGradient", eb0Var.d);
                cb0Var.a.setInputBuffer("shaderGradientSoftLight", eb0Var3.d);
                cb0Var.a.setFloatUniform("transformGradient", cb0Var.b);
                cb0Var.a.setFloatUniform("transformPattern", cb0Var.c);
                paint.setShader(cb0Var.a);
                return paint;
            }
        } else {
            float a10 = c8.l9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                cb0 cb0Var2 = this.f;
                cb0Var2.a.setInputBuffer("shaderPattern", eb0Var2.d);
                cb0Var2.a.setInputBuffer("shaderGradient", eb0Var.d);
                cb0Var2.a.setFloatUniform("intensity", a10);
                cb0Var2.a.setFloatUniform("transformGradient", cb0Var2.b);
                cb0Var2.a.setFloatUniform("transformPattern", cb0Var2.c);
                paint.setShader(cb0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
