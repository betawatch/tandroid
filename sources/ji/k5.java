package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k5 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new k5());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        TL_iv.RichText richText;
        l5 l5Var = (l5) view;
        a aVar = (a) m61Var.G;
        j5 j5Var = (j5) m61Var.H;
        h1 h1Var = l5Var.r;
        l5Var.a = aVar;
        l5Var.s = j5Var;
        l5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        l5Var.c(aVar);
        if (j5Var != null) {
            richText = (TL_iv.RichText) ((c3) j5Var).a.k3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(h1Var.getText()).equals(k6.l(richText))) {
            return;
        }
        h1Var.setTextSilently(Emoji.replaceEmoji(k6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
        h1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l5(context, c6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
