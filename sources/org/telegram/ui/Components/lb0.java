package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lb0 {
    public final Paint a;
    public final mb0 b;
    public final mb0 c;
    public final mb0 d;
    public final kb0 e;
    public final kb0 f;
    public final float[] g;
    public int h;
    public float i;

    public lb0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new mb0(tileMode);
        this.c = new mb0(tileMode);
        this.d = new mb0(Shader.TileMode.REPEAT);
        this.e = new kb0(R.raw.wallpaper_pos_intensity);
        this.f = new kb0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        mb0 mb0Var = this.b;
        boolean b10 = mb0Var.b(bitmap);
        mb0 mb0Var2 = this.d;
        boolean b11 = b10 | mb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            mb0 mb0Var3 = this.c;
            if ((b11 | mb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                kb0 kb0Var = this.e;
                kb0Var.a.setInputBuffer("shaderPattern", mb0Var2.d);
                kb0Var.a.setInputBuffer("shaderGradient", mb0Var.d);
                kb0Var.a.setInputBuffer("shaderGradientSoftLight", mb0Var3.d);
                kb0Var.a.setFloatUniform("transformGradient", kb0Var.b);
                kb0Var.a.setFloatUniform("transformPattern", kb0Var.c);
                paint.setShader(kb0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.u.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                kb0 kb0Var2 = this.f;
                kb0Var2.a.setInputBuffer("shaderPattern", mb0Var2.d);
                kb0Var2.a.setInputBuffer("shaderGradient", mb0Var.d);
                kb0Var2.a.setFloatUniform("intensity", a2);
                kb0Var2.a.setFloatUniform("transformGradient", kb0Var2.b);
                kb0Var2.a.setFloatUniform("transformPattern", kb0Var2.c);
                paint.setShader(kb0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
