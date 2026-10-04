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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class os0 extends fv0 {
    public final /* synthetic */ ms0 A3;
    public final /* synthetic */ pv0 B3;
    public float x3;
    public float y3;
    public final /* synthetic */ ls0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(pv0 pv0Var, Context context, ls0 ls0Var, ms0 ms0Var) {
        super(context);
        this.B3 = pv0Var;
        this.z3 = ls0Var;
        this.A3 = ms0Var;
    }

    @Override // org.telegram.ui.Components.fv0
    public final void A1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        ls0 ls0Var = this.z3;
        if (messageId != ls0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ls0Var.K) {
            ls0Var.L = 0.0f;
            ls0Var.K = true;
        }
        float f7 = ls0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.fv0
    public final boolean B1() {
        return this.B3.o1;
    }

    @Override // org.telegram.ui.Components.fv0
    public final boolean C1() {
        return pv0.p0(this.B3.p1);
    }

    @Override // org.telegram.ui.Components.fv0
    public final boolean D1() {
        return this == this.z3.h;
    }

    public final View E1() {
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
    public final Integer X0(int i10) {
        s4.h0 adapter = getAdapter();
        yt0 yt0Var = this.B3.Q;
        if (adapter == yt0Var && yt0Var.e > 0 && i10 == yt0Var.d.size() - 1) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override // org.telegram.ui.Components.fv0, org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        pv0 pv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.v1;
        xt0 xt0Var = pv0Var.c0;
        cs0 cs0Var = pv0Var.e0;
        ls0 ls0Var = this.z3;
        if ((adapter == cs0Var || getAdapter() == xt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (pv0Var.o1) {
                if (pv0Var.p1 == (getAdapter() == xt0Var ? 8 : 9) && ls0Var.r.getChildCount() > 0 && (childAt2 = ls0Var.r.getChildAt(0)) != null) {
                    ls0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), pv0Var.n1);
                    }
                }
            }
            if (getAdapter() != xt0Var) {
                if (this.q3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.q3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.q3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.r3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.r3 = new StaticLayout(LocaleController.getString(pv0Var.q0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-pv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.q3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (ls0Var.K) {
            float f7 = ls0Var.L + 0.010666667f;
            ls0Var.L = f7;
            if (f7 >= 1.0f) {
                ls0Var.L = 0.0f;
                ls0Var.K = false;
                ls0Var.J = 0;
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
        if (pv0Var.o1) {
            return;
        }
        pv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pv0 pv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.v1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.x3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            pv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.y3 - this.x3;
            pv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.y3 = this.x3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fv0
    public final int getAnimateToColumnsCount() {
        return this.B3.q1;
    }

    @Override // org.telegram.ui.Components.fv0
    public final float getChangeColumnsProgress() {
        return this.B3.n1;
    }

    @Override // org.telegram.ui.Components.fv0
    public final int getColumnsCount() {
        pv0 pv0Var = this.B3;
        return pv0.p0(pv0Var.p1) ? pv0Var.m1[1] : pv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.fv0
    public final SparseArray getMessageAlphaEnter() {
        return this.B3.O1;
    }

    @Override // org.telegram.ui.Components.fv0
    public final gl0 getMovingAdapter() {
        pv0 pv0Var = this.B3;
        return pv0.p0(pv0Var.p1) ? pv0Var.k1(pv0Var.p1) : pv0Var.H;
    }

    @Override // org.telegram.ui.Components.fv0
    public final gl0 getSupportingAdapter() {
        pv0 pv0Var = this.B3;
        return pv0.p0(pv0Var.p1) ? pv0Var.l1(pv0Var.p1) : pv0Var.I;
    }

    @Override // org.telegram.ui.Components.fv0
    public final hu0 getSupportingListView() {
        return this.z3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        pv0 pv0Var = this.B3;
        if (z10 && pv0Var.getSelectedTab() == 11 && (n2Var = pv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        pv0Var.I();
        s4.h0 adapter = getAdapter();
        wu0 wu0Var = pv0Var.N;
        if (adapter == wu0Var) {
            ArrayList<MessageObject> arrayList = wu0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(wu0Var.d).addToPollsQueue(wu0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ls0 ls0Var = this.z3;
        this.B3.G(ls0Var, ls0Var.h, this.A3);
        if (ls0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View E1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (E1 = E1()) != null && E1.canScrollVertically(-1) && E1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View E12 = E1();
        if (E12 != null && E12.canScrollVertically(1) && E12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
