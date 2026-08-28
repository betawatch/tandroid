package kh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ll;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public y8(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 20.0f);
        addView(textView, g7.e6.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.q5, b6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, g7.e6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
