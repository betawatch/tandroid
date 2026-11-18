package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h7 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new h7());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        i7 i7Var = (i7) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.m;
        boolean z11 = l41Var.e;
        i7Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, i7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        i7Var.j(charSequence, 0, L);
        i7Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        i7 i7Var = new i7(0, context, i6Var, false, false);
        i7Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        i7Var.c(org.telegram.ui.ActionBar.n6.E8, org.telegram.ui.ActionBar.n6.F8);
        i7Var.g(-1, PorterDuff.Mode.MULTIPLY);
        i7Var.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        i7Var.a(2);
        i7Var.setBackground(null);
        return i7Var;
    }
}
