package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class n3 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public n3(g4 g4Var, Context context, boolean z9) {
        super(context);
        this.d = z9;
        setTag(90);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(org.telegram.messenger.hd.M0(z9 ? 2131746915 : 2131746916, null));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView, c8.ha.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView2, c8.ha.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }
}
