package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q5 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new q5());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        r5 r5Var = (r5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) r31Var.G;
        int i3 = r31Var.z;
        String str = (String) r31Var.l;
        boolean z11 = r31Var.e;
        fh0 fh0Var = r5Var.c;
        p5 p5Var = r5Var.b0;
        if (p5Var == null || r5Var.a0 != stargiftattributemodel.document.id) {
            r5Var.a0 = stargiftattributemodel.document.id;
            if (p5Var != null) {
                p5Var.n(fh0Var);
            }
            r5Var.b0 = new p5(3, r5Var.W, stargiftattributemodel.document);
        }
        if (fh0Var.isAttachedToWindow()) {
            r5Var.b0.a(fh0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, r5Var.P);
        }
        if (i3 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i3));
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        r5Var.j(charSequence, 0, r5Var.b0);
        r5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r5(i3, context, e6Var);
    }
}
