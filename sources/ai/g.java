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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.bo;
import org.telegram.ui.bx;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.o5 o5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        i51 G;
        switch (this.a) {
            case 0:
                ((lx) this.b).i((a0) view, false);
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
                        t8 t8Var = uVar.a;
                        u9 a2 = u9.a(uVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, t8Var, a2);
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
                ci.t2 t2Var = z1Var.r;
                Object F = z1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = t2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                t2Var.dismiss();
                break;
            case 4:
                ci.e2 e2Var = (ci.e2) this.b;
                ci.t2 t2Var2 = e2Var.s;
                ci.d2 d2Var = e2Var.c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = d2Var.s;
                        ArrayList arrayList2 = d2Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) d2Var.s.get(i10);
                        if (document2 != t2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof ci.o1) && (o5Var = ((ci.o1) view).c) != null) {
                                document2 = o5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) t2Var2).currentAccount;
                                document2 = org.telegram.ui.Components.o5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = t2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(d2Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                t2Var2.dismiss();
                                break;
                            }
                        } else {
                            hg.h hVar = t2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            t2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ci.qb qbVar = (ci.qb) this.b;
                pg.j0 j0Var = (pg.j0) pg.j0.c().get(i10);
                qbVar.l1.setTypeface(j0Var.a);
                pg.s0 e = pg.s0.e(qbVar.F1);
                String str = j0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                qg.j jVar = qbVar.J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).setTypeface(j0Var);
                }
                qbVar.P0(false);
                break;
            case 6:
                di.i.x0((di.i) this.b, i10);
                break;
            case 7:
                w51 w51Var = ((di.h) this.b).b0;
                if (w51Var != null) {
                    w51Var.G(i10 - 1);
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
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    uy uyVar = gyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!uyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        uyVar.J3();
                        if (AndroidUtilities.isTablet() && uyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                ty[] tyVarArr = uyVar.e0;
                                if (i12 < tyVarArr.length) {
                                    bx bxVar = tyVarArr[i12].d;
                                    uyVar.p2.dialogId = longValue2;
                                    bxVar.s = longValue2;
                                    i12++;
                                } else {
                                    uyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (uyVar.n2 == null) {
                            if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                                uyVar.presentFragment(new bo(bundle));
                                break;
                            }
                        } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new bo(bundle));
                            break;
                        }
                    } else if (uyVar.h5(longValue2)) {
                        if (!uyVar.I2.isEmpty()) {
                            uyVar.P3(longValue2, uyVar.i3(longValue2, null));
                            uyVar.a5();
                            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            uyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                hg.k0 k0Var = (hg.k0) this.b;
                hg.h0 h0Var = k0Var.x;
                vi viVar = k0Var.b;
                s4.h0 adapter = k0Var.s.getAdapter();
                hg.i0 i0Var2 = k0Var.y;
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
                    if (!UserConfig.getInstance(viVar.J1).isPremium()) {
                        if (viVar.f0 != null) {
                            new rg.x0(viVar.f0, k0Var.getContext(), viVar.J1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        hg.b2 b2Var = (hg.b2) O;
                        org.telegram.ui.Components.c5.a0(viVar.J1, b2Var.a(), viVar.n1(), new ci.m2(16, k0Var, b2Var));
                        break;
                    }
                }
                break;
            case 11:
                hg.m0 m0Var = (hg.m0) this.b;
                i51 G2 = m0Var.d0.G(i10 - 1);
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
                au0 au0Var = (au0) this.b;
                pg.j0 j0Var2 = (pg.j0) pg.j0.c().get(i10);
                au0Var.u1.setTypeface(j0Var2.a);
                pg.s0 e7 = pg.s0.e(au0Var.P1);
                String str2 = j0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = au0Var.S0;
                if (jVar2 instanceof qg.x2) {
                    ((qg.x2) jVar2).setTypeface(j0Var2);
                }
                au0Var.A0(false);
                break;
            case 15:
                qg.l1 l1Var = (qg.l1) this.b;
                l1Var.b3.accept(Integer.valueOf(l1Var.a3.b(i10)));
                pg.s0 s0Var = l1Var.a3;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                break;
            case 16:
                rg.j0.W((rg.j0) this.b, view);
                break;
            case 17:
                rg.s0 s0Var2 = (rg.s0) this.b;
                if (view != null) {
                    s0Var2.w1(view, true);
                    s0Var2.d3 = false;
                    s0Var2.v0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((ca0) this.b).h(view);
                break;
            case 19:
                ((wh.n) this.b).h(view);
                break;
            case 20:
                xh.l4 l4Var = (xh.l4) this.b;
                ci.d dVar = l4Var.c0;
                HashSet hashSet = l4Var.Z;
                w51 w51Var2 = l4Var.e0;
                if (w51Var2 != null && (G = w51Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j3 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((xh.i1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.i1) view).b(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 21:
                yh.x7.x0((yh.x7) this.b, i10);
                break;
            case 22:
                yh.i7.P((yh.i7) this.b, i10);
                break;
            case 23:
                yh.m7.P((yh.m7) this.b, i10);
                break;
            default:
                yh.n7.P((yh.n7) this.b, i10);
                break;
        }
    }
}
