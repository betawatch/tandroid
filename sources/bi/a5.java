package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a5 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new a5());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        b5 b5Var = (b5) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b41Var.G;
        int i7 = b41Var.z;
        String str = (String) b41Var.l;
        boolean z11 = b41Var.e;
        b5Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, b5Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        b5Var.j(charSequence, 0, L);
        b5Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        b5 b5Var = new b5(0, context, e6Var, false, false);
        b5Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        b5Var.c(org.telegram.ui.ActionBar.j6.E8, org.telegram.ui.ActionBar.j6.F8);
        b5Var.g(-1, PorterDuff.Mode.MULTIPLY);
        b5Var.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        b5Var.a(2);
        b5Var.setBackground(null);
        return b5Var;
    }
}
