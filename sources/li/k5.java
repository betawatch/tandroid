package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class k5 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new k5());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        m5 m5Var = (m5) view;
        a aVar = (a) r31Var.G;
        a3 a3Var = (a3) r31Var.H;
        o5 o5Var = m5Var.w;
        boolean z10 = true;
        boolean z11 = m5Var.a != aVar;
        m5Var.a = aVar;
        m5Var.E = a3Var;
        m5Var.D = hd.a0;
        m5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            e6 e6Var = new e6((TL_iv.pageBlockTable) pageBlock);
            m5Var.F = e6Var;
            o5Var.setModel(e6Var);
            LinkedHashSet linkedHashSet = m5Var.H;
            Objects.requireNonNull(linkedHashSet);
            o5Var.setSelectionProvider(new l2.y(linkedHashSet, 12));
            m5Var.A();
            g1 g1Var = m5Var.r;
            a aVar2 = m5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = c6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = c6.r(pageblocktable.title, null, true);
                    a aVar3 = m5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (c6.q(0, r10.length(), r10) & 1) == 0) {
                            z10 = false;
                        }
                        aVar3.r = z10;
                    }
                    g1Var.setAutoBold(m5Var.a.r);
                    if (z11 || !String.valueOf(g1Var.getText()).equals(l10)) {
                        g1Var.setTextSilently(i6.m(r10, g1Var.getPaint().getFontMetricsInt(), false, null, 0));
                        g1Var.f();
                    }
                }
            }
            m5Var.updateColors();
            m5Var.x.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        m5 m5Var = new m5(context, f6Var);
        m5Var.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return m5Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
