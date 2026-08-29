package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bc0 {
    public final Paint a;
    public final cc0 b;
    public final cc0 c;
    public final cc0 d;
    public final ac0 e;
    public final ac0 f;
    public final float[] g;
    public int h;
    public float i;

    public bc0() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new cc0(tileMode);
        this.c = new cc0(tileMode);
        this.d = new cc0(Shader.TileMode.REPEAT);
        this.e = new ac0(R.raw.wallpaper_pos_intensity);
        this.f = new ac0(R.raw.wallpaper_neg_intensity);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i10, int i11) {
        cc0 cc0Var = this.b;
        boolean b10 = cc0Var.b(bitmap);
        cc0 cc0Var2 = this.d;
        boolean b11 = b10 | cc0Var2.b(bitmap2);
        Paint paint = this.a;
        if (i11 >= 0) {
            cc0 cc0Var3 = this.c;
            if ((b11 | cc0Var3.b(bitmap3)) || this.h != 1) {
                this.h = 1;
                ac0 ac0Var = this.e;
                ac0Var.a.setInputBuffer("shaderPattern", cc0Var2.d);
                ac0Var.a.setInputBuffer("shaderGradient", cc0Var.d);
                ac0Var.a.setInputBuffer("shaderGradientSoftLight", cc0Var3.d);
                ac0Var.a.setFloatUniform("transformGradient", ac0Var.b);
                ac0Var.a.setFloatUniform("transformPattern", ac0Var.c);
                paint.setShader(ac0Var.a);
                return paint;
            }
        } else {
            float a2 = i7.w.a((i10 * (-i11)) / 25500.0f, 0.0f, 1.0f);
            if (b11 || this.i != a2 || this.h != 2) {
                this.h = 2;
                this.i = a2;
                ac0 ac0Var2 = this.f;
                ac0Var2.a.setInputBuffer("shaderPattern", cc0Var2.d);
                ac0Var2.a.setInputBuffer("shaderGradient", cc0Var.d);
                ac0Var2.a.setFloatUniform("intensity", a2);
                ac0Var2.a.setFloatUniform("transformGradient", ac0Var2.b);
                ac0Var2.a.setFloatUniform("transformPattern", ac0Var2.c);
                paint.setShader(ac0Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
