package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public q7[] a;
    public jj[] b;
    public int[] c;
    public r7 d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public int r;
    public int s;

    public static int a(int i10) {
        if (org.telegram.messenger.i0.Q1()) {
            return (org.telegram.messenger.i0.L(490.0f) - (org.telegram.messenger.i0.L(2.0f) * (i10 - 1))) / i10;
        }
        return (org.telegram.messenger.i0.q.x - (org.telegram.messenger.i0.L(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        q7 q7Var = this.a[i10];
        FrameLayout frameLayout = q7Var.f;
        ep epVar = q7Var.e;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, true);
        AnimatorSet animatorSet = q7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            q7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        q7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        q7Var.h.setDuration(200L);
        q7Var.h.addListener(new org.telegram.ui.s9(q7Var, 8));
        q7Var.h.start();
    }

    public final void c(int i10, int i11, jj jjVar) {
        q7[] q7VarArr = this.a;
        jj[] jjVarArr = this.b;
        jjVarArr[i10] = jjVar;
        this.c[i10] = i11;
        if (jjVar != null) {
            q7VarArr[i10].setVisibility(0);
            q7VarArr[i10].setMessageObject(jjVar);
        } else {
            q7VarArr[i10].clearAnimation();
            q7VarArr[i10].setVisibility(4);
            jjVarArr[i10] = null;
        }
    }

    public r7 getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.a[i10].invalidate();
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int A = this.r == 1 ? z20.A(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e : a(this.e);
        this.h = true;
        for (int i12 = 0; i12 < this.e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : org.telegram.messenger.i0.L(2.0f);
            layoutParams.leftMargin = (org.telegram.messenger.i0.L(2.0f) + A) * i12;
            if (i12 != this.e - 1) {
                layoutParams.width = A;
            } else if (org.telegram.messenger.i0.Q1()) {
                layoutParams.width = org.telegram.messenger.i0.L(490.0f) - ((org.telegram.messenger.i0.L(2.0f) + A) * (this.e - 1));
            } else {
                layoutParams.width = org.telegram.messenger.i0.q.x - ((org.telegram.messenger.i0.L(2.0f) + A) * (this.e - 1));
            }
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : org.telegram.messenger.i0.L(2.0f)) + A, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(r7 r7Var) {
        this.d = r7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i10) {
        q7[] q7VarArr = this.a;
        int i11 = 0;
        while (i11 < q7VarArr.length) {
            q7VarArr[i11].clearAnimation();
            q7VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
            i11++;
        }
        this.e = i10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
