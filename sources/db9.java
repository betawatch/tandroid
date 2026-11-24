// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class db9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new db9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        eb9 eb9Var = (eb9) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        eb9Var.getClass();
        ShapeDrawable K = cmb.K(gm.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = gm.u1(charSequence, str, eb9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.setSpan(new z5c(gm.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        eb9Var.j(charSequence, 0, K);
        eb9Var.setChecked(z2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        eb9 eb9Var = new eb9(0, ylbVar, context, false, false);
        eb9Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        eb9Var.c(cmb.D8, cmb.E8);
        eb9Var.g(-1, PorterDuff.Mode.MULTIPLY);
        eb9Var.c.setTranslationX(gm.L(2.0f));
        eb9Var.a(2);
        eb9Var.setBackground(null);
        return eb9Var;
    }
}
