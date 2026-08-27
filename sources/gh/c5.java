package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c5 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new c5());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        d5 d5Var = (d5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) n41Var.G;
        int i10 = n41Var.z;
        String str = (String) n41Var.l;
        boolean z11 = n41Var.e;
        ri0 ri0Var = d5Var.c;
        b5 b5Var = d5Var.J;
        if (b5Var == null || d5Var.I != stargiftattributemodel.document.id) {
            d5Var.I = stargiftattributemodel.document.id;
            if (b5Var != null) {
                b5Var.o(ri0Var);
            }
            d5Var.J = new b5(3, d5Var.H, stargiftattributemodel.document);
        }
        if (ri0Var.isAttachedToWindow()) {
            d5Var.J.a(ri0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, d5Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        d5Var.g(charSequence, 0, d5Var.J);
        d5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d5(context, i10, c6Var);
    }
}
