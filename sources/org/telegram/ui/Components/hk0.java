package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hk0 extends FrameLayout {
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
