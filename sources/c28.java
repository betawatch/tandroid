// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c28 implements s09 {
    public final /* synthetic */ y28 a;

    public c28(y28 y28Var) {
        this.a = y28Var;
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    @Override // s09
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        pc7 pc7Var = new pc7(this, h19Var, view, (byte) 16);
        if (z) {
            pc7Var.run();
        } else {
            this.a.d0(pc7Var);
        }
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    @Override // s09
    public final boolean u() {
        ((d8b) this.a.G1).b(false);
        return false;
    }

    @Override // s09
    public final void A() {
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
