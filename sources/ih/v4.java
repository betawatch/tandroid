package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v4 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new v4());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) w41Var.G;
        int i10 = w41Var.z;
        String str = (String) w41Var.l;
        boolean z11 = w41Var.e;
        aj0 aj0Var = w4Var.c;
        u4 u4Var = w4Var.J;
        if (u4Var == null || w4Var.I != stargiftattributemodel.document.id) {
            w4Var.I = stargiftattributemodel.document.id;
            if (u4Var != null) {
                u4Var.o(aj0Var);
            }
            w4Var.J = new u4(3, w4Var.H, stargiftattributemodel.document);
        }
        if (aj0Var.isAttachedToWindow()) {
            w4Var.J.a(aj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, w4Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w4Var.g(charSequence, 0, w4Var.J);
        w4Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w4(context, i10, c6Var);
    }
}
