// default package

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class lbb extends mbb {
    public final /* synthetic */ og3 g;
    public final /* synthetic */ float h;

    public lbb(og3 og3Var, float f) {
        this.g = og3Var;
        this.h = f;
    }

    @Override // mbb
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        og3 og3Var = this.g;
        float f2 = this.h;
        og3Var.c(canvas, f2, f2, pow);
    }

    @Override // mbb
    public final void e() {
        og3 og3Var = this.g;
        og3Var.post(new ng3(og3Var, (byte) 1));
    }

    @Override // mbb
    public final void f(boolean z) {
        og3 og3Var = this.g;
        og3Var.x = true;
        og3Var.invalidate();
        if (z) {
            og3Var.getLocationInWindow(new int[2]);
            LaunchActivity.a0((og3Var.getWidth() / 2.0f) + r5[0], (og3Var.getHeight() / 2.0f) + r5[1], 1.0f);
        }
    }
}
