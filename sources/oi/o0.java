package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o0 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new o0());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        p0 p0Var = (p0) view;
        a aVar = (a) b41Var.G;
        z2 z2Var = (z2) b41Var.H;
        e1 e1Var = p0Var.d;
        boolean z11 = p0Var.f != aVar;
        p0Var.f = aVar;
        p0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            p0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = a6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (a6.q(0, r10.length(), r10) & 1) != 0;
            }
            e1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(e1Var.getText()).equals(a6.l(pageblockdetails.title))) {
                e1Var.setTextSilently(r10);
                e1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new p0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
