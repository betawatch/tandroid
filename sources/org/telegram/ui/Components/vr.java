package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vr extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new vr());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.c(g61Var.l, g61Var.n, !g61Var.j);
        wh.n nVar = b9Var.a;
        if (g61Var.l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, d6Var, true);
        b9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var), PorterDuff.Mode.MULTIPLY));
        b9Var.setImage(mutate);
        b9Var.setImageClickListener(new ai.v0(this, context, b9Var, 22));
        return b9Var;
    }
}
