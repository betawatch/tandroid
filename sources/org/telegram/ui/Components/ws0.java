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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ws0 extends nv0 {
    public float r3;
    public float s3;
    public final /* synthetic */ ts0 t3;
    public final /* synthetic */ us0 u3;
    public final /* synthetic */ xv0 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(xv0 xv0Var, Context context, ts0 ts0Var, us0 us0Var) {
        super(context);
        this.v3 = xv0Var;
        this.t3 = ts0Var;
        this.u3 = us0Var;
    }

    @Override // org.telegram.ui.Components.nv0
    public final void E1(org.telegram.ui.Cells.s7 s7Var) {
        int messageId = s7Var.getMessageId();
        ts0 ts0Var = this.t3;
        if (messageId != ts0Var.J || !s7Var.c.hasBitmapImage()) {
            s7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ts0Var.K) {
            ts0Var.L = 0.0f;
            ts0Var.K = true;
        }
        float f7 = ts0Var.L;
        s7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean F1() {
        return this.v3.o1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean G1() {
        return xv0.r0(this.v3.p1);
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean H1() {
        return this == this.t3.h;
    }

    public final View I1() {
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
    public final Integer X0(int i10) {
        s4.g0 adapter = getAdapter();
        gu0 gu0Var = this.v3.Q;
        if (adapter == gu0Var && gu0Var.e > 0 && i10 == gu0Var.d.size() - 1) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.g0 adapter = getAdapter();
        xv0 xv0Var = this.v3;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        fu0 fu0Var = xv0Var.c0;
        ls0 ls0Var = xv0Var.e0;
        ts0 ts0Var = this.t3;
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
                if (this.k3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.k3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.k3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.l3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.l3 = new StaticLayout(LocaleController.getString(xv0Var.s0() ? o2Var != null && ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-xv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.k3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.m3 = 0.0f;
                    this.n3 = measuredWidth;
                    for (int i10 = 0; i10 < this.l3.getLineCount(); i10++) {
                        this.m3 = Math.max(this.m3, this.l3.getLineWidth(i10));
                        this.n3 = Math.min(this.n3, this.l3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.m3) / 2.0f) - this.n3, top - ((this.l3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.l3.draw(canvas);
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
        if (this.o3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ci.ha[] haVarArr = ci.ha.f;
            if (haVarArr[currentAccount] == null) {
                haVarArr[currentAccount] = new ci.ha(currentAccount);
            }
            this.o3 = haVarArr[currentAccount];
        }
        this.o3.a(this);
        if (xv0Var.o1) {
            return;
        }
        xv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xv0 xv0Var = this.v3;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        if (o2Var == null || !o2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.r3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            xv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.s3 - this.r3;
            xv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.s3 = this.r3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getAnimateToColumnsCount() {
        return this.v3.q1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final float getChangeColumnsProgress() {
        return this.v3.n1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getColumnsCount() {
        xv0 xv0Var = this.v3;
        return xv0.r0(xv0Var.p1) ? xv0Var.m1[1] : xv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.nv0
    public final SparseArray getMessageAlphaEnter() {
        return this.v3.P1;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getMovingAdapter() {
        xv0 xv0Var = this.v3;
        return xv0.r0(xv0Var.p1) ? xv0Var.n1(xv0Var.p1) : xv0Var.H;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getSupportingAdapter() {
        xv0 xv0Var = this.v3;
        return xv0.r0(xv0Var.p1) ? xv0Var.o1(xv0Var.p1) : xv0Var.I;
    }

    @Override // org.telegram.ui.Components.nv0
    public final pu0 getSupportingListView() {
        return this.t3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.I1;
        xv0 xv0Var = this.v3;
        if (z10 && xv0Var.getSelectedTab() == 11 && (o2Var = xv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        xv0Var.J();
        s4.g0 adapter = getAdapter();
        ev0 ev0Var = xv0Var.N;
        if (adapter == ev0Var) {
            ArrayList<MessageObject> arrayList = ev0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ev0Var.d).addToPollsQueue(ev0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ts0 ts0Var = this.t3;
        this.v3.H(ts0Var, ts0Var.h, this.u3);
        if (ts0Var.F == 0) {
            PhotoViewer.u1().z0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View I1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (I1 = I1()) != null && I1.canScrollVertically(-1) && I1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View I12 = I1();
        if (I12 != null && I12.canScrollVertically(1) && I12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
