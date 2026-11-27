// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bd9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new bd9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        cd9 cd9Var = (cd9) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        vnb vnbVar = cd9Var.P;
        e29 e29Var = cd9Var.c;
        ad9 ad9Var = cd9Var.b0;
        if (ad9Var == null || cd9Var.a0 != stargiftattributepattern.document.id) {
            cd9Var.a0 = stargiftattributepattern.document.id;
            if (ad9Var != null) {
                ad9Var.o(e29Var);
            }
            ad9 ad9Var2 = new ad9(3, cd9Var.W, stargiftattributepattern.document);
            cd9Var.b0 = ad9Var2;
            yob.x(cd9Var, ad9Var2, aob.E8, vnbVar, PorterDuff.Mode.SRC_IN);
        }
        if (e29Var.isAttachedToWindow()) {
            cd9Var.b0.b(e29Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = hl.u1(charSequence, str, vnbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new y7c(hl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        cd9Var.j(charSequence, 0, cd9Var.b0);
        cd9Var.setChecked(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new cd9(i, vnbVar, context);
    }
}
