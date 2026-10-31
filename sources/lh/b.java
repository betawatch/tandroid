package lh;

import android.view.View;
import android.view.WindowInsets;
import lg.s;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.i10;
import r0.j1;
import r0.m;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements i10, m {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        g gVar = this.a;
        gVar.t0(g10);
        gVar.Q1.a(j1Var.a.f(8).d > 0, true);
        return j1.b;
    }

    @Override // org.telegram.ui.Components.i10
    public void a(int i10) {
        int min = Math.min(i10, i0.L(144.0f));
        if (i10 > 0) {
            min -= i0.L(8.0f);
        }
        g gVar = this.a;
        if (gVar.d2 != min) {
            gVar.d2 = min;
            gVar.P1.a(min);
            gVar.Z1.postOnAnimation(new s(gVar, 2));
        }
    }
}
