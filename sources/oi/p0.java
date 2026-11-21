package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class p0 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new p0());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) o41Var.H;
        c3 c3Var = (c3) o41Var.I;
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

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new q0(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
