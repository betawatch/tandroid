package gh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class aa extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new aa());
    }

    public static l41 a(int i9, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        l41 J = l41.J(aa.class);
        J.d = i9;
        J.z = i10;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ba baVar = (ba) view;
        int i9 = l41Var.z;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        org.telegram.ui.Components.j6 j6Var = baVar.e;
        TextView textView = baVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        baVar.n = i9;
        if (!equals) {
            baVar.r.d(i9, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (baVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                baVar.f = spannableString;
                spannableString.setSpan(new q80(AndroidUtilities.dp(55.0f), j6Var), 0, baVar.f.length(), 33);
            }
            charSequence2 = baVar.f;
        }
        j6Var.setText(charSequence2);
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f10 * (i9 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(gr.h).start();
        } else {
            textView.setTranslationX(f10 * (i9 - 1) * AndroidUtilities.dp(2.66f));
        }
        baVar.h = z10;
        baVar.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.z == l41Var2.z && l41Var.d == l41Var2.d && TextUtils.equals(l41Var.m, l41Var2.m);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ba(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
