package fh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j5 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new j5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        k5 k5Var = (k5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l41Var.G;
        int i9 = l41Var.z;
        String str = (String) l41Var.l;
        boolean z11 = l41Var.e;
        pi0 pi0Var = k5Var.c;
        i5 i5Var = k5Var.J;
        if (i5Var == null || k5Var.I != stargiftattributemodel.document.id) {
            k5Var.I = stargiftattributemodel.document.id;
            if (i5Var != null) {
                i5Var.o(pi0Var);
            }
            k5Var.J = new i5(3, k5Var.H, stargiftattributemodel.document);
        }
        if (pi0Var.isAttachedToWindow()) {
            k5Var.J.a(pi0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, k5Var.B);
        }
        if (i9 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i9));
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        k5Var.g(charSequence, 0, k5Var.J);
        k5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new k5(context, i9, b6Var);
    }
}
