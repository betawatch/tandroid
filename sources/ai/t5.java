package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t5 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new t5());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        u5 u5Var = (u5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) r31Var.G;
        int i3 = r31Var.z;
        String str = (String) r31Var.l;
        boolean z11 = r31Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = u5Var.P;
        fh0 fh0Var = u5Var.c;
        s5 s5Var = u5Var.b0;
        if (s5Var == null || u5Var.a0 != stargiftattributepattern.document.id) {
            u5Var.a0 = stargiftattributepattern.document.id;
            if (s5Var != null) {
                s5Var.n(fh0Var);
            }
            s5 s5Var2 = new s5(3, u5Var.W, stargiftattributepattern.document);
            u5Var.b0 = s5Var2;
            org.telegram.ui.ActionBar.r6.y(u5Var, s5Var2, org.telegram.ui.ActionBar.k6.E8, e6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fh0Var.isAttachedToWindow()) {
            u5Var.b0.a(fh0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, e6Var);
        }
        if (i3 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i3));
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        u5Var.j(charSequence, 0, u5Var.b0);
        u5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u5(i3, context, e6Var);
    }
}
