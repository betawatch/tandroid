package lh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import mh.c8;
import mh.j9;
import mh.ja;
import mh.l7;
import mh.t7;
import mh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xf;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int s0 = 0;
    public final int U;
    public w51 V;
    public List W;
    public final Utilities.Callback X;
    public TLRPC.DisallowedGiftsSettings Y;
    public final long Z;
    public final boolean a0;
    public final String b0;
    public final y9 c0;
    public final k1 d0;
    public final FrameLayout e0;
    public final LinearLayout f0;
    public final pz g0;
    public final p1 h0;
    public final l1 i0;
    public final m1 j0;
    public final ArrayList k0;
    public final l7 l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public boolean r0;

    public g2(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, false, 1, null);
        this.k0 = new ArrayList();
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        new ArrayList();
        this.U = i10;
        this.Z = j10;
        boolean z4 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.a0 = z4;
        this.W = list;
        this.X = callback;
        int i11 = k6.b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(k6.w0(null, i11, false));
        fixNavigationBar(k6.w0(null, i11, false));
        this.l0 = t7.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        t7.y(i10, false).V();
        p9 p9Var = new p9(context);
        int i12 = 2;
        p9Var.setImportantForAccessibility(2);
        z8 z8Var = new z8((g6) null);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.b0 = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            p9Var.e(user, z8Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.Y = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.b0 = chat == null ? "" : chat.title;
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        this.v = 0.1f;
        y9 y9Var = new y9(context, i10, this.resourcesProvider);
        this.c0 = y9Var;
        k7.e6.a(y9Var);
        y9Var.setOnClickListener(new androidx.mediarouter.app.c(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        k1 k1Var = new k1(context);
        this.d0 = k1Var;
        k1Var.setClipChildren(false);
        k1Var.setClipToPadding(false);
        k1Var.addView(new j9(context, 70, 0), k7.c6.c(-1.0f, -1));
        p9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        k1Var.addView(p9Var, k7.c6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        k7.e6.a(p9Var);
        p9Var.setOnClickListener(new eh.t(this, j10, i12));
        k1Var.addView(y9Var, k7.c6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, k7.c6.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i13 = k6.j5;
        g10.setTextColor(k6.v0(i13, this.resourcesProvider));
        g10.setGravity(17);
        linearLayout.addView(g10, k7.c6.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(qh.e3.a(g10.getText(), g10.getPaint()));
        g90 g90Var = new g90(context, this.resourcesProvider);
        int i14 = k6.gc;
        g90Var.setLinkTextColor(k6.v0(i14, this.resourcesProvider));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(i13, this.resourcesProvider));
        g90Var.setGravity(17);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(g90Var, k7.c6.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        g90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.b0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ag.f(10)), true)));
        g90Var.setMaxWidth(qh.e3.a(g90Var.getText(), g90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(k6.v0(i13, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, k7.c6.t(-1, -2, 1, 4, 0, 4, 0));
        l1 l1Var = new l1(context, this.resourcesProvider);
        this.i0 = l1Var;
        l1Var.setLinkTextColor(k6.v0(i14, this.resourcesProvider));
        l1Var.setTextSize(1, 14.0f);
        l1Var.setTextColor(k6.v0(i13, this.resourcesProvider));
        l1Var.setGravity(17);
        m1 m1Var = new m1(context, this.resourcesProvider);
        this.j0 = m1Var;
        m1Var.setLinkTextColor(k6.v0(i14, this.resourcesProvider));
        m1Var.setTextSize(1, 14.0f);
        m1Var.setTextColor(k6.v0(i13, this.resourcesProvider));
        m1Var.setGravity(17);
        m1Var.setAlpha(0.0f);
        m1Var.setScaleX(0.85f);
        m1Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(l1Var, k7.c6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(m1Var, k7.c6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z4 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z4) {
            linearLayout2.addView(frameLayout2, k7.c6.t(-2, -2, 1, 0, 9, 0, 4));
            g90 g90Var2 = new g90(context, this.resourcesProvider);
            g90Var2.setLinkTextColor(k6.v0(i14, this.resourcesProvider));
            g90Var2.setTextSize(1, 14.0f);
            g90Var2.setTextColor(k6.v0(i13, this.resourcesProvider));
            g90Var2.setGravity(17);
            linearLayout2.addView(g90Var2, k7.c6.t(-2, -2, 1, 26, 4, 26, 6));
            l1Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            g90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (j10 < 0) {
            linearLayout2.addView(frameLayout2, k7.c6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(l1Var);
            l1Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.b0)), l1Var.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, k7.c6.t(-1, -2, 1, 0, 9, 0, 6));
            l7 G = t7.y(i10, false).G(j10, true);
            g1 g1Var = new g1(this, G, j10, callback, context, 0);
            g1Var.run();
            l1Var.addOnAttachStateChangeListener(new n1(g1Var));
            if (G.l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(l1Var, NotificationCenter.starUserGiftsLoaded, new a1(1, G, g1Var));
        }
        pz pzVar = new pz(3, false);
        this.g0 = pzVar;
        pzVar.O = new o1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(pzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        p1 p1Var = new p1();
        this.h0 = p1Var;
        p1Var.C = false;
        p1Var.m = false;
        p1Var.n(350L);
        p1Var.o(pr.h);
        p1Var.D = 40L;
        this.d.setItemAnimator(p1Var);
        this.d.setOnItemClickListener(new il0() { // from class: lh.h1
            @Override // org.telegram.ui.Components.il0
            public final void f(int i15, View view) {
                g2.Q(g2.this, context, i10, callback, j10, i15);
            }
        });
        W();
        this.V.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }

    public static void P(final g2 g2Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, eg.d3 d3Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            d3Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new qc(g2Var.container, g2Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext(), 0, g2Var.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.Q = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
        final gu guVar = o10.n;
        if (guVar != null) {
            guVar.setOnLinkPressListener(new f90() { // from class: lh.f1
                @Override // org.telegram.ui.Components.f90
                public final void a(ClickableSpan clickableSpan) {
                    g2 g2Var2 = g2.this;
                    g2Var2.getClass();
                    o10.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    g2Var2.dismiss();
                    clickableSpan.onClick(guVar);
                }
            });
        }
    }

    public static void Q(g2 g2Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        h51 G = g2Var.V.G(i11 - 1);
        if (G != null && G.G(w1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof fg.n) {
                new q1(g2Var, context, i10, (fg.n) obj, g2Var.Z, new x0(g2Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                l7 l7Var = g2Var.l0;
                if (l7Var != null && g2Var.p0 == g2Var.n0) {
                    ArrayList arrayList = l7Var.l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    r1 r1Var = new r1(g2Var, g2Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), g2Var.resourcesProvider);
                    r1Var.j2(savedStarGift, null);
                    r1Var.Z1(j10, new y0(g2Var, r1Var, j10, callback, 0));
                    return;
                }
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    n2Var.e = true;
                    s1 s1Var = new s1(j10, starGift.title, starGift.id, g2Var.resourcesProvider, g2Var.container.getViewTreeObserver(), new z0());
                    s1Var.e = new a1(i12, g2Var, callback);
                    U.showAsSheet(s1Var, n2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new t(context, g2Var.resourcesProvider, i10, j10, new x0(g2Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new qc(g2Var.container, g2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    eg.d3 d3Var = new eg.d3(g2Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(g2Var.getContext(), 3, null);
                        d2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new b1(g2Var, d2Var, d3Var, callback, 0));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        d3Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    fg.d2 d2Var2 = new fg.d2(U2, i10, null, null, starGift, g2Var.resourcesProvider);
                    p9 p9Var = new p9(g2Var.getContext());
                    org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(160.0f), 4, p9Var, false);
                    p9Var.setImageDrawable(j5Var);
                    p9Var.addOnAttachStateChangeListener(new j1(j5Var));
                    j5Var.i(starGift.getDocument(), false);
                    d2Var2.y0 = p9Var;
                    d2Var2.show();
                    j5Var.f();
                    return;
                }
                g6 g6Var = g2Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
                LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                f10.setClipChildren(false);
                f10.setClipToPadding(false);
                p9 p9Var2 = new p9(context);
                ja.a1(p9Var2.getImageReceiver(), starGift, 160);
                f10.addView(p9Var2, k7.c6.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.b.w(k6.j5, g6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView i13 = yh.i(f10, textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 4), context);
                i13.setTextSize(1, 14.0f);
                i13.setTypeface(AndroidUtilities.bold());
                i13.setGravity(17);
                i13.setTextColor(k6.v0(k6.q7, g6Var));
                i13.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                f10.addView(i13, k7.c6.t(-1, -2, 17, 20, 0, 20, 4));
                sz0 sz0Var = new sz0(context, g6Var);
                if (starGift.first_sale_date != 0) {
                    sz0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    sz0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                sz0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), ja.X0(false, l.d.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    ja.F0(sz0Var, i10, starGift, g6Var);
                }
                f10.addView(sz0Var, k7.c6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                qh.d dVar = new qh.d(context, g6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                f10.addView(dVar, k7.c6.n(-1, 48));
                o10.customView = f10;
                org.telegram.ui.ActionBar.h3[] h3VarArr = {o10};
                h3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new c8(h3VarArr, 2));
                h3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    h3VarArr[0].makeAttached(U3);
                }
                h3VarArr[0].show();
            }
        }
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        long j10;
        boolean z4;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 2;
        k1 k1Var = this.d0;
        long j11 = this.Z;
        long j12 = 0;
        int i11 = 0;
        boolean z11 = this.a0;
        if (z11 || j11 < 0 || ((disallowedGiftsSettings4 = this.Y) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z4 = false;
        } else {
            arrayList.add(h51.k(k1Var));
            arrayList.add(h51.k(this.e0));
            ArrayList arrayList2 = this.k0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                h51 o10 = h51.o(1, 34);
                o10.u = 1;
                arrayList.add(o10);
                h51 o11 = h51.o(2, 34);
                o11.u = 1;
                arrayList.add(o11);
                h51 o12 = h51.o(3, 34);
                o12.u = 1;
                arrayList.add(o12);
            } else {
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    int i13 = w1.a;
                    long j13 = j12;
                    h51 J = h51.J(w1.class);
                    J.u = 1;
                    J.G = (fg.n) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            }
            z4 = true;
        }
        int i14 = this.U;
        t7 y10 = t7.y(i14, false);
        ArrayList arrayList3 = this.q0 ? y10.J : y10.I;
        if (this.Y != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new sh.f1(this, i10)).collect(Collectors.toCollection(new xf()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new c1(i11)).collect(Collectors.toCollection(new xf()));
        }
        long clientUserId = UserConfig.getInstance(i14).getClientUserId();
        l7 l7Var = this.l0;
        if (j11 != clientUserId && l7Var != null) {
            ArrayList arrayList4 = l7Var.l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (MessagesController.getInstance(i14).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.Y) == null || disallowedGiftsSettings3.disallow_unique_stargifts || l7Var == null || l7Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.Y;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(h51.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z4) {
            arrayList.add(h51.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(h51.k(k1Var));
        }
        arrayList.add(h51.k(this.f0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.Y;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i16)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.n0 = -1;
        this.m0 = -1;
        if (!arrayList3.isEmpty()) {
            this.m0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.Y;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z10) {
            this.n0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
        }
        this.o0 = arrayList5.size();
        arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
        int i17 = this.p0;
        d1 d1Var = new d1(this, i11);
        int i18 = e2.a;
        h51 J2 = h51.J(e2.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i17;
        J2.H = d1Var;
        arrayList.add(J2);
        boolean z12 = this.p0 == this.o0 && !z11 && j11 >= j10;
        if (z12 != this.r0) {
            this.r0 = z12;
            ViewPropertyAnimator duration = this.i0.animate().alpha(!z12 ? 1.0f : 0.0f).scaleX(!z12 ? 1.0f : 0.85f).scaleY(!z12 ? 1.0f : 0.85f).setDuration(380L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).start();
            this.j0.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.85f).scaleY(z12 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(prVar).start();
        }
        if (l7Var != null && this.p0 == this.n0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = l7Var.l;
            int size3 = arrayList6.size();
            int i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList6.get(i19);
                i19++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < arrayList3.size(); i21++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i21);
            int i22 = this.p0;
            if (i22 == this.m0 || i22 == this.n0 || (i22 == this.o0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i22 == this.o0) {
                    starGift = starGift3;
                } else {
                    h51 a2 = w1.a(i22, starGift3, i22 == this.n0, starGift3.limited && (disallowedGiftsSettings2 = this.Y) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i20++;
                }
                int i23 = this.p0;
                arrayList.add(w1.a(i23, starGift, i23 == this.n0, starGift.limited && (disallowedGiftsSettings = this.Y) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i20++;
            }
        }
        int i24 = this.p0;
        int i25 = this.n0;
        if (i24 == i25 && l7Var != null && !l7Var.j) {
            l7Var.a();
            h51 o13 = h51.o(4, 34);
            o13.u = 1;
            arrayList.add(o13);
            h51 o14 = h51.o(5, 34);
            o14.u = 1;
            arrayList.add(o14);
            h51 o15 = h51.o(6, 34);
            o15.u = 1;
            arrayList.add(o15);
        } else if (i24 != i25 && y10.C) {
            h51 o16 = h51.o(4, 34);
            o16.u = 1;
            arrayList.add(o16);
            h51 o17 = h51.o(5, 34);
            o17.u = 1;
            arrayList.add(o17);
            h51 o18 = h51.o(6, 34);
            o18.u = 1;
            arrayList.add(o18);
        }
        arrayList.add(h51.C(AndroidUtilities.dp(i20 >= 9 ? 40.0f : 300.0f)));
    }

    public final void V(boolean z4) {
        this.q0 = z4;
        this.V.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.k0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.W) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.W.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.W.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.W.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    fg.n nVar = new fg.n(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(nVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    } else if (nVar.h() != null && BillingController.getInstance().isReady()) {
                        b6.h hVar = new b6.h();
                        hVar.c = "inapp";
                        hVar.b = nVar.h();
                        arrayList2.add(hVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((fg.n) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new hg.f(this, 25));
            }
        }
        if (arrayList.isEmpty()) {
            hg.p0.j(this.U, null, new d1(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            w51 w51Var2 = this.V;
            if (w51Var2 != null) {
                w51Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.l0 && (w51Var = this.V) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new qc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                w51 w51Var3 = this.V;
                if (w51Var3 != null) {
                    w51Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.Z;
            if (longValue == j10 && j10 > 0) {
                int i12 = this.U;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.Y = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                w51 w51Var4 = this.V;
                if (w51Var4 != null) {
                    w51Var4.N(true);
                }
            }
            ArrayList arrayList = this.k0;
            if (arrayList == null || arrayList.isEmpty()) {
                W();
                w51 w51Var5 = this.V;
                if (w51Var5 != null) {
                    w51Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.U;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        int i10 = this.U;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.Y;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Z)))).j();
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.U, 0, true, new eg.p1(this, 9), this.resourcesProvider);
        this.V = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.a0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.b0), null, false);
    }

    public g2(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }
}
