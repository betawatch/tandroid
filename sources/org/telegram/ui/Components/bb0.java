package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bb0 {
    public final Paint a;
    public final cb0 b;
    public final cb0 c;
    public final cb0 d;
    public final ab0 e;
    public final ab0 f;
    public final float[] g;
    public int h;
    public float i;

    public bb0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new cb0(tileMode);
        this.c = new cb0(tileMode);
        this.d = new cb0(Shader.TileMode.REPEAT);
        this.e = new ab0(R.raw.wallpaper_pos_intensity);
        this.f = new ab0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i7, int i10) {
        cb0 cb0Var = this.b;
        boolean b10 = cb0Var.b(bitmap);
        cb0 cb0Var2 = this.d;
        boolean b11 = b10 | cb0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i10 >= 0) {
            cb0 cb0Var3 = this.c;
            if ((b11 | cb0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ab0 ab0Var = this.e;
                ab0Var.a.setInputBuffer("shaderPattern", cb0Var2.d);
                ab0Var.a.setInputBuffer("shaderGradient", cb0Var.d);
                ab0Var.a.setInputBuffer("shaderGradientSoftLight", cb0Var3.d);
                ab0Var.a.setFloatUniform("transformGradient", ab0Var.b);
                ab0Var.a.setFloatUniform("transformPattern", ab0Var.c);
                paint.setShader(ab0Var.a);
                return paint;
            }
        } else {
            float a10 = c8.m9.a((i7 * (-i10)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a10 || this.h != 2) {
                this.h = 2;
                this.i = a10;
                ab0 ab0Var2 = this.f;
                ab0Var2.a.setInputBuffer("shaderPattern", cb0Var2.d);
                ab0Var2.a.setInputBuffer("shaderGradient", cb0Var.d);
                ab0Var2.a.setFloatUniform("intensity", a10);
                ab0Var2.a.setFloatUniform("transformGradient", ab0Var2.b);
                ab0Var2.a.setFloatUniform("transformPattern", ab0Var2.c);
                paint.setShader(ab0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
