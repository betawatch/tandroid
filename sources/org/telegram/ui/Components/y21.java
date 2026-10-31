package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y21 extends tk0 {
    public final /* synthetic */ m31 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y21(m31 m31Var, Context context) {
        super(context, null);
        this.e3 = m31Var;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            m31 m31Var = this.e3;
            if (y3 < m31Var.L0(true) - getTop()) {
                m31Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
    }
}
