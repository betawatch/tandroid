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
import bi.b6;
import hi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i0 extends ja {
    public static final int g2 = -1;
    public static final int h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final a0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public final hi.d Z1;
    public p41 a2;
    public boolean b2;
    public Boolean c2;
    public int d2;
    public int e2;
    public int f2;

    public i0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, a2 a2Var, e6 e6Var) {
        super(2, (Context) activity, e6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = a22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.v1 = 0.15f;
        a0 a0Var = new a0(activity, this.a, new hi.e1(this, 26), e6Var);
        this.V1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.b2 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        t8 t8Var = new t8((e6) null);
        i9 i9Var = new i9(activity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        t8Var.r(a22);
        i9Var.f(a22, t8Var);
        linearLayout.addView(i9Var, c8.ja.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        q6.U(textView, j6.G6, e6Var);
        int i7 = 17;
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(q10.p(a22));
        linearLayout.addView(textView, c8.ja.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.p1.setTitle(q10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        q6.U(textView2, j6.y6, e6Var);
        k5.l(textView2, 17, null, 2131745560);
        linearLayout.addView(textView2, c8.ja.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = q10.n(a22);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            q6.U(textView3, j6.Xc, e6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, c8.ja.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.a7;
        v0(j6.w0(i10, this.J0));
        Q(i10);
        this.d2 = this.H0;
        uj0 uj0Var = this.o1;
        int i11 = this.u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(72.0f));
        this.o1.r1();
        this.o1.setOnItemClickListener(new b6(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.r1(0.0f, j6.w0(i10, this.J0)), j6.w0(i10, this.J0), j6.w0(i10, this.J0)}));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.Y1 = dVar;
        int w02 = j6.w0(j6.nk, this.J0);
        this.f2 = w02;
        dVar.setColor(w02);
        dVar.setText(hd.M0(2131744205, null));
        dVar.setOnClickListener(new ah.g(this, tL_connectedBot, a2Var, i7));
        frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.d dVar2 = new hi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.Z1 = dVar2;
        dVar2.setText(hd.M0(2131752785, null));
        dVar2.setOnClickListener(new v2(24, this, tL_connectedBot));
        frameLayout.addView(dVar2, c8.ja.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        p41 p41Var = this.a2;
        if (p41Var != null) {
            p41Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.ActionBar.u2
    public final boolean H() {
        a0 a0Var = this.V1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean I() {
        a0 a0Var = this.V1;
        if (a0Var == null || !a0Var.g()) {
            return this.d0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new q4(this, 9), this.J0);
        this.a2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ja
    public final void Q0(float f10) {
        j5 titleTextView = this.p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z10) {
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
                er erVar = er.h;
                final int i7 = 0;
                duration.setInterpolator(erVar).withEndAction(new Runnable(this) { // from class: kg.h0
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                boolean z12 = z11;
                                i0 i0Var = this.b;
                                if (!z12) {
                                    i0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    i0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                i0 i0Var2 = this.b;
                                if (!z13) {
                                    i0Var2.getClass();
                                    break;
                                } else {
                                    i0Var2.Y1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(erVar).withEndAction(new Runnable(this) { // from class: kg.h0
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                i0 i0Var = this.b;
                                if (!z12) {
                                    i0Var.Z1.setVisibility(8);
                                    break;
                                } else {
                                    i0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                i0 i0Var2 = this.b;
                                if (!z13) {
                                    i0Var2.getClass();
                                    break;
                                } else {
                                    i0Var2.Y1.setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = j6.a7;
            int w02 = j6.w0(i10, this.J0);
            if (w02 != this.e2) {
                this.e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = j6.w0(j6.nk, this.J0);
            hi.d dVar = this.Y1;
            if (dVar != null && w03 != this.f2) {
                this.f2 = w03;
                dVar.setColor(w03);
            }
            int w04 = j6.w0(i10, this.J0);
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
