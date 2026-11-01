package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class x5 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new x5());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        z5 z5Var = (z5) view;
        a aVar = (a) b51Var.G;
        k3 k3Var = (k3) b51Var.H;
        b6 b6Var = z5Var.w;
        boolean z11 = true;
        boolean z12 = z5Var.a != aVar;
        z5Var.a = aVar;
        z5Var.E = k3Var;
        z5Var.D = dd.X;
        z5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            w6 w6Var = new w6((TL_iv.pageBlockTable) pageBlock);
            z5Var.F = w6Var;
            b6Var.setModel(w6Var);
            LinkedHashSet linkedHashSet = z5Var.H;
            Objects.requireNonNull(linkedHashSet);
            b6Var.setSelectionProvider(new a1.c(linkedHashSet, 15));
            z5Var.A();
            n1 n1Var = z5Var.r;
            a aVar2 = z5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = s6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = s6.r(pageblocktable.title, null, true);
                    a aVar3 = z5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (s6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    n1Var.setAutoBold(z5Var.a.r);
                    if (z12 || !String.valueOf(n1Var.getText()).equals(l4)) {
                        n1Var.setTextSilently(org.telegram.messenger.k6.m(r10, n1Var.getPaint().getFontMetricsInt(), false, null, 0));
                        n1Var.f();
                    }
                }
            }
            z5Var.updateColors();
            z5Var.x.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        z5 z5Var = new z5(context, p6Var);
        z5Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
        return z5Var;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
