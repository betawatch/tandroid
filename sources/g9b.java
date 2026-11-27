// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class g9b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public g9b(vnb vnbVar, Context context, boolean z) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        addView(textView, tre.t(-1, -2, 55, 27, 16, 27, z ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.q5, vnbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, tre.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
