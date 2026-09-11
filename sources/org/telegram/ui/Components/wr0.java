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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class wr0 extends nu0 {
    public float q3;
    public float r3;
    public final /* synthetic */ tr0 s3;
    public final /* synthetic */ ur0 t3;
    public final /* synthetic */ xu0 u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(xu0 xu0Var, Context context, tr0 tr0Var, ur0 ur0Var) {
        super(context);
        this.u3 = xu0Var;
        this.s3 = tr0Var;
        this.t3 = ur0Var;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean A1() {
        return this == this.s3.h;
    }

    public final View B1() {
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

    @Override // org.telegram.ui.Components.ll0
    public final Integer V0(int i10) {
        s4.h0 adapter = getAdapter();
        gt0 gt0Var = this.u3.Q;
        if (adapter == gt0Var && gt0Var.e > 0 && i10 == gt0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override // org.telegram.ui.Components.nu0, org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        xu0 xu0Var = this.u3;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        ft0 ft0Var = xu0Var.c0;
        kr0 kr0Var = xu0Var.e0;
        tr0 tr0Var = this.s3;
        if ((adapter == kr0Var || getAdapter() == ft0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xu0Var.o1) {
                if (xu0Var.p1 == (getAdapter() == ft0Var ? 8 : 9) && tr0Var.r.getChildCount() > 0 && (childAt2 = tr0Var.r.getChildAt(0)) != null) {
                    tr0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), xu0Var.n1);
                    }
                }
            }
            if (getAdapter() != ft0Var) {
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.k3 = new StaticLayout(LocaleController.getString(xu0Var.q0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-xu0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (tr0Var.K) {
            float f7 = tr0Var.L + 0.010666667f;
            tr0Var.L = f7;
            if (f7 >= 1.0f) {
                tr0Var.L = 0.0f;
                tr0Var.K = false;
                tr0Var.J = 0;
            }
            invalidate();
        }
        if (this.n3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            bi.xb[] xbVarArr = bi.xb.f;
            if (xbVarArr[currentAccount] == null) {
                xbVarArr[currentAccount] = new bi.xb(currentAccount);
            }
            this.n3 = xbVarArr[currentAccount];
        }
        this.n3.a(this);
        if (xu0Var.o1) {
            return;
        }
        xu0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xu0 xu0Var = this.u3;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.q3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            xu0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.r3 - this.q3;
            xu0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.r3 = this.q3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nu0
    public final int getAnimateToColumnsCount() {
        return this.u3.q1;
    }

    @Override // org.telegram.ui.Components.nu0
    public final float getChangeColumnsProgress() {
        return this.u3.n1;
    }

    @Override // org.telegram.ui.Components.nu0
    public final int getColumnsCount() {
        xu0 xu0Var = this.u3;
        return xu0.p0(xu0Var.p1) ? xu0Var.m1[1] : xu0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.nu0
    public final SparseArray getMessageAlphaEnter() {
        return this.u3.O1;
    }

    @Override // org.telegram.ui.Components.nu0
    public final tk0 getMovingAdapter() {
        xu0 xu0Var = this.u3;
        return xu0.p0(xu0Var.p1) ? xu0Var.k1(xu0Var.p1) : xu0Var.H;
    }

    @Override // org.telegram.ui.Components.nu0
    public final tk0 getSupportingAdapter() {
        xu0 xu0Var = this.u3;
        return xu0.p0(xu0Var.p1) ? xu0Var.l1(xu0Var.p1) : xu0Var.I;
    }

    @Override // org.telegram.ui.Components.nu0
    public final pt0 getSupportingListView() {
        return this.s3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        xu0 xu0Var = this.u3;
        if (z10 && xu0Var.getSelectedTab() == 11 && (n2Var = xu0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        xu0Var.I();
        s4.h0 adapter = getAdapter();
        eu0 eu0Var = xu0Var.N;
        if (adapter == eu0Var) {
            ArrayList<MessageObject> arrayList = eu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(eu0Var.d).addToPollsQueue(eu0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tr0 tr0Var = this.s3;
        this.u3.G(tr0Var, tr0Var.h, this.t3);
        if (tr0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View B1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (B1 = B1()) != null && B1.canScrollVertically(-1) && B1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View B12 = B1();
        if (B12 != null && B12.canScrollVertically(1) && B12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override // org.telegram.ui.Components.nu0
    public final void x1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        tr0 tr0Var = this.s3;
        if (messageId != tr0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!tr0Var.K) {
            tr0Var.L = 0.0f;
            tr0Var.K = true;
        }
        float f7 = tr0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean y1() {
        return this.u3.o1;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean z1() {
        return xu0.p0(this.u3.p1);
    }
}
