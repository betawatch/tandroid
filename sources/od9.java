// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class od9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new od9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        pd9 pd9Var = (pd9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        nd9 nd9Var = (nd9) c6cVar.I;
        pd9Var.a = ll0Var;
        pd9Var.F = nd9Var;
        pd9Var.c(ll0Var);
        pd9Var.h();
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        pd9 pd9Var = new pd9(i, ylbVar, context);
        pd9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return pd9Var;
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
