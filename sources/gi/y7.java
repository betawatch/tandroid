package gi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public y7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
        addView(textView, mf.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q5, e6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, mf.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
