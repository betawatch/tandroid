package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class t0 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new t0());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) y51Var.G;
        d3 d3Var = (d3) y51Var.H;
        i1 i1Var = u0Var.d;
        boolean z11 = u0Var.f != aVar;
        u0Var.f = aVar;
        u0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            u0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (f6.q(0, r10.length(), r10) & 1) != 0;
            }
            i1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(i1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                i1Var.setTextSilently(r10);
                i1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
