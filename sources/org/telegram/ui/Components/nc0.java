package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nc0 {
    public final Paint a;
    public final oc0 b;
    public final oc0 c;
    public final oc0 d;
    public final mc0 e;
    public final mc0 f;
    public final float[] g;
    public int h;
    public float i;

    public nc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new oc0(tileMode);
        this.c = new oc0(tileMode);
        this.d = new oc0(Shader.TileMode.REPEAT);
        this.e = new mc0(R.raw.wallpaper_pos_intensity);
        this.f = new mc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        oc0 oc0Var = this.b;
        boolean b10 = oc0Var.b(bitmap);
        oc0 oc0Var2 = this.d;
        boolean b11 = b10 | oc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            oc0 oc0Var3 = this.c;
            if ((b11 | oc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                mc0 mc0Var = this.e;
                mc0Var.a.setInputBuffer("shaderPattern", oc0Var2.d);
                mc0Var.a.setInputBuffer("shaderGradient", oc0Var.d);
                mc0Var.a.setInputBuffer("shaderGradientSoftLight", oc0Var3.d);
                mc0Var.a.setFloatUniform("transformGradient", mc0Var.b);
                mc0Var.a.setFloatUniform("transformPattern", mc0Var.c);
                paint.setShader(mc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                mc0 mc0Var2 = this.f;
                mc0Var2.a.setInputBuffer("shaderPattern", oc0Var2.d);
                mc0Var2.a.setInputBuffer("shaderGradient", oc0Var.d);
                mc0Var2.a.setFloatUniform("intensity", a2);
                mc0Var2.a.setFloatUniform("transformGradient", mc0Var2.b);
                mc0Var2.a.setFloatUniform("transformPattern", mc0Var2.c);
                paint.setShader(mc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
