package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.op;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public n7[] a;
    public fj[] b;
    public int[] c;
    public o7 d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public int r;
    public int s;

    public static int a(int i7) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
        }
        return (org.telegram.messenger.g0.q.x - (org.telegram.messenger.g0.L(2.0f) * (i7 - 1))) / i7;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        n7 n7Var = this.a[i7];
        FrameLayout frameLayout = n7Var.f;
        op opVar = n7Var.e;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, true);
        AnimatorSet animatorSet = n7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            n7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        n7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        n7Var.h.setDuration(200L);
        n7Var.h.addListener(new ki.m3(n7Var, 28));
        n7Var.h.start();
    }

    public final void c(int i7, int i10, fj fjVar) {
        n7[] n7VarArr = this.a;
        fj[] fjVarArr = this.b;
        fjVarArr[i7] = fjVar;
        this.c[i7] = i10;
        if (fjVar != null) {
            n7VarArr[i7].setVisibility(0);
            n7VarArr[i7].setMessageObject(fjVar);
        } else {
            n7VarArr[i7].clearAnimation();
            n7VarArr[i7].setVisibility(4);
            fjVarArr[i7] = null;
        }
    }

    public o7 getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i7 = 0; i7 < 6; i7++) {
            this.a[i7].invalidate();
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
    public final void onMeasure(int i7, int i10) {
        View[] viewArr = this.a;
        int B = this.r == 1 ? n10.B(2.0f, this.e - 1, View.MeasureSpec.getSize(i7)) / this.e : a(this.e);
        this.h = true;
        for (int i11 = 0; i11 < this.e; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : org.telegram.messenger.g0.L(2.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + B) * i11;
            if (i11 != this.e - 1) {
                layoutParams.width = B;
            } else if (org.telegram.messenger.g0.Q1()) {
                layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + B) * (this.e - 1));
            } else {
                layoutParams.width = org.telegram.messenger.g0.q.x - ((org.telegram.messenger.g0.L(2.0f) + B) * (this.e - 1));
            }
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : org.telegram.messenger.g0.L(2.0f)) + B, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(o7 o7Var) {
        this.d = o7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i7) {
        n7[] n7VarArr = this.a;
        int i10 = 0;
        while (i10 < n7VarArr.length) {
            n7VarArr[i10].clearAnimation();
            n7VarArr[i10].setVisibility(i10 < i7 ? 0 : 4);
            i10++;
        }
        this.e = i7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
