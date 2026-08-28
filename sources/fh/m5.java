package fh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class m5 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new m5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        n5 n5Var = (n5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l41Var.G;
        int i9 = l41Var.z;
        String str = (String) l41Var.l;
        boolean z11 = l41Var.e;
        org.telegram.ui.ActionBar.b6 b6Var = n5Var.B;
        pi0 pi0Var = n5Var.c;
        l5 l5Var = n5Var.J;
        if (l5Var == null || n5Var.I != stargiftattributepattern.document.id) {
            n5Var.I = stargiftattributepattern.document.id;
            if (l5Var != null) {
                l5Var.o(pi0Var);
            }
            l5 l5Var2 = new l5(3, n5Var.H, stargiftattributepattern.document);
            n5Var.J = l5Var2;
            l5Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var), PorterDuff.Mode.SRC_IN));
        }
        if (pi0Var.isAttachedToWindow()) {
            n5Var.J.a(pi0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, b6Var);
        }
        if (i9 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i9));
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        n5Var.g(charSequence, 0, n5Var.J);
        n5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new n5(context, i9, b6Var);
    }
}
