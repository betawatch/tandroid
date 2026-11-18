package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class sb extends eb {
    public final q9 a;
    public final TextView b;

    public sb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        q9 q9Var = new q9(getContext());
        this.a = q9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(q9Var, c8.ma.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.yj, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ma.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
