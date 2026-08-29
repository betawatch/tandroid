package ih;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.h6;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import jh.b8;
import jh.i9;
import jh.ia;
import jh.k7;
import jh.s7;
import jh.x9;
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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qf;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int r0 = 0;
    public final int T;
    public k51 U;
    public List V;
    public final Utilities.Callback W;
    public TLRPC.DisallowedGiftsSettings X;
    public final long Y;
    public final boolean Z;
    public final String a0;
    public final x9 b0;
    public final l1 c0;
    public final FrameLayout d0;
    public final LinearLayout e0;
    public final iz f0;
    public final q1 g0;
    public final m1 h0;
    public final n1 i0;
    public final ArrayList j0;
    public final k7 k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;

    public h2(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, false, 1, null);
        this.j0 = new ArrayList();
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        new ArrayList();
        this.T = i10;
        this.Y = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.Z = z10;
        this.V = list;
        this.W = callback;
        int i11 = g6.b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(g6.w0(null, i11, false));
        fixNavigationBar(g6.w0(null, i11, false));
        this.k0 = s7.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        s7.y(i10, false).V();
        t9 t9Var = new t9(context);
        int i12 = 2;
        t9Var.setImportantForAccessibility(2);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.a0 = UserObject.getForcedFirstName(user);
            e9Var.r(user);
            t9Var.e(user, e9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.X = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.a0 = chat == null ? "" : chat.title;
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
        this.v = 0.1f;
        x9 x9Var = new x9(context, i10, this.resourcesProvider);
        this.b0 = x9Var;
        h6.a(x9Var);
        x9Var.setOnClickListener(new ag.o(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        l1 l1Var = new l1(context);
        this.c0 = l1Var;
        l1Var.setClipChildren(false);
        l1Var.setClipToPadding(false);
        l1Var.addView(new i9(context, 70, 0), i7.f6.c(-1.0f, -1));
        t9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        l1Var.addView(t9Var, i7.f6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        h6.a(t9Var);
        t9Var.setOnClickListener(new bh.s(this, j10, i12));
        l1Var.addView(x9Var, i7.f6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, i7.f6.e(-1, -2, 55));
        TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
        h.setTypeface(AndroidUtilities.bold());
        int i13 = g6.j5;
        h.setTextColor(g6.v0(i13, this.resourcesProvider));
        h.setGravity(17);
        linearLayout.addView(h, i7.f6.t(-1, -2, 1, 4, 0, 4, 0));
        h.setMaxWidth(nh.t3.a(h.getText(), h.getPaint()));
        y80 y80Var = new y80(context, this.resourcesProvider);
        int i14 = g6.gc;
        y80Var.setLinkTextColor(g6.v0(i14, this.resourcesProvider));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(i13, this.resourcesProvider));
        y80Var.setGravity(17);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 1, 4, 4, 4, 12));
        h.setText(LocaleController.getString(R.string.Gift2Premium));
        y80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.a0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ag.o0(7)), true)));
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(g6.v0(i13, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, i7.f6.t(-1, -2, 1, 4, 0, 4, 0));
        m1 m1Var = new m1(context, this.resourcesProvider);
        this.h0 = m1Var;
        m1Var.setLinkTextColor(g6.v0(i14, this.resourcesProvider));
        m1Var.setTextSize(1, 14.0f);
        m1Var.setTextColor(g6.v0(i13, this.resourcesProvider));
        m1Var.setGravity(17);
        n1 n1Var = new n1(context, this.resourcesProvider);
        this.i0 = n1Var;
        n1Var.setLinkTextColor(g6.v0(i14, this.resourcesProvider));
        n1Var.setTextSize(1, 14.0f);
        n1Var.setTextColor(g6.v0(i13, this.resourcesProvider));
        n1Var.setGravity(17);
        n1Var.setAlpha(0.0f);
        n1Var.setScaleX(0.85f);
        n1Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(m1Var, i7.f6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(n1Var, i7.f6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z10) {
            linearLayout2.addView(frameLayout2, i7.f6.t(-2, -2, 1, 0, 9, 0, 4));
            y80 y80Var2 = new y80(context, this.resourcesProvider);
            y80Var2.setLinkTextColor(g6.v0(i14, this.resourcesProvider));
            y80Var2.setTextSize(1, 14.0f);
            y80Var2.setTextColor(g6.v0(i13, this.resourcesProvider));
            y80Var2.setGravity(17);
            linearLayout2.addView(y80Var2, i7.f6.t(-2, -2, 1, 26, 4, 26, 6));
            m1Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            y80Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (j10 < 0) {
            linearLayout2.addView(frameLayout2, i7.f6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(m1Var);
            m1Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.a0)), m1Var.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, i7.f6.t(-1, -2, 1, 0, 9, 0, 6));
            k7 G = s7.y(i10, false).G(j10, true);
            h1 h1Var = new h1(this, G, j10, callback, context, 0);
            h1Var.run();
            m1Var.addOnAttachStateChangeListener(new o1(h1Var));
            if (G.l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(m1Var, NotificationCenter.starUserGiftsLoaded, new b1(1, G, h1Var));
        }
        iz izVar = new iz(3, false);
        this.f0 = izVar;
        izVar.O = new p1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(izVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        q1 q1Var = new q1();
        this.g0 = q1Var;
        q1Var.C = false;
        q1Var.m = false;
        q1Var.n(350L);
        q1Var.o(jr.h);
        q1Var.D = 40L;
        this.d.setItemAnimator(q1Var);
        this.d.setOnItemClickListener(new zk0() { // from class: ih.i1
            @Override // org.telegram.ui.Components.zk0
            public final void c(int i15, View view) {
                h2.Q(h2.this, context, i10, callback, j10, i15);
            }
        });
        W();
        this.U.N(false);
        M();
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

    public static void P(final h2 h2Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, bg.j3 j3Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            j3Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new tc(h2Var.container, h2Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getContext(), 0, h2Var.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.P = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
        final bu buVar = o10.n;
        if (buVar != null) {
            buVar.setOnLinkPressListener(new x80() { // from class: ih.g1
                @Override // org.telegram.ui.Components.x80
                public final void a(ClickableSpan clickableSpan) {
                    h2 h2Var2 = h2.this;
                    h2Var2.getClass();
                    o10.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    h2Var2.dismiss();
                    clickableSpan.onClick(buVar);
                }
            });
        }
    }

    public static void Q(h2 h2Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        w41 G = h2Var.U.G(i11 - 1);
        if (G != null && G.G(x1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof cg.n) {
                new r1(h2Var, context, i10, (cg.n) obj, h2Var.Y, new y0(h2Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                k7 k7Var = h2Var.k0;
                if (k7Var != null && h2Var.o0 == h2Var.m0) {
                    ArrayList arrayList = k7Var.l;
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
                    s1 s1Var = new s1(h2Var, h2Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), h2Var.resourcesProvider);
                    s1Var.j2(savedStarGift, null);
                    s1Var.Z1(j10, new z0(h2Var, s1Var, j10, callback, 0));
                    return;
                }
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    m2Var.e = true;
                    t1 t1Var = new t1(j10, starGift.title, starGift.id, h2Var.resourcesProvider, h2Var.container.getViewTreeObserver(), new a1());
                    t1Var.e = new b1(i12, h2Var, callback);
                    U.showAsSheet(t1Var, m2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new u(context, h2Var.resourcesProvider, i10, j10, new y0(h2Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new tc(h2Var.container, h2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    bg.j3 j3Var = new bg.j3(h2Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(h2Var.getContext(), 3, null);
                        c2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new c1(h2Var, c2Var, j3Var, callback, 0));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        j3Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    cg.f2 f2Var = new cg.f2(U2, i10, null, null, starGift, h2Var.resourcesProvider);
                    t9 t9Var = new t9(h2Var.getContext());
                    org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(160.0f), 4, t9Var, false);
                    t9Var.setImageDrawable(n5Var);
                    t9Var.addOnAttachStateChangeListener(new k1(n5Var));
                    n5Var.i(starGift.getDocument(), false);
                    f2Var.x0 = t9Var;
                    f2Var.show();
                    n5Var.f();
                    return;
                }
                org.telegram.ui.ActionBar.c6 c6Var = h2Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                g10.setClipChildren(false);
                g10.setClipToPadding(false);
                t9 t9Var2 = new t9(context);
                ia.a1(t9Var2.getImageReceiver(), starGift, 160);
                g10.addView(t9Var2, i7.f6.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.b.w(g6.j5, c6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView i13 = th.i(g10, textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
                i13.setTextSize(1, 14.0f);
                i13.setTypeface(AndroidUtilities.bold());
                i13.setGravity(17);
                i13.setTextColor(g6.v0(g6.q7, c6Var));
                i13.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                g10.addView(i13, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
                hz0 hz0Var = new hz0(context, c6Var);
                if (starGift.first_sale_date != 0) {
                    hz0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    hz0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                hz0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), ia.X0(false, j7.l1.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    ia.F0(hz0Var, i10, starGift, c6Var);
                }
                g10.addView(hz0Var, i7.f6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                nh.d dVar = new nh.d(context, c6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                g10.addView(dVar, i7.f6.n(-1, 48));
                q6.customView = g10;
                org.telegram.ui.ActionBar.f3[] f3VarArr = {q6};
                f3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new b8(f3VarArr, 2));
                f3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    f3VarArr[0].makeAttached(U3);
                }
                f3VarArr[0].show();
            }
        }
    }

    public final void U(ArrayList arrayList, k51 k51Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 2;
        l1 l1Var = this.c0;
        long j11 = this.Y;
        long j12 = 0;
        int i11 = 0;
        boolean z12 = this.Z;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.X) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(w41.k(l1Var));
            arrayList.add(w41.k(this.d0));
            ArrayList arrayList2 = this.j0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                w41 o10 = w41.o(1, 34);
                o10.u = 1;
                arrayList.add(o10);
                w41 o11 = w41.o(2, 34);
                o11.u = 1;
                arrayList.add(o11);
                w41 o12 = w41.o(3, 34);
                o12.u = 1;
                arrayList.add(o12);
            } else {
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    int i13 = x1.a;
                    long j13 = j12;
                    w41 J = w41.J(x1.class);
                    J.u = 1;
                    J.G = (cg.n) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i14 = this.T;
        s7 y8 = s7.y(i14, false);
        ArrayList arrayList3 = this.p0 ? y8.J : y8.I;
        if (this.X != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ph.f1(this, i10)).collect(Collectors.toCollection(new qf()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new d1(i11)).collect(Collectors.toCollection(new qf()));
        }
        long clientUserId = UserConfig.getInstance(i14).getClientUserId();
        k7 k7Var = this.k0;
        if (j11 != clientUserId && k7Var != null) {
            ArrayList arrayList4 = k7Var.l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (MessagesController.getInstance(i14).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.X) == null || disallowedGiftsSettings3.disallow_unique_stargifts || k7Var == null || k7Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.X;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(w41.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(w41.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(w41.k(l1Var));
        }
        arrayList.add(w41.k(this.e0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.X;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i16)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.m0 = -1;
        this.l0 = -1;
        if (!arrayList3.isEmpty()) {
            this.l0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.X;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.m0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
        }
        this.n0 = arrayList5.size();
        arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
        int i17 = this.o0;
        e1 e1Var = new e1(this, i11);
        int i18 = f2.a;
        w41 J2 = w41.J(f2.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i17;
        J2.H = e1Var;
        arrayList.add(J2);
        boolean z13 = this.o0 == this.n0 && !z12 && j11 >= j10;
        if (z13 != this.q0) {
            this.q0 = z13;
            ViewPropertyAnimator duration = this.h0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
            this.i0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(jrVar).start();
        }
        if (k7Var != null && this.o0 == this.m0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = k7Var.l;
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
            int i22 = this.o0;
            if (i22 == this.l0 || i22 == this.m0 || (i22 == this.n0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i22 == this.n0) {
                    starGift = starGift3;
                } else {
                    w41 a2 = x1.a(i22, starGift3, i22 == this.m0, starGift3.limited && (disallowedGiftsSettings2 = this.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i20++;
                }
                int i23 = this.o0;
                arrayList.add(x1.a(i23, starGift, i23 == this.m0, starGift.limited && (disallowedGiftsSettings = this.X) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i20++;
            }
        }
        int i24 = this.o0;
        int i25 = this.m0;
        if (i24 == i25 && k7Var != null && !k7Var.j) {
            k7Var.a();
            w41 o13 = w41.o(4, 34);
            o13.u = 1;
            arrayList.add(o13);
            w41 o14 = w41.o(5, 34);
            o14.u = 1;
            arrayList.add(o14);
            w41 o15 = w41.o(6, 34);
            o15.u = 1;
            arrayList.add(o15);
        } else if (i24 != i25 && y8.C) {
            w41 o16 = w41.o(4, 34);
            o16.u = 1;
            arrayList.add(o16);
            w41 o17 = w41.o(5, 34);
            o17.u = 1;
            arrayList.add(o17);
            w41 o18 = w41.o(6, 34);
            o18.u = 1;
            arrayList.add(o18);
        }
        arrayList.add(w41.C(AndroidUtilities.dp(i20 >= 9 ? 40.0f : 300.0f)));
    }

    public final void V(boolean z10) {
        this.p0 = z10;
        this.U.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.j0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.V.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V.iterator();
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
                    cg.n nVar = new cg.n(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(nVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    } else if (nVar.h() != null && BillingController.getInstance().isReady()) {
                        d9.c cVar = new d9.c();
                        cVar.c = "inapp";
                        cVar.b = nVar.h();
                        arrayList2.add(cVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((cg.n) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new eg.n(this, 9));
            }
        }
        if (arrayList.isEmpty()) {
            eg.q0.j(this.T, null, new e1(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            k51 k51Var2 = this.U;
            if (k51Var2 != null) {
                k51Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.k0 && (k51Var = this.U) != null) {
                    k51Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new tc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                k51 k51Var3 = this.U;
                if (k51Var3 != null) {
                    k51Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.Y;
            if (longValue == j10 && j10 > 0) {
                int i12 = this.T;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.X = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        tc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                k51 k51Var4 = this.U;
                if (k51Var4 != null) {
                    k51Var4.N(true);
                }
            }
            ArrayList arrayList = this.j0;
            if (arrayList == null || arrayList.isEmpty()) {
                W();
                k51 k51Var5 = this.U;
                if (k51Var5 != null) {
                    k51Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.T;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        int i10 = this.T;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.X;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            tc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Y)))).j();
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.T, 0, true, new bg.t1(this, 9), this.resourcesProvider);
        this.U = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return this.Z ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.a0), null, false);
    }

    public h2(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }
}
