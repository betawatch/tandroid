// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oc9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new oc9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        pc9 pc9Var = (pc9) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        pc9Var.getClass();
        ShapeDrawable K = aob.K(hl.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = hl.u1(charSequence, str, pc9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new y7c(hl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        pc9Var.j(charSequence, 0, K);
        pc9Var.setChecked(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        pc9 pc9Var = new pc9(0, vnbVar, context, false, false);
        pc9Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        pc9Var.c(aob.E8, aob.F8);
        pc9Var.g(-1, PorterDuff.Mode.MULTIPLY);
        pc9Var.c.setTranslationX(hl.L(2.0f));
        pc9Var.a(2);
        pc9Var.setBackground(null);
        return pc9Var;
    }
}
