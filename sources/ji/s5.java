package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class s5 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new s5());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        u5 u5Var = (u5) view;
        a aVar = (a) m61Var.G;
        d3 d3Var = (d3) m61Var.H;
        w5 w5Var = u5Var.v;
        boolean z11 = true;
        boolean z12 = u5Var.a != aVar;
        u5Var.a = aVar;
        u5Var.E = d3Var;
        u5Var.y = LocaleController.isRTL;
        u5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            m6 m6Var = new m6((TL_iv.pageBlockTable) pageBlock);
            u5Var.F = m6Var;
            w5Var.setModel(m6Var);
            LinkedHashSet linkedHashSet = u5Var.H;
            Objects.requireNonNull(linkedHashSet);
            w5Var.setSelectionProvider(new m5(linkedHashSet, 0));
            u5Var.y();
            h1 h1Var = u5Var.r;
            a aVar2 = u5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = k6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = k6.r(pageblocktable.title, null, true);
                    a aVar3 = u5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (k6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    h1Var.setAutoBold(u5Var.a.r);
                    if (z12 || !String.valueOf(h1Var.getText()).equals(l4)) {
                        h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                        h1Var.invalidateEffects();
                    }
                }
            }
            u5Var.d();
            u5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        u5 u5Var = new u5(context, c6Var);
        u5Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
        return u5Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
