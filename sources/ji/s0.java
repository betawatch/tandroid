package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s0 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new s0());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        t0 t0Var = (t0) view;
        a aVar = (a) l61Var.G;
        e3 e3Var = (e3) l61Var.H;
        h1 h1Var = t0Var.d;
        boolean z11 = t0Var.f != aVar;
        t0Var.f = aVar;
        t0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            t0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = k6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (k6.q(0, r10.length(), r10) & 1) != 0;
            }
            h1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(h1Var.getText()).equals(k6.l(pageblockdetails.title))) {
                h1Var.setTextSilently(r10);
                h1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t0(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean isClickable() {
        return false;
    }
}
