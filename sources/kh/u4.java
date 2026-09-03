package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new u4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        v4 v4Var = (v4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z10 = i51Var.e;
        jj0 jj0Var = v4Var.c;
        t4 t4Var = v4Var.K;
        if (t4Var == null || v4Var.J != stargiftattributemodel.document.id) {
            v4Var.J = stargiftattributemodel.document.id;
            if (t4Var != null) {
                t4Var.o(jj0Var);
            }
            v4Var.K = new t4(3, v4Var.I, stargiftattributemodel.document);
        }
        if (jj0Var.isAttachedToWindow()) {
            v4Var.K.a(jj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, v4Var.C);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        v4Var.g(charSequence, 0, v4Var.K);
        v4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new v4(context, i10, f6Var);
    }
}
