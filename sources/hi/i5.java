package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i5 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new i5());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        TL_iv.RichText richText;
        j5 j5Var = (j5) view;
        a aVar = (a) v51Var.G;
        h5 h5Var = (h5) v51Var.H;
        k1 k1Var = j5Var.r;
        j5Var.a = aVar;
        j5Var.s = h5Var;
        j5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        j5Var.c(aVar);
        if (h5Var != null) {
            richText = (TL_iv.RichText) ((e3) h5Var).a.m3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(k1Var.getText()).equals(i6.l(richText))) {
            return;
        }
        k1Var.setTextSilently(Emoji.replaceEmoji(i6.r(richText, null, true), k1Var.getPaint().getFontMetricsInt(), false));
        k1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j5(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
