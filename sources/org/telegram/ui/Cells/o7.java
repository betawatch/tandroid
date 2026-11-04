package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public l7[] a;
    public zi[] b;
    public int[] c;
    public m7 d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public int r;
    public int s;

    public static int a(int i3) {
        if (org.telegram.messenger.g0.Q1()) {
            return (org.telegram.messenger.g0.L(490.0f) - (org.telegram.messenger.g0.L(2.0f) * (i3 - 1))) / i3;
        }
        return (org.telegram.messenger.g0.q.x - (org.telegram.messenger.g0.L(2.0f) * (i3 - 1))) / i3;
    }

    public final void b(int i3, boolean z10, boolean z11) {
        l7 l7Var = this.a[i3];
        FrameLayout frameLayout = l7Var.f;
        wo woVar = l7Var.e;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, true);
        AnimatorSet animatorSet = l7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            l7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        l7Var.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z10 ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z10 ? 0.81f : 1.0f));
        l7Var.h.setDuration(200L);
        l7Var.h.addListener(new ii.v3(l7Var, 28));
        l7Var.h.start();
    }

    public final void c(int i3, int i10, zi ziVar) {
        l7[] l7VarArr = this.a;
        zi[] ziVarArr = this.b;
        ziVarArr[i3] = ziVar;
        this.c[i3] = i10;
        if (ziVar != null) {
            l7VarArr[i3].setVisibility(0);
            l7VarArr[i3].setMessageObject(ziVar);
        } else {
            l7VarArr[i3].clearAnimation();
            l7VarArr[i3].setVisibility(4);
            ziVarArr[i3] = null;
        }
    }

    public m7 getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i3 = 0; i3 < 6; i3++) {
            this.a[i3].invalidate();
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
    public final void onMeasure(int i3, int i10) {
        View[] viewArr = this.a;
        int A = this.r == 1 ? org.telegram.messenger.camera.q.A(2.0f, this.e - 1, View.MeasureSpec.getSize(i3)) / this.e : a(this.e);
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
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : org.telegram.messenger.g0.L(2.0f)) + A, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(m7 m7Var) {
        this.d = m7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f = z10;
    }

    public void setItemsCount(int i3) {
        l7[] l7VarArr = this.a;
        int i10 = 0;
        while (i10 < l7VarArr.length) {
            l7VarArr[i10].clearAnimation();
            l7VarArr[i10].setVisibility(i10 < i3 ? 0 : 4);
            i10++;
        }
        this.e = i3;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
