package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fc0 {
    public final Paint a;
    public final gc0 b;
    public final gc0 c;
    public final gc0 d;
    public final ec0 e;
    public final ec0 f;
    public final float[] g;
    public int h;
    public float i;

    public fc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new gc0(tileMode);
        this.c = new gc0(tileMode);
        this.d = new gc0(Shader.TileMode.REPEAT);
        this.e = new ec0(R.raw.wallpaper_pos_intensity);
        this.f = new ec0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        gc0 gc0Var = this.b;
        boolean b10 = gc0Var.b(bitmap);
        gc0 gc0Var2 = this.d;
        boolean b11 = b10 | gc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            gc0 gc0Var3 = this.c;
            if ((b11 | gc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ec0 ec0Var = this.e;
                ec0Var.a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var.a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var.a.setInputBuffer("shaderGradientSoftLight", gc0Var3.d);
                ec0Var.a.setFloatUniform("transformGradient", ec0Var.b);
                ec0Var.a.setFloatUniform("transformPattern", ec0Var.c);
                paint.setShader(ec0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                ec0 ec0Var2 = this.f;
                ec0Var2.a.setInputBuffer("shaderPattern", gc0Var2.d);
                ec0Var2.a.setInputBuffer("shaderGradient", gc0Var.d);
                ec0Var2.a.setFloatUniform("intensity", a2);
                ec0Var2.a.setFloatUniform("transformGradient", ec0Var2.b);
                ec0Var2.a.setFloatUniform("transformPattern", ec0Var2.c);
                paint.setShader(ec0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
