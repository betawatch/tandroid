package lh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.rl;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class v8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public v8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        rl.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        addView(textView, h7.z5.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, h7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
