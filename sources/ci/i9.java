package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ok;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class i9 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public i9(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 20.0f);
        addView(textView, w7.y5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        ok.n(org.telegram.ui.ActionBar.h6.q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.y5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
