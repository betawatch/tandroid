package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView a;
    public org.telegram.ui.Components.ny0 b;
    public final org.telegram.ui.Components.g5 c;
    public final /* synthetic */ dm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(dm0 dm0Var, Context context) {
        super(context);
        this.d = dm0Var;
        int i7 = org.telegram.ui.ActionBar.l6.d6;
        jm0 jm0Var = dm0Var.p0;
        org.telegram.ui.ActionBar.s6.h(i7, this, jm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        boolean z9 = jm0Var.a;
        org.telegram.ui.ActionBar.s6.U(textView, i10, jm0Var.getResourceProvider());
        if (dm0Var.m0 == 1) {
            textView.setText(org.telegram.messenger.id.M0(z9 ? 2131752312 : 2131743730, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(z9 ? 2131752321 : 2131743733, null));
        }
        addView(textView, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp d;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        dm0 dm0Var = this.d;
        jm0 jm0Var = dm0Var.p0;
        int i11 = dm0Var.h;
        if (i11 >= 0) {
            if (i11 < 7) {
                return jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.r8[i11]);
            }
            if (dm0Var.m0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i10).q4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i7).r4;
            }
            return (gpVar == null || (d = gpVar.d(dm0Var.h)) == null) ? jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.r8[0]) : d.f();
        }
        int i12 = org.telegram.ui.ActionBar.l6.s8;
        if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) > 0.8f) {
            int i13 = org.telegram.ui.ActionBar.l6.n6;
            g6Var4 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.l6.w0(i13, g6Var4);
        }
        if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) < 0.2f) {
            int i14 = org.telegram.ui.ActionBar.l6.A8;
            g6Var3 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i14, g6Var3));
        }
        int i15 = org.telegram.ui.ActionBar.l6.d6;
        g6Var = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i15, g6Var);
        g6Var2 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        return org.telegram.ui.ActionBar.l6.w(w02, org.telegram.ui.ActionBar.l6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var2))));
    }

    public final void b(boolean z9) {
        dm0 dm0Var = this.d;
        long j3 = dm0Var.n;
        org.telegram.ui.Components.g5 g5Var = this.c;
        if (j3 != 0) {
            g5Var.j(j3, z9);
            this.b = null;
        } else {
            g5Var.g(null, z9);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.ny0(org.telegram.messenger.id.M0(dm0Var.p0.a ? 2131752311 : 2131743729, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z9 = org.telegram.messenger.id.a0;
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.setBounds(z9 ? org.telegram.messenger.g0.L(21.0f) : (getWidth() - g5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.s) / 2, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(21.0f) + g5Var.s : getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.k(valueOf);
        org.telegram.ui.Components.ny0 ny0Var = this.b;
        if (ny0Var != null) {
            ny0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.l6.q6), canvas);
        } else {
            g5Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        dm0 dm0Var = this.d;
        setBackgroundColor(dm0Var.p0.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
        this.a.setTextColor(dm0Var.p0.getThemedColor(org.telegram.ui.ActionBar.l6.G6));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
