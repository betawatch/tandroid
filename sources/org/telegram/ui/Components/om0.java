package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class om0 extends u91 {
    public final lw0 V;
    public boolean W;
    public View a0;
    public View b0;

    public om0(Context context, org.telegram.ui.ActionBar.u6 u6Var, lw0 lw0Var) {
        super(context, u6Var);
        this.V = lw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.u91
    public final void A(int i10) {
        lw0 lw0Var = this.V;
        lw0Var.g("PAGER_TAB_END");
        lw0Var.l();
    }

    @Override // org.telegram.ui.Components.u91
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
                lw0 lw0Var = this.V;
                lw0Var.g("PAGER_DRAG_ABORTED");
                lw0Var.l();
            }
        }
        return B;
    }

    @Override // org.telegram.ui.Components.u91
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
        lw0 lw0Var = this.V;
        lw0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (lw0Var.O == null) {
            return;
        }
        if (lw0Var.d0) {
            lw0Var.i("page_bound");
        }
        RecyclerView i10 = lw0Var.O.i(view);
        lw0Var.b(i10);
        lw0Var.O.n(i10);
        lw0Var.l();
    }

    public final void M(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        lw0 lw0Var = this.V;
        boolean j10 = lw0Var.j(x9, y3);
        this.W = j10;
        lw0Var.g(j10 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x9 = view.getX();
        lw0 lw0Var = this.V;
        canvas.clipRect(x9, -lw0Var.getTopBleed(), view.getX() + view.getWidth(), lw0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.u91
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.u91
    public final boolean i(MotionEvent motionEvent) {
        return !this.W && this.V.c();
    }

    @Override // org.telegram.ui.Components.u91, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.u91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lw0 lw0Var = this.V;
        if (motionEvent == null) {
            lw0Var.g("PAGER_CANCEL_NULL");
            this.W = false;
            return B(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            lw0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.W && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.u91
    public final void u() {
        lw0 lw0Var = this.V;
        lw0Var.g("PAGER_SCROLL_END");
        lw0Var.l();
    }

    @Override // org.telegram.ui.Components.u91
    public final void v() {
        this.a0 = null;
        this.b0 = null;
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        this.V.l();
    }
}
