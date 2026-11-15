package bi;

import android.content.Context;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i5 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new i5());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        j5 j5Var = (j5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b41Var.G;
        int i7 = b41Var.z;
        String str = (String) b41Var.l;
        boolean z11 = b41Var.e;
        fh0 fh0Var = j5Var.c;
        h5 h5Var = j5Var.b0;
        if (h5Var == null || j5Var.a0 != stargiftattributemodel.document.id) {
            j5Var.a0 = stargiftattributemodel.document.id;
            if (h5Var != null) {
                h5Var.n(fh0Var);
            }
            j5Var.b0 = new h5(3, j5Var.W, stargiftattributemodel.document);
        }
        if (fh0Var.isAttachedToWindow()) {
            j5Var.b0.a(fh0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, j5Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        j5Var.j(charSequence, 0, j5Var.b0);
        j5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j5(i7, context, e6Var);
    }
}
