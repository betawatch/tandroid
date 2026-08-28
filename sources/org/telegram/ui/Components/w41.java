package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w41 extends FrameLayout {
    public int a;
    public boolean b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.a;
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (this.b && view != null) {
            i11 = view.getPaddingBottom() + view.getPaddingTop() + i11;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i11, TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i10) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - i11, TLObject.FLAG_30));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        measureChildren(makeMeasureSpec, i10);
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            i12 = Math.max(i12, getChildAt(i13).getMeasuredHeight());
        }
        if (size > 0) {
            i12 = Math.min(i12, size - i11);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }
}
