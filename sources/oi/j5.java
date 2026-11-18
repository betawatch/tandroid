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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j5 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new j5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        l5 l5Var = (l5) view;
        a aVar = (a) l41Var.H;
        a3 a3Var = (a3) l41Var.I;
        n5 n5Var = l5Var.w;
        boolean z11 = true;
        boolean z12 = l5Var.a != aVar;
        l5Var.a = aVar;
        l5Var.F = a3Var;
        l5Var.E = gd.a0;
        l5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            d6 d6Var = new d6((TL_iv.pageBlockTable) pageBlock);
            l5Var.G = d6Var;
            n5Var.setModel(d6Var);
            LinkedHashSet linkedHashSet = l5Var.I;
            Objects.requireNonNull(linkedHashSet);
            n5Var.setSelectionProvider(new ki.e(linkedHashSet, 26));
            l5Var.A();
            e1 e1Var = l5Var.r;
            a aVar2 = l5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l10 = b6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = b6.r(pageblocktable.title, null, true);
                    a aVar3 = l5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (b6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    e1Var.setAutoBold(l5Var.a.r);
                    if (z12 || !String.valueOf(e1Var.getText()).equals(l10)) {
                        e1Var.setTextSilently(j6.m(r10, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
                        e1Var.f();
                    }
                }
            }
            l5Var.updateColors();
            l5Var.x.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        l5 l5Var = new l5(context, i6Var);
        l5Var.setBackground(new w1(n6.w0(n6.d6, i6Var)));
        return l5Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
