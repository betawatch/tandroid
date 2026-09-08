package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class y1 extends LinearLayout {
    public final ImageView a;
    public final org.telegram.ui.Components.q6 b;
    public final View c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = z1Var.b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, false);
        this.b = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setTextColor(v02);
        q6Var.setIncludeFontPadding(false);
        q6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            addView(q6Var, w7.x5.t(-2, 16, 16, 0, 0, this.a == null ? 11 : 3, 0));
            View view2 = this.a;
            if (view2 != null) {
                addView(view2, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.a;
            if (view3 != null) {
                addView(view3, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(q6Var, w7.x5.t(-2, 16, 16, this.a == null ? 11 : 0, 0, 3, 0));
            addView(view, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 16, 16));
        setClickable(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }
}
