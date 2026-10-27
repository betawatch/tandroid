package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r0 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new r0());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        s0 s0Var = (s0) view;
        a aVar = (a) u61Var.G;
        c3 c3Var = (c3) u61Var.H;
        g1 g1Var = s0Var.d;
        boolean z11 = s0Var.f != aVar;
        s0Var.f = aVar;
        s0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            s0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r6 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r6.length() == 0 || (f6.q(0, r6.length(), r6) & 1) != 0;
            }
            g1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(g1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                g1Var.setTextSilently(r6);
                g1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s0(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }
}
