package lh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v9 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v9());
    }

    public static i51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        i51 J = i51.J(v9.class);
        J.d = i10;
        J.z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        w9 w9Var = (w9) view;
        int i10 = i51Var.z;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        org.telegram.ui.Components.k6 k6Var = w9Var.e;
        TextView textView = w9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        w9Var.n = i10;
        if (!equals) {
            w9Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (w9Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                w9Var.f = spannableString;
                spannableString.setSpan(new k90(AndroidUtilities.dp(55.0f), k6Var), 0, w9Var.f.length(), 33);
            }
            charSequence2 = w9Var.f;
        }
        k6Var.setText(charSequence2);
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(mr.h).start();
        } else {
            textView.setTranslationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        w9Var.h = z4;
        w9Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.z == i51Var2.z && i51Var.d == i51Var2.d && TextUtils.equals(i51Var.m, i51Var2.m);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w9(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }
}
