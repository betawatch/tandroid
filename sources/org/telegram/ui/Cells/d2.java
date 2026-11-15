package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i10 = 3;
        h6Var.setGravity(hd.a0 ? 5 : 3);
        h6Var.setImportantForAccessibility(2);
        h6Var.setOnWidthUpdatedListener(new f(this, i10));
        addView(h6Var, c8.ja.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ja.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = hd.a0;
        View view = this.b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.q6.Y(this.a, i7, e6Var);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
