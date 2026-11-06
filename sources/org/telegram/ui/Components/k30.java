package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k30 extends FrameLayout {
    public View a;
    public TextView b;
    public ch0 c;
    public LinearLayout d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i7) {
        this.b.setGravity(i7);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i7);
    }
}
