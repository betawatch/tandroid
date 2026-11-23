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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h0 extends ra {
    public final FrameLayout T1;
    public final FrameLayout U1;
    public final p9 V1;
    public final org.telegram.ui.Cells.l3 W1;
    public final org.telegram.ui.Cells.l3 X1;
    public final FrameLayout Y1;
    public final lp Z1;
    public final FrameLayout a2;
    public final FrameLayout b2;
    public final hi.e c2;
    public Long d2;
    public g0 e2;
    public TL_aicompose.TL_aiComposeTone f2;
    public f g2;
    public f h2;
    public int i2;
    public b51 j2;
    public int k2;

    public h0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, true, false, 2, i6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        final int i10 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
        this.p1.addView(imageView, c8.na.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.sa.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a0
            public final /* synthetic */ h0 b;

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
                        this.b.e1();
                        break;
                    default:
                        this.b.Z1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i12 = org.telegram.ui.ActionBar.n6.d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        c8.sa.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.na.e(100, 100, 17));
        p9 p9Var = new p9(context);
        this.V1 = p9Var;
        g1();
        frameLayout2.addView(p9Var, c8.na.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.e1();
                        break;
                    default:
                        this.b.Z1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.a).A7.V.b).c, i6Var);
        this.W1 = l3Var;
        l3Var.d.addTextChangedListener(new d0(this, 0));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.a).A7.W.b).c, i6Var);
        this.X1 = l3Var2;
        final int i13 = 2;
        l3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.a).A7.W.b).c / 2));
        l3Var2.d.addTextChangedListener(new d0(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 24, 24);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M2, i6Var);
        lp lpVar = new lp(24, context, i6Var);
        this.Z1 = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(lpVar, c8.na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q5, i6Var);
        i5.c.r(14.0f, 1, 2131754982, textView, null);
        linearLayout.addView(textView, c8.na.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.e1();
                        break;
                    default:
                        this.b.Z1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.na.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i15 = org.telegram.ui.ActionBar.n6.a7;
        this.b0 = i15;
        v0(org.telegram.ui.ActionBar.n6.w0(i15, this.J0));
        ek0 ek0Var = this.o1;
        int i16 = this.u0;
        ek0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(66.0f));
        this.o1.setClipToPadding(false);
        this.o1.r1();
        this.o1.setOnItemClickListener(new fi.g4(8, this, i6Var));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.v1 = 0.35f;
        this.Q0 = true;
        this.J1 = true;
        e0 e0Var = new e0(this);
        e0Var.m = false;
        e0Var.C = false;
        e0Var.o(kr.h);
        e0Var.n(350L);
        this.o1.setItemAnimator(e0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a2 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, org.telegram.ui.ActionBar.n6.w0(i15, this.J0)), org.telegram.ui.ActionBar.n6.w0(i15, this.J0), org.telegram.ui.ActionBar.n6.w0(i15, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.na.e(-1, -2, 80);
        int i17 = e10.leftMargin;
        int i18 = this.u0;
        e10.leftMargin = i17 + i18;
        e10.rightMargin += i18;
        this.b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.b2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i19 = d.leftMargin;
        int i20 = this.u0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.b.addView(frameLayout5, d);
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.c2 = g10;
        g10.setText(org.telegram.messenger.gd.N0(2131754981, null));
        g10.setOnClickListener(new oi.i1(20, this, i6Var));
        frameLayout4.addView(g10, c8.na.e(-1, 48, org.telegram.messenger.ks.E1));
        f1();
        this.j2.O(false);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, 0, true, new d(this, 2), this.J0);
        this.j2 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(this.f2 != null ? 2131754996 : 2131754988, null);
    }

    public final void e1() {
        if (this.e2 != null) {
            return;
        }
        f0 f0Var = new f0(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        f0Var.setSelected(this.d2);
        f0Var.setSaveState(1);
        g0 g0Var = new g0(this, f0Var);
        this.e2 = g0Var;
        org.telegram.ui.h11[] h11VarArr = {g0Var};
        g0Var.showAsDropDown(this.U1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        h11VarArr[0].b();
    }

    public final void f1() {
        this.c2.setEnabled(this.d2 != null && this.W1.getText().length() > 0 && this.X1.getText().length() > 0);
    }

    public final void g1() {
        this.i2 = 0;
        Long l10 = this.d2;
        p9 p9Var = this.V1;
        if (l10 == null) {
            p9Var.setImageResource(R.drawable.menu_smile_add);
            p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W5, this.J0), PorterDuff.Mode.SRC_IN));
        } else {
            p9Var.setAnimatedEmojiDrawable(new o5(4, this.a, this.d2.longValue()));
            p9Var.setColorFilter(null);
            p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, this.J0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void q0(float f10) {
        super.q0(f10);
        this.a2.setTranslationY(f10);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
            if (w02 != this.k2) {
                this.k2 = w02;
                v0(w02);
                this.a2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        p9 p9Var = this.V1;
        if (p9Var != null) {
            try {
                int w03 = org.telegram.ui.ActionBar.n6.w0(this.d2 == null ? org.telegram.ui.ActionBar.n6.W5 : org.telegram.ui.ActionBar.n6.j5, this.J0);
                if (w03 != this.i2) {
                    this.i2 = w03;
                    if (this.d2 == null) {
                        p9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
