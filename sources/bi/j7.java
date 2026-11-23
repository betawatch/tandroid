package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j7 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new j7());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        k7 k7Var = (k7) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.m;
        boolean z11 = o41Var.e;
        k7Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, k7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        k7Var.j(charSequence, 0, L);
        k7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        k7 k7Var = new k7(0, context, h6Var, false, false);
        k7Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        k7Var.c(org.telegram.ui.ActionBar.m6.E8, org.telegram.ui.ActionBar.m6.F8);
        k7Var.g(-1, PorterDuff.Mode.MULTIPLY);
        k7Var.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        k7Var.a(2);
        k7Var.setBackground(null);
        return k7Var;
    }
}
