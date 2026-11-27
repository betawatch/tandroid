// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class cuc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ duc h;

    public cuc(duc ducVar, cuc cucVar, float f, boolean z) {
        float A;
        this.h = ducVar;
        this.f = z;
        this.b = f;
        this.a = cucVar != null ? cucVar.a : f;
        this.g = (cucVar == null || z) ? SystemClock.uptimeMillis() : cucVar.g;
        float f2 = 0.0f;
        float a = (cucVar == null || !z) ? 0.0f : cucVar.a();
        if (cucVar != null) {
            float f3 = cucVar.c;
            f2 = qd4.A(1.0f, f3, a, f3);
        }
        this.c = f2;
        if (cucVar == null) {
            A = ducVar.P;
        } else {
            float f4 = cucVar.d;
            A = qd4.A(1.0f, f4, a, f4);
        }
        this.d = A;
        this.e = cucVar == null ? (-hl.N(44.0f)) * 0.1f : cucVar.e * (1.0f - a);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return duc.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f, int i) {
        float a = a();
        boolean z = this.f;
        float f2 = z ? 0.0f : 1.0f;
        float f3 = this.c;
        float A = qd4.A(f2, f3, a, f3);
        if (A <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f;
        float f4 = i;
        float f5 = this.e;
        canvas.translate(d, qd4.A(z ? hl.N(44.0f) * 0.1f : 0.0f, f5, a, f4 + f5));
        float f6 = z ? this.h.P : 1.0f;
        float f7 = this.d;
        float A2 = qd4.A(f6, f7, a, f7);
        canvas.scale(A2, A2, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * A));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final cuc c() {
        duc ducVar = this.h;
        return ducVar.J >= 1.0f ? new cuc(ducVar, d()) : new cuc(ducVar, d(), this);
    }

    public final float d() {
        float f = this.b;
        float f2 = this.a;
        return (duc.T.getInterpolation(this.h.J) * (f - f2)) + f2;
    }

    public cuc(duc ducVar, float f) {
        this.h = ducVar;
        this.f = false;
        this.b = f;
        this.a = f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public cuc(duc ducVar, float f, cuc cucVar) {
        this.h = ducVar;
        this.f = cucVar.f;
        this.b = f;
        this.a = f;
        this.c = cucVar.c;
        this.d = cucVar.d;
        this.e = cucVar.e;
        this.g = cucVar.g;
    }
}
