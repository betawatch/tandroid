package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class rc0 {
    public final Paint a;
    public final sc0 b;
    public final sc0 c;
    public final sc0 d;
    public final qc0 e;
    public final qc0 f;
    public final float[] g;
    public int h;
    public float i;

    public rc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new sc0(tileMode);
        this.c = new sc0(tileMode);
        this.d = new sc0(Shader.TileMode.REPEAT);
        this.e = new qc0(R.raw.wallpaper_pos_intensity);
        this.f = new qc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        sc0 sc0Var = this.b;
        boolean b10 = sc0Var.b(bitmap);
        sc0 sc0Var2 = this.d;
        boolean b11 = b10 | sc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            sc0 sc0Var3 = this.c;
            if ((b11 | sc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                qc0 qc0Var = this.e;
                qc0Var.a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var.a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var.a.setInputBuffer("shaderGradientSoftLight", sc0Var3.d);
                qc0Var.a.setFloatUniform("transformGradient", qc0Var.b);
                qc0Var.a.setFloatUniform("transformPattern", qc0Var.c);
                paint.setShader(qc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                qc0 qc0Var2 = this.f;
                qc0Var2.a.setInputBuffer("shaderPattern", sc0Var2.d);
                qc0Var2.a.setInputBuffer("shaderGradient", sc0Var.d);
                qc0Var2.a.setFloatUniform("intensity", a2);
                qc0Var2.a.setFloatUniform("transformGradient", qc0Var2.b);
                qc0Var2.a.setFloatUniform("transformPattern", qc0Var2.c);
                paint.setShader(qc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
