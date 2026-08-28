package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mb0 {
    public final Paint a;
    public final nb0 b;
    public final nb0 c;
    public final nb0 d;
    public final lb0 e;
    public final lb0 f;
    public final float[] g;
    public int h;
    public float i;

    public mb0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new nb0(tileMode);
        this.c = new nb0(tileMode);
        this.d = new nb0(Shader.TileMode.REPEAT);
        this.e = new lb0(R.raw.wallpaper_pos_intensity);
        this.f = new lb0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i9, int i10) {
        nb0 nb0Var = this.b;
        boolean b10 = nb0Var.b(bitmap);
        nb0 nb0Var2 = this.d;
        boolean b11 = b10 | nb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            nb0 nb0Var3 = this.c;
            if ((b11 | nb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                lb0 lb0Var = this.e;
                lb0Var.a.setInputBuffer("shaderPattern", nb0Var2.d);
                lb0Var.a.setInputBuffer("shaderGradient", nb0Var.d);
                lb0Var.a.setInputBuffer("shaderGradientSoftLight", nb0Var3.d);
                lb0Var.a.setFloatUniform("transformGradient", lb0Var.b);
                lb0Var.a.setFloatUniform("transformPattern", lb0Var.c);
                paint.setShader(lb0Var.a);
                return paint;
            }
        } else {
            float a2 = g7.n.a((i9 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                lb0 lb0Var2 = this.f;
                lb0Var2.a.setInputBuffer("shaderPattern", nb0Var2.d);
                lb0Var2.a.setInputBuffer("shaderGradient", nb0Var.d);
                lb0Var2.a.setFloatUniform("intensity", a2);
                lb0Var2.a.setFloatUniform("transformGradient", lb0Var2.b);
                lb0Var2.a.setFloatUniform("transformPattern", lb0Var2.c);
                paint.setShader(lb0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
