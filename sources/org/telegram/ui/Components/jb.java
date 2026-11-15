package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class jb extends va {
    public final i9 a;
    public final TextView b;

    public jb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        i9 i9Var = new i9(getContext());
        this.a = i9Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(i9Var, c8.ja.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.yj, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ja.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.cb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
