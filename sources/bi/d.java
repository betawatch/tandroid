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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.fx;
import org.telegram.ui.gu0;
import org.telegram.ui.ky;
import org.telegram.ui.px;
import org.telegram.ui.xy;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        m61 G;
        switch (this.a) {
            case 0:
                ((px) this.b).i((u) view, false);
                break;
            case 1:
                ci.t tVar = (ci.t) this.b;
                ms0 ms0Var = tVar.W;
                org.telegram.ui.ActionBar.m2 m2Var = ms0Var.a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (!ms0Var.G.C1) {
                        sb orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                        Context context = tVar.getContext();
                        int id2 = messageObject.getId();
                        f8 f8Var = tVar.a;
                        g9 a2 = g9.a(tVar.f);
                        a2.s += ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, f8Var, a2);
                        break;
                    } else if (!ms0Var.c(messageObject)) {
                        ms0Var.e(messageObject);
                        break;
                    } else {
                        ms0Var.g(messageObject);
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
                di.y1 y1Var = (di.y1) this.b;
                di.r2 r2Var = y1Var.r;
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
                di.d2 d2Var = (di.d2) this.b;
                di.r2 r2Var2 = d2Var.s;
                di.c2 c2Var = d2Var.c;
                if (i10 >= 0) {
                    d2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = c2Var.s;
                        ArrayList arrayList2 = c2Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) c2Var.s.get(i10);
                        if (document2 != r2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof di.n1) && (s5Var = ((di.n1) view).c) != null) {
                                document2 = s5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.e3) r2Var2).currentAccount;
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
                            ig.g gVar = r2Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            r2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 5:
                di.mb mbVar = (di.mb) this.b;
                qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
                mbVar.l1.setTypeface(j0Var.a);
                qg.s0 e = qg.s0.e(mbVar.F1);
                String str = j0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                rg.j jVar = mbVar.J0;
                if (jVar instanceof rg.x2) {
                    ((rg.x2) jVar).setTypeface(j0Var);
                }
                mbVar.O0(false);
                break;
            case 6:
                ei.i.y0((ei.i) this.b, i10);
                break;
            case 7:
                a71 a71Var = ((ei.h) this.b).b0;
                if (a71Var != null) {
                    a71Var.G(i10 - 1);
                    break;
                }
                break;
            case 8:
                fi.l.B0((fi.l) this.b, i10);
                break;
            case 9:
                hg.h0 h0Var = (hg.h0) this.b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        ky kyVar = h0Var.U;
                        if (kyVar != null) {
                            kyVar.a.L4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                ky kyVar2 = h0Var.U;
                if (kyVar2 != null) {
                    yy yyVar = kyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!yyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        yyVar.H3();
                        if (AndroidUtilities.isTablet() && yyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                xy[] xyVarArr = yyVar.e0;
                                if (i12 < xyVarArr.length) {
                                    fx fxVar = xyVarArr[i12].d;
                                    yyVar.p2.dialogId = longValue2;
                                    fxVar.s = longValue2;
                                    i12++;
                                } else {
                                    yyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (yyVar.n2 == null) {
                            if (yyVar.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
                                yyVar.presentFragment(new fo(bundle));
                                break;
                            }
                        } else if (yyVar.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
                            yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            yyVar.presentFragment(new fo(bundle));
                            break;
                        }
                    } else if (yyVar.f5(longValue2)) {
                        if (!yyVar.I2.isEmpty()) {
                            yyVar.N3(longValue2, yyVar.f3(longValue2, null));
                            yyVar.Y4();
                            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            yyVar.M3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ig.i0 i0Var = (ig.i0) this.b;
                ig.f0 f0Var = i0Var.x;
                vi viVar = i0Var.b;
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
                if (O instanceof ig.a2) {
                    if (!UserConfig.getInstance(viVar.M1).isPremium()) {
                        if (viVar.f0 != null) {
                            new sg.y0(viVar.f0, i0Var.getContext(), viVar.M1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        ig.a2 a2Var = (ig.a2) O;
                        org.telegram.ui.Components.g5.Z(viVar.M1, a2Var.a(), viVar.p1(), new v2(17, i0Var, a2Var));
                        break;
                    }
                }
                break;
            case 11:
                ig.k0 k0Var = (ig.k0) this.b;
                m61 G2 = k0Var.d0.G(i10 - 1);
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
                                k0Var.U(true);
                                break;
                            }
                        } else {
                            k0Var.e0 = true;
                            a0Var.h = true;
                            k0Var.d0.N(true);
                            k0Var.U(true);
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
                        bVar.R(true);
                        break;
                    }
                } else {
                    bVar.R(false);
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
                gu0 gu0Var = (gu0) this.b;
                qg.j0 j0Var2 = (qg.j0) qg.j0.c().get(i10);
                gu0Var.u1.setTypeface(j0Var2.a);
                qg.s0 e7 = qg.s0.e(gu0Var.P1);
                String str2 = j0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = gu0Var.S0;
                if (jVar2 instanceof rg.x2) {
                    ((rg.x2) jVar2).setTypeface(j0Var2);
                }
                gu0Var.A0(false);
                break;
            case 15:
                rg.k1 k1Var = (rg.k1) this.b;
                k1Var.Z2.accept(Integer.valueOf(k1Var.Y2.b(i10)));
                qg.s0 s0Var = k1Var.Y2;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                break;
            case 16:
                sg.j0.X((sg.j0) this.b, view);
                break;
            case 17:
                sg.t0 t0Var = (sg.t0) this.b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.b3 = false;
                    t0Var.v0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((db0) this.b).h(view);
                break;
            case 19:
                ((xh.l) this.b).h(view);
                break;
            case 20:
                yh.k4 k4Var = (yh.k4) this.b;
                di.d dVar = k4Var.c0;
                HashSet hashSet = k4Var.Z;
                a71 a71Var2 = k4Var.e0;
                if (a71Var2 != null && (G = a71Var2.G(i10 - 1)) != null) {
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
            case 21:
                zh.p7.y0((zh.p7) this.b, i10);
                break;
            case 22:
                zh.a7.Q((zh.a7) this.b, i10);
                break;
            case 23:
                zh.e7.Q((zh.e7) this.b, i10);
                break;
            default:
                zh.f7.Q((zh.f7) this.b, i10);
                break;
        }
    }
}
