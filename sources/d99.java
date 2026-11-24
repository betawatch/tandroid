// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d99 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new d99());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        e99 e99Var = (e99) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) c4cVar.H;
        int i = c4cVar.A;
        String str = (String) c4cVar.m;
        boolean z2 = c4cVar.e;
        e99Var.getClass();
        ShapeDrawable K = bkb.K(gl.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = gl.u1(charSequence, str, e99Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new z3c(gl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        e99Var.j(charSequence, 0, K);
        e99Var.setChecked(z2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        e99 e99Var = new e99(0, wjbVar, context, false, false);
        e99Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        e99Var.c(bkb.D8, bkb.E8);
        e99Var.g(-1, PorterDuff.Mode.MULTIPLY);
        e99Var.c.setTranslationX(gl.L(2.0f));
        e99Var.a(2);
        e99Var.setBackground(null);
        return e99Var;
    }
}
