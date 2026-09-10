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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gs0 extends yu0 {
    public float q3;
    public float r3;
    public final /* synthetic */ ds0 s3;
    public final /* synthetic */ es0 t3;
    public final /* synthetic */ iv0 u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(iv0 iv0Var, Context context, ds0 ds0Var, es0 es0Var) {
        super(context);
        this.u3 = iv0Var;
        this.s3 = ds0Var;
        this.t3 = es0Var;
    }

    @Override // org.telegram.ui.Components.yu0
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
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final Integer V0(int i10) {
        s4.h0 adapter = getAdapter();
        qt0 qt0Var = this.u3.Q;
        if (adapter == qt0Var && qt0Var.e > 0 && i10 == qt0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.ha, org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        s4.h0 adapter = getAdapter();
        iv0 iv0Var = this.u3;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        pt0 pt0Var = iv0Var.c0;
        ur0 ur0Var = iv0Var.e0;
        ds0 ds0Var = this.s3;
        if ((adapter == ur0Var || getAdapter() == pt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (iv0Var.o1) {
                if (iv0Var.p1 == (getAdapter() == pt0Var ? 8 : 9) && ds0Var.r.getChildCount() > 0 && (childAt2 = ds0Var.r.getChildAt(0)) != null) {
                    ds0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), iv0Var.n1);
                    }
                }
            }
            if (getAdapter() != pt0Var) {
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.k3 = new StaticLayout(LocaleController.getString(iv0Var.q0() ? p2Var != null && ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-iv0Var.j1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        if (ds0Var.K) {
            float f7 = ds0Var.L + 0.010666667f;
            ds0Var.L = f7;
            if (f7 >= 1.0f) {
                ds0Var.L = 0.0f;
                ds0Var.K = false;
                ds0Var.J = 0;
            }
            invalidate();
        }
        if (this.n3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            zh.c8[] c8VarArr = zh.c8.f;
            if (c8VarArr[currentAccount] == null) {
                c8VarArr[currentAccount] = new zh.c8(currentAccount);
            }
            this.n3 = c8VarArr[currentAccount];
        }
        this.n3.a(this);
        if (iv0Var.o1) {
            return;
        }
        iv0Var.p1 = -1;
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iv0 iv0Var = this.u3;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        if (p2Var == null || !p2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.q3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            iv0Var.v1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.r3 - this.q3;
            iv0Var.v1.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.r3 = this.q3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getAnimateToColumnsCount() {
        return this.u3.q1;
    }

    @Override // org.telegram.ui.Components.yu0
    public final float getChangeColumnsProgress() {
        return this.u3.n1;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getColumnsCount() {
        iv0 iv0Var = this.u3;
        return iv0.p0(iv0Var.p1) ? iv0Var.m1[1] : iv0Var.m1[0];
    }

    @Override // org.telegram.ui.Components.yu0
    public final SparseArray getMessageAlphaEnter() {
        return this.u3.O1;
    }

    @Override // org.telegram.ui.Components.yu0
    public final dl0 getMovingAdapter() {
        iv0 iv0Var = this.u3;
        return iv0.p0(iv0Var.p1) ? iv0Var.k1(iv0Var.p1) : iv0Var.H;
    }

    @Override // org.telegram.ui.Components.yu0
    public final dl0 getSupportingAdapter() {
        iv0 iv0Var = this.u3;
        return iv0.p0(iv0Var.p1) ? iv0Var.l1(iv0Var.p1) : iv0Var.I;
    }

    @Override // org.telegram.ui.Components.yu0
    public final zt0 getSupportingListView() {
        return this.s3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z10 = this.K1;
        iv0 iv0Var = this.u3;
        if (z10 && iv0Var.getSelectedTab() == 11 && (p2Var = iv0Var.v1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        iv0Var.I();
        s4.h0 adapter = getAdapter();
        ou0 ou0Var = iv0Var.N;
        if (adapter == ou0Var) {
            ArrayList<MessageObject> arrayList = ou0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ou0Var.d).addToPollsQueue(ou0Var.s.j1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ds0 ds0Var = this.s3;
        this.u3.G(ds0Var, ds0Var.h, this.t3);
        if (ds0Var.F == 0) {
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

    @Override // org.telegram.ui.Components.yu0
    public final void x1(org.telegram.ui.Cells.u7 u7Var) {
        int messageId = u7Var.getMessageId();
        ds0 ds0Var = this.s3;
        if (messageId != ds0Var.J || !u7Var.c.hasBitmapImage()) {
            u7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ds0Var.K) {
            ds0Var.L = 0.0f;
            ds0Var.K = true;
        }
        float f7 = ds0Var.L;
        u7Var.setHighlightProgress(f7 < 0.3f ? f7 / 0.3f : f7 > 0.7f ? (1.0f - f7) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean y1() {
        return this.u3.o1;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean z1() {
        return iv0.p0(this.u3.p1);
    }
}
