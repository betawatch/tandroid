package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rq(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
        int i10;
        String str;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                tq tqVar = (tq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, tqVar.J0);
                String M0 = org.telegram.messenger.bd.M0(2131748806, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131748807, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new ci.i(tqVar, (gi.d) obj, this.b, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                uwVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new ci.l2(uwVar, (org.telegram.messenger.mo) obj2, (TLRPC.Dialog) obj, this.b, 19), 100L);
                break;
            default:
                xg.a0 a0Var = (xg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                ArrayList arrayList = a0Var.X1;
                ArrayList arrayList2 = a0Var.V1;
                TLRPC.Chat chat = a0Var.U1;
                ArrayList arrayList3 = a0Var.W1;
                ArrayList arrayList4 = a0Var.Y1;
                zg.a aVar = a0Var.j2;
                if (!aVar.a.R) {
                    if (!a0Var.i1()) {
                        int i12 = a0Var.a2;
                        int i13 = zg.d.w;
                        if (i12 != 3) {
                            int i14 = 2;
                            if (a0Var.b2 == 1) {
                                ArrayList b10 = xg.s.b(arrayList3.size(), arrayList4);
                                int i15 = 0;
                                while (i15 < b10.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i15);
                                    if (tL_premiumGiftCodeOption.months == a0Var.e2 && arrayList3.size() > 0) {
                                        if (xg.s.h()) {
                                            Context context = a0Var.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var = a0Var.J0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i16 = 0;
                                                while (i16 < size) {
                                                    Object obj4 = arrayList4.get(i16);
                                                    i16++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i17 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, e6Var);
                                                String M02 = org.telegram.messenger.bd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                                s1Var2.S = M02;
                                                s1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i17, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new u9.j(20));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        xg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.U1, null, d2Var, new xg.v(a0Var, 0), new xg.v(a0Var, 1));
                                        break;
                                    } else {
                                        i15++;
                                        arrayList3 = arrayList3;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = xg.s.b(a0Var.e1(), arrayList4);
                                for (int i18 = 0; i18 < b11.size(); i18++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i18);
                                    if (tL_premiumGiftCodeOption3.months == a0Var.e2) {
                                        if (xg.s.h()) {
                                            List list = a0Var.R1;
                                            Context context2 = a0Var.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var2 = a0Var.J0;
                                            xg.v vVar = new xg.v(a0Var, i14);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i19 = 0;
                                                while (i19 < size2) {
                                                    Object obj5 = arrayList4.get(i19);
                                                    i19++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i20 = 0;
                                                while (i20 < size3) {
                                                    Object obj6 = arrayList6.get(i20);
                                                    i20++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i21 = tL_premiumGiftCodeOption3.users;
                                                    int i22 = tL_premiumGiftCodeOption6.users;
                                                    if (i21 > i22 && i22 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = org.telegram.messenger.bd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i23 = tL_premiumGiftCodeOption3.users;
                                                int i24 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context2, e6Var2);
                                                String M03 = org.telegram.messenger.bd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                                                s1Var3.S = M03;
                                                s1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i23, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i24)));
                                                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131746349, "Reduce"), new na1(23, vVar, tL_premiumGiftCodeOption5));
                                                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), new u9.j(20));
                                                alertDialog$Builder3.p();
                                                break;
                                            }
                                        }
                                        int i25 = a0Var.c2;
                                        int i26 = zg.u.w;
                                        boolean z10 = i25 == 1;
                                        int l10 = xg.s.l(a0Var.f2);
                                        aVar.b(true);
                                        boolean z11 = a0Var.q2;
                                        boolean z12 = a0Var.p2;
                                        String str2 = a0Var.o2;
                                        xg.v vVar2 = new xg.v(a0Var, 3);
                                        xg.v vVar3 = new xg.v(a0Var, 4);
                                        if (xg.s.h()) {
                                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                                            int i27 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i27 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i27 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i28 = 0;
                                            while (i28 < size4) {
                                                Object obj7 = arrayList2.get(i28);
                                                i28++;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i29 = 0;
                                            while (i29 < size5) {
                                                Object obj8 = arrayList.get(i29);
                                                i29++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            e5.a aVar2 = new e5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = tL_premiumGiftCodeOption3.store_product;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new r0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, d2Var, 3));
                                            break;
                                        } else {
                                            org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                                            int i30 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i30 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i30 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size6 = arrayList2.size();
                                            int i31 = 0;
                                            while (i31 < size6) {
                                                Object obj9 = arrayList2.get(i31);
                                                int i32 = i31 + 1;
                                                TLObject tLObject2 = (TLObject) obj9;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    i3 = size6;
                                                    i10 = i32;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i3 = size6;
                                                    i10 = i32;
                                                }
                                                size6 = i3;
                                                i31 = i10;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                                            tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                                            int size7 = arrayList.size();
                                            int i33 = 0;
                                            while (i33 < size7) {
                                                Object obj10 = arrayList.get(i33);
                                                i33++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                            JSONObject u10 = ii.a3.u(d2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new ci.s7(vVar3, s13, tL_inputInvoicePremiumGiftCode, d2Var, vVar2, 13));
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.K1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption g12 = a0Var.g1(a0Var.i2);
                                int e12 = a0Var.e1();
                                if (g12 != null) {
                                    aVar.a.setLoading(true);
                                    int i34 = a0Var.c2;
                                    int i35 = zg.u.w;
                                    boolean z13 = i34 == 1;
                                    ci.e9 y9 = ci.e9.y(a0Var.a, false);
                                    int l11 = xg.s.l(a0Var.f2);
                                    boolean z14 = a0Var.q2;
                                    boolean z15 = a0Var.p2;
                                    int i36 = 4;
                                    String str3 = a0Var.o2;
                                    org.telegram.ui.Wallet.s1 s1Var4 = new org.telegram.ui.Wallet.s1(6, a0Var, g12);
                                    int i37 = y9.a;
                                    if (org.telegram.messenger.hp.s1(i37).j7) {
                                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            ci.e9.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            ci.e9.c0(W, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z13;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z14;
                                        tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                        org.telegram.messenger.hp.s1(i37);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.hp.l1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i38 = 0;
                                            while (i38 < size8) {
                                                Object obj11 = arrayList2.get(i38);
                                                i38++;
                                                int i39 = size8;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                org.telegram.messenger.hp.s1(i37);
                                                arrayList7.add(org.telegram.messenger.hp.k1((TLObject) obj11));
                                                size8 = i39;
                                            }
                                        }
                                        int size9 = arrayList.size();
                                        int i40 = 0;
                                        while (i40 < size9) {
                                            Object obj12 = arrayList.get(i40);
                                            i40++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z15) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        org.telegram.messenger.yy.C(i37);
                                        tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.yy.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l11;
                                        tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = e12;
                                        if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                            e5.a aVar3 = new e5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = str;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new a1.d(y9, s1Var4, tL_inputStorePaymentStarsGiveaway, W, 2));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u11 = ii.a3.u(ci.e9.I(), false);
                                            if (u11 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u11.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i37).sendRequest(tL_payments_getPaymentForm2, new ai.r6(y9, s1Var4, tL_inputInvoiceStars, i36));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        rn rnVar = new rn(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String M04 = org.telegram.messenger.bd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder4.a;
                            s1Var5.S = M04;
                            s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131753192, null));
                            alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131744925, null), new xg.c(rnVar, 1));
                            alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), new u9.j(23));
                            alertDialog$Builder4.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ rq(xg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = 2;
        this.c = a0Var;
        this.d = prepaidGiveaway;
        this.b = j10;
        this.e = d2Var;
    }
}
