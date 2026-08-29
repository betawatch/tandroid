package ag;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i2 {
    public t1 a;
    public l1 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public w1 h;
    public float i;
    public float j;
    public h2 k;
    public e2 l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f9 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f9;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, bv0 bv0Var, h2 h2Var) {
        float width = (h2Var.d / bv0Var.a) * canvas.getWidth();
        float height = (h2Var.e / bv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = h2Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((h2Var.d / bv0Var.a) * canvas.getWidth(), (h2Var.e / bv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f9, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f9;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        w1 w1Var = this.h;
        if (w1Var != null) {
            float f9 = w1Var.h;
            if (f9 != 0.0f) {
                float f10 = fArr[0] - w1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - w1Var.c;
                double d = f9 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float b10 = (float) j7.l1.b(d, fArr[1], Math.sin(d) * fArr[0]);
                w1 w1Var2 = this.h;
                fArr[0] = cos + w1Var2.b;
                fArr[1] = b10 + w1Var2.c;
            }
        }
    }

    public final void e() {
        w1 w1Var;
        t1 t1Var = this.a;
        if (t1Var == null || t1Var.getPainting() == null || (w1Var = this.h) == null) {
            return;
        }
        w1Var.f = t1Var.getCurrentWeight();
        f1 painting = t1Var.getPainting();
        w1 w1Var2 = this.h;
        int currentColor = t1Var.getCurrentColor();
        if (w1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new v0(painting, w1Var2, currentColor, 0));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        s1 s1Var = t1Var.a;
        if (s1Var != null) {
            s1Var.c();
        }
        t1Var.e.z = true;
    }
}
