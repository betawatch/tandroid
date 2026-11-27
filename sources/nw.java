// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nw extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public nw(o oVar, Activity activity, boolean z) {
        super(activity);
        this.d = z;
        setTag(90);
        TextView textView = new TextView(activity);
        this.a = textView;
        qd4.u(12.0f, z ? 2131746645 : 2131746646, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        addView(textView, tre.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        addView(textView2, tre.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), TLObject.FLAG_30));
    }
}
