package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pc0 {
    public final Paint a;
    public final qc0 b;
    public final qc0 c;
    public final qc0 d;
    public final oc0 e;
    public final oc0 f;
    public final float[] g;
    public int h;
    public float i;

    public pc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new qc0(tileMode);
        this.c = new qc0(tileMode);
        this.d = new qc0(Shader.TileMode.REPEAT);
        this.e = new oc0(R.raw.wallpaper_pos_intensity);
        this.f = new oc0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        qc0 qc0Var = this.b;
        boolean b10 = qc0Var.b(bitmap);
        qc0 qc0Var2 = this.d;
        boolean b11 = b10 | qc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            qc0 qc0Var3 = this.c;
            if ((b11 | qc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                oc0 oc0Var = this.e;
                oc0Var.a.setInputBuffer("shaderPattern", qc0Var2.d);
                oc0Var.a.setInputBuffer("shaderGradient", qc0Var.d);
                oc0Var.a.setInputBuffer("shaderGradientSoftLight", qc0Var3.d);
                oc0Var.a.setFloatUniform("transformGradient", oc0Var.b);
                oc0Var.a.setFloatUniform("transformPattern", oc0Var.c);
                paint.setShader(oc0Var.a);
                return paint;
            }
        } else {
            float a2 = w7.q.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                oc0 oc0Var2 = this.f;
                oc0Var2.a.setInputBuffer("shaderPattern", qc0Var2.d);
                oc0Var2.a.setInputBuffer("shaderGradient", qc0Var.d);
                oc0Var2.a.setFloatUniform("intensity", a2);
                oc0Var2.a.setFloatUniform("transformGradient", oc0Var2.b);
                oc0Var2.a.setFloatUniform("transformPattern", oc0Var2.c);
                paint.setShader(oc0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
