package kg;

import ai.y2;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k8;
import c8.ma;
import hi.d7;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k0 extends sa {
    public static final int g2 = -1;
    public static final int h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final b0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public final hi.e Z1;
    public c51 a2;
    public boolean b2;
    public Boolean c2;
    public int d2;
    public int e2;
    public int f2;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, jw0 jw0Var, h6 h6Var) {
        super(2, (Context) activity, h6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User c22 = np.u1(this.a).c2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = c22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.v1 = 0.15f;
        b0 b0Var = new b0(activity, this.a, new i0(this, 0), h6Var);
        this.V1 = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.b2 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        b9 b9Var = new b9((h6) null);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout.addView(q9Var, ma.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        t6.U(textView, m6.G6, h6Var);
        int i7 = 17;
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(p10.q(c22));
        linearLayout.addView(textView, ma.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.p1.setTitle(p10.q(c22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.y6, h6Var);
        f3.k(textView2, 17, null, 2131745364);
        linearLayout.addView(textView2, ma.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o4 = p10.o(c22);
        if (!TextUtils.isEmpty(o4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            t6.U(textView3, m6.Xc, h6Var);
            textView3.setText("@" + o4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ma.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = m6.a7;
        v0(m6.w0(i10, this.J0));
        Q(i10);
        this.d2 = this.H0;
        ek0 ek0Var = this.o1;
        int i11 = this.u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(72.0f));
        this.o1.r1();
        this.o1.setOnItemClickListener(new k8(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, m6.w0(i10, this.J0)), m6.w0(i10, this.J0), m6.w0(i10, this.J0)}));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        this.Y1 = eVar;
        int w02 = m6.w0(m6.nk, this.J0);
        this.f2 = w02;
        eVar.setColor(w02);
        eVar.setText(hd.N0(2131743962, null));
        eVar.setOnClickListener(new ah.h(this, tL_connectedBot, jw0Var, i7));
        frameLayout.addView(eVar, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.e eVar2 = new hi.e(activity, h6Var, true);
        eVar2.setRoundRadius(24);
        this.Z1 = eVar2;
        eVar2.setText(hd.N0(2131752773, null));
        eVar2.setOnClickListener(new y2(25, this, tL_connectedBot));
        frameLayout.addView(eVar2, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        e1(false);
        FrameLayout.LayoutParams e10 = ma.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        c51 c51Var = this.a2;
        if (c51Var != null) {
            c51Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.w2
    public final boolean G() {
        b0 b0Var = this.V1;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I() {
        b0 b0Var = this.V1;
        if (b0Var == null || !b0Var.g()) {
            return this.d0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.a, 0, true, new d7(this, 9), this.J0);
        this.a2 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sa
    public final void R0(float f10) {
        m5 titleTextView = this.p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void e1(boolean z10) {
        b0 b0Var = this.V1;
        final boolean z11 = b0Var != null && b0Var.g();
        Boolean bool = this.c2;
        if (bool == null || bool.booleanValue() != z11) {
            this.c2 = Boolean.valueOf(z11);
            hi.e eVar = this.Y1;
            hi.e eVar2 = this.Z1;
            if (z10) {
                eVar2.setVisibility(0);
                ViewPropertyAnimator duration = eVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                nr nrVar = nr.h;
                final int i7 = 0;
                duration.setInterpolator(nrVar).withEndAction(new Runnable(this) { // from class: kg.j0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z12 = z11;
                                k0 k0Var = this.b;
                                if (!z12) {
                                    k0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    k0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                k0 k0Var2 = this.b;
                                if (!z13) {
                                    k0Var2.getClass();
                                    break;
                                } else {
                                    k0Var2.Y1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                eVar.setVisibility(0);
                final int i10 = 1;
                eVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(nrVar).withEndAction(new Runnable(this) { // from class: kg.j0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                k0 k0Var = this.b;
                                if (!z12) {
                                    k0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    k0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                k0 k0Var2 = this.b;
                                if (!z13) {
                                    k0Var2.getClass();
                                    break;
                                } else {
                                    k0Var2.Y1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                return;
            }
            eVar2.setVisibility(z11 ? 0 : 8);
            eVar2.animate().cancel();
            eVar2.setAlpha(z11 ? 1.0f : 0.0f);
            eVar2.setScaleX(z11 ? 1.0f : 0.8f);
            eVar2.setScaleY(z11 ? 1.0f : 0.8f);
            eVar.setVisibility(z11 ? 8 : 0);
            eVar.animate().cancel();
            eVar.setAlpha(z11 ? 0.0f : 1.0f);
            eVar.setScaleX(!z11 ? 1.0f : 0.8f);
            eVar.setScaleY(z11 ? 0.8f : 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = m6.a7;
            int w02 = m6.w0(i10, this.J0);
            if (w02 != this.e2) {
                this.e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = m6.w0(m6.nk, this.J0);
            hi.e eVar = this.Y1;
            if (eVar != null && w03 != this.f2) {
                this.f2 = w03;
                eVar.setColor(w03);
            }
            int w04 = m6.w0(i10, this.J0);
            if (this.G0 >= 0 || (i7 = this.H0) != this.d2 || w04 == i7) {
                return;
            }
            this.H0 = w04;
            this.d2 = w04;
            E0(w04);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
