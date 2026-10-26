package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xr extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new xr());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
        g9Var.c(t61Var.l, t61Var.n, !t61Var.j);
        xh.n nVar = g9Var.a;
        if (t61Var.l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.Cells.g9 g9Var = new org.telegram.ui.Cells.g9(context, u6Var, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, g9Var, u6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.f7.y(g9Var, mutate, org.telegram.ui.ActionBar.y6.L6, u6Var, PorterDuff.Mode.MULTIPLY);
        g9Var.setImage(mutate);
        g9Var.setImageClickListener(new bi.w0(this, context, g9Var, 22));
        return g9Var;
    }
}
