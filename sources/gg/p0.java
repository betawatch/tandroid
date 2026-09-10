package gg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.n3;
import bi.wa;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zd;
import org.telegram.ui.LaunchActivity;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p0 extends ab {
    public static final int g0 = -1;
    public static final int h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final e0 Z;
    public final LinearLayout a0;
    public final bi.d b0;
    public final bi.d c0;
    public j61 d0;
    public boolean e0;
    public Boolean f0;

    public p0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, zd zdVar, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        e0 e0Var = new e0(activity, this.currentAccount, new wc(this, 26), f6Var);
        this.Z = e0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.e0 = tL_businessBotRecipients.exclude_selected;
        e0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a0 = linearLayout;
        linearLayout.setOrientation(1);
        g9 g9Var = new g9((f6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        g9Var.r(user);
        w9Var.e(user, g9Var);
        linearLayout.addView(w9Var, a6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(j6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, a6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(j6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, a6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(j6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, a6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.o1();
        this.d.setOnItemClickListener(new ai.g(this, 10));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        bi.d dVar = new bi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setColor(getThemedColor(j6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new bi.q(this, tL_connectedBot, zdVar, 4));
        frameLayout.addView(dVar, a6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.d dVar2 = new bi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new n3(7, this, tL_connectedBot));
        frameLayout.addView(dVar2, a6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e = a6.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        j61 j61Var = this.d0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(p0Var.currentAccount).b();
        p0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        p2 U = LaunchActivity.U();
        if (U != null) {
            com.google.android.gms.internal.vision.e2.o(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(p0Var.Y)}, org.telegram.ui.Components.wc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot) {
        e0 e0Var = p0Var.Z;
        bi.d dVar = p0Var.c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(p0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = e0Var.b();
        ConnectionsManager.getInstance(p0Var.currentAccount).sendRequest(updateconnectedbot, new wa(p0Var, tL_connectedBot, e0Var.c(), 4));
    }

    public static /* synthetic */ void R(p0 p0Var, zd zdVar) {
        f.a(p0Var.currentAccount).b();
        zdVar.run();
        p0Var.dismiss();
    }

    public static void S(p0 p0Var, TL_account.TL_connectedBot tL_connectedBot, zd zdVar) {
        bi.d dVar = p0Var.b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(p0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(p0Var.currentAccount).sendRequest(updateconnectedbot, new bi.o2(9, p0Var, zdVar));
    }

    @Override // org.telegram.ui.Components.ab
    public final void A(float f7) {
        l5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void T(boolean z10) {
        e0 e0Var = this.Z;
        final boolean z11 = e0Var != null && e0Var.g();
        Boolean bool = this.f0;
        if (bool == null || bool.booleanValue() != z11) {
            this.f0 = Boolean.valueOf(z11);
            bi.d dVar = this.b0;
            bi.d dVar2 = this.c0;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                wr wrVar = wr.h;
                final int i10 = 0;
                duration.setInterpolator(wrVar).withEndAction(new Runnable(this) { // from class: gg.o0
                    public final /* synthetic */ p0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                p0 p0Var = this.b;
                                if (!z12) {
                                    p0Var.c0.setVisibility(8);
                                    break;
                                } else {
                                    p0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                p0 p0Var2 = this.b;
                                if (!z13) {
                                    p0Var2.getClass();
                                    break;
                                } else {
                                    p0Var2.b0.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(wrVar).withEndAction(new Runnable(this) { // from class: gg.o0
                    public final /* synthetic */ p0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                p0 p0Var = this.b;
                                if (!z12) {
                                    p0Var.c0.setVisibility(8);
                                    break;
                                } else {
                                    p0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                p0 p0Var2 = this.b;
                                if (!z13) {
                                    p0Var2.getClass();
                                    break;
                                } else {
                                    p0Var2.b0.setVisibility(8);
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

    @Override // org.telegram.ui.Components.ab, org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        e0 e0Var = this.Z;
        if (e0Var != null) {
            e0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        e0 e0Var = this.Z;
        if (e0Var == null || !e0Var.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new ai.c0(this, 23), this.resourcesProvider);
        this.d0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return null;
    }
}
