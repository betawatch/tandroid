package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.cb;
import di.db;
import di.mb;
import di.v8;
import di.xa;
import di.ya;
import fi.b7;
import fi.i9;
import hi.u9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.hv;
import org.telegram.ui.jw;
import org.telegram.ui.qv;
import org.telegram.ui.tp0;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        b41 G;
        TLRPC.Document document;
        ci.g0 g0Var;
        b41 G2;
        b41 G3;
        b41 G4;
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
                e6 e6Var = (e6) obj;
                hi.d dVar = e6Var.Y1;
                HashSet hashSet = e6Var.V1;
                p41 p41Var = e6Var.c2;
                if (p41Var != null && (G = p41Var.G(i7 - 1)) != null) {
                    Object obj2 = G.G;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i14 = savedStarGift.msg_id;
                        long j3 = i14 == 0 ? savedStarGift.saved_id : i14;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((i2) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((i2) view).c(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 1:
                ci.f0 f0Var = (ci.f0) obj;
                if ((view instanceof ci.l) && (document = ((ci.l) view).e) != null) {
                    long j10 = document.id;
                    if (j10 != 0) {
                        ci.i0 i0Var = f0Var.a;
                        if (i0Var.d != null) {
                            if (i0Var.getUserConfig().q() || ((g0Var = i0Var.h) != null && g0Var.I.contains(Long.valueOf(j10)))) {
                                ci.z0 z0Var = i0Var.d;
                                int i15 = z0Var.b;
                                String o4 = a8.p0.o(j10, "c:");
                                HashMap hashMap = z0Var.K;
                                if (!hashMap.containsKey(o4)) {
                                    org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(i15, 2, document);
                                    l10.a(z0Var);
                                    hashMap.put(o4, l10);
                                }
                                if (o4 != null && !o4.startsWith("c:")) {
                                    o4 = o4.replace("️", "");
                                }
                                ArrayList arrayList = z0Var.J;
                                int indexOf = arrayList.indexOf(o4);
                                if (indexOf >= 0) {
                                    arrayList.remove(indexOf);
                                } else {
                                    if (arrayList.size() >= 6) {
                                        arrayList.remove(0);
                                    }
                                    arrayList.add(o4);
                                }
                                z0Var.c();
                                z0Var.i0();
                                ci.g0 g0Var2 = i0Var.h;
                                if (g0Var2 != null) {
                                    ArrayList a10 = g0Var2.a();
                                    a10.remove(Long.valueOf(j10));
                                    a10.add(0, Long.valueOf(j10));
                                    while (a10.size() > 21) {
                                        a8.p0.z(1, a10);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i16 = 0; i16 < a10.size(); i16++) {
                                        if (i16 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a10.get(i16));
                                    }
                                    np.s1(g0Var2.a).f7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    g0Var2.K = true;
                                    break;
                                }
                            } else {
                                ci.z0 z0Var2 = i0Var.d;
                                z0Var2.getClass();
                                z0Var2.d1(0, hd.M0(2131746475, null), hd.M0(2131746473, null));
                                z0Var2.i0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                mb.C0((mb) obj, i7);
                break;
            case 3:
                xa xaVar = (xa) obj;
                p41 p41Var2 = xaVar.X1;
                if (p41Var2 != null && (G2 = p41Var2.G(i7 - 1)) != null) {
                    p41 p41Var3 = xaVar.X1;
                    if (G2.d == -1) {
                        xaVar.Y1 = !xaVar.Y1;
                        p41Var3.O(true);
                        xaVar.o1.w0(0, org.telegram.messenger.g0.L(200.0f), er.g);
                        break;
                    } else if (G2.H(ya.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(xaVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = xaVar.V1.id;
                            v8 y10 = v8.y(xaVar.a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            v5 v5Var = new v5(xaVar, G2, j11, 1);
                            int i17 = y10.a;
                            if (np.s1(i17).k7) {
                                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    v8.c0(Q.getContext(), Q.getResourceProvider());
                                    break;
                                } else {
                                    v8.c0(W, null);
                                    break;
                                }
                            } else if (org.telegram.messenger.r2.b() || !org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.user_id = np.s1(i17).o1(j11);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.x2.u(v8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new j6(y10, v5Var, tL_inputInvoiceStars, 5));
                                break;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.user_id = np.s1(i17).o1(j11);
                                f5.a aVar = new f5.a();
                                aVar.c = "inapp";
                                aVar.b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.i6(y10, v5Var, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, W));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                cb cbVar = (cb) obj;
                p41 p41Var4 = cbVar.a2;
                if (p41Var4 != null && (G3 = p41Var4.G(i7 - 1)) != null) {
                    p41 p41Var5 = cbVar.a2;
                    if (G3.d == -1) {
                        cbVar.b2 = !cbVar.b2;
                        p41Var5.O(true);
                        break;
                    } else if (G3.H(ya.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(cbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            v8.y(cbVar.a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new e4(3, cbVar, G3), cbVar.Y1);
                            break;
                        }
                    }
                }
                break;
            case 5:
                db dbVar = (db) obj;
                p41 p41Var6 = dbVar.U1;
                if (p41Var6 != null && (G4 = p41Var6.G(i7 - 1)) != null) {
                    p41 p41Var7 = dbVar.U1;
                    if (G4.d == -1) {
                        dbVar.V1 = !dbVar.V1;
                        p41Var7.O(true);
                        dbVar.o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        break;
                    } else if (G4.H(ya.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(dbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            v8.y(dbVar.a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new e4(i12, dbVar, G4), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((qv) obj).i((fi.p) view, false);
                break;
            case 7:
                gi.m mVar = (gi.m) obj;
                vp0 vp0Var = mVar.a0;
                org.telegram.ui.ActionBar.e2 e2Var = vp0Var.a;
                if (view instanceof n7) {
                    gj messageObject = ((n7) view).getMessageObject();
                    if (vp0Var.H.F1) {
                        if (vp0Var.c(messageObject)) {
                            vp0Var.g(messageObject);
                            break;
                        } else {
                            vp0Var.e(messageObject);
                            break;
                        }
                    } else {
                        i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
                        Context context = mVar.getContext();
                        int e12 = messageObject.e1();
                        fi.c6 c6Var = mVar.a;
                        b7 a11 = b7.a(mVar.f);
                        if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).s1) {
                            i13 = org.telegram.messenger.g0.L(68.0f);
                        }
                        a11.s += i13;
                        orCreateStoryViewer.I(context, e12, c6Var, a11);
                        break;
                    }
                }
                break;
            case 8:
                z10 z10Var = ((hi.y) obj).c;
                if (z10Var != null) {
                    z10Var.a((hi.t) hi.t.a().get(i7));
                    break;
                }
                break;
            case 9:
                hi.t1 t1Var = (hi.t1) obj;
                hi.i2 i2Var = t1Var.r;
                Object F = t1Var.c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                v10 v10Var = i2Var.z1;
                if (v10Var != null) {
                    v10Var.l(botInlineResult, document2, Boolean.TRUE);
                }
                i2Var.dismiss();
                break;
            case 10:
                hi.y1 y1Var = (hi.y1) obj;
                hi.i2 i2Var2 = y1Var.s;
                hi.x1 x1Var = y1Var.c;
                if (i7 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = x1Var.s;
                        ArrayList arrayList3 = x1Var.w;
                        TLRPC.Document document3 = i7 < arrayList2.size() ? (TLRPC.Document) x1Var.s.get(i7) : null;
                        if (document3 == i2Var2.p1) {
                            kg.g gVar = i2Var2.A1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            i2Var2.dismiss();
                            break;
                        } else {
                            long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
                            if (document3 == null && (view instanceof hi.n1) && (g5Var = ((hi.n1) view).d) != null) {
                                document3 = g5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = org.telegram.ui.Components.g5.e(i2Var2.a, longValue);
                            }
                            if (document3 != null) {
                                v10 v10Var2 = i2Var2.z1;
                                if (v10Var2 != null) {
                                    v10Var2.l(x1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                i2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                u9 u9Var = (u9) obj;
                sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
                u9Var.V0.setTypeface(a0Var.a);
                sg.k0 e10 = sg.k0.e(u9Var.p1);
                String str = a0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                tg.j jVar = u9Var.t0;
                if (jVar instanceof tg.o2) {
                    ((tg.o2) jVar).setTypeface(a0Var);
                }
                u9Var.M0(false);
                break;
            case 12:
                ii.f.A0((ii.f) obj, i7);
                break;
            case 13:
                p41 p41Var8 = ((ii.e) obj).Y1;
                if (p41Var8 != null) {
                    p41Var8.G(i7 - 1);
                    break;
                }
                break;
            case 14:
                jg.h0 h0Var = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.F) {
                        jw jwVar = h0Var.V;
                        if (jwVar != null) {
                            jwVar.a.Z4(o4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                jw jwVar2 = h0Var.V;
                if (jwVar2 != null) {
                    yw ywVar = jwVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!ywVar.n2) {
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.m5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        ywVar.V3();
                        if (org.telegram.messenger.g0.Q1() && ywVar.f0 != null) {
                            int i18 = 0;
                            while (true) {
                                xw[] xwVarArr = ywVar.f0;
                                if (i18 < xwVarArr.length) {
                                    hv hvVar = xwVarArr[i18].d;
                                    ywVar.r2.a = longValue2;
                                    hvVar.s = longValue2;
                                    i18++;
                                } else {
                                    int i19 = np.D8;
                                    ywVar.u5(512, true);
                                }
                            }
                        }
                        if (ywVar.p2 != null) {
                            if (ywVar.getMessagesController().E(bundle, ywVar, null, null)) {
                                ywVar.getNotificationCenter().k(4, new Object[0]);
                                ywVar.presentFragment(new an(bundle));
                                break;
                            }
                        } else if (ywVar.getMessagesController().E(bundle, ywVar, null, null)) {
                            ywVar.presentFragment(new an(bundle));
                            break;
                        }
                    } else if (ywVar.v5(longValue2)) {
                        if (ywVar.K2.isEmpty()) {
                            ywVar.a4(longValue2, 0L, true, null);
                            break;
                        } else {
                            ywVar.b4(longValue2, ywVar.s3(longValue2, null));
                            ywVar.o5();
                            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            kVar.n(true);
                            break;
                        }
                    }
                }
                break;
            case 15:
                kg.g0 g0Var3 = (kg.g0) obj;
                kg.d0 d0Var = g0Var3.y;
                ki kiVar = g0Var3.b;
                v4.h0 adapter = g0Var3.s.getAdapter();
                kg.e0 e0Var = g0Var3.E;
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
                if (O instanceof kg.u1) {
                    if (m10.i(kiVar.H3).q()) {
                        kg.u1 u1Var = (kg.u1) O;
                        org.telegram.ui.Components.t4.X(kiVar.H3, u1Var.a(), kiVar.b1(), new ai.u1(22, g0Var3, u1Var));
                        break;
                    } else if (kiVar.a2 != null) {
                        new ug.x0(kiVar.a2, g0Var3.getContext(), kiVar.H3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 16:
                kg.i0 i0Var2 = (kg.i0) obj;
                b41 G5 = i0Var2.a2.G(i7 - 1);
                if (G5 != null) {
                    kg.a0 a0Var2 = i0Var2.V1;
                    if (!a0Var2.h(G5)) {
                        int i21 = G5.d;
                        int i22 = kg.i0.g2;
                        if (i21 == -1) {
                            i0Var2.b2 = true;
                            a0Var2.h = true;
                            i0Var2.a2.O(true);
                            i0Var2.d1(true);
                            break;
                        } else {
                            int i23 = kg.i0.h2;
                            if (i21 == -2) {
                                i0Var2.b2 = false;
                                a0Var2.h = false;
                                i0Var2.a2.O(true);
                                i0Var2.d1(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ki.k.D0((ki.k) obj, i7);
                break;
            case 18:
                ni.a aVar2 = (ni.a) obj;
                int i24 = aVar2.T1.G(i7 - 1).d;
                if (i24 == 151) {
                    aVar2.e1(false);
                    break;
                } else if (i24 == 150) {
                    aVar2.e1(true);
                    break;
                }
                break;
            case 19:
                pg.i iVar = (pg.i) obj;
                Runnable runnable = ((pg.a) iVar.F.get(i7)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 20:
                tp0 tp0Var = (tp0) obj;
                sg.a0 a0Var3 = (sg.a0) sg.a0.c().get(i7);
                tp0Var.e1.setTypeface(a0Var3.a);
                sg.k0 e11 = sg.k0.e(tp0Var.z1);
                String str2 = a0Var3.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                tg.j jVar2 = tp0Var.C0;
                if (jVar2 instanceof tg.o2) {
                    ((tg.o2) jVar2).setTypeface(a0Var3);
                }
                tp0Var.z0(false);
                break;
            case 21:
                tg.y0 y0Var = (tg.y0) obj;
                y0Var.j3.accept(Integer.valueOf(y0Var.i3.b(i7)));
                sg.k0 k0Var = y0Var.i3;
                k0Var.c.put(Integer.valueOf(k0Var.f), Integer.valueOf(k0Var.b(i7)));
                k0Var.e = true;
                break;
            case 22:
                ug.j0 j0Var = (ug.j0) obj;
                HashSet hashSet2 = j0Var.u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.r.a(hashSet2.contains(currentChannel), true);
                    j0Var.E1();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h4) {
                    if (j0Var.U1 || ((i10 = j0Var.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).id;
                                int i25 = -j0Var.Q2;
                                j0Var.Q2 = i25;
                                org.telegram.messenger.g0.F3(i25, h4Var, null);
                                org.telegram.messenger.p2.E.a();
                                String k10 = j12 >= 0 ? q10.k(np.s1(j0Var.a).a2(Long.valueOf(j12))) : "";
                                (np.s1(j0Var.a).D3() ? new cc((FrameLayout) j0Var.b, j0Var.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743760, k10))) : new cc((FrameLayout) j0Var.b, j0Var.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743760, k10)), hd.M0(2131743759, null), new ug.v(j0Var, r14 ? 1 : 0))).j();
                                break;
                            }
                        } else {
                            if (hashSet2.contains(object)) {
                                hashSet2.remove(object);
                            } else {
                                hashSet2.add(object);
                            }
                            h4Var.c(hashSet2.contains(object), true);
                            j0Var.E1();
                            break;
                        }
                    }
                }
                break;
            case 23:
                ug.t0 t0Var = (ug.t0) obj;
                if (view != null) {
                    t0Var.z1(view, true);
                    t0Var.l3 = false;
                    t0Var.w0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    break;
                }
                break;
            case 24:
                ((y80) obj).h(view);
                break;
            default:
                ((zh.l) obj).h(view);
                break;
        }
    }
}
