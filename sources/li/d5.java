package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class d5 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new d5());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) r31Var.G;
        c5 c5Var = (c5) r31Var.H;
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

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new e5(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
