package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y1 extends LinearLayout {
    public final ImageView a;
    public final org.telegram.ui.Components.q6 b;
    public final View c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = z1Var.b;
        org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.a = imageView;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, false);
        this.b = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.r6.a0(q6Var, i11, g6Var);
        q6Var.setIncludeFontPadding(false);
        q6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.z(this, mutate, i11, g6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.z5.t(16, 16, 16, 11, 0, 3, 0));
            addView(q6Var, w7.z5.t(-2, 16, 16, 0, 0, this.a != null ? 3 : 11, 0));
            View view2 = this.a;
            if (view2 != null) {
                addView(view2, w7.z5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.a;
            if (view3 != null) {
                addView(view3, w7.z5.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(q6Var, w7.z5.t(-2, 16, 16, this.a == null ? 11 : 0, 0, 3, 0));
            addView(view, w7.z5.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        Drawable Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 16, 16);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(this, Z, null, O, g6Var);
        setClickable(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }
}
