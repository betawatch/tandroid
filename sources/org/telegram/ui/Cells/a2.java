package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout {
    public final org.telegram.ui.Components.q6 a;
    public final View b;
    public final org.telegram.ui.ActionBar.g6 c;

    public a2(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = g6Var;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.a = q6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.a0(q6Var, i10, g6Var);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        q6Var.setImportantForAccessibility(2);
        q6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(q6Var, w7.z5.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.z(this, mutate, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, w7.z5.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.a.getDrawable().c() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.r6.a0(this.a, i10, g6Var);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
