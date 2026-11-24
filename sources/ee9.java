// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ee9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ee9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        fe9 fe9Var = (fe9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        zf9 zf9Var = (zf9) c6cVar.I;
        fe9Var.a = ll0Var;
        fe9Var.w = zf9Var;
        fe9Var.x = jb6.a0;
        fe9Var.c(ll0Var);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new fe9(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
