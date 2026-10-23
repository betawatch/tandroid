package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bd0 {
    public final Paint a;
    public final cd0 b;
    public final cd0 c;
    public final cd0 d;
    public final ad0 e;
    public final ad0 f;
    public final float[] g;
    public int h;
    public float i;

    public bd0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new cd0(tileMode);
        this.c = new cd0(tileMode);
        this.d = new cd0(Shader.TileMode.REPEAT);
        this.e = new ad0(R.raw.wallpaper_pos_intensity);
        this.f = new ad0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        cd0 cd0Var = this.b;
        boolean b10 = cd0Var.b(bitmap);
        cd0 cd0Var2 = this.d;
        boolean b11 = b10 | cd0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            cd0 cd0Var3 = this.c;
            if ((b11 | cd0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ad0 ad0Var = this.e;
                ad0Var.a.setInputBuffer("shaderPattern", cd0Var2.d);
                ad0Var.a.setInputBuffer("shaderGradient", cd0Var.d);
                ad0Var.a.setInputBuffer("shaderGradientSoftLight", cd0Var3.d);
                ad0Var.a.setFloatUniform("transformGradient", ad0Var.b);
                ad0Var.a.setFloatUniform("transformPattern", ad0Var.c);
                paint.setShader(ad0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.r.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                ad0 ad0Var2 = this.f;
                ad0Var2.a.setInputBuffer("shaderPattern", cd0Var2.d);
                ad0Var2.a.setInputBuffer("shaderGradient", cd0Var.d);
                ad0Var2.a.setFloatUniform("intensity", a2);
                ad0Var2.a.setFloatUniform("transformGradient", ad0Var2.b);
                ad0Var2.a.setFloatUniform("transformPattern", ad0Var2.c);
                paint.setShader(ad0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
