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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dq0 extends ps0 {
    public float u3;
    public float v3;
    public final /* synthetic */ aq0 w3;
    public final /* synthetic */ bq0 x3;
    public final /* synthetic */ zs0 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, aq0 aq0Var, bq0 bq0Var) {
        super(context, g6Var);
        this.y3 = zs0Var;
        this.w3 = aq0Var;
        this.x3 = bq0Var;
    }

    @Override // org.telegram.ui.Components.ps0
    public final boolean A1() {
        return this.y3.q1;
    }

    @Override // org.telegram.ui.Components.ps0
    public final boolean B1() {
        return zs0.z0(this.y3.r1);
    }

    @Override // org.telegram.ui.Components.ps0
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public final Integer V0(int i7) {
        v4.g0 adapter = getAdapter();
        lr0 lr0Var = this.y3.S;
        if (adapter == lr0Var && lr0Var.e > 0 && i7 == lr0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override // org.telegram.ui.Components.ps0, org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        v4.g0 adapter = getAdapter();
        zs0 zs0Var = this.y3;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        ir0 ir0Var = zs0Var.e0;
        sp0 sp0Var = zs0Var.g0;
        aq0 aq0Var = this.w3;
        if ((adapter == sp0Var || getAdapter() == ir0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zs0Var.q1) {
                if (zs0Var.r1 == (getAdapter() == ir0Var ? 8 : 9) && aq0Var.n.getChildCount() > 0 && (childAt2 = aq0Var.n.getChildAt(0)) != null) {
                    aq0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(zs0Var.p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ir0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                if (this.n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.n3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.o3 = new StaticLayout(org.telegram.messenger.id.M0(zs0Var.A0() ? f2Var != null && org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(-zs0Var.l1))) ? 2131746633 : 2131746629 : 2131746628, null), this.n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.p3 = 0.0f;
                    this.q3 = measuredWidth;
                    for (int i7 = 0; i7 < this.o3.getLineCount(); i7++) {
                        this.p3 = Math.max(this.p3, this.o3.getLineWidth(i7));
                        this.q3 = Math.min(this.q3, this.o3.getLineLeft(i7));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.p3) / 2.0f) - this.q3, top - ((this.o3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (aq0Var.J) {
            float f10 = aq0Var.K + 0.010666667f;
            aq0Var.K = f10;
            if (f10 >= 1.0f) {
                aq0Var.K = 0.0f;
                aq0Var.J = false;
                aq0Var.I = 0;
            }
            invalidate();
        }
        if (this.r3 == null) {
            int currentAccount = f2Var.getCurrentAccount();
            di.y9[] y9VarArr = di.y9.f;
            if (y9VarArr[currentAccount] == null) {
                y9VarArr[currentAccount] = new di.y9(currentAccount);
            }
            this.r3 = y9VarArr[currentAccount];
        }
        this.r3.a(this);
        if (zs0Var.q1) {
            return;
        }
        zs0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zs0 zs0Var = this.y3;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        if (f2Var == null || !f2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.u3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            zs0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.v3 - this.u3;
            zs0Var.x1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.v3 = this.u3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ps0
    public final int getAnimateToColumnsCount() {
        return this.y3.s1;
    }

    @Override // org.telegram.ui.Components.ps0
    public final float getChangeColumnsProgress() {
        return this.y3.p1;
    }

    @Override // org.telegram.ui.Components.ps0
    public final int getColumnsCount() {
        zs0 zs0Var = this.y3;
        return zs0.z0(zs0Var.r1) ? zs0Var.o1[1] : zs0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.ps0
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override // org.telegram.ui.Components.ps0
    public final wi0 getMovingAdapter() {
        zs0 zs0Var = this.y3;
        return zs0.z0(zs0Var.r1) ? zs0Var.z1(zs0Var.r1) : zs0Var.J;
    }

    @Override // org.telegram.ui.Components.ps0
    public final wi0 getSupportingAdapter() {
        zs0 zs0Var = this.y3;
        return zs0.z0(zs0Var.r1) ? zs0Var.A1(zs0Var.r1) : zs0Var.K;
    }

    @Override // org.telegram.ui.Components.ps0
    public final tr0 getSupportingListView() {
        return this.w3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9 = this.I1;
        zs0 zs0Var = this.y3;
        if (z9 && zs0Var.getSelectedTab() == 11 && (f2Var = zs0Var.x1) != null) {
            org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
        }
        zs0Var.S();
        v4.g0 adapter = getAdapter();
        is0 is0Var = zs0Var.P;
        if (adapter == is0Var) {
            ArrayList arrayList = is0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.qp.s1(is0Var.d).l(arrayList, is0Var.s.l1);
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        aq0 aq0Var = this.w3;
        this.y3.O(aq0Var, aq0Var.h, this.x3);
        if (aq0Var.E == 0) {
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

    @Override // org.telegram.ui.Components.ps0
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        int messageId = o7Var.getMessageId();
        aq0 aq0Var = this.w3;
        if (messageId != aq0Var.I || !o7Var.c.I()) {
            o7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!aq0Var.J) {
            aq0Var.K = 0.0f;
            aq0Var.J = true;
        }
        float f10 = aq0Var.K;
        o7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }
}
