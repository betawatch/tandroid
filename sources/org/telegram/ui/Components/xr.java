package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xr extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new xr());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
        g9Var.c(u61Var.l, u61Var.n, !u61Var.j);
        xh.n nVar = g9Var.a;
        if (u61Var.l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.Cells.g9 g9Var = new org.telegram.ui.Cells.g9(context, u6Var, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, g9Var, u6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.f7.y(g9Var, mutate, org.telegram.ui.ActionBar.y6.L6, u6Var, PorterDuff.Mode.MULTIPLY);
        g9Var.setImage(mutate);
        g9Var.setImageClickListener(new bi.w0(this, context, g9Var, 22));
        return g9Var;
    }
}
