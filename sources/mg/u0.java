package mg;

import ag.a3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.ap;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.qz;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import rh.e6;
import xh.m2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        String str;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                w0 w0Var = (w0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                k2 k2Var = (k2) obj;
                ArrayList arrayList = w0Var.W1;
                ArrayList arrayList2 = w0Var.U1;
                TLRPC.Chat chat = w0Var.T1;
                ArrayList arrayList3 = w0Var.V1;
                ArrayList arrayList4 = w0Var.X1;
                og.a aVar = w0Var.i2;
                if (!aVar.a.Q) {
                    int i12 = 16;
                    if (!w0Var.i1()) {
                        int i13 = w0Var.Z1;
                        int i14 = og.e.w;
                        int i15 = 1;
                        int i16 = 4;
                        if (i13 != 3) {
                            int i17 = 2;
                            int i18 = 13;
                            if (w0Var.a2 == 1) {
                                ArrayList b10 = k0.b(arrayList3.size(), arrayList4);
                                for (int i19 = 0; i19 < b10.size(); i19++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i19);
                                    if (tL_premiumGiftCodeOption.months == w0Var.d2 && arrayList3.size() > 0) {
                                        if (k0.h()) {
                                            Context context = w0Var.getContext();
                                            p6 p6Var = w0Var.I0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i20 = 0;
                                                while (i20 < size) {
                                                    Object obj4 = arrayList4.get(i20);
                                                    i20++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i21 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                                                String L0 = cd.L0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                                x1Var.R = L0;
                                                x1Var.T = org.telegram.messenger.i0.W2(cd.G(i21, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder.k(cd.L0(2131747847, "OK"), new m4.v0(i18));
                                                alertDialog$Builder.p();
                                                break;
                                            }
                                        }
                                        aVar.b(true);
                                        k0.k(arrayList3, tL_premiumGiftCodeOption, w0Var.T1, null, k2Var, new o0(w0Var, 0), new o0(w0Var, 1));
                                        break;
                                    }
                                }
                                break;
                            } else {
                                ArrayList b11 = k0.b(w0Var.e1(), arrayList4);
                                for (int i22 = 0; i22 < b11.size(); i22++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i22);
                                    if (tL_premiumGiftCodeOption3.months == w0Var.d2) {
                                        if (k0.h()) {
                                            List list = w0Var.Q1;
                                            Context context2 = w0Var.getContext();
                                            p6 p6Var2 = w0Var.I0;
                                            o0 o0Var = new o0(w0Var, i17);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i23 = 0;
                                                while (i23 < size2) {
                                                    Object obj5 = arrayList4.get(i23);
                                                    i23++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i24 = 0;
                                                while (i24 < size3) {
                                                    Object obj6 = arrayList6.get(i24);
                                                    i24++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i25 = tL_premiumGiftCodeOption3.users;
                                                    int i26 = tL_premiumGiftCodeOption6.users;
                                                    if (i25 > i26 && i26 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = cd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i27 = tL_premiumGiftCodeOption3.users;
                                                int i28 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, p6Var2);
                                                String L02 = cd.L0(2131753302, "BoostingReduceQuantity");
                                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                                x1Var2.R = L02;
                                                x1Var2.T = org.telegram.messenger.i0.W2(cd.G(i27, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i28)));
                                                alertDialog$Builder2.k(cd.L0(2131746356, "Reduce"), new ag.m(26, o0Var, tL_premiumGiftCodeOption5));
                                                alertDialog$Builder2.h(cd.L0(2131752589, "Cancel"), new m4.v0(13));
                                                alertDialog$Builder2.p();
                                                break;
                                            }
                                        }
                                        int i29 = w0Var.b2;
                                        int i30 = og.w.w;
                                        boolean z10 = i29 == 1;
                                        int l4 = k0.l(w0Var.e2);
                                        aVar.b(true);
                                        boolean z11 = w0Var.p2;
                                        boolean z12 = w0Var.o2;
                                        String str2 = w0Var.n2;
                                        o0 o0Var2 = new o0(w0Var, 3);
                                        o0 o0Var3 = new o0(w0Var, i16);
                                        if (k0.h()) {
                                            vp r12 = vp.r1(d20.s0);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = l4;
                                            int i31 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i31 | 6;
                                            if (z12) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i31 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i32 = 0;
                                            while (i32 < size4) {
                                                Object obj7 = arrayList2.get(i32);
                                                i32++;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = r12.i1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i33 = 0;
                                            while (i33 < size5) {
                                                Object obj8 = arrayList.get(i33);
                                                i33++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            c5.a aVar2 = new c5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = tL_premiumGiftCodeOption3.store_product;
                                            org.telegram.messenger.u1.i().o(Arrays.asList(aVar2.a()), new y(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, o0Var3, o0Var2, k2Var, 1));
                                            break;
                                        } else {
                                            vp r13 = vp.r1(d20.s0);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(d20.s0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z11;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = l4;
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
                                                    i10 = i36;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(r13.i1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i10 = i36;
                                                }
                                                i35 = i10;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = r13.i1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = r13.i1(-chat.id);
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
                                            JSONObject u10 = m2.u(k2Var.getResourceProvider(), false);
                                            if (u10 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u10.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new z(o0Var3, r13, tL_inputInvoicePremiumGiftCode, k2Var, o0Var2, 0));
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = org.telegram.messenger.i0.W(w0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.I1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption g12 = w0Var.g1(w0Var.h2);
                                int e12 = w0Var.e1();
                                if (g12 != null) {
                                    aVar.a.setLoading(true);
                                    int i38 = w0Var.b2;
                                    int i39 = og.w.w;
                                    boolean z13 = i38 == 1;
                                    e6 y3 = e6.y(w0Var.a, false);
                                    int l10 = k0.l(w0Var.e2);
                                    boolean z14 = w0Var.p2;
                                    boolean z15 = w0Var.o2;
                                    String str3 = w0Var.n2;
                                    ih.s sVar = new ih.s(i15, w0Var, g12);
                                    int i40 = y3.a;
                                    if (vp.r1(i40).k7) {
                                        k2 Q = LaunchActivity.Q();
                                        if (Q != null && Q.getContext() != null) {
                                            e6.c0(Q.getContext(), Q.getResourceProvider());
                                            break;
                                        } else {
                                            e6.c0(W, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z13;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z14;
                                        Activity activity = W;
                                        tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                        vp.r1(i40);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = vp.k1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i41 = 0;
                                            while (i41 < size8) {
                                                Object obj11 = arrayList2.get(i41);
                                                i41++;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                vp.r1(i40);
                                                arrayList7.add(vp.j1((TLObject) obj11));
                                            }
                                        }
                                        int size9 = arrayList.size();
                                        int i42 = 0;
                                        while (i42 < size9) {
                                            Object obj12 = arrayList.get(i42);
                                            i42++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z15) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        qz.C(i40);
                                        tL_inputStorePaymentStarsGiveaway.random_id = qz.E();
                                        tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                        tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = e12;
                                        if (!v2.b() && org.telegram.messenger.u1.i().k() && (str = g12.store_product) != null) {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = str;
                                            org.telegram.messenger.u1.i().o(Arrays.asList(aVar3.a()), new a1.d(y3, sVar, tL_inputStorePaymentStarsGiveaway, activity, 20));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u11 = m2.u(e6.I(), false);
                                            if (u11 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u11.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i40).sendRequest(tL_payments_getPaymentForm2, new ag.p0(y3, sVar, tL_inputInvoiceStars, 21));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        n0 n0Var = new n0(this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, w0Var, prepaidGiveaway, tL_prepaidStarsGiveaway);
                        k2 Q2 = LaunchActivity.Q();
                        if (Q2 != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, Q2.getContext(), Q2.getResourceProvider());
                            String L03 = cd.L0(2131753191, null);
                            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                            x1Var3.R = L03;
                            x1Var3.T = org.telegram.messenger.i0.W2(cd.L0(2131753192, null));
                            alertDialog$Builder3.k(cd.L0(2131744933, null), new ig.c0(n0Var, 29));
                            alertDialog$Builder3.h(cd.L0(2131752589, null), new m4.v0(i12));
                            alertDialog$Builder3.p();
                            break;
                        }
                    }
                }
                break;
            case 1:
                cr crVar = (cr) obj3;
                vh.d dVar = (vh.d) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, (Context) obj2, crVar.I0);
                String L04 = cd.L0(2131748808, null);
                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
                x1Var4.R = L04;
                x1Var4.T = cd.L0(2131748809, null);
                alertDialog$Builder4.k(cd.L0(2131746041, null), new org.telegram.messenger.voip.d0(crVar, dVar, this.b, 2));
                alertDialog$Builder4.h(cd.L0(2131752589, null), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
                break;
            default:
                ay ayVar = (ay) obj3;
                ayVar.finishPreviewFragment();
                org.telegram.messenger.i0.h3(new a3(ayVar, (ap) obj2, (TLRPC.Dialog) obj, this.b, 7), 100L);
                break;
        }
    }

    public /* synthetic */ u0(w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, k2 k2Var) {
        this.a = 0;
        this.c = w0Var;
        this.d = prepaidGiveaway;
        this.b = j10;
        this.e = k2Var;
    }
}
