// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nb9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new nb9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ob9 ob9Var = (ob9) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        ylb ylbVar = ob9Var.P;
        s09 s09Var = ob9Var.c;
        mb9 mb9Var = ob9Var.b0;
        if (mb9Var == null || ob9Var.a0 != stargiftattributepattern.document.id) {
            ob9Var.a0 = stargiftattributepattern.document.id;
            if (mb9Var != null) {
                mb9Var.o(s09Var);
            }
            mb9 mb9Var2 = new mb9(3, ob9Var.W, stargiftattributepattern.document);
            ob9Var.b0 = mb9Var2;
            anb.x(ob9Var, mb9Var2, cmb.D8, ylbVar, PorterDuff.Mode.SRC_IN);
        }
        if (s09Var.isAttachedToWindow()) {
            ob9Var.b0.b(s09Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = gm.u1(charSequence, str, ylbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new z5c(gm.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        ob9Var.j(charSequence, 0, ob9Var.b0);
        ob9Var.setChecked(z2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ob9(i, ylbVar, context);
    }
}
