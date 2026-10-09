package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h5 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new h5());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        TL_iv.RichText richText;
        i5 i5Var = (i5) view;
        a aVar = (a) p61Var.G;
        g5 g5Var = (g5) p61Var.H;
        i1 i1Var = i5Var.r;
        i5Var.a = aVar;
        i5Var.s = g5Var;
        i5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i5Var.c(aVar);
        if (g5Var != null) {
            richText = (TL_iv.RichText) ((c3) g5Var).a.k3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(i1Var.getText()).equals(h6.l(richText))) {
            return;
        }
        i1Var.setTextSilently(Emoji.replaceEmoji(h6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
        i1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i5(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return false;
    }
}
