package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gr extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new gr());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(l41Var.m, l41Var.o, !l41Var.j);
        xh.l lVar = y8Var.a;
        if (l41Var.m instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, i6Var, true);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, y8Var, i6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.u6.x(y8Var, mutate, org.telegram.ui.ActionBar.n6.L6, i6Var, PorterDuff.Mode.MULTIPLY);
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new ah.h(this, context, y8Var, 28));
        return y8Var;
    }
}
