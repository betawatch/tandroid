package gi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pa extends qa {
    public final /* synthetic */ ei.q g;
    public final /* synthetic */ float h;

    public pa(ei.q qVar, float f10) {
        this.g = qVar;
        this.h = f10;
    }

    @Override // gi.qa
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        ei.q qVar = this.g;
        float f11 = this.h;
        qVar.c(canvas, f11, f11, pow);
    }

    @Override // gi.qa
    public final void e() {
        ei.q qVar = this.g;
        qVar.post(new ei.p(qVar, 1));
    }

    @Override // gi.qa
    public final void f(boolean z10) {
        ei.q qVar = this.g;
        qVar.x = true;
        qVar.invalidate();
        if (z10) {
            qVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((qVar.getWidth() / 2.0f) + r6[0], (qVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
