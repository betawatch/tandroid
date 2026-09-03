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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wr0 extends ou0 {
    public float n3;
    public float o3;
    public final /* synthetic */ tr0 p3;
    public final /* synthetic */ ur0 q3;
    public final /* synthetic */ yu0 r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(yu0 yu0Var, Context context, tr0 tr0Var, ur0 ur0Var) {
        super(context);
        this.r3 = yu0Var;
        this.p3 = tr0Var;
        this.q3 = ur0Var;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean A1() {
        return this == this.p3.h;
    }

    public final View B1() {
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

    @Override // org.telegram.ui.Components.rl0
    public final Integer V0(int i10) {
        f2.o0 adapter = getAdapter();
        gt0 gt0Var = this.r3.N;
        if (adapter == gt0Var && gt0Var.e > 0 && i10 == gt0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override // org.telegram.ui.Components.ou0, org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        f2.o0 adapter = getAdapter();
        yu0 yu0Var = this.r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        ft0 ft0Var = yu0Var.W;
        mr0 mr0Var = yu0Var.b0;
        tr0 tr0Var = this.p3;
        if ((adapter == mr0Var || getAdapter() == ft0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (yu0Var.l1) {
                if (yu0Var.m1 == (getAdapter() == ft0Var ? 8 : 9) && tr0Var.r.getChildCount() > 0 && (childAt2 = tr0Var.r.getChildAt(0)) != null) {
                    tr0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), yu0Var.k1);
                    }
                }
            }
            if (getAdapter() != ft0Var) {
                if (this.g3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.g3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.m2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.h3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.h3 = new StaticLayout(LocaleController.getString(yu0Var.q0() ? p2Var != null && ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.g1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.g3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.i3 = 0.0f;
                    this.j3 = measuredWidth;
                    for (int i10 = 0; i10 < this.h3.getLineCount(); i10++) {
                        this.i3 = Math.max(this.i3, this.h3.getLineWidth(i10));
                        this.j3 = Math.min(this.j3, this.h3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.i3) / 2.0f) - this.j3, top - ((this.h3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.h3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (tr0Var.H) {
            float f10 = tr0Var.I + 0.010666667f;
            tr0Var.I = f10;
            if (f10 >= 1.0f) {
                tr0Var.I = 0.0f;
                tr0Var.H = false;
                tr0Var.G = 0;
            }
            invalidate();
        }
        if (this.k3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            nh.q9[] q9VarArr = nh.q9.f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new nh.q9(currentAccount);
            }
            this.k3 = q9VarArr[currentAccount];
        }
        this.k3.a(this);
        if (yu0Var.l1) {
            return;
        }
        yu0Var.m1 = -1;
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yu0 yu0Var = this.r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (p2Var == null || !p2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.n3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            yu0Var.s1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.o3 - this.n3;
            yu0Var.s1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.o3 = this.n3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getAnimateToColumnsCount() {
        return this.r3.n1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final float getChangeColumnsProgress() {
        return this.r3.k1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getColumnsCount() {
        yu0 yu0Var = this.r3;
        return yu0.p0(yu0Var.m1) ? yu0Var.j1[1] : yu0Var.j1[0];
    }

    @Override // org.telegram.ui.Components.ou0
    public final SparseArray getMessageAlphaEnter() {
        return this.r3.L1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final bl0 getMovingAdapter() {
        yu0 yu0Var = this.r3;
        return yu0.p0(yu0Var.m1) ? yu0Var.k1(yu0Var.m1) : yu0Var.E;
    }

    @Override // org.telegram.ui.Components.ou0
    public final bl0 getSupportingAdapter() {
        yu0 yu0Var = this.r3;
        return yu0.p0(yu0Var.m1) ? yu0Var.l1(yu0Var.m1) : yu0Var.F;
    }

    @Override // org.telegram.ui.Components.ou0
    public final pt0 getSupportingListView() {
        return this.p3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z4 = this.H1;
        yu0 yu0Var = this.r3;
        if (z4 && yu0Var.getSelectedTab() == 11 && (p2Var = yu0Var.s1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        yu0Var.I();
        f2.o0 adapter = getAdapter();
        eu0 eu0Var = yu0Var.K;
        if (adapter == eu0Var) {
            ArrayList<MessageObject> arrayList = eu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(eu0Var.d).addToPollsQueue(eu0Var.s.g1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        tr0 tr0Var = this.p3;
        this.r3.G(tr0Var, tr0Var.h, this.q3);
        if (tr0Var.C == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View B1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
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

    @Override // org.telegram.ui.Components.ou0
    public final void x1(org.telegram.ui.Cells.q7 q7Var) {
        int messageId = q7Var.getMessageId();
        tr0 tr0Var = this.p3;
        if (messageId != tr0Var.G || !q7Var.c.hasBitmapImage()) {
            q7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!tr0Var.H) {
            tr0Var.I = 0.0f;
            tr0Var.H = true;
        }
        float f10 = tr0Var.I;
        q7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean y1() {
        return this.r3.l1;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean z1() {
        return yu0.p0(this.r3.m1);
    }
}
