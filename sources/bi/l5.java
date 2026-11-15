package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l5 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new l5());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        m5 m5Var = (m5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b41Var.G;
        int i7 = b41Var.z;
        String str = (String) b41Var.l;
        boolean z11 = b41Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = m5Var.P;
        fh0 fh0Var = m5Var.c;
        k5 k5Var = m5Var.b0;
        if (k5Var == null || m5Var.a0 != stargiftattributepattern.document.id) {
            m5Var.a0 = stargiftattributepattern.document.id;
            if (k5Var != null) {
                k5Var.n(fh0Var);
            }
            k5 k5Var2 = new k5(3, m5Var.W, stargiftattributepattern.document);
            m5Var.b0 = k5Var2;
            org.telegram.ui.ActionBar.q6.x(m5Var, k5Var2, org.telegram.ui.ActionBar.j6.E8, e6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fh0Var.isAttachedToWindow()) {
            m5Var.b0.a(fh0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, e6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        m5Var.j(charSequence, 0, m5Var.b0);
        m5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m5(i7, context, e6Var);
    }
}
