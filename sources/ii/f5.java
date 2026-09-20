package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class f5 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new f5());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) w51Var.G;
        e5 e5Var = (e5) w51Var.H;
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

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g5(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
