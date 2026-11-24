// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class opc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ ppc h;

    public opc(ppc ppcVar, opc opcVar, float f, boolean z) {
        float A;
        this.h = ppcVar;
        this.f = z;
        this.b = f;
        this.a = opcVar != null ? opcVar.a : f;
        this.g = (opcVar == null || z) ? SystemClock.uptimeMillis() : opcVar.g;
        float f2 = 0.0f;
        float a = (opcVar == null || !z) ? 0.0f : opcVar.a();
        if (opcVar != null) {
            float f3 = opcVar.c;
            f2 = tb4.A(1.0f, f3, a, f3);
        }
        this.c = f2;
        if (opcVar == null) {
            A = ppcVar.P;
        } else {
            float f4 = opcVar.d;
            A = tb4.A(1.0f, f4, a, f4);
        }
        this.d = A;
        this.e = opcVar == null ? (-gl.N(44.0f)) * 0.1f : opcVar.e * (1.0f - a);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return ppc.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f, int i) {
        float a = a();
        boolean z = this.f;
        float f2 = z ? 0.0f : 1.0f;
        float f3 = this.c;
        float A = tb4.A(f2, f3, a, f3);
        if (A <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f;
        float f4 = i;
        float f5 = this.e;
        canvas.translate(d, tb4.A(z ? gl.N(44.0f) * 0.1f : 0.0f, f5, a, f4 + f5));
        float f6 = z ? this.h.P : 1.0f;
        float f7 = this.d;
        float A2 = tb4.A(f6, f7, a, f7);
        canvas.scale(A2, A2, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * A));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final opc c() {
        ppc ppcVar = this.h;
        return ppcVar.J >= 1.0f ? new opc(ppcVar, d()) : new opc(ppcVar, d(), this);
    }

    public final float d() {
        float f = this.b;
        float f2 = this.a;
        return (ppc.T.getInterpolation(this.h.J) * (f - f2)) + f2;
    }

    public opc(ppc ppcVar, float f) {
        this.h = ppcVar;
        this.f = false;
        this.b = f;
        this.a = f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public opc(ppc ppcVar, float f, opc opcVar) {
        this.h = ppcVar;
        this.f = opcVar.f;
        this.b = f;
        this.a = f;
        this.c = opcVar.c;
        this.d = opcVar.d;
        this.e = opcVar.e;
        this.g = opcVar.g;
    }
}
