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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z extends ma {
    public final FrameLayout Q1;
    public final FrameLayout R1;
    public final k9 S1;
    public final org.telegram.ui.Cells.k3 T1;
    public final org.telegram.ui.Cells.k3 U1;
    public final FrameLayout V1;
    public final wo W1;
    public final FrameLayout X1;
    public final FrameLayout Y1;
    public final gi.d Z1;
    public Long a2;
    public y b2;
    public TL_aicompose.TL_aiComposeTone c2;
    public g d2;
    public g e2;
    public int f2;
    public f41 g2;
    public int h2;

    public z(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        final int i10 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i3);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        this.m1.addView(imageView, b8.mf.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
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
                        this.b.W1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R1 = frameLayout2;
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, e6Var);
        b8.pf.a(frameLayout2);
        frameLayout.addView(frameLayout2, b8.mf.e(100, 100, 17));
        k9 k9Var = new k9(context);
        this.S1 = k9Var;
        f1();
        frameLayout2.addView(k9Var, b8.mf.e(64, 64, 17));
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
                        this.b.W1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.a).x7.Q.b).c, e6Var);
        this.T1 = k3Var;
        k3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.a).x7.R.b).c, e6Var);
        this.U1 = k3Var2;
        final int i13 = 2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.a).x7.R.b).c / 2));
        k3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N2, e6Var);
        wo woVar = new wo(24, context, e6Var);
        this.W1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, b8.mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q5, e6Var);
        k2.p1.u(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, b8.mf.t(-2, -2, 16, 9, 0, 0, 0));
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
                        this.b.W1.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        frameLayout3.addView(linearLayout, b8.mf.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i15 = org.telegram.ui.ActionBar.k6.a7;
        this.b0 = i15;
        v0(org.telegram.ui.ActionBar.k6.w0(i15, this.J0));
        tj0 tj0Var = this.l1;
        int i16 = this.u0;
        tj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(66.0f));
        this.l1.setClipToPadding(false);
        this.l1.r1();
        this.l1.setOnItemClickListener(new ei.q4(8, this, e6Var));
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.s1 = 0.35f;
        this.Q0 = true;
        this.G1 = true;
        w wVar = new w(this);
        wVar.m = false;
        wVar.C = false;
        wVar.o(xq.h);
        wVar.n(350L);
        this.l1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i15, this.J0)), org.telegram.ui.ActionBar.k6.w0(i15, this.J0), org.telegram.ui.ActionBar.k6.w0(i15, this.J0)}));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 80);
        int i17 = e10.leftMargin;
        int i18 = this.u0;
        e10.leftMargin = i17 + i18;
        e10.rightMargin += i18;
        this.b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.Y1 = frameLayout5;
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i19 = d.leftMargin;
        int i20 = this.u0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.b.addView(frameLayout5, d);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.Z1 = h;
        h.setText(org.telegram.messenger.bd.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.messenger.video.g(24, this, e6Var));
        frameLayout4.addView(h, b8.mf.e(-1, 48, org.telegram.messenger.hs.E1));
        e1();
        this.g2.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new e(this, 2), this.J0);
        this.g2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(this.c2 != null ? 2131754996 : 2131754988, null);
    }

    public final void d1() {
        if (this.b2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        xVar.setSelected(this.a2);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.b2 = yVar;
        org.telegram.ui.x01[] x01VarArr = {yVar};
        yVar.showAsDropDown(this.R1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        x01VarArr[0].b();
    }

    public final void e1() {
        this.Z1.setEnabled(this.a2 != null && this.T1.getText().length() > 0 && this.U1.getText().length() > 0);
    }

    public final void f1() {
        this.f2 = 0;
        Long l10 = this.a2;
        k9 k9Var = this.S1;
        if (l10 == null) {
            k9Var.setImageResource(R.drawable.menu_smile_add);
            k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.J0), PorterDuff.Mode.SRC_IN));
        } else {
            k9Var.setAnimatedEmojiDrawable(new g5(4, this.a, this.a2.longValue()));
            k9Var.setColorFilter(null);
            k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.J0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void q0(float f10) {
        super.q0(f10);
        this.X1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            if (w02 != this.h2) {
                this.h2 = w02;
                v0(w02);
                this.X1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        k9 k9Var = this.S1;
        if (k9Var != null) {
            try {
                int w03 = org.telegram.ui.ActionBar.k6.w0(this.a2 == null ? org.telegram.ui.ActionBar.k6.W5 : org.telegram.ui.ActionBar.k6.j5, this.J0);
                if (w03 != this.f2) {
                    this.f2 = w03;
                    if (this.a2 == null) {
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
