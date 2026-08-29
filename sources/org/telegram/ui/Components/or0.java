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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class or0 extends gu0 {
    public float m3;
    public float n3;
    public final /* synthetic */ lr0 o3;
    public final /* synthetic */ mr0 p3;
    public final /* synthetic */ qu0 q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(qu0 qu0Var, Context context, lr0 lr0Var, mr0 mr0Var) {
        super(context);
        this.q3 = qu0Var;
        this.o3 = lr0Var;
        this.p3 = mr0Var;
    }

    @Override // org.telegram.ui.Components.gu0
    public final boolean A1() {
        return qu0.p0(this.q3.l1);
    }

    @Override // org.telegram.ui.Components.gu0
    public final boolean B1() {
        return this == this.o3.h;
    }

    public final View C1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final Integer W0(int i10) {
        f2.p0 adapter = getAdapter();
        ys0 ys0Var = this.q3.M;
        if (adapter == ys0Var && ys0Var.e > 0 && i10 == ys0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.gu0, org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        f2.p0 adapter = getAdapter();
        qu0 qu0Var = this.q3;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        xs0 xs0Var = qu0Var.V;
        er0 er0Var = qu0Var.a0;
        lr0 lr0Var = this.o3;
        if ((adapter == er0Var || getAdapter() == xs0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (qu0Var.k1) {
                if (qu0Var.l1 == (getAdapter() == xs0Var ? 8 : 9) && lr0Var.r.getChildCount() > 0 && (childAt2 = lr0Var.r.getChildAt(0)) != null) {
                    lr0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), qu0Var.j1);
                    }
                }
            }
            if (getAdapter() != xs0Var) {
                if (this.f3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, this.l2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.g3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.g3 = new StaticLayout(LocaleController.getString(qu0Var.q0() ? o2Var != null && ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-qu0Var.f1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.f3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.h3 = 0.0f;
                    this.i3 = measuredWidth;
                    for (int i10 = 0; i10 < this.g3.getLineCount(); i10++) {
                        this.h3 = Math.max(this.h3, this.g3.getLineWidth(i10));
                        this.i3 = Math.min(this.i3, this.g3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.h3) / 2.0f) - this.i3, top - ((this.g3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.g3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (lr0Var.G) {
            float f9 = lr0Var.H + 0.010666667f;
            lr0Var.H = f9;
            if (f9 >= 1.0f) {
                lr0Var.H = 0.0f;
                lr0Var.G = false;
                lr0Var.F = 0;
            }
            invalidate();
        }
        if (this.j3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            lh.q9[] q9VarArr = lh.q9.f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new lh.q9(currentAccount);
            }
            this.j3 = q9VarArr[currentAccount];
        }
        this.j3.a(this);
        if (qu0Var.k1) {
            return;
        }
        qu0Var.l1 = -1;
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qu0 qu0Var = this.q3;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        if (o2Var == null || !o2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.m3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            qu0Var.r1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f9 = this.n3 - this.m3;
            qu0Var.r1.movePreviewFragment(f9);
            if (f9 < 0.0f) {
                this.n3 = this.m3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.gu0
    public final int getAnimateToColumnsCount() {
        return this.q3.m1;
    }

    @Override // org.telegram.ui.Components.gu0
    public final float getChangeColumnsProgress() {
        return this.q3.j1;
    }

    @Override // org.telegram.ui.Components.gu0
    public final int getColumnsCount() {
        qu0 qu0Var = this.q3;
        return qu0.p0(qu0Var.l1) ? qu0Var.i1[1] : qu0Var.i1[0];
    }

    @Override // org.telegram.ui.Components.gu0
    public final SparseArray getMessageAlphaEnter() {
        return this.q3.K1;
    }

    @Override // org.telegram.ui.Components.gu0
    public final tk0 getMovingAdapter() {
        qu0 qu0Var = this.q3;
        return qu0.p0(qu0Var.l1) ? qu0Var.k1(qu0Var.l1) : qu0Var.D;
    }

    @Override // org.telegram.ui.Components.gu0
    public final tk0 getSupportingAdapter() {
        qu0 qu0Var = this.q3;
        return qu0.p0(qu0Var.l1) ? qu0Var.l1(qu0Var.l1) : qu0Var.E;
    }

    @Override // org.telegram.ui.Components.gu0
    public final ht0 getSupportingListView() {
        return this.o3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.G1;
        qu0 qu0Var = this.q3;
        if (z10 && qu0Var.getSelectedTab() == 11 && (o2Var = qu0Var.r1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        qu0Var.I();
        f2.p0 adapter = getAdapter();
        wt0 wt0Var = qu0Var.J;
        if (adapter == wt0Var) {
            ArrayList<MessageObject> arrayList = wt0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(wt0Var.d).addToPollsQueue(wt0Var.s.f1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lr0 lr0Var = this.o3;
        this.q3.G(lr0Var, lr0Var.h, this.p3);
        if (lr0Var.B == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (i10 != 4096) {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (C1 = C1()) != null && C1.canScrollVertically(-1) && C1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        View C12 = C1();
        if (C12 != null && C12.canScrollVertically(1) && C12.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override // org.telegram.ui.Components.gu0
    public final void y1(org.telegram.ui.Cells.p7 p7Var) {
        int messageId = p7Var.getMessageId();
        lr0 lr0Var = this.o3;
        if (messageId != lr0Var.F || !p7Var.c.hasBitmapImage()) {
            p7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!lr0Var.G) {
            lr0Var.H = 0.0f;
            lr0Var.G = true;
        }
        float f9 = lr0Var.H;
        p7Var.setHighlightProgress(f9 < 0.3f ? f9 / 0.3f : f9 > 0.7f ? (1.0f - f9) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.gu0
    public final boolean z1() {
        return this.q3.k1;
    }
}
