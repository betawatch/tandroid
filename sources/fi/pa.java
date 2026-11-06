package fi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pa extends qa {
    public final /* synthetic */ di.p g;
    public final /* synthetic */ float h;

    public pa(di.p pVar, float f10) {
        this.g = pVar;
        this.h = f10;
    }

    @Override // fi.qa
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        di.p pVar = this.g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override // fi.qa
    public final void e() {
        di.p pVar = this.g;
        pVar.post(new di.o(pVar, 1));
    }

    @Override // fi.qa
    public final void f(boolean z9) {
        di.p pVar = this.g;
        pVar.x = true;
        pVar.invalidate();
        if (z9) {
            pVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + r6[0], (pVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
