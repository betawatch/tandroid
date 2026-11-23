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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lt0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public final di.b1 m1;
    public final org.telegram.ui.l4 n1;
    public final Drawable o1;
    public TextView p1;
    public int q1;
    public boolean r1;
    public final kt0 s1;
    public int t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(Context context, kt0 kt0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        final int i7 = 1;
        final int i10 = 0;
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.G4);
        this.s1 = kt0Var;
        O();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.o1 = mutate;
        int i11 = org.telegram.ui.ActionBar.n6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, this.J0), PorterDuff.Mode.MULTIPLY));
        int i12 = 26;
        bi.g3 g3Var = new bi.g3(i12, context, this);
        this.b = g3Var;
        g3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i13 = this.u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        di.b1 b1Var = new di.b1(i12, context, this);
        this.m1 = b1Var;
        getContext();
        b1Var.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(5, this, context);
        this.n1 = l4Var;
        b1Var.setAdapter(l4Var);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        b1Var.setEnabled(true);
        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        b1Var.setOnScrollListener(new na(this, 18));
        b1Var.setOnItemClickListener(new n(this, 13));
        this.b.addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.b.addView(view, c8.na.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        bi.v2 v2Var = new bi.v2(context, 19);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, v2Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.n6.Zi;
        org.telegram.ui.ActionBar.u6.U(textView, i14, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i14, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(textView, h02, null, g10, null);
        textView.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.gd.N0(2131752577, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        v2Var.addView(textView, c8.na.e(-2, -1, 51));
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.v0(i14) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.q6 g12 = org.telegram.ui.ActionBar.u6.g(i14, 15);
        g11.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(g11, h03, null, g12, null);
        g11.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        v2Var.addView(g11, c8.na.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.m10.p(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.cj, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = org.telegram.ui.ActionBar.n6.bj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.v0(i15));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView2, d02, M, null, null);
        textView2.setMinWidth(org.telegram.messenger.g0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
        TextView f10 = org.telegram.messenger.m10.f(g11, textView2, c8.na.t(-2, 23, 16, 0, 0, 10, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(f10, i14, null);
        f10.setGravity(17);
        f10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f10.setText(org.telegram.messenger.gd.N0(2131745444, null).toUpperCase());
        f10.setTypeface(org.telegram.messenger.g0.o());
        g11.addView(f10, c8.na.r(-2, -2, 16));
        org.telegram.ui.ActionBar.u6.h(i11, v2Var, i6Var);
        this.b.addView(v2Var, c8.na.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, i6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131744599, null));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jt0
            public final /* synthetic */ lt0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        lt0 lt0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.hd(org.telegram.messenger.qd.f(i16), 6));
                        }
                        lt0Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.n5, i6Var);
        f10.setText(org.telegram.messenger.gd.N0(2131752029, null).toUpperCase());
        g11.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        g11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jt0
            public final /* synthetic */ lt0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        lt0 lt0Var = this.b;
                        for (int i16 = 0; i16 < 4; i16++) {
                            Utilities.d.c(new org.telegram.messenger.hd(org.telegram.messenger.qd.f(i16), 6));
                        }
                        lt0Var.dismiss();
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

    public static void J0(lt0 lt0Var) {
        di.b1 b1Var = lt0Var.m1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            lt0Var.q1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            lt0Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        }
        if (lt0Var.q1 != i7) {
            lt0Var.q1 = i7;
            b1Var.setTopGlowOffset(i7);
            lt0Var.b.invalidate();
        }
    }

    public static org.telegram.messenger.pd K0(int i7) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = org.telegram.messenger.qd.f(i10).J;
            if (i7 < arrayList.size()) {
                return (org.telegram.messenger.pd) arrayList.get(i7);
            }
            i7 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.G4) {
            if (org.telegram.messenger.qd.g() == 0) {
                dismiss();
            } else {
                this.n1.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.G4);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
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
