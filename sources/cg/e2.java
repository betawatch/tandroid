package cg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e2 {
    public p1 a;
    public j1 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public s1 h;
    public float i;
    public float j;
    public d2 k;
    public a2 l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, jv0 jv0Var, d2 d2Var) {
        float width = (d2Var.d / jv0Var.a) * canvas.getWidth();
        float height = (d2Var.e / jv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z4 = d2Var.a;
        canvas.drawCircle(width, height, dp, z4 ? this.d : this.f);
        canvas.drawCircle((d2Var.d / jv0Var.a) * canvas.getWidth(), (d2Var.e / jv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z4 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z4) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z4);
    }

    public final void d(boolean z4) {
        float[] fArr = this.p;
        s1 s1Var = this.h;
        if (s1Var != null) {
            float f10 = s1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - s1Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - s1Var.c;
                double d = f10 * (z4 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float a2 = (float) kh.a2.a(d, fArr[1], Math.sin(d) * fArr[0]);
                s1 s1Var2 = this.h;
                fArr[0] = cos + s1Var2.b;
                fArr[1] = a2 + s1Var2.c;
            }
        }
    }

    public final void e() {
        s1 s1Var;
        p1 p1Var = this.a;
        if (p1Var == null || p1Var.getPainting() == null || (s1Var = this.h) == null) {
            return;
        }
        s1Var.f = p1Var.getCurrentWeight();
        d1 painting = p1Var.getPainting();
        s1 s1Var2 = this.h;
        int currentColor = p1Var.getCurrentColor();
        if (s1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new ah.a(painting, s1Var2, currentColor, 1));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        o1 o1Var = p1Var.a;
        if (o1Var != null) {
            o1Var.c();
        }
        p1Var.e.z = true;
    }
}
