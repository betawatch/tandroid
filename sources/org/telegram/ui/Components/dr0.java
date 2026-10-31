package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dr0 extends pt0 {
    public float u3;
    public float v3;
    public final /* synthetic */ ar0 w3;
    public final /* synthetic */ br0 x3;
    public final /* synthetic */ zt0 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(zt0 zt0Var, Context context, ar0 ar0Var, br0 br0Var) {
        super(context);
        this.y3 = zt0Var;
        this.w3 = ar0Var;
        this.x3 = br0Var;
    }

    @Override // org.telegram.ui.Components.pt0
    public final boolean A1() {
        return this.y3.q1;
    }

    @Override // org.telegram.ui.Components.pt0
    public final boolean B1() {
        return zt0.x0(this.y3.r1);
    }

    @Override // org.telegram.ui.Components.pt0
    public final boolean C1() {
        return this == this.w3.h;
    }

    public final View D1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final Integer V0(int i10) {
        s4.g0 adapter = getAdapter();
        js0 js0Var = this.y3.S;
        if (adapter == js0Var && js0Var.e > 0 && i10 == js0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override // org.telegram.ui.Components.pt0, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.g0 adapter = getAdapter();
        zt0 zt0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        hs0 hs0Var = zt0Var.e0;
        tq0 tq0Var = zt0Var.g0;
        ar0 ar0Var = this.w3;
        if ((adapter == tq0Var || getAdapter() == hs0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zt0Var.q1) {
                if (zt0Var.r1 == (getAdapter() == hs0Var ? 8 : 9) && ar0Var.n.getChildCount() > 0 && (childAt2 = ar0Var.n.getChildAt(0)) != null) {
                    ar0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.i0.W1(zt0Var.p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != hs0Var && getMeasuredWidth() > org.telegram.messenger.i0.L(60.0f)) {
                if (this.n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                    this.n3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f);
                StaticLayout staticLayout = this.o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.o3 = new StaticLayout(org.telegram.messenger.cd.L0(zt0Var.y0() ? k2Var != null && org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(-zt0Var.l1))) ? 2131746648 : 2131746644 : 2131746643, null), this.n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.p3 = 0.0f;
                    this.q3 = measuredWidth;
                    for (int i10 = 0; i10 < this.o3.getLineCount(); i10++) {
                        this.p3 = Math.max(this.p3, this.o3.getLineWidth(i10));
                        this.q3 = Math.min(this.q3, this.o3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.p3) / 2.0f) - this.q3, top - ((this.o3.getHeight() + org.telegram.messenger.i0.L(64.0f)) / 2.0f));
                this.o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ar0Var.J) {
            float f7 = ar0Var.K + 0.010666667f;
            ar0Var.K = f7;
            if (f7 >= 1.0f) {
                ar0Var.K = 0.0f;
                ar0Var.J = false;
                ar0Var.I = 0;
            }
            invalidate();
        }
        if (this.r3 == null) {
            int currentAccount = k2Var.getCurrentAccount();
            th.w7[] w7VarArr = th.w7.f;
            if (w7VarArr[currentAccount] == null) {
                w7VarArr[currentAccount] = new th.w7(currentAccount);
            }
            this.r3 = w7VarArr[currentAccount];
        }
        this.r3.a(this);
        if (zt0Var.q1) {
            return;
        }
        zt0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zt0 zt0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        if (k2Var == null || !k2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.u3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            zt0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.v3 - this.u3;
            zt0Var.x1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.v3 = this.u3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pt0
    public final int getAnimateToColumnsCount() {
        return this.y3.s1;
    }

    @Override // org.telegram.ui.Components.pt0
    public final float getChangeColumnsProgress() {
        return this.y3.p1;
    }

    @Override // org.telegram.ui.Components.pt0
    public final int getColumnsCount() {
        zt0 zt0Var = this.y3;
        return zt0.x0(zt0Var.r1) ? zt0Var.o1[1] : zt0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.pt0
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override // org.telegram.ui.Components.pt0
    public final ak0 getMovingAdapter() {
        zt0 zt0Var = this.y3;
        return zt0.x0(zt0Var.r1) ? zt0Var.u1(zt0Var.r1) : zt0Var.J;
    }

    @Override // org.telegram.ui.Components.pt0
    public final ak0 getSupportingAdapter() {
        zt0 zt0Var = this.y3;
        return zt0.x0(zt0Var.r1) ? zt0Var.v1(zt0Var.r1) : zt0Var.K;
    }

    @Override // org.telegram.ui.Components.pt0
    public final rs0 getSupportingListView() {
        return this.w3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10 = this.I1;
        zt0 zt0Var = this.y3;
        if (z10 && zt0Var.getSelectedTab() == 11 && (k2Var = zt0Var.x1) != null) {
            org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
        }
        zt0Var.Q();
        s4.g0 adapter = getAdapter();
        gt0 gt0Var = zt0Var.P;
        if (adapter == gt0Var) {
            ArrayList arrayList = gt0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.vp.r1(gt0Var.d).l(arrayList, gt0Var.s.l1);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ar0 ar0Var = this.w3;
        this.y3.N(ar0Var, ar0Var.h, this.x3);
        if (ar0Var.E == 0) {
            PhotoViewer.v1().z0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r2.performAccessibilityAction(r4, r5) != false) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        try {
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (i10 == 4096) {
            View D1 = D1();
            if (D1 != null && D1.canScrollVertically(1) && D1.performAccessibilityAction(i10, bundle)) {
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 8192) {
            if (!canScrollVertically(-1)) {
                View D12 = D1();
                if (D12 != null) {
                    if (D12.canScrollVertically(-1)) {
                    }
                }
            }
        }
        return super.performAccessibilityAction(i10, bundle);
        return true;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        int messageId = s7Var.getMessageId();
        ar0 ar0Var = this.w3;
        if (messageId != ar0Var.I || !s7Var.c.I()) {
            s7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ar0Var.J) {
            ar0Var.K = 0.0f;
            ar0Var.J = true;
        }
        float f7 = ar0Var.K;
        s7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
