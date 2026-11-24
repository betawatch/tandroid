// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class bk9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new bk9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        TL_iv.RichText richText;
        ck9 ck9Var = (ck9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        ak9 ak9Var = (ak9) c6cVar.I;
        ne9 ne9Var = ck9Var.r;
        ck9Var.a = ll0Var;
        ck9Var.s = ak9Var;
        ck9Var.f(gm.L(16.0f), gm.L(1.0f), gm.L(16.0f), gm.L(8.0f));
        ck9Var.c(ll0Var);
        if (ak9Var != null) {
            richText = (TL_iv.RichText) ((jg9) ak9Var).a.u3.get(Long.valueOf(ll0Var.t));
        } else {
            richText = null;
        }
        if (String.valueOf(ne9Var.getText()).equals(zk9.l(richText))) {
            return;
        }
        ne9Var.setTextSilently(gw3.m(zk9.r(richText, null, true), ne9Var.getPaint().getFontMetricsInt(), false, null, 0));
        ne9Var.f();
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ck9(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
