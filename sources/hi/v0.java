package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v0 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new v0());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        w0 w0Var = (w0) view;
        a aVar = (a) v51Var.G;
        g3 g3Var = (g3) v51Var.H;
        k1 k1Var = w0Var.d;
        boolean z11 = w0Var.f != aVar;
        w0Var.f = aVar;
        w0Var.h = g3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            w0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = i6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (i6.q(0, r10.length(), r10) & 1) != 0;
            }
            k1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(k1Var.getText()).equals(i6.l(pageblockdetails.title))) {
                k1Var.setTextSilently(r10);
                k1Var.invalidateEffects();
            }
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
