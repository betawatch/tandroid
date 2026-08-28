package fh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.da;
import gh.e8;
import gh.n7;
import gh.n9;
import gh.oa;
import gh.v7;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int r0 = 0;
    public final int T;
    public z41 U;
    public List V;
    public final Utilities.Callback W;
    public TLRPC.DisallowedGiftsSettings X;
    public final long Y;
    public final boolean Z;
    public final String a0;
    public final da b0;
    public final r1 c0;
    public final FrameLayout d0;
    public final LinearLayout e0;
    public final zy f0;
    public final w1 g0;
    public final s1 h0;
    public final t1 i0;
    public final ArrayList j0;
    public final n7 k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p2(final Context context, final int i9, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, false, 1, null);
        int i10;
        this.j0 = new ArrayList();
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        new ArrayList();
        this.T = i9;
        this.Y = j10;
        int i11 = 1;
        boolean z10 = UserConfig.getInstance(i9).getClientUserId() == j10;
        this.Z = z10;
        this.V = list;
        this.W = callback;
        int i12 = org.telegram.ui.ActionBar.f6.b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.k0 = v7.y(i9, false).G(UserConfig.getInstance(i9).getClientUserId(), true);
        v7.y(i9, false).V();
        o9 o9Var = new o9(context);
        o9Var.setImportantForAccessibility(2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            this.a0 = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            o9Var.e(user, z8Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i9).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.X = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i9).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            this.a0 = chat == null ? "" : chat.title;
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
        this.v = 0.1f;
        da daVar = new da(context, i9, this.resourcesProvider);
        this.b0 = daVar;
        g7.g6.a(daVar);
        daVar.setOnClickListener(new androidx.mediarouter.app.c(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        r1 r1Var = new r1(context);
        this.c0 = r1Var;
        r1Var.setClipChildren(false);
        r1Var.setClipToPadding(false);
        r1Var.addView(new n9(context, 70, 0), g7.e6.c(-1.0f, -1));
        o9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        r1Var.addView(o9Var, g7.e6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        g7.g6.a(o9Var);
        o9Var.setOnClickListener(new p(this, j10, i11));
        r1Var.addView(daVar, g7.e6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, g7.e6.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.f6.j5;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        g10.setGravity(17);
        linearLayout.addView(g10, g7.e6.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(kh.x3.a(g10.getText(), g10.getPaint()));
        l80 l80Var = new l80(context, this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.f6.gc;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.resourcesProvider));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        l80Var.setGravity(17);
        l80Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(l80Var, g7.e6.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        l80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.a0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new bg.d2(3)), true)));
        l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, g7.e6.t(-1, -2, 1, 4, 0, 4, 0));
        s1 s1Var = new s1(context, this.resourcesProvider);
        this.h0 = s1Var;
        s1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.resourcesProvider));
        s1Var.setTextSize(1, 14.0f);
        s1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        s1Var.setGravity(17);
        t1 t1Var = new t1(context, this.resourcesProvider);
        this.i0 = t1Var;
        t1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.resourcesProvider));
        t1Var.setTextSize(1, 14.0f);
        t1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        t1Var.setGravity(17);
        t1Var.setAlpha(0.0f);
        t1Var.setScaleX(0.85f);
        t1Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(s1Var, g7.e6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(t1Var, g7.e6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z10) {
            linearLayout2.addView(frameLayout2, g7.e6.t(-2, -2, 1, 0, 9, 0, 4));
            l80 l80Var2 = new l80(context, this.resourcesProvider);
            l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.resourcesProvider));
            l80Var2.setTextSize(1, 14.0f);
            l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
            l80Var2.setGravity(17);
            linearLayout2.addView(l80Var2, g7.e6.t(-2, -2, 1, 26, 4, 26, 6));
            s1Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            l80Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else {
            if (j10 >= 0) {
                linearLayout2.addView(frameLayout2, g7.e6.t(-1, -2, 1, 0, 9, 0, 6));
                n7 G = v7.y(i9, false).G(j10, true);
                m1 m1Var = new m1(this, G, j10, callback, context, 0);
                m1Var.run();
                s1Var.addOnAttachStateChangeListener(new u1(m1Var));
                i10 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                NotificationCenter.getInstance(i9).listen(s1Var, NotificationCenter.starUserGiftsLoaded, new f1(i11, G, m1Var));
                zy zyVar = new zy(i10, false);
                this.f0 = zyVar;
                zyVar.O = new v1(this);
                this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                this.d.setClipToPadding(false);
                this.d.setClipChildren(false);
                this.d.setLayoutManager(zyVar);
                this.d.setSelectorType(9);
                this.d.setSelectorDrawableColor(0);
                w1 w1Var = new w1();
                this.g0 = w1Var;
                w1Var.C = false;
                w1Var.m = false;
                w1Var.n(350L);
                w1Var.o(gr.h);
                w1Var.D = 40L;
                this.d.setItemAnimator(w1Var);
                this.d.setOnItemClickListener(new mk0() { // from class: fh.n1
                    @Override // org.telegram.ui.Components.mk0
                    public final void a(int i15, View view) {
                        p2.P(p2.this, context, i9, callback, j10, i15);
                    }
                });
                V();
                this.U.N(false);
                M();
                if (BirthdayController.getInstance(i9).isToday(j10)) {
                    U(true);
                }
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftsLoaded);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.userInfoDidLoad);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftSoldOut);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
                this.e.setTitle(y());
                NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, g7.e6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(s1Var);
            s1Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.a0)), s1Var.getPaint().getFontMetricsInt(), false));
        }
        i10 = 3;
        zy zyVar2 = new zy(i10, false);
        this.f0 = zyVar2;
        zyVar2.O = new v1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(zyVar2);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        w1 w1Var2 = new w1();
        this.g0 = w1Var2;
        w1Var2.C = false;
        w1Var2.m = false;
        w1Var2.n(350L);
        w1Var2.o(gr.h);
        w1Var2.D = 40L;
        this.d.setItemAnimator(w1Var2);
        this.d.setOnItemClickListener(new mk0() { // from class: fh.n1
            @Override // org.telegram.ui.Components.mk0
            public final void a(int i15, View view) {
                p2.P(p2.this, context, i9, callback, j10, i15);
            }
        });
        V();
        this.U.N(false);
        M();
        if (BirthdayController.getInstance(i9).isToday(j10)) {
        }
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }

    public static void O(final p2 p2Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, g1 g1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            g1Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new oc(p2Var.container, p2Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext(), 0, p2Var.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.P = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
        final vt vtVar = o6.n;
        if (vtVar != null) {
            vtVar.setOnLinkPressListener(new k80() { // from class: fh.l1
                @Override // org.telegram.ui.Components.k80
                public final void a(ClickableSpan clickableSpan) {
                    p2 p2Var2 = p2.this;
                    p2Var2.getClass();
                    o6.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    p2Var2.dismiss();
                    clickableSpan.onClick(vtVar);
                }
            });
        }
    }

    public static void P(p2 p2Var, Context context, int i9, Utilities.Callback callback, long j10, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        l41 G = p2Var.U.G(i10 - 1);
        if (G != null && G.G(e2.class)) {
            Object obj = G.G;
            int i11 = 0;
            if (obj instanceof zf.k) {
                new x1(p2Var, context, i9, (zf.k) obj, p2Var.Y, new c1(p2Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                n7 n7Var = p2Var.k0;
                if (n7Var != null && p2Var.o0 == p2Var.m0) {
                    ArrayList arrayList = n7Var.l;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    y1 y1Var = new y1(p2Var, p2Var.getContext(), i9, UserConfig.getInstance(i9).getClientUserId(), p2Var.resourcesProvider);
                    y1Var.j2(savedStarGift, null);
                    y1Var.Z1(j10, new d1(p2Var, y1Var, j10, callback, 0));
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
                    z1 z1Var = new z1(j10, starGift.title, starGift.id, p2Var.resourcesProvider, p2Var.container.getViewTreeObserver(), new e1());
                    z1Var.e = new f1(i11, p2Var, callback);
                    U.showAsSheet(z1Var, m2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i9).getOrRequestAuction(starGift.id, new y(context, p2Var.resourcesProvider, i9, j10, new c1(p2Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new oc(p2Var.container, p2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    g1 g1Var = new g1(p2Var, context, i9, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(p2Var.getContext(), 3, null);
                        c2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i9).sendRequest(checkcansendgift, new h1(p2Var, c2Var, g1Var, callback, 0));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i9).isPremium()) {
                        g1Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    zf.k1 k1Var = new zf.k1(U2, i9, null, null, starGift, p2Var.resourcesProvider);
                    o9 o9Var = new o9(p2Var.getContext());
                    org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(160.0f), 4, o9Var, false);
                    o9Var.setImageDrawable(i5Var);
                    o9Var.addOnAttachStateChangeListener(new q1(i5Var));
                    i5Var.i(starGift.getDocument(), false);
                    k1Var.x0 = o9Var;
                    k1Var.show();
                    i5Var.f();
                    return;
                }
                org.telegram.ui.ActionBar.b6 b6Var = p2Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
                LinearLayout f10 = ll.f(context, 1);
                f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                f10.setClipChildren(false);
                f10.setClipToPadding(false);
                o9 o9Var2 = new o9(context);
                oa.a1(o9Var2.getImageReceiver(), starGift, 160);
                f10.addView(o9Var2, g7.e6.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
                h.setTextSize(1, 14.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, b6Var));
                h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                f10.addView(h, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
                wy0 wy0Var = new wy0(context, b6Var);
                if (starGift.first_sale_date != 0) {
                    wy0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    wy0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                wy0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), oa.X0(false, j3.r0.n(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    oa.E0(wy0Var, i9, starGift, b6Var);
                }
                f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                kh.d dVar = new kh.d(context, b6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                f10.addView(dVar, g7.e6.n(-1, 48));
                j11.customView = f10;
                org.telegram.ui.ActionBar.f3[] f3VarArr = {j11};
                f3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new e8(f3VarArr, 2));
                f3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    f3VarArr[0].makeAttached(U3);
                }
                f3VarArr[0].show();
            }
        }
    }

    public final void T(ArrayList arrayList, z41 z41Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i9 = 2;
        r1 r1Var = this.c0;
        long j11 = this.Y;
        long j12 = 0;
        int i10 = 0;
        boolean z12 = this.Z;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.X) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(l41.k(r1Var));
            arrayList.add(l41.k(this.d0));
            ArrayList arrayList2 = this.j0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                l41 o6 = l41.o(1, 34);
                o6.u = 1;
                arrayList.add(o6);
                l41 o9 = l41.o(2, 34);
                o9.u = 1;
                arrayList.add(o9);
                l41 o10 = l41.o(3, 34);
                o10.u = 1;
                arrayList.add(o10);
            } else {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = e2.a;
                    long j13 = j12;
                    l41 J = l41.J(e2.class);
                    J.u = 1;
                    J.G = (zf.k) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i13 = this.T;
        v7 y10 = v7.y(i13, false);
        ArrayList arrayList3 = this.p0 ? y10.J : y10.I;
        if (this.X != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new mh.m1(this, i9)).collect(Collectors.toCollection(new tf()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new i1(i10)).collect(Collectors.toCollection(new tf()));
        }
        long clientUserId = UserConfig.getInstance(i13).getClientUserId();
        n7 n7Var = this.k0;
        if (j11 != clientUserId && n7Var != null) {
            ArrayList arrayList4 = n7Var.l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (MessagesController.getInstance(i13).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.X) == null || disallowedGiftsSettings3.disallow_unique_stargifts || n7Var == null || n7Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.X;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(l41.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(l41.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(l41.k(r1Var));
        }
        arrayList.add(l41.k(this.e0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.X;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i15)).stars));
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
        int i16 = this.o0;
        j1 j1Var = new j1(this, i10);
        int i17 = n2.a;
        l41 J2 = l41.J(n2.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i16;
        J2.H = j1Var;
        arrayList.add(J2);
        boolean z13 = this.o0 == this.n0 && !z12 && j11 >= j10;
        if (z13 != this.q0) {
            this.q0 = z13;
            ViewPropertyAnimator duration = this.h0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            this.i0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(grVar).start();
        }
        if (n7Var != null && this.o0 == this.m0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = n7Var.l;
            int size3 = arrayList6.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList6.get(i18);
                i18++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i20);
            int i21 = this.o0;
            if (i21 == this.l0 || i21 == this.m0 || (i21 == this.n0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i21 == this.n0) {
                    starGift = starGift3;
                } else {
                    l41 a2 = e2.a(i21, starGift3, i21 == this.m0, starGift3.limited && (disallowedGiftsSettings2 = this.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i19++;
                }
                int i22 = this.o0;
                arrayList.add(e2.a(i22, starGift, i22 == this.m0, starGift.limited && (disallowedGiftsSettings = this.X) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i19++;
            }
        }
        int i23 = this.o0;
        int i24 = this.m0;
        if (i23 == i24 && n7Var != null && !n7Var.j) {
            n7Var.a();
            l41 o11 = l41.o(4, 34);
            o11.u = 1;
            arrayList.add(o11);
            l41 o12 = l41.o(5, 34);
            o12.u = 1;
            arrayList.add(o12);
            l41 o13 = l41.o(6, 34);
            o13.u = 1;
            arrayList.add(o13);
        } else if (i23 != i24 && y10.C) {
            l41 o14 = l41.o(4, 34);
            o14.u = 1;
            arrayList.add(o14);
            l41 o15 = l41.o(5, 34);
            o15.u = 1;
            arrayList.add(o15);
            l41 o16 = l41.o(6, 34);
            o16.u = 1;
            arrayList.add(o16);
        }
        arrayList.add(l41.C(AndroidUtilities.dp(i19 >= 9 ? 40.0f : 300.0f)));
    }

    public final void U(boolean z10) {
        this.p0 = z10;
        this.U.N(false);
    }

    public final void V() {
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
                    zf.k kVar = new zf.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        b9.c cVar = new b9.c();
                        cVar.c = "inapp";
                        cVar.b = kVar.h();
                        arrayList2.add(cVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((zf.k) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new a1.c(this, 28));
            }
        }
        if (arrayList.isEmpty()) {
            bg.u0.j(this.T, null, new j1(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.billingProductDetailsUpdated) {
            V();
            return;
        }
        if (i9 == NotificationCenter.starGiftsLoaded) {
            z41 z41Var2 = this.U;
            if (z41Var2 != null) {
                z41Var2.N(true);
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.userInfoDidLoad) {
            if (i9 != NotificationCenter.starGiftSoldOut) {
                if (i9 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.k0 && (z41Var = this.U) != null) {
                    z41Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new oc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                z41 z41Var3 = this.U;
                if (z41Var3 != null) {
                    z41Var3.N(true);
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
                int i11 = this.T;
                TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i11).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.X = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        oc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                z41 z41Var4 = this.U;
                if (z41Var4 != null) {
                    z41Var4.N(true);
                }
            }
            ArrayList arrayList = this.j0;
            if (arrayList == null || arrayList.isEmpty()) {
                V();
                z41 z41Var5 = this.U;
                if (z41Var5 != null) {
                    z41Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        int i9 = this.T;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        int i9 = this.T;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.X;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            oc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Y)))).j();
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.T, 0, true, new bh.c(this, 8), this.resourcesProvider);
        this.U = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.Z ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.a0), null, false);
    }

    public p2(LaunchActivity launchActivity, int i9, long j10) {
        this(launchActivity, i9, j10, null, null);
    }
}
