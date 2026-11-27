// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
