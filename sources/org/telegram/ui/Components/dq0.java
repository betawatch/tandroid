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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dq0 extends os0 {
    public float v3;
    public float w3;
    public final /* synthetic */ aq0 x3;
    public final /* synthetic */ bq0 y3;
    public final /* synthetic */ ys0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, aq0 aq0Var, bq0 bq0Var) {
        super(context, e6Var);
        this.z3 = ys0Var;
        this.x3 = aq0Var;
        this.y3 = bq0Var;
    }

    @Override // org.telegram.ui.Components.os0
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override // org.telegram.ui.Components.os0
    public final boolean B1() {
        return ys0.z0(this.z3.s1);
    }

    @Override // org.telegram.ui.Components.os0
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

    @Override // org.telegram.ui.Components.uj0
    public final Integer V0(int i7) {
        v4.h0 adapter = getAdapter();
        kr0 kr0Var = this.z3.T;
        if (adapter == kr0Var && kr0Var.e > 0 && i7 == kr0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override // org.telegram.ui.Components.os0, org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        v4.h0 adapter = getAdapter();
        ys0 ys0Var = this.z3;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        ir0 ir0Var = ys0Var.f0;
        up0 up0Var = ys0Var.h0;
        aq0 aq0Var = this.x3;
        if ((adapter == up0Var || getAdapter() == ir0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (ys0Var.r1) {
                if (ys0Var.s1 == (getAdapter() == ir0Var ? 8 : 9) && aq0Var.n.getChildCount() > 0 && (childAt2 = aq0Var.n.getChildAt(0)) != null) {
                    aq0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(ys0Var.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ir0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.o3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(org.telegram.messenger.hd.M0(ys0Var.A0() ? e2Var != null && org.telegram.messenger.t3.V(e2Var.getMessagesController().M0(Long.valueOf(-ys0Var.m1))) ? 2131746633 : 2131746629 : 2131746628, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i7 = 0; i7 < this.p3.getLineCount(); i7++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i7));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i7));
                    }
                }
                canvas.save();
                org.telegram.messenger.i20.j(this.p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (aq0Var.K) {
            float f10 = aq0Var.L + 0.010666667f;
            aq0Var.L = f10;
            if (f10 >= 1.0f) {
                aq0Var.L = 0.0f;
                aq0Var.K = false;
                aq0Var.J = 0;
            }
            invalidate();
        }
        if (this.s3 == null) {
            int currentAccount = e2Var.getCurrentAccount();
            fi.q9[] q9VarArr = fi.q9.f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new fi.q9(currentAccount);
            }
            this.s3 = q9VarArr[currentAccount];
        }
        this.s3.a(this);
        if (ys0Var.r1) {
            return;
        }
        ys0Var.s1 = -1;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ys0 ys0Var = this.z3;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        if (e2Var == null || !e2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            ys0Var.y1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.w3 - this.v3;
            ys0Var.y1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.os0
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // org.telegram.ui.Components.os0
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // org.telegram.ui.Components.os0
    public final int getColumnsCount() {
        ys0 ys0Var = this.z3;
        return ys0.z0(ys0Var.s1) ? ys0Var.p1[1] : ys0Var.p1[0];
    }

    @Override // org.telegram.ui.Components.os0
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // org.telegram.ui.Components.os0
    public final aj0 getMovingAdapter() {
        ys0 ys0Var = this.z3;
        return ys0.z0(ys0Var.s1) ? ys0Var.z1(ys0Var.s1) : ys0Var.K;
    }

    @Override // org.telegram.ui.Components.os0
    public final aj0 getSupportingAdapter() {
        ys0 ys0Var = this.z3;
        return ys0.z0(ys0Var.s1) ? ys0Var.A1(ys0Var.s1) : ys0Var.L;
    }

    @Override // org.telegram.ui.Components.os0
    public final sr0 getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z10 = this.J1;
        ys0 ys0Var = this.z3;
        if (z10 && ys0Var.getSelectedTab() == 11 && (e2Var = ys0Var.y1) != null) {
            org.telegram.messenger.g0.v1(e2Var.getParentActivity().getCurrentFocus());
        }
        ys0Var.S();
        v4.h0 adapter = getAdapter();
        hs0 hs0Var = ys0Var.Q;
        if (adapter == hs0Var) {
            ArrayList arrayList = hs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.np.s1(hs0Var.d).l(arrayList, hs0Var.s.m1);
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        aq0 aq0Var = this.x3;
        this.z3.O(aq0Var, aq0Var.h, this.y3);
        if (aq0Var.F == 0) {
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

    @Override // org.telegram.ui.Components.os0
    public final void z1(org.telegram.ui.Cells.n7 n7Var) {
        int messageId = n7Var.getMessageId();
        aq0 aq0Var = this.x3;
        if (messageId != aq0Var.J || !n7Var.c.I()) {
            n7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!aq0Var.K) {
            aq0Var.L = 0.0f;
            aq0Var.K = true;
        }
        float f10 = aq0Var.L;
        n7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }
}
