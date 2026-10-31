package ag;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.m20;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.er0;
import org.telegram.ui.lw;
import org.telegram.ui.mx;
import org.telegram.ui.un;
import org.telegram.ui.uw;
import org.telegram.ui.zx;
import ph.t3;
import rh.e6;
import rh.h8;
import rh.s6;
import rh.t7;
import rh.u7;
import rh.x7;
import rh.y7;
import th.n5;
import th.o7;
import th.q4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        int i11;
        a51 G;
        TLRPC.Document document;
        qh.g0 g0Var;
        a51 G2;
        a51 G3;
        a51 G4;
        TLRPC.Document document2;
        f5 f5Var;
        org.telegram.ui.ActionBar.l lVar;
        int i12 = this.a;
        int i13 = 2;
        Object obj = null;
        TLRPC.BotInlineResult botInlineResult = null;
        obj = null;
        int i14 = 1;
        r14 = 0;
        int i15 = 0;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                h1 h1Var = (h1) obj2;
                e1 e1Var = h1Var.y;
                bi biVar = h1Var.b;
                s4.g0 adapter = h1Var.s.getAdapter();
                f1 f1Var = h1Var.D;
                if (adapter == f1Var) {
                    ArrayList arrayList = f1Var.d;
                    int i16 = i10 - 1;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        obj = arrayList.get(i16);
                    }
                } else {
                    int S = e1Var.S(i10);
                    int Q = e1Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        obj = e1Var.O(S, Q);
                    }
                }
                if (obj instanceof h3) {
                    if (d20.i(biVar.D3).q()) {
                        h3 h3Var = (h3) obj;
                        s4.Z(biVar.D3, h3Var.a(), biVar.a1(), new e0(i14, h1Var, h3Var));
                        break;
                    } else if (biVar.W1 != null) {
                        new kg.i1(biVar.W1, h1Var.getContext(), biVar.D3, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 1:
                j1 j1Var = (j1) obj2;
                a51 G5 = j1Var.W1.G(i10 - 1);
                if (G5 != null) {
                    x0 x0Var = j1Var.R1;
                    if (!x0Var.h(G5)) {
                        int i17 = G5.d;
                        int i18 = j1.c2;
                        if (i17 == -1) {
                            j1Var.X1 = true;
                            x0Var.h = true;
                            j1Var.W1.O(true);
                            j1Var.d1(true);
                            break;
                        } else {
                            int i19 = j1.d2;
                            if (i17 == -2) {
                                j1Var.X1 = false;
                                x0Var.h = false;
                                j1Var.W1.O(true);
                                j1Var.d1(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                ai.a aVar = (ai.a) obj2;
                int i20 = aVar.P1.G(i10 - 1).d;
                if (i20 == 151) {
                    aVar.e1(false);
                    break;
                } else if (i20 == 150) {
                    aVar.e1(true);
                    break;
                }
                break;
            case 3:
                fg.l lVar2 = (fg.l) obj2;
                Runnable runnable = ((fg.a) lVar2.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    lVar2.c(false);
                    break;
                }
                break;
            case 4:
                er0 er0Var = (er0) obj2;
                ig.h0 h0Var = (ig.h0) ig.h0.c().get(i10);
                er0Var.d1.setTypeface(h0Var.a);
                ig.s0 e = ig.s0.e(er0Var.y1);
                String str = h0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                jg.j jVar = er0Var.B0;
                if (jVar instanceof jg.g3) {
                    ((jg.g3) jVar).setTypeface(h0Var);
                }
                er0Var.y0(false);
                break;
            case 5:
                jg.n1 n1Var = (jg.n1) obj2;
                n1Var.i3.accept(Integer.valueOf(n1Var.h3.b(i10)));
                ig.s0 s0Var = n1Var.h3;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                break;
            case 6:
                kg.q0 q0Var = (kg.q0) obj2;
                HashSet hashSet = q0Var.q2;
                if (view instanceof org.telegram.ui.Cells.m) {
                    org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) view;
                    TLRPC.Chat currentChannel = mVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    mVar.r.a(hashSet.contains(currentChannel), true);
                    q0Var.E1();
                    break;
                } else if (view instanceof j4) {
                    if (q0Var.Q1 || ((i11 = q0Var.Z1) != 11 && i11 != 34)) {
                        j4 j4Var = (j4) view;
                        Object object = j4Var.getObject();
                        if (j4Var.O) {
                            if (object instanceof TLRPC.User) {
                                long j10 = ((TLRPC.User) object).id;
                                int i21 = -q0Var.M2;
                                q0Var.M2 = i21;
                                org.telegram.messenger.i0.F3(i21, j4Var, null);
                                org.telegram.messenger.t2.D.a();
                                String k10 = j10 >= 0 ? h20.k(vp.r1(q0Var.a).Z1(Long.valueOf(j10))) : "";
                                (vp.r1(q0Var.a).A3() ? new cc((FrameLayout) q0Var.b, q0Var.I0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131743786, k10))) : new cc((FrameLayout) q0Var.b, q0Var.I0).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131743786, k10)), cd.L0(2131743785, null), new kg.a0(q0Var, r14 ? 1 : 0))).j();
                                break;
                            }
                        } else {
                            if (hashSet.contains(object)) {
                                hashSet.remove(object);
                            } else {
                                hashSet.add(object);
                            }
                            j4Var.c(hashSet.contains(object), true);
                            q0Var.E1();
                            break;
                        }
                    }
                }
                break;
            case 7:
                kg.b1 b1Var = (kg.b1) obj2;
                if (view != null) {
                    b1Var.z1(view, true);
                    b1Var.k3 = false;
                    b1Var.w0(0, view.getTop() - ((b1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.i0.H);
                    break;
                }
                break;
            case 8:
                ((o90) obj2).h(view);
                break;
            case 9:
                ((oh.q) obj2).h(view);
                break;
            case 10:
                t3 t3Var = (t3) obj2;
                vh.d dVar = t3Var.U1;
                HashSet hashSet2 = t3Var.R1;
                p51 p51Var = t3Var.Y1;
                if (p51Var != null && (G = p51Var.G(i10 - 1)) != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                        int i22 = savedStarGift.msg_id;
                        long j11 = i22 == 0 ? savedStarGift.saved_id : i22;
                        if (hashSet2.contains(Long.valueOf(j11))) {
                            hashSet2.remove(Long.valueOf(j11));
                            ((ph.c1) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet2.add(Long.valueOf(j11));
                            ((ph.c1) view).c(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet2.size() > 0);
                        dVar.c(hashSet2.size(), true);
                        break;
                    }
                }
                break;
            case 11:
                qh.f0 f0Var = (qh.f0) obj2;
                if ((view instanceof qh.l) && (document = ((qh.l) view).e) != null) {
                    long j12 = document.id;
                    if (j12 != 0) {
                        qh.i0 i0Var = f0Var.a;
                        if (i0Var.d != null) {
                            if (i0Var.getUserConfig().q() || ((g0Var = i0Var.h) != null && g0Var.H.contains(Long.valueOf(j12)))) {
                                qh.x0 x0Var2 = i0Var.d;
                                int i23 = x0Var2.b;
                                String l4 = a1.g.l(j12, "c:");
                                HashMap hashMap = x0Var2.J;
                                if (!hashMap.containsKey(l4)) {
                                    f5 l10 = f5.l(i23, 2, document);
                                    l10.a(x0Var2);
                                    hashMap.put(l4, l10);
                                }
                                if (l4 != null && !l4.startsWith("c:")) {
                                    l4 = l4.replace("️", "");
                                }
                                ArrayList arrayList2 = x0Var2.I;
                                int indexOf = arrayList2.indexOf(l4);
                                if (indexOf >= 0) {
                                    arrayList2.remove(indexOf);
                                } else {
                                    if (arrayList2.size() >= 6) {
                                        arrayList2.remove(0);
                                    }
                                    arrayList2.add(l4);
                                }
                                x0Var2.c();
                                x0Var2.i0();
                                qh.g0 g0Var2 = i0Var.h;
                                if (g0Var2 != null) {
                                    ArrayList a2 = g0Var2.a();
                                    a2.remove(Long.valueOf(j12));
                                    a2.add(0, Long.valueOf(j12));
                                    while (a2.size() > 21) {
                                        a1.g.x(1, a2);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i24 = 0; i24 < a2.size(); i24++) {
                                        if (i24 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a2.get(i24));
                                    }
                                    vp.r1(g0Var2.a).f7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    g0Var2.J = true;
                                    break;
                                }
                            } else {
                                qh.x0 x0Var3 = i0Var.d;
                                x0Var3.getClass();
                                x0Var3.d1(0, cd.L0(2131746490, null), cd.L0(2131746488, null));
                                x0Var3.i0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 12:
                h8.B0((h8) obj2, i10);
                break;
            case 13:
                t7 t7Var = (t7) obj2;
                p51 p51Var2 = t7Var.T1;
                if (p51Var2 != null && (G2 = p51Var2.G(i10 - 1)) != null) {
                    p51 p51Var3 = t7Var.T1;
                    if (G2.d == -1) {
                        t7Var.U1 = !t7Var.U1;
                        p51Var3.O(true);
                        t7Var.k1.w0(0, org.telegram.messenger.i0.L(200.0f), gr.g);
                        break;
                    } else if (G2.H(u7.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.i0.W(t7Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.I1;
                        }
                        if (W != null) {
                            long j13 = t7Var.R1.id;
                            e6 y3 = e6.y(t7Var.a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            q70 q70Var = new q70(t7Var, G2, j13, 2);
                            int i25 = y3.a;
                            if (vp.r1(i25).k7) {
                                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                                if (Q2 != null && Q2.getContext() != null) {
                                    e6.c0(Q2.getContext(), Q2.getResourceProvider());
                                    break;
                                } else {
                                    e6.c0(W, null);
                                    break;
                                }
                            } else if (org.telegram.messenger.v2.b() || !org.telegram.messenger.u1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.user_id = vp.r1(i25).n1(j13);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = xh.m2.u(e6.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i25).sendRequest(tL_payments_getPaymentForm, new p0(y3, q70Var, tL_inputInvoiceStars, 22));
                                break;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.user_id = vp.r1(i25).n1(j13);
                                c5.a aVar2 = new c5.a();
                                aVar2.c = "inapp";
                                aVar2.b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.u1.i().o(Arrays.asList(aVar2.a()), new f1.a(y3, q70Var, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, W));
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                x7 x7Var = (x7) obj2;
                p51 p51Var4 = x7Var.W1;
                if (p51Var4 != null && (G3 = p51Var4.G(i10 - 1)) != null) {
                    p51 p51Var5 = x7Var.W1;
                    if (G3.d == -1) {
                        x7Var.X1 = !x7Var.X1;
                        p51Var5.O(true);
                        break;
                    } else if (G3.H(u7.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.i0.W(x7Var.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.I1;
                        }
                        if (W2 != null) {
                            e6.y(x7Var.a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new s6(i14, x7Var, G3), x7Var.U1);
                            break;
                        }
                    }
                }
                break;
            case 15:
                y7 y7Var = (y7) obj2;
                p51 p51Var6 = y7Var.Q1;
                if (p51Var6 != null && (G4 = p51Var6.G(i10 - 1)) != null) {
                    p51 p51Var7 = y7Var.Q1;
                    if (G4.d == -1) {
                        y7Var.R1 = !y7Var.R1;
                        p51Var7.O(true);
                        y7Var.k1.w0(0, org.telegram.messenger.i0.L(300.0f), null);
                        break;
                    } else if (G4.H(u7.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.i0.W(y7Var.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.I1;
                        }
                        if (W3 != null) {
                            e6.y(y7Var.a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new s6(i13, y7Var, G4), null);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ((uw) obj2).i((th.l) view, false);
                break;
            case 17:
                uh.i iVar = (uh.i) obj2;
                uq0 uq0Var = iVar.W;
                org.telegram.ui.ActionBar.k2 k2Var = uq0Var.a;
                if (view instanceof s7) {
                    jj messageObject = ((s7) view).getMessageObject();
                    if (uq0Var.G.E1) {
                        if (uq0Var.c(messageObject)) {
                            uq0Var.g(messageObject);
                            break;
                        } else {
                            uq0Var.e(messageObject);
                            break;
                        }
                    } else {
                        o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
                        Context context = iVar.getContext();
                        int f12 = messageObject.f1();
                        q4 q4Var = iVar.a;
                        n5 a10 = n5.a(iVar.f);
                        if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).r1) {
                            i15 = org.telegram.messenger.i0.L(68.0f);
                        }
                        a10.s += i15;
                        orCreateStoryViewer.Q(context, f12, q4Var, a10);
                        break;
                    }
                }
                break;
            case 18:
                q20 q20Var = ((vh.t) obj2).c;
                if (q20Var != null) {
                    q20Var.a((vh.r) vh.r.a().get(i10));
                    break;
                }
                break;
            case 19:
                vh.g1 g1Var = (vh.g1) obj2;
                vh.u1 u1Var = g1Var.r;
                Object F = g1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                }
                m20 m20Var = u1Var.v1;
                if (m20Var != null) {
                    m20Var.i(botInlineResult, document2, Boolean.TRUE);
                }
                u1Var.dismiss();
                break;
            case 20:
                vh.l1 l1Var = (vh.l1) obj2;
                vh.u1 u1Var2 = l1Var.s;
                vh.k1 k1Var = l1Var.c;
                if (i10 >= 0) {
                    l1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList3 = k1Var.s;
                        ArrayList arrayList4 = k1Var.w;
                        TLRPC.Document document3 = i10 < arrayList3.size() ? (TLRPC.Document) k1Var.s.get(i10) : null;
                        if (document3 == u1Var2.l1) {
                            n nVar = u1Var2.w1;
                            if (nVar != null) {
                                nVar.run();
                            }
                            u1Var2.dismiss();
                            break;
                        } else {
                            long longValue = i10 >= arrayList4.size() ? 0L : ((Long) arrayList4.get(i10)).longValue();
                            if (document3 == null && (view instanceof vh.a1) && (f5Var = ((vh.a1) view).d) != null) {
                                document3 = f5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                document3 = f5.e(u1Var2.a, longValue);
                            }
                            if (document3 != null) {
                                m20 m20Var2 = u1Var2.v1;
                                if (m20Var2 != null) {
                                    m20Var2.i(k1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                u1Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 21:
                vh.s7 s7Var = (vh.s7) obj2;
                ig.h0 h0Var2 = (ig.h0) ig.h0.c().get(i10);
                s7Var.U0.setTypeface(h0Var2.a);
                ig.s0 e7 = ig.s0.e(s7Var.o1);
                String str2 = h0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                jg.j jVar2 = s7Var.s0;
                if (jVar2 instanceof jg.g3) {
                    ((jg.g3) jVar2).setTypeface(h0Var2);
                }
                s7Var.M0(false);
                break;
            case 22:
                wh.g.z0((wh.g) obj2, i10);
                break;
            case 23:
                p51 p51Var8 = ((wh.f) obj2).U1;
                if (p51Var8 != null) {
                    p51Var8.G(i10 - 1);
                    break;
                }
                break;
            case 24:
                xh.i.C0((xh.i) obj2, i10);
                break;
            default:
                zf.z zVar = (zf.z) obj2;
                if (view instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var2 = (org.telegram.ui.Cells.q4) view;
                    if (q4Var2.E) {
                        mx mxVar = zVar.U;
                        if (mxVar != null) {
                            mxVar.a.Y4(q4Var2.getDialogId(), view);
                            break;
                        }
                    }
                }
                mx mxVar2 = zVar.U;
                if (mxVar2 != null) {
                    ay ayVar = mxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!ayVar.l2) {
                        Bundle bundle = new Bundle();
                        if (o5.E(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        ayVar.U3();
                        if (org.telegram.messenger.i0.Q1() && ayVar.e0 != null) {
                            int i26 = 0;
                            while (true) {
                                zx[] zxVarArr = ayVar.e0;
                                if (i26 < zxVarArr.length) {
                                    lw lwVar = zxVarArr[i26].d;
                                    ayVar.p2.a = longValue2;
                                    lwVar.s = longValue2;
                                    i26++;
                                } else {
                                    int i27 = vp.D8;
                                    ayVar.t5(512, true);
                                }
                            }
                        }
                        if (ayVar.n2 != null) {
                            if (ayVar.getMessagesController().E(bundle, ayVar, null, null)) {
                                ayVar.getNotificationCenter().k(4, new Object[0]);
                                ayVar.presentFragment(new un(bundle));
                                break;
                            }
                        } else if (ayVar.getMessagesController().E(bundle, ayVar, null, null)) {
                            ayVar.presentFragment(new un(bundle));
                            break;
                        }
                    } else if (ayVar.u5(longValue2)) {
                        if (ayVar.I2.isEmpty()) {
                            ayVar.Z3(longValue2, 0L, true, null);
                            break;
                        } else {
                            ayVar.a4(longValue2, ayVar.r3(longValue2, null));
                            ayVar.n5();
                            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            lVar.k(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
