package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class o5 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new o5());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        q5 q5Var = (q5) view;
        a aVar = (a) h61Var.G;
        d3 d3Var = (d3) h61Var.H;
        s5 s5Var = q5Var.v;
        boolean z11 = true;
        boolean z12 = q5Var.a != aVar;
        q5Var.a = aVar;
        q5Var.E = d3Var;
        q5Var.y = LocaleController.isRTL;
        q5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            j6 j6Var = new j6((TL_iv.pageBlockTable) pageBlock);
            q5Var.F = j6Var;
            s5Var.setModel(j6Var);
            LinkedHashSet linkedHashSet = q5Var.H;
            Objects.requireNonNull(linkedHashSet);
            s5Var.setSelectionProvider(new ei.f(linkedHashSet, 22));
            q5Var.y();
            i1 i1Var = q5Var.r;
            a aVar2 = q5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = h6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = h6.r(pageblocktable.title, null, true);
                    a aVar3 = q5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (h6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    i1Var.setAutoBold(q5Var.a.r);
                    if (z12 || !String.valueOf(i1Var.getText()).equals(l4)) {
                        i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                        i1Var.invalidateEffects();
                    }
                }
            }
            q5Var.e();
            q5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q5 q5Var = new q5(context, d6Var);
        q5Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var)));
        return q5Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
