package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class d5 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new d5());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) y31Var.G;
        c5 c5Var = (c5) y31Var.H;
        g1 g1Var = e5Var.r;
        e5Var.a = aVar;
        e5Var.s = c5Var;
        e5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e5Var.c(aVar);
        if (c5Var != null) {
            richText = (TL_iv.RichText) ((z2) c5Var).a.t3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(g1Var.getText()).equals(c6.l(richText))) {
            return;
        }
        g1Var.setTextSilently(i6.m(c6.r(richText, null, true), g1Var.getPaint().getFontMetricsInt(), false, null, 0));
        g1Var.f();
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new e5(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
