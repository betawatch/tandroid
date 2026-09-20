package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class t0 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new t0());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) w51Var.G;
        d3 d3Var = (d3) w51Var.H;
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

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
