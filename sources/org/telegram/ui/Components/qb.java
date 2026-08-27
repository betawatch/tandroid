package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class qb extends cb {
    public final n9 a;
    public final TextView b;

    public qb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        n9 n9Var = new n9(getContext());
        this.a = n9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(n9Var, h7.z5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, h7.z5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.jb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
