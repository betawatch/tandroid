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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cq0 extends ms0 {
    public float v3;
    public float w3;
    public final /* synthetic */ zp0 x3;
    public final /* synthetic */ aq0 y3;
    public final /* synthetic */ ws0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(ws0 ws0Var, Context context, zp0 zp0Var, aq0 aq0Var) {
        super(context);
        this.z3 = ws0Var;
        this.x3 = zp0Var;
        this.y3 = aq0Var;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean B1() {
        return ws0.z0(this.z3.s1);
    }

    @Override // org.telegram.ui.Components.ms0
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

    @Override // org.telegram.ui.Components.tj0
    public final Integer V0(int i3) {
        u4.h0 adapter = getAdapter();
        ir0 ir0Var = this.z3.T;
        if (adapter == ir0Var && ir0Var.e > 0 && i3 == ir0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i3);
    }

    @Override // org.telegram.ui.Components.ms0, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        u4.h0 adapter = getAdapter();
        ws0 ws0Var = this.z3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        gr0 gr0Var = ws0Var.f0;
        rp0 rp0Var = ws0Var.h0;
        zp0 zp0Var = this.x3;
        if ((adapter == rp0Var || getAdapter() == gr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (ws0Var.r1) {
                if (ws0Var.s1 == (getAdapter() == gr0Var ? 8 : 9) && zp0Var.n.getChildCount() > 0 && (childAt2 = zp0Var.n.getChildAt(0)) != null) {
                    zp0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(ws0Var.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != gr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.o3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(org.telegram.messenger.bd.M0(ws0Var.A0() ? d2Var != null && org.telegram.messenger.t3.V(d2Var.getMessagesController().M0(Long.valueOf(-ws0Var.m1))) ? 2131746641 : 2131746637 : 2131746636, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i3 = 0; i3 < this.p3.getLineCount(); i3++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i3));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i3));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.q3) / 2.0f) - this.r3, top - ((this.p3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (zp0Var.K) {
            float f10 = zp0Var.L + 0.010666667f;
            zp0Var.L = f10;
            if (f10 >= 1.0f) {
                zp0Var.L = 0.0f;
                zp0Var.K = false;
                zp0Var.J = 0;
            }
            invalidate();
        }
        if (this.s3 == null) {
            int currentAccount = d2Var.getCurrentAccount();
            ei.z9[] z9VarArr = ei.z9.f;
            if (z9VarArr[currentAccount] == null) {
                z9VarArr[currentAccount] = new ei.z9(currentAccount);
            }
            this.s3 = z9VarArr[currentAccount];
        }
        this.s3.a(this);
        if (ws0Var.r1) {
            return;
        }
        ws0Var.s1 = -1;
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ws0 ws0Var = this.z3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        if (d2Var == null || !d2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            ws0Var.y1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.w3 - this.v3;
            ws0Var.y1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ms0
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // org.telegram.ui.Components.ms0
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // org.telegram.ui.Components.ms0
    public final int getColumnsCount() {
        ws0 ws0Var = this.z3;
        return ws0.z0(ws0Var.s1) ? ws0Var.p1[1] : ws0Var.p1[0];
    }

    @Override // org.telegram.ui.Components.ms0
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // org.telegram.ui.Components.ms0
    public final zi0 getMovingAdapter() {
        ws0 ws0Var = this.z3;
        return ws0.z0(ws0Var.s1) ? ws0Var.x1(ws0Var.s1) : ws0Var.K;
    }

    @Override // org.telegram.ui.Components.ms0
    public final zi0 getSupportingAdapter() {
        ws0 ws0Var = this.z3;
        return ws0.z0(ws0Var.s1) ? ws0Var.y1(ws0Var.s1) : ws0Var.L;
    }

    @Override // org.telegram.ui.Components.ms0
    public final qr0 getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z10 = this.J1;
        ws0 ws0Var = this.z3;
        if (z10 && ws0Var.getSelectedTab() == 11 && (d2Var = ws0Var.y1) != null) {
            org.telegram.messenger.g0.v1(d2Var.getParentActivity().getCurrentFocus());
        }
        ws0Var.S();
        u4.h0 adapter = getAdapter();
        fs0 fs0Var = ws0Var.Q;
        if (adapter == fs0Var) {
            ArrayList arrayList = fs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.hp.s1(fs0Var.d).l(arrayList, fs0Var.s.m1);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        zp0 zp0Var = this.x3;
        this.z3.O(zp0Var, zp0Var.h, this.y3);
        if (zp0Var.F == 0) {
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        try {
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (i3 == 4096) {
            View D1 = D1();
            if (D1 != null && D1.canScrollVertically(1) && D1.performAccessibilityAction(i3, bundle)) {
            }
            return super.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 8192) {
            if (!canScrollVertically(-1)) {
                View D12 = D1();
                if (D12 != null) {
                    if (D12.canScrollVertically(-1)) {
                    }
                }
            }
        }
        return super.performAccessibilityAction(i3, bundle);
        return true;
    }

    @Override // org.telegram.ui.Components.ms0
    public final void z1(org.telegram.ui.Cells.n7 n7Var) {
        int messageId = n7Var.getMessageId();
        zp0 zp0Var = this.x3;
        if (messageId != zp0Var.J || !n7Var.c.I()) {
            n7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!zp0Var.K) {
            zp0Var.L = 0.0f;
            zp0Var.K = true;
        }
        float f10 = zp0Var.L;
        n7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }
}
