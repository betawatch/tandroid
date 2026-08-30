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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.ActionBar.g3 {
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
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public final n60 Q;
    public final org.telegram.ui.ActionBar.p2 R;
    public final f60 S;
    public final TextView T;
    public AnimatorSet U;
    public final View V;
    public int W;
    public boolean X;
    public final boolean Y;
    public final boolean Z;
    public final ArrayList a0;
    public final TLRPC.TL_chatInviteExported b;
    public final ArrayList b0;
    public final HashMap c;
    public final ArrayList c0;
    public final TLRPC.ChatFull d;
    public final long d0;
    public int e;
    public final boolean e0;
    public int f;
    public final long f0;
    public org.telegram.ui.eb g0;
    public int h;
    public boolean h0;
    public boolean i0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public s60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.p2 p2Var, final long j10, boolean z4, boolean z10) {
        super(context, false);
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.h0 = true;
        this.i0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.R = p2Var;
        this.d = chatFull;
        this.d0 = j10;
        this.Y = z4;
        this.e0 = z10;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.f0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        e60 e60Var = new e60(this, context);
        this.containerView = e60Var;
        e60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.V = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        f60 f60Var = new f60(this, context);
        this.S = f60Var;
        f60Var.p1();
        f60Var.setTag(14);
        getContext();
        f2.i0 i0Var = new f2.i0(1, false);
        f60Var.setLayoutManager(i0Var);
        n60 n60Var = new n60(this);
        this.Q = n60Var;
        f60Var.setAdapter(n60Var);
        f60Var.setVerticalScrollBarEnabled(false);
        f60Var.setClipToPadding(false);
        f60Var.setNestedScrollingEnabled(true);
        f60Var.setOnScrollListener(new g60(this, i0Var));
        f60Var.setOnItemClickListener(new il0() { // from class: org.telegram.ui.Components.a60
            @Override // org.telegram.ui.Components.il0
            public final void f(int i11, View view2) {
                s60.m(s60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, p2Var, i11);
            }
        });
        TextView textView = new TextView(context);
        this.T = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (z4) {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.Z = false;
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
            this.Z = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.containerView.addView(f60Var, k7.b6.d(-1, -1.0f, 51, 0.0f, !this.Z ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, k7.b6.d(-1, !this.Z ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        b0();
    }

    public static void O(s60 s60Var) {
        View view = s60Var.V;
        TextView textView = s60Var.T;
        f60 f60Var = s60Var.S;
        if (f60Var.getChildCount() <= 0) {
            int paddingTop = f60Var.getPaddingTop();
            s60Var.W = paddingTop;
            f60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(s60Var.W);
            view.setTranslationY(s60Var.W);
            s60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = f60Var.getChildAt(0);
        el0 el0Var = (el0) f60Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || el0Var == null || el0Var.b() != 0) {
            s60Var.Y(true);
        } else {
            s60Var.Y(false);
            i10 = top;
        }
        if (s60Var.W != i10) {
            s60Var.W = i10;
            f60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(s60Var.W);
            }
            view.setTranslationY(s60Var.W);
            s60Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.f6 f6Var) {
        char c3;
        String str;
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, k7.b6.t(-1, -2, 7, 0, 0, 0, 10));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        if (j10 >= 0) {
            c3 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            z8Var.r(user);
            p9Var.e(user, z8Var);
        } else {
            c3 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        frameLayout.addView(p9Var, k7.b6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, k7.b6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, k7.b6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView j11 = org.telegram.ui.yh.j(f10, textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        j11.setTextSize(1, 14.0f);
        j11.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        j11.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = tL_starsSubscriptionPricing.period;
        if (i12 == 2592000) {
            int i13 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c3] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            j11.setText(lh.ja.X0(false, LocaleController.formatString(i13, objArr), 0.8f, null));
            g3Var = o10;
        } else {
            str = "min";
            g3Var = o10;
            j11.setText(lh.ja.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : str), 0.8f, null));
        }
        TextView j12 = org.telegram.ui.yh.j(f10, j11, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        j12.setTextSize(1, 14.0f);
        j12.setGravity(17);
        j12.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            j12.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            j12.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i14 != 300 ? str : "5min"));
        }
        f10.addView(j12, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
        sz0 sz0Var = new sz0(context, f6Var);
        e90 e90Var = new e90(context, f6Var);
        e90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        e90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.j6.gc;
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setSingleLine(true);
        e90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(e90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z4 = user2 == null;
        String userName = UserObject.getUserName(user2);
        i5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new h60(g3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        e90Var.setText(spannableStringBuilder);
        if (!z4) {
            sz0Var.i(e90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
        sz0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            sz0Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(sz0Var, k7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        e90 e90Var2 = new e90(context, f6Var);
        e90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        e90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        e90Var2.setTextSize(1, 14.0f);
        e90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new c30(context, 1)));
        e90Var2.setGravity(17);
        f10.addView(e90Var2, k7.b6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f10.addView(dVar, k7.b6.n(-1, 48));
        dVar.setOnClickListener(new i2(g3VarArr, 2));
        g3Var2.customView = f10;
        g3VarArr[0] = g3Var2;
        g3Var2.useBackgroundTopPadding = false;
        g3Var2.fixNavigationBar();
        g3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            return;
        }
        if (view instanceof x80) {
            ((x80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.a9) {
            ((org.telegram.ui.Cells.a9) view).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.va) {
            ((org.telegram.ui.Cells.va) view).j(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(final s60 s60Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, final Context context, final long j10, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == s60Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(s60Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = s60Var.x;
        boolean z4 = i10 >= i11 && i10 < s60Var.y;
        int i12 = s60Var.C;
        boolean z10 = i10 >= i12 && i10 < s60Var.D;
        int i13 = s60Var.L;
        boolean z11 = i10 >= i13 && i10 < s60Var.M;
        if ((i10 != s60Var.n && !z4 && !z11) || hashMap == null) {
            return;
        }
        long j11 = tL_chatInviteExported.admin_id;
        if (z4) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) s60Var.a0.get(i10 - i11);
            j11 = tL_chatInviteImporter2.user_id;
        } else if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) s60Var.b0.get(i10 - i12);
            j11 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z11) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z4 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new hp(s60Var, user, p2Var, 5), 100L);
                        s60Var.dismiss();
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
                        Z(context, s60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, s60Var.resourcesProvider);
                        return;
                    }
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                    d2Var.q(120L);
                    final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                    MessagesController.getInstance(s60Var.currentAccount).getChannelParticipant(MessagesController.getInstance(s60Var.currentAccount).getChat(Long.valueOf(j10)), user, new Utilities.Callback() { // from class: org.telegram.ui.Components.c60
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            AndroidUtilities.runOnUIThread(new lf.g0(s60.this, d2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                        }
                    });
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) s60Var.c0.get(i10 - i13);
            j11 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
        if (user == null) {
        }
    }

    public static /* synthetic */ void n(s60 s60Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        d2Var.c(400L);
        Z(context, s60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, s60Var.resourcesProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        final boolean z4;
        final boolean z10;
        final ArrayList arrayList;
        if (this.N) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.a0;
        boolean z11 = i10 > arrayList2.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.b0;
        final boolean z12 = i11 > arrayList3.size();
        boolean z13 = tL_chatInviteExported.request_needed;
        ArrayList arrayList4 = this.c0;
        final boolean z14 = z13 && tL_chatInviteExported.requested > arrayList4.size();
        if (z11) {
            z4 = false;
        } else {
            if (z12) {
                z4 = false;
                z10 = true;
                arrayList = !z4 ? arrayList4 : z10 ? arrayList3 : arrayList2;
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.flags |= 2;
                tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.d0);
                tL_messages_getChatInviteImporters.requested = z4;
                tL_messages_getChatInviteImporters.subscription_expired = z10;
                if (arrayList.isEmpty()) {
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                    tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                } else {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                }
                this.N = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.b60
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final s60 s60Var = s60.this;
                        final ArrayList arrayList5 = arrayList;
                        final boolean z15 = z4;
                        final boolean z16 = z10;
                        final boolean z17 = z14;
                        final boolean z18 = z12;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.d60
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
                                s60 s60Var2 = s60.this;
                                if (tL_error == null) {
                                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                    ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                    ArrayList arrayList7 = arrayList5;
                                    arrayList7.addAll(arrayList6);
                                    for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                        TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                        s60Var2.c.put(Long.valueOf(user.id), user);
                                    }
                                    boolean z19 = true;
                                    if (!z15) {
                                        boolean z20 = z16;
                                        boolean z21 = z17;
                                        if (z20) {
                                            s60Var2.O = z19;
                                            s60Var2.c0();
                                        } else {
                                            s60Var2.O = z19;
                                            s60Var2.c0();
                                        }
                                    }
                                }
                                s60Var2.N = false;
                            }
                        });
                    }
                });
            }
            if (!z14) {
                return;
            } else {
                z4 = true;
            }
        }
        z10 = false;
        if (!z4) {
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters2 = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters2.flags |= 2;
        tL_messages_getChatInviteImporters2.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters2.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.d0);
        tL_messages_getChatInviteImporters2.requested = z4;
        tL_messages_getChatInviteImporters2.subscription_expired = z10;
        if (arrayList.isEmpty()) {
        }
        this.N = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters2, new RequestDelegate() { // from class: org.telegram.ui.Components.b60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final s60 s60Var = s60.this;
                final ArrayList arrayList5 = arrayList;
                final boolean z15 = z4;
                final boolean z16 = z10;
                final boolean z17 = z14;
                final boolean z18 = z12;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.d60
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
                        s60 s60Var2 = s60.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                s60Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z19 = true;
                            if (!z15) {
                                boolean z20 = z16;
                                boolean z21 = z17;
                                if (z20) {
                                    s60Var2.O = z19;
                                    s60Var2.c0();
                                } else {
                                    s60Var2.O = z19;
                                    s60Var2.c0();
                                }
                            }
                        }
                        s60Var2.N = false;
                    }
                });
            }
        });
    }

    public final void Y(boolean z4) {
        View view = this.V;
        if ((!z4 || view.getTag() == null) && (z4 || view.getTag() != null)) {
            return;
        }
        view.setTag(z4 ? null : 1);
        TextView textView = this.T;
        if (z4) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.U = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
        if (!this.Z) {
            this.U.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z4 ? 1.0f : 0.0f));
        }
        this.U.setDuration(150L);
        this.U.addListener(new l00(4, this, z4));
        this.U.start();
    }

    public final void b0() {
        TextView textView = this.T;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l5, false));
            if (!this.Z) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false);
        f60 f60Var = this.S;
        f60Var.setGlowColor(w02);
        this.V.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        int hiddenChildCount = f60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < f60Var.getChildCount(); i10++) {
            a0(f60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(f60Var.V(i11));
        }
        int cachedChildCount = f60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(f60Var.P(i12));
        }
        int attachedScrapChildCount = f60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(f60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z4 = false;
        this.P = 0;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.H = -1;
        this.I = -1;
        this.E = -1;
        this.F = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.G = -1;
        this.e = -1;
        this.f = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        boolean z10 = true;
        if (!this.Y) {
            this.E = 0;
            this.P = 2;
            this.F = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.P;
            this.e = i10;
            this.P = i10 + 2;
            this.f = i10 + 1;
        }
        int i11 = this.P;
        this.h = i11;
        this.P = i11 + 2;
        this.n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        boolean z11 = i12 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.c0;
        ArrayList arrayList3 = this.b0;
        boolean z12 = i12 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i13 = this.P;
            int i14 = i13 + 1;
            this.P = i14;
            this.w = i13;
            this.x = i14;
            int size2 = arrayList.size() + i14;
            this.P = size2;
            this.y = size2;
            z4 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.P;
            int i16 = i15 + 1;
            this.P = i16;
            this.B = i15;
            this.C = i16;
            int size3 = arrayList3.size() + i16;
            this.P = size3;
            this.D = size3;
            z4 = true;
        }
        if (arrayList2.isEmpty()) {
            z10 = z4;
        } else {
            int i17 = this.P;
            int i18 = i17 + 1;
            this.P = i18;
            this.K = i17;
            this.L = i18;
            int size4 = arrayList2.size() + i18;
            this.P = size4;
            this.M = size4;
        }
        if ((z11 || z12) && !z10) {
            int i19 = this.P;
            this.r = i19;
            this.G = i19 + 1;
            this.P = i19 + 3;
            this.H = i19 + 2;
        }
        this.Q.l();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        this.i0 = false;
    }
}
