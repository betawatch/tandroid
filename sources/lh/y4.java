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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y4 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new y4());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h51Var.G;
        int i10 = h51Var.z;
        String str = (String) h51Var.l;
        boolean z10 = h51Var.e;
        g6 g6Var = z4Var.C;
        kj0 kj0Var = z4Var.c;
        x4 x4Var = z4Var.K;
        if (x4Var == null || z4Var.J != stargiftattributepattern.document.id) {
            z4Var.J = stargiftattributepattern.document.id;
            if (x4Var != null) {
                x4Var.o(kj0Var);
            }
            x4 x4Var2 = new x4(3, z4Var.I, stargiftattributepattern.document);
            z4Var.K = x4Var2;
            x4Var2.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.E8, g6Var), PorterDuff.Mode.SRC_IN));
        }
        if (kj0Var.isAttachedToWindow()) {
            z4Var.K.a(kj0Var);
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
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        z4Var.g(charSequence, 0, z4Var.K);
        z4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new z4(context, i10, g6Var);
    }
}
