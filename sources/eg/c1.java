package eg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jh.p9;
import jh.s7;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c1 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList T;
    public final List U;
    public final List V;
    public final List W;
    public final TLRPC.Chat X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public fg.b c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public int h0;
    public long i0;
    public int j0;
    public int k0;
    public long l0;
    public final gg.a m0;
    public ze.b n0;
    public int o0;
    public t p0;
    public final TL_stories.PrepaidGiveaway q0;
    public String r0;
    public boolean s0;
    public boolean t0;
    public final r0 u0;

    public c1(org.telegram.ui.ActionBar.o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        this.T = new ArrayList();
        this.U = q0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V = q0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.W = Arrays.asList(750, 10000, 50000);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        int i10 = gg.e.s;
        this.d0 = 2;
        this.e0 = 0;
        int i11 = gg.w.s;
        this.f0 = 0;
        this.h0 = 12;
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
        this.i0 = calendar.getTimeInMillis();
        this.j0 = 2;
        this.k0 = 2;
        this.r0 = "";
        this.t0 = true;
        this.u0 = new r0(this, 0);
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
            int i13 = gg.e.s;
            this.d0 = 3;
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        jl0 jl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new b1());
        this.d.setOnItemClickListener(new w0(0, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = chat;
        fg.b bVar = this.c0;
        ArrayList arrayList = this.T;
        jl0 jl0Var2 = this.d;
        s0 s0Var = new s0(this);
        s0 s0Var2 = new s0(this);
        s0 s0Var3 = new s0(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = jl0Var2;
        bVar.h = s0Var;
        bVar.n = s0Var2;
        bVar.s = s0Var3;
        a0(false, false);
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider);
        this.m0 = aVar;
        aVar.setOnClickListener(new a1(this, prepaidGiveaway, j10, o2Var));
        Z(false);
        this.containerView.addView(aVar, f6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q0.j(this.currentAccount, chat, new u0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(c1 c1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        String str;
        int i10;
        String str2;
        ArrayList arrayList = c1Var.a0;
        ArrayList arrayList2 = c1Var.Y;
        TLRPC.Chat chat = c1Var.X;
        ArrayList arrayList3 = c1Var.Z;
        ArrayList arrayList4 = c1Var.b0;
        gg.a aVar = c1Var.m0;
        if (aVar.a.J) {
            return;
        }
        int i11 = 3;
        if (c1Var.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            t0 t0Var = new t0(c1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 0);
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1.c(t0Var, 29));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c(3));
            alertDialog$Builder.o();
            return;
        }
        int i12 = c1Var.d0;
        int i13 = gg.e.s;
        String str3 = "inapp";
        int i14 = 1;
        if (i12 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(c1Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption W = c1Var.W(c1Var.l0);
            int U = c1Var.U();
            if (W == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i15 = c1Var.f0;
            int i16 = gg.w.s;
            boolean z10 = i15 == 1;
            s7 y8 = s7.y(c1Var.currentAccount, false);
            int l10 = q0.l(c1Var.i0);
            boolean z11 = c1Var.t0;
            boolean z12 = c1Var.s0;
            String str4 = c1Var.r0;
            bh.v vVar = new bh.v(i14, c1Var, W);
            int i17 = y8.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    s7.e0(findActivity, null);
                    return;
                } else {
                    s7.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = findActivity;
            tL_inputStorePaymentStarsGiveaway.stars = W.stars;
            MessagesController.getInstance(i17);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i17);
                    arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                }
            }
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList.get(i19);
                i19++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z12) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str4;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i17).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l10;
            tL_inputStorePaymentStarsGiveaway.currency = W.currency;
            tL_inputStorePaymentStarsGiveaway.amount = W.amount;
            tL_inputStorePaymentStarsGiveaway.users = U;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = W.store_product) != null) {
                d9.c cVar = new d9.c();
                cVar.c = "inapp";
                cVar.b = str2;
                BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new a1.d(y8, vVar, tL_inputStorePaymentStarsGiveaway, activity, 3));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(s7.I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new z(y8, vVar, tL_inputInvoiceStars, 10));
            return;
        }
        if (c1Var.e0 == 1) {
            ArrayList b10 = q0.b(arrayList3.size(), arrayList4);
            for (int i20 = 0; i20 < b10.size(); i20++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i20);
                if (tL_premiumGiftCodeOption.months == c1Var.h0 && arrayList3.size() > 0) {
                    if (q0.h()) {
                        Context context = c1Var.getContext();
                        c6 c6Var = c1Var.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i21 = 0;
                            while (i21 < size3) {
                                Object obj3 = arrayList4.get(i21);
                                i21++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i22 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                            c2Var2.N = string2;
                            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i22, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new c(0));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    q0.k(arrayList3, tL_premiumGiftCodeOption, c1Var.X, null, o2Var, new u0(c1Var, 0), new u0(c1Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = q0.b(c1Var.U(), arrayList4);
        int i23 = 0;
        while (i23 < b11.size()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i23);
            if (tL_premiumGiftCodeOption3.months == c1Var.h0) {
                if (q0.h()) {
                    List list = c1Var.U;
                    Context context2 = c1Var.getContext();
                    c6 c6Var2 = c1Var.resourcesProvider;
                    u0 u0Var = new u0(c1Var, 2);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i24 = 0;
                        while (i24 < size4) {
                            Object obj4 = arrayList4.get(i24);
                            i24++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i25 = 0;
                        while (i25 < size5) {
                            Object obj5 = arrayList7.get(i25);
                            i25++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i26 = tL_premiumGiftCodeOption3.users;
                            int i27 = tL_premiumGiftCodeOption6.users;
                            if (i26 > i27 && i27 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i28 = tL_premiumGiftCodeOption3.users;
                        int i29 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, c6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                        c2Var3.N = string3;
                        c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i28, formatPluralString, Integer.valueOf(i29)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new a9.s(12, u0Var, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new c(0));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i30 = c1Var.f0;
                int i31 = gg.w.s;
                boolean z13 = i30 == 1;
                int l11 = q0.l(c1Var.i0);
                aVar.b(true);
                boolean z14 = c1Var.t0;
                boolean z15 = c1Var.s0;
                String str5 = c1Var.r0;
                u0 u0Var2 = new u0(c1Var, i11);
                String str6 = str3;
                u0 u0Var3 = new u0(c1Var, 4);
                if (q0.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str5;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                    int i32 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i32 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i32 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj6 = arrayList2.get(i33);
                        i33++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            str = str6;
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        } else {
                            str = str6;
                        }
                        str6 = str;
                    }
                    String str7 = str6;
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i34 = 0;
                    while (i34 < size7) {
                        Object obj7 = arrayList.get(i34);
                        i34++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    d9.c cVar2 = new d9.c();
                    cVar2.c = str7;
                    cVar2.b = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(cVar2.a()), new e0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, u0Var3, u0Var2, o2Var, 1));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z13;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str5;
                tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                int i35 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i36 = 0;
                while (i36 < size8) {
                    Object obj8 = arrayList2.get(i36);
                    int i37 = i36 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i37;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i37;
                    }
                    i36 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i38 = 0;
                while (i38 < size9) {
                    Object obj9 = arrayList.get(i38);
                    i38++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject p11 = ph.p2.p(o2Var.getResourceProvider(), false);
                if (p11 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = p11.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new f0(u0Var3, messagesController2, tL_inputInvoicePremiumGiftCode, o2Var, u0Var2, 0));
                return;
            }
            i23++;
            str3 = str3;
        }
    }

    public static void Q(c1 c1Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        q qVar;
        ze.b bVar;
        ArrayList arrayList = c1Var.Z;
        r0 r0Var = c1Var.u0;
        if (view instanceof gg.a0) {
            gg.a0 a0Var = (gg.a0) view;
            int type = a0Var.getType();
            boolean z10 = a0Var.e.h;
            boolean z11 = !z10;
            a0Var.setChecked(z11);
            int i10 = gg.a0.H;
            if (type == 0) {
                c1Var.t0 = z11;
                c1Var.a0(false, false);
            } else if (type == 1) {
                a0Var.setDivider(z11);
                c1Var.s0 = z11;
                c1Var.a0(false, false);
                fg.b bVar2 = c1Var.c0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.e.size()) {
                        break;
                    }
                    fg.a aVar = (fg.a) bVar2.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = gg.a0.H;
                        if (i12 == 1) {
                            if (z10) {
                                bVar2.u(i11 + 1);
                            } else {
                                bVar2.o(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                c1Var.c0.G();
                if (c1Var.s0) {
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                } else {
                    AndroidUtilities.runOnUIThread(r0Var, 250L);
                }
            }
        }
        if (view instanceof gg.d) {
            if (view instanceof gg.e) {
                int selectedType = ((gg.e) view).getSelectedType();
                int i14 = gg.e.s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && c1Var.d0 == selectedType) {
                        ze.b bVar3 = c1Var.n0;
                        if (bVar3 != null) {
                            ((g2) bVar3.a).V(1, arrayList);
                            ((y) bVar3.b).b.D(1);
                            return;
                        }
                        return;
                    }
                    c1Var.d0 = selectedType;
                    c1Var.a0(true, true);
                    c1Var.Z(true);
                    c1Var.M();
                } else if (selectedType == 1) {
                    ze.b bVar4 = c1Var.n0;
                    if (bVar4 != null) {
                        ((g2) bVar4.a).V(1, arrayList);
                        ((y) bVar4.b).b.D(1);
                    }
                } else {
                    c1Var.e0 = selectedType;
                    c1Var.a0(true, true);
                    c1Var.Z(true);
                    c1Var.M();
                }
            } else {
                gg.d dVar = (gg.d) view;
                jl0 jl0Var = c1Var.d;
                if (dVar.b()) {
                    for (int i15 = 0; i15 < jl0Var.getChildCount(); i15++) {
                        View childAt = jl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(dVar)) {
                            ((gg.d) childAt).c(childAt == dVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof gg.w) {
            int selectedType2 = ((gg.w) view).getSelectedType();
            if (c1Var.f0 == selectedType2 && (bVar = c1Var.n0) != null) {
                ((g2) bVar.a).V(3, c1Var.a0);
                ((y) bVar.b).b.D(1);
            }
            c1Var.f0 = selectedType2;
            c1Var.a0(false, false);
            return;
        }
        if (view instanceof gg.j) {
            c1Var.h0 = ((TLRPC.TL_premiumGiftCodeOption) ((gg.j) view).getGifCode()).months;
            c1Var.a0(false, false);
            c1Var.c0.G();
            return;
        }
        if (!(view instanceof gg.i)) {
            if (view instanceof gg.b) {
                ze.b bVar5 = c1Var.n0;
                if (bVar5 != null) {
                    ((g2) bVar5.a).V(2, c1Var.Y);
                    ((y) bVar5.b).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof gg.y)) {
                if (view instanceof p9) {
                    c1Var.g0 = true;
                    c1Var.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((gg.y) view).getOption();
            if (option != null) {
                c1Var.l0 = option.stars;
                c1Var.a0(true, true);
                c1Var.Z(true);
                c1Var.M();
                return;
            }
            return;
        }
        Context context = o2Var.getContext();
        long j10 = c1Var.i0;
        s0 s0Var = new s0(c1Var);
        c6 c6Var = c1Var.resourcesProvider;
        a5 a5Var = new a5(c6Var);
        a3 a3Var = new a3(context, c6Var);
        a3Var.a();
        qc0 qc0Var = new qc0(context, c6Var);
        int i16 = a5Var.a;
        qc0Var.setTextColor(i16);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        o oVar = new o(context, c6Var);
        oVar.setWrapSelectorWheel(true);
        oVar.setAllItemsCount(24);
        oVar.setItemCount(5);
        oVar.setTextColor(i16);
        oVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        oVar.setTag("HOUR");
        p pVar = new p(context, c6Var);
        pVar.setWrapSelectorWheel(true);
        pVar.setAllItemsCount(60);
        pVar.setItemCount(5);
        pVar.setTextColor(i16);
        pVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        q qVar2 = new q(context, a5Var, qc0Var, oVar, pVar);
        qVar2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qVar2.addView(frameLayout, f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        th.n(20.0f, 1, textView);
        frameLayout.addView(textView, f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qVar2.addView(linearLayout, f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        r rVar = new r(context, 0);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(qc0Var, f6.l(0.5f, 0, 270));
        qc0Var.setMinValue(0);
        qc0Var.setMaxValue(i18 - 1);
        qc0Var.setWrapSelectorWheel(false);
        qc0Var.setTag("DAY");
        qc0Var.setFormatter(new d(currentTimeMillis, calendar, i17, 0));
        e eVar = new e(qVar2, oVar, pVar, i19, i20, qc0Var);
        qc0Var.setOnValueChangedListener(eVar);
        oVar.setMinValue(0);
        oVar.setMaxValue(23);
        linearLayout.addView(oVar, f6.l(0.2f, 0, 270));
        oVar.setFormatter(new c(1));
        oVar.setOnValueChangedListener(eVar);
        pVar.setMinValue(0);
        pVar.setMaxValue(11);
        pVar.setValue(0);
        pVar.setFormatter(new c(2));
        linearLayout.addView(pVar, f6.l(0.3f, 0, 270));
        pVar.setOnValueChangedListener(eVar);
        if (j10 > 0) {
            qVar = qVar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            pVar.setValue(calendar.get(12) / 5);
            oVar.setValue(calendar.get(11));
            qc0Var.setValue(timeInMillis);
            qc0Var.getValue();
            eVar.q(qc0Var, qc0Var.getValue());
            oVar.getValue();
            eVar.q(oVar, oVar.getValue());
        } else {
            qVar = qVar2;
        }
        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar.setGravity(17);
        rVar.setTextColor(a5Var.g);
        rVar.setTextSize(1, 14.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setBackground(w5.e(new float[]{8.0f}, a5Var.h));
        rVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        qVar.addView(rVar, f6.t(-1, 48, 83, 16, 15, 16, 16));
        rVar.setOnClickListener(new f(calendar, qc0Var, oVar, pVar, s0Var, a3Var, 0));
        a3Var.b(qVar);
        f3 f3Var = a3Var.a;
        f3Var.show();
        int i21 = a5Var.b;
        f3Var.setBackgroundColor(i21);
        f3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(f3Var, i0.a.f(i21) > 0.699999988079071d);
    }

    public static void R(c1 c1Var) {
        cg.f2 f2Var = new cg.f2(c1Var.n, c1Var.currentAccount, null, c1Var.resourcesProvider);
        int i10 = 1;
        f2Var.setOnDismissListener(new v0(c1Var, i10));
        f2Var.setOnShowListener(new x0(c1Var, i10));
        f2Var.show();
    }

    public static void S(c1 c1Var) {
        cg.f2 f2Var = new cg.f2(c1Var.n, c1Var.currentAccount, null, c1Var.resourcesProvider);
        int i10 = 0;
        f2Var.setOnDismissListener(new v0(c1Var, i10));
        f2Var.setOnShowListener(new x0(c1Var, i10));
        f2Var.show();
    }

    @Override // org.telegram.ui.Components.xa
    public final void C(Canvas canvas, int i10) {
        this.o0 = i10;
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
        int i10 = this.d0;
        int i11 = gg.e.s;
        if (i10 == 2) {
            return ((Integer) this.U.get(this.j0)).intValue();
        }
        List X = X();
        int i12 = this.k0;
        if (i12 < 0 || i12 >= X.size()) {
            this.k0 = 0;
        }
        if (this.k0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.k0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.d0;
        int i11 = gg.e.s;
        if (i10 == 2) {
            U = ((Integer) this.U.get(this.j0)).intValue();
            g10 = q0.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.l0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = q0.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = s7.y(this.currentAccount, false).v();
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
        int i10 = this.d0;
        int i11 = gg.e.s;
        if (i10 == 2) {
            return this.U;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.l0);
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
        return this.q0 != null;
    }

    public final void Z(boolean z10) {
        boolean Y = Y();
        gg.a aVar = this.m0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.q0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(q0.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.e0;
        int i11 = gg.e.s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.Z;
        int g10 = q0.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        nh.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.b.setBackgroundColor(g6.v0(g6.h5, aVar.c));
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
    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        ?? r152;
        fg.b bVar;
        ?? r153;
        long longValue;
        ArrayList arrayList = this.T;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.d0;
        int i13 = gg.e.s;
        boolean z14 = i12 == 3;
        fg.a aVar = new fg.a(0, false);
        aVar.g = z14;
        arrayList.add(aVar);
        boolean Y = Y();
        ArrayList arrayList3 = this.Z;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.q0;
        if (Y) {
            fg.a aVar2 = new fg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            fg.a aVar3 = new fg.a(2, this.d0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            fg.a aVar4 = new fg.a(2, this.d0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new fg.a(4, false));
        TLRPC.Chat chat = this.X;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i14 = this.d0;
        ArrayList arrayList4 = this.a0;
        ArrayList arrayList5 = this.Y;
        if (i14 == 3) {
            if (Y()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.l0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int V = V();
                fg.a aVar5 = new fg.a(13, false);
                aVar5.c = string;
                aVar5.i = V;
                arrayList.add(aVar5);
                ArrayList v = s7.y(this.currentAccount, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    int i15 = 0;
                    while (i15 < v.size()) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i15);
                        boolean z15 = isChannelAndNotMegaGroup;
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                        i15++;
                        isChannelAndNotMegaGroup = z15;
                    }
                }
                z12 = isChannelAndNotMegaGroup;
                int i16 = 0;
                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                    TL_stars.TL_starsGiveawayOption W = W(((Long) arrayList6.get(i17)).longValue());
                    if (!W.missingStorePrice) {
                        if (this.l0 == 0 && W.isDefault) {
                            this.l0 = W.stars;
                        }
                        if (!W.extended || this.g0) {
                            i16++;
                            int i18 = this.g0 ? i17 : i17 + 2;
                            long j10 = W.stars;
                            ArrayList T = T(j10);
                            if (T.isEmpty()) {
                                float f9 = j10;
                                ArrayList T2 = T(this.l0);
                                int i19 = this.k0;
                                if (i19 < 0 || i19 >= T2.size()) {
                                    this.k0 = 0;
                                }
                                longValue = Math.round(f9 / (this.k0 >= T2.size() ? 1L : ((Long) T2.get(this.k0)).longValue()));
                            } else {
                                longValue = ((Long) T.get(Utilities.clamp(this.k0, T.size() - 1, 0))).longValue();
                            }
                            arrayList.add(fg.a.d(W, i18, longValue, this.l0 == W.stars, true));
                        }
                    }
                }
                if (!this.g0 && i16 < arrayList6.size()) {
                    arrayList.add(new fg.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(fg.a.d(null, 0, 1L, false, true));
                    arrayList.add(fg.a.d(null, 1, 1L, false, true));
                    arrayList.add(fg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = V();
                arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List X = X();
                int i20 = this.k0;
                if (i20 < 0 || i20 >= X.size()) {
                    this.k0 = 0;
                }
                if (X.size() > 1) {
                    arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List X2 = X();
                    int i21 = this.k0;
                    fg.a aVar6 = new fg.a(5, false);
                    aVar6.k = X2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Y()) {
                arrayList.add(fg.a.b(chat, V(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(fg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(fg.a.b(chat, q0.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(fg.a.b((TLRPC.Chat) tLObject, V(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int V2 = V();
                    fg.a aVar7 = new fg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = V2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < q0.f()) {
                r153 = 0;
                arrayList.add(new fg.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = gg.w.s;
            arrayList.add(fg.a.e(r153, this.f0, true, arrayList4));
            arrayList.add(fg.a.e(1, this.f0, r153, arrayList4));
            arrayList.add(fg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.e0 == 0) {
                if (!Y()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int V3 = V();
                    fg.a aVar8 = new fg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = V3;
                    arrayList.add(aVar8);
                    int i24 = this.j0;
                    fg.a aVar9 = new fg.a(5, false);
                    aVar9.k = this.U;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(fg.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(fg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(fg.a.b(chat, q0.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(fg.a.b((TLRPC.Chat) tLObject2, V(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int V4 = V();
                        fg.a aVar10 = new fg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = V4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < q0.f()) {
                    r15 = 0;
                    arrayList.add(new fg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = gg.w.s;
                arrayList.add(fg.a.e(r15, this.f0, true, arrayList4));
                arrayList.add(fg.a.e(1, this.f0, r15, arrayList4));
                arrayList.add(fg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.e0;
                int i28 = gg.e.s;
                ArrayList b10 = q0.b(i27 == 0 ? U() : arrayList3.size(), this.b0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.e0;
                    int i32 = gg.e.s;
                    int U = i31 == 0 ? U() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.h0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z16 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    fg.a aVar11 = new fg.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = U;
                    aVar11.h = j11;
                    aVar11.g = z16;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!Y()) {
                i10 = 3;
                arrayList.add(fg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), g6.gc, 0, new r0(this, i10), this.resourcesProvider), true));
                i11 = this.d0;
                int i34 = gg.e.s;
                if (i11 != i10 || this.e0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z17 = this.s0;
                    int i35 = gg.a0.H;
                    fg.a aVar12 = new fg.a(15, z17);
                    aVar12.c = string3;
                    aVar12.g = z17;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.s0) {
                        z13 = false;
                        arrayList.add(fg.a.c(LocaleController.getString(this.d0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int U2 = Y() ? prepaidGiveaway.quantity : U();
                        z13 = false;
                        fg.a aVar13 = new fg.a(16, false);
                        aVar13.i = U2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.h0, new Object[0]);
                        if (this.d0 == 3) {
                            if (this.r0.isEmpty()) {
                                arrayList.add(fg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.l0, new Object[0])), false));
                            } else {
                                arrayList.add(fg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.l0, Integer.valueOf(U2), this.r0)), false));
                            }
                        } else if (this.r0.isEmpty()) {
                            arrayList.add(fg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", U2, formatPluralString)), false));
                        } else {
                            arrayList.add(fg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", U2, this.r0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.i0;
                    fg.a aVar14 = new fg.a(10, z13);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.d0 != 3) {
                        if (Y()) {
                            r152 = 0;
                            arrayList.add(fg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.l0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(fg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.l0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Y()) {
                            arrayList.add(fg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(fg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    fg.a aVar15 = new fg.a(15, this.t0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Y()) {
                        arrayList.add(fg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.d0 != 3 ? x3.i(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(fg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), g6.gc, 0, new r0(this, 4), this.resourcesProvider), true));
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
        i10 = 3;
        i11 = this.d0;
        int i342 = gg.e.s;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z172 = this.s0;
        int i352 = gg.a0.H;
        fg.a aVar122 = new fg.a(15, z172);
        aVar122.c = string32;
        aVar122.g = z172;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.s0) {
        }
        arrayList.add(fg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j122 = this.i0;
        fg.a aVar142 = new fg.a(10, z13);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.d0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        fg.a aVar152 = new fg.a(15, this.t0);
        aVar152.c = string42;
        aVar152.g = r152;
        aVar152.l = r152;
        arrayList.add(aVar152);
        if (Y()) {
        }
        bVar = this.c0;
        if (bVar != null) {
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jl0 jl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (jl0Var = this.d) != null && jl0Var.C) {
            a0(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        t tVar = this.p0;
        if (tVar != null) {
            tVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        fg.b bVar = new fg.b(this.resourcesProvider);
        this.c0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        int i10 = this.e0;
        int i11 = gg.e.s;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
