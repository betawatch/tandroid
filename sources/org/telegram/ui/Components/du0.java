package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public final ag.b1 i1;
    public final fg.j j1;
    public final Drawable k1;
    public TextView l1;
    public int m1;
    public boolean n1;
    public final cu0 o1;
    public int p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(Context context, cu0 cu0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        final int i10 = 1;
        final int i11 = 0;
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.D4);
        this.o1 = cu0Var;
        O();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.k1 = mutate;
        int i12 = org.telegram.ui.ActionBar.t6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, this.I0), PorterDuff.Mode.MULTIPLY));
        jg.l0 l0Var = new jg.l0(this, context, 24);
        this.b = l0Var;
        l0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i13 = this.t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        ag.b1 b1Var = new ag.b1(this, context, 21);
        this.i1 = b1Var;
        getContext();
        b1Var.setLayoutManager(new s4.a0(1, false));
        fg.j jVar = new fg.j(6, this, context);
        this.j1 = jVar;
        b1Var.setAdapter(jVar);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        b1Var.setEnabled(true);
        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        b1Var.setOnScrollListener(new bu0(this, i11));
        b1Var.setOnItemClickListener(new k(this, 13));
        this.b.addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.b.addView(view, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 21);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, a5Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.t6.Wi;
        org.telegram.ui.ActionBar.a7.V(textView, i14, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i14, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(textView, h02, null, h, null);
        textView.setPadding(org.telegram.messenger.i0.L(33.0f), 0, org.telegram.messenger.i0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.i0.o());
        a5Var.addView(textView, w7.b6.e(-2, -1, 51));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i14, 15);
        f7.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(f7, h03, null, h10, null);
        f7.setPadding(org.telegram.messenger.i0.L(33.0f), 0, org.telegram.messenger.i0.L(33.0f), 0);
        a5Var.addView(f7, w7.b6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.z20.n(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Zi, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.i0.L(11.0f);
        int i15 = org.telegram.ui.ActionBar.t6.Yi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.v0(i15));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView2, d02, N, null, null);
        textView2.setMinWidth(org.telegram.messenger.i0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
        TextView f10 = org.telegram.messenger.z20.f(f7, textView2, w7.b6.t(-2, 23, 16, 0, 0, 10, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(f10, i14, null);
        f10.setGravity(17);
        f10.setCompoundDrawablePadding(org.telegram.messenger.i0.L(8.0f));
        f10.setText(org.telegram.messenger.cd.L0(2131745657, null).toUpperCase());
        f10.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(f10, w7.b6.r(-2, -2, 16));
        org.telegram.ui.ActionBar.a7.i(i12, a5Var, p6Var);
        this.b.addView(a5Var, w7.b6.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var);
        textView.setText(org.telegram.messenger.cd.L0(2131744858, null));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.au0
            public final /* synthetic */ du0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        du0 du0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.ed(org.telegram.messenger.nd.f(i16), 6));
                        }
                        du0Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.n5, p6Var);
        f10.setText(org.telegram.messenger.cd.L0(2131752041, null).toUpperCase());
        f7.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        f7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.au0
            public final /* synthetic */ du0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        du0 du0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.ed(org.telegram.messenger.nd.f(i16), 6));
                        }
                        du0Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        jVar.f();
    }

    public static void I0(du0 du0Var) {
        ag.b1 b1Var = du0Var.i1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            du0Var.m1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            du0Var.b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = top;
        }
        if (du0Var.m1 != i10) {
            du0Var.m1 = i10;
            b1Var.setTopGlowOffset(i10);
            du0Var.b.invalidate();
        }
    }

    public static org.telegram.messenger.md J0(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList arrayList = org.telegram.messenger.nd.f(i11).I;
            if (i10 < arrayList.size()) {
                return (org.telegram.messenger.md) arrayList.get(i10);
            }
            i10 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.D4) {
            if (org.telegram.messenger.nd.g() == 0) {
                dismiss();
            } else {
                this.j1.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D4);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
            Drawable drawable = this.k1;
            if (drawable == null || w02 == this.p1) {
                return;
            }
            this.p1 = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
