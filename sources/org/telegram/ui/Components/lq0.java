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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lq0 extends ws0 {
    public float v3;
    public float w3;
    public final /* synthetic */ iq0 x3;
    public final /* synthetic */ jq0 y3;
    public final /* synthetic */ gt0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, iq0 iq0Var, jq0 jq0Var) {
        super(context, i6Var);
        this.z3 = gt0Var;
        this.x3 = iq0Var;
        this.y3 = jq0Var;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean B1() {
        return gt0.z0(this.z3.s1);
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean C1() {
        return this == this.x3.h;
    }

    public final View D1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.ck0
    public final Integer V0(int i7) {
        v4.i0 adapter = getAdapter();
        sr0 sr0Var = this.z3.T;
        if (adapter == sr0Var && sr0Var.e > 0 && i7 == sr0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override // org.telegram.ui.Components.ws0, org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        v4.i0 adapter = getAdapter();
        gt0 gt0Var = this.z3;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        qr0 qr0Var = gt0Var.f0;
        cq0 cq0Var = gt0Var.h0;
        iq0 iq0Var = this.x3;
        if ((adapter == cq0Var || getAdapter() == qr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (gt0Var.r1) {
                if (gt0Var.s1 == (getAdapter() == qr0Var ? 8 : 9) && iq0Var.n.getChildCount() > 0 && (childAt2 = iq0Var.n.getChildAt(0)) != null) {
                    iq0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(gt0Var.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != qr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.o3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(org.telegram.messenger.gd.M0(gt0Var.A0() ? h2Var != null && org.telegram.messenger.v3.V(h2Var.getMessagesController().O0(Long.valueOf(-gt0Var.m1))) ? 2131746438 : 2131746434 : 2131746433, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i7 = 0; i7 < this.p3.getLineCount(); i7++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i7));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i7));
                    }
                }
                canvas.save();
                org.telegram.messenger.n10.k(this.p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (iq0Var.K) {
            float f10 = iq0Var.L + 0.010666667f;
            iq0Var.L = f10;
            if (f10 >= 1.0f) {
                iq0Var.L = 0.0f;
                iq0Var.K = false;
                iq0Var.J = 0;
            }
            invalidate();
        }
        if (this.s3 == null) {
            int currentAccount = h2Var.getCurrentAccount();
            fi.n9[] n9VarArr = fi.n9.f;
            if (n9VarArr[currentAccount] == null) {
                n9VarArr[currentAccount] = new fi.n9(currentAccount);
            }
            this.s3 = n9VarArr[currentAccount];
        }
        this.s3.a(this);
        if (gt0Var.r1) {
            return;
        }
        gt0Var.s1 = -1;
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gt0 gt0Var = this.z3;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        if (h2Var == null || !h2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            gt0Var.y1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.w3 - this.v3;
            gt0Var.y1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getColumnsCount() {
        gt0 gt0Var = this.z3;
        return gt0.z0(gt0Var.s1) ? gt0Var.p1[1] : gt0Var.p1[0];
    }

    @Override // org.telegram.ui.Components.ws0
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final ij0 getMovingAdapter() {
        gt0 gt0Var = this.z3;
        return gt0.z0(gt0Var.s1) ? gt0Var.z1(gt0Var.s1) : gt0Var.K;
    }

    @Override // org.telegram.ui.Components.ws0
    public final ij0 getSupportingAdapter() {
        gt0 gt0Var = this.z3;
        return gt0.z0(gt0Var.s1) ? gt0Var.A1(gt0Var.s1) : gt0Var.L;
    }

    @Override // org.telegram.ui.Components.ws0
    public final as0 getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z10 = this.J1;
        gt0 gt0Var = this.z3;
        if (z10 && gt0Var.getSelectedTab() == 11 && (h2Var = gt0Var.y1) != null) {
            org.telegram.messenger.g0.v1(h2Var.getParentActivity().getCurrentFocus());
        }
        gt0Var.S();
        v4.i0 adapter = getAdapter();
        ps0 ps0Var = gt0Var.Q;
        if (adapter == ps0Var) {
            ArrayList arrayList = ps0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    arrayList.add(((org.telegram.ui.Cells.r1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.mp.u1(ps0Var.d).l(arrayList, ps0Var.s.m1);
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        iq0 iq0Var = this.x3;
        this.z3.O(iq0Var, iq0Var.h, this.y3);
        if (iq0Var.F == 0) {
            PhotoViewer.p1().r0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r2.performAccessibilityAction(r4, r5) != false) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        try {
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (i7 == 4096) {
            View D1 = D1();
            if (D1 != null && D1.canScrollVertically(1) && D1.performAccessibilityAction(i7, bundle)) {
            }
            return super.performAccessibilityAction(i7, bundle);
        }
        if (i7 == 8192) {
            if (!canScrollVertically(-1)) {
                View D12 = D1();
                if (D12 != null) {
                    if (D12.canScrollVertically(-1)) {
                    }
                }
            }
        }
        return super.performAccessibilityAction(i7, bundle);
        return true;
    }

    @Override // org.telegram.ui.Components.ws0
    public final void z1(org.telegram.ui.Cells.p7 p7Var) {
        int messageId = p7Var.getMessageId();
        iq0 iq0Var = this.x3;
        if (messageId != iq0Var.J || !p7Var.c.I()) {
            p7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!iq0Var.K) {
            iq0Var.L = 0.0f;
            iq0Var.K = true;
        }
        float f10 = iq0Var.L;
        p7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }
}
