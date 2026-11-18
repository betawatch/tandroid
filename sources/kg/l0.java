package kg;

import ai.v2;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i8;
import c8.ma;
import hi.e7;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l0 extends sa {
    public static final int g2 = -1;
    public static final int h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final a0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public final hi.d Z1;
    public z41 a2;
    public boolean b2;
    public Boolean c2;
    public int d2;
    public int e2;
    public int f2;

    public l0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, jw0 jw0Var, i6 i6Var) {
        super(2, (Context) activity, i6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = c22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.v1 = 0.15f;
        a0 a0Var = new a0(activity, this.a, new j0(this, 0), i6Var);
        this.V1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.b2 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        b9 b9Var = new b9((i6) null);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout.addView(q9Var, ma.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        u6.U(textView, n6.G6, i6Var);
        int i7 = 17;
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(o10.q(c22));
        linearLayout.addView(textView, ma.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.p1.setTitle(o10.q(c22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.y6, i6Var);
        f3.k(textView2, 17, null, 2131745365);
        linearLayout.addView(textView2, ma.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o4 = o10.o(c22);
        if (!TextUtils.isEmpty(o4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            u6.U(textView3, n6.Xc, i6Var);
            textView3.setText("@" + o4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ma.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = n6.a7;
        v0(n6.w0(i10, this.J0));
        Q(i10);
        this.d2 = this.H0;
        ck0 ck0Var = this.o1;
        int i11 = this.u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(72.0f));
        this.o1.r1();
        this.o1.setOnItemClickListener(new i8(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, n6.w0(i10, this.J0)), n6.w0(i10, this.J0), n6.w0(i10, this.J0)}));
        hi.d dVar = new hi.d(activity, i6Var, true);
        dVar.setRoundRadius(24);
        this.Y1 = dVar;
        int w02 = n6.w0(n6.nk, this.J0);
        this.f2 = w02;
        dVar.setColor(w02);
        dVar.setText(gd.M0(2131743970, null));
        dVar.setOnClickListener(new ah.h(this, tL_connectedBot, jw0Var, i7));
        frameLayout.addView(dVar, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.d dVar2 = new hi.d(activity, i6Var, true);
        dVar2.setRoundRadius(24);
        this.Z1 = dVar2;
        dVar2.setText(gd.M0(2131752774, null));
        dVar2.setOnClickListener(new v2(26, this, tL_connectedBot));
        frameLayout.addView(dVar2, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
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
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        z41 z41Var = this.a2;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.x2
    public final boolean G() {
        a0 a0Var = this.V1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean I() {
        a0 a0Var = this.V1;
        if (a0Var == null || !a0Var.g()) {
            return this.d0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.a, 0, true, new e7(this, 9), this.J0);
        this.a2 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sa
    public final void R0(float f10) {
        n5 titleTextView = this.p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void e1(boolean z10) {
        a0 a0Var = this.V1;
        final boolean z11 = a0Var != null && a0Var.g();
        Boolean bool = this.c2;
        if (bool == null || bool.booleanValue() != z11) {
            this.c2 = Boolean.valueOf(z11);
            hi.d dVar = this.Y1;
            hi.d dVar2 = this.Z1;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                lr lrVar = lr.h;
                final int i7 = 0;
                duration.setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: kg.k0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z12 = z11;
                                l0 l0Var = this.b;
                                if (!z12) {
                                    l0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    l0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                l0 l0Var2 = this.b;
                                if (!z13) {
                                    l0Var2.getClass();
                                    break;
                                } else {
                                    l0Var2.Y1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: kg.k0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                l0 l0Var = this.b;
                                if (!z12) {
                                    l0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    l0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                l0 l0Var2 = this.b;
                                if (!z13) {
                                    l0Var2.getClass();
                                    break;
                                } else {
                                    l0Var2.Y1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                return;
            }
            dVar2.setVisibility(z11 ? 0 : 8);
            dVar2.animate().cancel();
            dVar2.setAlpha(z11 ? 1.0f : 0.0f);
            dVar2.setScaleX(z11 ? 1.0f : 0.8f);
            dVar2.setScaleY(z11 ? 1.0f : 0.8f);
            dVar.setVisibility(z11 ? 8 : 0);
            dVar.animate().cancel();
            dVar.setAlpha(z11 ? 0.0f : 1.0f);
            dVar.setScaleX(!z11 ? 1.0f : 0.8f);
            dVar.setScaleY(z11 ? 0.8f : 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = n6.a7;
            int w02 = n6.w0(i10, this.J0);
            if (w02 != this.e2) {
                this.e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = n6.w0(n6.nk, this.J0);
            hi.d dVar = this.Y1;
            if (dVar != null && w03 != this.f2) {
                this.f2 = w03;
                dVar.setColor(w03);
            }
            int w04 = n6.w0(i10, this.J0);
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
