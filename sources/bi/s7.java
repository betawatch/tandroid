package bi;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class s7 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new s7());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        t7 t7Var = (t7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.m;
        boolean z11 = l41Var.e;
        org.telegram.ui.ActionBar.i6 i6Var = t7Var.P;
        ph0 ph0Var = t7Var.c;
        r7 r7Var = t7Var.b0;
        if (r7Var == null || t7Var.a0 != stargiftattributepattern.document.id) {
            t7Var.a0 = stargiftattributepattern.document.id;
            if (r7Var != null) {
                r7Var.n(ph0Var);
            }
            r7 r7Var2 = new r7(3, t7Var.W, stargiftattributepattern.document);
            t7Var.b0 = r7Var2;
            org.telegram.ui.ActionBar.u6.x(t7Var, r7Var2, org.telegram.ui.ActionBar.n6.E8, i6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ph0Var.isAttachedToWindow()) {
            t7Var.b0.a(ph0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, i6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t7Var.j(charSequence, 0, t7Var.b0);
        t7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new t7(i7, context, i6Var);
    }
}
