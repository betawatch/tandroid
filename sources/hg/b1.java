package hg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import k7.c6;
import mh.q9;
import mh.t7;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b1 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList U;
    public final List V;
    public final List W;
    public final List X;
    public final TLRPC.Chat Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public ig.b d0;
    public int e0;
    public int f0;
    public int g0;
    public boolean h0;
    public int i0;
    public long j0;
    public int k0;
    public int l0;
    public long m0;
    public final jg.a n0;
    public f7.b o0;
    public int p0;
    public s q0;
    public final TL_stories.PrepaidGiveaway r0;
    public String s0;
    public boolean t0;
    public boolean u0;
    public final q0 v0;

    public b1(org.telegram.ui.ActionBar.p2 p2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(p2Var, false);
        this.U = new ArrayList();
        this.V = p0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.W = p0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.X = Arrays.asList(750, 10000, 50000);
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        int i10 = jg.e.s;
        this.e0 = 2;
        this.f0 = 0;
        int i11 = jg.w.s;
        this.g0 = 0;
        this.i0 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.j0 = calendar.getTimeInMillis();
        this.k0 = 2;
        this.l0 = 2;
        this.s0 = "";
        this.u0 = true;
        this.v0 = new q0(this, 0);
        this.r0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = jg.e.s;
            this.e0 = 3;
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(pr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        tl0 tl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new a1());
        this.d.setOnItemClickListener(new v0(0, this, p2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.Y = chat;
        ig.b bVar = this.d0;
        ArrayList arrayList = this.U;
        tl0 tl0Var2 = this.d;
        r0 r0Var = new r0(this);
        r0 r0Var2 = new r0(this);
        r0 r0Var3 = new r0(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = tl0Var2;
        bVar.h = r0Var;
        bVar.n = r0Var2;
        bVar.s = r0Var3;
        a0(false, false);
        jg.a aVar = new jg.a(getContext(), this.resourcesProvider);
        this.n0 = aVar;
        aVar.setOnClickListener(new z0(this, prepaidGiveaway, j10, p2Var));
        Z(false);
        this.containerView.addView(aVar, c6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        p0.j(this.currentAccount, chat, new t0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(b1 b1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        int i10;
        String str;
        ArrayList arrayList = b1Var.b0;
        ArrayList arrayList2 = b1Var.Z;
        TLRPC.Chat chat = b1Var.Y;
        ArrayList arrayList3 = b1Var.a0;
        ArrayList arrayList4 = b1Var.c0;
        jg.a aVar = b1Var.n0;
        if (aVar.a.K) {
            return;
        }
        int i11 = 0;
        if (b1Var.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            s0 s0Var = new s0(b1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 0);
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new f(s0Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f5.u(12));
            alertDialog$Builder.o();
            return;
        }
        int i12 = b1Var.e0;
        int i13 = jg.e.s;
        int i14 = 3;
        int i15 = 1;
        if (i12 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(b1Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.D1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption W = b1Var.W(b1Var.m0);
            int U = b1Var.U();
            if (W == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i16 = b1Var.g0;
            int i17 = jg.w.s;
            boolean z4 = i16 == 1;
            t7 y10 = t7.y(b1Var.currentAccount, false);
            int l10 = p0.l(b1Var.j0);
            boolean z10 = b1Var.u0;
            boolean z11 = b1Var.t0;
            String str2 = b1Var.s0;
            eh.w wVar = new eh.w(i15, b1Var, W);
            int i18 = y10.a;
            if (!MessagesController.getInstance(i18).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    t7.e0(findActivity, null);
                    return;
                } else {
                    t7.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z10;
            tL_inputStorePaymentStarsGiveaway.stars = W.stars;
            MessagesController.getInstance(i18);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList2.get(i19);
                    i19++;
                    ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i18);
                    arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                }
            }
            int size2 = arrayList.size();
            int i20 = 0;
            while (i20 < size2) {
                Object obj2 = arrayList.get(i20);
                i20++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z11) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str2;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i18).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l10;
            tL_inputStorePaymentStarsGiveaway.currency = W.currency;
            tL_inputStorePaymentStarsGiveaway.amount = W.amount;
            tL_inputStorePaymentStarsGiveaway.users = U;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = W.store_product) != null) {
                b6.h hVar = new b6.h();
                hVar.c = "inapp";
                hVar.b = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(hVar.a()), new a1.d(y10, wVar, tL_inputStorePaymentStarsGiveaway, findActivity, 3));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = sh.p2.p(t7.I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i18).sendRequest(tL_payments_getPaymentForm, new y(y10, wVar, tL_inputInvoiceStars, 10));
            return;
        }
        int i21 = 9;
        if (b1Var.f0 == 1) {
            ArrayList b10 = p0.b(arrayList3.size(), arrayList4);
            for (int i22 = 0; i22 < b10.size(); i22++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i22);
                if (tL_premiumGiftCodeOption.months == b1Var.i0 && arrayList3.size() > 0) {
                    if (p0.h()) {
                        Context context = b1Var.getContext();
                        g6 g6Var = b1Var.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size3) {
                                Object obj3 = arrayList4.get(i23);
                                i23++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i24 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                            d2Var2.O = string2;
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i24, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new f5.u(i21));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    p0.k(arrayList3, tL_premiumGiftCodeOption, b1Var.Y, null, p2Var, new t0(b1Var, 0), new t0(b1Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = p0.b(b1Var.U(), arrayList4);
        for (int i25 = 0; i25 < b11.size(); i25++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i25);
            if (tL_premiumGiftCodeOption3.months == b1Var.i0) {
                if (p0.h()) {
                    List list = b1Var.V;
                    Context context2 = b1Var.getContext();
                    g6 g6Var2 = b1Var.resourcesProvider;
                    t0 t0Var = new t0(b1Var, 2);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            Object obj4 = arrayList4.get(i26);
                            i26++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i27 = 0;
                        while (i27 < size5) {
                            Object obj5 = arrayList7.get(i27);
                            i27++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i28 = tL_premiumGiftCodeOption3.users;
                            int i29 = tL_premiumGiftCodeOption6.users;
                            if (i28 > i29 && i29 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i30 = tL_premiumGiftCodeOption3.users;
                        int i31 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, g6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                        d2Var3.O = string3;
                        d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i30, formatPluralString, Integer.valueOf(i31)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new c1.b(13, t0Var, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new f5.u(i21));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i32 = b1Var.g0;
                int i33 = jg.w.s;
                boolean z12 = i32 == 1;
                int l11 = p0.l(b1Var.j0);
                aVar.b(true);
                boolean z13 = b1Var.u0;
                boolean z14 = b1Var.t0;
                String str3 = b1Var.s0;
                t0 t0Var2 = new t0(b1Var, i14);
                t0 t0Var3 = new t0(b1Var, 4);
                if (p0.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z12;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z13;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                    int i34 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i34 | 6;
                    if (z14) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i34 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i35 = 0;
                    while (i35 < size6) {
                        Object obj6 = arrayList2.get(i35);
                        i35++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj7 = arrayList.get(i36);
                        i36++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    b6.h hVar2 = new b6.h();
                    hVar2.c = "inapp";
                    hVar2.b = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(hVar2.a()), new d0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, t0Var3, t0Var2, p2Var, 1));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z12;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z13;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                int i37 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i37 | 6;
                if (z14) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i37 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i38 = 0;
                while (i38 < size8) {
                    Object obj8 = arrayList2.get(i38);
                    int i39 = i38 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i39;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i39;
                    }
                    i38 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i40 = 0;
                while (i40 < size9) {
                    Object obj9 = arrayList.get(i40);
                    i40++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject p11 = sh.p2.p(p2Var.getResourceProvider(), false);
                if (p11 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = p11.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new e0(t0Var3, messagesController2, tL_inputInvoicePremiumGiftCode, p2Var, t0Var2, 0));
                return;
            }
        }
    }

    public static void Q(b1 b1Var, org.telegram.ui.ActionBar.p2 p2Var, View view) {
        f7.b bVar;
        ArrayList arrayList = b1Var.a0;
        q0 q0Var = b1Var.v0;
        if (view instanceof jg.a0) {
            jg.a0 a0Var = (jg.a0) view;
            int type = a0Var.getType();
            boolean z4 = a0Var.e.h;
            boolean z10 = !z4;
            a0Var.setChecked(z10);
            int i10 = jg.a0.I;
            if (type == 0) {
                b1Var.u0 = z10;
                b1Var.a0(false, false);
            } else if (type == 1) {
                a0Var.setDivider(z10);
                b1Var.t0 = z10;
                b1Var.a0(false, false);
                ig.b bVar2 = b1Var.d0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.e.size()) {
                        break;
                    }
                    ig.a aVar = (ig.a) bVar2.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = jg.a0.I;
                        if (i12 == 1) {
                            if (z4) {
                                bVar2.u(i11 + 1);
                            } else {
                                bVar2.o(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                b1Var.d0.G();
                if (b1Var.t0) {
                    AndroidUtilities.cancelRunOnUIThread(q0Var);
                } else {
                    AndroidUtilities.runOnUIThread(q0Var, 250L);
                }
            }
        }
        if (view instanceof jg.d) {
            if (view instanceof jg.e) {
                int selectedType = ((jg.e) view).getSelectedType();
                int i14 = jg.e.s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && b1Var.e0 == selectedType) {
                        f7.b bVar3 = b1Var.o0;
                        if (bVar3 != null) {
                            ((f2) bVar3.b).V(1, arrayList);
                            ((x) bVar3.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    b1Var.e0 = selectedType;
                    b1Var.a0(true, true);
                    b1Var.Z(true);
                    b1Var.N();
                } else if (selectedType == 1) {
                    f7.b bVar4 = b1Var.o0;
                    if (bVar4 != null) {
                        ((f2) bVar4.b).V(1, arrayList);
                        ((x) bVar4.c).b.D(1);
                    }
                } else {
                    b1Var.f0 = selectedType;
                    b1Var.a0(true, true);
                    b1Var.Z(true);
                    b1Var.N();
                }
            } else {
                jg.d dVar = (jg.d) view;
                tl0 tl0Var = b1Var.d;
                if (dVar.b()) {
                    for (int i15 = 0; i15 < tl0Var.getChildCount(); i15++) {
                        View childAt = tl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(dVar)) {
                            ((jg.d) childAt).c(childAt == dVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof jg.w) {
            int selectedType2 = ((jg.w) view).getSelectedType();
            if (b1Var.g0 == selectedType2 && (bVar = b1Var.o0) != null) {
                ((f2) bVar.b).V(3, b1Var.b0);
                ((x) bVar.c).b.D(1);
            }
            b1Var.g0 = selectedType2;
            b1Var.a0(false, false);
            return;
        }
        if (view instanceof jg.j) {
            b1Var.i0 = ((TLRPC.TL_premiumGiftCodeOption) ((jg.j) view).getGifCode()).months;
            b1Var.a0(false, false);
            b1Var.d0.G();
            return;
        }
        if (!(view instanceof jg.i)) {
            if (view instanceof jg.b) {
                f7.b bVar5 = b1Var.o0;
                if (bVar5 != null) {
                    ((f2) bVar5.b).V(2, b1Var.Z);
                    ((x) bVar5.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof jg.y)) {
                if (view instanceof q9) {
                    b1Var.h0 = true;
                    b1Var.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((jg.y) view).getOption();
            if (option != null) {
                b1Var.m0 = option.stars;
                b1Var.a0(true, true);
                b1Var.Z(true);
                b1Var.N();
                return;
            }
            return;
        }
        Context context = p2Var.getContext();
        long j10 = b1Var.j0;
        r0 r0Var = new r0(b1Var);
        g6 g6Var = b1Var.resourcesProvider;
        x4 x4Var = new x4(g6Var);
        c3 c3Var = new c3(context, g6Var);
        c3Var.a();
        yc0 yc0Var = new yc0(context, g6Var);
        int i16 = x4Var.a;
        yc0Var.setTextColor(i16);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        n nVar = new n(context, g6Var);
        nVar.setWrapSelectorWheel(true);
        nVar.setAllItemsCount(24);
        nVar.setItemCount(5);
        nVar.setTextColor(i16);
        nVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        nVar.setTag("HOUR");
        o oVar = new o(context, g6Var);
        oVar.setWrapSelectorWheel(true);
        oVar.setAllItemsCount(60);
        oVar.setItemCount(5);
        oVar.setTextColor(i16);
        oVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        p pVar = new p(context, x4Var, yc0Var, nVar, oVar);
        pVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        pVar.addView(frameLayout, c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        yh.p(20.0f, 1, textView);
        frameLayout.addView(textView, c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        pVar.addView(linearLayout, c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        q qVar = new q(context, 0);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(yc0Var, c6.l(0.5f, 0, 270));
        yc0Var.setMinValue(0);
        yc0Var.setMaxValue(i18 - 1);
        yc0Var.setWrapSelectorWheel(false);
        yc0Var.setTag("DAY");
        yc0Var.setFormatter(new c(currentTimeMillis, calendar, i17, 0));
        d dVar2 = new d(pVar, nVar, oVar, i19, i20, yc0Var);
        yc0Var.setOnValueChangedListener(dVar2);
        nVar.setMinValue(0);
        nVar.setMaxValue(23);
        linearLayout.addView(nVar, c6.l(0.2f, 0, 270));
        nVar.setFormatter(new f5.u(10));
        nVar.setOnValueChangedListener(dVar2);
        oVar.setMinValue(0);
        oVar.setMaxValue(11);
        oVar.setValue(0);
        oVar.setFormatter(new f5.u(11));
        linearLayout.addView(oVar, c6.l(0.3f, 0, 270));
        oVar.setOnValueChangedListener(dVar2);
        if (j10 > 0) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            oVar.setValue(calendar.get(12) / 5);
            nVar.setValue(calendar.get(11));
            yc0Var.setValue(timeInMillis);
            yc0Var.getValue();
            dVar2.q(yc0Var, yc0Var.getValue());
            nVar.getValue();
            dVar2.q(nVar, nVar.getValue());
        }
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(x4Var.g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(a6.e(new float[]{8.0f}, x4Var.h));
        qVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        pVar.addView(qVar, c6.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new e(calendar, yc0Var, nVar, oVar, r0Var, c3Var, 0));
        c3Var.b(pVar);
        h3 h3Var = c3Var.a;
        h3Var.show();
        int i21 = x4Var.b;
        h3Var.setBackgroundColor(i21);
        h3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(h3Var, i0.a.f(i21) > 0.699999988079071d);
    }

    public static void R(b1 b1Var) {
        fg.d2 d2Var = new fg.d2(b1Var.n, b1Var.currentAccount, null, b1Var.resourcesProvider);
        int i10 = 1;
        d2Var.setOnDismissListener(new u0(b1Var, i10));
        d2Var.setOnShowListener(new w0(b1Var, i10));
        d2Var.show();
    }

    public static void S(b1 b1Var) {
        fg.d2 d2Var = new fg.d2(b1Var.n, b1Var.currentAccount, null, b1Var.resourcesProvider);
        int i10 = 0;
        d2Var.setOnDismissListener(new u0(b1Var, i10));
        d2Var.setOnShowListener(new w0(b1Var, i10));
        d2Var.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i10) {
        this.p0 = i10;
    }

    public final ArrayList T(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j10);
        if (W != null) {
            for (int i10 = 0; i10 < W.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int U() {
        int i10 = this.e0;
        int i11 = jg.e.s;
        if (i10 == 2) {
            return ((Integer) this.V.get(this.k0)).intValue();
        }
        List X = X();
        int i12 = this.l0;
        if (i12 < 0 || i12 >= X.size()) {
            this.l0 = 0;
        }
        if (this.l0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.l0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.e0;
        int i11 = jg.e.s;
        if (i10 == 2) {
            U = ((Integer) this.V.get(this.k0)).intValue();
            g10 = p0.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.m0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = p0.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = t7.y(this.currentAccount, false).v();
        if (v == null) {
            return null;
        }
        for (int i10 = 0; i10 < v.size(); i10++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List X() {
        int i10 = this.e0;
        int i11 = jg.e.s;
        if (i10 == 2) {
            return this.V;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.m0);
        if (W != null) {
            for (int i12 = 0; i12 < W.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Y() {
        return this.r0 != null;
    }

    public final void Z(boolean z4) {
        boolean Y = Y();
        jg.a aVar = this.n0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.r0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z4);
                return;
            } else {
                aVar.a(p0.g() * prepaidGiveaway.quantity, z4);
                return;
            }
        }
        int i10 = this.f0;
        int i11 = jg.e.s;
        if (i10 == 0) {
            aVar.a(V(), z4);
            return;
        }
        ArrayList arrayList = this.a0;
        int g10 = p0.g() * arrayList.size();
        boolean z10 = arrayList.size() > 0;
        aVar.e = true;
        qh.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z10);
        dVar.c(g10, z4);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z4, true);
        aVar.b.setBackgroundColor(k6.v0(k6.h5, aVar.c));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b3  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        ?? r15;
        int i11;
        boolean z12;
        ?? r152;
        ig.b bVar;
        ?? r153;
        long longValue;
        ArrayList arrayList = this.U;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.e0;
        int i13 = jg.e.s;
        boolean z13 = i12 == 3;
        ig.a aVar = new ig.a(0, false);
        aVar.g = z13;
        arrayList.add(aVar);
        boolean Y = Y();
        ArrayList arrayList3 = this.a0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.r0;
        if (Y) {
            ig.a aVar2 = new ig.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            ig.a aVar3 = new ig.a(2, this.e0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            ig.a aVar4 = new ig.a(2, this.e0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new ig.a(4, false));
        TLRPC.Chat chat = this.Y;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i14 = this.e0;
        ArrayList arrayList4 = this.b0;
        ArrayList arrayList5 = this.Z;
        if (i14 == 3) {
            if (Y()) {
                z11 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.m0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int V = V();
                ig.a aVar5 = new ig.a(13, false);
                aVar5.c = string;
                aVar5.i = V;
                arrayList.add(aVar5);
                ArrayList v = t7.y(this.currentAccount, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    int i15 = 0;
                    while (i15 < v.size()) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i15);
                        boolean z14 = isChannelAndNotMegaGroup;
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                        i15++;
                        isChannelAndNotMegaGroup = z14;
                    }
                }
                z11 = isChannelAndNotMegaGroup;
                int i16 = 0;
                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                    TL_stars.TL_starsGiveawayOption W = W(((Long) arrayList6.get(i17)).longValue());
                    if (!W.missingStorePrice) {
                        if (this.m0 == 0 && W.isDefault) {
                            this.m0 = W.stars;
                        }
                        if (!W.extended || this.h0) {
                            i16++;
                            int i18 = this.h0 ? i17 : i17 + 2;
                            long j10 = W.stars;
                            ArrayList T = T(j10);
                            if (T.isEmpty()) {
                                float f10 = j10;
                                ArrayList T2 = T(this.m0);
                                int i19 = this.l0;
                                if (i19 < 0 || i19 >= T2.size()) {
                                    this.l0 = 0;
                                }
                                longValue = Math.round(f10 / (this.l0 >= T2.size() ? 1L : ((Long) T2.get(this.l0)).longValue()));
                            } else {
                                longValue = ((Long) T.get(Utilities.clamp(this.l0, T.size() - 1, 0))).longValue();
                            }
                            arrayList.add(ig.a.d(W, i18, longValue, this.m0 == W.stars, true));
                        }
                    }
                }
                if (!this.h0 && i16 < arrayList6.size()) {
                    arrayList.add(new ig.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(ig.a.d(null, 0, 1L, false, true));
                    arrayList.add(ig.a.d(null, 1, 1L, false, true));
                    arrayList.add(ig.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = V();
                arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List X = X();
                int i20 = this.l0;
                if (i20 < 0 || i20 >= X.size()) {
                    this.l0 = 0;
                }
                if (X.size() > 1) {
                    arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List X2 = X();
                    int i21 = this.l0;
                    ig.a aVar6 = new ig.a(5, false);
                    aVar6.k = X2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Y()) {
                arrayList.add(ig.a.b(chat, V(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(ig.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(ig.a.b(chat, p0.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(ig.a.b((TLRPC.Chat) tLObject, V(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int V2 = V();
                    ig.a aVar7 = new ig.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = V2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < p0.f()) {
                r153 = 0;
                arrayList.add(new ig.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = jg.w.s;
            arrayList.add(ig.a.e(r153, this.g0, true, arrayList4));
            arrayList.add(ig.a.e(1, this.g0, r153, arrayList4));
            arrayList.add(ig.a.c(LocaleController.getString(z11 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z11 = isChannelAndNotMegaGroup;
            if (this.f0 == 0) {
                if (!Y()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int V3 = V();
                    ig.a aVar8 = new ig.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = V3;
                    arrayList.add(aVar8);
                    int i24 = this.k0;
                    ig.a aVar9 = new ig.a(5, false);
                    aVar9.k = this.V;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(ig.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(ig.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(ig.a.b(chat, p0.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(ig.a.b((TLRPC.Chat) tLObject2, V(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int V4 = V();
                        ig.a aVar10 = new ig.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = V4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < p0.f()) {
                    r15 = 0;
                    arrayList.add(new ig.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = jg.w.s;
                arrayList.add(ig.a.e(r15, this.g0, true, arrayList4));
                arrayList.add(ig.a.e(1, this.g0, r15, arrayList4));
                arrayList.add(ig.a.c(LocaleController.getString(z11 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.f0;
                int i28 = jg.e.s;
                ArrayList b10 = p0.b(i27 == 0 ? U() : arrayList3.size(), this.c0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.f0;
                    int i32 = jg.e.s;
                    int U = i31 == 0 ? U() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.i0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z15 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    ig.a aVar11 = new ig.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = U;
                    aVar11.h = j11;
                    aVar11.g = z15;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!Y()) {
                i10 = 3;
                arrayList.add(ig.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), k6.gc, 0, new q0(this, i10), this.resourcesProvider), true));
                i11 = this.e0;
                int i34 = jg.e.s;
                if (i11 != i10 || this.f0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z16 = this.t0;
                    int i35 = jg.a0.I;
                    ig.a aVar12 = new ig.a(15, z16);
                    aVar12.c = string3;
                    aVar12.g = z16;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.t0) {
                        z12 = false;
                        arrayList.add(ig.a.c(LocaleController.getString(this.e0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int U2 = Y() ? prepaidGiveaway.quantity : U();
                        z12 = false;
                        ig.a aVar13 = new ig.a(16, false);
                        aVar13.i = U2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.i0, new Object[0]);
                        if (this.e0 == 3) {
                            if (this.s0.isEmpty()) {
                                arrayList.add(ig.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.m0, new Object[0])), false));
                            } else {
                                arrayList.add(ig.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.m0, Integer.valueOf(U2), this.s0)), false));
                            }
                        } else if (this.s0.isEmpty()) {
                            arrayList.add(ig.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", U2, formatPluralString)), false));
                        } else {
                            arrayList.add(ig.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", U2, this.s0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.j0;
                    ig.a aVar14 = new ig.a(10, z12);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.e0 != 3) {
                        if (Y()) {
                            r152 = 0;
                            arrayList.add(ig.a.c(LocaleController.formatPluralString(z11 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.m0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(ig.a.c(LocaleController.formatPluralString(z11 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.m0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Y()) {
                            arrayList.add(ig.a.c(LocaleController.formatPluralString(z11 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(ig.a.c(LocaleController.formatPluralString(z11 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    ig.a aVar15 = new ig.a(15, this.u0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Y()) {
                        arrayList.add(ig.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb.append(this.e0 != 3 ? y3.h(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(ig.a.c(AndroidUtilities.replaceSingleTag(sb.toString(), k6.gc, 0, new q0(this, 4), this.resourcesProvider), true));
                    }
                }
                bVar = this.d0;
                if (bVar != null && z10) {
                    if (z4) {
                        bVar.l();
                        return;
                    } else {
                        bVar.E(arrayList2, arrayList);
                        return;
                    }
                }
                return;
            }
        }
        i10 = 3;
        i11 = this.e0;
        int i342 = jg.e.s;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z162 = this.t0;
        int i352 = jg.a0.I;
        ig.a aVar122 = new ig.a(15, z162);
        aVar122.c = string32;
        aVar122.g = z162;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.t0) {
        }
        arrayList.add(ig.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j122 = this.j0;
        ig.a aVar142 = new ig.a(10, z12);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.e0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        ig.a aVar152 = new ig.a(15, this.u0);
        aVar152.c = string42;
        aVar152.g = r152;
        aVar152.l = r152;
        arrayList.add(aVar152);
        if (Y()) {
        }
        bVar = this.d0;
        if (bVar != null) {
            if (z4) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tl0 tl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (tl0Var = this.d) != null && tl0Var.D) {
            a0(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        s sVar = this.q0;
        if (sVar != null) {
            sVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        ig.b bVar = new ig.b(this.resourcesProvider);
        this.d0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i10 = this.f0;
        int i11 = jg.e.s;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
