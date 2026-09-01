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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xr0 extends pu0 {
    public float n3;
    public float o3;
    public final /* synthetic */ ur0 p3;
    public final /* synthetic */ vr0 q3;
    public final /* synthetic */ zu0 r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(zu0 zu0Var, Context context, ur0 ur0Var, vr0 vr0Var) {
        super(context);
        this.r3 = zu0Var;
        this.p3 = ur0Var;
        this.q3 = vr0Var;
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean A1() {
        return zu0.p0(this.r3.m1);
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean B1() {
        return this == this.p3.h;
    }

    public final View C1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final Integer W0(int i10) {
        f2.p0 adapter = getAdapter();
        ht0 ht0Var = this.r3.N;
        if (adapter == ht0Var && ht0Var.e > 0 && i10 == ht0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override // org.telegram.ui.Components.pu0, org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        f2.p0 adapter = getAdapter();
        zu0 zu0Var = this.r3;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
        gt0 gt0Var = zu0Var.W;
        nr0 nr0Var = zu0Var.b0;
        ur0 ur0Var = this.p3;
        if ((adapter == nr0Var || getAdapter() == gt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zu0Var.l1) {
                if (zu0Var.m1 == (getAdapter() == gt0Var ? 8 : 9) && ur0Var.r.getChildCount() > 0 && (childAt2 = ur0Var.r.getChildAt(0)) != null) {
                    ur0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), zu0Var.k1);
                    }
                }
            }
            if (getAdapter() != gt0Var) {
                if (this.g3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.g3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.g3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, this.m2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.h3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.h3 = new StaticLayout(LocaleController.getString(zu0Var.q0() ? p2Var != null && ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-zu0Var.g1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.g3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (ur0Var.H) {
            float f10 = ur0Var.I + 0.010666667f;
            ur0Var.I = f10;
            if (f10 >= 1.0f) {
                ur0Var.I = 0.0f;
                ur0Var.H = false;
                ur0Var.G = 0;
            }
            invalidate();
        }
        if (this.k3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            oh.q9[] q9VarArr = oh.q9.f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new oh.q9(currentAccount);
            }
            this.k3 = q9VarArr[currentAccount];
        }
        this.k3.a(this);
        if (zu0Var.l1) {
            return;
        }
        zu0Var.m1 = -1;
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zu0 zu0Var = this.r3;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
        if (p2Var == null || !p2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.n3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            zu0Var.s1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.o3 - this.n3;
            zu0Var.s1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.o3 = this.n3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getAnimateToColumnsCount() {
        return this.r3.n1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final float getChangeColumnsProgress() {
        return this.r3.k1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final int getColumnsCount() {
        zu0 zu0Var = this.r3;
        return zu0.p0(zu0Var.m1) ? zu0Var.j1[1] : zu0Var.j1[0];
    }

    @Override // org.telegram.ui.Components.pu0
    public final SparseArray getMessageAlphaEnter() {
        return this.r3.L1;
    }

    @Override // org.telegram.ui.Components.pu0
    public final dl0 getMovingAdapter() {
        zu0 zu0Var = this.r3;
        return zu0.p0(zu0Var.m1) ? zu0Var.k1(zu0Var.m1) : zu0Var.E;
    }

    @Override // org.telegram.ui.Components.pu0
    public final dl0 getSupportingAdapter() {
        zu0 zu0Var = this.r3;
        return zu0.p0(zu0Var.m1) ? zu0Var.l1(zu0Var.m1) : zu0Var.F;
    }

    @Override // org.telegram.ui.Components.pu0
    public final qt0 getSupportingListView() {
        return this.p3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z4 = this.H1;
        zu0 zu0Var = this.r3;
        if (z4 && zu0Var.getSelectedTab() == 11 && (p2Var = zu0Var.s1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        zu0Var.I();
        f2.p0 adapter = getAdapter();
        fu0 fu0Var = zu0Var.K;
        if (adapter == fu0Var) {
            ArrayList<MessageObject> arrayList = fu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(fu0Var.d).addToPollsQueue(fu0Var.s.g1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ur0 ur0Var = this.p3;
        this.r3.G(ur0Var, ur0Var.h, this.q3);
        if (ur0Var.C == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e6) {
            FileLog.e(e6);
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

    @Override // org.telegram.ui.Components.pu0
    public final void y1(org.telegram.ui.Cells.r7 r7Var) {
        int messageId = r7Var.getMessageId();
        ur0 ur0Var = this.p3;
        if (messageId != ur0Var.G || !r7Var.c.hasBitmapImage()) {
            r7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ur0Var.H) {
            ur0Var.I = 0.0f;
            ur0Var.H = true;
        }
        float f10 = ur0Var.I;
        r7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.pu0
    public final boolean z1() {
        return this.r3.l1;
    }
}
