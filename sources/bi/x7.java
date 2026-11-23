package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x7 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new x7());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        y7 y7Var = (y7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) n41Var.H;
        int i7 = n41Var.A;
        String str = (String) n41Var.m;
        boolean z11 = n41Var.e;
        org.telegram.ui.ActionBar.i6 i6Var = y7Var.P;
        qh0 qh0Var = y7Var.c;
        w7 w7Var = y7Var.b0;
        if (w7Var == null || y7Var.a0 != stargiftattributepattern.document.id) {
            y7Var.a0 = stargiftattributepattern.document.id;
            if (w7Var != null) {
                w7Var.n(qh0Var);
            }
            w7 w7Var2 = new w7(3, y7Var.W, stargiftattributepattern.document);
            y7Var.b0 = w7Var2;
            org.telegram.ui.ActionBar.u6.x(y7Var, w7Var2, org.telegram.ui.ActionBar.n6.E8, i6Var, PorterDuff.Mode.SRC_IN);
        }
        if (qh0Var.isAttachedToWindow()) {
            y7Var.b0.a(qh0Var);
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
            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        y7Var.j(charSequence, 0, y7Var.b0);
        y7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new y7(i7, context, i6Var);
    }
}
