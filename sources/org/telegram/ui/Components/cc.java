package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class cc extends eb {
    public final o9 a;
    public final TextView b;
    public final TextView c;

    public cc(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Hi);
        o9 o9Var = new o9(context);
        this.a = o9Var;
        addView(o9Var, g7.e6.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setSingleLine();
        textView.setTextColor(themedColor);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setMaxLines(2);
        textView2.setTextColor(themedColor);
        textView2.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Gi));
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
