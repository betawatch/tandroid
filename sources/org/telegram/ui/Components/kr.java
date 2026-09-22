package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kr extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new kr());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(i51Var.l, i51Var.n, !i51Var.j);
        vh.o oVar = c9Var.a;
        if (i51Var.l instanceof SpannableStringBuilder) {
            oVar.setTextSize(1, 13.0f);
            oVar.setTranslationY(AndroidUtilities.dp(2.0f));
            oVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, e6Var, true);
        c9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, e6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, e6Var), PorterDuff.Mode.MULTIPLY));
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new ai.d0(this, context, c9Var, 19));
        return c9Var;
    }
}
