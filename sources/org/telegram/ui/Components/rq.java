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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rq(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10;
        String str;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                tq tqVar = (tq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, tqVar.I0);
                String M0 = org.telegram.messenger.hd.M0(2131748797, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131748798, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new bi.i(tqVar, (fi.d) obj, this.b, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj3;
                wwVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new bi.w2(wwVar, (org.telegram.messenger.vo) obj2, (TLRPC.Dialog) obj, this.b, 19), 100L);
                break;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                ArrayList arrayList = a0Var.W1;
                ArrayList arrayList2 = a0Var.U1;
                TLRPC.Chat chat = a0Var.T1;
                ArrayList arrayList3 = a0Var.V1;
                ArrayList arrayList4 = a0Var.X1;
                yg.a aVar = a0Var.i2;
                if (!aVar.a.Q) {
                    if (!a0Var.i1()) {
                        int i12 = a0Var.Z1;
                        int i13 = yg.d.w;
                        int i14 = 4;
                        if (i12 != 3) {
                            int i15 = 2;
                            if (a0Var.a2 == 1) {
                                ArrayList b10 = wg.s.b(arrayList3.size(), arrayList4);
                                int i16 = 0;
                                while (i16 < b10.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i16);
                                    if (tL_premiumGiftCodeOption.months == a0Var.d2 && arrayList3.size() > 0) {
                                        if (wg.s.h()) {
                                            Context context = a0Var.getContext();
                                            org.telegram.ui.ActionBar.f6 f6Var = a0Var.I0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i17 = 0;
                                                while (i17 < size) {
                                                    Object obj4 = arrayList4.get(i17);
                                                    i17++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i18 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, f6Var);
                                                String M02 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                                u1Var2.R = M02;
                                                u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i18, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new v0.j(14));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        wg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.T1, null, f2Var, new wg.v(a0Var, 0), new wg.v(a0Var, 1));
                                        break;
                                    } else {
                                        i16++;
                                        arrayList3 = arrayList3;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = wg.s.b(a0Var.e1(), arrayList4);
                                for (int i19 = 0; i19 < b11.size(); i19++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i19);
                                    if (tL_premiumGiftCodeOption3.months == a0Var.d2) {
                                        if (wg.s.h()) {
                                            List list = a0Var.Q1;
                                            Context context2 = a0Var.getContext();
                                            org.telegram.ui.ActionBar.f6 f6Var2 = a0Var.I0;
                                            wg.v vVar = new wg.v(a0Var, i15);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj5 = arrayList4.get(i20);
                                                    i20++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i21 = 0;
                                                while (i21 < size3) {
                                                    Object obj6 = arrayList6.get(i21);
                                                    i21++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i22 = tL_premiumGiftCodeOption3.users;
                                                    int i23 = tL_premiumGiftCodeOption6.users;
                                                    if (i22 > i23 && i23 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = org.telegram.messenger.hd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i24 = tL_premiumGiftCodeOption3.users;
                                                int i25 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context2, f6Var2);
                                                String M03 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                                                u1Var3.R = M03;
                                                u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i24, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i25)));
                                                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746340, "Reduce"), new org.telegram.ui.web.a0(19, vVar, tL_premiumGiftCodeOption5));
                                                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new v0.j(14));
                                                alertDialog$Builder3.p();
                                                break;
                                            }
                                        }
                                        int i26 = a0Var.b2;
                                        int i27 = yg.u.w;
                                        boolean z9 = i26 == 1;
                                        int l10 = wg.s.l(a0Var.e2);
                                        aVar.b(true);
                                        boolean z10 = a0Var.p2;
                                        boolean z11 = a0Var.o2;
                                        String str2 = a0Var.n2;
                                        wg.v vVar2 = new wg.v(a0Var, 3);
                                        wg.v vVar3 = new wg.v(a0Var, i14);
                                        if (wg.s.h()) {
                                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z9;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z10;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                                            int i28 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i28 | 6;
                                            if (z11) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i28 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i29 = 0;
                                            while (i29 < size4) {
                                                Object obj7 = arrayList2.get(i29);
                                                i29++;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i30 = 0;
                                            while (i30 < size5) {
                                                Object obj8 = arrayList.get(i30);
                                                i30++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            f5.a aVar2 = new f5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = tL_premiumGiftCodeOption3.store_product;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new s0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, f2Var, 3));
                                            break;
                                        } else {
                                            org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z9;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                                            int i31 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i31 | 6;
                                            if (z11) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i31 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size6 = arrayList2.size();
                                            int i32 = 0;
                                            while (i32 < size6) {
                                                Object obj9 = arrayList2.get(i32);
                                                int i33 = i32 + 1;
                                                TLObject tLObject2 = (TLObject) obj9;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    i7 = size6;
                                                    i10 = i33;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i7 = size6;
                                                    i10 = i33;
                                                }
                                                size6 = i7;
                                                i32 = i10;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                                            tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                                            int size7 = arrayList.size();
                                            int i34 = 0;
                                            while (i34 < size7) {
                                                Object obj10 = arrayList.get(i34);
                                                i34++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                            JSONObject u10 = hi.a3.u(f2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new bi.r8(vVar3, s13, tL_inputInvoicePremiumGiftCode, f2Var, vVar2, 13));
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.G1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption g12 = a0Var.g1(a0Var.h2);
                                int e12 = a0Var.e1();
                                if (g12 != null) {
                                    aVar.a.setLoading(true);
                                    int i35 = a0Var.b2;
                                    int i36 = yg.u.w;
                                    boolean z12 = i35 == 1;
                                    bi.ea y10 = bi.ea.y(a0Var.a, false);
                                    int l11 = wg.s.l(a0Var.e2);
                                    boolean z13 = a0Var.p2;
                                    boolean z14 = a0Var.o2;
                                    String str3 = a0Var.n2;
                                    org.telegram.ui.Wallet.v1 v1Var = new org.telegram.ui.Wallet.v1(5, a0Var, g12);
                                    int i37 = y10.a;
                                    if (org.telegram.messenger.qp.s1(i37).j7) {
                                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            bi.ea.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            bi.ea.c0(W, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z12;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z13;
                                        Activity activity = W;
                                        tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                        org.telegram.messenger.qp.s1(i37);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.qp.l1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i38 = 0;
                                            while (i38 < size8) {
                                                Object obj11 = arrayList2.get(i38);
                                                i38++;
                                                int i39 = size8;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                org.telegram.messenger.qp.s1(i37);
                                                arrayList7.add(org.telegram.messenger.qp.k1((TLObject) obj11));
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
                                        if (z14) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        org.telegram.messenger.gz.C(i37);
                                        tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.gz.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l11;
                                        tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = e12;
                                        if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                            f5.a aVar3 = new f5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = str;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new a1.d(y10, v1Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u11 = hi.a3.u(bi.ea.I(), false);
                                            if (u11 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u11.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i37).sendRequest(tL_payments_getPaymentForm2, new bi.f2(y10, v1Var, tL_inputInvoiceStars, 3));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        sn snVar = new sn(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String M04 = org.telegram.messenger.hd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                            u1Var4.R = M04;
                            u1Var4.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131753192, null));
                            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131744916, null), new u5.e(snVar, 6));
                            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), new v0.j(17));
                            alertDialog$Builder4.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ rq(wg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = 2;
        this.c = a0Var;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = f2Var;
    }
}
