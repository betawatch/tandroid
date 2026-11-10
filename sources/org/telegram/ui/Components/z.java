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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z extends ma {
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final k9 U1;
    public final org.telegram.ui.Cells.k3 V1;
    public final org.telegram.ui.Cells.k3 W1;
    public final FrameLayout X1;
    public final wo Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final fi.d b2;
    public Long c2;
    public y d2;
    public TL_aicompose.TL_aiComposeTone e2;
    public f f2;
    public f g2;
    public int h2;
    public m41 i2;
    public int j2;

    public z(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, 2, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        final int i10 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.o1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
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
                        this.b.Y1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i12 = org.telegram.ui.ActionBar.m6.d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        c8.ka.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ha.e(100, 100, 17));
        k9 k9Var = new k9(context);
        this.U1 = k9Var;
        f1();
        frameLayout2.addView(k9Var, c8.ha.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

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
                        this.b.Y1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.Q.b).c, h6Var);
        this.V1 = k3Var;
        k3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.R.b).c, h6Var);
        this.W1 = k3Var2;
        final int i13 = 2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.R.b).c / 2));
        k3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 24, 24);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M2, h6Var);
        wo woVar = new wo(24, context, h6Var);
        this.Y1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q5, h6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

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
                        this.b.Y1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i15 = org.telegram.ui.ActionBar.m6.a7;
        this.a0 = i15;
        v0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0));
        pj0 pj0Var = this.n1;
        int i16 = this.t0;
        pj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new di.q4(8, this, h6Var));
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.u1 = 0.35f;
        this.P0 = true;
        this.I1 = true;
        w wVar = new w(this);
        wVar.m = false;
        wVar.C = false;
        wVar.o(wq.h);
        wVar.n(350L);
        this.n1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i15, this.I0)), org.telegram.ui.ActionBar.m6.w0(i15, this.I0), org.telegram.ui.ActionBar.m6.w0(i15, this.I0)}));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i17 = e10.leftMargin;
        int i18 = this.t0;
        e10.leftMargin = i17 + i18;
        e10.rightMargin += i18;
        this.b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.a2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i19 = d.leftMargin;
        int i20 = this.t0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.b.addView(frameLayout5, d);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.b2 = h;
        h.setText(org.telegram.messenger.id.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.ui.ActionBar.l1(18, this, h6Var));
        frameLayout4.addView(h, c8.ha.e(-1, 48, org.telegram.messenger.qs.E1));
        e1();
        this.i2.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new d(this, 2), this.I0);
        this.i2 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(this.e2 != null ? 2131754996 : 2131754988, null);
    }

    public final void d1() {
        if (this.d2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.I0, r6);
        xVar.setSelected(this.c2);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.d2 = yVar;
        org.telegram.ui.k11[] k11VarArr = {yVar};
        yVar.showAsDropDown(this.T1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        k11VarArr[0].b();
    }

    public final void e1() {
        this.b2.setEnabled(this.c2 != null && this.V1.getText().length() > 0 && this.W1.getText().length() > 0);
    }

    public final void f1() {
        this.h2 = 0;
        Long l10 = this.c2;
        k9 k9Var = this.U1;
        if (l10 == null) {
            k9Var.setImageResource(R.drawable.menu_smile_add);
            k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W5, this.I0), PorterDuff.Mode.SRC_IN));
        } else {
            k9Var.setAnimatedEmojiDrawable(new h5(4, this.a, this.c2.longValue()));
            k9Var.setColorFilter(null);
            k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, this.I0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void q0(float f10) {
        super.q0(f10);
        this.Z1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0);
            if (w02 != this.j2) {
                this.j2 = w02;
                v0(w02);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        k9 k9Var = this.U1;
        if (k9Var != null) {
            try {
                int w03 = org.telegram.ui.ActionBar.m6.w0(this.c2 == null ? org.telegram.ui.ActionBar.m6.W5 : org.telegram.ui.ActionBar.m6.j5, this.I0);
                if (w03 != this.h2) {
                    this.h2 = w03;
                    if (this.c2 == null) {
                        k9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
