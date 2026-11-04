package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class vj0 extends n61 {
    public final gt0 W;
    public boolean a0;
    public View b0;
    public View c0;

    public vj0(Context context, org.telegram.ui.ActionBar.e6 e6Var, gt0 gt0Var) {
        super(context, e6Var);
        this.W = gt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean A(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean A = super.A(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                gt0 gt0Var = this.W;
                gt0Var.g("PAGER_DRAG_ABORTED");
                gt0Var.l();
            }
        }
        return A;
    }

    @Override // org.telegram.ui.Components.n61
    public final void E(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.E(view, f10);
        invalidate();
    }

    public final void L(View view) {
        this.b0 = null;
        this.c0 = null;
        gt0 gt0Var = this.W;
        gt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (gt0Var.P == null) {
            return;
        }
        if (gt0Var.e0) {
            gt0Var.i("page_bound");
        }
        RecyclerView m10 = gt0Var.P.m(view);
        gt0Var.b(m10);
        gt0Var.P.r(m10);
        gt0Var.l();
    }

    public final void M(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        gt0 gt0Var = this.W;
        boolean j10 = gt0Var.j(x10, y9);
        this.a0 = j10;
        gt0Var.g(j10 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x10 = view.getX();
        gt0 gt0Var = this.W;
        canvas.clipRect(x10, -gt0Var.getTopBleed(), view.getX() + view.getWidth(), gt0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.n61
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.n61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gt0 gt0Var = this.W;
        if (motionEvent == null) {
            gt0Var.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return A(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            gt0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && A(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61
    public final void s() {
        gt0 gt0Var = this.W;
        gt0Var.g("PAGER_SCROLL_END");
        gt0Var.l();
    }

    @Override // org.telegram.ui.Components.n61
    public final void t() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        this.W.l();
    }

    @Override // org.telegram.ui.Components.n61
    public final void z(int i3) {
        gt0 gt0Var = this.W;
        gt0Var.g("PAGER_TAB_END");
        gt0Var.l();
    }
}
