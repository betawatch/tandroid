package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uj0 extends FrameLayout {
    public View a;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = this.a;
        if (view == null) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    view = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        view = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        }
        int max = view != null ? Math.max(0, (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom()) : 0;
        if (max > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setViewportView(View view) {
        if (this.a == view) {
            return;
        }
        this.a = view;
        requestLayout();
    }
}
