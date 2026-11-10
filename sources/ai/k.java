package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.dd;
import bi.ea;
import bi.f2;
import bi.mc;
import bi.oc;
import bi.p5;
import bi.pc;
import bi.q7;
import bi.tc;
import bi.uc;
import di.i7;
import di.k6;
import di.q9;
import fi.k2;
import fi.t1;
import fi.x9;
import fi.y1;
import fi.z1;
import hi.a3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kg.s1;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.jv;
import org.telegram.ui.kw;
import org.telegram.ui.sv;
import org.telegram.ui.xp0;
import org.telegram.ui.yw;
import org.telegram.ui.zw;
import zh.o3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.Document document;
        q0 q0Var;
        x31 G;
        x31 G2;
        x31 G3;
        TLRPC.Document document2;
        h5 h5Var;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        x31 G4;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 2;
        TLRPC.BotInlineResult botInlineResult = null;
        r12 = null;
        Object O = null;
        int i14 = 0;
        r14 = 0;
        int i15 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                p0 p0Var = (p0) obj;
                if ((view instanceof q) && (document = ((q) view).e) != null) {
                    long j3 = document.id;
                    if (j3 != 0) {
                        s0 s0Var = p0Var.a;
                        if (s0Var.d != null) {
                            if (!s0Var.getUserConfig().q() && ((q0Var = s0Var.h) == null || !q0Var.H.contains(Long.valueOf(j3)))) {
                                l1 l1Var = s0Var.d;
                                l1Var.getClass();
                                l1Var.d1(0, id.M0(2131746475, null), id.M0(2131746473, null));
                                l1Var.i0();
                                break;
                            } else {
                                l1 l1Var2 = s0Var.d;
                                int i16 = l1Var2.b;
                                String o4 = a8.p0.o(j3, "c:");
                                HashMap hashMap = l1Var2.J;
                                if (!hashMap.containsKey(o4)) {
                                    h5 l10 = h5.l(i16, 2, document);
                                    l10.a(l1Var2);
                                    hashMap.put(o4, l10);
                                }
                                if (o4 != null && !o4.startsWith("c:")) {
                                    o4 = o4.replace("️", "");
                                }
                                ArrayList arrayList = l1Var2.I;
                                int indexOf = arrayList.indexOf(o4);
                                if (indexOf >= 0) {
                                    arrayList.remove(indexOf);
                                } else {
                                    if (arrayList.size() >= 6) {
                                        arrayList.remove(0);
                                    }
                                    arrayList.add(o4);
                                }
                                l1Var2.c();
                                l1Var2.i0();
                                q0 q0Var2 = s0Var.h;
                                if (q0Var2 != null) {
                                    ArrayList a10 = q0Var2.a();
                                    a10.remove(Long.valueOf(j3));
                                    a10.add(0, Long.valueOf(j3));
                                    while (a10.size() > 21) {
                                        a8.p0.z(1, a10);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i14 < a10.size()) {
                                        if (i14 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a10.get(i14));
                                        i14++;
                                    }
                                    qp.s1(q0Var2.a).e7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    q0Var2.J = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                dd.C0((dd) obj, i7);
                break;
            case 2:
                oc ocVar = (oc) obj;
                m41 m41Var = ocVar.W1;
                if (m41Var != null && (G = m41Var.G(i7 - 1)) != null) {
                    m41 m41Var2 = ocVar.W1;
                    if (G.d != -1) {
                        if (G.H(pc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                            Context W = org.telegram.messenger.g0.W(ocVar.getContext());
                            if (W == null) {
                                W = LaunchActivity.G1;
                            }
                            if (W != null) {
                                long j10 = ocVar.U1.id;
                                ea y10 = ea.y(ocVar.a, false);
                                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                                mc mcVar = new mc(ocVar, G, j10, 0);
                                int i17 = y10.a;
                                if (!qp.s1(i17).j7) {
                                    if (!r2.b() && r1.i().k()) {
                                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                        tL_inputStorePaymentStarsGift.user_id = qp.s1(i17).o1(j10);
                                        f5.a aVar = new f5.a();
                                        aVar.b = "inapp";
                                        aVar.a = tL_starsGiftOption.store_product;
                                        r1.i().o(Arrays.asList(aVar.a()), new q7(y10, mcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                        break;
                                    } else {
                                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                        tL_inputStorePaymentStarsGift2.user_id = qp.s1(i17).o1(j10);
                                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                        JSONObject u10 = a3.u(ea.I(), false);
                                        if (u10 != null) {
                                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                            tL_dataJSON.data = u10.toString();
                                            tL_payments_getPaymentForm.flags |= 1;
                                        }
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                        ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new f2(y10, mcVar, tL_inputInvoiceStars, i12));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                    if (Q != null && Q.getContext() != null) {
                                        ea.c0(Q.getContext(), Q.getResourceProvider());
                                        break;
                                    } else {
                                        ea.c0(W, null);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        ocVar.X1 = !ocVar.X1;
                        m41Var2.O(true);
                        ocVar.n1.w0(0, org.telegram.messenger.g0.L(200.0f), wq.g);
                        break;
                    }
                }
                break;
            case 3:
                tc tcVar = (tc) obj;
                m41 m41Var3 = tcVar.Z1;
                if (m41Var3 != null && (G2 = m41Var3.G(i7 - 1)) != null) {
                    m41 m41Var4 = tcVar.Z1;
                    if (G2.d != -1) {
                        if (G2.H(pc.class) && (G2.G instanceof TL_stars.TL_starsTopupOption)) {
                            Activity W2 = org.telegram.messenger.g0.W(tcVar.getContext());
                            if (W2 == null) {
                                W2 = LaunchActivity.G1;
                            }
                            if (W2 != null) {
                                ea.y(tcVar.a, false).f(W2, (TL_stars.TL_starsTopupOption) G2.G, new p5(i13, tcVar, G2), tcVar.X1);
                                break;
                            }
                        }
                    } else {
                        tcVar.a2 = !tcVar.a2;
                        m41Var4.O(true);
                        break;
                    }
                }
                break;
            case 4:
                uc ucVar = (uc) obj;
                m41 m41Var5 = ucVar.T1;
                if (m41Var5 != null && (G3 = m41Var5.G(i7 - 1)) != null) {
                    m41 m41Var6 = ucVar.T1;
                    if (G3.d != -1) {
                        if (G3.H(pc.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                            Activity W3 = org.telegram.messenger.g0.W(ucVar.getContext());
                            if (W3 == null) {
                                W3 = LaunchActivity.G1;
                            }
                            if (W3 != null) {
                                ea.y(ucVar.a, false).f(W3, (TL_stars.TL_starsTopupOption) G3.G, new p5(3, ucVar, G3), null);
                                break;
                            }
                        }
                    } else {
                        ucVar.U1 = !ucVar.U1;
                        m41Var6.O(true);
                        ucVar.n1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        break;
                    }
                }
                break;
            case 5:
                ((sv) obj).i((di.p) view, false);
                break;
            case 6:
                ei.n nVar = (ei.n) obj;
                sp0 sp0Var = nVar.W;
                org.telegram.ui.ActionBar.f2 f2Var = sp0Var.a;
                if (view instanceof o7) {
                    ij messageObject = ((o7) view).getMessageObject();
                    if (!sp0Var.G.E1) {
                        q9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
                        Context context = nVar.getContext();
                        int e12 = messageObject.e1();
                        k6 k6Var = nVar.a;
                        i7 a11 = i7.a(nVar.f);
                        if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).r1) {
                            i15 = org.telegram.messenger.g0.L(68.0f);
                        }
                        a11.s += i15;
                        orCreateStoryViewer.I(context, e12, k6Var, a11);
                        break;
                    } else if (!sp0Var.c(messageObject)) {
                        sp0Var.e(messageObject);
                        break;
                    } else {
                        sp0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 7:
                c20 c20Var = ((fi.y) obj).c;
                if (c20Var != null) {
                    c20Var.a((fi.t) fi.t.a().get(i7));
                    break;
                }
                break;
            case 8:
                t1 t1Var = (t1) obj;
                k2 k2Var = t1Var.r;
                Object F = t1Var.c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                y10 y10Var = k2Var.y1;
                if (y10Var != null) {
                    y10Var.k(botInlineResult, document2, Boolean.TRUE);
                }
                k2Var.dismiss();
                break;
            case 9:
                z1 z1Var = (z1) obj;
                k2 k2Var2 = z1Var.s;
                y1 y1Var = z1Var.c;
                if (i7 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = y1Var.s;
                        ArrayList arrayList3 = y1Var.w;
                        TLRPC.Document document3 = i7 < arrayList2.size() ? (TLRPC.Document) y1Var.s.get(i7) : null;
                        if (document3 != k2Var2.o1) {
                            long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
                            if (document3 == null && (view instanceof fi.l1) && (h5Var = ((fi.l1) view).d) != null) {
                                document3 = h5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = h5.e(k2Var2.a, longValue);
                            }
                            if (document3 != null) {
                                y10 y10Var2 = k2Var2.y1;
                                if (y10Var2 != null) {
                                    y10Var2.k(y1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                k2Var2.dismiss();
                                break;
                            }
                        } else {
                            kg.g gVar = k2Var2.z1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            k2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 10:
                x9 x9Var = (x9) obj;
                sg.b0 b0Var = (sg.b0) sg.b0.c().get(i7);
                x9Var.U0.setTypeface(b0Var.a);
                sg.l0 e10 = sg.l0.e(x9Var.o1);
                String str = b0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                tg.j jVar = x9Var.s0;
                if (jVar instanceof tg.k2) {
                    ((tg.k2) jVar).setTypeface(b0Var);
                }
                x9Var.M0(false);
                break;
            case 11:
                gi.f.A0((gi.f) obj, i7);
                break;
            case 12:
                m41 m41Var7 = ((gi.e) obj).X1;
                if (m41Var7 != null) {
                    m41Var7.G(i7 - 1);
                    break;
                }
                break;
            case 13:
                hi.j.D0((hi.j) obj, i7);
                break;
            case 14:
                jg.h0 h0Var = (jg.h0) obj;
                if (view instanceof o4) {
                    o4 o4Var = (o4) view;
                    if (o4Var.E) {
                        kw kwVar = h0Var.U;
                        if (kwVar != null) {
                            kwVar.a.Z4(o4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                kw kwVar2 = h0Var.U;
                if (kwVar2 != null) {
                    zw zwVar = kwVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!zwVar.m2) {
                        Bundle bundle = new Bundle();
                        if (m5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        zwVar.V3();
                        if (org.telegram.messenger.g0.Q1() && zwVar.e0 != null) {
                            int i18 = 0;
                            while (true) {
                                yw[] ywVarArr = zwVar.e0;
                                if (i18 < ywVarArr.length) {
                                    jv jvVar = ywVarArr[i18].d;
                                    zwVar.q2.a = longValue2;
                                    jvVar.s = longValue2;
                                    i18++;
                                } else {
                                    int i19 = qp.C8;
                                    zwVar.u5(512, true);
                                }
                            }
                        }
                        if (zwVar.o2 == null) {
                            if (zwVar.getMessagesController().E(bundle, zwVar, null, null)) {
                                zwVar.presentFragment(new cn(bundle));
                                break;
                            }
                        } else if (zwVar.getMessagesController().E(bundle, zwVar, null, null)) {
                            zwVar.getNotificationCenter().k(4, new Object[0]);
                            zwVar.presentFragment(new cn(bundle));
                            break;
                        }
                    } else if (zwVar.v5(longValue2)) {
                        if (!zwVar.J2.isEmpty()) {
                            zwVar.b4(longValue2, zwVar.s3(longValue2, null));
                            zwVar.o5();
                            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            lVar.n(true);
                            break;
                        } else {
                            zwVar.a4(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                kg.g0 g0Var = (kg.g0) obj;
                kg.d0 d0Var = g0Var.y;
                ci ciVar = g0Var.b;
                v4.g0 adapter = g0Var.s.getAdapter();
                kg.e0 e0Var = g0Var.D;
                if (adapter == e0Var) {
                    ArrayList arrayList4 = e0Var.d;
                    int i20 = i7 - 1;
                    if (i20 >= 0 && i20 < arrayList4.size()) {
                        O = arrayList4.get(i20);
                    }
                } else {
                    int S = d0Var.S(i7);
                    int Q2 = d0Var.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = d0Var.O(S, Q2);
                    }
                }
                if (O instanceof s1) {
                    if (!p10.i(ciVar.G3).q()) {
                        if (ciVar.Z1 != null) {
                            new ug.w0(ciVar.Z1, g0Var.getContext(), ciVar.G3, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        s1 s1Var = (s1) O;
                        u4.X(ciVar.G3, s1Var.a(), ciVar.b1(), new f1(24, g0Var, s1Var));
                        break;
                    }
                }
                break;
            case 16:
                kg.i0 i0Var = (kg.i0) obj;
                x31 G5 = i0Var.Z1.G(i7 - 1);
                if (G5 != null) {
                    kg.a0 a0Var = i0Var.U1;
                    if (!a0Var.h(G5)) {
                        int i21 = G5.d;
                        int i22 = kg.i0.f2;
                        if (i21 != -1) {
                            int i23 = kg.i0.g2;
                            if (i21 == -2) {
                                i0Var.a2 = false;
                                a0Var.h = false;
                                i0Var.Z1.O(true);
                                i0Var.d1(true);
                                break;
                            }
                        } else {
                            i0Var.a2 = true;
                            a0Var.h = true;
                            i0Var.Z1.O(true);
                            i0Var.d1(true);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ki.a aVar2 = (ki.a) obj;
                int i24 = aVar2.S1.G(i7 - 1).d;
                if (i24 != 151) {
                    if (i24 == 150) {
                        aVar2.e1(true);
                        break;
                    }
                } else {
                    aVar2.e1(false);
                    break;
                }
                break;
            case 18:
                pg.j jVar2 = (pg.j) obj;
                Runnable runnable = ((pg.a) jVar2.E.get(i7)).c;
                if (runnable != null) {
                    runnable.run();
                    jVar2.c(false);
                    break;
                }
                break;
            case 19:
                xp0 xp0Var = (xp0) obj;
                sg.b0 b0Var2 = (sg.b0) sg.b0.c().get(i7);
                xp0Var.d1.setTypeface(b0Var2.a);
                sg.l0 e11 = sg.l0.e(xp0Var.y1);
                String str2 = b0Var2.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                tg.j jVar3 = xp0Var.B0;
                if (jVar3 instanceof tg.k2) {
                    ((tg.k2) jVar3).setTypeface(b0Var2);
                }
                xp0Var.z0(false);
                break;
            case 20:
                tg.y0 y0Var = (tg.y0) obj;
                y0Var.i3.accept(Integer.valueOf(y0Var.h3.b(i7)));
                sg.l0 l0Var = y0Var.h3;
                l0Var.c.put(Integer.valueOf(l0Var.f), Integer.valueOf(l0Var.b(i7)));
                l0Var.e = true;
                break;
            case 21:
                ug.i0 i0Var2 = (ug.i0) obj;
                HashSet hashSet = i0Var2.t2;
                if (!(view instanceof org.telegram.ui.Cells.n)) {
                    if (view instanceof h4) {
                        if (i0Var2.T1 || ((i10 = i0Var2.c2) != 11 && i10 != 34)) {
                            h4 h4Var = (h4) view;
                            Object object = h4Var.getObject();
                            if (!h4Var.O) {
                                if (hashSet.contains(object)) {
                                    hashSet.remove(object);
                                } else {
                                    hashSet.add(object);
                                }
                                h4Var.c(hashSet.contains(object), true);
                                i0Var2.E1();
                                break;
                            } else if (object instanceof TLRPC.User) {
                                long j11 = ((TLRPC.User) object).id;
                                int i25 = -i0Var2.P2;
                                i0Var2.P2 = i25;
                                org.telegram.messenger.g0.G3(i25, h4Var, null);
                                p2.D.a();
                                String k10 = j11 >= 0 ? t10.k(qp.s1(i0Var2.a).a2(Long.valueOf(j11))) : "";
                                (qp.s1(i0Var2.a).D3() ? new gc((FrameLayout) i0Var2.b, i0Var2.I0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743760, k10))) : new gc((FrameLayout) i0Var2.b, i0Var2.I0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743760, k10)), id.M0(2131743759, null), new ug.v(i0Var2, i14))).j();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar2.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    nVar2.r.a(hashSet.contains(currentChannel), true);
                    i0Var2.E1();
                    break;
                }
                break;
            case 22:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (view != null) {
                    s0Var2.z1(view, true);
                    s0Var2.k3 = false;
                    s0Var2.w0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    break;
                }
                break;
            case 23:
                ((w80) obj).h(view);
                break;
            case 24:
                ((yh.m) obj).h(view);
                break;
            default:
                o3 o3Var = (o3) obj;
                fi.d dVar = o3Var.X1;
                HashSet hashSet2 = o3Var.U1;
                m41 m41Var8 = o3Var.b2;
                if (m41Var8 != null && (G4 = m41Var8.G(i7 - 1)) != null) {
                    Object obj2 = G4.G;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i26 = savedStarGift.msg_id;
                        long j12 = i26 == 0 ? savedStarGift.saved_id : i26;
                        if (hashSet2.contains(Long.valueOf(j12))) {
                            hashSet2.remove(Long.valueOf(j12));
                            ((zh.y0) view).c(false, true);
                            G4.e = false;
                        } else {
                            hashSet2.add(Long.valueOf(j12));
                            ((zh.y0) view).c(true, true);
                            G4.e = true;
                        }
                        dVar.setEnabled(hashSet2.size() > 0);
                        dVar.c(hashSet2.size(), true);
                        break;
                    }
                }
                break;
        }
    }
}
