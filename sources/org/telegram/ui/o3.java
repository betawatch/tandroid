package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o3 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public o3(h4 h4Var, Context context, boolean z10) {
        super(context);
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(org.telegram.messenger.cd.L0(z10 ? 2131746931 : 2131746932, null));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        addView(textView, w7.b6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        addView(textView2, w7.b6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
    }
}
