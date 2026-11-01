package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView a;
    public org.telegram.ui.Components.rz0 b;
    public final org.telegram.ui.Components.d5 c;
    public final /* synthetic */ ln0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(ln0 ln0Var, Context context) {
        super(context);
        this.d = ln0Var;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        rn0 rn0Var = ln0Var.p0;
        org.telegram.ui.ActionBar.a7.i(i10, this, rn0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        boolean z10 = rn0Var.a;
        org.telegram.ui.ActionBar.a7.V(textView, i11, rn0Var.getResourceProvider());
        if (ln0Var.m0 == 1) {
            textView.setText(org.telegram.messenger.dd.L0(z10 ? 2131752312 : 2131743756, null));
        } else {
            textView.setText(org.telegram.messenger.dd.L0(z10 ? 2131752321 : 2131743759, null));
        }
        addView(textView, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        org.telegram.messenger.mp mpVar;
        org.telegram.messenger.lp d;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        ln0 ln0Var = this.d;
        rn0 rn0Var = ln0Var.p0;
        int i12 = ln0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.r8[i12]);
            }
            if (ln0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                mpVar = org.telegram.messenger.wp.r1(i11).r4;
            } else {
                i10 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                mpVar = org.telegram.messenger.wp.r1(i10).s4;
            }
            return (mpVar == null || (d = mpVar.d(ln0Var.h)) == null) ? rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.r8[0]) : d.f();
        }
        int i13 = org.telegram.ui.ActionBar.t6.s8;
        if (org.telegram.messenger.i0.B(rn0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.t6.n6;
            p6Var4 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
            return org.telegram.ui.ActionBar.t6.w0(i14, p6Var4);
        }
        if (org.telegram.messenger.i0.B(rn0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.t6.A8;
            p6Var3 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
            return org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.t6.d6;
        p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
        p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        return org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.r1(0.7f, rn0.B0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2))));
    }

    public final void b(boolean z10) {
        ln0 ln0Var = this.d;
        long j10 = ln0Var.n;
        org.telegram.ui.Components.d5 d5Var = this.c;
        if (j10 != 0) {
            d5Var.j(j10, z10);
            this.b = null;
        } else {
            d5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.rz0(org.telegram.messenger.dd.L0(ln0Var.p0.a ? 2131752311 : 2131743755, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = org.telegram.messenger.dd.X;
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.setBounds(z10 ? org.telegram.messenger.i0.L(21.0f) : (getWidth() - d5Var.s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.s) / 2, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(21.0f) + d5Var.s : getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.k(valueOf);
        org.telegram.ui.Components.rz0 rz0Var = this.b;
        if (rz0Var != null) {
            rz0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.t6.q6), canvas);
        } else {
            d5Var.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ln0 ln0Var = this.d;
        setBackgroundColor(ln0Var.p0.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        this.a.setTextColor(ln0Var.p0.getThemedColor(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
