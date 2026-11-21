package bi;

import android.content.Context;
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
public final class s7 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new s7());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        t7 t7Var = (t7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.m;
        boolean z11 = o41Var.e;
        rh0 rh0Var = t7Var.c;
        r7 r7Var = t7Var.b0;
        if (r7Var == null || t7Var.a0 != stargiftattributemodel.document.id) {
            t7Var.a0 = stargiftattributemodel.document.id;
            if (r7Var != null) {
                r7Var.n(rh0Var);
            }
            t7Var.b0 = new r7(3, t7Var.W, stargiftattributemodel.document);
        }
        if (rh0Var.isAttachedToWindow()) {
            t7Var.b0.a(rh0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, t7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t7Var.j(charSequence, 0, t7Var.b0);
        t7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new t7(i7, context, h6Var);
    }
}
