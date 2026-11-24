// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class i5b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public i5b(wjb wjbVar, Context context, boolean z) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        addView(textView, nme.t(-1, -2, 55, 27, 16, 27, z ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.p5, wjbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, nme.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
