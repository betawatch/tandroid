package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zc0 {
    public final Paint a;
    public final ad0 b;
    public final ad0 c;
    public final ad0 d;
    public final yc0 e;
    public final yc0 f;
    public final float[] g;
    public int h;
    public float i;

    public zc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new ad0(tileMode);
        this.c = new ad0(tileMode);
        this.d = new ad0(Shader.TileMode.REPEAT);
        this.e = new yc0(R.raw.wallpaper_pos_intensity);
        this.f = new yc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        ad0 ad0Var = this.b;
        boolean b10 = ad0Var.b(bitmap);
        ad0 ad0Var2 = this.d;
        boolean b11 = b10 | ad0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            ad0 ad0Var3 = this.c;
            if ((b11 | ad0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                yc0 yc0Var = this.e;
                yc0Var.a.setInputBuffer("shaderPattern", ad0Var2.d);
                yc0Var.a.setInputBuffer("shaderGradient", ad0Var.d);
                yc0Var.a.setInputBuffer("shaderGradientSoftLight", ad0Var3.d);
                yc0Var.a.setFloatUniform("transformGradient", yc0Var.b);
                yc0Var.a.setFloatUniform("transformPattern", yc0Var.c);
                paint.setShader(yc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.r.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                yc0 yc0Var2 = this.f;
                yc0Var2.a.setInputBuffer("shaderPattern", ad0Var2.d);
                yc0Var2.a.setInputBuffer("shaderGradient", ad0Var.d);
                yc0Var2.a.setFloatUniform("intensity", a2);
                yc0Var2.a.setFloatUniform("transformGradient", yc0Var2.b);
                yc0Var2.a.setFloatUniform("transformPattern", yc0Var2.c);
                paint.setShader(yc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
