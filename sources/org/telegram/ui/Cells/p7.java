package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public m7[] a;
    public ij[] b;
    public int[] c;
    public n7 d;
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

    public final void b(int i7, boolean z9, boolean z10) {
        m7 m7Var = this.a[i7];
        FrameLayout frameLayout = m7Var.f;
        wo woVar = m7Var.e;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, true);
        AnimatorSet animatorSet = m7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            m7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        m7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z9 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z9 ? 0.81f : 1.0f));
        m7Var.h.setDuration(200L);
        m7Var.h.addListener(new m.a(m7Var, 27));
        m7Var.h.start();
    }

    public final void c(int i7, int i10, ij ijVar) {
        m7[] m7VarArr = this.a;
        ij[] ijVarArr = this.b;
        ijVarArr[i7] = ijVar;
        this.c[i7] = i10;
        if (ijVar != null) {
            m7VarArr[i7].setVisibility(0);
            m7VarArr[i7].setMessageObject(ijVar);
        } else {
            m7VarArr[i7].clearAnimation();
            m7VarArr[i7].setVisibility(4);
            ijVarArr[i7] = null;
        }
    }

    public n7 getDelegate() {
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
        int A = this.r == 1 ? org.telegram.messenger.camera.q.A(2.0f, this.e - 1, View.MeasureSpec.getSize(i7)) / this.e : a(this.e);
        this.h = true;
        for (int i11 = 0; i11 < this.e; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : org.telegram.messenger.g0.L(2.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(2.0f) + A) * i11;
            if (i11 != this.e - 1) {
                layoutParams.width = A;
            } else if (org.telegram.messenger.g0.Q1()) {
                layoutParams.width = org.telegram.messenger.g0.L(490.0f) - ((org.telegram.messenger.g0.L(2.0f) + A) * (this.e - 1));
            } else {
                layoutParams.width = org.telegram.messenger.g0.q.x - ((org.telegram.messenger.g0.L(2.0f) + A) * (this.e - 1));
            }
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : org.telegram.messenger.g0.L(2.0f)) + A, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(n7 n7Var) {
        this.d = n7Var;
    }

    public void setIsFirst(boolean z9) {
        this.f = z9;
    }

    public void setItemsCount(int i7) {
        m7[] m7VarArr = this.a;
        int i10 = 0;
        while (i10 < m7VarArr.length) {
            m7VarArr[i10].clearAnimation();
            m7VarArr[i10].setVisibility(i10 < i7 ? 0 : 4);
            i10++;
        }
        this.e = i7;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
