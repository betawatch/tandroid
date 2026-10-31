package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ib extends ta {
    public final g9 a;
    public final TextView b;

    public ib(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        g9 g9Var = new g9(getContext());
        this.a = g9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(g9Var, w7.b6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.vj, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.b6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
