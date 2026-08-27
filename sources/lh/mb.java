package lh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class mb extends nb {
    public final /* synthetic */ jh.o g;
    public final /* synthetic */ float h;

    public mb(jh.o oVar, float f10) {
        this.g = oVar;
        this.h = f10;
    }

    @Override // lh.nb
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        jh.o oVar = this.g;
        float f11 = this.h;
        oVar.c(canvas, f11, f11, pow);
    }

    @Override // lh.nb
    public final void e() {
        jh.o oVar = this.g;
        oVar.post(new jh.n(oVar, 1));
    }

    @Override // lh.nb
    public final void f(boolean z10) {
        jh.o oVar = this.g;
        oVar.w = true;
        oVar.invalidate();
        if (z10) {
            oVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + r6[0], (oVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
