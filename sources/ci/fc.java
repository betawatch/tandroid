package ci;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class fc extends gc {
    public final /* synthetic */ ai.a0 g;
    public final /* synthetic */ float h;

    public fc(ai.a0 a0Var, float f7) {
        this.g = a0Var;
        this.h = f7;
    }

    @Override // ci.gc
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        ai.a0 a0Var = this.g;
        float f10 = this.h;
        a0Var.c(canvas, f10, f10, pow);
    }

    @Override // ci.gc
    public final void e() {
        ai.a0 a0Var = this.g;
        a0Var.post(new ai.y(a0Var, 1));
    }

    @Override // ci.gc
    public final void f(boolean z10) {
        ai.a0 a0Var = this.g;
        a0Var.w = true;
        a0Var.invalidate();
        if (z10) {
            a0Var.getLocationInWindow(new int[2]);
            LaunchActivity.b0((a0Var.getWidth() / 2.0f) + r6[0], (a0Var.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
