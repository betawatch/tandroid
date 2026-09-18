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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yr0 extends pu0 {
    public float q3;
    public float r3;
    public final /* synthetic */ vr0 s3;
    public final /* synthetic */ wr0 t3;
    public final /* synthetic */ zu0 u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(zu0 zu0Var, Context context, vr0 vr0Var, wr0 wr0Var) {
        super(context);
        this.u3 = zu0Var;
        this.s3 = vr0Var;
        this.t3 = wr0Var;
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean A1() {
        return this.u3.o1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean B1() {
        return zu0.p0(this.u3.p1);
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean C1() {
        return this == this.s3.h;
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

    @Override // org.telegram.ui.Components.ml0
    public final Integer X0(int i10) {
        s4.h0 adapter = getAdapter();
        it0 it0Var = this.u3.Q;
        if (adapter == it0Var && it0Var.e > 0 && i10 == it0Var.d.size() - 1) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override // org.telegram.ui.Components.pu0, org.telegram.ui.Components.ga, org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        zu0 zu0Var = this.u3;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        ht0 ht0Var = zu0Var.c0;
        mr0 mr0Var = zu0Var.e0;
        vr0 vr0Var = this.s3;
        if ((adapter == mr0Var || getAdapter() == ht0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (zu0Var.o1) {
                if (zu0Var.p1 == (getAdapter() == ht0Var ? 8 : 9) && vr0Var.r.getChildCount() > 0 && (childAt2 = vr0Var.r.getChildAt(0)) != null) {
                    vr0Var.r.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), zu0Var.n1);
                    }
                }
            }
            if (getAdapter() != ht0Var) {
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.k3 = new StaticLayout(LocaleController.getString(zu0Var.q0() ? o2Var != null && ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-zu0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.l3 = 0.0f;
                    this.m3 = measuredWidth;
                    for (int i10 = 0; i10 < this.k3.getLineCount(); i10++) {
                        this.l3 = Math.max(this.l3, this.k3.getLineWidth(i10));
                        this.m3 = Math.min(this.m3, this.k3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.l3) / 2.0f) - this.m3, top - ((this.k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (vr0Var.K) {
            float f7 = vr0Var.L + 0.010666667f;
            vr0Var.L = f7;
            if (f7 >= 1.0f) {
                vr0Var.L = 0.0f;
                vr0Var.K = false;
                vr0Var.J = 0;
            }
            invalidate();
        }
        if (this.n3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.n3 = rcVarArr[currentAccount];
        }
        this.n3.a(this);
        if (zu0Var.o1) {
            return;
        }
        zu0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zu0 zu0Var = this.u3;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        if (o2Var == null || !o2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.q3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            zu0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.r3 - this.q3;
            zu0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.r3 = this.q3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getAnimateToColumnsCount() {
        return this.u3.q1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final float getChangeColumnsProgress() {
        return this.u3.n1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getColumnsCount() {
        zu0 zu0Var = this.u3;
        return zu0.p0(zu0Var.p1) ? zu0Var.m1[1] : zu0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.pu0
    public final SparseArray getMessageAlphaEnter() {
        return this.u3.O1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final uk0 getMovingAdapter() {
        zu0 zu0Var = this.u3;
        return zu0.p0(zu0Var.p1) ? zu0Var.k1(zu0Var.p1) : zu0Var.H;
    }

    @Override // org.telegram.ui.Components.pu0
    public final uk0 getSupportingAdapter() {
        zu0 zu0Var = this.u3;
        return zu0.p0(zu0Var.p1) ? zu0Var.l1(zu0Var.p1) : zu0Var.I;
    }

    @Override // org.telegram.ui.Components.pu0
    public final rt0 getSupportingListView() {
        return this.s3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.K1;
        zu0 zu0Var = this.u3;
        if (z10 && zu0Var.getSelectedTab() == 11 && (o2Var = zu0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        zu0Var.I();
        s4.h0 adapter = getAdapter();
        gu0 gu0Var = zu0Var.N;
        if (adapter == gu0Var) {
            ArrayList<MessageObject> arrayList = gu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(gu0Var.d).addToPollsQueue(gu0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        vr0 vr0Var = this.s3;
        this.u3.G(vr0Var, vr0Var.h, this.t3);
        if (vr0Var.F == 0) {
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

    @Override // org.telegram.ui.Components.pu0
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        vr0 vr0Var = this.s3;
        if (messageId != vr0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!vr0Var.K) {
            vr0Var.L = 0.0f;
            vr0Var.K = true;
        }
        float f7 = vr0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
