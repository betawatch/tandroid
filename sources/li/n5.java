package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n5 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new n5());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        p5 p5Var = (p5) view;
        a aVar = (a) t61Var.G;
        b3 b3Var = (b3) t61Var.H;
        r5 r5Var = p5Var.v;
        boolean z11 = true;
        boolean z12 = p5Var.a != aVar;
        p5Var.a = aVar;
        p5Var.E = b3Var;
        p5Var.y = LocaleController.isRTL;
        p5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            h6 h6Var = new h6((TL_iv.pageBlockTable) pageBlock);
            p5Var.F = h6Var;
            r5Var.setModel(h6Var);
            LinkedHashSet linkedHashSet = p5Var.H;
            Objects.requireNonNull(linkedHashSet);
            r5Var.setSelectionProvider(new jg.e1(linkedHashSet, 14));
            p5Var.x();
            g1 g1Var = p5Var.r;
            a aVar2 = p5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = f6.l(pageblocktable.title);
                    SpannableStringBuilder r6 = f6.r(pageblocktable.title, null, true);
                    a aVar3 = p5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r6.length() != 0 && (f6.q(0, r6.length(), r6) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    g1Var.setAutoBold(p5Var.a.r);
                    if (z12 || !String.valueOf(g1Var.getText()).equals(l4)) {
                        g1Var.setTextSilently(Emoji.replaceEmoji(r6, g1Var.getPaint().getFontMetricsInt(), false));
                        g1Var.invalidateEffects();
                    }
                }
            }
            p5Var.updateColors();
            p5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        p5 p5Var = new p5(context, u6Var);
        p5Var.setBackground(new y1(y6.w0(y6.d6, u6Var)));
        return p5Var;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
