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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ax;
import org.telegram.ui.bu0;
import org.telegram.ui.fy;
import org.telegram.ui.kx;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        p61 G;
        switch (this.a) {
            case 0:
                ((kx) this.b).i((a0) view, false);
                break;
            case 1:
                bi.u uVar = (bi.u) this.b;
                qs0 qs0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = qs0Var.a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (!qs0Var.G.C1) {
                        kc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = uVar.getContext();
                        int id2 = messageObject.getId();
                        v8 v8Var = uVar.a;
                        v9 a2 = v9.a(uVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, v8Var, a2);
                        break;
                    } else if (!qs0Var.c(messageObject)) {
                        qs0Var.e(messageObject);
                        break;
                    } else {
                        qs0Var.g(messageObject);
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
                ci.y1 y1Var = (ci.y1) this.b;
                ci.r2 r2Var = y1Var.r;
                Object F = y1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = r2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                r2Var.dismiss();
                break;
            case 4:
                ci.d2 d2Var = (ci.d2) this.b;
                ci.r2 r2Var2 = d2Var.s;
                ci.c2 c2Var = d2Var.c;
                if (i10 >= 0) {
                    d2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = c2Var.s;
                        ArrayList arrayList2 = c2Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) c2Var.s.get(i10);
                        if (document2 != r2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof ci.n1) && (s5Var = ((ci.n1) view).c) != null) {
                                document2 = s5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) r2Var2).currentAccount;
                                document2 = org.telegram.ui.Components.s5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = r2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(c2Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                r2Var2.dismiss();
                                break;
                            }
                        } else {
                            hg.h hVar = r2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            r2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ci.nb nbVar = (ci.nb) this.b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                nbVar.l1.setTypeface(k0Var.a);
                pg.u0 e7 = pg.u0.e(nbVar.F1);
                String str = k0Var.a;
                e7.j = str;
                e7.a.edit().putString("typeface", str).apply();
                qg.j jVar = nbVar.J0;
                if (jVar instanceof qg.w2) {
                    ((qg.w2) jVar).setTypeface(k0Var);
                }
                nbVar.O0(false);
                break;
            case 6:
                di.i.y0((di.i) this.b, i10);
                break;
            case 7:
                c71 c71Var = ((di.h) this.b).b0;
                if (c71Var != null) {
                    c71Var.G(i10 - 1);
                    break;
                }
                break;
            case 8:
                ei.l.B0((ei.l) this.b, i10);
                break;
            case 9:
                gg.h0 h0Var = (gg.h0) this.b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        fy fyVar = h0Var.U;
                        if (fyVar != null) {
                            fyVar.a.K4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                fy fyVar2 = h0Var.U;
                if (fyVar2 != null) {
                    ty tyVar = fyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!tyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        tyVar.G3();
                        if (AndroidUtilities.isTablet() && tyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                sy[] syVarArr = tyVar.e0;
                                if (i12 < syVarArr.length) {
                                    ax axVar = syVarArr[i12].d;
                                    tyVar.p2.dialogId = longValue2;
                                    axVar.s = longValue2;
                                    i12++;
                                } else {
                                    tyVar.d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (tyVar.n2 == null) {
                            if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                                tyVar.presentFragment(new zn(bundle));
                                break;
                            }
                        } else if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                            tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            tyVar.presentFragment(new zn(bundle));
                            break;
                        }
                    } else if (tyVar.e5(longValue2)) {
                        if (!tyVar.I2.isEmpty()) {
                            tyVar.M3(longValue2, tyVar.f3(longValue2, null));
                            tyVar.X4();
                            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            tyVar.L3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                hg.j0 j0Var = (hg.j0) this.b;
                hg.g0 g0Var = j0Var.x;
                yi yiVar = j0Var.b;
                s4.i0 adapter = j0Var.s.getAdapter();
                hg.h0 h0Var2 = j0Var.y;
                if (adapter == h0Var2) {
                    ArrayList arrayList3 = h0Var2.d;
                    int i13 = i10 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = g0Var.S(i10);
                    int Q = g0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = g0Var.O(S, Q);
                    }
                }
                if (O instanceof hg.b2) {
                    if (!UserConfig.getInstance(yiVar.M1).isPremium()) {
                        if (yiVar.f0 != null) {
                            new rg.y0(yiVar.f0, j0Var.getContext(), yiVar.M1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        hg.b2 b2Var = (hg.b2) O;
                        org.telegram.ui.Components.g5.Z(yiVar.M1, b2Var.a(), yiVar.p1(), new h3(17, j0Var, b2Var));
                        break;
                    }
                }
                break;
            case 11:
                hg.l0 l0Var = (hg.l0) this.b;
                p61 G2 = l0Var.d0.G(i10 - 1);
                if (G2 != null) {
                    hg.b0 b0Var = l0Var.Z;
                    if (!b0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = hg.l0.g0;
                        if (i14 != -1) {
                            int i16 = hg.l0.h0;
                            if (i14 == -2) {
                                l0Var.e0 = false;
                                b0Var.h = false;
                                l0Var.d0.N(true);
                                l0Var.U(true);
                                break;
                            }
                        } else {
                            l0Var.e0 = true;
                            b0Var.h = true;
                            l0Var.d0.N(true);
                            l0Var.U(true);
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
                        bVar.R(true);
                        break;
                    }
                } else {
                    bVar.R(false);
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
                bu0 bu0Var = (bu0) this.b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                bu0Var.u1.setTypeface(k0Var2.a);
                pg.u0 e10 = pg.u0.e(bu0Var.P1);
                String str2 = k0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = bu0Var.S0;
                if (jVar2 instanceof qg.w2) {
                    ((qg.w2) jVar2).setTypeface(k0Var2);
                }
                bu0Var.A0(false);
                break;
            case 15:
                qg.i1 i1Var = (qg.i1) this.b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                pg.u0 u0Var = i1Var.Y2;
                u0Var.c.put(Integer.valueOf(u0Var.f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                break;
            case 16:
                rg.j0.X((rg.j0) this.b, view);
                break;
            case 17:
                rg.s0 s0Var = (rg.s0) this.b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.b3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((eb0) this.b).h(view);
                break;
            case 19:
                ((wh.l) this.b).h(view);
                break;
            case 20:
                xh.m4 m4Var = (xh.m4) this.b;
                ci.d dVar = m4Var.c0;
                HashSet hashSet = m4Var.Z;
                c71 c71Var2 = m4Var.e0;
                if (c71Var2 != null && (G = c71Var2.G(i10 - 1)) != null) {
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
                yh.p7.y0((yh.p7) this.b, i10);
                break;
            case 22:
                yh.a7.Q((yh.a7) this.b, i10);
                break;
            case 23:
                yh.e7.Q((yh.e7) this.b, i10);
                break;
            default:
                yh.f7.Q((yh.f7) this.b, i10);
                break;
        }
    }
}
