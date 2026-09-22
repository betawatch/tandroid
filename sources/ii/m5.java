package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class m5 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new m5());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        o5 o5Var = (o5) view;
        a aVar = (a) y51Var.G;
        c3 c3Var = (c3) y51Var.H;
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

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        o5 o5Var = new o5(context, f6Var);
        o5Var.setBackground(new a2(j6.v0(j6.d6, f6Var)));
        return o5Var;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
