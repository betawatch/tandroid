package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import fi.h9;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i0 extends na {
    public static final int c2 = -1;
    public static final int d2 = -2;
    public final TL_account.TL_connectedBot P1;
    public final TLRPC.User Q1;
    public final a0 R1;
    public final LinearLayout S1;
    public final FrameLayout T1;
    public final fi.d U1;
    public final fi.d V1;
    public l41 W1;
    public boolean X1;
    public Boolean Y1;
    public int Z1;
    public int a2;
    public int b2;

    public i0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, r2 r2Var, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.P1 = tL_connectedBot;
        TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.Q1 = a22;
        this.B1 = org.telegram.messenger.g0.L(36.0f);
        this.r1 = 0.15f;
        a0 a0Var = new a0(activity, this.a, new h9(this, 24), f6Var);
        this.R1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.X1 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
        w8 w8Var = new w8((f6) null);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        w8Var.r(a22);
        l9Var.e(a22, w8Var);
        linearLayout.addView(l9Var, ha.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.V(textView, k6.G6, f6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(t10.p(a22));
        linearLayout.addView(textView, ha.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.l1.setTitle(t10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.y6, f6Var);
        k5.m(textView2, 17, null, 2131745563);
        linearLayout.addView(textView2, ha.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = t10.n(a22);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.V(textView3, k6.Uc, f6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ha.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = k6.a7;
        v0(k6.w0(i7, this.I0));
        P(i7);
        this.Z1 = this.G0;
        pj0 pj0Var = this.k1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.k1.r1();
        this.k1.setOnItemClickListener(new ai.k(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, k6.w0(i7, this.I0)), k6.w0(i7, this.I0), k6.w0(i7, this.I0)}));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.U1 = dVar;
        int w02 = k6.w0(k6.kk, this.I0);
        this.b2 = w02;
        dVar.setColor(w02);
        dVar.setText(id.M0(2131744208, null));
        dVar.setOnClickListener(new ah.g(this, tL_connectedBot, r2Var, 12));
        frameLayout.addView(dVar, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.V1 = dVar2;
        dVar2.setText(id.M0(2131752785, null));
        dVar2.setOnClickListener(new bi.r(20, this, tL_connectedBot));
        frameLayout.addView(dVar2, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = ha.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.t0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        l41 l41Var = this.W1;
        if (l41Var != null) {
            l41Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.na, org.telegram.ui.ActionBar.v2
    public final boolean G() {
        a0 a0Var = this.R1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean H() {
        a0 a0Var = this.R1;
        if (a0Var == null || !a0Var.g()) {
            return this.c0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.a, 0, true, new hi.u1(this, 7), this.I0);
        this.W1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.na
    public final void Q0(float f10) {
        org.telegram.ui.ActionBar.k5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z9) {
        a0 a0Var = this.R1;
        final boolean z10 = a0Var != null && a0Var.g();
        Boolean bool = this.Y1;
        if (bool == null || bool.booleanValue() != z10) {
            this.Y1 = Boolean.valueOf(z10);
            fi.d dVar = this.U1;
            fi.d dVar2 = this.V1;
            if (z9) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(320L);
                xq xqVar = xq.h;
                final int i7 = 0;
                duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: kg.h0
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z11 = z10;
                                i0 i0Var = this.b;
                                if (!z11) {
                                    i0Var.V1.setVisibility(8);
                                    break;
                                } else {
                                    i0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z12 = z10;
                                i0 i0Var2 = this.b;
                                if (!z12) {
                                    i0Var2.getClass();
                                    break;
                                } else {
                                    i0Var2.U1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: kg.h0
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                i0 i0Var = this.b;
                                if (!z11) {
                                    i0Var.V1.setVisibility(8);
                                    break;
                                } else {
                                    i0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z12 = z10;
                                i0 i0Var2 = this.b;
                                if (!z12) {
                                    i0Var2.getClass();
                                    break;
                                } else {
                                    i0Var2.U1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                return;
            }
            dVar2.setVisibility(z10 ? 0 : 8);
            dVar2.animate().cancel();
            dVar2.setAlpha(z10 ? 1.0f : 0.0f);
            dVar2.setScaleX(z10 ? 1.0f : 0.8f);
            dVar2.setScaleY(z10 ? 1.0f : 0.8f);
            dVar.setVisibility(z10 ? 8 : 0);
            dVar.animate().cancel();
            dVar.setAlpha(z10 ? 0.0f : 1.0f);
            dVar.setScaleX(!z10 ? 1.0f : 0.8f);
            dVar.setScaleY(z10 ? 0.8f : 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = k6.a7;
            int w02 = k6.w0(i10, this.I0);
            if (w02 != this.a2) {
                this.a2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.T1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = k6.w0(k6.kk, this.I0);
            fi.d dVar = this.U1;
            if (dVar != null && w03 != this.b2) {
                this.b2 = w03;
                dVar.setColor(w03);
            }
            int w04 = k6.w0(i10, this.I0);
            if (this.F0 >= 0 || (i7 = this.G0) != this.Z1 || w04 == i7) {
                return;
            }
            this.G0 = w04;
            this.Z1 = w04;
            E0(w04);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
