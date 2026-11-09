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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        String str;
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                tq tqVar = (tq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, tqVar.I0);
                String M0 = org.telegram.messenger.id.M0(2131748798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new bi.i(tqVar, (fi.d) obj, this.b, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                ywVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new bi.w2(ywVar, (org.telegram.messenger.vo) obj2, (TLRPC.Dialog) obj, this.b, 19), 100L);
                break;
            default:
                wg.z zVar = (wg.z) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                ArrayList arrayList = zVar.W1;
                ArrayList arrayList2 = zVar.U1;
                TLRPC.Chat chat = zVar.T1;
                ArrayList arrayList3 = zVar.V1;
                ArrayList arrayList4 = zVar.X1;
                yg.a aVar = zVar.i2;
                if (!aVar.a.Q) {
                    if (!zVar.i1()) {
                        boolean z9 = 18;
                        int i11 = zVar.Z1;
                        int i12 = yg.d.w;
                        int i13 = 4;
                        if (i11 != 3) {
                            int i14 = 2;
                            if (zVar.a2 != 1) {
                                ArrayList b10 = wg.r.b(zVar.e1(), arrayList4);
                                int i15 = 0;
                                while (i15 < b10.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i15);
                                    if (tL_premiumGiftCodeOption.months == zVar.d2) {
                                        if (wg.r.h()) {
                                            List list = zVar.Q1;
                                            Context context = zVar.getContext();
                                            org.telegram.ui.ActionBar.g6 g6Var = zVar.I0;
                                            wg.u uVar = new wg.u(zVar, i14);
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i16 = 0;
                                                while (i16 < size) {
                                                    Object obj4 = arrayList4.get(i16);
                                                    i16++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption2.users))) {
                                                        arrayList5.add(tL_premiumGiftCodeOption2);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) arrayList5.get(0);
                                                int size2 = arrayList5.size();
                                                int i17 = 0;
                                                while (i17 < size2) {
                                                    Object obj5 = arrayList5.get(i17);
                                                    i17++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    int i18 = tL_premiumGiftCodeOption.users;
                                                    int i19 = tL_premiumGiftCodeOption4.users;
                                                    if (i18 > i19 && i19 > tL_premiumGiftCodeOption3.users) {
                                                        tL_premiumGiftCodeOption3 = tL_premiumGiftCodeOption4;
                                                    }
                                                }
                                                String G = org.telegram.messenger.id.G(tL_premiumGiftCodeOption3.months, "GiftMonths", new Object[0]);
                                                int i20 = tL_premiumGiftCodeOption.users;
                                                int i21 = tL_premiumGiftCodeOption3.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, g6Var);
                                                String M02 = org.telegram.messenger.id.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                                u1Var2.R = M02;
                                                u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i20, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i21)));
                                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746341, "Reduce"), new org.telegram.ui.web.a0(18, uVar, tL_premiumGiftCodeOption3));
                                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), new v0.j(15));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        int i22 = zVar.b2;
                                        int i23 = yg.u.w;
                                        boolean z10 = i22 == 1;
                                        int l10 = wg.r.l(zVar.e2);
                                        aVar.b(true);
                                        boolean z11 = zVar.p2;
                                        boolean z12 = zVar.o2;
                                        String str2 = zVar.n2;
                                        wg.u uVar2 = new wg.u(zVar, 3);
                                        wg.u uVar3 = new wg.u(zVar, i13);
                                        if (!wg.r.h()) {
                                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                                            int i24 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i24 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i24 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size3 = arrayList2.size();
                                            int i25 = 0;
                                            while (i25 < size3) {
                                                Object obj6 = arrayList2.get(i25);
                                                int i26 = i25 + 1;
                                                TLObject tLObject = (TLObject) obj6;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    i7 = i26;
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).id));
                                                } else {
                                                    i7 = i26;
                                                }
                                                i25 = i7;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption.currency;
                                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption.amount;
                                            int size4 = arrayList.size();
                                            int i27 = 0;
                                            while (i27 < size4) {
                                                Object obj7 = arrayList.get(i27);
                                                i27++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
                                            JSONObject u10 = hi.a3.u(f2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager.sendRequest(tL_payments_getPaymentForm, new bi.r8(uVar3, s12, tL_inputInvoicePremiumGiftCode, f2Var, uVar2, 13));
                                            break;
                                        } else {
                                            org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                                            int i28 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i28 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i28 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size5 = arrayList2.size();
                                            int i29 = 0;
                                            while (i29 < size5) {
                                                Object obj8 = arrayList2.get(i29);
                                                i29++;
                                                TLObject tLObject2 = (TLObject) obj8;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            int size6 = arrayList.size();
                                            int i30 = 0;
                                            while (i30 < size6) {
                                                Object obj9 = arrayList.get(i30);
                                                i30++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                                            }
                                            f5.a aVar2 = new f5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = tL_premiumGiftCodeOption.store_product;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new s0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption, connectionsManager2, uVar3, uVar2, f2Var, 3));
                                            break;
                                        }
                                    } else {
                                        i15++;
                                        i14 = i14;
                                        z9 = z9;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = wg.r.b(arrayList3.size(), arrayList4);
                                int i31 = 0;
                                while (i31 < b11.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i31);
                                    if (tL_premiumGiftCodeOption5.months == zVar.d2 && arrayList3.size() > 0) {
                                        if (wg.r.h()) {
                                            Context context2 = zVar.getContext();
                                            org.telegram.ui.ActionBar.g6 g6Var2 = zVar.I0;
                                            if (tL_premiumGiftCodeOption5.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size7 = arrayList4.size();
                                                int i32 = 0;
                                                while (i32 < size7) {
                                                    Object obj10 = arrayList4.get(i32);
                                                    i32++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj10;
                                                    if (tL_premiumGiftCodeOption6.months == tL_premiumGiftCodeOption5.months && tL_premiumGiftCodeOption6.store_product != null) {
                                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption6.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList6);
                                                int i33 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context2, g6Var2);
                                                String M03 = org.telegram.messenger.id.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                                                u1Var3.R = M03;
                                                u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i33, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747831, "OK"), new v0.j(15));
                                                alertDialog$Builder3.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        wg.r.k(arrayList3, tL_premiumGiftCodeOption5, zVar.T1, null, f2Var, new wg.u(zVar, 0), new wg.u(zVar, 1));
                                        break;
                                    } else {
                                        i31++;
                                        arrayList3 = arrayList3;
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.g0.W(zVar.getContext());
                            if (W == null) {
                                W = LaunchActivity.G1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption g12 = zVar.g1(zVar.h2);
                                int e12 = zVar.e1();
                                if (g12 != null) {
                                    aVar.a.setLoading(true);
                                    int i34 = zVar.b2;
                                    int i35 = yg.u.w;
                                    boolean z13 = i34 == 1;
                                    bi.ea y10 = bi.ea.y(zVar.a, false);
                                    int l11 = wg.r.l(zVar.e2);
                                    boolean z14 = zVar.p2;
                                    boolean z15 = zVar.o2;
                                    String str3 = zVar.n2;
                                    org.telegram.ui.Wallet.t1 t1Var = new org.telegram.ui.Wallet.t1(5, zVar, g12);
                                    int i36 = y10.a;
                                    if (!org.telegram.messenger.qp.s1(i36).j7) {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z13;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z14;
                                        Activity activity = W;
                                        tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                        org.telegram.messenger.qp.s1(i36);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.qp.l1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i37 = 0;
                                            while (i37 < size8) {
                                                Object obj11 = arrayList2.get(i37);
                                                i37++;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                org.telegram.messenger.qp.s1(i36);
                                                arrayList7.add(org.telegram.messenger.qp.k1((TLObject) obj11));
                                            }
                                        }
                                        int size9 = arrayList.size();
                                        int i38 = 0;
                                        while (i38 < size9) {
                                            Object obj12 = arrayList.get(i38);
                                            i38++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z15) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        org.telegram.messenger.gz.C(i36);
                                        tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.gz.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l11;
                                        tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = e12;
                                        if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                            f5.a aVar3 = new f5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = str;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new a1.d(y10, t1Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
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
                                            ConnectionsManager.getInstance(i36).sendRequest(tL_payments_getPaymentForm2, new bi.f2(y10, t1Var, tL_inputInvoiceStars, 3));
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            bi.ea.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            bi.ea.c0(W, null);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        sn snVar = new sn(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, prepaidGiveaway, tL_prepaidStarsGiveaway, zVar);
                        org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String M04 = org.telegram.messenger.id.M0(2131753191, null);
                            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                            u1Var4.R = M04;
                            u1Var4.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131753192, null));
                            alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131744915, null), new u5.e(snVar, 6));
                            alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), new v0.j(18));
                            alertDialog$Builder4.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ rq(wg.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = 2;
        this.c = zVar;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = f2Var;
    }
}
