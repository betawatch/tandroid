package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class an0 extends LinearLayout {
    public final jt0 a;
    public final TextView b;
    public final TextView c;

    public an0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setLayoutParams(new v4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = L / 2;
        setPadding(L, i7, L, i7);
        jt0 jt0Var = new jt0(context);
        this.a = jt0Var;
        addView(jt0Var, c8.ha.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.t6.V(textView2, org.telegram.ui.ActionBar.t6.g(i10, org.telegram.messenger.qs.n1), h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
