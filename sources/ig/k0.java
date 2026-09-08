package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.c5;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k0 extends bb {
    public static final int g0 = -1;
    public static final int h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout a0;
    public final di.d b0;
    public final di.d c0;
    public v51 d0;
    public boolean e0;
    public Boolean f0;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, m8 m8Var, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new nb(this, 29), f6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.e0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a0 = linearLayout;
        linearLayout.setOrientation(1);
        i9 i9Var = new i9((f6) null);
        x9 x9Var = new x9(activity);
        x9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        i9Var.r(user);
        x9Var.e(user, i9Var);
        linearLayout.addView(x9Var, x5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(j6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, x5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(j6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, x5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(j6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, x5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        ll0 ll0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.o1();
        this.d.setOnItemClickListener(new bi.d(this, 11));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        di.d dVar = new di.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setColor(getThemedColor(j6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new bi.x(this, tL_connectedBot, m8Var, 8));
        frameLayout.addView(dVar, x5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        di.d dVar2 = new di.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new bi.u1(11, this, tL_connectedBot));
        frameLayout.addView(dVar2, x5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e7 = x5.e(-1, -2, 80);
        int i12 = e7.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e7.leftMargin = i12 + i13;
        e7.rightMargin += i13;
        this.containerView.addView(frameLayout, e7);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        v51 v51Var = this.d0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    public static void P(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(k0Var.currentAccount).b();
        k0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 U = LaunchActivity.U();
        if (U != null) {
            i2.g.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(k0Var.Y)}, yc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = k0Var.Z;
        di.d dVar = k0Var.c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new c5(k0Var, tL_connectedBot, a0Var.c(), 5));
    }

    public static /* synthetic */ void R(k0 k0Var, m8 m8Var) {
        f.a(k0Var.currentAccount).b();
        m8Var.run();
        k0Var.dismiss();
    }

    public static void S(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, m8 m8Var) {
        di.d dVar = k0Var.b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new bi.m1(14, k0Var, m8Var));
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(float f7) {
        j5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void T(boolean z10) {
        a0 a0Var = this.Z;
        final boolean z11 = a0Var != null && a0Var.g();
        Boolean bool = this.f0;
        if (bool == null || bool.booleanValue() != z11) {
            this.f0 = Boolean.valueOf(z11);
            di.d dVar = this.b0;
            di.d dVar2 = this.c0;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                pr prVar = pr.h;
                final int i10 = 0;
                duration.setInterpolator(prVar).withEndAction(new Runnable(this) { // from class: ig.j0
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
                                    k0Var.c0.setVisibility(8);
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
                                    k0Var2.b0.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(prVar).withEndAction(new Runnable(this) { // from class: ig.j0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                k0 k0Var = this.b;
                                if (!z12) {
                                    k0Var.c0.setVisibility(8);
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
                                    k0Var2.b0.setVisibility(8);
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

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        a0 a0Var = this.Z;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        a0 a0Var = this.Z;
        if (a0Var == null || !a0Var.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new ci.u(this, 23), this.resourcesProvider);
        this.d0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return null;
    }
}
