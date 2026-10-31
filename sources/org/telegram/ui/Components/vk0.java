package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class vk0 extends w71 {
    public final ku0 V;
    public boolean W;
    public View a0;
    public View b0;

    public vk0(Context context, org.telegram.ui.ActionBar.p6 p6Var, ku0 ku0Var) {
        super(context, p6Var);
        this.V = ku0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.w71
    public final void A(int i10) {
        ku0 ku0Var = this.V;
        ku0Var.g("PAGER_TAB_END");
        ku0Var.p();
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean B(MotionEvent motionEvent) {
        boolean z10 = this.H;
        boolean B = super.B(motionEvent);
        if (z10 && !this.H && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.a0 = view;
                this.b0 = view2;
                ku0 ku0Var = this.V;
                ku0Var.g("PAGER_DRAG_ABORTED");
                ku0Var.p();
            }
        }
        return B;
    }

    @Override // org.telegram.ui.Components.w71
    public final void F(View view, float f7) {
        if (view.getTranslationX() == f7) {
            return;
        }
        super.F(view, f7);
        invalidate();
    }

    public final void L(View view) {
        this.a0 = null;
        this.b0 = null;
        ku0 ku0Var = this.V;
        ku0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (ku0Var.O == null) {
            return;
        }
        if (ku0Var.d0) {
            ku0Var.i("page_bound");
        }
        RecyclerView j10 = ku0Var.O.j(view);
        ku0Var.b(j10);
        ku0Var.O.p(j10);
        ku0Var.p();
    }

    public final void M(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ku0 ku0Var = this.V;
        boolean j10 = ku0Var.j(x10, y3);
        this.W = j10;
        ku0Var.g(j10 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x10 = view.getX();
        ku0 ku0Var = this.V;
        canvas.clipRect(x10, -ku0Var.getTopBleed(), view.getX() + view.getWidth(), ku0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.w71
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean i(MotionEvent motionEvent) {
        return !this.W && this.V.c();
    }

    @Override // org.telegram.ui.Components.w71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ku0 ku0Var = this.V;
        if (motionEvent == null) {
            ku0Var.g("PAGER_CANCEL_NULL");
            this.W = false;
            return B(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            ku0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.W && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.w71
    public final void u() {
        ku0 ku0Var = this.V;
        ku0Var.g("PAGER_SCROLL_END");
        ku0Var.p();
    }

    @Override // org.telegram.ui.Components.w71
    public final void v() {
        this.a0 = null;
        this.b0 = null;
    }

    @Override // org.telegram.ui.Components.w71
    public final void w(boolean z10) {
        this.V.p();
    }
}
