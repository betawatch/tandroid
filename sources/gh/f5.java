package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class f5 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new f5());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        g5 g5Var = (g5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) n41Var.G;
        int i10 = n41Var.z;
        String str = (String) n41Var.l;
        boolean z11 = n41Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = g5Var.B;
        ri0 ri0Var = g5Var.c;
        e5 e5Var = g5Var.J;
        if (e5Var == null || g5Var.I != stargiftattributepattern.document.id) {
            g5Var.I = stargiftattributepattern.document.id;
            if (e5Var != null) {
                e5Var.o(ri0Var);
            }
            e5 e5Var2 = new e5(3, g5Var.H, stargiftattributepattern.document);
            g5Var.J = e5Var2;
            e5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (ri0Var.isAttachedToWindow()) {
            g5Var.J.a(ri0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, c6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        g5Var.g(charSequence, 0, g5Var.J);
        g5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new g5(context, i10, c6Var);
    }
}
