package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l8 extends LinearLayout {
    public TextView a;
    public boolean b;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
        if (!this.b || (view = (View) getParent()) == null || getMeasuredHeight() >= (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - AndroidUtilities.dp(24.0f))) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z10) {
        this.b = z10;
        requestLayout();
    }
}
