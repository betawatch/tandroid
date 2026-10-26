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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dt0 extends qv0 {
    public float v3;
    public float w3;
    public final /* synthetic */ at0 x3;
    public final /* synthetic */ bt0 y3;
    public final /* synthetic */ aw0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(aw0 aw0Var, Context context, at0 at0Var, bt0 bt0Var) {
        super(context);
        this.z3 = aw0Var;
        this.x3 = at0Var;
        this.y3 = bt0Var;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void C1(org.telegram.ui.Cells.w7 w7Var) {
        int messageId = w7Var.getMessageId();
        at0 at0Var = this.x3;
        if (messageId != at0Var.I || !w7Var.c.hasBitmapImage()) {
            w7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!at0Var.J) {
            at0Var.K = 0.0f;
            at0Var.J = true;
        }
        float f7 = at0Var.K;
        w7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean D1() {
        return this.z3.q1;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean E1() {
        return aw0.w0(this.z3.r1);
    }

    @Override // org.telegram.ui.Components.qv0
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

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        s4.h0 adapter = getAdapter();
        ju0 ju0Var = this.z3.S;
        if (adapter == ju0Var && ju0Var.e > 0 && i10 == ju0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.qv0, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        aw0 aw0Var = this.z3;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        hu0 hu0Var = aw0Var.e0;
        ts0 ts0Var = aw0Var.g0;
        at0 at0Var = this.x3;
        if ((adapter == ts0Var || getAdapter() == hu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (aw0Var.q1) {
                if (aw0Var.r1 == (getAdapter() == hu0Var ? 8 : 9) && at0Var.n.getChildCount() > 0 && (childAt2 = at0Var.n.getChildAt(0)) != null) {
                    at0Var.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), aw0Var.p1);
                    }
                }
            }
            if (getAdapter() != hu0Var) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.o3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(LocaleController.getString(aw0Var.x0() ? r2Var != null && ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(-aw0Var.l1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (at0Var.J) {
            float f7 = at0Var.K + 0.010666667f;
            at0Var.K = f7;
            if (f7 >= 1.0f) {
                at0Var.K = 0.0f;
                at0Var.J = false;
                at0Var.I = 0;
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
        if (aw0Var.q1) {
            return;
        }
        aw0Var.r1 = -1;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        aw0 aw0Var = this.z3;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        if (r2Var == null || !r2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            aw0Var.x1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.w3 - this.v3;
            aw0Var.x1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qv0
    public final int getAnimateToColumnsCount() {
        return this.z3.s1;
    }

    @Override // org.telegram.ui.Components.qv0
    public final float getChangeColumnsProgress() {
        return this.z3.p1;
    }

    @Override // org.telegram.ui.Components.qv0
    public final int getColumnsCount() {
        aw0 aw0Var = this.z3;
        return aw0.w0(aw0Var.r1) ? aw0Var.o1[1] : aw0Var.o1[0];
    }

    @Override // org.telegram.ui.Components.qv0
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.R1;
    }

    @Override // org.telegram.ui.Components.qv0
    public final tl0 getMovingAdapter() {
        aw0 aw0Var = this.z3;
        return aw0.w0(aw0Var.r1) ? aw0Var.t1(aw0Var.r1) : aw0Var.J;
    }

    @Override // org.telegram.ui.Components.qv0
    public final tl0 getSupportingAdapter() {
        aw0 aw0Var = this.z3;
        return aw0.w0(aw0Var.r1) ? aw0Var.u1(aw0Var.r1) : aw0Var.K;
    }

    @Override // org.telegram.ui.Components.qv0
    public final su0 getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z10 = this.I1;
        aw0 aw0Var = this.z3;
        if (z10 && aw0Var.getSelectedTab() == 11 && (r2Var = aw0Var.x1) != null) {
            AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
        }
        aw0Var.P();
        s4.h0 adapter = getAdapter();
        iv0 iv0Var = aw0Var.P;
        if (adapter == iv0Var) {
            ArrayList<MessageObject> arrayList = iv0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(iv0Var.d).addToPollsQueue(iv0Var.s.l1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        at0 at0Var = this.x3;
        this.z3.M(at0Var, at0Var.h, this.y3);
        if (at0Var.E == 0) {
            PhotoViewer.u1().z0();
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
