package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h61 extends FrameLayout {
    public int a;
    public boolean b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.a;
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (this.b && view != null) {
            i12 = view.getPaddingBottom() + view.getPaddingTop() + i12;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i12, TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i11) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - i12, TLObject.FLAG_30));
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        measureChildren(makeMeasureSpec, i11);
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            i13 = Math.max(i13, getChildAt(i14).getMeasuredHeight());
        }
        if (size > 0) {
            i13 = Math.min(i13, size - i12);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
    }
}
