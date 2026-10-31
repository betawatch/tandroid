package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lx0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.Cells.x9 D;
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public ac.a I;
    public float J;
    public boolean K;
    public org.telegram.ui.Components.voip.g L;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public bi.t0 f;
    public TextView h;
    public TextView n;
    public TextView r;
    public TextView s;
    public TextView w;
    public View x;
    public int y;

    @Override // android.view.View
    public final void invalidate() {
        TextView textView = this.s;
        TextView textView2 = this.r;
        TextView textView3 = this.n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f.invalidate();
        int i10 = this.y;
        int i11 = org.telegram.ui.ActionBar.t6.Jj;
        if (i10 != org.telegram.ui.ActionBar.t6.x0(null, i11, false)) {
            this.y = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(this.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(this.y, org.telegram.messenger.zs.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        }
        org.telegram.ui.ActionBar.a7.V(this.D.getTextView(), org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, this.x, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac.a aVar = this.I;
        if (aVar != null) {
            aVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) aVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac.a aVar = this.I;
        if (aVar != null) {
            aVar.a = false;
            ((AnimatorSet) aVar.c).cancel();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (this.f == null || this.h == null || this.y == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false)) {
                return;
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
