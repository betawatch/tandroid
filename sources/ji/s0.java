package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class s0 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new s0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        t0 t0Var = (t0) view;
        a aVar = (a) h51Var.G;
        c3 c3Var = (c3) h51Var.H;
        h1 h1Var = t0Var.d;
        boolean z11 = t0Var.f != aVar;
        t0Var.f = aVar;
        t0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            t0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = i6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (i6.q(0, r10.length(), r10) & 1) != 0;
            }
            h1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(h1Var.getText()).equals(i6.l(pageblockdetails.title))) {
                h1Var.setTextSilently(r10);
                h1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
