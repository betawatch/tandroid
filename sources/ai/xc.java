package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class xc extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new xc());
    }

    public static g61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        g61 J = g61.J(xc.class);
        J.d = i10;
        J.z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        yc ycVar = (yc) view;
        int i10 = g61Var.z;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        org.telegram.ui.Components.q6 q6Var = ycVar.e;
        TextView textView = ycVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        ycVar.n = i10;
        if (!equals) {
            ycVar.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (ycVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                ycVar.f = spannableString;
                spannableString.setSpan(new ca0(AndroidUtilities.dp(55.0f), q6Var), 0, ycVar.f.length(), 33);
            }
            charSequence2 = ycVar.f;
        }
        q6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(bs.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        ycVar.h = z10;
        ycVar.invalidate();
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.z == g61Var2.z && g61Var.d == g61Var2.d && TextUtils.equals(g61Var.m, g61Var2.m);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }
}
