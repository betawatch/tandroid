package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gc0 {
    public final Paint a;
    public final hc0 b;
    public final hc0 c;
    public final hc0 d;
    public final fc0 e;
    public final fc0 f;
    public final float[] g;
    public int h;
    public float i;

    public gc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new hc0(tileMode);
        this.c = new hc0(tileMode);
        this.d = new hc0(Shader.TileMode.REPEAT);
        this.e = new fc0(R.raw.wallpaper_pos_intensity);
        this.f = new fc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        hc0 hc0Var = this.b;
        boolean b10 = hc0Var.b(bitmap);
        hc0 hc0Var2 = this.d;
        boolean b11 = b10 | hc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            hc0 hc0Var3 = this.c;
            if ((b11 | hc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                fc0 fc0Var = this.e;
                fc0Var.a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var.a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var.a.setInputBuffer("shaderGradientSoftLight", hc0Var3.d);
                fc0Var.a.setFloatUniform("transformGradient", fc0Var.b);
                fc0Var.a.setFloatUniform("transformPattern", fc0Var.c);
                paint.setShader(fc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                fc0 fc0Var2 = this.f;
                fc0Var2.a.setInputBuffer("shaderPattern", hc0Var2.d);
                fc0Var2.a.setInputBuffer("shaderGradient", hc0Var.d);
                fc0Var2.a.setFloatUniform("intensity", a2);
                fc0Var2.a.setFloatUniform("transformGradient", fc0Var2.b);
                fc0Var2.a.setFloatUniform("transformPattern", fc0Var2.c);
                paint.setShader(fc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
