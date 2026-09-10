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
import android.widget.LinearLayout;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a70 extends org.telegram.ui.ActionBar.h3 {
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
    public final v60 T;
    public final org.telegram.ui.ActionBar.p2 U;
    public final n60 V;
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
    public org.telegram.ui.jb j0;
    public boolean k0;
    public boolean l0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public a70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.p2 p2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = true;
        this.l0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.U = p2Var;
        this.d = chatFull;
        this.g0 = j3;
        this.b0 = z10;
        this.h0 = z11;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        m60 m60Var = new m60(this, context);
        this.containerView = m60Var;
        m60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        n60 n60Var = new n60(this, context);
        this.V = n60Var;
        n60Var.o1();
        n60Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        n60Var.setLayoutManager(c0Var);
        v60 v60Var = new v60(this);
        this.T = v60Var;
        n60Var.setAdapter(v60Var);
        n60Var.setVerticalScrollBarEnabled(false);
        n60Var.setClipToPadding(false);
        n60Var.setNestedScrollingEnabled(true);
        n60Var.setOnScrollListener(new o60(this, c0Var));
        n60Var.setOnItemClickListener(new jl0() { // from class: org.telegram.ui.Components.i60
            @Override // org.telegram.ui.Components.jl0
            public final void d(int i11, View view2) {
                a70.m(a70.this, tL_chatInviteExported, hashMap, chatFull, context, j3, p2Var, i11);
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
        this.containerView.addView(n60Var, w7.a6.d(-1, -1.0f, 51, 0.0f, !this.c0 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, w7.a6.d(-1, !this.c0 ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new z1(this, 6));
        }
        b0();
    }

    public static void O(a70 a70Var) {
        View view = a70Var.Y;
        TextView textView = a70Var.W;
        n60 n60Var = a70Var.V;
        if (n60Var.getChildCount() <= 0) {
            int paddingTop = n60Var.getPaddingTop();
            a70Var.Z = paddingTop;
            n60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(a70Var.Z);
            view.setTranslationY(a70Var.Z);
            a70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = n60Var.getChildAt(0);
        fl0 fl0Var = (fl0) n60Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            a70Var.Y(true);
        } else {
            a70Var.Y(false);
            i10 = top;
        }
        if (a70Var.Z != i10) {
            a70Var.Z = i10;
            n60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(a70Var.Z);
            }
            view.setTranslationY(a70Var.Z);
            a70Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.f6 f6Var) {
        char c10;
        Object obj;
        int i11;
        org.telegram.ui.ActionBar.h3 i12 = org.telegram.messenger.em.i(1, context, f6Var, false);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f7.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 10));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        if (j3 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            g9Var.r(user);
            w9Var.e(user, g9Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
        frameLayout.addView(w9Var, w7.a6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g10.setTextSize(1, 14.0f);
        g10.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.j6.B6;
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            int i15 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            g10.setText(xh.z7.X0(false, LocaleController.formatString(i15, objArr), 0.8f, null));
            i11 = i13;
        } else {
            obj = "min";
            i11 = i13;
            g10.setText(xh.z7.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i14 == 300 ? "5min" : obj), 0.8f, null));
        }
        TextView g11 = com.google.android.gms.internal.vision.e2.g(f7, g10, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g11.setTextSize(1, 14.0f);
        g11.setGravity(17);
        g11.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i16 = tL_starsSubscriptionPricing.period;
        if (i16 == 2592000) {
            g11.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            g11.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i16 == 300 ? "5min" : obj));
        }
        f7.addView(g11, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        m90 m90Var = new m90(context, f6Var);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i17 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(true);
        m90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(m90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z10 = user2 == null;
        String userName = UserObject.getUserName(user2);
        g5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new p60(h3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        if (!z10) {
            b01Var.i(m90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        b01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            b01Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f7.addView(b01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        m90 m90Var2 = new m90(context, f6Var);
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var));
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new l30(context, 1)));
        m90Var2.setGravity(17);
        f7.addView(m90Var2, w7.a6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f7.addView(dVar, w7.a6.n(-1, 48));
        dVar.setOnClickListener(new l2(h3VarArr, 2));
        i12.customView = f7;
        h3VarArr[0] = i12;
        i12.useBackgroundTopPadding = false;
        i12.fixNavigationBar();
        h3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            return;
        }
        if (view instanceof f90) {
            ((f90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.f9) {
            ((org.telegram.ui.Cells.f9) view).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.bb) {
            ((org.telegram.ui.Cells.bb) view).j(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(final a70 a70Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, final Context context, final long j3, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == a70Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(a70Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = a70Var.x;
        boolean z10 = i10 >= i11 && i10 < a70Var.y;
        int i12 = a70Var.F;
        boolean z11 = i10 >= i12 && i10 < a70Var.G;
        int i13 = a70Var.O;
        boolean z12 = i10 >= i13 && i10 < a70Var.P;
        if ((i10 != a70Var.n && !z10 && !z12) || hashMap == null) {
            return;
        }
        long j10 = tL_chatInviteExported.admin_id;
        if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a70Var.d0.get(i10 - i11);
            j10 = tL_chatInviteImporter2.user_id;
        } else if (z11) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a70Var.e0.get(i10 - i12);
            j10 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z12) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j10));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z10 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new gf(a70Var, user, p2Var, 10), 100L);
                        a70Var.dismiss();
                        return;
                    }
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i14 = 0; i14 < chatFull.participants.participants.size(); i14++) {
                            if (chatFull.participants.participants.get(i14).user_id == j10 && (chatFull.participants.participants.get(i14) instanceof TLRPC.TL_chatChannelParticipant)) {
                                channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull.participants.participants.get(i14)).channelParticipant;
                                break;
                            }
                        }
                    }
                    channelParticipant = null;
                    if (channelParticipant != null) {
                        Z(context, a70Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a70Var.resourcesProvider);
                        return;
                    }
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                    d2Var.q(120L);
                    final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                    MessagesController.getInstance(a70Var.currentAccount).getChannelParticipant(MessagesController.getInstance(a70Var.currentAccount).getChat(Long.valueOf(j3)), user, new Utilities.Callback() { // from class: org.telegram.ui.Components.k60
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(a70.this, d2Var, context, j3, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                        }
                    });
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a70Var.f0.get(i10 - i13);
            j10 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (user == null) {
        }
    }

    public static /* synthetic */ void n(a70 a70Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        d2Var.c(400L);
        Z(context, a70Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a70Var.resourcesProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        final boolean z10;
        final boolean z11;
        final ArrayList arrayList;
        if (this.Q) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.d0;
        boolean z12 = i10 > arrayList2.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.e0;
        final boolean z13 = i11 > arrayList3.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList4 = this.f0;
        final boolean z15 = z14 && tL_chatInviteExported.requested > arrayList4.size();
        if (z12) {
            z10 = false;
        } else {
            if (z13) {
                z10 = false;
                z11 = true;
                arrayList = !z10 ? arrayList4 : z11 ? arrayList3 : arrayList2;
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.flags |= 2;
                tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.g0);
                tL_messages_getChatInviteImporters.requested = z10;
                tL_messages_getChatInviteImporters.subscription_expired = z11;
                if (arrayList.isEmpty()) {
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                    tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                } else {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                }
                this.Q = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.j60
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final a70 a70Var = a70.this;
                        final ArrayList arrayList5 = arrayList;
                        final boolean z16 = z10;
                        final boolean z17 = z11;
                        final boolean z18 = z15;
                        final boolean z19 = z13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.l60
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
                                a70 a70Var2 = a70.this;
                                if (tL_error == null) {
                                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                    ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                    ArrayList arrayList7 = arrayList5;
                                    arrayList7.addAll(arrayList6);
                                    for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                        TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                        a70Var2.c.put(Long.valueOf(user.id), user);
                                    }
                                    boolean z20 = true;
                                    if (!z16) {
                                        boolean z21 = z17;
                                        boolean z22 = z18;
                                        if (z21) {
                                            a70Var2.R = z20;
                                            a70Var2.c0();
                                        } else {
                                            a70Var2.R = z20;
                                            a70Var2.c0();
                                        }
                                    }
                                }
                                a70Var2.Q = false;
                            }
                        });
                    }
                });
            }
            if (!z15) {
                return;
            } else {
                z10 = true;
            }
        }
        z11 = false;
        if (!z10) {
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters2 = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters2.flags |= 2;
        tL_messages_getChatInviteImporters2.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters2.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.g0);
        tL_messages_getChatInviteImporters2.requested = z10;
        tL_messages_getChatInviteImporters2.subscription_expired = z11;
        if (arrayList.isEmpty()) {
        }
        this.Q = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters2, new RequestDelegate() { // from class: org.telegram.ui.Components.j60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final a70 a70Var = a70.this;
                final ArrayList arrayList5 = arrayList;
                final boolean z16 = z10;
                final boolean z17 = z11;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.l60
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
                        a70 a70Var2 = a70.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                a70Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    a70Var2.R = z20;
                                    a70Var2.c0();
                                } else {
                                    a70Var2.R = z20;
                                    a70Var2.c0();
                                }
                            }
                        }
                        a70Var2.Q = false;
                    }
                });
            }
        });
    }

    public final void Y(boolean z10) {
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
        this.X.addListener(new yo(8, this, z10));
        this.X.start();
    }

    public final void b0() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l5, false));
            if (!this.c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false);
        n60 n60Var = this.V;
        n60Var.setGlowColor(w02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        int hiddenChildCount = n60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < n60Var.getChildCount(); i10++) {
            a0(n60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(n60Var.V(i11));
        }
        int cachedChildCount = n60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(n60Var.P(i12));
        }
        int attachedScrapChildCount = n60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(n60Var.O(i13));
        }
        this.containerView.invalidate();
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

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        this.l0 = false;
    }
}
