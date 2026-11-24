// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class doc extends View {
    public final /* synthetic */ koc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doc(koc kocVar, Context context) {
        super(context);
        this.a = kocVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        koc kocVar = this.a;
        if (kocVar.Z0 > 0.0f) {
            boolean z = kocVar.Y0;
            float f = kocVar.V0;
            float B = z ? yjb.B(f, 2.0f, 3.0f, f * f) : 1.0f - ((float) Math.pow(1.0f - f, 4.0d));
            boolean z2 = kocVar.Y0;
            float f2 = (z2 || B >= 1.0f) ? -1.0f : kocVar.Z0 * 1.2f * B;
            joc jocVar = kocVar.T0;
            if (jocVar == null || B >= 1.0f) {
                canvas2 = canvas;
            } else {
                float f3 = z2 ? 1.0f - B : 1.0f;
                canvas2 = canvas;
                kocVar.s(canvas2, jocVar, f3, f2, true);
            }
            joc jocVar2 = kocVar.U0;
            if (jocVar2 != null) {
                kocVar.s(canvas2, jocVar2, kocVar.Y0 ? B : 1.0f, f2, false);
            }
        }
    }
}
