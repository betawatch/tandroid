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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class er0 extends qt0 {
    public float u3;
    public float v3;
    public final /* synthetic */ br0 w3;
    public final /* synthetic */ cr0 x3;
    public final /* synthetic */ au0 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(au0 au0Var, Context context, br0 br0Var, cr0 cr0Var) {
        super(context);
        this.y3 = au0Var;
        this.w3 = br0Var;
        this.x3 = cr0Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean A1() {
        return this.y3.q1;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean B1() {
        return au0.y0(this.y3.r1);
    }

    @Override // org.telegram.ui.Components.qt0
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

    @Override // org.telegram.ui.Components.uk0
    public final Integer V0(int i10) {
        s4.g0 adapter = getAdapter();
        ks0 ks0Var = this.y3.S;
        if (adapter == ks0Var && ks0Var.e > 0 && i10 == ks0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override // org.telegram.ui.Components.qt0, org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.g0 adapter = getAdapter();
        au0 au0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        is0 is0Var = au0Var.e0;
        uq0 uq0Var = au0Var.g0;
        br0 br0Var = this.w3;
        if ((adapter == uq0Var || getAdapter() == is0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (au0Var.q1) {
                if (au0Var.r1 == (getAdapter() == is0Var ? 8 : 9) && br0Var.n.getChildCount() > 0 && (childAt2 = br0Var.n.getChildAt(0)) != null) {
                    br0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.i0.W1(au0Var.p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != is0Var && getMeasuredWidth() > org.telegram.messenger.i0.L(60.0f)) {
                if (this.n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                    this.n3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f);
                StaticLayout staticLayout = this.o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.o3 = new StaticLayout(org.telegram.messenger.dd.L0(au0Var.z0() ? k2Var != null && org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(-au0Var.l1))) ? 2131746648 : 2131746644 : 2131746643, null), this.n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (br0Var.J) {
            float f7 = br0Var.K + 0.010666667f;
            br0Var.K = f7;
            if (f7 >= 1.0f) {
                br0Var.K = 0.0f;
                br0Var.J = false;
                br0Var.I = 0;
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
        if (au0Var.q1) {
            return;
        }
        au0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        au0 au0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        if (k2Var == null || !k2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.u3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            au0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.v3 - this.u3;
            au0Var.x1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.v3 = this.u3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qt0
    public final int getAnimateToColumnsCount() {
        return this.y3.s1;
    }

    @Override // org.telegram.ui.Components.qt0
    public final float getChangeColumnsProgress() {
        return this.y3.p1;
    }

    @Override // org.telegram.ui.Components.qt0
    public final int getColumnsCount() {
        au0 au0Var = this.y3;
        return au0.y0(au0Var.r1) ? au0Var.o1[1] : au0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.qt0
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override // org.telegram.ui.Components.qt0
    public final bk0 getMovingAdapter() {
        au0 au0Var = this.y3;
        return au0.y0(au0Var.r1) ? au0Var.v1(au0Var.r1) : au0Var.J;
    }

    @Override // org.telegram.ui.Components.qt0
    public final bk0 getSupportingAdapter() {
        au0 au0Var = this.y3;
        return au0.y0(au0Var.r1) ? au0Var.w1(au0Var.r1) : au0Var.K;
    }

    @Override // org.telegram.ui.Components.qt0
    public final ss0 getSupportingListView() {
        return this.w3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10 = this.I1;
        au0 au0Var = this.y3;
        if (z10 && au0Var.getSelectedTab() == 11 && (k2Var = au0Var.x1) != null) {
            org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
        }
        au0Var.R();
        s4.g0 adapter = getAdapter();
        ht0 ht0Var = au0Var.P;
        if (adapter == ht0Var) {
            ArrayList arrayList = ht0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.wp.r1(ht0Var.d).l(arrayList, ht0Var.s.l1);
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        br0 br0Var = this.w3;
        this.y3.N(br0Var, br0Var.h, this.x3);
        if (br0Var.E == 0) {
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

    @Override // org.telegram.ui.Components.qt0
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        int messageId = s7Var.getMessageId();
        br0 br0Var = this.w3;
        if (messageId != br0Var.I || !s7Var.c.I()) {
            s7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!br0Var.J) {
            br0Var.K = 0.0f;
            br0Var.J = true;
        }
        float f7 = br0Var.K;
        s7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
