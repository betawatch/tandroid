// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class fqc extends View {
    public final /* synthetic */ mqc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqc(mqc mqcVar, Context context) {
        super(context);
        this.a = mqcVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        mqc mqcVar = this.a;
        if (mqcVar.Z0 > 0.0f) {
            boolean z = mqcVar.Y0;
            float f = mqcVar.V0;
            float B = z ? mlb.B(f, 2.0f, 3.0f, f * f) : 1.0f - ((float) Math.pow(1.0f - f, 4.0d));
            boolean z2 = mqcVar.Y0;
            float f2 = (z2 || B >= 1.0f) ? -1.0f : mqcVar.Z0 * 1.2f * B;
            lqc lqcVar = mqcVar.T0;
            if (lqcVar == null || B >= 1.0f) {
                canvas2 = canvas;
            } else {
                float f3 = z2 ? 1.0f - B : 1.0f;
                canvas2 = canvas;
                mqcVar.s(canvas2, lqcVar, f3, f2, true);
            }
            lqc lqcVar2 = mqcVar.U0;
            if (lqcVar2 != null) {
                mqcVar.s(canvas2, lqcVar2, mqcVar.Y0 ? B : 1.0f, f2, false);
            }
        }
    }
}
