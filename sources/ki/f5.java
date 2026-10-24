package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f5 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new f5());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) m61Var.G;
        e5 e5Var = (e5) m61Var.H;
        h1 h1Var = g5Var.r;
        g5Var.a = aVar;
        g5Var.s = e5Var;
        g5Var.f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).a.n3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(h1Var.getText()).equals(e6.l(richText))) {
            return;
        }
        h1Var.setTextSilently(Emoji.replaceEmoji(e6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
        h1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g5(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
