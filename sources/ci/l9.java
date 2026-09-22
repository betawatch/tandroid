package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.vl;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l9 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public l9(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.Cells.q3.p(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 20.0f);
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        vl.o(org.telegram.ui.ActionBar.i6.q5, e6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
