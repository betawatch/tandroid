package ei;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class pb extends qb {
    public final /* synthetic */ ci.q g;
    public final /* synthetic */ float h;

    public pb(ci.q qVar, float f7) {
        this.g = qVar;
        this.h = f7;
    }

    @Override // ei.qb
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        ci.q qVar = this.g;
        float f10 = this.h;
        qVar.c(canvas, f10, f10, pow);
    }

    @Override // ei.qb
    public final void e() {
        ci.q qVar = this.g;
        qVar.post(new ci.p(qVar, 1));
    }

    @Override // ei.qb
    public final void f(boolean z10) {
        ci.q qVar = this.g;
        qVar.w = true;
        qVar.invalidate();
        if (z10) {
            qVar.getLocationInWindow(new int[2]);
            LaunchActivity.c0((qVar.getWidth() / 2.0f) + r6[0], (qVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
