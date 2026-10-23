package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m5 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new m5());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        o5 o5Var = (o5) view;
        a aVar = (a) m61Var.G;
        c3 c3Var = (c3) m61Var.H;
        q5 q5Var = o5Var.v;
        boolean z11 = true;
        boolean z12 = o5Var.a != aVar;
        o5Var.a = aVar;
        o5Var.E = c3Var;
        o5Var.y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            g6 g6Var = new g6((TL_iv.pageBlockTable) pageBlock);
            o5Var.F = g6Var;
            q5Var.setModel(g6Var);
            LinkedHashSet linkedHashSet = o5Var.H;
            Objects.requireNonNull(linkedHashSet);
            q5Var.setSelectionProvider(new j5.b(linkedHashSet, 10));
            o5Var.x();
            h1 h1Var = o5Var.r;
            a aVar2 = o5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = e6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = e6.r(pageblocktable.title, null, true);
                    a aVar3 = o5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (e6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    h1Var.setAutoBold(o5Var.a.r);
                    if (z12 || !String.valueOf(h1Var.getText()).equals(l4)) {
                        h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                        h1Var.invalidateEffects();
                    }
                }
            }
            o5Var.updateColors();
            o5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        o5 o5Var = new o5(context, g6Var);
        o5Var.setBackground(new a2(k6.w0(k6.d6, g6Var)));
        return o5Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
