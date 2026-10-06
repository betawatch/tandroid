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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ps0 extends gv0 {
    public final /* synthetic */ ns0 A3;
    public final /* synthetic */ qv0 B3;
    public float x3;
    public float y3;
    public final /* synthetic */ ms0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(qv0 qv0Var, Context context, ms0 ms0Var, ns0 ns0Var) {
        super(context);
        this.B3 = qv0Var;
        this.z3 = ms0Var;
        this.A3 = ns0Var;
    }

    @Override // org.telegram.ui.Components.gv0
    public final boolean A1() {
        return this.B3.o1;
    }

    @Override // org.telegram.ui.Components.gv0
    public final boolean B1() {
        return qv0.p0(this.B3.p1);
    }

    @Override // org.telegram.ui.Components.gv0
    public final boolean C1() {
        return this == this.z3.h;
    }

    public final View D1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final Integer W0(int i10) {
        s4.h0 adapter = getAdapter();
        zt0 zt0Var = this.B3.Q;
        if (adapter == zt0Var && zt0Var.e > 0 && i10 == zt0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.gv0, org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        qv0 qv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        yt0 yt0Var = qv0Var.c0;
        ds0 ds0Var = qv0Var.e0;
        ms0 ms0Var = this.z3;
        if ((adapter == ds0Var || getAdapter() == yt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (qv0Var.o1) {
                if (qv0Var.p1 == (getAdapter() == yt0Var ? 8 : 9) && ms0Var.r.getChildCount() > 0 && (childAt2 = ms0Var.r.getChildAt(0)) != null) {
                    ms0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), qv0Var.n1);
                    }
                }
            }
            if (getAdapter() != yt0Var) {
                if (this.q3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.q3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.q3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.r3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.r3 = new StaticLayout(LocaleController.getString(qv0Var.q0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-qv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.q3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.s3 = 0.0f;
                    this.t3 = measuredWidth;
                    for (int i10 = 0; i10 < this.r3.getLineCount(); i10++) {
                        this.s3 = Math.max(this.s3, this.r3.getLineWidth(i10));
                        this.t3 = Math.min(this.t3, this.r3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.s3) / 2.0f) - this.t3, top - ((this.r3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.r3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ms0Var.K) {
            float f7 = ms0Var.L + 0.010666667f;
            ms0Var.L = f7;
            if (f7 >= 1.0f) {
                ms0Var.L = 0.0f;
                ms0Var.K = false;
                ms0Var.J = 0;
            }
            invalidate();
        }
        if (this.u3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.u3 = rcVarArr[currentAccount];
        }
        this.u3.a(this);
        if (qv0Var.o1) {
            return;
        }
        qv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qv0 qv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.x3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            qv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.y3 - this.x3;
            qv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.y3 = this.x3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.gv0
    public final int getAnimateToColumnsCount() {
        return this.B3.q1;
    }

    @Override // org.telegram.ui.Components.gv0
    public final float getChangeColumnsProgress() {
        return this.B3.n1;
    }

    @Override // org.telegram.ui.Components.gv0
    public final int getColumnsCount() {
        qv0 qv0Var = this.B3;
        return qv0.p0(qv0Var.p1) ? qv0Var.m1[1] : qv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.gv0
    public final SparseArray getMessageAlphaEnter() {
        return this.B3.O1;
    }

    @Override // org.telegram.ui.Components.gv0
    public final gl0 getMovingAdapter() {
        qv0 qv0Var = this.B3;
        return qv0.p0(qv0Var.p1) ? qv0Var.k1(qv0Var.p1) : qv0Var.H;
    }

    @Override // org.telegram.ui.Components.gv0
    public final gl0 getSupportingAdapter() {
        qv0 qv0Var = this.B3;
        return qv0.p0(qv0Var.p1) ? qv0Var.l1(qv0Var.p1) : qv0Var.I;
    }

    @Override // org.telegram.ui.Components.gv0
    public final iu0 getSupportingListView() {
        return this.z3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        qv0 qv0Var = this.B3;
        if (z10 && qv0Var.getSelectedTab() == 11 && (n2Var = qv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        qv0Var.I();
        s4.h0 adapter = getAdapter();
        xu0 xu0Var = qv0Var.N;
        if (adapter == xu0Var) {
            ArrayList<MessageObject> arrayList = xu0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(xu0Var.d).addToPollsQueue(xu0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ms0 ms0Var = this.z3;
        this.B3.G(ms0Var, ms0Var.h, this.A3);
        if (ms0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View D1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
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

    @Override // org.telegram.ui.Components.gv0
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        ms0 ms0Var = this.z3;
        if (messageId != ms0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ms0Var.K) {
            ms0Var.L = 0.0f;
            ms0Var.K = true;
        }
        float f7 = ms0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
