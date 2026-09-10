package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.f3;
import bi.k2;
import bi.q2;
import bi.v1;
import bi.y2;
import fg.h0;
import gg.j2;
import gg.k0;
import gg.l0;
import gg.n0;
import gg.p0;
import java.util.ArrayList;
import java.util.HashSet;
import og.m0;
import og.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dx;
import org.telegram.ui.eo;
import org.telegram.ui.iy;
import org.telegram.ui.nx;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.zt0;
import pg.i1;
import pg.v2;
import qg.a1;
import qg.v0;
import wh.h1;
import wh.l4;
import xh.k7;
import xh.o7;
import xh.p7;
import xh.z7;
import zh.s4;
import zh.s5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        p5 p5Var;
        org.telegram.ui.ActionBar.l lVar;
        Object O;
        v51 G;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                vr0 vr0Var = a0Var.W;
                p2 p2Var = vr0Var.a;
                if (view instanceof u7) {
                    MessageObject messageObject = ((u7) view).getMessageObject();
                    if (!vr0Var.G.C1) {
                        zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                        Context context = a0Var.getContext();
                        int id2 = messageObject.getId();
                        s4 s4Var = a0Var.a;
                        s5 a2 = s5.a(a0Var.f);
                        a2.s += ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, s4Var, a2);
                        break;
                    } else if (!vr0Var.c(messageObject)) {
                        vr0Var.e(messageObject);
                        break;
                    } else {
                        vr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 1:
                Utilities.Callback callback = ((bi.c0) this.b).c;
                if (callback != null) {
                    callback.run((bi.x) bi.x.a().get(i10));
                    break;
                }
                break;
            case 2:
                k2 k2Var = (k2) this.b;
                f3 f3Var = k2Var.r;
                Object F = k2Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = f3Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                f3Var.dismiss();
                break;
            case 3:
                q2 q2Var = (q2) this.b;
                f3 f3Var2 = q2Var.s;
                bi.p2 p2Var2 = q2Var.c;
                if (i10 >= 0) {
                    q2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = p2Var2.s;
                        ArrayList arrayList2 = p2Var2.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) p2Var2.s.get(i10);
                        if (document2 != f3Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof v1) && (p5Var = ((v1) view).c) != null) {
                                document2 = p5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((h3) f3Var2).currentAccount;
                                document2 = p5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = f3Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(p2Var2.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                f3Var2.dismiss();
                                break;
                            }
                        } else {
                            gg.g gVar = f3Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            f3Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ad adVar = (ad) this.b;
                m0 m0Var = (m0) m0.c().get(i10);
                adVar.l1.setTypeface(m0Var.a);
                x0 e = x0.e(adVar.F1);
                String str = m0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                pg.j jVar = adVar.J0;
                if (jVar instanceof v2) {
                    ((v2) jVar).setTypeface(m0Var);
                }
                adVar.P0(false);
                break;
            case 5:
                ci.j.x0((ci.j) this.b, i10);
                break;
            case 6:
                j61 j61Var = ((ci.i) this.b).b0;
                if (j61Var != null) {
                    j61Var.G(i10 - 1);
                    break;
                }
                break;
            case 7:
                di.m.A0((di.m) this.b, i10);
                break;
            case 8:
                h0 h0Var = (h0) this.b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.E) {
                        iy iyVar = h0Var.U;
                        if (iyVar != null) {
                            iyVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                iy iyVar2 = h0Var.U;
                if (iyVar2 != null) {
                    wy wyVar = iyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!wyVar.l2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        wyVar.J3();
                        if (AndroidUtilities.isTablet() && wyVar.e0 != null) {
                            int i12 = 0;
                            while (true) {
                                vy[] vyVarArr = wyVar.e0;
                                if (i12 < vyVarArr.length) {
                                    dx dxVar = vyVarArr[i12].d;
                                    wyVar.p2.dialogId = longValue2;
                                    dxVar.s = longValue2;
                                    i12++;
                                } else {
                                    wyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (wyVar.n2 == null) {
                            if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                                wyVar.presentFragment(new eo(bundle));
                                break;
                            }
                        } else if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                            wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            wyVar.presentFragment(new eo(bundle));
                            break;
                        }
                    } else if (wyVar.h5(longValue2)) {
                        if (!wyVar.I2.isEmpty()) {
                            wyVar.P3(longValue2, wyVar.i3(longValue2, null));
                            wyVar.a5();
                            lVar = ((p2) wyVar).actionBar;
                            lVar.h(true);
                            break;
                        } else {
                            wyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                n0 n0Var = (n0) this.b;
                k0 k0Var = n0Var.x;
                yi yiVar = n0Var.b;
                s4.h0 adapter = n0Var.s.getAdapter();
                l0 l0Var = n0Var.y;
                if (adapter == l0Var) {
                    ArrayList arrayList3 = l0Var.d;
                    int i13 = i10 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = k0Var.S(i10);
                    int Q = k0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = k0Var.O(S, Q);
                    }
                }
                if (O instanceof j2) {
                    if (!UserConfig.getInstance(yiVar.J1).isPremium()) {
                        if (yiVar.f0 != null) {
                            new a1(yiVar.f0, n0Var.getContext(), yiVar.J1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        j2 j2Var = (j2) O;
                        d5.a0(yiVar.J1, j2Var.a(), yiVar.n1(), new y2(16, n0Var, j2Var));
                        break;
                    }
                }
                break;
            case 10:
                p0 p0Var = (p0) this.b;
                v51 G2 = p0Var.d0.G(i10 - 1);
                if (G2 != null) {
                    gg.e0 e0Var = p0Var.Z;
                    if (!e0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = p0.g0;
                        if (i14 != -1) {
                            int i16 = p0.h0;
                            if (i14 == -2) {
                                p0Var.e0 = false;
                                e0Var.h = false;
                                p0Var.d0.N(true);
                                p0Var.T(true);
                                break;
                            }
                        } else {
                            p0Var.e0 = true;
                            e0Var.h = true;
                            p0Var.d0.N(true);
                            p0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 11:
                gi.b bVar = (gi.b) this.b;
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
            case 12:
                lg.i iVar = (lg.i) this.b;
                Runnable runnable = ((lg.a) iVar.E.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
            case 13:
                zt0 zt0Var = (zt0) this.b;
                m0 m0Var2 = (m0) m0.c().get(i10);
                zt0Var.u1.setTypeface(m0Var2.a);
                x0 e7 = x0.e(zt0Var.P1);
                String str2 = m0Var2.a;
                e7.j = str2;
                e7.a.edit().putString("typeface", str2).apply();
                pg.j jVar2 = zt0Var.S0;
                if (jVar2 instanceof v2) {
                    ((v2) jVar2).setTypeface(m0Var2);
                }
                zt0Var.z0(false);
                break;
            case 14:
                i1 i1Var = (i1) this.b;
                i1Var.b3.accept(Integer.valueOf(i1Var.a3.b(i10)));
                x0 x0Var = i1Var.a3;
                x0Var.c.put(Integer.valueOf(x0Var.f), Integer.valueOf(x0Var.b(i10)));
                x0Var.e = true;
                break;
            case 15:
                qg.k0.W((qg.k0) this.b, view);
                break;
            case 16:
                v0 v0Var = (v0) this.b;
                if (view != null) {
                    v0Var.v1(view, true);
                    v0Var.d3 = false;
                    v0Var.v0(0, view.getTop() - ((v0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 17:
                ((ma0) this.b).h(view);
                break;
            case 18:
                ((vh.p) this.b).h(view);
                break;
            case 19:
                l4 l4Var = (l4) this.b;
                bi.d dVar = l4Var.c0;
                HashSet hashSet = l4Var.Z;
                j61 j61Var2 = l4Var.e0;
                if (j61Var2 != null && (G = j61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j3 = i18 == 0 ? savedStarGift.saved_id : i18;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((h1) view).b(true, true);
                            G.e = true;
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.b(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 20:
                z7.x0((z7) this.b, i10);
                break;
            case 21:
                k7.P((k7) this.b, i10);
                break;
            case 22:
                o7.P((o7) this.b, i10);
                break;
            case 23:
                p7.P((p7) this.b, i10);
                break;
            default:
                ((nx) this.b).i((zh.k) view, false);
                break;
        }
    }
}
