package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean a;
    public org.telegram.ui.Components.i9 b;
    public TextView c;
    public TextView d;

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.c9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.i9 i9Var = this.b;
        if (i9Var != null) {
            try {
                if (i9Var.getImageReceiver() == null || !(i9Var.getImageReceiver().t() instanceof qg.b)) {
                    return;
                }
                ((qg.b) i9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.c9, false));
                i9Var.invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
