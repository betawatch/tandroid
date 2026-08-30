package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class v4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z10 = i51Var.e;
        jj0 jj0Var = w4Var.c;
        u4 u4Var = w4Var.K;
        if (u4Var == null || w4Var.J != stargiftattributemodel.document.id) {
            w4Var.J = stargiftattributemodel.document.id;
            if (u4Var != null) {
                u4Var.o(jj0Var);
            }
            w4Var.K = new u4(3, w4Var.I, stargiftattributemodel.document);
        }
        if (jj0Var.isAttachedToWindow()) {
            w4Var.K.a(jj0Var);
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
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w4Var.g(charSequence, 0, w4Var.K);
        w4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w4(context, i10, f6Var);
    }
}
