package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public x7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
        addView(textView, c8.ja.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q5, e6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.ja.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
