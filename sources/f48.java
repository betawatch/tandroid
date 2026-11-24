// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f48 implements u29 {
    public final /* synthetic */ a58 a;

    public f48(a58 a58Var) {
        this.a = a58Var;
    }

    @Override // u29
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        ud7 ud7Var = new ud7(this, k39Var, view, (byte) 19);
        if (z) {
            ud7Var.run();
        } else {
            this.a.d0(ud7Var);
        }
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // u29
    public final boolean l() {
        ((fab) this.a.G1).b(false);
        return false;
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    @Override // u29
    public final void o() {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
