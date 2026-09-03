package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jr extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new jr());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(h51Var.l, h51Var.n, !h51Var.j);
        jh.s sVar = y8Var.a;
        if (h51Var.l instanceof SpannableStringBuilder) {
            sVar.setTextSize(1, 13.0f);
            sVar.setTranslationY(AndroidUtilities.dp(2.0f));
            sVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, g6Var, true);
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var), PorterDuff.Mode.MULTIPLY));
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new eg.o(this, context, y8Var, 22));
        return y8Var;
    }
}
