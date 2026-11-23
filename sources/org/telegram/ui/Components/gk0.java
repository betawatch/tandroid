package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class gk0 extends k71 {
    public final st0 W;
    public boolean a0;
    public View b0;
    public View c0;

    public gk0(Context context, org.telegram.ui.ActionBar.i6 i6Var, st0 st0Var) {
        super(context, i6Var);
        this.W = st0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.k71
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
        st0 st0Var = this.W;
        st0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (st0Var.P == null) {
            return;
        }
        if (st0Var.e0) {
            st0Var.i("page_bound");
        }
        RecyclerView l10 = st0Var.P.l(view);
        st0Var.b(l10);
        st0Var.P.r(l10);
        st0Var.p();
    }

    public final void K(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        st0 st0Var = this.W;
        boolean j3 = st0Var.j(x10, y10);
        this.a0 = j3;
        st0Var.g(j3 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // org.telegram.ui.Components.k71
    public final boolean b(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        st0 st0Var = this.W;
        canvas.clipRect(x10, -st0Var.getTopBleed(), view.getX() + view.getWidth(), st0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.k71
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.k71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        K(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.k71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        st0 st0Var = this.W;
        if (motionEvent == null) {
            st0Var.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return y(null);
        }
        K(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            st0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && y(motionEvent);
    }

    @Override // org.telegram.ui.Components.k71
    public final void r() {
        st0 st0Var = this.W;
        st0Var.g("PAGER_SCROLL_END");
        st0Var.p();
    }

    @Override // org.telegram.ui.Components.k71
    public final void s() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        this.W.p();
    }

    @Override // org.telegram.ui.Components.k71
    public final void x(int i7) {
        st0 st0Var = this.W;
        st0Var.g("PAGER_TAB_END");
        st0Var.p();
    }

    @Override // org.telegram.ui.Components.k71
    public final boolean y(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean y10 = super.y(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                st0 st0Var = this.W;
                st0Var.g("PAGER_DRAG_ABORTED");
                st0Var.p();
            }
        }
        return y10;
    }
}
