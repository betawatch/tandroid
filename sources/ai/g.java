package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ix;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import org.telegram.ui.tt0;
import org.telegram.ui.xn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.q5 q5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h51 G;
        switch (this.a) {
            case 0:
                ((ix) this.b).i((a0) view, false);
                break;
            case 1:
                bi.u uVar = (bi.u) this.b;
                mr0 mr0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = mr0Var.a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (!mr0Var.G.C1) {
                        jc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = uVar.getContext();
                        int id2 = messageObject.getId();
                        u8 u8Var = uVar.a;
                        u9 a2 = u9.a(uVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, u8Var, a2);
                        break;
                    } else if (!mr0Var.c(messageObject)) {
                        mr0Var.e(messageObject);
                        break;
                    } else {
                        mr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 2:
                Utilities.Callback callback = ((ci.y) this.b).c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    break;
                }
                break;
            case 3:
                ci.z1 z1Var = (ci.z1) this.b;
                ci.s2 s2Var = z1Var.r;
                Object F = z1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = s2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                s2Var.dismiss();
                break;
            case 4:
                ci.e2 e2Var = (ci.e2) this.b;
                ci.s2 s2Var2 = e2Var.s;
                ci.d2 d2Var = e2Var.c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = d2Var.s;
                        ArrayList arrayList2 = d2Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) d2Var.s.get(i10);
                        if (document2 != s2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof ci.o1) && (q5Var = ((ci.o1) view).c) != null) {
                                document2 = q5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) s2Var2).currentAccount;
                                document2 = org.telegram.ui.Components.q5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = s2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(d2Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                s2Var2.dismiss();
                                break;
                            }
                        } else {
                            hg.h hVar = s2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            s2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ci.nb nbVar = (ci.nb) this.b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                nbVar.l1.setTypeface(k0Var.a);
                pg.t0 e = pg.t0.e(nbVar.F1);
                String str = k0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                qg.j jVar = nbVar.J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).setTypeface(k0Var);
                }
                nbVar.P0(false);
                break;
            case 6:
                di.i.x0((di.i) this.b, i10);
                break;
            case 7:
                v51 v51Var = ((di.h) this.b).b0;
                if (v51Var != null) {
                    v51Var.G(i10 - 1);
                    break;
                }
                break;
            case 8:
                ei.l.A0((ei.l) this.b, i10);
                break;
            case 9:
                gg.i0 i0Var = (gg.i0) this.b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        dy dyVar = i0Var.U;
                        if (dyVar != null) {
                            dyVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                dy dyVar2 = i0Var.U;
                if (dyVar2 != null) {
                    ry ryVar = dyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!ryVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        ryVar.J3();
                        if (AndroidUtilities.isTablet() && ryVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                qy[] qyVarArr = ryVar.e0;
                                if (i12 < qyVarArr.length) {
                                    yw ywVar = qyVarArr[i12].d;
                                    ryVar.p2.dialogId = longValue2;
                                    ywVar.s = longValue2;
                                    i12++;
                                } else {
                                    ryVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (ryVar.n2 == null) {
                            if (ryVar.getMessagesController().checkCanOpenChat(bundle, ryVar)) {
                                ryVar.presentFragment(new xn(bundle));
                                break;
                            }
                        } else if (ryVar.getMessagesController().checkCanOpenChat(bundle, ryVar)) {
                            ryVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ryVar.presentFragment(new xn(bundle));
                            break;
                        }
                    } else if (ryVar.h5(longValue2)) {
                        if (!ryVar.I2.isEmpty()) {
                            ryVar.P3(longValue2, ryVar.i3(longValue2, null));
                            ryVar.a5();
                            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            ryVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                hg.k0 k0Var2 = (hg.k0) this.b;
                hg.h0 h0Var = k0Var2.x;
                wi wiVar = k0Var2.b;
                s4.h0 adapter = k0Var2.s.getAdapter();
                hg.i0 i0Var2 = k0Var2.y;
                if (adapter == i0Var2) {
                    ArrayList arrayList3 = i0Var2.d;
                    int i13 = i10 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = h0Var.S(i10);
                    int Q = h0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = h0Var.O(S, Q);
                    }
                }
                if (O instanceof hg.b2) {
                    if (!UserConfig.getInstance(wiVar.J1).isPremium()) {
                        if (wiVar.f0 != null) {
                            new rg.x0(wiVar.f0, k0Var2.getContext(), wiVar.J1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        hg.b2 b2Var = (hg.b2) O;
                        org.telegram.ui.Components.e5.a0(wiVar.J1, b2Var.a(), wiVar.n1(), new g3(17, k0Var2, b2Var));
                        break;
                    }
                }
                break;
            case 11:
                hg.m0 m0Var = (hg.m0) this.b;
                h51 G2 = m0Var.d0.G(i10 - 1);
                if (G2 != null) {
                    hg.c0 c0Var = m0Var.Z;
                    if (!c0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = hg.m0.g0;
                        if (i14 != -1) {
                            int i16 = hg.m0.h0;
                            if (i14 == -2) {
                                m0Var.e0 = false;
                                c0Var.h = false;
                                m0Var.d0.N(true);
                                m0Var.T(true);
                                break;
                            }
                        } else {
                            m0Var.e0 = true;
                            c0Var.h = true;
                            m0Var.d0.N(true);
                            m0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 12:
                hi.b bVar = (hi.b) this.b;
                int i17 = bVar.X.G(i10 - 1).d;
                if (i17 != 151) {
                    if (i17 == 150) {
                        bVar.Q(true);
                        break;
                    }
                } else {
                    bVar.Q(false);
                    break;
                }
                break;
            case 13:
                mg.i iVar = (mg.i) this.b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 14:
                tt0 tt0Var = (tt0) this.b;
                pg.k0 k0Var3 = (pg.k0) pg.k0.c().get(i10);
                tt0Var.u1.setTypeface(k0Var3.a);
                pg.t0 e7 = pg.t0.e(tt0Var.P1);
                String str2 = k0Var3.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = tt0Var.S0;
                if (jVar2 instanceof qg.x2) {
                    ((qg.x2) jVar2).setTypeface(k0Var3);
                }
                tt0Var.A0(false);
                break;
            case 15:
                qg.l1 l1Var = (qg.l1) this.b;
                l1Var.b3.accept(Integer.valueOf(l1Var.a3.b(i10)));
                pg.t0 t0Var = l1Var.a3;
                t0Var.c.put(Integer.valueOf(t0Var.f), Integer.valueOf(t0Var.b(i10)));
                t0Var.e = true;
                break;
            case 16:
                rg.j0.W((rg.j0) this.b, view);
                break;
            case 17:
                rg.s0 s0Var = (rg.s0) this.b;
                if (view != null) {
                    s0Var.w1(view, true);
                    s0Var.d3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((da0) this.b).h(view);
                break;
            case 19:
                ((wh.n) this.b).h(view);
                break;
            case 20:
                xh.m4 m4Var = (xh.m4) this.b;
                ci.d dVar = m4Var.c0;
                HashSet hashSet = m4Var.Z;
                v51 v51Var2 = m4Var.e0;
                if (v51Var2 != null && (G = v51Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j3 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((xh.j1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.j1) view).b(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 21:
                yh.w7.x0((yh.w7) this.b, i10);
                break;
            case 22:
                yh.h7.P((yh.h7) this.b, i10);
                break;
            case 23:
                yh.l7.P((yh.l7) this.b, i10);
                break;
            default:
                yh.m7.P((yh.m7) this.b, i10);
                break;
        }
    }
}
