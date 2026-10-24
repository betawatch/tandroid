package ei;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class w8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public w8(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, g6Var, 1, 20.0f);
        addView(textView, w7.z5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q5, g6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, w7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
