// default package

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hi3 extends tt9 {
    public final jz4 b1;
    public final jz4 c1;
    public final /* synthetic */ cj3 d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi3(cj3 cj3Var, Activity activity, cj3 cj3Var2, int i, int i2, int i3, long j, gi3 gi3Var) {
        super(activity, cj3Var2, i, i2, i3, j, gi3Var);
        this.d1 = cj3Var;
        this.b1 = new jz4(2);
        this.c1 = new jz4(8);
    }

    public final void T() {
        qw4 qw4Var;
        qw4Var = ((d) this.d1).glassEngine;
        qw4Var.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        super.dispatchDraw(canvas);
        cj3 cj3Var = this.d1;
        if (cj3Var.b0 != null || cj3Var.a3 != 0) {
            int L = gl.L(54.0f);
            aVar = ((d) cj3Var).actionBar;
            int L2 = ((gl.L(cj3Var.a) + aVar.getMeasuredHeight()) - gl.L(2.0f)) - (cj3Var.a3 != 0 ? L : 0);
            fj3 fj3Var = cj3Var.L1;
            int c = L2 + (fj3Var != null ? (int) fj3Var.c(gl.L(7.0f)) : 0);
            int p1 = bkb.p1(0.7f, cj3Var.getThemedColor(bkb.c6));
            jz4 jz4Var = this.b1;
            jz4Var.b(p1);
            jz4Var.c(c, 0);
            jz4Var.setBounds(0, 0, getMeasuredWidth(), c + L);
            jz4Var.draw(canvas);
        }
        if (cj3Var.k4 > gl.L(32.0f)) {
            int p12 = bkb.p1(0.9f, cj3Var.getThemedColor(bkb.c6));
            jz4 jz4Var2 = this.c1;
            jz4Var2.b(p12);
            jz4Var2.setBounds(0, getMeasuredHeight() - cj3Var.k4, getMeasuredWidth(), getMeasuredHeight());
            jz4Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        qw4 qw4Var;
        super.setAlpha(f);
        qw4Var = ((d) this.d1).glassEngine;
        qw4Var.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ls9 ls9Var = this.d1.a0;
        if (ls9Var != null) {
            ls9Var.setTranslationY(f);
        }
    }

    @Override // wec
    public final void y(int i) {
        bn0 bn0Var = this.W;
        this.d1.w5(bn0Var != null && bn0Var.h(i) == 2);
    }
}
