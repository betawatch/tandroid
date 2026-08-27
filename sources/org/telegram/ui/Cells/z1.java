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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout {
    public final org.telegram.ui.Components.j6 a;
    public final View b;
    public final org.telegram.ui.ActionBar.c6 c;

    public z1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = c6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.a = j6Var;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.setImportantForAccessibility(2);
        j6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(j6Var, h7.z5.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        addView(view, h7.z5.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float d = this.a.getDrawable().d() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.b;
        if (z10) {
            view.setTranslationX(-d);
        } else {
            view.setTranslationX(d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.c);
        this.a.setTextColor(v02);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
    }
}
