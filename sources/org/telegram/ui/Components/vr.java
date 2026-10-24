package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vr extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new vr());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(m61Var.l, m61Var.n, !m61Var.j);
        wh.n nVar = c9Var.a;
        if (m61Var.l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, g6Var, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, c9Var, g6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.r6.z(c9Var, mutate, org.telegram.ui.ActionBar.k6.L6, g6Var, PorterDuff.Mode.MULTIPLY);
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new ai.v0(this, context, c9Var, 22));
        return c9Var;
    }
}
