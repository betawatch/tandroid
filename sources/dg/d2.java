package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d2 {
    public o1 a;
    public i1 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public r1 h;
    public float i;
    public float j;
    public c2 k;
    public z1 l;
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

    public final void b(Canvas canvas, jv0 jv0Var, c2 c2Var) {
        float width = (c2Var.d / jv0Var.a) * canvas.getWidth();
        float height = (c2Var.e / jv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z4 = c2Var.a;
        canvas.drawCircle(width, height, dp, z4 ? this.d : this.f);
        canvas.drawCircle((c2Var.d / jv0Var.a) * canvas.getWidth(), (c2Var.e / jv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z4 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z4) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z4);
    }

    public final void d(boolean z4) {
        float[] fArr = this.p;
        r1 r1Var = this.h;
        if (r1Var != null) {
            float f10 = r1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - r1Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - r1Var.c;
                double d = f10 * (z4 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float a2 = (float) l.d.a(d, fArr[1], Math.sin(d) * fArr[0]);
                r1 r1Var2 = this.h;
                fArr[0] = cos + r1Var2.b;
                fArr[1] = a2 + r1Var2.c;
            }
        }
    }

    public final void e() {
        r1 r1Var;
        o1 o1Var = this.a;
        if (o1Var == null || o1Var.getPainting() == null || (r1Var = this.h) == null) {
            return;
        }
        r1Var.f = o1Var.getCurrentWeight();
        c1 painting = o1Var.getPainting();
        r1 r1Var2 = this.h;
        int currentColor = o1Var.getCurrentColor();
        if (r1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new bh.a(painting, r1Var2, currentColor, 1));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        n1 n1Var = o1Var.a;
        if (n1Var != null) {
            n1Var.c();
        }
        o1Var.e.z = true;
    }
}
