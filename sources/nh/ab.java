package nh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ab extends bb {
    public final /* synthetic */ lh.o g;
    public final /* synthetic */ float h;

    public ab(lh.o oVar, float f9) {
        this.g = oVar;
        this.h = f9;
    }

    @Override // nh.bb
    public final void a(Canvas canvas, float f9) {
        float pow = (float) Math.pow(f9, 16.0d);
        lh.o oVar = this.g;
        float f10 = this.h;
        oVar.c(canvas, f10, f10, pow);
    }

    @Override // nh.bb
    public final void e() {
        lh.o oVar = this.g;
        oVar.post(new lh.n(oVar, 1));
    }

    @Override // nh.bb
    public final void f(boolean z10) {
        lh.o oVar = this.g;
        oVar.w = true;
        oVar.invalidate();
        if (z10) {
            oVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + r6[0], (oVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
