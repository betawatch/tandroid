package di;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.vl;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class k9 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public k9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        vl.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        vl.n(org.telegram.ui.ActionBar.j6.q5, f6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
