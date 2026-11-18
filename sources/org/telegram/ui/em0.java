package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class em0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView a;
    public org.telegram.ui.Components.vy0 b;
    public final org.telegram.ui.Components.m5 c;
    public final /* synthetic */ fm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(fm0 fm0Var, Context context) {
        super(context);
        this.d = fm0Var;
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        lm0 lm0Var = fm0Var.q0;
        org.telegram.ui.ActionBar.u6.h(i7, this, lm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        boolean z10 = lm0Var.a;
        org.telegram.ui.ActionBar.u6.U(textView, i10, lm0Var.getResourceProvider());
        if (fm0Var.n0 == 1) {
            textView.setText(org.telegram.messenger.gd.M0(z10 ? 2131752301 : 2131743493, null));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(z10 ? 2131752310 : 2131743496, null));
        }
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp d;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        fm0 fm0Var = this.d;
        lm0 lm0Var = fm0Var.q0;
        int i11 = fm0Var.h;
        if (i11 >= 0) {
            if (i11 < 7) {
                return lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.r8[i11]);
            }
            if (fm0Var.n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i10).t4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i7).u4;
            }
            return (cpVar == null || (d = cpVar.d(fm0Var.h)) == null) ? lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.r8[0]) : d.f();
        }
        int i12 = org.telegram.ui.ActionBar.n6.s8;
        if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) > 0.8f) {
            int i13 = org.telegram.ui.ActionBar.n6.n6;
            i6Var4 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.n6.w0(i13, i6Var4);
        }
        if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) < 0.2f) {
            int i14 = org.telegram.ui.ActionBar.n6.A8;
            i6Var3 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i14, i6Var3));
        }
        int i15 = org.telegram.ui.ActionBar.n6.d6;
        i6Var = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
        i6Var2 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
        return org.telegram.ui.ActionBar.n6.w(w02, org.telegram.ui.ActionBar.n6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var2))));
    }

    public final void b(boolean z10) {
        fm0 fm0Var = this.d;
        long j3 = fm0Var.n;
        org.telegram.ui.Components.m5 m5Var = this.c;
        if (j3 != 0) {
            m5Var.j(j3, z10);
            this.b = null;
        } else {
            m5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(fm0Var.q0.a ? 2131752300 : 2131743492, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = org.telegram.messenger.gd.a0;
        org.telegram.ui.Components.m5 m5Var = this.c;
        m5Var.setBounds(z10 ? org.telegram.messenger.g0.L(21.0f) : (getWidth() - m5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.s) / 2, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(21.0f) + m5Var.s : getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.m5 m5Var = this.c;
        m5Var.k(valueOf);
        org.telegram.ui.Components.vy0 vy0Var = this.b;
        if (vy0Var != null) {
            vy0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(org.telegram.ui.ActionBar.n6.q6), canvas);
        } else {
            m5Var.draw(canvas);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        fm0 fm0Var = this.d;
        setBackgroundColor(fm0Var.q0.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        this.a.setTextColor(fm0Var.q0.getThemedColor(org.telegram.ui.ActionBar.n6.G6));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
