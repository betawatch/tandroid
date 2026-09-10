package og;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import bi.g3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u1 {
    public h1 a;
    public b1 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public k1 h;
    public float i;
    public float j;
    public t1 k;
    public q1 l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, tv0 tv0Var, t1 t1Var) {
        float width = (t1Var.d / tv0Var.a) * canvas.getWidth();
        float height = (t1Var.e / tv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = t1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((t1Var.d / tv0Var.a) * canvas.getWidth(), (t1Var.e / tv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        k1 k1Var = this.h;
        if (k1Var != null) {
            float f7 = k1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - k1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - k1Var.c;
                double d = f7 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float f11 = (float) hc.b.f(d, fArr[1], Math.sin(d) * fArr[0]);
                k1 k1Var2 = this.h;
                fArr[0] = cos + k1Var2.b;
                fArr[1] = f11 + k1Var2.c;
            }
        }
    }

    public final void e() {
        k1 k1Var;
        h1 h1Var = this.a;
        if (h1Var == null || h1Var.getPainting() == null || (k1Var = this.h) == null) {
            return;
        }
        k1Var.f = h1Var.getCurrentWeight();
        v0 painting = h1Var.getPainting();
        k1 k1Var2 = this.h;
        int currentColor = h1Var.getCurrentColor();
        if (k1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new g3(painting, k1Var2, currentColor, 15));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        g1 g1Var = h1Var.a;
        if (g1Var != null) {
            g1Var.c();
        }
        h1Var.e.z = true;
    }
}
