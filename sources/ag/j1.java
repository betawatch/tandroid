package ag;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j1 extends ha {
    public static final int c2 = -1;
    public static final int d2 = -2;
    public final TL_account.TL_connectedBot P1;
    public final TLRPC.User Q1;
    public final x0 R1;
    public final LinearLayout S1;
    public final FrameLayout T1;
    public final vh.d U1;
    public final vh.d V1;
    public p51 W1;
    public boolean X1;
    public Boolean Y1;
    public int Z1;
    public int a2;
    public int b2;

    public j1(Activity activity, TL_account.TL_connectedBot tL_connectedBot, qq qqVar, p6 p6Var) {
        super(2, (Context) activity, p6Var, false);
        this.P1 = tL_connectedBot;
        TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(tL_connectedBot.bot_id));
        this.Q1 = Z1;
        this.B1 = org.telegram.messenger.i0.L(36.0f);
        this.r1 = 0.15f;
        x0 x0Var = new x0(activity, this.a, new a3.d(this, 5), p6Var);
        this.R1 = x0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.X1 = tL_businessBotRecipients.exclude_selected;
        x0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.S1 = linearLayout;
        int i10 = 1;
        linearLayout.setOrientation(1);
        r8 r8Var = new r8((p6) null);
        g9 g9Var = new g9(activity);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(40.0f));
        r8Var.r(Z1);
        g9Var.e(Z1, r8Var);
        linearLayout.addView(g9Var, b6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        a7.V(textView, t6.G6, p6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(h20.p(Z1));
        linearLayout.addView(textView, b6.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.l1.setTitle(h20.p(Z1));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, t6.y6, p6Var);
        m5.l(textView2, 17, null, 2131745577);
        linearLayout.addView(textView2, b6.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = h20.n(Z1);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            a7.V(textView3, t6.Uc, p6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, b6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i11 = t6.a7;
        v0(t6.w0(i11, this.I0));
        Q(i11);
        this.Z1 = this.G0;
        tk0 tk0Var = this.k1;
        int i12 = this.t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(72.0f));
        this.k1.r1();
        this.k1.setOnItemClickListener(new y0(this, i10));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{t6.r1(0.0f, t6.w0(i11, this.I0)), t6.w0(i11, this.I0), t6.w0(i11, this.I0)}));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        this.U1 = dVar;
        int w02 = t6.w0(t6.kk, this.I0);
        this.b2 = w02;
        dVar.setColor(w02);
        dVar.setText(cd.L0(2131744230, null));
        dVar.setOnClickListener(new i(this, tL_connectedBot, qqVar, i10));
        frameLayout.addView(dVar, b6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        vh.d dVar2 = new vh.d(activity, p6Var, true);
        dVar2.setRoundRadius(24);
        this.V1 = dVar2;
        dVar2.setText(cd.L0(2131752785, null));
        dVar2.setOnClickListener(new t0(i10, this, tL_connectedBot));
        frameLayout.addView(dVar2, b6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e = b6.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.t0;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.b.addView(frameLayout, e);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        p51 p51Var = this.W1;
        if (p51Var != null) {
            p51Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.ha, org.telegram.ui.ActionBar.z2
    public final boolean H() {
        x0 x0Var = this.R1;
        if (x0Var != null) {
            x0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean I() {
        x0 x0Var = this.R1;
        if (x0Var == null || !x0Var.g()) {
            return this.c0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, true, new a(this, 2), this.I0);
        this.W1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ha
    public final void Q0(float f7) {
        u5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void d1(boolean z10) {
        x0 x0Var = this.R1;
        final boolean z11 = x0Var != null && x0Var.g();
        Boolean bool = this.Y1;
        if (bool == null || bool.booleanValue() != z11) {
            this.Y1 = Boolean.valueOf(z11);
            vh.d dVar = this.U1;
            vh.d dVar2 = this.V1;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                gr grVar = gr.h;
                final int i10 = 0;
                duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: ag.i1
                    public final /* synthetic */ j1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                j1 j1Var = this.b;
                                if (!z12) {
                                    j1Var.V1.setVisibility(8);
                                    break;
                                } else {
                                    j1Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                j1 j1Var2 = this.b;
                                if (!z13) {
                                    j1Var2.getClass();
                                    break;
                                } else {
                                    j1Var2.U1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: ag.i1
                    public final /* synthetic */ j1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                j1 j1Var = this.b;
                                if (!z12) {
                                    j1Var.V1.setVisibility(8);
                                    break;
                                } else {
                                    j1Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                j1 j1Var2 = this.b;
                                if (!z13) {
                                    j1Var2.getClass();
                                    break;
                                } else {
                                    j1Var2.U1.setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int i10;
        try {
            super.s0();
            int i11 = t6.a7;
            int w02 = t6.w0(i11, this.I0);
            if (w02 != this.a2) {
                this.a2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.T1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{t6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = t6.w0(t6.kk, this.I0);
            vh.d dVar = this.U1;
            if (dVar != null && w03 != this.b2) {
                this.b2 = w03;
                dVar.setColor(w03);
            }
            int w04 = t6.w0(i11, this.I0);
            if (this.F0 >= 0 || (i10 = this.G0) != this.Z1 || w04 == i10) {
                return;
            }
            this.G0 = w04;
            this.Z1 = w04;
            E0(w04);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
