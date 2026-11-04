package lg;

import ai.j6;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import gi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.o2;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j0 extends ma {
    public static final int d2 = -1;
    public static final int e2 = -2;
    public final TL_account.TL_connectedBot Q1;
    public final TLRPC.User R1;
    public final b0 S1;
    public final LinearLayout T1;
    public final FrameLayout U1;
    public final gi.d V1;
    public final gi.d W1;
    public f41 X1;
    public boolean Y1;
    public Boolean Z1;
    public int a2;
    public int b2;
    public int c2;

    public j0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, o2 o2Var, e6 e6Var) {
        super(2, (Context) activity, e6Var, false);
        this.Q1 = tL_connectedBot;
        TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.R1 = a22;
        this.C1 = org.telegram.messenger.g0.L(36.0f);
        this.s1 = 0.15f;
        b0 b0Var = new b0(activity, this.a, new n(this, 1), e6Var);
        this.S1 = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.Y1 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        u8 u8Var = new u8((e6) null);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        u8Var.r(a22);
        k9Var.e(a22, u8Var);
        linearLayout.addView(k9Var, mf.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.V(textView, k6.G6, e6Var);
        int i3 = 17;
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(l10.p(a22));
        linearLayout.addView(textView, mf.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.m1.setTitle(l10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.y6, e6Var);
        k5.m(textView2, 17, null, 2131745570);
        linearLayout.addView(textView2, mf.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n4 = l10.n(a22);
        if (!TextUtils.isEmpty(n4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.V(textView3, k6.Uc, e6Var);
            textView3.setText("@" + n4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, mf.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = k6.a7;
        v0(k6.w0(i10, this.J0));
        P(i10);
        this.a2 = this.H0;
        tj0 tj0Var = this.l1;
        int i11 = this.u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(72.0f));
        this.l1.r1();
        this.l1.setOnItemClickListener(new j6(this, i3));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.U1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, k6.w0(i10, this.J0)), k6.w0(i10, this.J0), k6.w0(i10, this.J0)}));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.V1 = dVar;
        int w02 = k6.w0(k6.kk, this.J0);
        this.c2 = w02;
        dVar.setColor(w02);
        dVar.setText(bd.M0(2131744215, null));
        dVar.setOnClickListener(new ai.h(this, tL_connectedBot, o2Var, i3));
        frameLayout.addView(dVar, mf.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.W1 = dVar2;
        dVar2.setText(bd.M0(2131752785, null));
        dVar2.setOnClickListener(new ai.d(26, this, tL_connectedBot));
        frameLayout.addView(dVar2, mf.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = mf.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.b.addView(frameLayout, e10);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        f41 f41Var = this.X1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.t2
    public final boolean G() {
        b0 b0Var = this.S1;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H() {
        b0 b0Var = this.S1;
        if (b0Var == null || !b0Var.g()) {
            return this.d0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new q4(this, 17), this.J0);
        this.X1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ma
    public final void Q0(float f10) {
        org.telegram.ui.ActionBar.k5 titleTextView = this.m1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z10) {
        b0 b0Var = this.S1;
        final boolean z11 = b0Var != null && b0Var.g();
        Boolean bool = this.Z1;
        if (bool == null || bool.booleanValue() != z11) {
            this.Z1 = Boolean.valueOf(z11);
            gi.d dVar = this.V1;
            gi.d dVar2 = this.W1;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                xq xqVar = xq.h;
                final int i3 = 0;
                duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: lg.i0
                    public final /* synthetic */ j0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                boolean z12 = z11;
                                j0 j0Var = this.b;
                                if (!z12) {
                                    j0Var.W1.setVisibility(8);
                                    break;
                                } else {
                                    j0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                j0 j0Var2 = this.b;
                                if (!z13) {
                                    j0Var2.getClass();
                                    break;
                                } else {
                                    j0Var2.V1.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: lg.i0
                    public final /* synthetic */ j0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                j0 j0Var = this.b;
                                if (!z12) {
                                    j0Var.W1.setVisibility(8);
                                    break;
                                } else {
                                    j0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                j0 j0Var2 = this.b;
                                if (!z13) {
                                    j0Var2.getClass();
                                    break;
                                } else {
                                    j0Var2.V1.setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int i3;
        try {
            super.s0();
            int i10 = k6.a7;
            int w02 = k6.w0(i10, this.J0);
            if (w02 != this.b2) {
                this.b2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.U1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = k6.w0(k6.kk, this.J0);
            gi.d dVar = this.V1;
            if (dVar != null && w03 != this.c2) {
                this.c2 = w03;
                dVar.setColor(w03);
            }
            int w04 = k6.w0(i10, this.J0);
            if (this.G0 >= 0 || (i3 = this.H0) != this.a2 || w04 == i3) {
                return;
            }
            this.H0 = w04;
            this.a2 = w04;
            E0(w04);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
