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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v7 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new v7());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        w7 w7Var = (w7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.m;
        boolean z11 = o41Var.e;
        org.telegram.ui.ActionBar.h6 h6Var = w7Var.P;
        rh0 rh0Var = w7Var.c;
        u7 u7Var = w7Var.b0;
        if (u7Var == null || w7Var.a0 != stargiftattributepattern.document.id) {
            w7Var.a0 = stargiftattributepattern.document.id;
            if (u7Var != null) {
                u7Var.n(rh0Var);
            }
            u7 u7Var2 = new u7(3, w7Var.W, stargiftattributepattern.document);
            w7Var.b0 = u7Var2;
            org.telegram.ui.ActionBar.t6.x(w7Var, u7Var2, org.telegram.ui.ActionBar.m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (rh0Var.isAttachedToWindow()) {
            w7Var.b0.a(rh0Var);
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
        w7Var.j(charSequence, 0, w7Var.b0);
        w7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w7(i7, context, h6Var);
    }
}
