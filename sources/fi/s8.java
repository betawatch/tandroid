package fi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s8 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public s8(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.j5, u6Var, 1, 20.0f);
        addView(textView, kb1.x(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, u6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, kb1.x(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
