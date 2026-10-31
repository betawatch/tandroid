package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView a;
    public org.telegram.ui.Components.qz0 b;
    public final org.telegram.ui.Components.d5 c;
    public final /* synthetic */ nn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(nn0 nn0Var, Context context) {
        super(context);
        this.d = nn0Var;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        tn0 tn0Var = nn0Var.p0;
        org.telegram.ui.ActionBar.a7.i(i10, this, tn0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        boolean z10 = tn0Var.a;
        org.telegram.ui.ActionBar.a7.V(textView, i11, tn0Var.getResourceProvider());
        if (nn0Var.m0 == 1) {
            textView.setText(org.telegram.messenger.cd.L0(z10 ? 2131752312 : 2131743756, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(z10 ? 2131752321 : 2131743759, null));
        }
        addView(textView, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        org.telegram.messenger.lp lpVar;
        org.telegram.messenger.kp d;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        nn0 nn0Var = this.d;
        tn0 tn0Var = nn0Var.p0;
        int i12 = nn0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.r8[i12]);
            }
            if (nn0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                lpVar = org.telegram.messenger.vp.r1(i11).r4;
            } else {
                i10 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                lpVar = org.telegram.messenger.vp.r1(i10).s4;
            }
            return (lpVar == null || (d = lpVar.d(nn0Var.h)) == null) ? tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.r8[0]) : d.f();
        }
        int i13 = org.telegram.ui.ActionBar.t6.s8;
        if (org.telegram.messenger.i0.B(tn0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.t6.n6;
            p6Var4 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
            return org.telegram.ui.ActionBar.t6.w0(i14, p6Var4);
        }
        if (org.telegram.messenger.i0.B(tn0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.t6.A8;
            p6Var3 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
            return org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.t6.d6;
        p6Var = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
        p6Var2 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
        return org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.r1(0.7f, tn0.A0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2))));
    }

    public final void b(boolean z10) {
        nn0 nn0Var = this.d;
        long j10 = nn0Var.n;
        org.telegram.ui.Components.d5 d5Var = this.c;
        if (j10 != 0) {
            d5Var.j(j10, z10);
            this.b = null;
        } else {
            d5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.L0(nn0Var.p0.a ? 2131752311 : 2131743755, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = org.telegram.messenger.cd.X;
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.setBounds(z10 ? org.telegram.messenger.i0.L(21.0f) : (getWidth() - d5Var.s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.s) / 2, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(21.0f) + d5Var.s : getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.k(valueOf);
        org.telegram.ui.Components.qz0 qz0Var = this.b;
        if (qz0Var != null) {
            qz0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.t6.q6), canvas);
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
        nn0 nn0Var = this.d;
        setBackgroundColor(nn0Var.p0.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        this.a.setTextColor(nn0Var.p0.getThemedColor(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
