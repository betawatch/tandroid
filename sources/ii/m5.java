package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class m5 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new m5());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        o5 o5Var = (o5) view;
        a aVar = (a) i51Var.G;
        c3 c3Var = (c3) i51Var.H;
        q5 q5Var = o5Var.v;
        boolean z11 = true;
        boolean z12 = o5Var.a != aVar;
        o5Var.a = aVar;
        o5Var.E = c3Var;
        o5Var.y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            h6 h6Var = new h6((TL_iv.pageBlockTable) pageBlock);
            o5Var.F = h6Var;
            q5Var.setModel(h6Var);
            LinkedHashSet linkedHashSet = o5Var.H;
            Objects.requireNonNull(linkedHashSet);
            q5Var.setSelectionProvider(new ei.d5(linkedHashSet, 22));
            o5Var.y();
            i1 i1Var = o5Var.r;
            a aVar2 = o5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = f6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = f6.r(pageblocktable.title, null, true);
                    a aVar3 = o5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (f6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    i1Var.setAutoBold(o5Var.a.r);
                    if (z12 || !String.valueOf(i1Var.getText()).equals(l4)) {
                        i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                        i1Var.invalidateEffects();
                    }
                }
            }
            o5Var.e();
            o5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        o5 o5Var = new o5(context, e6Var);
        o5Var.setBackground(new a2(i6.v0(i6.d6, e6Var)));
        return o5Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
