package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.ab;
import di.bb;
import di.fb;
import di.gb;
import di.pb;
import fi.f9;
import hi.v9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.t10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.kv;
import org.telegram.ui.mw;
import org.telegram.ui.tv;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        l41 G;
        TLRPC.Document document;
        ci.h0 h0Var;
        l41 G2;
        l41 G3;
        l41 G4;
        TLRPC.Document document2;
        org.telegram.ui.Components.o5 o5Var;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11 = this.a;
        int i12 = 6;
        TLRPC.BotInlineResult botInlineResult = null;
        r13 = null;
        Object O = null;
        r15 = 0;
        int i13 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                hi.d dVar = l8Var.Y1;
                HashSet hashSet = l8Var.V1;
                z41 z41Var = l8Var.c2;
                if (z41Var != null && (G = z41Var.G(i7 - 1)) != null) {
                    Object obj2 = G.H;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i14 = savedStarGift.msg_id;
                        long j3 = i14 == 0 ? savedStarGift.saved_id : i14;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((c3) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((c3) view).c(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 1:
                ci.g0 g0Var = (ci.g0) obj;
                if ((view instanceof ci.l) && (document = ((ci.l) view).e) != null) {
                    long j10 = document.id;
                    if (j10 != 0) {
                        ci.j0 j0Var = g0Var.a;
                        if (j0Var.d != null) {
                            if (j0Var.getUserConfig().q() || ((h0Var = j0Var.h) != null && h0Var.I.contains(Long.valueOf(j10)))) {
                                ci.z0 z0Var = j0Var.d;
                                int i15 = z0Var.b;
                                String o4 = a8.p0.o(j10, "c:");
                                HashMap hashMap = z0Var.K;
                                if (!hashMap.containsKey(o4)) {
                                    org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(i15, 2, document);
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
                                ci.h0 h0Var2 = j0Var.h;
                                if (h0Var2 != null) {
                                    ArrayList a10 = h0Var2.a();
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
                                    mp.u1(h0Var2.a).h7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    h0Var2.K = true;
                                    break;
                                }
                            } else {
                                ci.z0 z0Var2 = j0Var.d;
                                z0Var2.getClass();
                                z0Var2.d1(0, gd.M0(2131746280, null), gd.M0(2131746278, null));
                                z0Var2.i0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                pb.C0((pb) obj, i7);
                break;
            case 3:
                ab abVar = (ab) obj;
                z41 z41Var2 = abVar.X1;
                if (z41Var2 != null && (G2 = z41Var2.G(i7 - 1)) != null) {
                    z41 z41Var3 = abVar.X1;
                    if (G2.d == -1) {
                        abVar.Y1 = !abVar.Y1;
                        z41Var3.O(true);
                        abVar.o1.w0(0, org.telegram.messenger.g0.L(200.0f), lr.g);
                        break;
                    } else if (G2.H(bb.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(abVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = abVar.V1.id;
                            di.x8 y10 = di.x8.y(abVar.a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                            c8 c8Var = new c8(abVar, G2, j11, 1);
                            int i17 = y10.a;
                            if (mp.u1(i17).m7) {
                                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    di.x8.c0(Q.getContext(), Q.getResourceProvider());
                                    break;
                                } else {
                                    di.x8.c0(W, null);
                                    break;
                                }
                            } else if (org.telegram.messenger.s2.b() || !org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.user_id = mp.u1(i17).q1(j11);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.t2.u(di.x8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new m1(y10, c8Var, tL_inputInvoiceStars, 7));
                                break;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.user_id = mp.u1(i17).q1(j11);
                                f5.a aVar = new f5.a();
                                aVar.c = "inapp";
                                aVar.b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.l6(y10, c8Var, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, W));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                fb fbVar = (fb) obj;
                z41 z41Var4 = fbVar.a2;
                if (z41Var4 != null && (G3 = z41Var4.G(i7 - 1)) != null) {
                    z41 z41Var5 = fbVar.a2;
                    if (G3.d == -1) {
                        fbVar.b2 = !fbVar.b2;
                        z41Var5.O(true);
                        break;
                    } else if (G3.H(bb.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(fbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            di.x8.y(fbVar.a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.H, new m6(5, fbVar, G3), fbVar.Y1);
                            break;
                        }
                    }
                }
                break;
            case 5:
                gb gbVar = (gb) obj;
                z41 z41Var6 = gbVar.U1;
                if (z41Var6 != null && (G4 = z41Var6.G(i7 - 1)) != null) {
                    z41 z41Var7 = gbVar.U1;
                    if (G4.d == -1) {
                        gbVar.V1 = !gbVar.V1;
                        z41Var7.O(true);
                        gbVar.o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        break;
                    } else if (G4.H(bb.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(gbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            di.x8.y(gbVar.a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.H, new m6(i12, gbVar, G4), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((tv) obj).i((fi.p) view, false);
                break;
            case 7:
                gi.m mVar = (gi.m) obj;
                dq0 dq0Var = mVar.a0;
                org.telegram.ui.ActionBar.h2 h2Var = dq0Var.a;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    fj messageObject = ((org.telegram.ui.Cells.o7) view).getMessageObject();
                    if (dq0Var.H.F1) {
                        if (dq0Var.c(messageObject)) {
                            dq0Var.g(messageObject);
                            break;
                        } else {
                            dq0Var.e(messageObject);
                            break;
                        }
                    } else {
                        f9 orCreateStoryViewer = h2Var.getOrCreateStoryViewer();
                        Context context = mVar.getContext();
                        int e12 = messageObject.e1();
                        fi.z5 z5Var = mVar.a;
                        fi.y6 a11 = fi.y6.a(mVar.f);
                        if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).s1) {
                            i13 = org.telegram.messenger.g0.L(68.0f);
                        }
                        a11.s += i13;
                        orCreateStoryViewer.I(context, e12, z5Var, a11);
                        break;
                    }
                }
                break;
            case 8:
                x10 x10Var = ((hi.z) obj).c;
                if (x10Var != null) {
                    x10Var.a((hi.u) hi.u.a().get(i7));
                    break;
                }
                break;
            case 9:
                hi.u1 u1Var = (hi.u1) obj;
                hi.j2 j2Var = u1Var.r;
                Object F = u1Var.c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                t10 t10Var = j2Var.z1;
                if (t10Var != null) {
                    t10Var.m(botInlineResult, document2, Boolean.TRUE);
                }
                j2Var.dismiss();
                break;
            case 10:
                hi.z1 z1Var = (hi.z1) obj;
                hi.j2 j2Var2 = z1Var.s;
                hi.y1 y1Var = z1Var.c;
                if (i7 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = y1Var.s;
                        ArrayList arrayList3 = y1Var.w;
                        TLRPC.Document document3 = i7 < arrayList2.size() ? (TLRPC.Document) y1Var.s.get(i7) : null;
                        if (document3 == j2Var2.p1) {
                            kg.g gVar = j2Var2.A1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            j2Var2.dismiss();
                            break;
                        } else {
                            long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
                            if (document3 == null && (view instanceof hi.n1) && (o5Var = ((hi.n1) view).d) != null) {
                                document3 = o5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = org.telegram.ui.Components.o5.e(j2Var2.a, longValue);
                            }
                            if (document3 != null) {
                                t10 t10Var2 = j2Var2.z1;
                                if (t10Var2 != null) {
                                    t10Var2.m(y1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                j2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                v9 v9Var = (v9) obj;
                sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
                v9Var.V0.setTypeface(a0Var.a);
                sg.k0 e10 = sg.k0.e(v9Var.p1);
                String str = a0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                tg.j jVar = v9Var.t0;
                if (jVar instanceof tg.m2) {
                    ((tg.m2) jVar).setTypeface(a0Var);
                }
                v9Var.M0(false);
                break;
            case 12:
                ii.t.A0((ii.t) obj, i7);
                break;
            case 13:
                z41 z41Var8 = ((ii.s) obj).Y1;
                if (z41Var8 != null) {
                    z41Var8.G(i7 - 1);
                    break;
                }
                break;
            case 14:
                jg.h0 h0Var3 = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.F) {
                        mw mwVar = h0Var3.V;
                        if (mwVar != null) {
                            mwVar.a.h5(o4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                mw mwVar2 = h0Var3.V;
                if (mwVar2 != null) {
                    cx cxVar = mwVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!cxVar.n2) {
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.n5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        cxVar.V3();
                        if (org.telegram.messenger.g0.Q1() && cxVar.f0 != null) {
                            int i18 = 0;
                            while (true) {
                                bx[] bxVarArr = cxVar.f0;
                                if (i18 < bxVarArr.length) {
                                    kv kvVar = bxVarArr[i18].d;
                                    cxVar.r2.a = longValue2;
                                    kvVar.s = longValue2;
                                    i18++;
                                } else {
                                    int i19 = mp.I8;
                                    cxVar.D5(512, true);
                                }
                            }
                        }
                        if (cxVar.p2 != null) {
                            if (cxVar.getMessagesController().E(bundle, cxVar, null, null)) {
                                cxVar.getNotificationCenter().k(4, new Object[0]);
                                cxVar.presentFragment(new bn(bundle));
                                break;
                            }
                        } else if (cxVar.getMessagesController().E(bundle, cxVar, null, null)) {
                            cxVar.presentFragment(new bn(bundle));
                            break;
                        }
                    } else if (cxVar.E5(longValue2)) {
                        if (cxVar.K2.isEmpty()) {
                            cxVar.a4(longValue2, 0L, true, null);
                            break;
                        } else {
                            cxVar.b4(longValue2, cxVar.s3(longValue2, null));
                            cxVar.w5();
                            kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                            kVar.o(true);
                            break;
                        }
                    }
                }
                break;
            case 15:
                kg.g0 g0Var2 = (kg.g0) obj;
                kg.d0 d0Var = g0Var2.y;
                si siVar = g0Var2.b;
                v4.i0 adapter = g0Var2.s.getAdapter();
                kg.e0 e0Var = g0Var2.E;
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
                if (O instanceof kg.v1) {
                    if (j10.i(siVar.H3).q()) {
                        kg.v1 v1Var = (kg.v1) O;
                        org.telegram.ui.Components.b5.X(siVar.H3, v1Var.a(), siVar.c1(), new ai.v1(24, g0Var2, v1Var));
                        break;
                    } else if (siVar.a2 != null) {
                        new ug.z0(siVar.a2, g0Var2.getContext(), siVar.H3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 16:
                kg.l0 l0Var = (kg.l0) obj;
                l41 G5 = l0Var.a2.G(i7 - 1);
                if (G5 != null) {
                    kg.a0 a0Var2 = l0Var.V1;
                    if (!a0Var2.h(G5)) {
                        int i21 = G5.d;
                        int i22 = kg.l0.g2;
                        if (i21 == -1) {
                            l0Var.b2 = true;
                            a0Var2.h = true;
                            l0Var.a2.O(true);
                            l0Var.e1(true);
                            break;
                        } else {
                            int i23 = kg.l0.h2;
                            if (i21 == -2) {
                                l0Var.b2 = false;
                                a0Var2.h = false;
                                l0Var.a2.O(true);
                                l0Var.e1(true);
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
                    aVar2.f1(false);
                    break;
                } else if (i24 == 150) {
                    aVar2.f1(true);
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
                vp0 vp0Var = (vp0) obj;
                sg.a0 a0Var3 = (sg.a0) sg.a0.c().get(i7);
                vp0Var.e1.setTypeface(a0Var3.a);
                sg.k0 e11 = sg.k0.e(vp0Var.z1);
                String str2 = a0Var3.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                tg.j jVar2 = vp0Var.C0;
                if (jVar2 instanceof tg.m2) {
                    ((tg.m2) jVar2).setTypeface(a0Var3);
                }
                vp0Var.z0(false);
                break;
            case 21:
                tg.y0 y0Var = (tg.y0) obj;
                y0Var.j3.accept(Integer.valueOf(y0Var.i3.b(i7)));
                sg.k0 k0Var = y0Var.i3;
                k0Var.c.put(Integer.valueOf(k0Var.f), Integer.valueOf(k0Var.b(i7)));
                k0Var.e = true;
                break;
            case 22:
                ug.l0 l0Var2 = (ug.l0) obj;
                HashSet hashSet2 = l0Var2.u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.r.a(hashSet2.contains(currentChannel), true);
                    l0Var2.F1();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h4) {
                    if (l0Var2.U1 || ((i10 = l0Var2.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).id;
                                int i25 = -l0Var2.Q2;
                                l0Var2.Q2 = i25;
                                org.telegram.messenger.g0.E3(i25, h4Var, null);
                                org.telegram.messenger.q2.E.a();
                                String l11 = j12 >= 0 ? o10.l(mp.u1(l0Var2.a).c2(Long.valueOf(j12))) : "";
                                (mp.u1(l0Var2.a).K3() ? new lc((FrameLayout) l0Var2.b, l0Var2.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743523, l11))) : new lc((FrameLayout) l0Var2.b, l0Var2.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743523, l11)), gd.M0(2131743522, null), new ug.v(l0Var2, r15 ? 1 : 0))).j();
                                break;
                            }
                        } else {
                            if (hashSet2.contains(object)) {
                                hashSet2.remove(object);
                            } else {
                                hashSet2.add(object);
                            }
                            h4Var.c(hashSet2.contains(object), true);
                            l0Var2.F1();
                            break;
                        }
                    }
                }
                break;
            case 23:
                ug.v0 v0Var = (ug.v0) obj;
                if (view != null) {
                    v0Var.z1(view, true);
                    v0Var.l3 = false;
                    v0Var.w0(0, view.getTop() - ((v0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    break;
                }
                break;
            case 24:
                ((j90) obj).h(view);
                break;
            default:
                ((zh.l) obj).h(view);
                break;
        }
    }
}
