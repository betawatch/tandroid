package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class q0 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new q0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        r0 r0Var = (r0) view;
        a aVar = (a) r31Var.G;
        b3 b3Var = (b3) r31Var.H;
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

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new r0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
