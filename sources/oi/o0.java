package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class o0 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new o0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        p0 p0Var = (p0) view;
        a aVar = (a) l41Var.H;
        b3 b3Var = (b3) l41Var.I;
        e1 e1Var = p0Var.d;
        boolean z11 = p0Var.f != aVar;
        p0Var.f = aVar;
        p0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            p0Var.c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder r10 = b6.r(pageblockdetails.title, null, true);
            if (!aVar.s) {
                aVar.s = true;
                aVar.r = r10.length() == 0 || (b6.q(0, r10.length(), r10) & 1) != 0;
            }
            e1Var.setAutoBold(aVar.r);
            if (z11 || !String.valueOf(e1Var.getText()).equals(b6.l(pageblockdetails.title))) {
                e1Var.setTextSilently(r10);
                e1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new p0(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
