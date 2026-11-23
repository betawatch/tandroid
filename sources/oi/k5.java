package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k5 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new k5());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        m5 m5Var = (m5) view;
        a aVar = (a) n41Var.H;
        b3 b3Var = (b3) n41Var.I;
        o5 o5Var = m5Var.w;
        boolean z11 = true;
        boolean z12 = m5Var.a != aVar;
        m5Var.a = aVar;
        m5Var.F = b3Var;
        m5Var.E = gd.a0;
        m5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            e6 e6Var = new e6((TL_iv.pageBlockTable) pageBlock);
            m5Var.G = e6Var;
            o5Var.setModel(e6Var);
            LinkedHashSet linkedHashSet = m5Var.I;
            Objects.requireNonNull(linkedHashSet);
            o5Var.setSelectionProvider(new kg.f1(linkedHashSet, 29));
            m5Var.A();
            f1 f1Var = m5Var.r;
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
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    f1Var.setAutoBold(m5Var.a.r);
                    if (z12 || !String.valueOf(f1Var.getText()).equals(l10)) {
                        f1Var.setTextSilently(j6.m(r10, f1Var.getPaint().getFontMetricsInt(), false, null, 0));
                        f1Var.f();
                    }
                }
            }
            m5Var.updateColors();
            m5Var.x.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        m5 m5Var = new m5(context, i6Var);
        m5Var.setBackground(new y1(n6.w0(n6.d6, i6Var)));
        return m5Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
