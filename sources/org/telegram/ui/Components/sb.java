package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class sb extends ta {
    public final g9 a;
    public final TextView b;
    public final TextView c;

    public sb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        getThemedColor(i10);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        addView(g9Var, w7.b6.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setSingleLine();
        org.telegram.messenger.m5.m(textView, i10, p6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.uj, p6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
