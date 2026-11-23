package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ir extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new ir());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(o41Var.m, o41Var.o, !o41Var.j);
        xh.l lVar = y8Var.a;
        if (o41Var.m instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, h6Var, true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, y8Var, h6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.t6.x(y8Var, mutate, org.telegram.ui.ActionBar.m6.L6, h6Var, PorterDuff.Mode.MULTIPLY);
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new ah.h(this, context, y8Var, 28));
        return y8Var;
    }
}
