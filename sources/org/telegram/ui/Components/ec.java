package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class ec extends pb {
    public final z9 a;
    public final TextView b;

    public ec(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        z9 z9Var = new z9(getContext());
        this.a = z9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(z9Var, w7.a6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.a6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.wb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
