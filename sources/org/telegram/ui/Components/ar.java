package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ar extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new ar());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.c(l41Var.l, l41Var.n, !l41Var.j);
        dh.u uVar = z8Var.a;
        if (l41Var.l instanceof SpannableStringBuilder) {
            uVar.setTextSize(1, 13.0f);
            uVar.setTranslationY(AndroidUtilities.dp(2.0f));
            uVar.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, b6Var, true);
        z8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var), PorterDuff.Mode.MULTIPLY));
        z8Var.setImage(mutate);
        z8Var.setImageClickListener(new fg.f(this, context, z8Var, 24));
        return z8Var;
    }
}
