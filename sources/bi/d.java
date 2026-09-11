package bi;

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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bx;
import org.telegram.ui.co;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.q5 q5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h51 G;
        switch (this.a) {
            case 0:
                ((lx) this.b).i((u) view, false);
                break;
            case 1:
                ci.t tVar = (ci.t) this.b;
                lr0 lr0Var = tVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = lr0Var.a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (!lr0Var.G.C1) {
                        pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = tVar.getContext();
                        int id2 = messageObject.getId();
                        b8 b8Var = tVar.a;
                        d9 a2 = d9.a(tVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, b8Var, a2);
                        break;
                    } else if (!lr0Var.c(messageObject)) {
                        lr0Var.e(messageObject);
                        break;
                    } else {
                        lr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 2:
                Utilities.Callback callback = ((di.y) this.b).c;
                if (callback != null) {
                    callback.run((di.t) di.t.a().get(i10));
                    break;
                }
                break;
            case 3:
                di.z1 z1Var = (di.z1) this.b;
                di.t2 t2Var = z1Var.r;
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
                di.e2 e2Var = (di.e2) this.b;
                di.t2 t2Var2 = e2Var.s;
                di.d2 d2Var = e2Var.c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = d2Var.s;
                        ArrayList arrayList2 = d2Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) d2Var.s.get(i10);
                        if (document2 != t2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof di.o1) && (q5Var = ((di.o1) view).c) != null) {
                                document2 = q5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) t2Var2).currentAccount;
                                document2 = org.telegram.ui.Components.q5.f(i11, longValue);
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
                            ig.g gVar = t2Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            t2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                di.rb rbVar = (di.rb) this.b;
                qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
                rbVar.l1.setTypeface(j0Var.a);
                qg.s0 e7 = qg.s0.e(rbVar.F1);
                String str = j0Var.a;
                e7.j = str;
                e7.a.edit().putString("typeface", str).apply();
                rg.k kVar2 = rbVar.J0;
                if (kVar2 instanceof rg.x2) {
                    ((rg.x2) kVar2).setTypeface(j0Var);
                }
                rbVar.P0(false);
                break;
            case 6:
                ei.i.x0((ei.i) this.b, i10);
                break;
            case 7:
                v51 v51Var = ((ei.h) this.b).b0;
                if (v51Var != null) {
                    v51Var.G(i10 - 1);
                    break;
                }
                break;
            case 8:
                fi.m.A0((fi.m) this.b, i10);
                break;
            case 9:
                hg.i0 i0Var = (hg.i0) this.b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.a.N4(m4Var.getDialogId(), view);
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
                                uyVar.presentFragment(new co(bundle));
                                break;
                            }
                        } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new co(bundle));
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
                ig.i0 i0Var2 = (ig.i0) this.b;
                ig.f0 f0Var = i0Var2.x;
                vi viVar = i0Var2.b;
                s4.h0 adapter = i0Var2.s.getAdapter();
                ig.g0 g0Var = i0Var2.y;
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
                if (O instanceof ig.a2) {
                    if (!UserConfig.getInstance(viVar.J1).isPremium()) {
                        if (viVar.f0 != null) {
                            new sg.a1(viVar.f0, i0Var2.getContext(), viVar.J1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        ig.a2 a2Var = (ig.a2) O;
                        org.telegram.ui.Components.e5.a0(viVar.J1, a2Var.a(), viVar.n1(), new di.m2(16, i0Var2, a2Var));
                        break;
                    }
                }
                break;
            case 11:
                ig.k0 k0Var = (ig.k0) this.b;
                h51 G2 = k0Var.d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = ig.k0.g0;
                        if (i14 != -1) {
                            int i16 = ig.k0.h0;
                            if (i14 == -2) {
                                k0Var.e0 = false;
                                a0Var.h = false;
                                k0Var.d0.N(true);
                                k0Var.T(true);
                                break;
                            }
                        } else {
                            k0Var.e0 = true;
                            a0Var.h = true;
                            k0Var.d0.N(true);
                            k0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 12:
                ii.b bVar = (ii.b) this.b;
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
                ng.i iVar = (ng.i) this.b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 14:
                zt0 zt0Var = (zt0) this.b;
                qg.j0 j0Var2 = (qg.j0) qg.j0.c().get(i10);
                zt0Var.u1.setTypeface(j0Var2.a);
                qg.s0 e10 = qg.s0.e(zt0Var.P1);
                String str2 = j0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                rg.k kVar3 = zt0Var.S0;
                if (kVar3 instanceof rg.x2) {
                    ((rg.x2) kVar3).setTypeface(j0Var2);
                }
                zt0Var.z0(false);
                break;
            case 15:
                rg.k1 k1Var = (rg.k1) this.b;
                k1Var.b3.accept(Integer.valueOf(k1Var.a3.b(i10)));
                qg.s0 s0Var = k1Var.a3;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                break;
            case 16:
                sg.k0.W((sg.k0) this.b, view);
                break;
            case 17:
                sg.u0 u0Var = (sg.u0) this.b;
                if (view != null) {
                    u0Var.v1(view, true);
                    u0Var.d3 = false;
                    u0Var.v0(0, view.getTop() - ((u0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((da0) this.b).h(view);
                break;
            case 19:
                ((xh.n) this.b).h(view);
                break;
            case 20:
                yh.k4 k4Var = (yh.k4) this.b;
                di.d dVar = k4Var.c0;
                HashSet hashSet = k4Var.Z;
                v51 v51Var2 = k4Var.e0;
                if (v51Var2 != null && (G = v51Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j3 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((yh.h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((yh.h1) view).b(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 21:
                zh.v7.x0((zh.v7) this.b, i10);
                break;
            case 22:
                zh.g7.P((zh.g7) this.b, i10);
                break;
            case 23:
                zh.k7.P((zh.k7) this.b, i10);
                break;
            default:
                zh.l7.P((zh.l7) this.b, i10);
                break;
        }
    }
}
