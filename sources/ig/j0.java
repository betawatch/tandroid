package ig;

import ai.j2;
import ai.xa;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j0 extends bb {
    public static final int k0 = -1;
    public static final int l0 = -2;
    public final TL_account.TL_connectedBot X;
    public final TLRPC.User Y;
    public final a0 Z;
    public final LinearLayout a0;
    public final FrameLayout b0;
    public final ei.d c0;
    public final ei.d d0;
    public b71 e0;
    public boolean f0;
    public Boolean g0;
    public int h0;
    public int i0;
    public int j0;

    public j0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.d2 d2Var, g6 g6Var) {
        super(2, (Context) activity, g6Var, false);
        this.X = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.Y = user;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        a0 a0Var = new a0(activity, this.currentAccount, new bc(this, 19), g6Var);
        this.Z = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f0 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a0 = linearLayout;
        linearLayout.setOrientation(1);
        h9 h9Var = new h9((g6) null);
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        h9Var.r(user);
        w9Var.e(user, h9Var);
        linearLayout.addView(w9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.W(textView, k6.G6, g6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.W(textView2, k6.y6, g6Var);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.W(textView3, k6.gc, g6Var);
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = k6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.h0 = this.navBarColor;
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.t1();
        this.d.setOnItemClickListener(new xa(this, 15));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.c0 = dVar;
        int themedColor = getThemedColor(k6.wj);
        this.j0 = themedColor;
        dVar.setColor(themedColor);
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ai.v0(this, tL_connectedBot, d2Var, 11));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ei.d dVar2 = new ei.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        this.d0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new ai.p(21, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
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
        b71 b71Var = this.e0;
        if (b71Var != null) {
            b71Var.N(false);
        }
    }

    public static void P(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(j0Var.currentAccount).b();
        j0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        o2 U = LaunchActivity.U();
        if (U != null) {
            i2.o1.t(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(j0Var.Y)}, xc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot) {
        a0 a0Var = j0Var.Z;
        ei.d dVar = j0Var.d0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(j0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = a0Var.b();
        ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(updateconnectedbot, new j2(j0Var, tL_connectedBot, a0Var.c(), 10));
    }

    public static /* synthetic */ void R(j0 j0Var, org.telegram.ui.Components.d2 d2Var) {
        f.a(j0Var.currentAccount).b();
        d2Var.run();
        j0Var.dismiss();
    }

    public static void S(j0 j0Var, TL_account.TL_connectedBot tL_connectedBot, org.telegram.ui.Components.d2 d2Var) {
        ei.d dVar = j0Var.c0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(j0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(updateconnectedbot, new ai.g(21, j0Var, d2Var));
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(float f7) {
        n5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
    }

    public final void T(boolean z10) {
        a0 a0Var = this.Z;
        final boolean z11 = a0Var != null && a0Var.g();
        Boolean bool = this.g0;
        if (bool == null || bool.booleanValue() != z11) {
            this.g0 = Boolean.valueOf(z11);
            ei.d dVar = this.c0;
            ei.d dVar2 = this.d0;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                bs bsVar = bs.h;
                final int i10 = 0;
                duration.setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ig.i0
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
                                    j0Var.d0.setVisibility(8);
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
                                    j0Var2.c0.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ig.i0
                    public final /* synthetic */ j0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                j0 j0Var = this.b;
                                if (!z12) {
                                    j0Var.d0.setVisibility(8);
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
                                    j0Var2.c0.setVisibility(8);
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

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        a0 a0Var = this.Z;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        a0 a0Var = this.Z;
        if (a0Var == null || !a0Var.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            int i11 = k6.a7;
            int themedColor = getThemedColor(i11);
            if (themedColor != this.i0) {
                this.i0 = themedColor;
                setBackgroundColor(themedColor);
                FrameLayout frameLayout = this.b0;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.o1(0.0f, themedColor), themedColor, themedColor}));
                }
            }
            int themedColor2 = getThemedColor(k6.wj);
            ei.d dVar = this.c0;
            if (dVar != null && themedColor2 != this.j0) {
                this.j0 = themedColor2;
                dVar.setColor(themedColor2);
            }
            int themedColor3 = getThemedColor(i11);
            if (this.navBarColorKey >= 0 || (i10 = this.navBarColor) != this.h0 || themedColor3 == i10) {
                return;
            }
            this.navBarColor = themedColor3;
            this.h0 = themedColor3;
            setOverlayNavBarColor(themedColor3);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new hg.o(this, 4), this.resourcesProvider);
        this.e0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return null;
    }
}
