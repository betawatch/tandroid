package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m5 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new m5());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        o5 o5Var = (o5) view;
        a aVar = (a) f61Var.G;
        c3 c3Var = (c3) f61Var.H;
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
            o5Var.y();
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
            o5Var.d();
            o5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        o5 o5Var = new o5(context, d6Var);
        o5Var.setBackground(new a2(h6.w0(h6.d6, d6Var)));
        return o5Var;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
