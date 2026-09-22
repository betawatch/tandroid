package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qc0 {
    public final Paint a;
    public final rc0 b;
    public final rc0 c;
    public final rc0 d;
    public final pc0 e;
    public final pc0 f;
    public final float[] g;
    public int h;
    public float i;

    public qc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new rc0(tileMode);
        this.c = new rc0(tileMode);
        this.d = new rc0(Shader.TileMode.REPEAT);
        this.e = new pc0(R.raw.wallpaper_pos_intensity);
        this.f = new pc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        rc0 rc0Var = this.b;
        boolean b10 = rc0Var.b(bitmap);
        rc0 rc0Var2 = this.d;
        boolean b11 = b10 | rc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            rc0 rc0Var3 = this.c;
            if ((b11 | rc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                pc0 pc0Var = this.e;
                pc0Var.a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var.a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var.a.setInputBuffer("shaderGradientSoftLight", rc0Var3.d);
                pc0Var.a.setFloatUniform("transformGradient", pc0Var.b);
                pc0Var.a.setFloatUniform("transformPattern", pc0Var.c);
                paint.setShader(pc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                pc0 pc0Var2 = this.f;
                pc0Var2.a.setInputBuffer("shaderPattern", rc0Var2.d);
                pc0Var2.a.setInputBuffer("shaderGradient", rc0Var.d);
                pc0Var2.a.setFloatUniform("intensity", a2);
                pc0Var2.a.setFloatUniform("transformGradient", pc0Var2.b);
                pc0Var2.a.setFloatUniform("transformPattern", pc0Var2.c);
                paint.setShader(pc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
