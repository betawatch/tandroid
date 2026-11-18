package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class ek0 extends g71 {
    public final qt0 W;
    public boolean a0;
    public View b0;
    public View c0;

    public ek0(Context context, org.telegram.ui.ActionBar.i6 i6Var, qt0 qt0Var) {
        super(context, i6Var);
        this.W = qt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.g71
    public final void B(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.B(view, f10);
        invalidate();
    }

    public final void H(View view) {
        this.b0 = null;
        this.c0 = null;
        qt0 qt0Var = this.W;
        qt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (qt0Var.P == null) {
            return;
        }
        if (qt0Var.e0) {
            qt0Var.i("page_bound");
        }
        RecyclerView n10 = qt0Var.P.n(view);
        qt0Var.b(n10);
        qt0Var.P.r(n10);
        qt0Var.p();
    }

    public final void I(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        qt0 qt0Var = this.W;
        boolean j3 = qt0Var.j(x10, y10);
        this.a0 = j3;
        qt0Var.g(j3 ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean b(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        qt0 qt0Var = this.W;
        canvas.clipRect(x10, -qt0Var.getTopBleed(), view.getX() + view.getWidth(), qt0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.g71
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // org.telegram.ui.Components.g71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        I(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.g71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qt0 qt0Var = this.W;
        if (motionEvent == null) {
            qt0Var.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return x(null);
        }
        I(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            qt0Var.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && x(motionEvent);
    }

    @Override // org.telegram.ui.Components.g71
    public final void q() {
        qt0 qt0Var = this.W;
        qt0Var.g("PAGER_SCROLL_END");
        qt0Var.p();
    }

    @Override // org.telegram.ui.Components.g71
    public final void r() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // org.telegram.ui.Components.g71
    public final void s(boolean z10) {
        this.W.p();
    }

    @Override // org.telegram.ui.Components.g71
    public final void w(int i7) {
        qt0 qt0Var = this.W;
        qt0Var.g("PAGER_TAB_END");
        qt0Var.p();
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean x(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean x10 = super.x(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                qt0 qt0Var = this.W;
                qt0Var.g("PAGER_DRAG_ABORTED");
                qt0Var.p();
            }
        }
        return x10;
    }
}
