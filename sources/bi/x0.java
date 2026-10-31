package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class x0 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new x0());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) a51Var.G;
        l3 l3Var = (l3) a51Var.H;
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

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new y0(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
