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
import hi.pa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.jv;
import org.telegram.ui.lw;
import org.telegram.ui.sv;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        n41 G;
        TLRPC.Document document;
        ci.h0 h0Var;
        n41 G2;
        n41 G3;
        n41 G4;
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
                q8 q8Var = (q8) obj;
                hi.e eVar = q8Var.Y1;
                HashSet hashSet = q8Var.V1;
                b51 b51Var = q8Var.c2;
                if (b51Var != null && (G = b51Var.G(i7 - 1)) != null) {
                    Object obj2 = G.H;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i14 = savedStarGift.msg_id;
                        long j3 = i14 == 0 ? savedStarGift.saved_id : i14;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((i3) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((i3) view).c(true, true);
                            G.e = true;
                        }
                        eVar.setEnabled(hashSet.size() > 0);
                        eVar.c(hashSet.size(), true);
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
                                z0Var2.d1(0, gd.N0(2131746279, null), gd.N0(2131746277, null));
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
                b51 b51Var2 = abVar.X1;
                if (b51Var2 != null && (G2 = b51Var2.G(i7 - 1)) != null) {
                    b51 b51Var3 = abVar.X1;
                    if (G2.d == -1) {
                        abVar.Y1 = !abVar.Y1;
                        b51Var3.O(true);
                        abVar.o1.w0(0, org.telegram.messenger.g0.L(200.0f), kr.g);
                        break;
                    } else if (G2.H(bb.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(abVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = abVar.V1.id;
                            di.y8 y10 = di.y8.y(abVar.a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                            h8 h8Var = new h8(abVar, G2, j11, 1);
                            int i17 = y10.a;
                            if (mp.u1(i17).m7) {
                                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    di.y8.c0(Q.getContext(), Q.getResourceProvider());
                                    break;
                                } else {
                                    di.y8.c0(W, null);
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
                                JSONObject u10 = ki.t2.u(di.y8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new q1(y10, h8Var, tL_inputInvoiceStars, 7));
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
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.l6(y10, h8Var, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, W));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                fb fbVar = (fb) obj;
                b51 b51Var4 = fbVar.a2;
                if (b51Var4 != null && (G3 = b51Var4.G(i7 - 1)) != null) {
                    b51 b51Var5 = fbVar.a2;
                    if (G3.d == -1) {
                        fbVar.b2 = !fbVar.b2;
                        b51Var5.O(true);
                        break;
                    } else if (G3.H(bb.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(fbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            di.y8.y(fbVar.a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.H, new r6(5, fbVar, G3), fbVar.Y1);
                            break;
                        }
                    }
                }
                break;
            case 5:
                gb gbVar = (gb) obj;
                b51 b51Var6 = gbVar.U1;
                if (b51Var6 != null && (G4 = b51Var6.G(i7 - 1)) != null) {
                    b51 b51Var7 = gbVar.U1;
                    if (G4.d == -1) {
                        gbVar.V1 = !gbVar.V1;
                        b51Var7.O(true);
                        gbVar.o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        break;
                    } else if (G4.H(bb.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(gbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            di.y8.y(gbVar.a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.H, new r6(i12, gbVar, G4), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                ((sv) obj).i((fi.p) view, false);
                break;
            case 7:
                gi.m mVar = (gi.m) obj;
                eq0 eq0Var = mVar.a0;
                org.telegram.ui.ActionBar.g2 g2Var = eq0Var.a;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    fj messageObject = ((org.telegram.ui.Cells.o7) view).getMessageObject();
                    if (eq0Var.H.F1) {
                        if (eq0Var.c(messageObject)) {
                            eq0Var.g(messageObject);
                            break;
                        } else {
                            eq0Var.e(messageObject);
                            break;
                        }
                    } else {
                        fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
                        Context context = mVar.getContext();
                        int e12 = messageObject.e1();
                        fi.a6 a6Var = mVar.a;
                        fi.y6 a11 = fi.y6.a(mVar.f);
                        if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).s1) {
                            i13 = org.telegram.messenger.g0.L(68.0f);
                        }
                        a11.s += i13;
                        orCreateStoryViewer.I(context, e12, a6Var, a11);
                        break;
                    }
                }
                break;
            case 8:
                w10 w10Var = ((hi.h0) obj).c;
                if (w10Var != null) {
                    w10Var.a((hi.c0) hi.c0.a().get(i7));
                    break;
                }
                break;
            case 9:
                hi.b2 b2Var = (hi.b2) obj;
                hi.r2 r2Var = b2Var.r;
                Object F = b2Var.c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                s10 s10Var = r2Var.z1;
                if (s10Var != null) {
                    s10Var.l(botInlineResult, document2, Boolean.TRUE);
                }
                r2Var.dismiss();
                break;
            case 10:
                hi.g2 g2Var2 = (hi.g2) obj;
                hi.r2 r2Var2 = g2Var2.s;
                hi.f2 f2Var = g2Var2.c;
                if (i7 >= 0) {
                    g2Var2.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = f2Var.s;
                        ArrayList arrayList3 = f2Var.w;
                        TLRPC.Document document3 = i7 < arrayList2.size() ? (TLRPC.Document) f2Var.s.get(i7) : null;
                        if (document3 == r2Var2.p1) {
                            kg.g gVar = r2Var2.A1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            r2Var2.dismiss();
                            break;
                        } else {
                            long longValue = i7 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i7)).longValue();
                            if (document3 == null && (view instanceof hi.v1) && (o5Var = ((hi.v1) view).d) != null) {
                                document3 = o5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = org.telegram.ui.Components.o5.e(r2Var2.a, longValue);
                            }
                            if (document3 != null) {
                                s10 s10Var2 = r2Var2.z1;
                                if (s10Var2 != null) {
                                    s10Var2.l(f2Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                r2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                pa paVar = (pa) obj;
                sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
                paVar.V0.setTypeface(a0Var.a);
                sg.j0 e10 = sg.j0.e(paVar.p1);
                String str = a0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                tg.n nVar = paVar.t0;
                if (nVar instanceof tg.q2) {
                    ((tg.q2) nVar).setTypeface(a0Var);
                }
                paVar.P0(false);
                break;
            case 12:
                ii.t.A0((ii.t) obj, i7);
                break;
            case 13:
                b51 b51Var8 = ((ii.s) obj).Y1;
                if (b51Var8 != null) {
                    b51Var8.G(i7 - 1);
                    break;
                }
                break;
            case 14:
                jg.h0 h0Var3 = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (p4Var.F) {
                        lw lwVar = h0Var3.V;
                        if (lwVar != null) {
                            lwVar.a.h5(p4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                lw lwVar2 = h0Var3.V;
                if (lwVar2 != null) {
                    bx bxVar = lwVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!bxVar.n2) {
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.n5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        bxVar.V3();
                        if (org.telegram.messenger.g0.Q1() && bxVar.f0 != null) {
                            int i18 = 0;
                            while (true) {
                                ax[] axVarArr = bxVar.f0;
                                if (i18 < axVarArr.length) {
                                    jv jvVar = axVarArr[i18].d;
                                    bxVar.r2.a = longValue2;
                                    jvVar.s = longValue2;
                                    i18++;
                                } else {
                                    int i19 = mp.I8;
                                    bxVar.D5(512, true);
                                }
                            }
                        }
                        if (bxVar.p2 != null) {
                            if (bxVar.getMessagesController().E(bundle, bxVar, null, null)) {
                                bxVar.getNotificationCenter().k(4, new Object[0]);
                                bxVar.presentFragment(new bn(bundle));
                                break;
                            }
                        } else if (bxVar.getMessagesController().E(bundle, bxVar, null, null)) {
                            bxVar.presentFragment(new bn(bundle));
                            break;
                        }
                    } else if (bxVar.E5(longValue2)) {
                        if (bxVar.K2.isEmpty()) {
                            bxVar.a4(longValue2, 0L, true, null);
                            break;
                        } else {
                            bxVar.b4(longValue2, bxVar.s3(longValue2, null));
                            bxVar.w5();
                            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            kVar.n(true);
                            break;
                        }
                    }
                }
                break;
            case 15:
                kg.h0 h0Var4 = (kg.h0) obj;
                kg.e0 e0Var = h0Var4.y;
                ti tiVar = h0Var4.b;
                v4.i0 adapter = h0Var4.s.getAdapter();
                kg.f0 f0Var = h0Var4.E;
                if (adapter == f0Var) {
                    ArrayList arrayList4 = f0Var.d;
                    int i20 = i7 - 1;
                    if (i20 >= 0 && i20 < arrayList4.size()) {
                        O = arrayList4.get(i20);
                    }
                } else {
                    int S = e0Var.S(i7);
                    int Q2 = e0Var.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = e0Var.O(S, Q2);
                    }
                }
                if (O instanceof kg.v1) {
                    if (i10.i(tiVar.H3).q()) {
                        kg.v1 v1Var = (kg.v1) O;
                        org.telegram.ui.Components.b5.X(tiVar.H3, v1Var.a(), tiVar.c1(), new ai.s1(25, h0Var4, v1Var));
                        break;
                    } else if (tiVar.a2 != null) {
                        new ug.y0(tiVar.a2, h0Var4.getContext(), tiVar.H3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 16:
                kg.k0 k0Var = (kg.k0) obj;
                n41 G5 = k0Var.a2.G(i7 - 1);
                if (G5 != null) {
                    kg.b0 b0Var = k0Var.V1;
                    if (!b0Var.h(G5)) {
                        int i21 = G5.d;
                        int i22 = kg.k0.g2;
                        if (i21 == -1) {
                            k0Var.b2 = true;
                            b0Var.h = true;
                            k0Var.a2.O(true);
                            k0Var.e1(true);
                            break;
                        } else {
                            int i23 = kg.k0.h2;
                            if (i21 == -2) {
                                k0Var.b2 = false;
                                b0Var.h = false;
                                k0Var.a2.O(true);
                                k0Var.e1(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ki.j.D0((ki.j) obj, i7);
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
                sg.a0 a0Var2 = (sg.a0) sg.a0.c().get(i7);
                vp0Var.e1.setTypeface(a0Var2.a);
                sg.j0 e11 = sg.j0.e(vp0Var.z1);
                String str2 = a0Var2.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                tg.n nVar2 = vp0Var.C0;
                if (nVar2 instanceof tg.q2) {
                    ((tg.q2) nVar2).setTypeface(a0Var2);
                }
                vp0Var.C0(false);
                break;
            case 21:
                tg.d1 d1Var = (tg.d1) obj;
                d1Var.j3.accept(Integer.valueOf(d1Var.i3.b(i7)));
                sg.j0 j0Var2 = d1Var.i3;
                j0Var2.c.put(Integer.valueOf(j0Var2.f), Integer.valueOf(j0Var2.b(i7)));
                j0Var2.e = true;
                break;
            case 22:
                ug.k0 k0Var2 = (ug.k0) obj;
                HashSet hashSet2 = k0Var2.u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar3.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar3.r.a(hashSet2.contains(currentChannel), true);
                    k0Var2.F1();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.i4) {
                    if (k0Var2.U1 || ((i10 = k0Var2.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                        Object object = i4Var.getObject();
                        if (i4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).id;
                                int i25 = -k0Var2.Q2;
                                k0Var2.Q2 = i25;
                                org.telegram.messenger.g0.E3(i25, i4Var, null);
                                org.telegram.messenger.q2.E.a();
                                String l11 = j12 >= 0 ? n10.l(mp.u1(k0Var2.a).c2(Long.valueOf(j12))) : "";
                                (mp.u1(k0Var2.a).K3() ? new kc((FrameLayout) k0Var2.b, k0Var2.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743513, l11))) : new kc((FrameLayout) k0Var2.b, k0Var2.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743513, l11)), gd.N0(2131743512, null), new ug.v(k0Var2, r15 ? 1 : 0))).j();
                                break;
                            }
                        } else {
                            if (hashSet2.contains(object)) {
                                hashSet2.remove(object);
                            } else {
                                hashSet2.add(object);
                            }
                            i4Var.c(hashSet2.contains(object), true);
                            k0Var2.F1();
                            break;
                        }
                    }
                }
                break;
            case 23:
                ug.u0 u0Var = (ug.u0) obj;
                if (view != null) {
                    u0Var.z1(view, true);
                    u0Var.l3 = false;
                    u0Var.w0(0, view.getTop() - ((u0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    break;
                }
                break;
            case 24:
                ((i90) obj).h(view);
                break;
            default:
                ((zh.l) obj).h(view);
                break;
        }
    }
}
