package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d5 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new d5());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) n41Var.H;
        c5 c5Var = (c5) n41Var.I;
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

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new e5(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
