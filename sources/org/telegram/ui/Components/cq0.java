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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cq0 extends ns0 {
    public float u3;
    public float v3;
    public final /* synthetic */ zp0 w3;
    public final /* synthetic */ aq0 x3;
    public final /* synthetic */ xs0 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(xs0 xs0Var, Context context, zp0 zp0Var, aq0 aq0Var) {
        super(context);
        this.y3 = xs0Var;
        this.w3 = zp0Var;
        this.x3 = aq0Var;
    }

    @Override // org.telegram.ui.Components.ns0
    public final boolean A1() {
        return this.y3.q1;
    }

    @Override // org.telegram.ui.Components.ns0
    public final boolean B1() {
        return xs0.z0(this.y3.r1);
    }

    @Override // org.telegram.ui.Components.ns0
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

    @Override // org.telegram.ui.Components.pj0
    public final Integer V0(int i7) {
        v4.g0 adapter = getAdapter();
        jr0 jr0Var = this.y3.S;
        if (adapter == jr0Var && jr0Var.e > 0 && i7 == jr0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override // org.telegram.ui.Components.ns0, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        v4.g0 adapter = getAdapter();
        xs0 xs0Var = this.y3;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        gr0 gr0Var = xs0Var.e0;
        rp0 rp0Var = xs0Var.g0;
        zp0 zp0Var = this.w3;
        if ((adapter == rp0Var || getAdapter() == gr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xs0Var.q1) {
                if (xs0Var.r1 == (getAdapter() == gr0Var ? 8 : 9) && zp0Var.n.getChildCount() > 0 && (childAt2 = zp0Var.n.getChildAt(0)) != null) {
                    zp0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(xs0Var.p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != gr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                if (this.n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.n3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.o3 = new StaticLayout(org.telegram.messenger.hd.M0(xs0Var.A0() ? f2Var != null && org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(-xs0Var.l1))) ? 2131746632 : 2131746628 : 2131746627, null), this.n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (zp0Var.J) {
            float f10 = zp0Var.K + 0.010666667f;
            zp0Var.K = f10;
            if (f10 >= 1.0f) {
                zp0Var.K = 0.0f;
                zp0Var.J = false;
                zp0Var.I = 0;
            }
            invalidate();
        }
        if (this.r3 == null) {
            int currentAccount = f2Var.getCurrentAccount();
            di.x9[] x9VarArr = di.x9.f;
            if (x9VarArr[currentAccount] == null) {
                x9VarArr[currentAccount] = new di.x9(currentAccount);
            }
            this.r3 = x9VarArr[currentAccount];
        }
        this.r3.a(this);
        if (xs0Var.q1) {
            return;
        }
        xs0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xs0 xs0Var = this.y3;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        if (f2Var == null || !f2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.u3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            xs0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.v3 - this.u3;
            xs0Var.x1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.v3 = this.u3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ns0
    public final int getAnimateToColumnsCount() {
        return this.y3.s1;
    }

    @Override // org.telegram.ui.Components.ns0
    public final float getChangeColumnsProgress() {
        return this.y3.p1;
    }

    @Override // org.telegram.ui.Components.ns0
    public final int getColumnsCount() {
        xs0 xs0Var = this.y3;
        return xs0.z0(xs0Var.r1) ? xs0Var.o1[1] : xs0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.ns0
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override // org.telegram.ui.Components.ns0
    public final vi0 getMovingAdapter() {
        xs0 xs0Var = this.y3;
        return xs0.z0(xs0Var.r1) ? xs0Var.x1(xs0Var.r1) : xs0Var.J;
    }

    @Override // org.telegram.ui.Components.ns0
    public final vi0 getSupportingAdapter() {
        xs0 xs0Var = this.y3;
        return xs0.z0(xs0Var.r1) ? xs0Var.y1(xs0Var.r1) : xs0Var.K;
    }

    @Override // org.telegram.ui.Components.ns0
    public final rr0 getSupportingListView() {
        return this.w3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9 = this.I1;
        xs0 xs0Var = this.y3;
        if (z9 && xs0Var.getSelectedTab() == 11 && (f2Var = xs0Var.x1) != null) {
            org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
        }
        xs0Var.S();
        v4.g0 adapter = getAdapter();
        gs0 gs0Var = xs0Var.P;
        if (adapter == gs0Var) {
            ArrayList arrayList = gs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.qp.s1(gs0Var.d).l(arrayList, gs0Var.s.l1);
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        zp0 zp0Var = this.w3;
        this.y3.O(zp0Var, zp0Var.h, this.x3);
        if (zp0Var.E == 0) {
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

    @Override // org.telegram.ui.Components.ns0
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        int messageId = o7Var.getMessageId();
        zp0 zp0Var = this.w3;
        if (messageId != zp0Var.I || !o7Var.c.I()) {
            o7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!zp0Var.J) {
            zp0Var.K = 0.0f;
            zp0Var.J = true;
        }
        float f10 = zp0Var.K;
        o7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }
}
