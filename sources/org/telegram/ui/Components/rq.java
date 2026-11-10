package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rq extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new rq());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.c(x31Var.l, x31Var.n, !x31Var.j);
        xh.l lVar = x8Var.a;
        if (x31Var.l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, h6Var, true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, x8Var, h6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.t6.x(x8Var, mutate, org.telegram.ui.ActionBar.m6.L6, h6Var, PorterDuff.Mode.MULTIPLY);
        x8Var.setImage(mutate);
        x8Var.setImageClickListener(new ah.g(this, context, x8Var, 23));
        return x8Var;
    }
}
