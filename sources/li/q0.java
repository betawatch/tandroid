package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class q0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new q0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        r0 r0Var = (r0) view;
        a aVar = (a) x31Var.G;
        b3 b3Var = (b3) x31Var.H;
        g1 g1Var = r0Var.d;
        boolean z10 = r0Var.f != aVar;
        r0Var.f = aVar;
        r0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            r0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0;
            }
            g1Var.setAutoBold(aVar.r);
            if (z10 || !String.valueOf(g1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                g1Var.setTextSilently(r10);
                g1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new r0(context, h6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
