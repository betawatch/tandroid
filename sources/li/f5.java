package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f5 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new f5());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) t61Var.G;
        e5 e5Var = (e5) t61Var.H;
        g1 g1Var = g5Var.r;
        g5Var.a = aVar;
        g5Var.s = e5Var;
        g5Var.f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((a3) e5Var).a.u3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(g1Var.getText()).equals(f6.l(richText))) {
            return;
        }
        g1Var.setTextSilently(Emoji.replaceEmoji(f6.r(richText, null, true), g1Var.getPaint().getFontMetricsInt(), false));
        g1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new g5(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
