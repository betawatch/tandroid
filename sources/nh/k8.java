package nh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public k8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        addView(textView, i7.f6.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, i7.f6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
