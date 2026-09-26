package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class n5 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n5());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        p5 p5Var = (p5) view;
        a aVar = (a) v51Var.G;
        d3 d3Var = (d3) v51Var.H;
        r5 r5Var = p5Var.v;
        boolean z11 = true;
        boolean z12 = p5Var.a != aVar;
        p5Var.a = aVar;
        p5Var.E = d3Var;
        p5Var.y = LocaleController.isRTL;
        p5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            i6 i6Var = new i6((TL_iv.pageBlockTable) pageBlock);
            p5Var.F = i6Var;
            r5Var.setModel(i6Var);
            LinkedHashSet linkedHashSet = p5Var.H;
            Objects.requireNonNull(linkedHashSet);
            r5Var.setSelectionProvider(new ei.d5(linkedHashSet, 21));
            p5Var.y();
            i1 i1Var = p5Var.r;
            a aVar2 = p5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = g6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = g6.r(pageblocktable.title, null, true);
                    a aVar3 = p5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (g6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    i1Var.setAutoBold(p5Var.a.r);
                    if (z12 || !String.valueOf(i1Var.getText()).equals(l4)) {
                        i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                        i1Var.invalidateEffects();
                    }
                }
            }
            p5Var.e();
            p5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        p5 p5Var = new p5(context, d6Var);
        p5Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var)));
        return p5Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
