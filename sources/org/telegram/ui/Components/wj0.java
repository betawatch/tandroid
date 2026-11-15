package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class wj0 extends w61 {
    public final it0 W;
    public boolean a0;
    public View b0;
    public View c0;

    public wj0(Context context, org.telegram.ui.ActionBar.e6 e6Var, it0 it0Var) {
        super(context, e6Var);
        this.W = it0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.w61
    public final void D(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.D(view, f10);
        invalidate();
    }

    public final void J(View view) {
        this.b0 = null;
        this.c0 = null;
        it0 it0Var = this.W;
        it0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (it0Var.P == null) {
            return;
        }
        if (it0Var.e0) {
            it0Var.i("page_bound");
        }
        RecyclerView n10 = it0Var.P.n(view);
        it0Var.b(n10);
        it0Var.P.s(n10);
        it0Var.p();
    }

    public final void K(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        it0 it0Var = this.W;
        boolean j3 = it0Var.j(x10, y10);
        this.a0 = j3;
        it0Var.g(j3 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean b(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        it0 it0Var = this.W;
        canvas.clipRect(x10, -it0Var.getTopBleed(), view.getX() + view.getWidth(), it0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.w61
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.w61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        K(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        it0 it0Var = this.W;
        if (motionEvent == null) {
            it0Var.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return z(null);
        }
        K(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            it0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && z(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61
    public final void r() {
        it0 it0Var = this.W;
        it0Var.g("PAGER_SCROLL_END");
        it0Var.p();
    }

    @Override // org.telegram.ui.Components.w61
    public final void s() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        this.W.p();
    }

    @Override // org.telegram.ui.Components.w61
    public final void x(int i7) {
        it0 it0Var = this.W;
        it0Var.g("PAGER_TAB_END");
        it0Var.p();
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean z(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean z11 = super.z(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                it0 it0Var = this.W;
                it0Var.g("PAGER_DRAG_ABORTED");
                it0Var.p();
            }
        }
        return z11;
    }
}
