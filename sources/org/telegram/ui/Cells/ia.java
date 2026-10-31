package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean a;
    public org.telegram.ui.Components.g9 b;
    public TextView c;
    public TextView d;

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a) {
            canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var = this.b;
        if (g9Var != null) {
            try {
                if (g9Var.getImageReceiver() == null || !(g9Var.getImageReceiver().t() instanceof gg.d)) {
                    return;
                }
                ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.c9, false));
                g9Var.invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
