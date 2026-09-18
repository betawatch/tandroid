package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.wl;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class l9 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public l9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        wl.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.q5, f6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
