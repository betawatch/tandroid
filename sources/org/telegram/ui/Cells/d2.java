package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.h6 a;
    public final View b;
    public final org.telegram.ui.ActionBar.e6 c;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.a = h6Var;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(bd.a0 ? 5 : 3);
        h6Var.setImportantForAccessibility(2);
        h6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(h6Var, mf.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, mf.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c2 = this.a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = bd.a0;
        View view = this.b;
        if (z10) {
            view.setTranslationX(-c2);
        } else {
            view.setTranslationX(c2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.Z(this.a, i3, e6Var);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
