package fi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public z7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, f6Var, 1, 20.0f);
        addView(textView, c8.ha.t(-1, -2, 55, 27, 16, 27, z9 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q5, f6Var);
        textView2.setTextSize(1, 14.0f);
        if (z9) {
            addView(textView2, c8.ha.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
