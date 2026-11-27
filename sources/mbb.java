// default package

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class mbb extends nbb {
    public final /* synthetic */ og3 g;
    public final /* synthetic */ float h;

    public mbb(og3 og3Var, float f) {
        this.g = og3Var;
        this.h = f;
    }

    @Override // nbb
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        og3 og3Var = this.g;
        float f2 = this.h;
        og3Var.c(canvas, f2, f2, pow);
    }

    @Override // nbb
    public final void e() {
        og3 og3Var = this.g;
        og3Var.post(new ng3(og3Var, (byte) 1));
    }

    @Override // nbb
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
