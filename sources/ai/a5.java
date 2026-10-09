package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a5 implements jl0 {
    public final /* synthetic */ f6 a;

    public a5(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, n0Var, view, 1);
        if (z10) {
            k0Var.run();
        } else {
            this.a.n0(k0Var);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean q() {
        ((bc) this.a.Q1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
