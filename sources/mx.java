// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mx extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public mx(o oVar, Activity activity, boolean z) {
        super(activity);
        this.d = z;
        setTag(90);
        TextView textView = new TextView(activity);
        this.a = textView;
        td4.v(12.0f, z ? 2131746651 : 2131746652, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        addView(textView, qoe.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        addView(textView2, qoe.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), TLObject.FLAG_30));
    }
}
