package mi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class e5 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new e5());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        TL_iv.RichText richText;
        f5 f5Var = (f5) view;
        a aVar = (a) r31Var.G;
        d5 d5Var = (d5) r31Var.H;
        h1 h1Var = f5Var.r;
        f5Var.a = aVar;
        f5Var.s = d5Var;
        f5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f5Var.c(aVar);
        if (d5Var != null) {
            richText = (TL_iv.RichText) ((a3) d5Var).a.u3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(h1Var.getText()).equals(d6.l(richText))) {
            return;
        }
        h1Var.setTextSilently(i6.m(d6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false, null, 0));
        h1Var.f();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f5(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
