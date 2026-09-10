package hi;

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
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p5 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new p5());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        r5 r5Var = (r5) view;
        a aVar = (a) v51Var.G;
        f3 f3Var = (f3) v51Var.H;
        t5 t5Var = r5Var.v;
        boolean z11 = true;
        boolean z12 = r5Var.a != aVar;
        r5Var.a = aVar;
        r5Var.E = f3Var;
        r5Var.y = LocaleController.isRTL;
        r5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            l6 l6Var = new l6((TL_iv.pageBlockTable) pageBlock);
            r5Var.F = l6Var;
            t5Var.setModel(l6Var);
            LinkedHashSet linkedHashSet = r5Var.H;
            Objects.requireNonNull(linkedHashSet);
            t5Var.setSelectionProvider(new y1(linkedHashSet, 6));
            r5Var.y();
            k1 k1Var = r5Var.r;
            a aVar2 = r5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock2 = aVar2.b;
                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                    if (pageblocktable.title == null) {
                        pageblocktable.title = new TL_iv.textEmpty();
                    }
                    String l4 = i6.l(pageblocktable.title);
                    SpannableStringBuilder r10 = i6.r(pageblocktable.title, null, true);
                    a aVar3 = r5Var.a;
                    if (!aVar3.s) {
                        aVar3.s = true;
                        if (r10.length() != 0 && (i6.q(0, r10.length(), r10) & 1) == 0) {
                            z11 = false;
                        }
                        aVar3.r = z11;
                    }
                    k1Var.setAutoBold(r5Var.a.r);
                    if (z12 || !String.valueOf(k1Var.getText()).equals(l4)) {
                        k1Var.setTextSilently(Emoji.replaceEmoji(r10, k1Var.getPaint().getFontMetricsInt(), false));
                        k1Var.invalidateEffects();
                    }
                }
            }
            r5Var.e();
            r5Var.w.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        r5 r5Var = new r5(context, f6Var);
        r5Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return r5Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
