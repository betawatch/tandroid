// default package

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jga extends uia {
    public float v3;
    public float w3;
    public final /* synthetic */ gga x3;
    public final /* synthetic */ hga y3;
    public final /* synthetic */ eja z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jga(eja ejaVar, Context context, vnb vnbVar, gga ggaVar, hga hgaVar) {
        super(context, vnbVar);
        this.z3 = ejaVar;
        this.x3 = ggaVar;
        this.y3 = hgaVar;
    }

    @Override // uia
    public final void A1(jja jjaVar) {
        int messageId = jjaVar.getMessageId();
        gga ggaVar = this.x3;
        if (messageId != ggaVar.J || !jjaVar.c.B()) {
            jjaVar.setHighlightProgress(0.0f);
            return;
        }
        if (!ggaVar.K) {
            ggaVar.L = 0.0f;
            ggaVar.K = true;
        }
        float f = ggaVar.L;
        jjaVar.setHighlightProgress(f < 0.3f ? f / 0.3f : f > 0.7f ? (1.0f - f) / 0.3f : 1.0f);
    }

    @Override // uia
    public final boolean B1() {
        return this.z3.r1;
    }

    @Override // uia
    public final boolean C1() {
        return eja.j0(this.z3.s1);
    }

    @Override // uia
    public final boolean D1() {
        return this == this.x3.h;
    }

    public final View E1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    @Override // d79
    public final Integer X0(int i) {
        j79 adapter = getAdapter();
        qha qhaVar = this.z3.T;
        if (adapter == qhaVar && qhaVar.e > 0 && i == qhaVar.d.size() - 1) {
            return 0;
        }
        return super.X0(i);
    }

    @Override // uia, d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        j79 adapter = getAdapter();
        eja ejaVar = this.z3;
        e eVar = ejaVar.y1;
        oha ohaVar = ejaVar.f0;
        aga agaVar = ejaVar.h0;
        gga ggaVar = this.x3;
        if ((adapter == agaVar || getAdapter() == ohaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (ejaVar.r1) {
                if (ejaVar.s1 == (getAdapter() == ohaVar ? 8 : 9) && ggaVar.n.getChildCount() > 0 && (childAt2 = ggaVar.n.getChildAt(0)) != null) {
                    ggaVar.n.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = hl.U1(ejaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ohaVar && getMeasuredWidth() > hl.L(60.0f)) {
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(hl.L(14.0f));
                    this.o3.setColor(aob.v0(aob.z6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - hl.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.p3 = new StaticLayout(ob6.M0(ejaVar.k0() ? eVar != null && xc2.V(eVar.getMessagesController().M0(Long.valueOf(-ejaVar.m1))) ? 2131746360 : 2131746356 : 2131746355, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i = 0; i < this.p3.getLineCount(); i++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i));
                    }
                }
                canvas.save();
                uh9.n(this.p3.getHeight() + hl.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ggaVar.K) {
            float f = ggaVar.L + 0.010666667f;
            ggaVar.L = f;
            if (f >= 1.0f) {
                ggaVar.L = 0.0f;
                ggaVar.K = false;
                ggaVar.J = 0;
            }
            invalidate();
        }
        ibc ibcVar = this.s3;
        if (ibcVar == null) {
            int currentAccount = eVar.getCurrentAccount();
            ibc[] ibcVarArr = ibc.f;
            if (ibcVarArr[currentAccount] == null) {
                ibcVarArr[currentAccount] = new ibc(currentAccount);
            }
            ibcVar = ibcVarArr[currentAccount];
            this.s3 = ibcVar;
        }
        ibcVar.a(this);
        if (ejaVar.r1) {
            return;
        }
        ejaVar.s1 = -1;
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e eVar = this.z3.y1;
        if (eVar == null || !eVar.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.v3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            eVar.finishPreviewFragment();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            float f = this.w3 - this.v3;
            eVar.movePreviewFragment(f);
            if (f < 0.0f) {
                this.w3 = this.v3;
            }
        }
        return true;
    }

    @Override // uia
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override // uia
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override // uia
    public final int getColumnsCount() {
        eja ejaVar = this.z3;
        boolean j0 = eja.j0(ejaVar.s1);
        int[] iArr = ejaVar.p1;
        return j0 ? iArr[1] : iArr[0];
    }

    @Override // uia
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override // uia
    public final l69 getMovingAdapter() {
        eja ejaVar = this.z3;
        return eja.j0(ejaVar.s1) ? ejaVar.v1(ejaVar.s1) : ejaVar.K;
    }

    @Override // uia
    public final l69 getSupportingAdapter() {
        eja ejaVar = this.z3;
        return eja.j0(ejaVar.s1) ? ejaVar.w1(ejaVar.s1) : ejaVar.L;
    }

    @Override // uia
    public final yha getSupportingListView() {
        return this.x3.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        e eVar;
        boolean z = this.J1;
        eja ejaVar = this.z3;
        if (z && ejaVar.getSelectedTab() == 11 && (eVar = ejaVar.y1) != null) {
            hl.t1(eVar.getParentActivity().getCurrentFocus());
        }
        ejaVar.C();
        j79 adapter = getAdapter();
        nia niaVar = ejaVar.Q;
        if (adapter == niaVar) {
            ArrayList arrayList = niaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof wb2) {
                    arrayList.add(((wb2) childAt).getMessageObject());
                }
            }
            uc7.s1(niaVar.d).i(arrayList, niaVar.s.m1);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gga ggaVar = this.x3;
        this.z3.z(ggaVar, ggaVar.h, this.y3);
        if (ggaVar.F == 0) {
            PhotoViewer.q0().r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.performAccessibilityAction(r4, r5) != false) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        try {
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (i == 4096) {
            View E1 = E1();
            if (E1 != null && E1.canScrollVertically(1) && E1.performAccessibilityAction(i, bundle)) {
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (i == 8192) {
            if (!canScrollVertically(-1)) {
                View E12 = E1();
                if (E12 != null) {
                    if (E12.canScrollVertically(-1)) {
                    }
                }
            }
        }
        return super.performAccessibilityAction(i, bundle);
        return true;
    }
}
