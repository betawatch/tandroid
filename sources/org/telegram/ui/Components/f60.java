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
import android.view.KeyEvent;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f60 extends org.telegram.ui.ActionBar.e3 {
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
    public final a60 P;
    public final org.telegram.ui.ActionBar.n2 Q;
    public final s50 R;
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
    public org.telegram.ui.cb f0;
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

    public f60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.n2 n2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = true;
        this.h0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.Q = n2Var;
        this.d = chatFull;
        this.c0 = j10;
        this.X = z10;
        this.d0 = z11;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.e0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        r50 r50Var = new r50(this, context);
        this.containerView = r50Var;
        r50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.U = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        s50 s50Var = new s50(this, context);
        this.R = s50Var;
        s50Var.p1();
        s50Var.setTag(14);
        getContext();
        f2.k0 k0Var = new f2.k0(1, false);
        s50Var.setLayoutManager(k0Var);
        a60 a60Var = new a60(this);
        this.P = a60Var;
        s50Var.setAdapter(a60Var);
        s50Var.setVerticalScrollBarEnabled(false);
        s50Var.setClipToPadding(false);
        s50Var.setNestedScrollingEnabled(true);
        s50Var.setOnScrollListener(new t50(this, k0Var));
        s50Var.setOnItemClickListener(new pk0() { // from class: org.telegram.ui.Components.n50
            @Override // org.telegram.ui.Components.pk0
            public final void a(int i11, View view2) {
                f60.m(f60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, n2Var, i11);
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
        this.containerView.addView(s50Var, h7.z5.d(-1, -1.0f, 51, 0.0f, !this.Y ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, h7.z5.d(-1, !this.Y ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new w1(this, 6));
        }
        b0();
    }

    public static void O(f60 f60Var) {
        View view = f60Var.U;
        TextView textView = f60Var.S;
        s50 s50Var = f60Var.R;
        if (s50Var.getChildCount() <= 0) {
            int paddingTop = s50Var.getPaddingTop();
            f60Var.V = paddingTop;
            s50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(f60Var.V);
            view.setTranslationY(f60Var.V);
            f60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = s50Var.getChildAt(0);
        lk0 lk0Var = (lk0) s50Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            f60Var.Y(true);
        } else {
            f60Var.Y(false);
            i10 = top;
        }
        if (f60Var.V != i10) {
            f60Var.V = i10;
            s50Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(f60Var.V);
            }
            view.setTranslationY(f60Var.V);
            f60Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.c6 c6Var) {
        char c10;
        String str;
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        g10.addView(frameLayout, h7.z5.t(-1, -2, 7, 0, 0, 0, 10));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        if (j10 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
        frameLayout.addView(n9Var, h7.z5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, h7.z5.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, h7.z5.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView i11 = org.telegram.ui.Cells.pa.i(g10, textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i11.setTextSize(1, 14.0f);
        i11.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        i11.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        int i13 = tL_starsSubscriptionPricing.period;
        if (i13 == 2592000) {
            int i14 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            i11.setText(hh.oa.X0(false, LocaleController.formatString(i14, objArr), 0.8f, null));
            e3Var = o10;
        } else {
            str = "min";
            e3Var = o10;
            i11.setText(hh.oa.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i13 == 300 ? "5min" : str), 0.8f, null));
        }
        TextView i15 = org.telegram.ui.Cells.pa.i(g10, i11, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i15.setTextSize(1, 14.0f);
        i15.setGravity(17);
        i15.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        int i16 = tL_starsSubscriptionPricing.period;
        if (i16 == 2592000) {
            i15.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            i15.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i16 != 300 ? str : "5min"));
        }
        g10.addView(i15, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        yy0 yy0Var = new yy0(context, c6Var);
        p80 p80Var = new p80(context, c6Var);
        p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i17 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(true);
        p80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z10 = user2 == null;
        String userName = UserObject.getUserName(user2);
        g5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new u50(e3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        if (!z10) {
            yy0Var.i(p80Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
        yy0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            yy0Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        g10.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        p80 p80Var2 = new p80(context, c6Var);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new p20(context, 1)));
        p80Var2.setGravity(17);
        g10.addView(p80Var2, h7.z5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        g10.addView(dVar, h7.z5.n(-1, 48));
        dVar.setOnClickListener(new h2(e3VarArr, 2));
        e3Var2.customView = g10;
        e3VarArr[0] = e3Var2;
        e3Var2.useBackgroundTopPadding = false;
        e3Var2.fixNavigationBar();
        e3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            return;
        }
        if (view instanceof i80) {
            ((i80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.sa) {
            ((org.telegram.ui.Cells.sa) view).j(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(final f60 f60Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, final Context context, final long j10, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == f60Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(f60Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = f60Var.x;
        boolean z10 = i10 >= i11 && i10 < f60Var.y;
        int i12 = f60Var.B;
        boolean z11 = i10 >= i12 && i10 < f60Var.C;
        int i13 = f60Var.K;
        boolean z12 = i10 >= i13 && i10 < f60Var.L;
        if ((i10 != f60Var.n && !z10 && !z12) || hashMap == null) {
            return;
        }
        long j11 = tL_chatInviteExported.admin_id;
        if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.Z.get(i10 - i11);
            j11 = tL_chatInviteImporter2.user_id;
        } else if (z11) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.a0.get(i10 - i12);
            j11 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z12) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z10 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((KeyEvent.Callback) f60Var, (Object) user, n2Var, 17), 100L);
                        f60Var.dismiss();
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
                        Z(context, f60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, f60Var.resourcesProvider);
                        return;
                    }
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                    b2Var.q(120L);
                    final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                    MessagesController.getInstance(f60Var.currentAccount).getChannelParticipant(MessagesController.getInstance(f60Var.currentAccount).getChat(Long.valueOf(j10)), user, new Utilities.Callback() { // from class: org.telegram.ui.Components.p50
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            AndroidUtilities.runOnUIThread(new gf.h0(f60.this, b2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                        }
                    });
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.b0.get(i10 - i13);
            j11 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
        if (user == null) {
        }
    }

    public static /* synthetic */ void n(f60 f60Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        b2Var.c(400L);
        Z(context, f60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, f60Var.resourcesProvider);
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
        if (this.M) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.b;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.Z;
        boolean z12 = i10 > arrayList2.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.a0;
        final boolean z13 = i11 > arrayList3.size();
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
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.o50
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final f60 f60Var = f60.this;
                        final ArrayList arrayList5 = arrayList;
                        final boolean z16 = z10;
                        final boolean z17 = z11;
                        final boolean z18 = z15;
                        final boolean z19 = z13;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.q50
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
                                f60 f60Var2 = f60.this;
                                if (tL_error == null) {
                                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                    ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                    ArrayList arrayList7 = arrayList5;
                                    arrayList7.addAll(arrayList6);
                                    for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                        TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                        f60Var2.c.put(Long.valueOf(user.id), user);
                                    }
                                    boolean z20 = true;
                                    if (!z16) {
                                        boolean z21 = z17;
                                        boolean z22 = z18;
                                        if (z21) {
                                            f60Var2.N = z20;
                                            f60Var2.c0();
                                        } else {
                                            f60Var2.N = z20;
                                            f60Var2.c0();
                                        }
                                    }
                                }
                                f60Var2.M = false;
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters2, new RequestDelegate() { // from class: org.telegram.ui.Components.o50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final f60 f60Var = f60.this;
                final ArrayList arrayList5 = arrayList;
                final boolean z16 = z10;
                final boolean z17 = z11;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.q50
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
                        f60 f60Var2 = f60.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                f60Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    f60Var2.N = z20;
                                    f60Var2.c0();
                                } else {
                                    f60Var2.N = z20;
                                    f60Var2.c0();
                                }
                            }
                        }
                        f60Var2.M = false;
                    }
                });
            }
        });
    }

    public final void Y(boolean z10) {
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
        this.T.addListener(new org.telegram.ui.go(13, this, z10));
        this.T.start();
    }

    public final void b0() {
        TextView textView = this.S;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l5, false));
            if (!this.Y) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false);
        s50 s50Var = this.R;
        s50Var.setGlowColor(w02);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        int hiddenChildCount = s50Var.getHiddenChildCount();
        for (int i10 = 0; i10 < s50Var.getChildCount(); i10++) {
            a0(s50Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(s50Var.V(i11));
        }
        int cachedChildCount = s50Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(s50Var.P(i12));
        }
        int attachedScrapChildCount = s50Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(s50Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
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
            int i10 = this.O;
            this.e = i10;
            this.O = i10 + 2;
            this.f = i10 + 1;
        }
        int i11 = this.O;
        this.h = i11;
        this.O = i11 + 2;
        this.n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        boolean z12 = i12 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.b0;
        ArrayList arrayList3 = this.a0;
        boolean z13 = i12 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i13 = this.O;
            int i14 = i13 + 1;
            this.O = i14;
            this.w = i13;
            this.x = i14;
            int size2 = arrayList.size() + i14;
            this.O = size2;
            this.y = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.O;
            int i16 = i15 + 1;
            this.O = i16;
            this.A = i15;
            this.B = i16;
            int size3 = arrayList3.size() + i16;
            this.O = size3;
            this.C = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i17 = this.O;
            int i18 = i17 + 1;
            this.O = i18;
            this.J = i17;
            this.K = i18;
            int size4 = arrayList2.size() + i18;
            this.O = size4;
            this.L = size4;
        }
        if ((z12 || z13) && !z11) {
            int i19 = this.O;
            this.r = i19;
            this.F = i19 + 1;
            this.O = i19 + 3;
            this.G = i19 + 2;
        }
        this.P.l();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        this.h0 = false;
    }
}
