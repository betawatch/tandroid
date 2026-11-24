// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cz2 implements pq4, qq7 {
    public final /* synthetic */ hz2 a;

    public /* synthetic */ cz2(hz2 hz2Var) {
        this.a = hz2Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        hz2 hz2Var = this.a;
        hz2Var.q0(g);
        hz2Var.T1.a(wzcVar.a.f(8).d > 0, true);
        return wzc.b;
    }

    @Override // pq4
    public final void a(int i) {
        int min = Math.min(i, gm.L(144.0f));
        if (i > 0) {
            min -= gm.L(8.0f);
        }
        hz2 hz2Var = this.a;
        if (hz2Var.g2 != min) {
            hz2Var.g2 = min;
            hz2Var.S1.a(min);
            hz2Var.c2.postOnAnimation(new xf2(hz2Var, (byte) 17));
        }
    }
}
