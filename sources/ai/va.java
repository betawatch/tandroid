package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.it0;
import org.telegram.ui.lw;
import org.telegram.ui.px;
import org.telegram.ui.sn;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        f61 G;
        TLRPC.Document document2;
        zh.k0 k0Var;
        switch (this.a) {
            case 0:
                ld.y0((ld) this.b, i10);
                break;
            case 1:
                uc.Q((uc) this.b, i10);
                break;
            case 2:
                bd.Q((bd) this.b, i10);
                break;
            case 3:
                cd.Q((cd) this.b, i10);
                break;
            case 4:
                ((vw) this.b).i((ci.q) view, false);
                break;
            case 5:
                di.r rVar = (di.r) this.b;
                hs0 hs0Var = rVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = hs0Var.a;
                if (view instanceof org.telegram.ui.Cells.s7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                    if (hs0Var.G.C1) {
                        if (hs0Var.c(messageObject)) {
                            hs0Var.g(messageObject);
                            break;
                        } else {
                            hs0Var.e(messageObject);
                            break;
                        }
                    } else {
                        ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        ci.t6 t6Var = rVar.a;
                        ci.r7 a2 = ci.r7.a(rVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).t1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, t6Var, a2);
                        break;
                    }
                }
                break;
            case 6:
                Utilities.Callback callback = ((ei.y) this.b).c;
                if (callback != null) {
                    callback.run((ei.t) ei.t.a().get(i10));
                    break;
                }
                break;
            case 7:
                ei.v1 v1Var = (ei.v1) this.b;
                ei.n2 n2Var2 = v1Var.r;
                Object F = v1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = n2Var2.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var2.dismiss();
                break;
            case 8:
                ei.b2 b2Var = (ei.b2) this.b;
                ei.n2 n2Var3 = b2Var.s;
                ei.a2 a2Var = b2Var.c;
                if (i10 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = a2Var.s;
                        ArrayList arrayList2 = a2Var.v;
                        TLRPC.Document document3 = i10 >= arrayList.size() ? null : (TLRPC.Document) a2Var.s.get(i10);
                        if (document3 == n2Var3.e) {
                            ig.g gVar = n2Var3.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            n2Var3.dismiss();
                            break;
                        } else {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document3 == null && (view instanceof ei.n1) && (r5Var = ((ei.n1) view).c) != null) {
                                document3 = r5Var.e;
                            }
                            if (document3 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) n2Var3).currentAccount;
                                document3 = org.telegram.ui.Components.r5.f(i11, longValue);
                            }
                            if (document3 != null) {
                                Utilities.Callback3Return callback3Return2 = n2Var3.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(a2Var.f.get(Long.valueOf(document3.id)), document3, Boolean.FALSE);
                                }
                                n2Var3.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                ei.xa xaVar = (ei.xa) this.b;
                qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
                xaVar.l1.setTypeface(l0Var.a);
                qg.u0 e = qg.u0.e(xaVar.F1);
                String str = l0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.v2) {
                    ((rg.v2) jVar).setTypeface(l0Var);
                }
                xaVar.O0(false);
                break;
            case 10:
                fi.g.y0((fi.g) this.b, i10);
                break;
            case 11:
                s61 s61Var = ((fi.f) this.b).b0;
                if (s61Var != null) {
                    s61Var.G(i10 - 1);
                    break;
                }
                break;
            case 12:
                gi.l.B0((gi.l) this.b, i10);
                break;
            case 13:
                hg.h0 h0Var = (hg.h0) this.b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        px pxVar = h0Var.U;
                        if (pxVar != null) {
                            pxVar.a.L4(m4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                px pxVar2 = h0Var.U;
                if (pxVar2 != null) {
                    ey eyVar = pxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!eyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        eyVar.H3();
                        if (AndroidUtilities.isTablet() && eyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                dy[] dyVarArr = eyVar.e0;
                                if (i12 < dyVarArr.length) {
                                    lw lwVar = dyVarArr[i12].d;
                                    eyVar.p2.dialogId = longValue2;
                                    lwVar.s = longValue2;
                                    i12++;
                                } else {
                                    eyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (eyVar.n2 != null) {
                            if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                                eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                eyVar.presentFragment(new sn(bundle));
                                break;
                            }
                        } else if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                            eyVar.presentFragment(new sn(bundle));
                            break;
                        }
                    } else if (eyVar.f5(longValue2)) {
                        if (eyVar.I2.isEmpty()) {
                            eyVar.M3(longValue2, 0L, true, null);
                            break;
                        } else {
                            eyVar.N3(longValue2, eyVar.f3(longValue2, null));
                            eyVar.Y4();
                            kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                            kVar.h(true);
                            break;
                        }
                    }
                }
                break;
            case 14:
                ig.i0 i0Var = (ig.i0) this.b;
                ig.f0 f0Var = i0Var.x;
                ti tiVar = i0Var.b;
                s4.g0 adapter = i0Var.s.getAdapter();
                ig.g0 g0Var = i0Var.y;
                if (adapter == g0Var) {
                    ArrayList arrayList3 = g0Var.d;
                    int i13 = i10 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = f0Var.S(i10);
                    int Q = f0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = f0Var.O(S, Q);
                    }
                }
                if (O instanceof ig.x1) {
                    if (UserConfig.getInstance(tiVar.M1).isPremium()) {
                        ig.x1 x1Var = (ig.x1) O;
                        org.telegram.ui.Components.f5.Z(tiVar.M1, x1Var.a(), tiVar.p1(), new n2(23, i0Var, x1Var));
                        break;
                    } else if (tiVar.f0 != null) {
                        new sg.x0(tiVar.f0, i0Var.getContext(), tiVar.M1, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 15:
                ig.k0 k0Var2 = (ig.k0) this.b;
                f61 G2 = k0Var2.d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var2.Z;
                    if (!a0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = ig.k0.g0;
                        if (i14 == -1) {
                            k0Var2.e0 = true;
                            a0Var.h = true;
                            k0Var2.d0.N(true);
                            k0Var2.U(true);
                            break;
                        } else {
                            int i16 = ig.k0.h0;
                            if (i14 == -2) {
                                k0Var2.e0 = false;
                                a0Var.h = false;
                                k0Var2.d0.N(true);
                                k0Var2.U(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 16:
                ji.a aVar = (ji.a) this.b;
                int i17 = aVar.X.G(i10 - 1).d;
                if (i17 == 151) {
                    aVar.R(false);
                    break;
                } else if (i17 == 150) {
                    aVar.R(true);
                    break;
                }
                break;
            case 17:
                ng.i iVar = (ng.i) this.b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 18:
                it0 it0Var = (it0) this.b;
                qg.l0 l0Var2 = (qg.l0) qg.l0.c().get(i10);
                it0Var.u1.setTypeface(l0Var2.a);
                qg.u0 e7 = qg.u0.e(it0Var.P1);
                String str2 = l0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = it0Var.S0;
                if (jVar2 instanceof rg.v2) {
                    ((rg.v2) jVar2).setTypeface(l0Var2);
                }
                it0Var.A0(false);
                break;
            case 19:
                rg.i1 i1Var = (rg.i1) this.b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                qg.u0 u0Var = i1Var.Y2;
                u0Var.c.put(Integer.valueOf(u0Var.f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                break;
            case 20:
                sg.j0.X((sg.j0) this.b, view);
                break;
            case 21:
                sg.s0 s0Var = (sg.s0) this.b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.b3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 22:
                ((xa0) this.b).h(view);
                break;
            case 23:
                ((xh.k) this.b).h(view);
                break;
            case 24:
                yh.l4 l4Var = (yh.l4) this.b;
                ei.d dVar = l4Var.c0;
                HashSet hashSet = l4Var.Z;
                s61 s61Var2 = l4Var.e0;
                if (s61Var2 != null && (G = s61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j10 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.h1) view).b(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
            default:
                zh.j0 j0Var = (zh.j0) this.b;
                if ((view instanceof zh.r) && (document2 = ((zh.r) view).e) != null) {
                    long j11 = document2.id;
                    if (j11 != 0) {
                        zh.m0 m0Var = j0Var.a;
                        if (m0Var.d != null) {
                            if (m0Var.getUserConfig().isPremium() || ((k0Var = m0Var.h) != null && k0Var.H.contains(Long.valueOf(j11)))) {
                                zh.b1 b1Var = m0Var.d;
                                int i19 = b1Var.b;
                                String o10 = a1.g.o(j11, "c:");
                                HashMap hashMap = b1Var.J;
                                if (!hashMap.containsKey(o10)) {
                                    org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i19, 7, document2);
                                    m10.a(b1Var);
                                    hashMap.put(o10, m10);
                                }
                                ArrayList arrayList4 = b1Var.I;
                                if (o10 != null && !o10.startsWith("c:")) {
                                    o10 = o10.replace("️", "");
                                }
                                if (o10.startsWith("c:")) {
                                    int indexOf = arrayList4.indexOf(o10);
                                    if (indexOf >= 0) {
                                        arrayList4.remove(indexOf);
                                    } else {
                                        if (arrayList4.size() >= 6) {
                                            arrayList4.remove(0);
                                        }
                                        arrayList4.add(o10);
                                    }
                                    b1Var.b();
                                    b1Var.g0();
                                }
                                zh.k0 k0Var3 = m0Var.h;
                                if (k0Var3 != null) {
                                    ArrayList a10 = k0Var3.a();
                                    a10.remove(Long.valueOf(j11));
                                    a10.add(0, Long.valueOf(j11));
                                    while (a10.size() > 21) {
                                        a1.g.y(1, a10);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i20 = 0; i20 < a10.size(); i20++) {
                                        if (i20 > 0) {
                                            sb2.append(',');
                                        }
                                        sb2.append(a10.get(i20));
                                    }
                                    MessagesController.getMainSettings(k0Var3.a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                    k0Var3.J = true;
                                    break;
                                }
                            } else {
                                zh.b1 b1Var2 = m0Var.d;
                                b1Var2.getClass();
                                b1Var2.W0(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                b1Var2.g0();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
