// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kb9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new kb9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        lb9 lb9Var = (lb9) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        s09 s09Var = lb9Var.c;
        jb9 jb9Var = lb9Var.b0;
        if (jb9Var == null || lb9Var.a0 != stargiftattributemodel.document.id) {
            lb9Var.a0 = stargiftattributemodel.document.id;
            if (jb9Var != null) {
                jb9Var.o(s09Var);
            }
            lb9Var.b0 = new jb9(3, lb9Var.W, stargiftattributemodel.document);
        }
        if (s09Var.isAttachedToWindow()) {
            lb9Var.b0.b(s09Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = gm.u1(charSequence, str, lb9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new z5c(gm.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        lb9Var.j(charSequence, 0, lb9Var.b0);
        lb9Var.setChecked(z2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new lb9(i, ylbVar, context);
    }
}
