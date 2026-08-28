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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dr0 extends ut0 {
    public float m3;
    public float n3;
    public final /* synthetic */ ar0 o3;
    public final /* synthetic */ br0 p3;
    public final /* synthetic */ eu0 q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(eu0 eu0Var, Context context, ar0 ar0Var, br0 br0Var) {
        super(context);
        this.q3 = eu0Var;
        this.o3 = ar0Var;
        this.p3 = br0Var;
    }

    @Override // org.telegram.ui.Components.ut0
    public final boolean A1() {
        return eu0.p0(this.q3.l1);
    }

    @Override // org.telegram.ui.Components.ut0
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

    @Override // org.telegram.ui.Components.wk0
    public final Integer W0(int i9) {
        f2.r0 adapter = getAdapter();
        ns0 ns0Var = this.q3.M;
        if (adapter == ns0Var && ns0Var.e > 0 && i9 == ns0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i9);
    }

    @Override // org.telegram.ui.Components.ut0, org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        f2.r0 adapter = getAdapter();
        eu0 eu0Var = this.q3;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        ms0 ms0Var = eu0Var.V;
        tq0 tq0Var = eu0Var.a0;
        ar0 ar0Var = this.o3;
        if ((adapter == tq0Var || getAdapter() == ms0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (eu0Var.k1) {
                if (eu0Var.l1 == (getAdapter() == ms0Var ? 8 : 9) && ar0Var.r.getChildCount() > 0 && (childAt2 = ar0Var.r.getChildAt(0)) != null) {
                    ar0Var.r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), eu0Var.j1);
                    }
                }
            }
            if (getAdapter() != ms0Var) {
                if (this.f3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, this.l2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.g3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.g3 = new StaticLayout(LocaleController.getString(eu0Var.q0() ? o2Var != null && ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-eu0Var.f1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.f3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.h3 = 0.0f;
                    this.i3 = measuredWidth;
                    for (int i9 = 0; i9 < this.g3.getLineCount(); i9++) {
                        this.h3 = Math.max(this.h3, this.g3.getLineWidth(i9));
                        this.i3 = Math.min(this.i3, this.g3.getLineLeft(i9));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.h3) / 2.0f) - this.i3, top - ((this.g3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.g3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ar0Var.G) {
            float f10 = ar0Var.H + 0.010666667f;
            ar0Var.H = f10;
            if (f10 >= 1.0f) {
                ar0Var.H = 0.0f;
                ar0Var.G = false;
                ar0Var.F = 0;
            }
            invalidate();
        }
        if (this.j3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ih.u9[] u9VarArr = ih.u9.f;
            if (u9VarArr[currentAccount] == null) {
                u9VarArr[currentAccount] = new ih.u9(currentAccount);
            }
            this.j3 = u9VarArr[currentAccount];
        }
        this.j3.a(this);
        if (eu0Var.k1) {
            return;
        }
        eu0Var.l1 = -1;
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eu0 eu0Var = this.q3;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (o2Var == null || !o2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.m3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            eu0Var.r1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.n3 - this.m3;
            eu0Var.r1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.n3 = this.m3;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ut0
    public final int getAnimateToColumnsCount() {
        return this.q3.m1;
    }

    @Override // org.telegram.ui.Components.ut0
    public final float getChangeColumnsProgress() {
        return this.q3.j1;
    }

    @Override // org.telegram.ui.Components.ut0
    public final int getColumnsCount() {
        eu0 eu0Var = this.q3;
        return eu0.p0(eu0Var.l1) ? eu0Var.i1[1] : eu0Var.i1[0];
    }

    @Override // org.telegram.ui.Components.ut0
    public final SparseArray getMessageAlphaEnter() {
        return this.q3.K1;
    }

    @Override // org.telegram.ui.Components.ut0
    public final gk0 getMovingAdapter() {
        eu0 eu0Var = this.q3;
        return eu0.p0(eu0Var.l1) ? eu0Var.k1(eu0Var.l1) : eu0Var.D;
    }

    @Override // org.telegram.ui.Components.ut0
    public final gk0 getSupportingAdapter() {
        eu0 eu0Var = this.q3;
        return eu0.p0(eu0Var.l1) ? eu0Var.l1(eu0Var.l1) : eu0Var.E;
    }

    @Override // org.telegram.ui.Components.ut0
    public final ws0 getSupportingListView() {
        return this.o3.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.G1;
        eu0 eu0Var = this.q3;
        if (z10 && eu0Var.getSelectedTab() == 11 && (o2Var = eu0Var.r1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        eu0Var.I();
        f2.r0 adapter = getAdapter();
        lt0 lt0Var = eu0Var.J;
        if (adapter == lt0Var) {
            ArrayList<MessageObject> arrayList = lt0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(lt0Var.d).addToPollsQueue(lt0Var.s.f1, arrayList);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ar0 ar0Var = this.o3;
        this.q3.G(ar0Var, ar0Var.h, this.p3);
        if (ar0Var.B == 0) {
            PhotoViewer.t1().x0();
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (i9 != 4096) {
            if (i9 == 8192) {
                if (!canScrollVertically(-1) && (C1 = C1()) != null && C1.canScrollVertically(-1) && C1.performAccessibilityAction(i9, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i9, bundle);
        }
        View C12 = C1();
        if (C12 != null && C12.canScrollVertically(1) && C12.performAccessibilityAction(i9, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    @Override // org.telegram.ui.Components.ut0
    public final void y1(org.telegram.ui.Cells.r7 r7Var) {
        int messageId = r7Var.getMessageId();
        ar0 ar0Var = this.o3;
        if (messageId != ar0Var.F || !r7Var.c.hasBitmapImage()) {
            r7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!ar0Var.G) {
            ar0Var.H = 0.0f;
            ar0Var.G = true;
        }
        float f10 = ar0Var.H;
        r7Var.setHighlightProgress(f10 < 0.3f ? f10 / 0.3f : f10 > 0.7f ? (1.0f - f10) / 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.Components.ut0
    public final boolean z1() {
        return this.q3.k1;
    }
}
