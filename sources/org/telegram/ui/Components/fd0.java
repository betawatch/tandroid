package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fd0 {
    public final Paint a;
    public final gd0 b;
    public final gd0 c;
    public final gd0 d;
    public final ed0 e;
    public final ed0 f;
    public final float[] g;
    public int h;
    public float i;

    public fd0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new gd0(tileMode);
        this.c = new gd0(tileMode);
        this.d = new gd0(Shader.TileMode.REPEAT);
        this.e = new ed0(R.raw.wallpaper_pos_intensity);
        this.f = new ed0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gd0 gd0Var = this.b;
        boolean b10 = gd0Var.b(bitmap);
        gd0 gd0Var2 = this.d;
        boolean b11 = b10 | gd0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            gd0 gd0Var3 = this.c;
            if ((b11 | gd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ed0 ed0Var = this.e;
                ed0Var.a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var.a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var.a.setInputBuffer("shaderGradientSoftLight", gd0Var3.d);
                ed0Var.a.setFloatUniform("transformGradient", ed0Var.b);
                ed0Var.a.setFloatUniform("transformPattern", ed0Var.c);
                paint.setShader(ed0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.o.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                ed0 ed0Var2 = this.f;
                ed0Var2.a.setInputBuffer("shaderPattern", gd0Var2.d);
                ed0Var2.a.setInputBuffer("shaderGradient", gd0Var.d);
                ed0Var2.a.setFloatUniform("intensity", a2);
                ed0Var2.a.setFloatUniform("transformGradient", ed0Var2.b);
                ed0Var2.a.setFloatUniform("transformPattern", ed0Var2.c);
                paint.setShader(ed0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
