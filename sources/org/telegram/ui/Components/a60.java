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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.ActionBar.f3 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public final v50 P;
    public final org.telegram.ui.ActionBar.o2 Q;
    public final n50 R;
    public final TextView S;
    public AnimatorSet T;
    public final View U;
    public int V;
    public boolean W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final TLRPC.TL_chatInviteExported b;
    public final ArrayList b0;
    public final HashMap c;
    public final long c0;
    public final TLRPC.ChatFull d;
    public final boolean d0;
    public int e;
    public final long e0;
    public int f;
    public org.telegram.ui.bb f0;
    public boolean g0;
    public int h;
    public boolean h0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public a60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.o2 o2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = true;
        this.h0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.Q = o2Var;
        this.d = chatFull;
        this.c0 = j10;
        this.X = z10;
        this.d0 = z11;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        setBackgroundColor(getThemedColor(i9));
        fixNavigationBar(getThemedColor(i9));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.e0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        m50 m50Var = new m50(this, context);
        this.containerView = m50Var;
        m50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.U = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        n50 n50Var = new n50(this, context);
        this.R = n50Var;
        n50Var.p1();
        n50Var.setTag(14);
        getContext();
        f2.m0 m0Var = new f2.m0(1, false);
        n50Var.setLayoutManager(m0Var);
        v50 v50Var = new v50(this);
        this.P = v50Var;
        n50Var.setAdapter(v50Var);
        n50Var.setVerticalScrollBarEnabled(false);
        n50Var.setClipToPadding(false);
        n50Var.setNestedScrollingEnabled(true);
        n50Var.setOnScrollListener(new o50(this, m0Var));
        n50Var.setOnItemClickListener(new mk0() { // from class: org.telegram.ui.Components.i50
            @Override // org.telegram.ui.Components.mk0
            public final void a(int i10, View view2) {
                a60.m(a60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, o2Var, i10);
            }
        });
        TextView textView = new TextView(context);
        this.S = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.Y = false;
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
            this.Y = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.containerView.addView(n50Var, g7.e6.d(-1, -1.0f, 51, 0.0f, !this.Y ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, g7.e6.d(-1, !this.Y ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0();
        W();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new w1(this, 6));
        }
        a0();
    }

    public static void N(a60 a60Var) {
        View view = a60Var.U;
        TextView textView = a60Var.S;
        n50 n50Var = a60Var.R;
        if (n50Var.getChildCount() <= 0) {
            int paddingTop = n50Var.getPaddingTop();
            a60Var.V = paddingTop;
            n50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(a60Var.V);
            view.setTranslationY(a60Var.V);
            a60Var.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = n50Var.getChildAt(0);
        ik0 ik0Var = (ik0) n50Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            a60Var.X(true);
        } else {
            a60Var.X(false);
            i9 = top;
        }
        if (a60Var.V != i9) {
            a60Var.V = i9;
            n50Var.setTopGlowOffset(i9);
            if (textView != null) {
                textView.setTranslationY(a60Var.V);
            }
            view.setTranslationY(a60Var.V);
            a60Var.containerView.invalidate();
        }
    }

    public static void Y(Context context, int i9, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.b6 b6Var) {
        char c10;
        String str;
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, g7.e6.t(-1, -2, 7, 0, 0, 0, 10));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        if (j10 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            z8Var.r(user);
            o9Var.e(user, z8Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
        frameLayout.addView(o9Var, g7.e6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, g7.e6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, g7.e6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.f6.B6;
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int i11 = tL_starsSubscriptionPricing.period;
        if (i11 == 2592000) {
            int i12 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            h.setText(gh.oa.X0(false, LocaleController.formatString(i12, objArr), 0.8f, null));
            f3Var = j11;
        } else {
            str = "min";
            f3Var = j11;
            h.setText(gh.oa.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i11 == 300 ? "5min" : str), 0.8f, null));
        }
        TextView h10 = j3.r0.h(f10, h, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h10.setTextSize(1, 14.0f);
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int i13 = tL_starsSubscriptionPricing.period;
        if (i13 == 2592000) {
            h10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i9).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            h10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i9).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i13 != 300 ? str : "5min"));
        }
        f10.addView(h10, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
        wy0 wy0Var = new wy0(context, b6Var);
        l80 l80Var = new l80(context, b6Var);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i14 = org.telegram.ui.ActionBar.f6.gc;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(true);
        l80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(l80Var, 24.0f, i9);
        TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z10 = user2 == null;
        String userName = UserObject.getUserName(user2);
        f5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new p50(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        if (!z10) {
            wy0Var.i(l80Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        wy0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        if (channelParticipant != null) {
            wy0Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        l80 l80Var2 = new l80(context, b6Var);
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new l20(context, 1)));
        l80Var2.setGravity(17);
        f10.addView(l80Var2, g7.e6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f10.addView(dVar, g7.e6.n(-1, 48));
        dVar.setOnClickListener(new h2(f3VarArr, 2));
        f3Var2.customView = f10;
        f3VarArr[0] = f3Var2;
        f3Var2.useBackgroundTopPadding = false;
        f3Var2.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void Z(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
            return;
        }
        if (view instanceof e80) {
            ((e80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.b9) {
            ((org.telegram.ui.Cells.b9) view).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.va) {
            ((org.telegram.ui.Cells.va) view).j(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(final a60 a60Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, final Context context, final long j10, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i9 == a60Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(a60Var.currentAccount).clientUserId) {
            return;
        }
        int i10 = a60Var.x;
        boolean z10 = i9 >= i10 && i9 < a60Var.y;
        int i11 = a60Var.B;
        boolean z11 = i9 >= i11 && i9 < a60Var.C;
        int i12 = a60Var.K;
        boolean z12 = i9 >= i12 && i9 < a60Var.L;
        if ((i9 != a60Var.n && !z10 && !z12) || hashMap == null) {
            return;
        }
        long j11 = tL_chatInviteExported.admin_id;
        if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a60Var.Z.get(i9 - i10);
            j11 = tL_chatInviteImporter2.user_id;
        } else if (z11) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a60Var.a0.get(i9 - i11);
            j11 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z12) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z10 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(a60Var, user, o2Var, 23), 100L);
                        a60Var.dismiss();
                        return;
                    }
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i13 = 0; i13 < chatFull.participants.participants.size(); i13++) {
                            if (chatFull.participants.participants.get(i13).user_id == j11 && (chatFull.participants.participants.get(i13) instanceof TLRPC.TL_chatChannelParticipant)) {
                                channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull.participants.participants.get(i13)).channelParticipant;
                                break;
                            }
                        }
                    }
                    channelParticipant = null;
                    if (channelParticipant != null) {
                        Y(context, a60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a60Var.resourcesProvider);
                        return;
                    }
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                    c2Var.q(120L);
                    final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                    MessagesController.getInstance(a60Var.currentAccount).getChannelParticipant(MessagesController.getInstance(a60Var.currentAccount).getChat(Long.valueOf(j10)), user, new Utilities.Callback() { // from class: org.telegram.ui.Components.k50
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            AndroidUtilities.runOnUIThread(new ff.h0(a60.this, c2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                        }
                    });
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) a60Var.b0.get(i9 - i12);
            j11 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
        if (user == null) {
        }
    }

    public static /* synthetic */ void n(a60 a60Var, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        c2Var.c(400L);
        Y(context, a60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a60Var.resourcesProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        final boolean z10;
        final boolean z11;
        final ArrayList arrayList;
        if (this.M) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        int i9 = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.Z;
        boolean z12 = i9 > arrayList2.size();
        int i10 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.a0;
        final boolean z13 = i10 > arrayList3.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList4 = this.b0;
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
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.c0);
                tL_messages_getChatInviteImporters.requested = z10;
                tL_messages_getChatInviteImporters.subscription_expired = z11;
                if (arrayList.isEmpty()) {
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                    tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                } else {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                }
                this.M = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.j50
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final a60 a60Var = a60.this;
                        final ArrayList arrayList5 = arrayList;
                        final boolean z16 = z10;
                        final boolean z17 = z11;
                        final boolean z18 = z15;
                        final boolean z19 = z13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.l50
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
                                a60 a60Var2 = a60.this;
                                if (tL_error == null) {
                                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                    ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                    ArrayList arrayList7 = arrayList5;
                                    arrayList7.addAll(arrayList6);
                                    for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
                                        TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
                                        a60Var2.c.put(Long.valueOf(user.id), user);
                                    }
                                    boolean z20 = true;
                                    if (!z16) {
                                        boolean z21 = z17;
                                        boolean z22 = z18;
                                        if (z21) {
                                            a60Var2.N = z20;
                                            a60Var2.b0();
                                        } else {
                                            a60Var2.N = z20;
                                            a60Var2.b0();
                                        }
                                    }
                                }
                                a60Var2.M = false;
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
        tL_messages_getChatInviteImporters2.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.c0);
        tL_messages_getChatInviteImporters2.requested = z10;
        tL_messages_getChatInviteImporters2.subscription_expired = z11;
        if (arrayList.isEmpty()) {
        }
        this.M = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters2, new RequestDelegate() { // from class: org.telegram.ui.Components.j50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final a60 a60Var = a60.this;
                final ArrayList arrayList5 = arrayList;
                final boolean z16 = z10;
                final boolean z17 = z11;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.l50
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
                        a60 a60Var2 = a60.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
                                a60Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    a60Var2.N = z20;
                                    a60Var2.b0();
                                } else {
                                    a60Var2.N = z20;
                                    a60Var2.b0();
                                }
                            }
                        }
                        a60Var2.M = false;
                    }
                });
            }
        });
    }

    public final void X(boolean z10) {
        View view = this.U;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.S;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.Y) {
            this.T.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.T.setDuration(150L);
        this.T.addListener(new u9(12, this, z10));
        this.T.start();
    }

    public final void a0() {
        TextView textView = this.S;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l5, false));
            if (!this.Y) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false);
        n50 n50Var = this.R;
        n50Var.setGlowColor(w02);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        int hiddenChildCount = n50Var.getHiddenChildCount();
        for (int i9 = 0; i9 < n50Var.getChildCount(); i9++) {
            Z(n50Var.getChildAt(i9));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            Z(n50Var.V(i10));
        }
        int cachedChildCount = n50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            Z(n50Var.P(i11));
        }
        int attachedScrapChildCount = n50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            Z(n50Var.O(i12));
        }
        this.containerView.invalidate();
    }

    public final void b0() {
        boolean z10 = false;
        this.O = 0;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.G = -1;
        this.H = -1;
        this.D = -1;
        this.E = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.F = -1;
        this.e = -1;
        this.f = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        boolean z11 = true;
        if (!this.X) {
            this.D = 0;
            this.O = 2;
            this.E = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i9 = this.O;
            this.e = i9;
            this.O = i9 + 2;
            this.f = i9 + 1;
        }
        int i10 = this.O;
        this.h = i10;
        this.O = i10 + 2;
        this.n = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        boolean z12 = i11 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.b0;
        ArrayList arrayList3 = this.a0;
        boolean z13 = i11 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i12 = this.O;
            int i13 = i12 + 1;
            this.O = i13;
            this.w = i12;
            this.x = i13;
            int size2 = arrayList.size() + i13;
            this.O = size2;
            this.y = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.O;
            int i15 = i14 + 1;
            this.O = i15;
            this.A = i14;
            this.B = i15;
            int size3 = arrayList3.size() + i15;
            this.O = size3;
            this.C = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i16 = this.O;
            int i17 = i16 + 1;
            this.O = i17;
            this.J = i16;
            this.K = i17;
            int size4 = arrayList2.size() + i17;
            this.O = size4;
            this.L = size4;
        }
        if ((z12 || z13) && !z11) {
            int i18 = this.O;
            this.r = i18;
            this.F = i18 + 1;
            this.O = i18 + 3;
            this.G = i18 + 2;
        }
        this.P.l();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.h0 = false;
    }
}
