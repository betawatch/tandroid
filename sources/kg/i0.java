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
import fi.v9;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i0 extends ma {
    public static final int f2 = -1;
    public static final int g2 = -2;
    public final TL_account.TL_connectedBot S1;
    public final TLRPC.User T1;
    public final a0 U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final fi.d X1;
    public final fi.d Y1;
    public m41 Z1;
    public boolean a2;
    public Boolean b2;
    public int c2;
    public int d2;
    public int e2;

    public i0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, q2 q2Var, h6 h6Var) {
        super(2, (Context) activity, h6Var, false);
        this.S1 = tL_connectedBot;
        TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.T1 = a22;
        this.E1 = org.telegram.messenger.g0.L(36.0f);
        this.u1 = 0.15f;
        a0 a0Var = new a0(activity, this.a, new v9(this, 23), h6Var);
        this.U1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.a2 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        v8 v8Var = new v8((h6) null);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        v8Var.r(a22);
        k9Var.e(a22, v8Var);
        linearLayout.addView(k9Var, ha.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        t6.U(textView, m6.G6, h6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(t10.p(a22));
        linearLayout.addView(textView, ha.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.o1.setTitle(t10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.y6, h6Var);
        k5.m(textView2, 17, null, 2131745560);
        linearLayout.addView(textView2, ha.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = t10.n(a22);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            t6.U(textView3, m6.Uc, h6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ha.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = m6.a7;
        v0(m6.w0(i7, this.I0));
        P(i7);
        this.c2 = this.G0;
        pj0 pj0Var = this.n1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.n1.r1();
        this.n1.setOnItemClickListener(new ai.k(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, m6.w0(i7, this.I0)), m6.w0(i7, this.I0), m6.w0(i7, this.I0)}));
        fi.d dVar = new fi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.X1 = dVar;
        int w02 = m6.w0(m6.kk, this.I0);
        this.e2 = w02;
        dVar.setColor(w02);
        dVar.setText(id.M0(2131744205, null));
        dVar.setOnClickListener(new ah.g(this, tL_connectedBot, q2Var, 12));
        frameLayout.addView(dVar, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        fi.d dVar2 = new fi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        this.Y1 = dVar2;
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
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        m41 m41Var = this.Z1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.w2
    public final boolean G() {
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H() {
        a0 a0Var = this.U1;
        if (a0Var == null || !a0Var.g()) {
            return this.c0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new hi.u1(this, 7), this.I0);
        this.Z1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ma
    public final void Q0(float f10) {
        m5 titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z9) {
        a0 a0Var = this.U1;
        final boolean z10 = a0Var != null && a0Var.g();
        Boolean bool = this.b2;
        if (bool == null || bool.booleanValue() != z10) {
            this.b2 = Boolean.valueOf(z10);
            fi.d dVar = this.X1;
            fi.d dVar2 = this.Y1;
            if (z9) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(320L);
                wq wqVar = wq.h;
                final int i7 = 0;
                duration.setInterpolator(wqVar).withEndAction(new Runnable(this) { // from class: kg.h0
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
                                    i0Var.Y1.setVisibility(8);
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
                                    i0Var2.X1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(wqVar).withEndAction(new Runnable(this) { // from class: kg.h0
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
                                    i0Var.Y1.setVisibility(8);
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
                                    i0Var2.X1.setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = m6.a7;
            int w02 = m6.w0(i10, this.I0);
            if (w02 != this.d2) {
                this.d2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.W1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = m6.w0(m6.kk, this.I0);
            fi.d dVar = this.X1;
            if (dVar != null && w03 != this.e2) {
                this.e2 = w03;
                dVar.setColor(w03);
            }
            int w04 = m6.w0(i10, this.I0);
            if (this.F0 >= 0 || (i7 = this.G0) != this.c2 || w04 == i7) {
                return;
            }
            this.G0 = w04;
            this.c2 = w04;
            E0(w04);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
