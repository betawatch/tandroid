package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oc0 {
    public final Paint a;
    public final pc0 b;
    public final pc0 c;
    public final pc0 d;
    public final nc0 e;
    public final nc0 f;
    public final float[] g;
    public int h;
    public float i;

    public oc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new pc0(tileMode);
        this.c = new pc0(tileMode);
        this.d = new pc0(Shader.TileMode.REPEAT);
        this.e = new nc0(R.raw.wallpaper_pos_intensity);
        this.f = new nc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        pc0 pc0Var = this.b;
        boolean b10 = pc0Var.b(bitmap);
        pc0 pc0Var2 = this.d;
        boolean b11 = b10 | pc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            pc0 pc0Var3 = this.c;
            if ((b11 | pc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                nc0 nc0Var = this.e;
                nc0Var.a.setInputBuffer("shaderPattern", pc0Var2.d);
                nc0Var.a.setInputBuffer("shaderGradient", pc0Var.d);
                nc0Var.a.setInputBuffer("shaderGradientSoftLight", pc0Var3.d);
                nc0Var.a.setFloatUniform("transformGradient", nc0Var.b);
                nc0Var.a.setFloatUniform("transformPattern", nc0Var.c);
                paint.setShader(nc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                nc0 nc0Var2 = this.f;
                nc0Var2.a.setInputBuffer("shaderPattern", pc0Var2.d);
                nc0Var2.a.setInputBuffer("shaderGradient", pc0Var.d);
                nc0Var2.a.setFloatUniform("intensity", a2);
                nc0Var2.a.setFloatUniform("transformGradient", nc0Var2.b);
                nc0Var2.a.setFloatUniform("transformPattern", nc0Var2.c);
                paint.setShader(nc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
