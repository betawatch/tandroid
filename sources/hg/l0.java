package hg;

import ai.s5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class l0 extends cb {
    public static final int g0 = -1;
    public static final int h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final b0 Z;
    public final LinearLayout a0;
    public final ci.d b0;
    public final ci.d c0;
    public w61 d0;
    public boolean e0;
    public Boolean f0;

    public l0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, ld ldVar, d6 d6Var) {
        super(2, (Context) activity, d6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        b0 b0Var = new b0(activity, this.currentAccount, new qc(this, 20), d6Var);
        this.Z = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.e0 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a0 = linearLayout;
        linearLayout.setOrientation(1);
        h9 h9Var = new h9((d6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout.addView(w9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(i6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(i6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(i6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = i6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        zl0 zl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.r1();
        this.d.setOnItemClickListener(new ai.g(this, 11));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setColor(getThemedColor(i6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.d0(this, tL_connectedBot, ldVar, 8));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ci.d dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.f2(11, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        R(false);
        FrameLayout.LayoutParams e7 = z5.e(-1, -2, 80);
        int i12 = e7.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e7.leftMargin = i12 + i13;
        e7.rightMargin += i13;
        this.containerView.addView(frameLayout, e7);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        w61 w61Var = this.d0;
        if (w61Var != null) {
            w61Var.N(false);
        }
    }

    public static void N(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        g.a(l0Var.currentAccount).b();
        l0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 U = LaunchActivity.U();
        if (U != null) {
            c.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(l0Var.Y)}, yc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void O(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot) {
        b0 b0Var = l0Var.Z;
        ci.d dVar = l0Var.c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(l0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = b0Var.b();
        ConnectionsManager.getInstance(l0Var.currentAccount).sendRequest(updateconnectedbot, new s5(l0Var, tL_connectedBot, b0Var.c(), 5));
    }

    public static /* synthetic */ void P(l0 l0Var, ld ldVar) {
        g.a(l0Var.currentAccount).b();
        ldVar.run();
        l0Var.dismiss();
    }

    public static void Q(l0 l0Var, TL_account.TL_connectedBot tL_connectedBot, ld ldVar) {
        ci.d dVar = l0Var.b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(l0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(l0Var.currentAccount).sendRequest(updateconnectedbot, new ai.v1(14, l0Var, ldVar));
    }

    @Override // org.telegram.ui.Components.cb
    public final void A(float f7) {
        i5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void R(boolean z10) {
        b0 b0Var = this.Z;
        final boolean z11 = b0Var != null && b0Var.g();
        Boolean bool = this.f0;
        if (bool == null || bool.booleanValue() != z11) {
            this.f0 = Boolean.valueOf(z11);
            ci.d dVar = this.b0;
            ci.d dVar2 = this.c0;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                tr trVar = tr.h;
                final int i10 = 0;
                duration.setInterpolator(trVar).withEndAction(new Runnable(this) { // from class: hg.k0
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
                                    l0Var.c0.setVisibility(8);
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
                                    l0Var2.b0.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(trVar).withEndAction(new Runnable(this) { // from class: hg.k0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                l0 l0Var = this.b;
                                if (!z12) {
                                    l0Var.c0.setVisibility(8);
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
                                    l0Var2.b0.setVisibility(8);
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

    @Override // org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        b0 b0Var = this.Z;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        b0 b0Var = this.Z;
        if (b0Var == null || !b0Var.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(zl0Var, getContext(), this.currentAccount, 0, true, new bi.v(this, 23), this.resourcesProvider);
        this.d0 = w61Var;
        w61Var.r = false;
        return w61Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return null;
    }
}
