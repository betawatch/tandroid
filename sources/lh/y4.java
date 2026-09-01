package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y4 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new y4());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) j51Var.G;
        int i10 = j51Var.z;
        String str = (String) j51Var.l;
        boolean z10 = j51Var.e;
        g6 g6Var = z4Var.C;
        lj0 lj0Var = z4Var.c;
        x4 x4Var = z4Var.K;
        if (x4Var == null || z4Var.J != stargiftattributepattern.document.id) {
            z4Var.J = stargiftattributepattern.document.id;
            if (x4Var != null) {
                x4Var.o(lj0Var);
            }
            x4 x4Var2 = new x4(3, z4Var.I, stargiftattributepattern.document);
            z4Var.K = x4Var2;
            x4Var2.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.E8, g6Var), PorterDuff.Mode.SRC_IN));
        }
        if (lj0Var.isAttachedToWindow()) {
            z4Var.K.a(lj0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, g6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        z4Var.g(charSequence, 0, z4Var.K);
        z4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new z4(context, i10, g6Var);
    }
}
