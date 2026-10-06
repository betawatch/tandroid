package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class t0 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new t0());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) h61Var.G;
        e3 e3Var = (e3) h61Var.H;
        i1 i1Var = u0Var.d;
        boolean z11 = u0Var.f != aVar;
        u0Var.f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            u0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = h6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (h6.q(0, r10.length(), r10) & 1) != 0;
            }
            i1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(i1Var.getText()).equals(h6.l(pageblockdetails.title))) {
                i1Var.setTextSilently(r10);
                i1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u0(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
