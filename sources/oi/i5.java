package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class i5 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new i5());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        k5 k5Var = (k5) view;
        a aVar = (a) b41Var.G;
        y2 y2Var = (y2) b41Var.H;
        m5 m5Var = k5Var.w;
        boolean z11 = true;
        boolean z12 = k5Var.a != aVar;
        k5Var.a = aVar;
        k5Var.F = y2Var;
        k5Var.E = hd.a0;
        k5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            c6 c6Var = new c6((TL_iv.pageBlockTable) pageBlock);
            k5Var.G = c6Var;
            m5Var.setModel(c6Var);
            LinkedHashSet linkedHashSet = k5Var.I;
            Objects.requireNonNull(linkedHashSet);
            m5Var.setSelectionProvider(new ki.e(linkedHashSet, 25));
            k5Var.A();
            e1 e1Var = k5Var.r;
            a aVar2 = k5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = a6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = a6.r(pageblocktable.title, null, true);
                    a aVar3 = k5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (a6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    e1Var.setAutoBold(k5Var.a.r);
                    if (z12 || !String.valueOf(e1Var.getText()).equals(l10)) {
                        e1Var.setTextSilently(j6.m(r10, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
                        e1Var.f();
                    }
                }
            }
            k5Var.updateColors();
            k5Var.x.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        k5 k5Var = new k5(context, e6Var);
        k5Var.setBackground(new w1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var)));
        return k5Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
