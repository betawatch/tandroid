package ci;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i0 extends s4.k {
    public final /* synthetic */ n2 F;

    public i0(n2 n2Var) {
        this.F = n2Var;
    }

    @Override // s4.k
    public final float A(View view) {
        return 0.5f;
    }

    @Override // s4.k
    public final void M() {
        this.F.c.invalidate();
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        this.F.c.invalidate();
    }
}
