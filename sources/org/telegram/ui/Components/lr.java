package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lr extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new lr());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.c(h51Var.l, h51Var.n, !h51Var.j);
        vh.o oVar = d9Var.a;
        if (h51Var.l instanceof SpannableStringBuilder) {
            oVar.setTextSize(1, 13.0f);
            oVar.setTranslationY(AndroidUtilities.dp(2.0f));
            oVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, d6Var, true);
        d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var), PorterDuff.Mode.MULTIPLY));
        d9Var.setImage(mutate);
        d9Var.setImageClickListener(new ai.d0(this, context, d9Var, 19));
        return d9Var;
    }
}
