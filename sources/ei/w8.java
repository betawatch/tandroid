package ei;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.kk;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class w8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public w8(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 20.0f);
        addView(textView, w7.z5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        kk.o(org.telegram.ui.ActionBar.h6.q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
