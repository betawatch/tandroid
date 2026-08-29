package ih;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y4 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new y4());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w41Var.G;
        int i10 = w41Var.z;
        String str = (String) w41Var.l;
        boolean z11 = w41Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = z4Var.B;
        aj0 aj0Var = z4Var.c;
        x4 x4Var = z4Var.J;
        if (x4Var == null || z4Var.I != stargiftattributepattern.document.id) {
            z4Var.I = stargiftattributepattern.document.id;
            if (x4Var != null) {
                x4Var.o(aj0Var);
            }
            x4 x4Var2 = new x4(3, z4Var.H, stargiftattributepattern.document);
            z4Var.J = x4Var2;
            x4Var2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (aj0Var.isAttachedToWindow()) {
            z4Var.J.a(aj0Var);
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
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        z4Var.g(charSequence, 0, z4Var.J);
        z4Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new z4(context, i10, c6Var);
    }
}
