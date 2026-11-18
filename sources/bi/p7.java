package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p7 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new p7());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        q7 q7Var = (q7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.m;
        boolean z11 = l41Var.e;
        ph0 ph0Var = q7Var.c;
        o7 o7Var = q7Var.b0;
        if (o7Var == null || q7Var.a0 != stargiftattributemodel.document.id) {
            q7Var.a0 = stargiftattributemodel.document.id;
            if (o7Var != null) {
                o7Var.n(ph0Var);
            }
            q7Var.b0 = new o7(3, q7Var.W, stargiftattributemodel.document);
        }
        if (ph0Var.isAttachedToWindow()) {
            q7Var.b0.a(ph0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, q7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        q7Var.j(charSequence, 0, q7Var.b0);
        q7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new q7(i7, context, i6Var);
    }
}
