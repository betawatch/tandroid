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
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x1 extends LinearLayout {
    public final ImageView a;
    public final org.telegram.ui.Components.s6 b;
    public final View c;

    public x1(y1 y1Var, Context context, int i10) {
        super(context);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = y1Var.b;
        org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.a = imageView;
            org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, false);
        this.b = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, u6Var);
        s6Var.setIncludeFontPadding(false);
        s6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, kb1.x(16, 16, 16, 11, 0, 3, 0));
            addView(s6Var, kb1.x(-2, 16, 16, 0, 0, this.a != null ? 3 : 11, 0));
            View view2 = this.a;
            if (view2 != null) {
                addView(view2, kb1.x(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.a;
            if (view3 != null) {
                addView(view3, kb1.x(16, 16, 16, 11, 0, 3, 0));
            }
            addView(s6Var, kb1.x(-2, 16, 16, this.a == null ? 11 : 0, 0, 3, 0));
            addView(view, kb1.x(16, 16, 16, 0, 0, 11, 0));
        }
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        Drawable Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 16, 16);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
        setClickable(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }
}
