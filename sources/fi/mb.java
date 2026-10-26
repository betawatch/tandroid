package fi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class mb extends nb {
    public final /* synthetic */ di.q g;
    public final /* synthetic */ float h;

    public mb(di.q qVar, float f7) {
        this.g = qVar;
        this.h = f7;
    }

    @Override // fi.nb
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        di.q qVar = this.g;
        float f10 = this.h;
        qVar.c(canvas, f10, f10, pow);
    }

    @Override // fi.nb
    public final void e() {
        di.q qVar = this.g;
        qVar.post(new di.p(qVar, 1));
    }

    @Override // fi.nb
    public final void f(boolean z10) {
        di.q qVar = this.g;
        qVar.w = true;
        qVar.invalidate();
        if (z10) {
            qVar.getLocationInWindow(new int[2]);
            LaunchActivity.c0((qVar.getWidth() / 2.0f) + r6[0], (qVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
