package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class t0 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new t0());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) x51Var.G;
        d3 d3Var = (d3) x51Var.H;
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

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
