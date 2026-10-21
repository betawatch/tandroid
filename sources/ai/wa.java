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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.gt0;
import org.telegram.ui.jw;
import org.telegram.ui.nx;
import org.telegram.ui.qn;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h61 G;
        TLRPC.Document document2;
        zh.k0 k0Var;
        switch (this.a) {
            case 0:
                md.y0((md) this.b, i10);
                break;
            case 1:
                vc.Q((vc) this.b, i10);
                break;
            case 2:
                cd.Q((cd) this.b, i10);
                break;
            case 3:
                dd.Q((dd) this.b, i10);
                break;
            case 4:
                ((tw) this.b).i((ci.q) view, false);
                break;
            case 5:
                di.r rVar = (di.r) this.b;
                js0 js0Var = rVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = js0Var.a;
                if (view instanceof org.telegram.ui.Cells.s7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                    if (js0Var.G.C1) {
                        if (js0Var.c(messageObject)) {
                            js0Var.g(messageObject);
                            break;
                        } else {
                            js0Var.e(messageObject);
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
                qg.m0 m0Var = (qg.m0) qg.m0.c().get(i10);
                xaVar.l1.setTypeface(m0Var.a);
                qg.v0 e = qg.v0.e(xaVar.F1);
                String str = m0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.v2) {
                    ((rg.v2) jVar).setTypeface(m0Var);
                }
                xaVar.O0(false);
                break;
            case 10:
                fi.g.y0((fi.g) this.b, i10);
                break;
            case 11:
                u61 u61Var = ((fi.f) this.b).b0;
                if (u61Var != null) {
                    u61Var.G(i10 - 1);
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
                        nx nxVar = h0Var.U;
                        if (nxVar != null) {
                            nxVar.a.L4(m4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                nx nxVar2 = h0Var.U;
                if (nxVar2 != null) {
                    cy cyVar = nxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!cyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        cyVar.H3();
                        if (AndroidUtilities.isTablet() && cyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                ay[] ayVarArr = cyVar.e0;
                                if (i12 < ayVarArr.length) {
                                    jw jwVar = ayVarArr[i12].d;
                                    cyVar.p2.dialogId = longValue2;
                                    jwVar.s = longValue2;
                                    i12++;
                                } else {
                                    cyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (cyVar.n2 != null) {
                            if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                                cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                cyVar.presentFragment(new qn(bundle));
                                break;
                            }
                        } else if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                            cyVar.presentFragment(new qn(bundle));
                            break;
                        }
                    } else if (cyVar.f5(longValue2)) {
                        if (cyVar.I2.isEmpty()) {
                            cyVar.M3(longValue2, 0L, true, null);
                            break;
                        } else {
                            cyVar.N3(longValue2, cyVar.f3(longValue2, null));
                            cyVar.Y4();
                            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
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
                if (O instanceof ig.z1) {
                    if (UserConfig.getInstance(tiVar.M1).isPremium()) {
                        ig.z1 z1Var = (ig.z1) O;
                        org.telegram.ui.Components.f5.Z(tiVar.M1, z1Var.a(), tiVar.p1(), new o2(23, i0Var, z1Var));
                        break;
                    } else if (tiVar.f0 != null) {
                        new sg.y0(tiVar.f0, i0Var.getContext(), tiVar.M1, true, 31, false, null).show();
                        break;
                    }
                }
                break;
            case 15:
                ig.k0 k0Var2 = (ig.k0) this.b;
                h61 G2 = k0Var2.d0.G(i10 - 1);
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
                gt0 gt0Var = (gt0) this.b;
                qg.m0 m0Var2 = (qg.m0) qg.m0.c().get(i10);
                gt0Var.u1.setTypeface(m0Var2.a);
                qg.v0 e7 = qg.v0.e(gt0Var.P1);
                String str2 = m0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = gt0Var.S0;
                if (jVar2 instanceof rg.v2) {
                    ((rg.v2) jVar2).setTypeface(m0Var2);
                }
                gt0Var.A0(false);
                break;
            case 19:
                rg.i1 i1Var = (rg.i1) this.b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                qg.v0 v0Var = i1Var.Y2;
                v0Var.c.put(Integer.valueOf(v0Var.f), Integer.valueOf(v0Var.b(i10)));
                v0Var.e = true;
                break;
            case 20:
                sg.k0.X((sg.k0) this.b, view);
                break;
            case 21:
                sg.t0 t0Var = (sg.t0) this.b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.b3 = false;
                    t0Var.v0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
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
                yh.k4 k4Var = (yh.k4) this.b;
                ei.d dVar = k4Var.c0;
                HashSet hashSet = k4Var.Z;
                u61 u61Var2 = k4Var.e0;
                if (u61Var2 != null && (G = u61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j10 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.g1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.g1) view).b(true, true);
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
                if ((view instanceof zh.l) && (document2 = ((zh.l) view).e) != null) {
                    long j11 = document2.id;
                    if (j11 != 0) {
                        zh.n0 n0Var = j0Var.a;
                        if (n0Var.d != null) {
                            if (n0Var.getUserConfig().isPremium() || ((k0Var = n0Var.h) != null && k0Var.H.contains(Long.valueOf(j11)))) {
                                zh.c1 c1Var = n0Var.d;
                                int i19 = c1Var.b;
                                String o10 = a1.g.o(j11, "c:");
                                HashMap hashMap = c1Var.J;
                                if (!hashMap.containsKey(o10)) {
                                    org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i19, 2, document2);
                                    m10.a(c1Var);
                                    hashMap.put(o10, m10);
                                }
                                if (o10 != null && !o10.startsWith("c:")) {
                                    o10 = o10.replace("️", "");
                                }
                                ArrayList arrayList4 = c1Var.I;
                                int indexOf = arrayList4.indexOf(o10);
                                if (indexOf >= 0) {
                                    arrayList4.remove(indexOf);
                                } else {
                                    if (arrayList4.size() >= 6) {
                                        arrayList4.remove(0);
                                    }
                                    arrayList4.add(o10);
                                }
                                c1Var.c();
                                c1Var.i0();
                                zh.k0 k0Var3 = n0Var.h;
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
                                zh.c1 c1Var2 = n0Var.d;
                                c1Var2.getClass();
                                c1Var2.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                c1Var2.i0();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
