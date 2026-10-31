package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class la extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.g9 b;
    public final TextView c;
    public final TextView d;

    public la(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
        addView(g9Var, w7.b6.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = f7;
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
    }
}
