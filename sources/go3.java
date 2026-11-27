// default package

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class go3 extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ go3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float A;
        float A2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ho3 ho3Var = (ho3) obj;
                LinearGradient linearGradient = ho3Var.k;
                if (linearGradient != null && ho3Var.m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    break;
                }
                break;
            case 1:
                inc incVar = (inc) obj;
                float f = (knc.P3 - incVar.c) / 360.0f;
                if (f <= 0.0f) {
                    A = incVar.d;
                } else if (f >= 1.0f) {
                    A = 1.0f;
                } else {
                    float f2 = incVar.d;
                    A = qd4.A(1.0f, (float) Math.pow(1.0f - f, 3.0d), 1.0f - f2, f2);
                }
                float max = Math.max(0.0f, Math.min(1.0f, (((knc.P3 - incVar.c) / 1500.0f) - 0.2f) / 0.8f));
                float B = xnb.B(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(vm2.f(B, knc.Q3, knc.R3));
                textPaint.setAlpha((int) (alpha * A));
                float f3 = knc.S3;
                if (f3 > 0.0f && B < 1.0f) {
                    textPaint.setShadowLayer(f3, 0.0f, 0.0f, aob.p1((1.0f - B) * 0.55f * A, knc.Q3));
                    break;
                }
                break;
            default:
                unc uncVar = (unc) obj;
                float f4 = (vnc.c2 - uncVar.c) / 360.0f;
                if (f4 <= 0.0f) {
                    A2 = uncVar.d;
                } else if (f4 >= 1.0f) {
                    A2 = 1.0f;
                } else {
                    float f5 = uncVar.d;
                    A2 = qd4.A(1.0f, (float) Math.pow(1.0f - f4, 3.0d), 1.0f - f5, f5);
                }
                float b2 = vnc.b((((vnc.c2 - uncVar.c) / 1900.0f) - 0.2f) / 0.8f);
                float B2 = xnb.B(b2, 2.0f, 3.0f, b2 * b2);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(vm2.f(B2, vnc.Y1, vnc.Z1));
                textPaint.setAlpha((int) (alpha2 * A2));
                if (B2 < 1.0f) {
                    textPaint.setShadowLayer(vnc.a2, 0.0f, 0.0f, aob.p1((1.0f - B2) * 0.55f * A2, vnc.Y1));
                    break;
                }
                break;
        }
    }
}
