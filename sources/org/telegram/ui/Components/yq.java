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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yq(Object obj, Object obj2, Object obj3, long j3, int i7) {
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
                ar arVar = (ar) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, arVar.J0);
                String M0 = org.telegram.messenger.hd.M0(2131748798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new di.h(arVar, (hi.d) obj, this.b, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                ywVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new di.f2(ywVar, (org.telegram.messenger.so) obj2, (TLRPC.Dialog) obj, this.b, 19), 100L);
                break;
            default:
                wg.y yVar = (wg.y) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                ArrayList arrayList = yVar.a2;
                ArrayList arrayList2 = yVar.Y1;
                TLRPC.Chat chat = yVar.X1;
                ArrayList arrayList3 = yVar.Z1;
                ArrayList arrayList4 = yVar.b2;
                yg.a aVar = yVar.m2;
                if (!aVar.a.R) {
                    if (!yVar.i1()) {
                        int i14 = yVar.d2;
                        int i15 = yg.d.w;
                        char c10 = 3;
                        int i16 = 2;
                        if (i14 != 3) {
                            int i17 = 16;
                            if (yVar.e2 != 1) {
                                ArrayList b10 = wg.q.b(yVar.e1(), arrayList4);
                                int i18 = 0;
                                while (i18 < b10.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                                    if (tL_premiumGiftCodeOption.months == yVar.h2) {
                                        if (wg.q.h()) {
                                            List list = yVar.U1;
                                            Context context = yVar.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var = yVar.J0;
                                            wg.t tVar = new wg.t(yVar, i16);
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i19 = 0;
                                                while (i19 < size) {
                                                    Object obj4 = arrayList4.get(i19);
                                                    i19++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption2.users))) {
                                                        arrayList5.add(tL_premiumGiftCodeOption2);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) arrayList5.get(0);
                                                int size2 = arrayList5.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj5 = arrayList5.get(i20);
                                                    i20++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    int i21 = tL_premiumGiftCodeOption.users;
                                                    int i22 = tL_premiumGiftCodeOption4.users;
                                                    if (i21 > i22 && i22 > tL_premiumGiftCodeOption3.users) {
                                                        tL_premiumGiftCodeOption3 = tL_premiumGiftCodeOption4;
                                                    }
                                                }
                                                String G = org.telegram.messenger.hd.G(tL_premiumGiftCodeOption3.months, "GiftMonths", new Object[0]);
                                                int i23 = tL_premiumGiftCodeOption.users;
                                                int i24 = tL_premiumGiftCodeOption3.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, e6Var);
                                                String M02 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                                t1Var2.S = M02;
                                                t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i23, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i24)));
                                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746341, "Reduce"), new org.telegram.ui.Wallet.k8(24, tVar, tL_premiumGiftCodeOption3));
                                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new ug.x(16));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        int i25 = yVar.f2;
                                        int i26 = yg.u.w;
                                        boolean z10 = i25 == 1;
                                        int l10 = wg.q.l(yVar.i2);
                                        aVar.b(true);
                                        boolean z11 = yVar.t2;
                                        boolean z12 = yVar.s2;
                                        String str2 = yVar.r2;
                                        wg.t tVar2 = new wg.t(yVar, 3);
                                        wg.t tVar3 = new wg.t(yVar, 4);
                                        if (!wg.q.h()) {
                                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
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
                                            int size3 = arrayList2.size();
                                            int i28 = 0;
                                            while (i28 < size3) {
                                                Object obj6 = arrayList2.get(i28);
                                                int i29 = i28 + 1;
                                                TLObject tLObject = (TLObject) obj6;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    i11 = size3;
                                                    i12 = i29;
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).id));
                                                } else {
                                                    i11 = size3;
                                                    i12 = i29;
                                                }
                                                size3 = i11;
                                                i28 = i12;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption.currency;
                                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption.amount;
                                            int size4 = arrayList.size();
                                            int i30 = 0;
                                            while (i30 < size4) {
                                                Object obj7 = arrayList.get(i30);
                                                i30++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
                                            JSONObject u10 = ki.x2.u(e2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager.sendRequest(tL_payments_getPaymentForm, new di.k7(tVar3, s12, tL_inputInvoicePremiumGiftCode, e2Var, tVar2, 13));
                                            break;
                                        } else {
                                            org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                                            int i31 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i31 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i31 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size5 = arrayList2.size();
                                            int i32 = 0;
                                            while (i32 < size5) {
                                                Object obj8 = arrayList2.get(i32);
                                                int i33 = i32 + 1;
                                                TLObject tLObject2 = (TLObject) obj8;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    i7 = size5;
                                                    i10 = i33;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i7 = size5;
                                                    i10 = i33;
                                                }
                                                size5 = i7;
                                                i32 = i10;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.id);
                                            int size6 = arrayList.size();
                                            int i34 = 0;
                                            while (i34 < size6) {
                                                Object obj9 = arrayList.get(i34);
                                                i34++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                                            }
                                            f5.a aVar2 = new f5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = tL_premiumGiftCodeOption.store_product;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new p0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption, connectionsManager2, tVar3, tVar2, e2Var, 3));
                                            break;
                                        }
                                    } else {
                                        i18++;
                                        c10 = c10;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = wg.q.b(arrayList3.size(), arrayList4);
                                int i35 = 0;
                                while (i35 < b11.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i35);
                                    if (tL_premiumGiftCodeOption5.months == yVar.h2 && arrayList3.size() > 0) {
                                        if (wg.q.h()) {
                                            Context context2 = yVar.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var2 = yVar.J0;
                                            if (tL_premiumGiftCodeOption5.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size7 = arrayList4.size();
                                                int i36 = 0;
                                                while (i36 < size7) {
                                                    Object obj10 = arrayList4.get(i36);
                                                    i36++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj10;
                                                    if (tL_premiumGiftCodeOption6.months == tL_premiumGiftCodeOption5.months && tL_premiumGiftCodeOption6.store_product != null) {
                                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption6.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList6);
                                                int i37 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context2, e6Var2);
                                                String M03 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                                                t1Var3.S = M03;
                                                t1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i37, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new ug.x(i17));
                                                alertDialog$Builder3.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        wg.q.k(arrayList3, tL_premiumGiftCodeOption5, yVar.X1, null, e2Var, new wg.t(yVar, 0), new wg.t(yVar, 1));
                                        break;
                                    } else {
                                        i35++;
                                        arrayList3 = arrayList3;
                                        i17 = 16;
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.g0.W(yVar.getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption g12 = yVar.g1(yVar.l2);
                                int e12 = yVar.e1();
                                if (g12 != null) {
                                    aVar.a.setLoading(true);
                                    int i38 = yVar.f2;
                                    int i39 = yg.u.w;
                                    boolean z13 = i38 == 1;
                                    di.u8 y10 = di.u8.y(yVar.a, false);
                                    int i40 = 4;
                                    int l11 = wg.q.l(yVar.i2);
                                    boolean z14 = yVar.t2;
                                    boolean z15 = yVar.s2;
                                    String str3 = yVar.r2;
                                    org.telegram.ui.Wallet.t1 t1Var4 = new org.telegram.ui.Wallet.t1(6, yVar, g12);
                                    int i41 = y10.a;
                                    if (!org.telegram.messenger.np.s1(i41).k7) {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z13;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z14;
                                        Activity activity = W;
                                        tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                        org.telegram.messenger.np.s1(i41);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.np.l1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i42 = 0;
                                            while (i42 < size8) {
                                                Object obj11 = arrayList2.get(i42);
                                                i42++;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                org.telegram.messenger.np.s1(i41);
                                                arrayList7.add(org.telegram.messenger.np.k1((TLObject) obj11));
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
                                        org.telegram.messenger.ez.C(i41);
                                        tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.ez.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l11;
                                        tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = e12;
                                        if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                            f5.a aVar3 = new f5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = str;
                                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new a1.d(y10, t1Var4, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u11 = ki.x2.u(di.u8.I(), false);
                                            if (u11 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u11.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i41).sendRequest(tL_payments_getPaymentForm2, new bi.j6(y10, t1Var4, tL_inputInvoiceStars, i40));
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            di.u8.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            di.u8.c0(W, null);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        ao aoVar = new ao(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, prepaidGiveaway, tL_prepaidStarsGiveaway, yVar);
                        org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String M04 = org.telegram.messenger.hd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder4.a;
                            t1Var5.S = M04;
                            t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131753192, null));
                            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131744915, null), new tg.z1(aoVar, 10));
                            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), new ug.x(19));
                            alertDialog$Builder4.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ yq(wg.y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 2;
        this.c = yVar;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = e2Var;
    }
}
