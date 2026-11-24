// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n99 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new n99());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        o99 o99Var = (o99) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) c4cVar.H;
        int i = c4cVar.A;
        String str = (String) c4cVar.m;
        boolean z2 = c4cVar.e;
        wjb wjbVar = o99Var.P;
        ry8 ry8Var = o99Var.c;
        m99 m99Var = o99Var.b0;
        if (m99Var == null || o99Var.a0 != stargiftattributepattern.document.id) {
            o99Var.a0 = stargiftattributepattern.document.id;
            if (m99Var != null) {
                m99Var.o(ry8Var);
            }
            m99 m99Var2 = new m99(3, o99Var.W, stargiftattributepattern.document);
            o99Var.b0 = m99Var2;
            zkb.x(o99Var, m99Var2, bkb.D8, wjbVar, PorterDuff.Mode.SRC_IN);
        }
        if (ry8Var.isAttachedToWindow()) {
            o99Var.b0.b(ry8Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = gl.u1(charSequence, str, wjbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new z3c(gl.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        o99Var.j(charSequence, 0, o99Var.b0);
        o99Var.setChecked(z2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new o99(i, wjbVar, context);
    }
}
