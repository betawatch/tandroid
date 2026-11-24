// default package

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz2 extends e69 {
    public final i15 a = new i15(2);
    public final /* synthetic */ ylb b;
    public final /* synthetic */ hz2 c;

    public fz2(hz2 hz2Var, ylb ylbVar) {
        this.c = hz2Var;
        this.b = ylbVar;
    }

    @Override // e69
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        hz2 hz2Var = this.c;
        int max = Math.max(0, gm.L(80.0f) + ((int) hz2Var.b2.getTranslationY()) + ((int) hz2Var.S1.f));
        int v0 = cmb.v0(cmb.g5, this.b);
        i15 i15Var = this.a;
        i15Var.b(v0);
        i15Var.setBounds(0, max, recyclerView.getWidth(), gm.L(8.0f) + max);
        i15Var.draw(canvas);
        hz2Var.Y0();
        hz2Var.Z0();
    }
}
