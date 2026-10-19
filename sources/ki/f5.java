package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class f5 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new f5());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) g61Var.G;
        e5 e5Var = (e5) g61Var.H;
        h1 h1Var = g5Var.r;
        g5Var.a = aVar;
        g5Var.s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).a.k3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(h1Var.getText()).equals(e6.l(richText))) {
            return;
        }
        h1Var.setTextSilently(Emoji.replaceEmoji(e6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
        h1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g5(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
