package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class cc extends nb {
    public final y9 a;
    public final TextView b;

    public cc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        y9 y9Var = new y9(getContext());
        this.a = y9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(y9Var, kb1.m(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Hi, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, kb1.m(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
