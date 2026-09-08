package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jr extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new jr());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(h51Var.l, h51Var.n, !h51Var.j);
        wh.p pVar = c9Var.a;
        if (h51Var.l instanceof SpannableStringBuilder) {
            pVar.setTextSize(1, 13.0f);
            pVar.setTranslationY(AndroidUtilities.dp(2.0f));
            pVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, f6Var, true);
        c9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var), PorterDuff.Mode.MULTIPLY));
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new bi.x(this, context, c9Var, 19));
        return c9Var;
    }
}
