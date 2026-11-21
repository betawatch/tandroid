package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class k5 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new k5());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        m5 m5Var = (m5) view;
        a aVar = (a) o41Var.H;
        b3 b3Var = (b3) o41Var.I;
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
            o5Var.setSelectionProvider(new kg.x1(linkedHashSet, 27));
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

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        m5 m5Var = new m5(context, h6Var);
        m5Var.setBackground(new y1(m6.w0(m6.d6, h6Var)));
        return m5Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
