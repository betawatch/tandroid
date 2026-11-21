package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class d5 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new d5());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) o41Var.H;
        c5 c5Var = (c5) o41Var.I;
        f1 f1Var = e5Var.r;
        e5Var.a = aVar;
        e5Var.s = c5Var;
        e5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e5Var.c(aVar);
        if (c5Var != null) {
            richText = (TL_iv.RichText) ((a3) c5Var).a.u3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(f1Var.getText()).equals(c6.l(richText))) {
            return;
        }
        f1Var.setTextSilently(j6.m(c6.r(richText, null, true), f1Var.getPaint().getFontMetricsInt(), false, null, 0));
        f1Var.f();
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e5(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
