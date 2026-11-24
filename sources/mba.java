// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mba {
    public e99 a;
    public y89 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public dba h;
    public float i;
    public float j;
    public lba k;
    public iba l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float max = Math.max(Math.min((((f2 - f4) * f8) + ((f - f3) * f7)) / ((f8 * f8) + (f7 * f7)), 1.0f), 0.0f);
        float f9 = ((f7 * max) + f3) - f;
        float f10 = ((max * f8) + f4) - f2;
        return (float) Math.sqrt((f10 * f10) + (f9 * f9));
    }

    public final void b(Canvas canvas, xka xkaVar, lba lbaVar) {
        float width = (lbaVar.d / xkaVar.a) * canvas.getWidth();
        float height = (lbaVar.e / xkaVar.b) * canvas.getHeight();
        float L = gm.L(5.0f);
        boolean z = lbaVar.a;
        canvas.drawCircle(width, height, L, z ? this.d : this.f);
        canvas.drawCircle((lbaVar.d / xkaVar.a) * canvas.getWidth(), (lbaVar.e / xkaVar.b) * canvas.getHeight(), gm.L(5.0f), z ? this.e : this.g);
    }

    public final void c(float f, float f2, boolean z) {
        float[] fArr = this.p;
        fArr[0] = f;
        fArr[1] = f2;
        d(z);
    }

    public final void d(boolean z) {
        float[] fArr = this.p;
        dba dbaVar = this.h;
        if (dbaVar != null) {
            float f = dbaVar.h;
            if (f != 0.0f) {
                float f2 = fArr[0] - dbaVar.b;
                fArr[0] = f2;
                fArr[1] = fArr[1] - dbaVar.c;
                double d = f * (z ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f2) - (Math.sin(d) * fArr[1]));
                float d2 = (float) wi8.d(d, fArr[1], Math.sin(d) * fArr[0]);
                dba dbaVar2 = this.h;
                fArr[0] = cos + dbaVar2.b;
                fArr[1] = d2 + dbaVar2.c;
            }
        }
    }

    public final void e() {
        dba dbaVar;
        e99 e99Var = this.a;
        if (e99Var == null || e99Var.getPainting() == null || (dbaVar = this.h) == null) {
            return;
        }
        dbaVar.f = e99Var.getCurrentWeight();
        hw7 painting = e99Var.getPainting();
        dba dbaVar2 = this.h;
        int currentColor = e99Var.getCurrentColor();
        if (dbaVar2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new h65((Object) painting, (Object) dbaVar2, currentColor, (byte) 20));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        d99 d99Var = e99Var.a;
        if (d99Var != null) {
            d99Var.B();
        }
        e99Var.e.z = true;
    }
}
