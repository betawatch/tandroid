package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends ha {
    public final FrameLayout P1;
    public final FrameLayout Q1;
    public final g9 R1;
    public final org.telegram.ui.Cells.m3 S1;
    public final org.telegram.ui.Cells.m3 T1;
    public final FrameLayout U1;
    public final ep V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final vh.d Y1;
    public Long Z1;
    public y a2;
    public TL_aicompose.TL_aiComposeTone b2;
    public f c2;
    public f d2;
    public int e2;
    public p51 f2;
    public int g2;

    public z(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, 2, p6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        final int i11 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        this.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1();
                        break;
                    default:
                        this.b.V1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q1 = frameLayout2;
        int L2 = org.telegram.messenger.i0.L(100.0f);
        int i13 = org.telegram.ui.ActionBar.t6.d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(L2, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L3, N, null, p6Var);
        w7.e6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.b6.e(100, 100, 17));
        g9 g9Var = new g9(context);
        this.R1 = g9Var;
        f1();
        frameLayout2.addView(g9Var, w7.b6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1();
                        break;
                    default:
                        this.b.V1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131754965, null), false, false, ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.a).y7.Q.a).c, p6Var);
        this.S1 = m3Var;
        m3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131754972, null), true, false, ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.a).y7.R.a).c, p6Var);
        this.T1 = m3Var2;
        final int i14 = 2;
        m3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.a).y7.R.a).c / 2));
        m3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 24, 24);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N2, p6Var);
        ep epVar = new ep(24, context, p6Var);
        this.V1 = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.h7, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q5, p6Var);
        sc.e.u(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1();
                        break;
                    default:
                        this.b.V1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.U1 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.b6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i16 = org.telegram.ui.ActionBar.t6.a7;
        this.a0 = i16;
        v0(org.telegram.ui.ActionBar.t6.w0(i16, this.I0));
        tk0 tk0Var = this.k1;
        int i17 = this.t0;
        tk0Var.setPadding(i17, 0, i17, org.telegram.messenger.i0.L(66.0f));
        this.k1.setClipToPadding(false);
        this.k1.r1();
        this.k1.setOnItemClickListener(new mg.q0(7, this, p6Var));
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.r1 = 0.35f;
        this.P0 = true;
        this.F1 = true;
        w wVar = new w(this);
        wVar.m = false;
        wVar.C = false;
        wVar.o(gr.h);
        wVar.n(350L);
        this.k1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.W1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i16, this.I0)), org.telegram.ui.ActionBar.t6.w0(i16, this.I0), org.telegram.ui.ActionBar.t6.w0(i16, this.I0)}));
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 80);
        int i18 = e.leftMargin;
        int i19 = this.t0;
        e.leftMargin = i18 + i19;
        e.rightMargin += i19;
        this.b.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.X1 = frameLayout5;
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i20 = d.leftMargin;
        int i21 = this.t0;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.b.addView(frameLayout5, d);
        vh.d i22 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.Y1 = i22;
        i22.setText(org.telegram.messenger.cd.L0(2131754981, null));
        i22.setOnClickListener(new org.telegram.ui.ud(10, this, p6Var));
        frameLayout4.addView(i22, w7.b6.e(-1, 48, org.telegram.messenger.zs.E1));
        e1();
        this.f2.O(false);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, true, new d(this, 2), this.I0);
        this.f2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(this.b2 != null ? 2131754996 : 2131754988, null);
    }

    public final void d1() {
        if (this.a2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.i0.L(150.0f)), this.I0, r6);
        xVar.setSelected(this.Z1);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.a2 = yVar;
        org.telegram.ui.z21[] z21VarArr = {yVar};
        yVar.showAsDropDown(this.Q1, org.telegram.messenger.i0.L(150.0f), -org.telegram.messenger.i0.L(390.0f), 80);
        z21VarArr[0].b();
    }

    public final void e1() {
        this.Y1.setEnabled(this.Z1 != null && this.S1.getText().length() > 0 && this.T1.getText().length() > 0);
    }

    public final void f1() {
        this.e2 = 0;
        Long l4 = this.Z1;
        g9 g9Var = this.R1;
        if (l4 == null) {
            g9Var.setImageResource(R.drawable.menu_smile_add);
            g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W5, this.I0), PorterDuff.Mode.SRC_IN));
        } else {
            g9Var.setAnimatedEmojiDrawable(new f5(4, this.a, this.Z1.longValue()));
            g9Var.setColorFilter(null);
            g9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, this.I0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void q0(float f7) {
        super.q0(f7);
        this.W1.setTranslationY(f7);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
            if (w02 != this.g2) {
                this.g2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        g9 g9Var = this.R1;
        if (g9Var != null) {
            try {
                int w03 = org.telegram.ui.ActionBar.t6.w0(this.Z1 == null ? org.telegram.ui.ActionBar.t6.W5 : org.telegram.ui.ActionBar.t6.j5, this.I0);
                if (w03 != this.e2) {
                    this.e2 = w03;
                    if (this.Z1 == null) {
                        g9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }
}
