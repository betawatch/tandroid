package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class w7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public w7(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
        addView(textView, c8.ma.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q5, h6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.ma.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
