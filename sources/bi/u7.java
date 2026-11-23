package bi;

import android.content.Context;
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
public final class u7 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new u7());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        v7 v7Var = (v7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) n41Var.H;
        int i7 = n41Var.A;
        String str = (String) n41Var.m;
        boolean z11 = n41Var.e;
        qh0 qh0Var = v7Var.c;
        t7 t7Var = v7Var.b0;
        if (t7Var == null || v7Var.a0 != stargiftattributemodel.document.id) {
            v7Var.a0 = stargiftattributemodel.document.id;
            if (t7Var != null) {
                t7Var.n(qh0Var);
            }
            v7Var.b0 = new t7(3, v7Var.W, stargiftattributemodel.document);
        }
        if (qh0Var.isAttachedToWindow()) {
            v7Var.b0.a(qh0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, v7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        v7Var.j(charSequence, 0, v7Var.b0);
        v7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new v7(i7, context, i6Var);
    }
}
