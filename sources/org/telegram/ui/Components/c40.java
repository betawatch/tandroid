package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c40 extends FrameLayout {
    public View a;
    public TextView b;
    public ei0 c;
    public LinearLayout d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i10) {
        this.b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }
}
