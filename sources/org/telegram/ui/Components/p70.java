package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p70 extends org.telegram.ui.ActionBar.e3 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public final k70 T;
    public final org.telegram.ui.ActionBar.m2 U;
    public final c70 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean a0;
    public final TLRPC.TL_chatInviteExported b;
    public final boolean b0;
    public final HashMap c;
    public final boolean c0;
    public final TLRPC.ChatFull d;
    public final ArrayList d0;
    public int e;
    public final ArrayList e0;
    public int f;
    public final ArrayList f0;
    public final long g0;
    public int h;
    public final boolean h0;
    public final long i0;
    public org.telegram.ui.mb j0;
    public boolean k0;
    public boolean l0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public p70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.m2 m2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = true;
        this.l0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.U = m2Var;
        this.d = chatFull;
        this.g0 = j10;
        this.b0 = z10;
        this.h0 = z11;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        b70 b70Var = new b70(this, context);
        this.containerView = b70Var;
        b70Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        c70 c70Var = new c70(this, context);
        this.V = c70Var;
        c70Var.p1();
        c70Var.setTag(14);
        getContext();
        s4.b0 b0Var = new s4.b0(1, false);
        c70Var.setLayoutManager(b0Var);
        k70 k70Var = new k70(this);
        this.T = k70Var;
        c70Var.setAdapter(k70Var);
        c70Var.setVerticalScrollBarEnabled(false);
        c70Var.setClipToPadding(false);
        c70Var.setNestedScrollingEnabled(true);
        c70Var.setOnScrollListener(new d70(this, b0Var));
        c70Var.setOnItemClickListener(new am0() { // from class: org.telegram.ui.Components.x60
            @Override // org.telegram.ui.Components.am0
            public final void a(int i11, View view2) {
                p70.n(p70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, m2Var, i11);
            }
        });
        TextView textView = new TextView(context);
        this.W = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                textView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.c0 = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.containerView.addView(c70Var, w7.a6.a(-1.0f, 0.0f, !this.c0 ? 0.0f : 44.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(textView, w7.a6.a(this.c0 ? 50.0f : 44.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        d();
    }

    public static void P(p70 p70Var) {
        View view = p70Var.Y;
        TextView textView = p70Var.W;
        c70 c70Var = p70Var.V;
        if (c70Var.getChildCount() <= 0) {
            int paddingTop = c70Var.getPaddingTop();
            p70Var.Z = paddingTop;
            c70Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(p70Var.Z);
            view.setTranslationY(p70Var.Z);
            p70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = c70Var.getChildAt(0);
        wl0 wl0Var = (wl0) c70Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            p70Var.Z(true);
        } else {
            p70Var.Z(false);
            i10 = top;
        }
        if (p70Var.Z != i10) {
            p70Var.Z = i10;
            c70Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(p70Var.Z);
            }
            view.setTranslationY(p70Var.Z);
            p70Var.containerView.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.z9] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.n01] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.da0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z10;
        Object obj;
        int i11;
        org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.yh.i(1, context, c6Var, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        ?? e = org.telegram.messenger.yh.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        e.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 10));
        ?? z9Var = new z9(context);
        z9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        if (j10 >= 0) {
            z10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            k9Var.r(user);
            z9Var.e(user, k9Var);
        } else {
            z10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            k9Var.q(chat);
            z9Var.e(chat, k9Var);
        }
        frameLayout.addView(z9Var, w7.a6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, w7.a6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.a6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i13.setTextSize(1, 14.0f);
        i13.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.g6.B6;
        i13.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            i13.setText(zh.p7.Y0(z10, LocaleController.formatString(i16, objArr), 0.8f, null));
            i11 = i14;
        } else {
            obj = "min";
            boolean z11 = z10;
            Object obj2 = i15 == 300 ? "5min" : obj;
            Locale locale = Locale.US;
            i11 = i14;
            Object[] objArr2 = new Object[2];
            objArr2[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            i13.setText(zh.p7.Y0(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView i17 = com.google.android.gms.internal.play_billing.k3.i(e, i13, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i17.setTextSize(1, 14.0f);
        i17.setGravity(17);
        i17.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        int i18 = tL_starsSubscriptionPricing.period;
        if (i18 == 2592000) {
            i17.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            i17.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i18 == 300 ? "5min" : obj));
        }
        e.addView(i17, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
        ?? n01Var = new n01(context, c6Var);
        ?? da0Var = new da0(context, c6Var);
        da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
        int i19 = org.telegram.ui.ActionBar.g6.gc;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setSingleLine(true);
        da0Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(da0Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z12 = user2 == null;
        String userName = UserObject.getUserName(user2);
        k5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new e70(e3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        da0Var.setText(spannableStringBuilder);
        if (!z12) {
            n01Var.k(da0Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        n01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            n01Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        e.addView(n01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        da0 da0Var2 = new da0(context, c6Var);
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
        da0Var2.setTextSize(1, 14.0f);
        da0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new o30(context, 1)));
        da0Var2.setGravity(17);
        e.addView(da0Var2, w7.a6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        di.d dVar = new di.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        e.addView(dVar, w7.a6.n(-1, 48));
        dVar.setOnClickListener(new m2(e3VarArr, 2));
        i12.customView = e;
        e3VarArr[0] = i12;
        i12.useBackgroundTopPadding = false;
        i12.fixNavigationBar();
        e3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L6, false));
            return;
        }
        if (view instanceof w90) {
            ((w90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.e9) {
            ((org.telegram.ui.Cells.e9) view).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.xa) {
            ((org.telegram.ui.Cells.xa) view).j(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(final p70 p70Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, final Context context, final long j10, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == p70Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(p70Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = p70Var.x;
        boolean z10 = i10 >= i11 && i10 < p70Var.y;
        int i12 = p70Var.F;
        boolean z11 = i10 >= i12 && i10 < p70Var.G;
        int i13 = p70Var.O;
        boolean z12 = i10 >= i13 && i10 < p70Var.P;
        if ((i10 != p70Var.n && !z10 && !z12) || hashMap == null) {
            return;
        }
        long j11 = tL_chatInviteExported.admin_id;
        if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p70Var.d0.get(i10 - i11);
            j11 = tL_chatInviteImporter2.user_id;
        } else if (z11) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p70Var.e0.get(i10 - i12);
            j11 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z12) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z10 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new n2.h(p70Var, user, m2Var, 27), 100L);
                        p70Var.dismiss();
                        return;
                    }
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i14 = 0; i14 < chatFull.participants.participants.size(); i14++) {
                            if (chatFull.participants.participants.get(i14).user_id == j11 && (chatFull.participants.participants.get(i14) instanceof TLRPC.TL_chatChannelParticipant)) {
                                channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull.participants.participants.get(i14)).channelParticipant;
                                break;
                            }
                        }
                    }
                    channelParticipant = null;
                    if (channelParticipant != null) {
                        a0(context, p70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, p70Var.resourcesProvider);
                        return;
                    }
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
                    a2Var.q(120L);
                    final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                    MessagesController.getInstance(p70Var.currentAccount).getChannelParticipant(MessagesController.getInstance(p70Var.currentAccount).getChat(Long.valueOf(j10)), user, new Utilities.Callback() { // from class: org.telegram.ui.Components.z60
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(p70.this, a2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                        }
                    });
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p70Var.f0.get(i10 - i13);
            j11 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
        if (user == null) {
        }
    }

    public static /* synthetic */ void o(p70 p70Var, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        a2Var.c(400L);
        a0(context, p70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, p70Var.resourcesProvider);
    }

    public final void Y() {
        final boolean z10;
        final boolean z11;
        if (this.Q) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList = this.d0;
        boolean z12 = i10 > arrayList.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList2 = this.e0;
        final boolean z13 = i11 > arrayList2.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList3 = this.f0;
        final boolean z15 = z14 && tL_chatInviteExported.requested > arrayList3.size();
        if (z12) {
            z11 = false;
            z10 = false;
        } else if (z13) {
            z11 = false;
            z10 = true;
        } else {
            if (!z15) {
                return;
            }
            z10 = false;
            z11 = true;
        }
        final ArrayList arrayList4 = z11 ? arrayList3 : z10 ? arrayList2 : arrayList;
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.flags |= 2;
        tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.g0);
        tL_messages_getChatInviteImporters.requested = z11;
        tL_messages_getChatInviteImporters.subscription_expired = z10;
        if (arrayList4.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList4.get(arrayList4.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        this.Q = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.y60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final p70 p70Var = p70.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z16 = z11;
                final boolean z17 = z10;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.a70
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                    
                        if (r4.size() < r1.count) goto L25;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                    
                        r5 = false;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        p70 p70Var2 = p70.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                p70Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    p70Var2.R = z20;
                                    p70Var2.c0();
                                } else {
                                    p70Var2.R = z20;
                                    p70Var2.c0();
                                }
                            }
                        }
                        p70Var2.Q = false;
                    }
                });
            }
        });
    }

    public final void Z(boolean z10) {
        View view = this.Y;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.W;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.X;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.X = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.c0) {
            this.X.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.X.setDuration(150L);
        this.X.addListener(new org.telegram.ui.vo(13, this, z10));
        this.X.start();
    }

    public final void c0() {
        boolean z10 = false;
        this.S = 0;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.K = -1;
        this.L = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.J = -1;
        this.e = -1;
        this.f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z11 = true;
        if (!this.b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        boolean z12 = i12 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f0;
        ArrayList arrayList3 = this.e0;
        boolean z13 = i12 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.w = i13;
            this.x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.y = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.E = i15;
            this.F = i16;
            int size3 = arrayList3.size() + i16;
            this.S = size3;
            this.G = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i17 = this.S;
            int i18 = i17 + 1;
            this.S = i18;
            this.N = i17;
            this.O = i18;
            int size4 = arrayList2.size() + i18;
            this.S = size4;
            this.P = size4;
        }
        if ((z12 || z13) && !z11) {
            int i19 = this.S;
            this.r = i19;
            this.J = i19 + 1;
            this.S = i19 + 3;
            this.K = i19 + 2;
        }
        this.T.l();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.l5, false));
            if (!this.c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A5, false);
        c70 c70Var = this.V;
        c70Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        int hiddenChildCount = c70Var.getHiddenChildCount();
        for (int i10 = 0; i10 < c70Var.getChildCount(); i10++) {
            b0(c70Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(c70Var.V(i11));
        }
        int cachedChildCount = c70Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(c70Var.P(i12));
        }
        int attachedScrapChildCount = c70Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(c70Var.O(i13));
        }
        this.containerView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        this.l0 = false;
    }
}
