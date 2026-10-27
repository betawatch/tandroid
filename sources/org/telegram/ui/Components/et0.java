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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class et0 extends rv0 {
    public float v3;
    public float w3;
    public final /* synthetic */ bt0 x3;
    public final /* synthetic */ ct0 y3;
    public final /* synthetic */ bw0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(bw0 bw0Var, Context context, bt0 bt0Var, ct0 ct0Var) {
        super(context);
        this.z3 = bw0Var;
        this.x3 = bt0Var;
        this.y3 = ct0Var;
    }

    @Override // org.telegram.ui.Components.rv0
    public final void C1(org.telegram.ui.Cells.w7 w7Var) {
        int messageId = w7Var.getMessageId();
        bt0 bt0Var = this.x3;
        if (messageId != bt0Var.I || !w7Var.c.hasBitmapImage()) {
            w7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!bt0Var.J) {
            bt0Var.K = 0.0f;
            bt0Var.J = true;
        }
        float f7 = bt0Var.K;
        w7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean D1() {
        return this.z3.q1;
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean E1() {
        return bw0.w0(this.z3.r1);
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean F1() {
        return this == this.x3.h;
    }

    public final View G1() {
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

    @Override // org.telegram.ui.Components.nm0
    public final Integer W0(int i10) {
        s4.h0 adapter = getAdapter();
        ku0 ku0Var = this.z3.S;
        if (adapter == ku0Var && ku0Var.e > 0 && i10 == ku0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        bw0 bw0Var = this.z3;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        iu0 iu0Var = bw0Var.e0;
        us0 us0Var = bw0Var.g0;
        bt0 bt0Var = this.x3;
        if ((adapter == us0Var || getAdapter() == iu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (bw0Var.q1) {
                if (bw0Var.r1 == (getAdapter() == iu0Var ? 8 : 9) && bt0Var.n.getChildCount() > 0 && (childAt2 = bt0Var.n.getChildAt(0)) != null) {
                    bt0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), bw0Var.p1);
                    }
                }
            }
            if (getAdapter() != iu0Var) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.o3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(LocaleController.getString(bw0Var.x0() ? r2Var != null && ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(-bw0Var.l1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i10 = 0; i10 < this.p3.getLineCount(); i10++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i10));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.q3) / 2.0f) - this.r3, top - ((this.p3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (bt0Var.J) {
            float f7 = bt0Var.K + 0.010666667f;
            bt0Var.K = f7;
            if (f7 >= 1.0f) {
                bt0Var.K = 0.0f;
                bt0Var.J = false;
                bt0Var.I = 0;
            }
            invalidate();
        }
        if (this.s3 == null) {
            int currentAccount = r2Var.getCurrentAccount();
            di.ga[] gaVarArr = di.ga.f;
            if (gaVarArr[currentAccount] == null) {
                gaVarArr[currentAccount] = new di.ga(currentAccount);
            }
            this.s3 = gaVarArr[currentAccount];
        }
        this.s3.a(this);
        if (bw0Var.q1) {
            return;
        }
        bw0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bw0 bw0Var = this.z3;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        if (r2Var == null || !r2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            bw0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.w3 - this.v3;
            bw0Var.x1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getAnimateToColumnsCount() {
        return this.z3.s1;
    }

    @Override // org.telegram.ui.Components.rv0
    public final float getChangeColumnsProgress() {
        return this.z3.p1;
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getColumnsCount() {
        bw0 bw0Var = this.z3;
        return bw0.w0(bw0Var.r1) ? bw0Var.o1[1] : bw0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.rv0
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.R1;
    }

    @Override // org.telegram.ui.Components.rv0
    public final ul0 getMovingAdapter() {
        bw0 bw0Var = this.z3;
        return bw0.w0(bw0Var.r1) ? bw0Var.t1(bw0Var.r1) : bw0Var.J;
    }

    @Override // org.telegram.ui.Components.rv0
    public final ul0 getSupportingAdapter() {
        bw0 bw0Var = this.z3;
        return bw0.w0(bw0Var.r1) ? bw0Var.u1(bw0Var.r1) : bw0Var.K;
    }

    @Override // org.telegram.ui.Components.rv0
    public final tu0 getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z10 = this.I1;
        bw0 bw0Var = this.z3;
        if (z10 && bw0Var.getSelectedTab() == 11 && (r2Var = bw0Var.x1) != null) {
            AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
        }
        bw0Var.P();
        s4.h0 adapter = getAdapter();
        jv0 jv0Var = bw0Var.P;
        if (adapter == jv0Var) {
            ArrayList<MessageObject> arrayList = jv0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(jv0Var.d).addToPollsQueue(jv0Var.s.l1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bt0 bt0Var = this.x3;
        this.z3.M(bt0Var, bt0Var.h, this.y3);
        if (bt0Var.E == 0) {
            PhotoViewer.v1().z0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View G1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (G1 = G1()) != null && G1.canScrollVertically(-1) && G1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View G12 = G1();
        if (G12 != null && G12.canScrollVertically(1) && G12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
