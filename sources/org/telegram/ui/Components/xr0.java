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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xr0 extends ou0 {
    public float q3;
    public float r3;
    public final /* synthetic */ ur0 s3;
    public final /* synthetic */ vr0 t3;
    public final /* synthetic */ yu0 u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(yu0 yu0Var, Context context, ur0 ur0Var, vr0 vr0Var) {
        super(context);
        this.u3 = yu0Var;
        this.s3 = ur0Var;
        this.t3 = vr0Var;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean A1() {
        return yu0.p0(this.u3.p1);
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean B1() {
        return this == this.s3.h;
    }

    public final View C1() {
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
    public final Integer W0(int i10) {
        s4.h0 adapter = getAdapter();
        ht0 ht0Var = this.u3.Q;
        if (adapter == ht0Var && ht0Var.e > 0 && i10 == ht0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.ou0, org.telegram.ui.Components.ia, org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        yu0 yu0Var = this.u3;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        gt0 gt0Var = yu0Var.c0;
        lr0 lr0Var = yu0Var.e0;
        ur0 ur0Var = this.s3;
        if ((adapter == lr0Var || getAdapter() == gt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (yu0Var.o1) {
                if (yu0Var.p1 == (getAdapter() == gt0Var ? 8 : 9) && ur0Var.r.getChildCount() > 0 && (childAt2 = ur0Var.r.getChildAt(0)) != null) {
                    ur0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), yu0Var.n1);
                    }
                }
            }
            if (getAdapter() != gt0Var) {
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.k3 = new StaticLayout(LocaleController.getString(yu0Var.q0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (ur0Var.K) {
            float f7 = ur0Var.L + 0.010666667f;
            ur0Var.L = f7;
            if (f7 >= 1.0f) {
                ur0Var.L = 0.0f;
                ur0Var.K = false;
                ur0Var.J = 0;
            }
            invalidate();
        }
        if (this.n3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.n3 = rcVarArr[currentAccount];
        }
        this.n3.a(this);
        if (yu0Var.o1) {
            return;
        }
        yu0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yu0 yu0Var = this.u3;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.q3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            yu0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.r3 - this.q3;
            yu0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.r3 = this.q3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getAnimateToColumnsCount() {
        return this.u3.q1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final float getChangeColumnsProgress() {
        return this.u3.n1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getColumnsCount() {
        yu0 yu0Var = this.u3;
        return yu0.p0(yu0Var.p1) ? yu0Var.m1[1] : yu0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.ou0
    public final SparseArray getMessageAlphaEnter() {
        return this.u3.O1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final uk0 getMovingAdapter() {
        yu0 yu0Var = this.u3;
        return yu0.p0(yu0Var.p1) ? yu0Var.k1(yu0Var.p1) : yu0Var.H;
    }

    @Override // org.telegram.ui.Components.ou0
    public final uk0 getSupportingAdapter() {
        yu0 yu0Var = this.u3;
        return yu0.p0(yu0Var.p1) ? yu0Var.l1(yu0Var.p1) : yu0Var.I;
    }

    @Override // org.telegram.ui.Components.ou0
    public final qt0 getSupportingListView() {
        return this.s3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        yu0 yu0Var = this.u3;
        if (z10 && yu0Var.getSelectedTab() == 11 && (n2Var = yu0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        yu0Var.I();
        s4.h0 adapter = getAdapter();
        fu0 fu0Var = yu0Var.N;
        if (adapter == fu0Var) {
            ArrayList<MessageObject> arrayList = fu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(fu0Var.d).addToPollsQueue(fu0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ur0 ur0Var = this.s3;
        this.u3.G(ur0Var, ur0Var.h, this.t3);
        if (ur0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
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

    @Override // org.telegram.ui.Components.ou0
    public final void y1(org.telegram.ui.Cells.t7 t7Var) {
        int messageId = t7Var.getMessageId();
        ur0 ur0Var = this.s3;
        if (messageId != ur0Var.J || !t7Var.c.hasBitmapImage()) {
            t7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ur0Var.K) {
            ur0Var.L = 0.0f;
            ur0Var.K = true;
        }
        float f7 = ur0Var.L;
        t7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean z1() {
        return this.u3.o1;
    }
}
