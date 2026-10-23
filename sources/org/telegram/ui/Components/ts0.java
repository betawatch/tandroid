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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ts0 extends kv0 {
    public float o3;
    public float p3;
    public final /* synthetic */ qs0 q3;
    public final /* synthetic */ rs0 r3;
    public final /* synthetic */ uv0 s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(uv0 uv0Var, Context context, qs0 qs0Var, rs0 rs0Var) {
        super(context);
        this.s3 = uv0Var;
        this.q3 = qs0Var;
        this.r3 = rs0Var;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean A1() {
        return this.s3.o1;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean B1() {
        return uv0.q0(this.s3.p1);
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean C1() {
        return this == this.q3.h;
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

    @Override // org.telegram.ui.Components.jm0
    public final Integer W0(int i10) {
        s4.g0 adapter = getAdapter();
        du0 du0Var = this.s3.Q;
        if (adapter == du0Var && du0Var.e > 0 && i10 == du0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.kv0, org.telegram.ui.Components.ia, org.telegram.ui.Components.jm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.g0 adapter = getAdapter();
        uv0 uv0Var = this.s3;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
        cu0 cu0Var = uv0Var.c0;
        is0 is0Var = uv0Var.e0;
        qs0 qs0Var = this.q3;
        if ((adapter == is0Var || getAdapter() == cu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (uv0Var.o1) {
                if (uv0Var.p1 == (getAdapter() == cu0Var ? 8 : 9) && qs0Var.r.getChildCount() > 0 && (childAt2 = qs0Var.r.getChildAt(0)) != null) {
                    qs0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), uv0Var.n1);
                    }
                }
            }
            if (getAdapter() != cu0Var) {
                if (this.h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.h3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, this.n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.i3 = new StaticLayout(LocaleController.getString(uv0Var.r0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-uv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.k3 = measuredWidth;
                    for (int i10 = 0; i10 < this.i3.getLineCount(); i10++) {
                        this.j3 = Math.max(this.j3, this.i3.getLineWidth(i10));
                        this.k3 = Math.min(this.k3, this.i3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.k3, top - ((this.i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (qs0Var.K) {
            float f7 = qs0Var.L + 0.010666667f;
            qs0Var.L = f7;
            if (f7 >= 1.0f) {
                qs0Var.L = 0.0f;
                qs0Var.K = false;
                qs0Var.J = 0;
            }
            invalidate();
        }
        if (this.l3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ci.ia[] iaVarArr = ci.ia.f;
            if (iaVarArr[currentAccount] == null) {
                iaVarArr[currentAccount] = new ci.ia(currentAccount);
            }
            this.l3 = iaVarArr[currentAccount];
        }
        this.l3.a(this);
        if (uv0Var.o1) {
            return;
        }
        uv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.jm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        uv0 uv0Var = this.s3;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.o3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            uv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.p3 - this.o3;
            uv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.p3 = this.o3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kv0
    public final int getAnimateToColumnsCount() {
        return this.s3.q1;
    }

    @Override // org.telegram.ui.Components.kv0
    public final float getChangeColumnsProgress() {
        return this.s3.n1;
    }

    @Override // org.telegram.ui.Components.kv0
    public final int getColumnsCount() {
        uv0 uv0Var = this.s3;
        return uv0.q0(uv0Var.p1) ? uv0Var.m1[1] : uv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.kv0
    public final SparseArray getMessageAlphaEnter() {
        return this.s3.O1;
    }

    @Override // org.telegram.ui.Components.kv0
    public final rl0 getMovingAdapter() {
        uv0 uv0Var = this.s3;
        return uv0.q0(uv0Var.p1) ? uv0Var.m1(uv0Var.p1) : uv0Var.H;
    }

    @Override // org.telegram.ui.Components.kv0
    public final rl0 getSupportingAdapter() {
        uv0 uv0Var = this.s3;
        return uv0.q0(uv0Var.p1) ? uv0Var.n1(uv0Var.p1) : uv0Var.I;
    }

    @Override // org.telegram.ui.Components.kv0
    public final mu0 getSupportingListView() {
        return this.q3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.I1;
        uv0 uv0Var = this.s3;
        if (z10 && uv0Var.getSelectedTab() == 11 && (n2Var = uv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        uv0Var.I();
        s4.g0 adapter = getAdapter();
        bv0 bv0Var = uv0Var.N;
        if (adapter == bv0Var) {
            ArrayList<MessageObject> arrayList = bv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(bv0Var.d).addToPollsQueue(bv0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qs0 qs0Var = this.q3;
        this.s3.G(qs0Var, qs0Var.h, this.r3);
        if (qs0Var.F == 0) {
            PhotoViewer.u1().z0();
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

    @Override // org.telegram.ui.Components.kv0
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        int messageId = s7Var.getMessageId();
        qs0 qs0Var = this.q3;
        if (messageId != qs0Var.J || !s7Var.c.hasBitmapImage()) {
            s7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!qs0Var.K) {
            qs0Var.L = 0.0f;
            qs0Var.K = true;
        }
        float f7 = qs0Var.L;
        s7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }
}
