package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b21 extends uj0 {
    public final /* synthetic */ p21 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b21(p21 p21Var, Context context) {
        super(context, null);
        this.f3 = p21Var;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            p21 p21Var = this.f3;
            if (y10 < p21Var.L0(true) - getTop()) {
                p21Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
    }
}
