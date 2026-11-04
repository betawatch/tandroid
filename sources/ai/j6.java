package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ci.e9;
import ci.hb;
import ci.ib;
import ci.mb;
import ci.nb;
import ci.wb;
import ei.i7;
import ei.r9;
import gi.x9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dv;
import org.telegram.ui.ew;
import org.telegram.ui.lp0;
import org.telegram.ui.mv;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        r31 G;
        TLRPC.Document document;
        bi.h0 h0Var;
        r31 G2;
        r31 G3;
        r31 G4;
        TLRPC.Document document2;
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11 = this.a;
        int i12 = 4;
        TLRPC.BotInlineResult botInlineResult = null;
        r12 = null;
        Object O = null;
        r14 = 0;
        int i13 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                m6 m6Var = (m6) obj;
                gi.d dVar = m6Var.V1;
                HashSet hashSet = m6Var.S1;
                f41 f41Var = m6Var.Z1;
                if (f41Var != null && (G = f41Var.G(i3 - 1)) != null) {
                    Object obj2 = G.G;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i14 = savedStarGift.msg_id;
                        long j10 = i14 == 0 ? savedStarGift.saved_id : i14;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((q2) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((q2) view).c(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 1:
                bi.g0 g0Var = (bi.g0) obj;
                if ((view instanceof bi.l) && (document = ((bi.l) view).e) != null) {
                    long j11 = document.id;
                    if (j11 != 0) {
                        bi.j0 j0Var = g0Var.a;
                        if (j0Var.d != null) {
                            if (j0Var.getUserConfig().q() || ((h0Var = j0Var.h) != null && h0Var.I.contains(Long.valueOf(j11)))) {
                                bi.a1 a1Var = j0Var.d;
                                int i15 = a1Var.b;
                                String p10 = a1.g.p(j11, "c:");
                                HashMap hashMap = a1Var.K;
                                if (!hashMap.containsKey(p10)) {
                                    org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(i15, 2, document);
                                    l10.a(a1Var);
                                    hashMap.put(p10, l10);
                                }
                                if (p10 != null && !p10.startsWith("c:")) {
                                    p10 = p10.replace("️", "");
                                }
                                ArrayList arrayList = a1Var.J;
                                int indexOf = arrayList.indexOf(p10);
                                if (indexOf >= 0) {
                                    arrayList.remove(indexOf);
                                } else {
                                    if (arrayList.size() >= 6) {
                                        arrayList.remove(0);
                                    }
                                    arrayList.add(p10);
                                }
                                a1Var.c();
                                a1Var.i0();
                                bi.h0 h0Var2 = j0Var.h;
                                if (h0Var2 != null) {
                                    ArrayList a10 = h0Var2.a();
                                    a10.remove(Long.valueOf(j11));
                                    a10.add(0, Long.valueOf(j11));
                                    while (a10.size() > 21) {
                                        a1.g.y(1, a10);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i16 = 0; i16 < a10.size(); i16++) {
                                        if (i16 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a10.get(i16));
                                    }
                                    hp.s1(h0Var2.a).e7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    h0Var2.K = true;
                                    break;
                                }
                            } else {
                                bi.a1 a1Var2 = j0Var.d;
                                a1Var2.getClass();
                                a1Var2.d1(0, bd.M0(2131746483, null), bd.M0(2131746481, null));
                                a1Var2.i0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                wb.C0((wb) obj, i3);
                break;
            case 3:
                hb hbVar = (hb) obj;
                f41 f41Var2 = hbVar.U1;
                if (f41Var2 != null && (G2 = f41Var2.G(i3 - 1)) != null) {
                    f41 f41Var3 = hbVar.U1;
                    if (G2.d == -1) {
                        hbVar.V1 = !hbVar.V1;
                        f41Var3.O(true);
                        hbVar.l1.w0(0, org.telegram.messenger.g0.L(200.0f), xq.g);
                        break;
                    } else if (G2.H(ib.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(hbVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.K1;
                        }
                        if (W != null) {
                            long j12 = hbVar.S1.id;
                            e9 y9 = e9.y(hbVar.a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            d6 d6Var = new d6(hbVar, G2, j12, 1);
                            int i17 = y9.a;
                            if (hp.s1(i17).j7) {
                                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    e9.c0(Q.getContext(), Q.getResourceProvider());
                                    break;
                                } else {
                                    e9.c0(W, null);
                                    break;
                                }
                            } else if (org.telegram.messenger.r2.b() || !org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.user_id = hp.s1(i17).o1(j12);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ii.a3.u(e9.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new r6(y9, d6Var, tL_inputInvoiceStars, 5));
                                break;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.user_id = hp.s1(i17).o1(j12);
                                e5.a aVar = new e5.a();
                                aVar.c = "inapp";
                                aVar.b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new ci.r6(y9, d6Var, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, W));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                mb mbVar = (mb) obj;
                f41 f41Var4 = mbVar.X1;
                if (f41Var4 != null && (G3 = f41Var4.G(i3 - 1)) != null) {
                    f41 f41Var5 = mbVar.X1;
                    if (G3.d == -1) {
                        mbVar.Y1 = !mbVar.Y1;
                        f41Var5.O(true);
                        break;
                    } else if (G3.H(ib.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(mbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.K1;
                        }
                        if (W2 != null) {
                            e9.y(mbVar.a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new q4(3, mbVar, G3), mbVar.V1);
                            break;
                        }
                    }
                }
                break;
            case 5:
                nb nbVar = (nb) obj;
                f41 f41Var6 = nbVar.R1;
                if (f41Var6 != null && (G4 = f41Var6.G(i3 - 1)) != null) {
                    f41 f41Var7 = nbVar.R1;
                    if (G4.d == -1) {
                        nbVar.S1 = !nbVar.S1;
                        f41Var7.O(true);
                        nbVar.l1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        break;
                    } else if (G4.H(ib.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(nbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.K1;
                        }
                        if (W3 != null) {
                            e9.y(nbVar.a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new q4(i12, nbVar, G4), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((mv) obj).i((ei.q) view, false);
                break;
            case 7:
                fi.m mVar = (fi.m) obj;
                tp0 tp0Var = mVar.a0;
                org.telegram.ui.ActionBar.d2 d2Var = tp0Var.a;
                if (view instanceof n7) {
                    zi messageObject = ((n7) view).getMessageObject();
                    if (tp0Var.H.F1) {
                        if (tp0Var.c(messageObject)) {
                            tp0Var.g(messageObject);
                            break;
                        } else {
                            tp0Var.e(messageObject);
                            break;
                        }
                    } else {
                        r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
                        Context context = mVar.getContext();
                        int f12 = messageObject.f1();
                        ei.k6 k6Var = mVar.a;
                        i7 a11 = i7.a(mVar.f);
                        if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).s1) {
                            i13 = org.telegram.messenger.g0.L(68.0f);
                        }
                        a11.s += i13;
                        orCreateStoryViewer.Q(context, f12, k6Var, a11);
                        break;
                    }
                }
                break;
            case 8:
                u10 u10Var = ((gi.y) obj).c;
                if (u10Var != null) {
                    u10Var.a((gi.t) gi.t.a().get(i3));
                    break;
                }
                break;
            case 9:
                gi.t1 t1Var = (gi.t1) obj;
                gi.i2 i2Var = t1Var.r;
                Object F = t1Var.c.F(i3);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                q10 q10Var = i2Var.w1;
                if (q10Var != null) {
                    q10Var.i(botInlineResult, document2, Boolean.TRUE);
                }
                i2Var.dismiss();
                break;
            case 10:
                gi.y1 y1Var = (gi.y1) obj;
                gi.i2 i2Var2 = y1Var.s;
                gi.x1 x1Var = y1Var.c;
                if (i3 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = x1Var.s;
                        ArrayList arrayList3 = x1Var.w;
                        TLRPC.Document document3 = i3 < arrayList2.size() ? (TLRPC.Document) x1Var.s.get(i3) : null;
                        if (document3 == i2Var2.m1) {
                            lg.g gVar = i2Var2.x1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            i2Var2.dismiss();
                            break;
                        } else {
                            long longValue = i3 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i3)).longValue();
                            if (document3 == null && (view instanceof gi.l1) && (g5Var = ((gi.l1) view).d) != null) {
                                document3 = g5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = org.telegram.ui.Components.g5.e(i2Var2.a, longValue);
                            }
                            if (document3 != null) {
                                q10 q10Var2 = i2Var2.w1;
                                if (q10Var2 != null) {
                                    q10Var2.i(x1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                i2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                x9 x9Var = (x9) obj;
                tg.b0 b0Var = (tg.b0) tg.b0.c().get(i3);
                x9Var.V0.setTypeface(b0Var.a);
                tg.k0 e10 = tg.k0.e(x9Var.p1);
                String str = b0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                ug.j jVar = x9Var.t0;
                if (jVar instanceof ug.l2) {
                    ((ug.l2) jVar).setTypeface(b0Var);
                }
                x9Var.M0(false);
                break;
            case 12:
                hi.g.A0((hi.g) obj, i3);
                break;
            case 13:
                f41 f41Var8 = ((hi.f) obj).V1;
                if (f41Var8 != null) {
                    f41Var8.G(i3 - 1);
                    break;
                }
                break;
            case 14:
                ii.k.D0((ii.k) obj, i3);
                break;
            case 15:
                kg.e0 e0Var = (kg.e0) obj;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.F) {
                        ew ewVar = e0Var.V;
                        if (ewVar != null) {
                            ewVar.a.Z4(o4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                ew ewVar2 = e0Var.V;
                if (ewVar2 != null) {
                    uw uwVar = ewVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!uwVar.m2) {
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.m5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        uwVar.V3();
                        if (org.telegram.messenger.g0.Q1() && uwVar.f0 != null) {
                            int i18 = 0;
                            while (true) {
                                tw[] twVarArr = uwVar.f0;
                                if (i18 < twVarArr.length) {
                                    dv dvVar = twVarArr[i18].d;
                                    uwVar.q2.a = longValue2;
                                    dvVar.s = longValue2;
                                    i18++;
                                } else {
                                    int i19 = hp.C8;
                                    uwVar.u5(512, true);
                                }
                            }
                        }
                        if (uwVar.o2 != null) {
                            if (uwVar.getMessagesController().E(bundle, uwVar, null, null)) {
                                uwVar.getNotificationCenter().k(4, new Object[0]);
                                uwVar.presentFragment(new wm(bundle));
                                break;
                            }
                        } else if (uwVar.getMessagesController().E(bundle, uwVar, null, null)) {
                            uwVar.presentFragment(new wm(bundle));
                            break;
                        }
                    } else if (uwVar.v5(longValue2)) {
                        if (uwVar.J2.isEmpty()) {
                            uwVar.a4(longValue2, 0L, true, null);
                            break;
                        } else {
                            uwVar.b4(longValue2, uwVar.s3(longValue2, null));
                            uwVar.o5();
                            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            kVar.l(true);
                            break;
                        }
                    }
                }
                break;
            case 16:
                lg.h0 h0Var3 = (lg.h0) obj;
                lg.e0 e0Var2 = h0Var3.y;
                bi biVar = h0Var3.b;
                u4.h0 adapter = h0Var3.s.getAdapter();
                lg.f0 f0Var = h0Var3.E;
                if (adapter == f0Var) {
                    ArrayList arrayList4 = f0Var.d;
                    int i20 = i3 - 1;
                    if (i20 >= 0 && i20 < arrayList4.size()) {
                        O = arrayList4.get(i20);
                    }
                } else {
                    int S = e0Var2.S(i3);
                    int Q2 = e0Var2.Q(i3);
                    if (Q2 >= 0 && S >= 0) {
                        O = e0Var2.O(S, Q2);
                    }
                }
                if (O instanceof lg.t1) {
                    if (h10.i(biVar.E3).q()) {
                        lg.t1 t1Var2 = (lg.t1) O;
                        org.telegram.ui.Components.t4.Z(biVar.E3, t1Var2.a(), biVar.b1(), new o1(28, h0Var3, t1Var2));
                        break;
                    } else if (biVar.X1 != null) {
                        new vg.v0(biVar.X1, h0Var3.getContext(), biVar.E3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 17:
                lg.j0 j0Var2 = (lg.j0) obj;
                r31 G5 = j0Var2.X1.G(i3 - 1);
                if (G5 != null) {
                    lg.b0 b0Var2 = j0Var2.S1;
                    if (!b0Var2.h(G5)) {
                        int i21 = G5.d;
                        int i22 = lg.j0.d2;
                        if (i21 == -1) {
                            j0Var2.Y1 = true;
                            b0Var2.h = true;
                            j0Var2.X1.O(true);
                            j0Var2.d1(true);
                            break;
                        } else {
                            int i23 = lg.j0.e2;
                            if (i21 == -2) {
                                j0Var2.Y1 = false;
                                b0Var2.h = false;
                                j0Var2.X1.O(true);
                                j0Var2.d1(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 18:
                li.a aVar2 = (li.a) obj;
                int i24 = aVar2.Q1.G(i3 - 1).d;
                if (i24 == 151) {
                    aVar2.e1(false);
                    break;
                } else if (i24 == 150) {
                    aVar2.e1(true);
                    break;
                }
                break;
            case 19:
                qg.h hVar = (qg.h) obj;
                Runnable runnable = ((qg.a) hVar.F.get(i3)).c;
                if (runnable != null) {
                    runnable.run();
                    hVar.c(false);
                    break;
                }
                break;
            case 20:
                lp0 lp0Var = (lp0) obj;
                tg.b0 b0Var3 = (tg.b0) tg.b0.c().get(i3);
                lp0Var.e1.setTypeface(b0Var3.a);
                tg.k0 e11 = tg.k0.e(lp0Var.z1);
                String str2 = b0Var3.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                ug.j jVar2 = lp0Var.C0;
                if (jVar2 instanceof ug.l2) {
                    ((ug.l2) jVar2).setTypeface(b0Var3);
                }
                lp0Var.z0(false);
                break;
            case 21:
                ug.x0 x0Var = (ug.x0) obj;
                x0Var.j3.accept(Integer.valueOf(x0Var.i3.b(i3)));
                tg.k0 k0Var = x0Var.i3;
                k0Var.c.put(Integer.valueOf(k0Var.f), Integer.valueOf(k0Var.b(i3)));
                k0Var.e = true;
                break;
            case 22:
                vg.i0 i0Var = (vg.i0) obj;
                HashSet hashSet2 = i0Var.r2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.r.a(hashSet2.contains(currentChannel), true);
                    i0Var.E1();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h4) {
                    if (i0Var.R1 || ((i10 = i0Var.a2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j13 = ((TLRPC.User) object).id;
                                int i25 = -i0Var.N2;
                                i0Var.N2 = i25;
                                org.telegram.messenger.g0.G3(i25, h4Var, null);
                                org.telegram.messenger.p2.E.a();
                                String k10 = j13 >= 0 ? l10.k(hp.s1(i0Var.a).a2(Long.valueOf(j13))) : "";
                                (hp.s1(i0Var.a).D3() ? new fc((FrameLayout) i0Var.b, i0Var.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743770, k10))) : new fc((FrameLayout) i0Var.b, i0Var.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743770, k10)), bd.M0(2131743769, null), new vg.v(i0Var, r14 ? 1 : 0))).j();
                                break;
                            }
                        } else {
                            if (hashSet2.contains(object)) {
                                hashSet2.remove(object);
                            } else {
                                hashSet2.add(object);
                            }
                            h4Var.c(hashSet2.contains(object), true);
                            i0Var.E1();
                            break;
                        }
                    }
                }
                break;
            case 23:
                vg.r0 r0Var = (vg.r0) obj;
                if (view != null) {
                    r0Var.z1(view, true);
                    r0Var.l3 = false;
                    r0Var.w0(0, view.getTop() - ((r0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    break;
                }
                break;
            case 24:
                ((s80) obj).h(view);
                break;
            default:
                ((zh.k) obj).h(view);
                break;
        }
    }
}
