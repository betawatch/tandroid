package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jg0 implements hi.a, tg.a {
    public final hi.a a;
    public final Paint b = new Paint(1);
    public RadialGradient c;
    public int d;
    public float e;
    public final /* synthetic */ kg0 f;

    public jg0(kg0 kg0Var, hi.a aVar) {
        this.f = kg0Var;
        this.a = aVar;
    }

    @Override // tg.a
    public final vg.f a() {
        return new vg.f(this);
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        hi.a aVar = this.a;
        kg0 kg0Var = this.f;
        float f13 = aVar != null ? kg0Var.l : 0.0f;
        if (f13 < 1.0f) {
            boolean z10 = kg0Var.b != null && canvas.isHardwareAccelerated();
            if (z10) {
                kg0Var.b.e(canvas, f7, f10, f11, f12);
            }
            float f14 = z10 ? 1.0f - kg0Var.k : 1.0f;
            if (f14 > 0.0f) {
                boolean z11 = kg0Var.j;
                Paint paint = this.b;
                if (z11) {
                    float f15 = f11 - f7;
                    float max = Math.max(1.0f, 0.65f * f15);
                    if (this.c == null || this.d != kg0Var.i || this.e != max) {
                        this.d = kg0Var.i;
                        this.e = max;
                        this.c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.t6.r1(0.8f, kg0Var.i), kg0Var.i, Shader.TileMode.CLAMP);
                    }
                    canvas.save();
                    float f16 = (f7 + f11) / 2.0f;
                    float f17 = (f10 + f12) / 2.0f;
                    canvas.translate(f16, f17);
                    paint.setShader(this.c);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (f14 * 255.0f));
                    canvas.drawRect(f7 - f16, f10 - f17, f15 / 2.0f, (f12 - f10) / 2.0f, paint);
                    canvas.restore();
                } else {
                    paint.setShader(null);
                    paint.setColor(org.telegram.ui.ActionBar.t6.r1(f14, kg0Var.i));
                    canvas.drawRect(f7, f10, f11, f12, paint);
                }
            }
        }
        if (f13 > 0.0f) {
            if (f13 < 1.0f) {
                canvas.saveLayerAlpha(f7, f10, f11, f12, (int) (f13 * 255.0f));
            }
            this.a.e(canvas, f7, f10, f11, f12);
            if (f13 < 1.0f) {
                canvas.restore();
            }
        }
    }
}
