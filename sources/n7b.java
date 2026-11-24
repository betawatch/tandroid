// default package

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class n7b extends o7b {
    public final /* synthetic */ uf3 g;
    public final /* synthetic */ float h;

    public n7b(uf3 uf3Var, float f) {
        this.g = uf3Var;
        this.h = f;
    }

    @Override // o7b
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        uf3 uf3Var = this.g;
        float f2 = this.h;
        uf3Var.c(canvas, f2, f2, pow);
    }

    @Override // o7b
    public final void e() {
        uf3 uf3Var = this.g;
        uf3Var.post(new tf3(uf3Var, (byte) 1));
    }

    @Override // o7b
    public final void f(boolean z) {
        uf3 uf3Var = this.g;
        uf3Var.x = true;
        uf3Var.invalidate();
        if (z) {
            uf3Var.getLocationInWindow(new int[2]);
            LaunchActivity.a0((uf3Var.getWidth() / 2.0f) + r5[0], (uf3Var.getHeight() / 2.0f) + r5[1], 1.0f);
        }
    }
}
