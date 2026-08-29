package jh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u9 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new u9());
    }

    public static w41 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        w41 J = w41.J(u9.class);
        J.d = i10;
        J.z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        v9 v9Var = (v9) view;
        int i10 = w41Var.z;
        CharSequence charSequence = w41Var.l;
        CharSequence charSequence2 = w41Var.m;
        org.telegram.ui.Components.o6 o6Var = v9Var.e;
        TextView textView = v9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        v9Var.n = i10;
        if (!equals) {
            v9Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (v9Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                v9Var.f = spannableString;
                spannableString.setSpan(new d90(AndroidUtilities.dp(55.0f), o6Var), 0, v9Var.f.length(), 33);
            }
            charSequence2 = v9Var.f;
        }
        o6Var.setText(charSequence2);
        float f9 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f9 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(jr.h).start();
        } else {
            textView.setTranslationX(f9 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        v9Var.h = z10;
        v9Var.invalidate();
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.z == w41Var2.z && w41Var.d == w41Var2.d && TextUtils.equals(w41Var.m, w41Var2.m);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new v9(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }
}
