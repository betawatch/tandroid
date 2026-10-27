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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.ActionBar.k3 {
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
    public final j70 T;
    public final org.telegram.ui.ActionBar.r2 U;
    public final b70 V;
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
    public int m0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public o70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.r2 r2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.k0 = true;
        this.l0 = false;
        this.b = tL_chatInviteExported;
        this.c = hashMap;
        this.U = r2Var;
        this.d = chatFull;
        this.g0 = j10;
        this.b0 = z10;
        this.h0 = z11;
        int i10 = org.telegram.ui.ActionBar.y6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.m0 = this.navBarColor;
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.c = new HashMap();
        }
        this.i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        a70 a70Var = new a70(this, context);
        this.containerView = a70Var;
        a70Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        b70 b70Var = new b70(this, context);
        this.V = b70Var;
        b70Var.u1();
        b70Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        b70Var.setLayoutManager(c0Var);
        j70 j70Var = new j70(this);
        this.T = j70Var;
        b70Var.setAdapter(j70Var);
        b70Var.setVerticalScrollBarEnabled(false);
        b70Var.setClipToPadding(false);
        b70Var.setNestedScrollingEnabled(true);
        b70Var.setOnScrollListener(new c70(this, c0Var));
        b70Var.setOnItemClickListener(new am0() { // from class: org.telegram.ui.Components.x60
            @Override // org.telegram.ui.Components.am0
            public final void c(int i11, View view2) {
                o70.m(o70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, r2Var, i11);
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
        this.containerView.addView(b70Var, kb1.h(-1, -1.0f, 51, 0.0f, !this.c0 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, kb1.h(-1, this.c0 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new b2(this, 6));
        }
        updateColors();
    }

    public static void O(o70 o70Var) {
        View view = o70Var.Y;
        TextView textView = o70Var.W;
        b70 b70Var = o70Var.V;
        if (b70Var.getChildCount() <= 0) {
            int paddingTop = b70Var.getPaddingTop();
            o70Var.Z = paddingTop;
            b70Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(o70Var.Z);
            view.setTranslationY(o70Var.Z);
            o70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b70Var.getChildAt(0);
        wl0 wl0Var = (wl0) b70Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            o70Var.Z(true);
        } else {
            o70Var.Z(false);
            i10 = top;
        }
        if (o70Var.Z != i10) {
            o70Var.Z = i10;
            b70Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(o70Var.Z);
            }
            view.setTranslationY(o70Var.Z);
            o70Var.containerView.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.y9] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.x01] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.aa0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.u6 u6Var) {
        boolean z10;
        Object obj;
        int i11;
        org.telegram.ui.ActionBar.k3 i12 = org.telegram.messenger.wh.i(1, context, u6Var, false);
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        ?? d = org.telegram.messenger.wh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        d.addView(frameLayout, kb1.x(-1, -2, 7, 0, 0, 0, 10));
        ?? y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        if (j10 >= 0) {
            z10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            j9Var.r(user);
            y9Var.f(user, j9Var);
        } else {
            z10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        frameLayout.addView(y9Var, kb1.i(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i13 = org.telegram.ui.ActionBar.y6.h5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.f7.y(imageView, drawable, i13, u6Var, mode);
        frameLayout.addView(imageView, kb1.i(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, kb1.i(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.j5, u6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView e = org.telegram.messenger.wh.e(d, textView, kb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.y6.B6;
        org.telegram.ui.ActionBar.f7.V(e, i14, u6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            e.setText(bi.dd.W0(z10, LocaleController.formatString(i16, objArr), 0.8f, null));
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
            e.setText(bi.dd.W0(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView e10 = org.telegram.messenger.wh.e(d, e, kb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e10.setTextSize(1, 14.0f);
        e10.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(e10, i11, u6Var);
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            e10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } else {
            e10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i17 == 300 ? "5min" : obj));
        }
        d.addView(e10, kb1.x(-1, -2, 17, 20, 0, 20, 4));
        ?? x01Var = new x01(context, u6Var);
        ?? aa0Var = new aa0(context, u6Var);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        aa0Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i18, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, i18, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setSingleLine(true);
        aa0Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(aa0Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z12 = user2 == null;
        String userName = UserObject.getUserName(user2);
        j5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new d70(k3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        aa0Var.setText(spannableStringBuilder);
        if (!z12) {
            x01Var.l(aa0Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        x01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            x01Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        d.addView(x01Var, kb1.o(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        aa0 aa0Var2 = new aa0(context, u6Var);
        org.telegram.ui.ActionBar.f7.V(aa0Var2, org.telegram.ui.ActionBar.y6.z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var2, i18, u6Var);
        aa0Var2.setTextSize(1, 14.0f);
        aa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new m30(context, 1)));
        aa0Var2.setGravity(17);
        d.addView(aa0Var2, kb1.o(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        d.addView(dVar, kb1.r(-1, 48));
        dVar.setOnClickListener(new n2(k3VarArr, 2));
        i12.customView = d;
        k3VarArr[0] = i12;
        i12.useBackgroundTopPadding = false;
        i12.fixNavigationBar();
        k3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.L6, false));
            return;
        }
        if (view instanceof s90) {
            ((s90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.i9) {
            org.telegram.ui.ActionBar.f7.V(((org.telegram.ui.Cells.i9) view).getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.ab) {
            ((org.telegram.ui.Cells.ab) view).i(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(o70 o70Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap hashMap, TLRPC.ChatFull chatFull, Context context, long j10, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == o70Var.n && tL_chatInviteExported.admin_id == UserConfig.getInstance(o70Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = o70Var.x;
        boolean z10 = i10 >= i11 && i10 < o70Var.y;
        int i12 = o70Var.F;
        boolean z11 = i10 >= i12 && i10 < o70Var.G;
        int i13 = o70Var.O;
        boolean z12 = i10 >= i13 && i10 < o70Var.P;
        if ((i10 != o70Var.n && !z10 && !z12) || hashMap == null) {
            return;
        }
        long j11 = tL_chatInviteExported.admin_id;
        if (z10) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) o70Var.d0.get(i10 - i11);
            j11 = tL_chatInviteImporter2.user_id;
        } else if (z11) {
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) o70Var.e0.get(i10 - i12);
            j11 = tL_chatInviteImporter2.user_id;
        } else {
            if (!z12) {
                tL_chatInviteImporter = null;
                user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
                if (user == null) {
                    MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                    if (!z10 || tL_chatInviteExported.subscription_pricing == null) {
                        AndroidUtilities.runOnUIThread(new kg(o70Var, user, r2Var, 10), 100L);
                        o70Var.dismiss();
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
                        a0(context, o70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, o70Var.resourcesProvider);
                        return;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
                    e2Var.r(120L);
                    MessagesController.getInstance(o70Var.currentAccount).getChannelParticipant(MessagesController.getInstance(o70Var.currentAccount).getChat(Long.valueOf(j10)), user, new bi.q3(o70Var, e2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter, 1));
                    return;
                }
                return;
            }
            tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) o70Var.f0.get(i10 - i13);
            j11 = tL_chatInviteImporter2.user_id;
        }
        tL_chatInviteImporter = tL_chatInviteImporter2;
        user = (TLRPC.User) hashMap.get(Long.valueOf(j11));
        if (user == null) {
        }
    }

    public static /* synthetic */ void n(o70 o70Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        e2Var.c(400L);
        a0(context, o70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, o70Var.resourcesProvider);
    }

    public final void X() {
        TextView textView = this.W;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.l5, false));
                if (!this.c0) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        b70 b70Var = this.V;
        if (b70Var != null) {
            b70Var.setGlowColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false));
        }
        View view = this.Y;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
        }
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
                final o70 o70Var = o70.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z16 = z11;
                final boolean z17 = z10;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.z60
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
                        o70 o70Var2 = o70.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                o70Var2.c.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    o70Var2.R = z20;
                                    o70Var2.c0();
                                } else {
                                    o70Var2.R = z20;
                                    o70Var2.c0();
                                }
                            }
                        }
                        o70Var2.Q = false;
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
        this.X.addListener(new org.telegram.ui.lo(13, this, z10));
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

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            if (this.shadowDrawable != null) {
                setBackgroundColor(themedColor);
            }
            if (this.navBarColorKey < 0 && (i10 = this.navBarColor) == this.m0 && themedColor != i10) {
                this.navBarColor = themedColor;
                this.m0 = themedColor;
                setOverlayNavBarColor(themedColor);
            }
            X();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        this.l0 = false;
    }

    public final void updateColors() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.l5, false));
            if (!this.c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false);
        b70 b70Var = this.V;
        b70Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false));
        int hiddenChildCount = b70Var.getHiddenChildCount();
        for (int i10 = 0; i10 < b70Var.getChildCount(); i10++) {
            b0(b70Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(b70Var.V(i11));
        }
        int cachedChildCount = b70Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(b70Var.P(i12));
        }
        int attachedScrapChildCount = b70Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(b70Var.O(i13));
        }
        this.containerView.invalidate();
    }
}
