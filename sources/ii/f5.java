package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class f5 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new f5());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) j51Var.G;
        e5 e5Var = (e5) j51Var.H;
        i1 i1Var = g5Var.r;
        g5Var.a = aVar;
        g5Var.s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).a.m3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(i1Var.getText()).equals(f6.l(richText))) {
            return;
        }
        i1Var.setTextSilently(Emoji.replaceEmoji(f6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
        i1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g5(context, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
