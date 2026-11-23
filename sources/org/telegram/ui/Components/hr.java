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
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hr(Object obj, Object obj2, Object obj3, long j3, int i7) {
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
        int i11;
        int i12;
        String str;
        int i13 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
                jr jrVar = (jr) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, jrVar.J0);
                String N0 = org.telegram.messenger.hd.N0(2131748605, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131748606, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new di.h(jrVar, (hi.e) obj, this.b, 6));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                cxVar.finishPreviewFragment();
                org.telegram.messenger.g0.h3(new di.j2(cxVar, (org.telegram.messenger.so) obj2, (TLRPC.Dialog) obj, this.b, 18), 100L);
                break;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                ArrayList arrayList = a0Var.a2;
                ArrayList arrayList2 = a0Var.Y1;
                TLRPC.Chat chat = a0Var.X1;
                ArrayList arrayList3 = a0Var.Z1;
                ArrayList arrayList4 = a0Var.b2;
                yg.a aVar = a0Var.m2;
                if (!aVar.a.R) {
                    if (!a0Var.j1()) {
                        int i14 = a0Var.d2;
                        int i15 = yg.d.w;
                        int i16 = 4;
                        if (i14 != 3) {
                            int i17 = 2;
                            if (a0Var.e2 == 1) {
                                ArrayList b10 = wg.s.b(arrayList3.size(), arrayList4);
                                int i18 = 0;
                                while (i18 < b10.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                                    if (tL_premiumGiftCodeOption.months == a0Var.h2 && arrayList3.size() > 0) {
                                        if (wg.s.h()) {
                                            Context context = a0Var.getContext();
                                            org.telegram.ui.ActionBar.h6 h6Var = a0Var.J0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i19 = 0;
                                                while (i19 < size) {
                                                    Object obj4 = arrayList4.get(i19);
                                                    i19++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i20 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, h6Var);
                                                String N02 = org.telegram.messenger.hd.N0(2131753299, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                                t1Var2.S = N02;
                                                t1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i20, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, "OK"), new ug.x(17));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        wg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.X1, null, g2Var, new wg.v(a0Var, 0), new wg.v(a0Var, 1));
                                        break;
                                    } else {
                                        i18++;
                                        arrayList3 = arrayList3;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = wg.s.b(a0Var.f1(), arrayList4);
                                for (int i21 = 0; i21 < b11.size(); i21++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                                    if (tL_premiumGiftCodeOption3.months == a0Var.h2) {
                                        if (wg.s.h()) {
                                            List list = a0Var.U1;
                                            Context context2 = a0Var.getContext();
                                            org.telegram.ui.ActionBar.h6 h6Var2 = a0Var.J0;
                                            wg.v vVar = new wg.v(a0Var, i17);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size2) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i23 = 0;
                                                while (i23 < size3) {
                                                    Object obj6 = arrayList6.get(i23);
                                                    i23++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i24 = tL_premiumGiftCodeOption3.users;
                                                    int i25 = tL_premiumGiftCodeOption6.users;
                                                    if (i24 > i25 && i25 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = org.telegram.messenger.hd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i26 = tL_premiumGiftCodeOption3.users;
                                                int i27 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context2, h6Var2);
                                                String N03 = org.telegram.messenger.hd.N0(2131753299, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                                                t1Var3.S = N03;
                                                t1Var3.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i26, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i27)));
                                                alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131746145, "Reduce"), new wc1(22, vVar, tL_premiumGiftCodeOption5));
                                                alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), new ug.x(17));
                                                alertDialog$Builder3.p();
                                                break;
                                            }
                                        }
                                        int i28 = a0Var.f2;
                                        int i29 = yg.u.w;
                                        boolean z10 = i28 == 1;
                                        int l10 = wg.s.l(a0Var.i2);
                                        aVar.b(true);
                                        boolean z11 = a0Var.t2;
                                        boolean z12 = a0Var.s2;
                                        String str2 = a0Var.r2;
                                        wg.v vVar2 = new wg.v(a0Var, 3);
                                        wg.v vVar3 = new wg.v(a0Var, i16);
                                        if (wg.s.h()) {
                                            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.k10.t0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                                            int i30 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i30 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i30 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i31 = 0;
                                            while (i31 < size4) {
                                                Object obj7 = arrayList2.get(i31);
                                                int i32 = i31 + 1;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    i7 = size4;
                                                    i10 = i32;
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject).id));
                                                } else {
                                                    i7 = size4;
                                                    i10 = i32;
                                                }
                                                size4 = i7;
                                                i31 = i10;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = u12.l1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i33 = 0;
                                            while (i33 < size5) {
                                                Object obj8 = arrayList.get(i33);
                                                i33++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            f5.a aVar2 = new f5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = tL_premiumGiftCodeOption3.store_product;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new c1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, g2Var, 3));
                                            break;
                                        } else {
                                            org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.k10.t0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                                            int i34 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size6 = arrayList2.size();
                                            int i35 = 0;
                                            while (i35 < size6) {
                                                Object obj9 = arrayList2.get(i35);
                                                int i36 = i35 + 1;
                                                TLObject tLObject2 = (TLObject) obj9;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    i11 = size6;
                                                    i12 = i36;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(u13.l1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i11 = size6;
                                                    i12 = i36;
                                                }
                                                size6 = i11;
                                                i35 = i12;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = u13.l1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = u13.l1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                                            tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                                            int size7 = arrayList.size();
                                            int i37 = 0;
                                            while (i37 < size7) {
                                                Object obj10 = arrayList.get(i37);
                                                i37++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                            JSONObject u10 = ki.s2.u(g2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new di.m7(vVar3, u13, tL_inputInvoicePremiumGiftCode, g2Var, vVar2, 13));
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                Activity activity = W;
                                TL_stars.TL_starsGiveawayOption h12 = a0Var.h1(a0Var.l2);
                                int f12 = a0Var.f1();
                                if (h12 != null) {
                                    aVar.a.setLoading(true);
                                    int i38 = a0Var.f2;
                                    int i39 = yg.u.w;
                                    boolean z13 = i38 == 1;
                                    di.y8 y10 = di.y8.y(a0Var.a, false);
                                    int l11 = wg.s.l(a0Var.i2);
                                    boolean z14 = a0Var.t2;
                                    boolean z15 = a0Var.s2;
                                    String str3 = a0Var.r2;
                                    org.telegram.ui.Wallet.e0 e0Var = new org.telegram.ui.Wallet.e0(9, a0Var, h12);
                                    int i40 = y10.a;
                                    if (org.telegram.messenger.np.u1(i40).m7) {
                                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            di.y8.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            di.y8.c0(activity, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z13;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z14;
                                        tL_inputStorePaymentStarsGiveaway.stars = h12.stars;
                                        org.telegram.messenger.np.u1(i40);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.np.n1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i41 = 0;
                                            while (i41 < size8) {
                                                Object obj11 = arrayList2.get(i41);
                                                i41++;
                                                int i42 = size8;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                org.telegram.messenger.np.u1(i40);
                                                arrayList7.add(org.telegram.messenger.np.m1((TLObject) obj11));
                                                size8 = i42;
                                            }
                                        }
                                        int size9 = arrayList.size();
                                        int i43 = 0;
                                        while (i43 < size9) {
                                            Object obj12 = arrayList.get(i43);
                                            i43++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z15) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        org.telegram.messenger.az.C(i40);
                                        tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.az.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l11;
                                        tL_inputStorePaymentStarsGiveaway.currency = h12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = h12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = f12;
                                        if (!org.telegram.messenger.s2.b() && org.telegram.messenger.r1.i().k() && (str = h12.store_product) != null) {
                                            f5.a aVar3 = new f5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = str;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new a1.d(y10, e0Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u11 = ki.s2.u(di.y8.I(), false);
                                            if (u11 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u11.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i40).sendRequest(tL_payments_getPaymentForm2, new bi.q1(y10, e0Var, tL_inputInvoiceStars, 6));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        ko koVar = new ko(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String N04 = org.telegram.messenger.hd.N0(2131753188, null);
                            org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                            t1Var4.S = N04;
                            t1Var4.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131753189, null));
                            alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131744672, null), new tg.o1(koVar, 12));
                            alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), new ug.x(20));
                            alertDialog$Builder4.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ hr(wg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = 2;
        this.c = a0Var;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = g2Var;
    }
}
