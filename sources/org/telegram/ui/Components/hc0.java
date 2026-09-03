package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hc0 {
    public final Paint a;
    public final ic0 b;
    public final ic0 c;
    public final ic0 d;
    public final gc0 e;
    public final gc0 f;
    public final float[] g;
    public int h;
    public float i;

    public hc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new ic0(tileMode);
        this.c = new ic0(tileMode);
        this.d = new ic0(Shader.TileMode.REPEAT);
        this.e = new gc0(R.raw.wallpaper_pos_intensity);
        this.f = new gc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        ic0 ic0Var = this.b;
        boolean b10 = ic0Var.b(bitmap);
        ic0 ic0Var2 = this.d;
        boolean b11 = b10 | ic0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            ic0 ic0Var3 = this.c;
            if ((b11 | ic0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                gc0 gc0Var = this.e;
                gc0Var.a.setInputBuffer("shaderPattern", ic0Var2.d);
                gc0Var.a.setInputBuffer("shaderGradient", ic0Var.d);
                gc0Var.a.setInputBuffer("shaderGradientSoftLight", ic0Var3.d);
                gc0Var.a.setFloatUniform("transformGradient", gc0Var.b);
                gc0Var.a.setFloatUniform("transformPattern", gc0Var.c);
                paint.setShader(gc0Var.a);
                return paint;
            }
        } else {
            float a2 = k7.n.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                gc0 gc0Var2 = this.f;
                gc0Var2.a.setInputBuffer("shaderPattern", ic0Var2.d);
                gc0Var2.a.setInputBuffer("shaderGradient", ic0Var.d);
                gc0Var2.a.setFloatUniform("intensity", a2);
                gc0Var2.a.setFloatUniform("transformGradient", gc0Var2.b);
                gc0Var2.a.setFloatUniform("transformPattern", gc0Var2.c);
                paint.setShader(gc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
