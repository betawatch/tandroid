package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.Cells.v9 E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public ab.q J;
    public float K;
    public boolean L;
    public org.telegram.ui.Components.voip.n M;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public bi.o2 f;
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
        int i7 = this.y;
        int i10 = org.telegram.ui.ActionBar.j6.Mj;
        if (i7 != org.telegram.ui.ActionBar.j6.x0(null, i10, false)) {
            this.y = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(this.y, org.telegram.messenger.ns.L1)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
        org.telegram.ui.ActionBar.q6.U(this.E.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, this.x, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.q qVar = this.J;
        if (qVar != null) {
            qVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) qVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ab.q qVar = this.J;
        if (qVar != null) {
            qVar.a = false;
            ((AnimatorSet) qVar.c).cancel();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            if (this.f == null || this.h == null || this.y == org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false)) {
                return;
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
