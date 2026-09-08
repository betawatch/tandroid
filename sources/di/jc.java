package di;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class jc extends kc {
    public final /* synthetic */ bi.u g;
    public final /* synthetic */ float h;

    public jc(bi.u uVar, float f7) {
        this.g = uVar;
        this.h = f7;
    }

    @Override // di.kc
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        bi.u uVar = this.g;
        float f10 = this.h;
        uVar.c(canvas, f10, f10, pow);
    }

    @Override // di.kc
    public final void e() {
        bi.u uVar = this.g;
        uVar.post(new bi.s(uVar, 1));
    }

    @Override // di.kc
    public final void f(boolean z10) {
        bi.u uVar = this.g;
        uVar.w = true;
        uVar.invalidate();
        if (z10) {
            uVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((uVar.getWidth() / 2.0f) + r6[0], (uVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
