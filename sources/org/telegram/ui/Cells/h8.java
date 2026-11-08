package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h8 extends LinearLayout {
    public TextView a;
    public boolean b;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
        if (!this.b || (view = (View) getParent()) == null || getMeasuredHeight() >= (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - org.telegram.messenger.g0.L(24.0f))) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z9) {
        this.b = z9;
        requestLayout();
    }
}
