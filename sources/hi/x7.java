package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class x7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public x7(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
        addView(textView, c8.ma.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q5, i6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.ma.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
