// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ae9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ae9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        be9 be9Var = (be9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        lg9 lg9Var = (lg9) c6cVar.I;
        ne9 ne9Var = be9Var.d;
        boolean z2 = be9Var.f != ll0Var;
        be9Var.f = ll0Var;
        be9Var.h = lg9Var;
        TL_iv.PageBlock pageBlock = ll0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            be9Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r = zk9.r(pageblockdetails.title, null, true);
            if (!ll0Var.s) {
                ll0Var.s = true;
                ll0Var.r = r.length() == 0 || (zk9.q(0, r.length(), r) & 1) != 0;
            }
            ne9Var.setAutoBold(ll0Var.r);
            if (z2 || !String.valueOf(ne9Var.getText()).equals(zk9.l(pageblockdetails.title))) {
                ne9Var.setTextSilently(r);
                ne9Var.f();
            }
        }
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new be9(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
