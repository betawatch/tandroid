package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.dd;
import bi.nc;
import bi.tc;
import bi.uc;
import di.q7;
import di.s6;
import di.y9;
import fi.l2;
import fi.ta;
import fi.y1;
import fi.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jg.b2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.iw;
import org.telegram.ui.ox;
import org.telegram.ui.pt0;
import org.telegram.ui.sw;
import org.telegram.ui.wn;
import sg.w2;
import zh.l4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        TLRPC.Document document;
        x0 x0Var;
        TLRPC.Document document2;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        t5 t5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        u61 G;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.b;
                if ((view instanceof q) && (document = ((q) view).e) != null) {
                    long j10 = document.id;
                    if (j10 != 0) {
                        z0 z0Var = w0Var.a;
                        if (z0Var.d != null) {
                            if (z0Var.getUserConfig().isPremium() || ((x0Var = z0Var.h) != null && x0Var.H.contains(Long.valueOf(j10)))) {
                                t1 t1Var = z0Var.d;
                                int i12 = t1Var.b;
                                String o10 = a1.g.o(j10, "c:");
                                HashMap hashMap = t1Var.J;
                                if (!hashMap.containsKey(o10)) {
                                    t5 m10 = t5.m(i12, 2, document);
                                    m10.a(t1Var);
                                    hashMap.put(o10, m10);
                                }
                                if (o10 != null && !o10.startsWith("c:")) {
                                    o10 = o10.replace("️", "");
                                }
                                ArrayList arrayList = t1Var.I;
                                int indexOf = arrayList.indexOf(o10);
                                if (indexOf >= 0) {
                                    arrayList.remove(indexOf);
                                } else {
                                    if (arrayList.size() >= 6) {
                                        arrayList.remove(0);
                                    }
                                    arrayList.add(o10);
                                }
                                t1Var.c();
                                t1Var.i0();
                                x0 x0Var2 = z0Var.h;
                                if (x0Var2 != null) {
                                    ArrayList a2 = x0Var2.a();
                                    a2.remove(Long.valueOf(j10));
                                    a2.add(0, Long.valueOf(j10));
                                    while (a2.size() > 21) {
                                        a1.g.A(1, a2);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i13 = 0; i13 < a2.size(); i13++) {
                                        if (i13 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a2.get(i13));
                                    }
                                    MessagesController.getMainSettings(x0Var2.a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    x0Var2.J = true;
                                    break;
                                }
                            } else {
                                t1 t1Var2 = z0Var.d;
                                t1Var2.getClass();
                                t1Var2.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                t1Var2.i0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                dd.y0((dd) this.b, i10);
                break;
            case 2:
                nc.P((nc) this.b, i10);
                break;
            case 3:
                tc.P((tc) this.b, i10);
                break;
            case 4:
                uc.P((uc) this.b, i10);
                break;
            case 5:
                ((sw) this.b).i((di.q) view, false);
                break;
            case 6:
                ei.r rVar = (ei.r) this.b;
                vs0 vs0Var = rVar.W;
                r2 r2Var = vs0Var.a;
                if (view instanceof w7) {
                    MessageObject messageObject = ((w7) view).getMessageObject();
                    if (vs0Var.G.E1) {
                        if (vs0Var.c(messageObject)) {
                            vs0Var.g(messageObject);
                            break;
                        } else {
                            vs0Var.e(messageObject);
                            break;
                        }
                    } else {
                        y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        s6 s6Var = rVar.a;
                        q7 a10 = q7.a(rVar.f);
                        a10.s += ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.D(context, id2, s6Var, a10);
                        break;
                    }
                }
                break;
            case 7:
                Utilities.Callback callback = ((fi.y) this.b).c;
                if (callback != null) {
                    callback.run((fi.t) fi.t.a().get(i10));
                    break;
                }
                break;
            case 8:
                fi.u1 u1Var = (fi.u1) this.b;
                l2 l2Var = u1Var.r;
                Object F = u1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = l2Var.E;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document2, Boolean.TRUE);
                }
                l2Var.dismiss();
                break;
            case 9:
                z1 z1Var = (z1) this.b;
                l2 l2Var2 = z1Var.s;
                y1 y1Var = z1Var.c;
                if (i10 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList2 = y1Var.s;
                        ArrayList arrayList3 = y1Var.v;
                        TLRPC.Document document3 = i10 >= arrayList2.size() ? null : (TLRPC.Document) y1Var.s.get(i10);
                        if (document3 == l2Var2.e) {
                            jg.g gVar = l2Var2.F;
                            if (gVar != null) {
                                gVar.run();
                            }
                            l2Var2.dismiss();
                            break;
                        } else {
                            long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
                            if (document3 == null && (view instanceof fi.m1) && (t5Var = ((fi.m1) view).d) != null) {
                                document3 = t5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                i11 = ((k3) l2Var2).currentAccount;
                                document3 = t5.f(i11, longValue);
                            }
                            if (document3 != null) {
                                Utilities.Callback3Return callback3Return2 = l2Var2.E;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(y1Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                l2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                ta taVar = (ta) this.b;
                rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
                taVar.a1.setTypeface(j0Var.a);
                rg.s0 e = rg.s0.e(taVar.u1);
                String str = j0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                sg.j jVar = taVar.y0;
                if (jVar instanceof w2) {
                    ((w2) jVar).setTypeface(j0Var);
                }
                taVar.M0(false);
                break;
            case 11:
                gi.h.w0((gi.h) this.b, i10);
                break;
            case 12:
                k71 k71Var = ((gi.g) this.b).c0;
                if (k71Var != null) {
                    k71Var.G(i10 - 1);
                    break;
                }
                break;
            case 13:
                hi.k.z0((hi.k) this.b, i10);
                break;
            case 14:
                ig.i0 i0Var = (ig.i0) this.b;
                if (view instanceof r4) {
                    r4 r4Var = (r4) view;
                    if (r4Var.E) {
                        ox oxVar = i0Var.U;
                        if (oxVar != null) {
                            oxVar.a.V4(r4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                ox oxVar2 = i0Var.U;
                if (oxVar2 != null) {
                    ey eyVar = oxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!eyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        eyVar.R3();
                        if (AndroidUtilities.isTablet() && eyVar.e0 != null) {
                            int i14 = 0;
                            while (true) {
                                dy[] dyVarArr = eyVar.e0;
                                if (i14 < dyVarArr.length) {
                                    iw iwVar = dyVarArr[i14].d;
                                    eyVar.p2.dialogId = longValue2;
                                    iwVar.s = longValue2;
                                    i14++;
                                } else {
                                    eyVar.q5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (eyVar.n2 != null) {
                            if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                                eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                eyVar.presentFragment(new wn(bundle));
                                break;
                            }
                        } else if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                            eyVar.presentFragment(new wn(bundle));
                            break;
                        }
                    } else if (eyVar.r5(longValue2)) {
                        if (eyVar.I2.isEmpty()) {
                            eyVar.W3(longValue2, 0L, true, null);
                            break;
                        } else {
                            eyVar.X3(longValue2, eyVar.p3(longValue2, null));
                            eyVar.k5();
                            kVar = ((r2) eyVar).actionBar;
                            kVar.g(true);
                            break;
                        }
                    }
                }
                break;
            case 15:
                jg.i0 i0Var2 = (jg.i0) this.b;
                jg.f0 f0Var = i0Var2.x;
                ti tiVar = i0Var2.b;
                s4.h0 adapter = i0Var2.s.getAdapter();
                jg.g0 g0Var = i0Var2.y;
                if (adapter == g0Var) {
                    ArrayList arrayList4 = g0Var.d;
                    int i15 = i10 - 1;
                    O = (i15 < 0 || i15 >= arrayList4.size()) ? null : arrayList4.get(i15);
                } else {
                    int S = f0Var.S(i10);
                    int Q = f0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = f0Var.O(S, Q);
                    }
                }
                if (O instanceof b2) {
                    if (UserConfig.getInstance(tiVar.M1).isPremium()) {
                        b2 b2Var = (b2) O;
                        g5.Z(tiVar.M1, b2Var.a(), tiVar.t1(), new n1(25, i0Var2, b2Var));
                        break;
                    } else if (tiVar.f0 != null) {
                        new tg.y0(tiVar.f0, i0Var2.getContext(), tiVar.M1, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 16:
                jg.k0 k0Var = (jg.k0) this.b;
                u61 G2 = k0Var.e0.G(i10 - 1);
                if (G2 != null) {
                    jg.b0 b0Var = k0Var.Z;
                    if (!b0Var.h(G2)) {
                        int i16 = G2.d;
                        int i17 = jg.k0.k0;
                        if (i16 == -1) {
                            k0Var.f0 = true;
                            b0Var.h = true;
                            k0Var.e0.O(true);
                            k0Var.T(true);
                            break;
                        } else {
                            int i18 = jg.k0.l0;
                            if (i16 == -2) {
                                k0Var.f0 = false;
                                b0Var.h = false;
                                k0Var.e0.O(true);
                                k0Var.T(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                ki.a aVar = (ki.a) this.b;
                int i19 = aVar.X.G(i10 - 1).d;
                if (i19 == 151) {
                    aVar.Q(false);
                    break;
                } else if (i19 == 150) {
                    aVar.Q(true);
                    break;
                }
                break;
            case 18:
                og.i iVar = (og.i) this.b;
                Runnable runnable = ((og.a) iVar.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 19:
                pt0 pt0Var = (pt0) this.b;
                rg.j0 j0Var2 = (rg.j0) rg.j0.c().get(i10);
                pt0Var.j1.setTypeface(j0Var2.a);
                rg.s0 e10 = rg.s0.e(pt0Var.E1);
                String str2 = j0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                sg.j jVar2 = pt0Var.H0;
                if (jVar2 instanceof w2) {
                    ((w2) jVar2).setTypeface(j0Var2);
                }
                pt0Var.y0(false);
                break;
            case 20:
                sg.j1 j1Var = (sg.j1) this.b;
                j1Var.j3.accept(Integer.valueOf(j1Var.i3.b(i10)));
                rg.s0 s0Var = j1Var.i3;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                break;
            case 21:
                tg.j0.W((tg.j0) this.b, view);
                break;
            case 22:
                tg.s0 s0Var2 = (tg.s0) this.b;
                if (view != null) {
                    s0Var2.C1(view, true);
                    s0Var2.l3 = false;
                    s0Var2.w0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 23:
                ((va0) this.b).h(view);
                break;
            case 24:
                ((yh.k) this.b).h(view);
                break;
            default:
                l4 l4Var = (l4) this.b;
                fi.d dVar = l4Var.c0;
                HashSet hashSet = l4Var.Z;
                k71 k71Var2 = l4Var.g0;
                if (k71Var2 != null && (G = k71Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i20 = savedStarGift.msg_id;
                        long j11 = i20 == 0 ? savedStarGift.saved_id : i20;
                        if (hashSet.contains(Long.valueOf(j11))) {
                            hashSet.remove(Long.valueOf(j11));
                            ((zh.g1) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j11));
                            ((zh.g1) view).c(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
        }
    }
}
