package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.f6 a;
    public final View b;
    public final org.telegram.ui.ActionBar.p6 c;

    public d2(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = p6Var;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.a = f6Var;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i10, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setGravity(cd.X ? 5 : 3);
        f6Var.setImportantForAccessibility(2);
        f6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(f6Var, w7.b6.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, w7.b6.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.a.getDrawable().c() + org.telegram.messenger.i0.L(1.0f);
        boolean z10 = cd.X;
        View view = this.b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.Z(this.a, i10, p6Var);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
