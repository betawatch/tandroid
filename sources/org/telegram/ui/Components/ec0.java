package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ec0 {
    public final Paint a;
    public final fc0 b;
    public final fc0 c;
    public final fc0 d;
    public final dc0 e;
    public final dc0 f;
    public final float[] g;
    public int h;
    public float i;

    public ec0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new fc0(tileMode);
        this.c = new fc0(tileMode);
        this.d = new fc0(Shader.TileMode.REPEAT);
        this.e = new dc0(R.raw.wallpaper_pos_intensity);
        this.f = new dc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        fc0 fc0Var = this.b;
        boolean b10 = fc0Var.b(bitmap);
        fc0 fc0Var2 = this.d;
        boolean b11 = b10 | fc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            fc0 fc0Var3 = this.c;
            if ((b11 | fc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                dc0 dc0Var = this.e;
                dc0Var.a.setInputBuffer("shaderPattern", fc0Var2.d);
                dc0Var.a.setInputBuffer("shaderGradient", fc0Var.d);
                dc0Var.a.setInputBuffer("shaderGradientSoftLight", fc0Var3.d);
                dc0Var.a.setFloatUniform("transformGradient", dc0Var.b);
                dc0Var.a.setFloatUniform("transformPattern", dc0Var.c);
                paint.setShader(dc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.p.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                dc0 dc0Var2 = this.f;
                dc0Var2.a.setInputBuffer("shaderPattern", fc0Var2.d);
                dc0Var2.a.setInputBuffer("shaderGradient", fc0Var.d);
                dc0Var2.a.setFloatUniform("intensity", a2);
                dc0Var2.a.setFloatUniform("transformGradient", dc0Var2.b);
                dc0Var2.a.setFloatUniform("transformPattern", dc0Var2.c);
                paint.setShader(dc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
