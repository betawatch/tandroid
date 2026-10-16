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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ws0 extends nv0 {
    public float o3;
    public float p3;
    public final /* synthetic */ ts0 q3;
    public final /* synthetic */ us0 r3;
    public final /* synthetic */ xv0 s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(xv0 xv0Var, Context context, ts0 ts0Var, us0 us0Var) {
        super(context);
        this.s3 = xv0Var;
        this.q3 = ts0Var;
        this.r3 = us0Var;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean A1() {
        return this.s3.o1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean B1() {
        return xv0.p0(this.s3.p1);
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean C1() {
        return this == this.q3.h;
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
            FileLog.e(e);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        s4.g0 adapter = getAdapter();
        gu0 gu0Var = this.s3.Q;
        if (adapter == gu0Var && gu0Var.e > 0 && i10 == gu0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.g0 adapter = getAdapter();
        xv0 xv0Var = this.s3;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        fu0 fu0Var = xv0Var.c0;
        ls0 ls0Var = xv0Var.e0;
        ts0 ts0Var = this.q3;
        if ((adapter == ls0Var || getAdapter() == fu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xv0Var.o1) {
                if (xv0Var.p1 == (getAdapter() == fu0Var ? 8 : 9) && ts0Var.r.getChildCount() > 0 && (childAt2 = ts0Var.r.getChildAt(0)) != null) {
                    ts0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), xv0Var.n1);
                    }
                }
            }
            if (getAdapter() != fu0Var) {
                if (this.h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.h3.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.i3 = new StaticLayout(LocaleController.getString(xv0Var.q0() ? m2Var != null && ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-xv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.k3 = measuredWidth;
                    for (int i10 = 0; i10 < this.i3.getLineCount(); i10++) {
                        this.j3 = Math.max(this.j3, this.i3.getLineWidth(i10));
                        this.k3 = Math.min(this.k3, this.i3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.k3, top - ((this.i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ts0Var.K) {
            float f7 = ts0Var.L + 0.010666667f;
            ts0Var.L = f7;
            if (f7 >= 1.0f) {
                ts0Var.L = 0.0f;
                ts0Var.K = false;
                ts0Var.J = 0;
            }
            invalidate();
        }
        if (this.l3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            bi.ac[] acVarArr = bi.ac.f;
            if (acVarArr[currentAccount] == null) {
                acVarArr[currentAccount] = new bi.ac(currentAccount);
            }
            this.l3 = acVarArr[currentAccount];
        }
        this.l3.a(this);
        if (xv0Var.o1) {
            return;
        }
        xv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xv0 xv0Var = this.s3;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        if (m2Var == null || !m2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.o3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            xv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.p3 - this.o3;
            xv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.p3 = this.o3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getAnimateToColumnsCount() {
        return this.s3.q1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final float getChangeColumnsProgress() {
        return this.s3.n1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getColumnsCount() {
        xv0 xv0Var = this.s3;
        return xv0.p0(xv0Var.p1) ? xv0Var.m1[1] : xv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.nv0
    public final SparseArray getMessageAlphaEnter() {
        return this.s3.O1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getMovingAdapter() {
        xv0 xv0Var = this.s3;
        return xv0.p0(xv0Var.p1) ? xv0Var.l1(xv0Var.p1) : xv0Var.H;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getSupportingAdapter() {
        xv0 xv0Var = this.s3;
        return xv0.p0(xv0Var.p1) ? xv0Var.m1(xv0Var.p1) : xv0Var.I;
    }

    @Override // org.telegram.ui.Components.nv0
    public final pu0 getSupportingListView() {
        return this.q3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.I1;
        xv0 xv0Var = this.s3;
        if (z10 && xv0Var.getSelectedTab() == 11 && (m2Var = xv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        xv0Var.I();
        s4.g0 adapter = getAdapter();
        ev0 ev0Var = xv0Var.N;
        if (adapter == ev0Var) {
            ArrayList<MessageObject> arrayList = ev0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ev0Var.d).addToPollsQueue(ev0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ts0 ts0Var = this.q3;
        this.s3.G(ts0Var, ts0Var.h, this.r3);
        if (ts0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View D1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (D1 = D1()) != null && D1.canScrollVertically(-1) && D1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View D12 = D1();
        if (D12 != null && D12.canScrollVertically(1) && D12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override // org.telegram.ui.Components.nv0
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        ts0 ts0Var = this.q3;
        if (messageId != ts0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ts0Var.K) {
            ts0Var.L = 0.0f;
            ts0Var.K = true;
        }
        float f7 = ts0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
