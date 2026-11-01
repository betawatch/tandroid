package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class x0 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new x0());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) b51Var.G;
        l3 l3Var = (l3) b51Var.H;
        n1 n1Var = y0Var.d;
        boolean z11 = y0Var.f != aVar;
        y0Var.f = aVar;
        y0Var.h = l3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            y0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = s6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (s6.q(0, r10.length(), r10) & 1) != 0;
            }
            n1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(n1Var.getText()).equals(s6.l(pageblockdetails.title))) {
                n1Var.setTextSilently(r10);
                n1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new y0(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
