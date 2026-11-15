package ai;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g2 extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float z10;
        float z11;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                LinearGradient linearGradient = h2Var.k;
                if (linearGradient != null && h2Var.m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    break;
                }
                break;
            case 1:
                long j3 = ji.e.n3;
                ji.c cVar = (ji.c) this.b;
                float f10 = (j3 - cVar.c) / 360.0f;
                if (f10 <= 0.0f) {
                    z10 = cVar.d;
                } else if (f10 >= 1.0f) {
                    z10 = 1.0f;
                } else {
                    float f11 = cVar.d;
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f10, 3.0d), 1.0f - f11, f11);
                }
                float max = Math.max(0.0f, Math.min(1.0f, (((ji.e.n3 - cVar.c) / 1500.0f) - 0.2f) / 0.8f));
                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C, ji.e.o3, ji.e.p3));
                textPaint.setAlpha((int) (alpha * z10));
                float f12 = ji.e.q3;
                if (f12 > 0.0f && C < 1.0f) {
                    textPaint.setShadowLayer(f12, 0.0f, 0.0f, j6.r1((1.0f - C) * 0.55f * z10, ji.e.o3));
                    break;
                }
                break;
            default:
                long j10 = ji.p.Z1;
                ji.o oVar = (ji.o) this.b;
                float f13 = (j10 - oVar.c) / 360.0f;
                if (f13 <= 0.0f) {
                    z11 = oVar.d;
                } else if (f13 >= 1.0f) {
                    z11 = 1.0f;
                } else {
                    float f14 = oVar.d;
                    z11 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f13, 3.0d), 1.0f - f14, f14);
                }
                float b10 = ji.p.b((((ji.p.Z1 - oVar.c) / 1900.0f) - 0.2f) / 0.8f);
                float C2 = com.google.android.gms.internal.vision.e2.C(b10, 2.0f, 3.0f, b10 * b10);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C2, ji.p.V1, ji.p.W1));
                textPaint.setAlpha((int) (alpha2 * z11));
                if (C2 < 1.0f) {
                    textPaint.setShadowLayer(ji.p.X1, 0.0f, 0.0f, j6.r1((1.0f - C2) * 0.55f * z11, ji.p.V1));
                    break;
                }
                break;
        }
    }
}
