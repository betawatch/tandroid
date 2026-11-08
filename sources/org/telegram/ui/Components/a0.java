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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a0 extends na {
    public final FrameLayout P1;
    public final FrameLayout Q1;
    public final l9 R1;
    public final org.telegram.ui.Cells.k3 S1;
    public final org.telegram.ui.Cells.k3 T1;
    public final FrameLayout U1;
    public final wo V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final fi.d Y1;
    public Long Z1;
    public z a2;
    public TL_aicompose.TL_aiComposeTone b2;
    public g c2;
    public g d2;
    public int e2;
    public l41 f2;
    public int g2;

    public a0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_ATOP);
        final int i10 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, f6Var);
        this.l1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

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
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q1 = frameLayout2;
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, f6Var);
        c8.ka.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ha.e(100, 100, 17));
        l9 l9Var = new l9(context);
        this.R1 = l9Var;
        f1();
        frameLayout2.addView(l9Var, c8.ha.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

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
                        this.b.d1();
                        break;
                    default:
                        this.b.V1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.Q.b).c, f6Var);
        this.S1 = k3Var;
        k3Var.d.addTextChangedListener(new w(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.R.b).c, f6Var);
        this.T1 = k3Var2;
        final int i13 = 2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.R.b).c / 2));
        k3Var2.d.addTextChangedListener(new w(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N2, f6Var);
        wo woVar = new wo(24, context, f6Var);
        this.V1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q5, f6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

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
        frameLayout3.addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i15 = org.telegram.ui.ActionBar.k6.a7;
        this.a0 = i15;
        v0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0));
        pj0 pj0Var = this.k1;
        int i16 = this.t0;
        pj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(66.0f));
        this.k1.setClipToPadding(false);
        this.k1.r1();
        this.k1.setOnItemClickListener(new di.p4(8, this, f6Var));
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.r1 = 0.35f;
        this.P0 = true;
        this.F1 = true;
        x xVar = new x(this);
        xVar.m = false;
        xVar.C = false;
        xVar.o(xq.h);
        xVar.n(350L);
        this.k1.setItemAnimator(xVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.W1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i15, this.I0)), org.telegram.ui.ActionBar.k6.w0(i15, this.I0), org.telegram.ui.ActionBar.k6.w0(i15, this.I0)}));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i17 = e10.leftMargin;
        int i18 = this.t0;
        e10.leftMargin = i17 + i18;
        e10.rightMargin += i18;
        this.b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.X1 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i19 = d.leftMargin;
        int i20 = this.t0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.b.addView(frameLayout5, d);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.Y1 = h;
        h.setText(org.telegram.messenger.id.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.ui.ActionBar.l1(18, this, f6Var));
        frameLayout4.addView(h, c8.ha.e(-1, 48, org.telegram.messenger.qs.E1));
        e1();
        this.f2.O(false);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.a, 0, true, new d(this, 2), this.I0);
        this.f2 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(this.b2 != null ? 2131754996 : 2131754988, null);
    }

    public final void d1() {
        if (this.a2 != null) {
            return;
        }
        y yVar = new y(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.I0, r6);
        yVar.setSelected(this.Z1);
        yVar.setSaveState(1);
        z zVar = new z(this, yVar);
        this.a2 = zVar;
        org.telegram.ui.h11[] h11VarArr = {zVar};
        zVar.showAsDropDown(this.Q1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        h11VarArr[0].b();
    }

    public final void e1() {
        this.Y1.setEnabled(this.Z1 != null && this.S1.getText().length() > 0 && this.T1.getText().length() > 0);
    }

    public final void f1() {
        this.e2 = 0;
        Long l10 = this.Z1;
        l9 l9Var = this.R1;
        if (l10 == null) {
            l9Var.setImageResource(R.drawable.menu_smile_add);
            l9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.I0), PorterDuff.Mode.SRC_IN));
        } else {
            l9Var.setAnimatedEmojiDrawable(new i5(4, this.a, this.Z1.longValue()));
            l9Var.setColorFilter(null);
            l9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.I0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void q0(float f10) {
        super.q0(f10);
        this.W1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0);
            if (w02 != this.g2) {
                this.g2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l9 l9Var = this.R1;
        if (l9Var != null) {
            try {
                int w03 = org.telegram.ui.ActionBar.k6.w0(this.Z1 == null ? org.telegram.ui.ActionBar.k6.W5 : org.telegram.ui.ActionBar.k6.j5, this.I0);
                if (w03 != this.e2) {
                    this.e2 = w03;
                    if (this.Z1 == null) {
                        l9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
