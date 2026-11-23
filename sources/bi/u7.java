package bi;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u7 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new u7());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        v7 v7Var = (v7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.m;
        boolean z11 = o41Var.e;
        org.telegram.ui.ActionBar.h6 h6Var = v7Var.P;
        rh0 rh0Var = v7Var.c;
        t7 t7Var = v7Var.b0;
        if (t7Var == null || v7Var.a0 != stargiftattributepattern.document.id) {
            v7Var.a0 = stargiftattributepattern.document.id;
            if (t7Var != null) {
                t7Var.n(rh0Var);
            }
            t7 t7Var2 = new t7(3, v7Var.W, stargiftattributepattern.document);
            v7Var.b0 = t7Var2;
            org.telegram.ui.ActionBar.t6.x(v7Var, t7Var2, org.telegram.ui.ActionBar.m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (rh0Var.isAttachedToWindow()) {
            v7Var.b0.a(rh0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, h6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        v7Var.j(charSequence, 0, v7Var.b0);
        v7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v7(i7, context, h6Var);
    }
}
