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
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.jx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.vt0;
import org.telegram.ui.yn;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        org.telegram.ui.Components.q5 q5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h61 G;
        switch (this.a) {
            case 0:
                ((jx) this.b).i((a0) view, false);
                break;
            case 1:
                bi.u uVar = (bi.u) this.b;
                es0 es0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = es0Var.a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (!es0Var.G.C1) {
                        jc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = uVar.getContext();
                        int id2 = messageObject.getId();
                        u8 u8Var = uVar.a;
                        u9 a2 = u9.a(uVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, u8Var, a2);
                        break;
                    } else if (!es0Var.c(messageObject)) {
                        es0Var.e(messageObject);
                        break;
                    } else {
                        es0Var.g(messageObject);
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
                ci.mb mbVar = (ci.mb) this.b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                mbVar.l1.setTypeface(k0Var.a);
                pg.u0 e7 = pg.u0.e(mbVar.F1);
                String str = k0Var.a;
                e7.j = str;
                e7.a.edit().putString("typeface", str).apply();
                qg.j jVar = mbVar.J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).setTypeface(k0Var);
                }
                mbVar.P0(false);
                break;
            case 6:
                di.k.C0((di.k) this.b, i10);
                break;
            case 7:
                w61 w61Var = ((di.j) this.b).b0;
                if (w61Var != null) {
                    w61Var.G(i10 - 1);
                    break;
                }
                break;
            case 8:
                ei.m.F0((ei.m) this.b, i10);
                break;
            case 9:
                gg.i0 i0Var = (gg.i0) this.b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        fy fyVar = i0Var.U;
                        if (fyVar != null) {
                            fyVar.a.W4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                fy fyVar2 = i0Var.U;
                if (fyVar2 != null) {
                    uy uyVar = fyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!uyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        uyVar.S3();
                        if (AndroidUtilities.isTablet() && uyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                ty[] tyVarArr = uyVar.e0;
                                if (i12 < tyVarArr.length) {
                                    zw zwVar = tyVarArr[i12].d;
                                    uyVar.p2.dialogId = longValue2;
                                    zwVar.s = longValue2;
                                    i12++;
                                } else {
                                    uyVar.p5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (uyVar.n2 == null) {
                            if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                                uyVar.presentFragment(new yn(bundle));
                                break;
                            }
                        } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new yn(bundle));
                            break;
                        }
                    } else if (uyVar.q5(longValue2)) {
                        if (!uyVar.I2.isEmpty()) {
                            uyVar.Y3(longValue2, uyVar.s3(longValue2, null));
                            uyVar.j5();
                            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            uyVar.X3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                hg.j0 j0Var = (hg.j0) this.b;
                hg.g0 g0Var = j0Var.x;
                xi xiVar = j0Var.b;
                s4.h0 adapter = j0Var.s.getAdapter();
                hg.h0 h0Var = j0Var.y;
                if (adapter == h0Var) {
                    ArrayList arrayList3 = h0Var.d;
                    int i13 = i10 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = g0Var.S(i10);
                    int Q = g0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = g0Var.O(S, Q);
                    }
                }
                if (O instanceof hg.a2) {
                    if (!UserConfig.getInstance(xiVar.J1).isPremium()) {
                        if (xiVar.f0 != null) {
                            new rg.y0(xiVar.f0, j0Var.getContext(), xiVar.J1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        hg.a2 a2Var = (hg.a2) O;
                        org.telegram.ui.Components.e5.a0(xiVar.J1, a2Var.a(), xiVar.n1(), new g3(17, j0Var, a2Var));
                        break;
                    }
                }
                break;
            case 11:
                hg.l0 l0Var = (hg.l0) this.b;
                h61 G2 = l0Var.d0.G(i10 - 1);
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
                                l0Var.R(true);
                                break;
                            }
                        } else {
                            l0Var.e0 = true;
                            b0Var.h = true;
                            l0Var.d0.N(true);
                            l0Var.R(true);
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
                        bVar.O(true);
                        break;
                    }
                } else {
                    bVar.O(false);
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
                vt0 vt0Var = (vt0) this.b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                vt0Var.u1.setTypeface(k0Var2.a);
                pg.u0 e10 = pg.u0.e(vt0Var.P1);
                String str2 = k0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = vt0Var.S0;
                if (jVar2 instanceof qg.v2) {
                    ((qg.v2) jVar2).setTypeface(k0Var2);
                }
                vt0Var.A0(false);
                break;
            case 15:
                qg.i1 i1Var = (qg.i1) this.b;
                i1Var.i3.accept(Integer.valueOf(i1Var.h3.b(i10)));
                pg.u0 u0Var = i1Var.h3;
                u0Var.c.put(Integer.valueOf(u0Var.f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                break;
            case 16:
                rg.k0.U((rg.k0) this.b, view);
                break;
            case 17:
                rg.t0 t0Var = (rg.t0) this.b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.k3 = false;
                    t0Var.w0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 18:
                ((qa0) this.b).h(view);
                break;
            case 19:
                ((wh.n) this.b).h(view);
                break;
            case 20:
                xh.m4 m4Var = (xh.m4) this.b;
                ci.d dVar = m4Var.c0;
                HashSet hashSet = m4Var.Z;
                w61 w61Var2 = m4Var.e0;
                if (w61Var2 != null && (G = w61Var2.G(i10 - 1)) != null) {
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
                yh.z7.E0((yh.z7) this.b, i10);
                break;
            case 22:
                yh.j7.N((yh.j7) this.b, i10);
                break;
            case 23:
                yh.n7.N((yh.n7) this.b, i10);
                break;
            default:
                yh.p7.N((yh.p7) this.b, i10);
                break;
        }
    }
}
