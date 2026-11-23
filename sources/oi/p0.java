package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p0 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new p0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) n41Var.H;
        c3 c3Var = (c3) n41Var.I;
        f1 f1Var = q0Var.d;
        boolean z11 = q0Var.f != aVar;
        q0Var.f = aVar;
        q0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0;
            }
            f1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(f1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                f1Var.setTextSilently(r10);
                f1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new q0(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
