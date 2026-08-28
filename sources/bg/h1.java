package bg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import gh.u9;
import gh.v7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h1 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList T;
    public final List U;
    public final List V;
    public final List W;
    public final TLRPC.Chat X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public cg.b c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public int h0;
    public long i0;
    public int j0;
    public int k0;
    public long l0;
    public final dg.a m0;
    public we.b n0;
    public int o0;
    public v p0;
    public final TL_stories.PrepaidGiveaway q0;
    public String r0;
    public boolean s0;
    public boolean t0;
    public final v0 u0;

    public h1(org.telegram.ui.ActionBar.o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        this.T = new ArrayList();
        this.U = u0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V = u0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.W = Arrays.asList(750, 10000, 50000);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        int i9 = dg.e.s;
        this.d0 = 2;
        this.e0 = 0;
        int i10 = dg.y.s;
        this.f0 = 0;
        this.h0 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.i0 = calendar.getTimeInMillis();
        this.j0 = 2;
        this.k0 = 2;
        this.r0 = "";
        this.t0 = true;
        this.u0 = new v0(this, 0);
        this.q0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        M();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = dg.e.s;
            this.d0 = 3;
        }
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.m = false;
        this.d.setItemAnimator(nVar);
        wk0 wk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new g1());
        this.d.setOnItemClickListener(new b1(0, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = chat;
        cg.b bVar = this.c0;
        ArrayList arrayList = this.T;
        wk0 wk0Var2 = this.d;
        w0 w0Var = new w0(this);
        w0 w0Var2 = new w0(this);
        w0 w0Var3 = new w0(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = wk0Var2;
        bVar.h = w0Var;
        bVar.n = w0Var2;
        bVar.s = w0Var3;
        Z(false, false);
        dg.a aVar = new dg.a(getContext(), this.resourcesProvider);
        this.m0 = aVar;
        aVar.setOnClickListener(new f1(this, prepaidGiveaway, j10, o2Var));
        Y(false);
        this.containerView.addView(aVar, e6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        u0.j(this.currentAccount, chat, new z0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void O(h1 h1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        int i9;
        String str;
        ArrayList arrayList = h1Var.a0;
        ArrayList arrayList2 = h1Var.Y;
        TLRPC.Chat chat = h1Var.X;
        ArrayList arrayList3 = h1Var.Z;
        ArrayList arrayList4 = h1Var.b0;
        dg.a aVar = h1Var.m0;
        if (aVar.a.J) {
            return;
        }
        int i10 = 10;
        int i11 = 4;
        int i12 = 0;
        if (h1Var.X()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            x0 x0Var = new x0(h1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 0);
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1.c(x0Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.b(i10));
            alertDialog$Builder.o();
            return;
        }
        int i13 = h1Var.d0;
        int i14 = dg.e.s;
        int i15 = 3;
        if (i13 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(h1Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption V = h1Var.V(h1Var.l0);
            int T = h1Var.T();
            if (V == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i16 = h1Var.f0;
            int i17 = dg.y.s;
            boolean z10 = i16 == 1;
            v7 y10 = v7.y(h1Var.currentAccount, false);
            int l10 = u0.l(h1Var.i0);
            boolean z11 = h1Var.t0;
            boolean z12 = h1Var.s0;
            String str2 = h1Var.r0;
            y0 y0Var = new y0(i12, h1Var, V);
            int i18 = y10.a;
            if (!MessagesController.getInstance(i18).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    v7.e0(findActivity, null);
                    return;
                } else {
                    v7.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = findActivity;
            tL_inputStorePaymentStarsGiveaway.stars = V.stars;
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
            if (z12) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str2;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i18).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l10;
            tL_inputStorePaymentStarsGiveaway.currency = V.currency;
            tL_inputStorePaymentStarsGiveaway.amount = V.amount;
            tL_inputStorePaymentStarsGiveaway.users = T;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = V.store_product) != null) {
                b9.c cVar = new b9.c();
                cVar.c = "inapp";
                cVar.b = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new a1.d(y10, y0Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(v7.I(), false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i18).sendRequest(tL_payments_getPaymentForm, new b0(y10, y0Var, tL_inputInvoiceStars, 10));
            return;
        }
        int i21 = 7;
        if (h1Var.e0 == 1) {
            ArrayList b10 = u0.b(arrayList3.size(), arrayList4);
            for (int i22 = 0; i22 < b10.size(); i22++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i22);
                if (tL_premiumGiftCodeOption.months == h1Var.h0 && arrayList3.size() > 0) {
                    if (u0.h()) {
                        Context context = h1Var.getContext();
                        b6 b6Var = h1Var.resourcesProvider;
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, b6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                            c2Var2.N = string2;
                            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i24, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new a9.b(i21));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    u0.k(arrayList3, tL_premiumGiftCodeOption, h1Var.X, null, o2Var, new z0(h1Var, 0), new z0(h1Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = u0.b(h1Var.T(), arrayList4);
        for (int i25 = 0; i25 < b11.size(); i25++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i25);
            if (tL_premiumGiftCodeOption3.months == h1Var.h0) {
                if (u0.h()) {
                    List list = h1Var.U;
                    Context context2 = h1Var.getContext();
                    b6 b6Var2 = h1Var.resourcesProvider;
                    z0 z0Var = new z0(h1Var, 2);
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
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, b6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                        c2Var3.N = string3;
                        c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i30, formatPluralString, Integer.valueOf(i31)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new b5.d(i15, z0Var, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.b(i21));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i32 = h1Var.f0;
                int i33 = dg.y.s;
                boolean z13 = i32 == 1;
                int l11 = u0.l(h1Var.i0);
                aVar.b(true);
                boolean z14 = h1Var.t0;
                boolean z15 = h1Var.s0;
                String str3 = h1Var.r0;
                z0 z0Var2 = new z0(h1Var, i15);
                z0 z0Var3 = new z0(h1Var, 4);
                if (u0.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                    int i34 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i34 | 6;
                    if (z15) {
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
                    b9.c cVar2 = new b9.c();
                    cVar2.c = "inapp";
                    cVar2.b = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(cVar2.a()), new g0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, z0Var3, z0Var2, o2Var, 1));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z13;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                int i37 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i37 | 6;
                if (z15) {
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
                        i9 = i39;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i9 = i39;
                    }
                    i38 = i9;
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
                JSONObject p9 = mh.c3.p(o2Var.getResourceProvider(), false);
                if (p9 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = p9.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new h0(z0Var3, messagesController2, tL_inputInvoicePremiumGiftCode, o2Var, z0Var2, 0));
                return;
            }
        }
    }

    public static void P(h1 h1Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        w4 w4Var;
        we.b bVar;
        ArrayList arrayList = h1Var.Z;
        v0 v0Var = h1Var.u0;
        if (view instanceof dg.c0) {
            dg.c0 c0Var = (dg.c0) view;
            int type = c0Var.getType();
            boolean z10 = c0Var.e.h;
            boolean z11 = !z10;
            c0Var.setChecked(z11);
            int i9 = dg.c0.H;
            if (type == 0) {
                h1Var.t0 = z11;
                h1Var.Z(false, false);
            } else if (type == 1) {
                c0Var.setDivider(z11);
                h1Var.s0 = z11;
                h1Var.Z(false, false);
                cg.b bVar2 = h1Var.c0;
                int i10 = 0;
                while (true) {
                    if (i10 >= bVar2.e.size()) {
                        break;
                    }
                    cg.a aVar = (cg.a) bVar2.e.get(i10);
                    if (aVar.a == 15) {
                        int i11 = aVar.l;
                        int i12 = dg.c0.H;
                        if (i11 == 1) {
                            if (z10) {
                                bVar2.u(i10 + 1);
                            } else {
                                bVar2.o(i10 + 1);
                            }
                        }
                    }
                    i10++;
                }
                h1Var.c0.G();
                if (h1Var.s0) {
                    AndroidUtilities.cancelRunOnUIThread(v0Var);
                } else {
                    AndroidUtilities.runOnUIThread(v0Var, 250L);
                }
            }
        }
        if (view instanceof dg.d) {
            if (view instanceof dg.e) {
                int selectedType = ((dg.e) view).getSelectedType();
                int i13 = dg.e.s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && h1Var.d0 == selectedType) {
                        we.b bVar3 = h1Var.n0;
                        if (bVar3 != null) {
                            ((q2) bVar3.b).U(1, arrayList);
                            ((a0) bVar3.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    h1Var.d0 = selectedType;
                    h1Var.Z(true, true);
                    h1Var.Y(true);
                    h1Var.M();
                } else if (selectedType == 1) {
                    we.b bVar4 = h1Var.n0;
                    if (bVar4 != null) {
                        ((q2) bVar4.b).U(1, arrayList);
                        ((a0) bVar4.c).b.D(1);
                    }
                } else {
                    h1Var.e0 = selectedType;
                    h1Var.Z(true, true);
                    h1Var.Y(true);
                    h1Var.M();
                }
            } else {
                dg.d dVar = (dg.d) view;
                wk0 wk0Var = h1Var.d;
                if (dVar.b()) {
                    for (int i14 = 0; i14 < wk0Var.getChildCount(); i14++) {
                        View childAt = wk0Var.getChildAt(i14);
                        if (childAt.getClass().isInstance(dVar)) {
                            ((dg.d) childAt).c(childAt == dVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof dg.y) {
            int selectedType2 = ((dg.y) view).getSelectedType();
            if (h1Var.f0 == selectedType2 && (bVar = h1Var.n0) != null) {
                ((q2) bVar.b).U(3, h1Var.a0);
                ((a0) bVar.c).b.D(1);
            }
            h1Var.f0 = selectedType2;
            h1Var.Z(false, false);
            return;
        }
        if (view instanceof dg.j) {
            h1Var.h0 = ((TLRPC.TL_premiumGiftCodeOption) ((dg.j) view).getGifCode()).months;
            h1Var.Z(false, false);
            h1Var.c0.G();
            return;
        }
        if (!(view instanceof dg.i)) {
            if (view instanceof dg.b) {
                we.b bVar5 = h1Var.n0;
                if (bVar5 != null) {
                    ((q2) bVar5.b).U(2, h1Var.Y);
                    ((a0) bVar5.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof dg.a0)) {
                if (view instanceof u9) {
                    h1Var.g0 = true;
                    h1Var.Z(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((dg.a0) view).getOption();
            if (option != null) {
                h1Var.l0 = option.stars;
                h1Var.Z(true, true);
                h1Var.Y(true);
                h1Var.M();
                return;
            }
            return;
        }
        Context context = o2Var.getContext();
        long j10 = h1Var.i0;
        w0 w0Var = new w0(h1Var);
        b6 b6Var = h1Var.resourcesProvider;
        w4 w4Var2 = new w4(b6Var);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        bc0 bc0Var = new bc0(context, b6Var);
        int i15 = w4Var2.a;
        bc0Var.setTextColor(i15);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        q qVar = new q(context, b6Var);
        qVar.setWrapSelectorWheel(true);
        qVar.setAllItemsCount(24);
        qVar.setItemCount(5);
        qVar.setTextColor(i15);
        qVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        qVar.setTag("HOUR");
        r rVar = new r(context, b6Var);
        rVar.setWrapSelectorWheel(true);
        rVar.setAllItemsCount(60);
        rVar.setItemCount(5);
        rVar.setTextColor(i15);
        rVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        s sVar = new s(context, w4Var2, bc0Var, qVar, rVar);
        sVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        sVar.addView(frameLayout, e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i15);
        j3.r0.u(20.0f, 1, textView);
        frameLayout.addView(textView, e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        sVar.addView(linearLayout, e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        t tVar = new t(context, 0);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i17 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i18 = calendar2.get(11);
        int i19 = calendar.get(12);
        linearLayout.addView(bc0Var, e6.l(0.5f, 0, 270));
        bc0Var.setMinValue(0);
        bc0Var.setMaxValue(i17 - 1);
        bc0Var.setWrapSelectorWheel(false);
        bc0Var.setTag("DAY");
        bc0Var.setFormatter(new f(currentTimeMillis, calendar, i16, 0));
        g gVar = new g(sVar, qVar, rVar, i18, i19, bc0Var);
        bc0Var.setOnValueChangedListener(gVar);
        qVar.setMinValue(0);
        qVar.setMaxValue(23);
        linearLayout.addView(qVar, e6.l(0.2f, 0, 270));
        qVar.setFormatter(new a9.b(8));
        qVar.setOnValueChangedListener(gVar);
        rVar.setMinValue(0);
        rVar.setMaxValue(11);
        rVar.setValue(0);
        rVar.setFormatter(new a9.b(9));
        linearLayout.addView(rVar, e6.l(0.3f, 0, 270));
        rVar.setOnValueChangedListener(gVar);
        if (j10 > 0) {
            w4Var = w4Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            rVar.setValue(calendar.get(12) / 5);
            qVar.setValue(calendar.get(11));
            bc0Var.setValue(timeInMillis);
            bc0Var.getValue();
            gVar.m(bc0Var, bc0Var.getValue());
            qVar.getValue();
            gVar.m(qVar, qVar.getValue());
        } else {
            w4Var = w4Var2;
        }
        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar.setGravity(17);
        tVar.setTextColor(w4Var.g);
        tVar.setTextSize(1, 14.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setBackground(v5.e(new float[]{8.0f}, w4Var.h));
        tVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        sVar.addView(tVar, e6.t(-1, 48, 83, 16, 15, 16, 16));
        tVar.setOnClickListener(new h(calendar, bc0Var, qVar, rVar, w0Var, a3Var, 0));
        a3Var.b(sVar);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        int i20 = w4Var.b;
        f3Var.setBackgroundColor(i20);
        f3Var.fixNavigationBar(i20);
        AndroidUtilities.setLightStatusBar(f3Var, i0.a.f(i20) > 0.699999988079071d);
    }

    public static void Q(h1 h1Var) {
        zf.k1 k1Var = new zf.k1(h1Var.n, h1Var.currentAccount, null, h1Var.resourcesProvider);
        int i9 = 1;
        k1Var.setOnDismissListener(new a1(h1Var, i9));
        k1Var.setOnShowListener(new c1(h1Var, i9));
        k1Var.show();
    }

    public static void R(h1 h1Var) {
        zf.k1 k1Var = new zf.k1(h1Var.n, h1Var.currentAccount, null, h1Var.resourcesProvider);
        int i9 = 0;
        k1Var.setOnDismissListener(new a1(h1Var, i9));
        k1Var.setOnShowListener(new c1(h1Var, i9));
        k1Var.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i9) {
        this.o0 = i9;
    }

    public final ArrayList S(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption V = V(j10);
        if (V != null) {
            for (int i9 = 0; i9 < V.winners.size(); i9++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = V.winners.get(i9);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int T() {
        int i9 = this.d0;
        int i10 = dg.e.s;
        if (i9 == 2) {
            return ((Integer) this.U.get(this.j0)).intValue();
        }
        List W = W();
        int i11 = this.k0;
        if (i11 < 0 || i11 >= W.size()) {
            this.k0 = 0;
        }
        if (this.k0 >= W.size()) {
            return 0;
        }
        return ((Integer) W.get(this.k0)).intValue();
    }

    public final int U() {
        int T;
        int g10;
        int i9 = this.d0;
        int i10 = dg.e.s;
        if (i9 == 2) {
            T = ((Integer) this.U.get(this.j0)).intValue();
            g10 = u0.g();
        } else {
            TL_stars.TL_starsGiveawayOption V = V(this.l0);
            if (V != null) {
                return V.yearly_boosts;
            }
            T = T();
            g10 = u0.g();
        }
        return g10 * T;
    }

    public final TL_stars.TL_starsGiveawayOption V(long j10) {
        ArrayList v = v7.y(this.currentAccount, false).v();
        if (v == null) {
            return null;
        }
        for (int i9 = 0; i9 < v.size(); i9++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i9);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List W() {
        int i9 = this.d0;
        int i10 = dg.e.s;
        if (i9 == 2) {
            return this.U;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption V = V(this.l0);
        if (V != null) {
            for (int i11 = 0; i11 < V.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = V.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean X() {
        return this.q0 != null;
    }

    public final void Y(boolean z10) {
        boolean X = X();
        dg.a aVar = this.m0;
        if (X) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.q0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(u0.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i9 = this.e0;
        int i10 = dg.e.s;
        if (i9 == 0) {
            aVar.a(U(), z10);
            return;
        }
        ArrayList arrayList = this.Z;
        int g10 = u0.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        kh.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.b.setBackgroundColor(f6.v0(f6.h5, aVar.c));
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
    public final void Z(boolean z10, boolean z11) {
        boolean z12;
        int i9;
        ?? r15;
        int i10;
        boolean z13;
        ?? r152;
        cg.b bVar;
        ?? r153;
        long longValue;
        ArrayList arrayList = this.T;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i11 = this.d0;
        int i12 = dg.e.s;
        boolean z14 = i11 == 3;
        cg.a aVar = new cg.a(0, false);
        aVar.g = z14;
        arrayList.add(aVar);
        boolean X = X();
        ArrayList arrayList3 = this.Z;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.q0;
        if (X) {
            cg.a aVar2 = new cg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            cg.a aVar3 = new cg.a(2, this.d0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            cg.a aVar4 = new cg.a(2, this.d0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new cg.a(4, false));
        TLRPC.Chat chat = this.X;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i13 = this.d0;
        ArrayList arrayList4 = this.a0;
        ArrayList arrayList5 = this.Y;
        if (i13 == 3) {
            if (X()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.l0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int U = U();
                cg.a aVar5 = new cg.a(13, false);
                aVar5.c = string;
                aVar5.i = U;
                arrayList.add(aVar5);
                ArrayList v = v7.y(this.currentAccount, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    int i14 = 0;
                    while (i14 < v.size()) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i14);
                        boolean z15 = isChannelAndNotMegaGroup;
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                        i14++;
                        isChannelAndNotMegaGroup = z15;
                    }
                }
                z12 = isChannelAndNotMegaGroup;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                    TL_stars.TL_starsGiveawayOption V = V(((Long) arrayList6.get(i16)).longValue());
                    if (!V.missingStorePrice) {
                        if (this.l0 == 0 && V.isDefault) {
                            this.l0 = V.stars;
                        }
                        if (!V.extended || this.g0) {
                            i15++;
                            int i17 = this.g0 ? i16 : i16 + 2;
                            long j10 = V.stars;
                            ArrayList S = S(j10);
                            if (S.isEmpty()) {
                                float f10 = j10;
                                ArrayList S2 = S(this.l0);
                                int i18 = this.k0;
                                if (i18 < 0 || i18 >= S2.size()) {
                                    this.k0 = 0;
                                }
                                longValue = Math.round(f10 / (this.k0 >= S2.size() ? 1L : ((Long) S2.get(this.k0)).longValue()));
                            } else {
                                longValue = ((Long) S.get(Utilities.clamp(this.k0, S.size() - 1, 0))).longValue();
                            }
                            arrayList.add(cg.a.d(V, i17, longValue, this.l0 == V.stars, true));
                        }
                    }
                }
                if (!this.g0 && i15 < arrayList6.size()) {
                    arrayList.add(new cg.a(18, false));
                }
                if (i15 <= 0) {
                    arrayList.add(cg.a.d(null, 0, 1L, false, true));
                    arrayList.add(cg.a.d(null, 1, 1L, false, true));
                    arrayList.add(cg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = U();
                arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List W = W();
                int i19 = this.k0;
                if (i19 < 0 || i19 >= W.size()) {
                    this.k0 = 0;
                }
                if (W.size() > 1) {
                    arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List W2 = W();
                    int i20 = this.k0;
                    cg.a aVar6 = new cg.a(5, false);
                    aVar6.k = W2;
                    aVar6.i = i20;
                    arrayList.add(aVar6);
                    arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!X()) {
                arrayList.add(cg.a.b(chat, U(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(cg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(cg.a.b(chat, u0.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i21 = 0;
            while (i21 < size3) {
                Object obj = arrayList5.get(i21);
                i21++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(cg.a.b((TLRPC.Chat) tLObject, U(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int U2 = U();
                    cg.a aVar7 = new cg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = U2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < u0.f()) {
                r153 = 0;
                arrayList.add(new cg.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i22 = dg.y.s;
            arrayList.add(cg.a.e(r153, this.f0, true, arrayList4));
            arrayList.add(cg.a.e(1, this.f0, r153, arrayList4));
            arrayList.add(cg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.e0 == 0) {
                if (!X()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int U3 = U();
                    cg.a aVar8 = new cg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = U3;
                    arrayList.add(aVar8);
                    int i23 = this.j0;
                    cg.a aVar9 = new cg.a(5, false);
                    aVar9.k = this.U;
                    aVar9.i = i23;
                    arrayList.add(aVar9);
                    arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!X()) {
                    arrayList.add(cg.a.b(chat, U(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(cg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(cg.a.b(chat, u0.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i24 = 0;
                while (i24 < size4) {
                    Object obj2 = arrayList5.get(i24);
                    i24++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(cg.a.b((TLRPC.Chat) tLObject2, U(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int U4 = U();
                        cg.a aVar10 = new cg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = U4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < u0.f()) {
                    r15 = 0;
                    arrayList.add(new cg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i25 = dg.y.s;
                arrayList.add(cg.a.e(r15, this.f0, true, arrayList4));
                arrayList.add(cg.a.e(1, this.f0, r15, arrayList4));
                arrayList.add(cg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!X()) {
                arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i26 = this.e0;
                int i27 = dg.e.s;
                ArrayList b10 = u0.b(i26 == 0 ? T() : arrayList3.size(), this.b0);
                int i28 = 0;
                while (i28 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i28);
                    int i29 = tL_premiumGiftCodeOption.months;
                    int i30 = this.e0;
                    int i31 = dg.e.s;
                    int T = i30 == 0 ? T() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i32 = this.h0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z16 = i28 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    cg.a aVar11 = new cg.a(12, i29 == i32);
                    aVar11.i = i29;
                    aVar11.j = T;
                    aVar11.h = j11;
                    aVar11.g = z16;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i28++;
                    b10 = arrayList7;
                }
            }
            if (!X()) {
                i9 = 3;
                arrayList.add(cg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), f6.gc, 0, new v0(this, i9), this.resourcesProvider), true));
                i10 = this.d0;
                int i33 = dg.e.s;
                if (i10 != i9 || this.e0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z17 = this.s0;
                    int i34 = dg.c0.H;
                    cg.a aVar12 = new cg.a(15, z17);
                    aVar12.c = string3;
                    aVar12.g = z17;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.s0) {
                        z13 = false;
                        arrayList.add(cg.a.c(LocaleController.getString(this.d0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int T2 = X() ? prepaidGiveaway.quantity : T();
                        z13 = false;
                        cg.a aVar13 = new cg.a(16, false);
                        aVar13.i = T2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.h0, new Object[0]);
                        if (this.d0 == 3) {
                            if (this.r0.isEmpty()) {
                                arrayList.add(cg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.l0, new Object[0])), false));
                            } else {
                                arrayList.add(cg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.l0, Integer.valueOf(T2), this.r0)), false));
                            }
                        } else if (this.r0.isEmpty()) {
                            arrayList.add(cg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", T2, formatPluralString)), false));
                        } else {
                            arrayList.add(cg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", T2, this.r0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.i0;
                    cg.a aVar14 = new cg.a(10, z13);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.d0 != 3) {
                        if (X()) {
                            r152 = 0;
                            arrayList.add(cg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.l0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(cg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", T(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.l0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (X()) {
                            arrayList.add(cg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(cg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", T(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    cg.a aVar15 = new cg.a(15, this.t0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (X()) {
                        arrayList.add(cg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.d0 != 3 ? org.telegram.messenger.l0.h(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(cg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), f6.gc, 0, new v0(this, 4), this.resourcesProvider), true));
                    }
                }
                bVar = this.c0;
                if (bVar != null && z11) {
                    if (z10) {
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
        i9 = 3;
        i10 = this.d0;
        int i332 = dg.e.s;
        if (i10 != i9) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z172 = this.s0;
        int i342 = dg.c0.H;
        cg.a aVar122 = new cg.a(15, z172);
        aVar122.c = string32;
        aVar122.g = z172;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.s0) {
        }
        arrayList.add(cg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j122 = this.i0;
        cg.a aVar142 = new cg.a(10, z13);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.d0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        cg.a aVar152 = new cg.a(15, this.t0);
        aVar152.c = string42;
        aVar152.g = r152;
        aVar152.l = r152;
        arrayList.add(aVar152);
        if (X()) {
        }
        bVar = this.c0;
        if (bVar != null) {
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        wk0 wk0Var;
        if (i9 == NotificationCenter.starGiveawayOptionsLoaded && (wk0Var = this.d) != null && wk0Var.C) {
            Z(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        v vVar = this.p0;
        if (vVar != null) {
            vVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        cg.b bVar = new cg.b(this.resourcesProvider);
        this.c0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i9 = this.e0;
        int i10 = dg.e.s;
        return i9 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
