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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public final di.c1 m1;
    public final org.telegram.ui.l4 n1;
    public final Drawable o1;
    public TextView p1;
    public int q1;
    public boolean r1;
    public final at0 s1;
    public int t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(Context context, at0 at0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        final int i7 = 1;
        final int i10 = 0;
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.D4);
        this.s1 = at0Var;
        O();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.o1 = mutate;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), PorterDuff.Mode.MULTIPLY));
        int i12 = 26;
        bi.g2 g2Var = new bi.g2(i12, context, this);
        this.b = g2Var;
        g2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i13 = this.u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        di.c1 c1Var = new di.c1(i12, context, this);
        this.m1 = c1Var;
        getContext();
        c1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(5, this, context);
        this.n1 = l4Var;
        c1Var.setAdapter(l4Var);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.setClipToPadding(false);
        c1Var.setEnabled(true);
        org.telegram.ui.ActionBar.q6.l(c1Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        c1Var.setOnScrollListener(new ri(this, 17));
        c1Var.setOnItemClickListener(new j(this, 13));
        this.b.addView(c1Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.b.addView(view, c8.ja.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        bi.v1 v1Var = new bi.v1(context, 19);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, v1Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Zi;
        org.telegram.ui.ActionBar.q6.U(textView, i14, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i14, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(textView, h02, null, g10, null);
        textView.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        v1Var.addView(textView, c8.ja.e(-2, -1, 51));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i14, 15);
        f10.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(f10, h03, null, g11, null);
        f10.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        v1Var.addView(f10, c8.ja.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.i20.o(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.cj, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = org.telegram.ui.ActionBar.j6.bj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.v0(i15));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(textView2, d02, M, null, null);
        textView2.setMinWidth(org.telegram.messenger.g0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
        TextView f11 = org.telegram.messenger.i20.f(f10, textView2, c8.ja.t(-2, 23, 16, 0, 0, 10, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(f11, i14, null);
        f11.setGravity(17);
        f11.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f11.setText(org.telegram.messenger.hd.M0(2131745640, null).toUpperCase());
        f11.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(f11, c8.ja.r(-2, -2, 16));
        org.telegram.ui.ActionBar.q6.h(i11, v1Var, e6Var);
        this.b.addView(v1Var, c8.ja.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, e6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131744840, null));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zs0
            public final /* synthetic */ bt0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        bt0 bt0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i16), 6));
                        }
                        bt0Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q6.U(f11, org.telegram.ui.ActionBar.j6.n5, e6Var);
        f11.setText(org.telegram.messenger.hd.M0(2131752041, null).toUpperCase());
        f10.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        f10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zs0
            public final /* synthetic */ bt0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        bt0 bt0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i16), 6));
                        }
                        bt0Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        l4Var.f();
    }

    public static void I0(bt0 bt0Var) {
        di.c1 c1Var = bt0Var.m1;
        if (c1Var.getChildCount() <= 0) {
            int paddingTop = c1Var.getPaddingTop();
            bt0Var.q1 = paddingTop;
            c1Var.setTopGlowOffset(paddingTop);
            bt0Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        }
        if (bt0Var.q1 != i7) {
            bt0Var.q1 = i7;
            c1Var.setTopGlowOffset(i7);
            bt0Var.b.invalidate();
        }
    }

    public static org.telegram.messenger.qd J0(int i7) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = org.telegram.messenger.rd.f(i10).J;
            if (i7 < arrayList.size()) {
                return (org.telegram.messenger.qd) arrayList.get(i7);
            }
            i7 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.D4) {
            if (org.telegram.messenger.rd.g() == 0) {
                dismiss();
            } else {
                this.n1.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.D4);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
            Drawable drawable = this.o1;
            if (drawable == null || w02 == this.t1) {
                return;
            }
            this.t1 = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
