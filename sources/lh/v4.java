package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v4 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new v4());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h51Var.G;
        int i10 = h51Var.z;
        String str = (String) h51Var.l;
        boolean z10 = h51Var.e;
        kj0 kj0Var = w4Var.c;
        u4 u4Var = w4Var.K;
        if (u4Var == null || w4Var.J != stargiftattributemodel.document.id) {
            w4Var.J = stargiftattributemodel.document.id;
            if (u4Var != null) {
                u4Var.o(kj0Var);
            }
            w4Var.K = new u4(3, w4Var.I, stargiftattributemodel.document);
        }
        if (kj0Var.isAttachedToWindow()) {
            w4Var.K.a(kj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, w4Var.C);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w4Var.g(charSequence, 0, w4Var.K);
        w4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new w4(context, i10, g6Var);
    }
}
