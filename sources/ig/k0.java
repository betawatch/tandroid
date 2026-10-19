package ig;

import ai.j2;
import ai.wa;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k0 extends bb {
    public static final int g0 = -1;
    public static final int h0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout a0;
    public final ei.d b0;
    public final ei.d c0;
    public t61 d0;
    public boolean e0;
    public Boolean f0;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.e2 e2Var, d6 d6Var) {
        super(2, (Context) activity, d6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new bc(this, 19), d6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.e0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
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
        textView.setTextColor(getThemedColor(h6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(h6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(h6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = h6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new wa(this, 15));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{h6.m1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setColor(getThemedColor(h6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.v0(this, tL_connectedBot, e2Var, 11));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ei.d dVar2 = new ei.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.c0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.p(21, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        FrameLayout.LayoutParams e = z5.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        t61 t61Var = this.d0;
        if (t61Var != null) {
            t61Var.N(false);
        }
    }

    public static void Q(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(k0Var.currentAccount).b();
        k0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 U = LaunchActivity.U();
        if (U != null) {
            i2.e.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(k0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void R(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = k0Var.Z;
        ei.d dVar = k0Var.c0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new j2(k0Var, tL_connectedBot, a0Var.c(), 10));
    }

    public static /* synthetic */ void S(k0 k0Var, org.telegram.ui.Components.e2 e2Var) {
        f.a(k0Var.currentAccount).b();
        e2Var.run();
        k0Var.dismiss();
    }

    public static void T(k0 k0Var, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.e2 e2Var) {
        ei.d dVar = k0Var.b0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(k0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(updateconnectedbot, new ai.g(21, k0Var, e2Var));
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return null;
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(float f7) {
        j5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void U(boolean z10) {
        a0 a0Var = this.Z;
        final boolean z11 = a0Var != null && a0Var.g();
        Boolean bool = this.f0;
        if (bool == null || bool.booleanValue() != z11) {
            this.f0 = Boolean.valueOf(z11);
            ei.d dVar = this.b0;
            ei.d dVar2 = this.c0;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                bs bsVar = bs.h;
                final int i10 = 0;
                duration.setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ig.j0
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
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ig.j0
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
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, true, new hg.o(this, 4), this.resourcesProvider);
        this.d0 = t61Var;
        t61Var.r = false;
        return t61Var;
    }
}
