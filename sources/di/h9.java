package di;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.yh;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h9 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public h9(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        addView(textView, w7.a6.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yh.n(org.telegram.ui.ActionBar.g6.q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.a6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
