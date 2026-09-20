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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z1 extends LinearLayout {
    public final ImageView a;
    public final org.telegram.ui.Components.o6 b;
    public final View c;

    public z1(a2 a2Var, Context context, int i10) {
        super(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = a2Var.b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        this.b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setTextColor(v02);
        o6Var.setIncludeFontPadding(false);
        o6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.y5.t(16, 16, 16, 11, 0, 3, 0));
            addView(o6Var, w7.y5.t(-2, 16, 16, 0, 0, this.a == null ? 11 : 3, 0));
            View view2 = this.a;
            if (view2 != null) {
                addView(view2, w7.y5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.a;
            if (view3 != null) {
                addView(view3, w7.y5.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(o6Var, w7.y5.t(-2, 16, 16, this.a == null ? 11 : 0, 0, 3, 0));
            addView(view, w7.y5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 16, 16));
        setClickable(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }
}
