// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class j7b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public j7b(ylb ylbVar, Context context, boolean z) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        addView(textView, qoe.t(-1, -2, 55, 27, 16, 27, z ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.p5, ylbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, qoe.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
