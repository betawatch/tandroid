package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class s0 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new s0());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        t0 t0Var = (t0) view;
        a aVar = (a) h61Var.G;
        d3 d3Var = (d3) h61Var.H;
        h1 h1Var = t0Var.d;
        boolean z11 = t0Var.f != aVar;
        t0Var.f = aVar;
        t0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            t0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = e6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (e6.q(0, r10.length(), r10) & 1) != 0;
            }
            h1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(h1Var.getText()).equals(e6.l(pageblockdetails.title))) {
                h1Var.setTextSilently(r10);
                h1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new t0(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
