package mi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class r0 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new r0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        s0 s0Var = (s0) view;
        a aVar = (a) r31Var.G;
        c3 c3Var = (c3) r31Var.H;
        h1 h1Var = s0Var.d;
        boolean z11 = s0Var.f != aVar;
        s0Var.f = aVar;
        s0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            s0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r5 = d6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r5.length() == 0 || (d6.q(0, r5.length(), r5) & 1) != 0;
            }
            h1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(h1Var.getText()).equals(d6.l(pageblockdetails.title))) {
                h1Var.setTextSilently(r5);
                h1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new s0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
