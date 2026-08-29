package bg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import jh.ia;
import jh.s9;
import jh.y9;
import jh.z9;
import lh.b7;
import lh.c6;
import lh.i9;
import nh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.nw;
import org.telegram.ui.qx;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;
import org.telegram.ui.xw;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        w41 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        p5 p5Var;
        org.telegram.ui.ActionBar.l lVar;
        Object O;
        switch (this.a) {
            case 0:
                ws0 ws0Var = (ws0) this.b;
                ag.u0 u0Var = (ag.u0) ag.u0.c().get(i10);
                ws0Var.q1.setTypeface(u0Var.a);
                ag.h1 e10 = ag.h1.e(ws0Var.L1);
                String str = u0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                k kVar = ws0Var.O0;
                if (kVar instanceof f4) {
                    ((f4) kVar).setTypeface(u0Var);
                }
                ws0Var.z0(false);
                break;
            case 1:
                h2 h2Var = (h2) this.b;
                h2Var.X2.accept(Integer.valueOf(h2Var.W2.b(i10)));
                ag.h1 h1Var = h2Var.W2;
                h1Var.c.put(Integer.valueOf(h1Var.f), Integer.valueOf(h1Var.b(i10)));
                h1Var.e = true;
                break;
            case 2:
                cg.v0.W((cg.v0) this.b, view);
                break;
            case 3:
                cg.h1 h1Var2 = (cg.h1) this.b;
                if (view != null) {
                    h1Var2.w1(view, true);
                    h1Var2.Z2 = false;
                    h1Var2.v0(0, view.getTop() - ((h1Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 4:
                ((z90) this.b).h(view);
                break;
            case 5:
                ((hh.v) this.b).h(view);
                break;
            case 6:
                ih.s3 s3Var = (ih.s3) this.b;
                nh.d dVar = s3Var.X;
                HashSet hashSet = s3Var.V;
                k51 k51Var = s3Var.Z;
                if (k51Var != null && (G = k51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i12 = savedStarGift.msg_id;
                        long j10 = i12 == 0 ? savedStarGift.saved_id : i12;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((ih.y1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((ih.y1) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 7:
                ia.x0((ia) this.b, i10);
                break;
            case 8:
                s9.P((s9) this.b, i10);
                break;
            case 9:
                y9.P((y9) this.b, i10);
                break;
            case 10:
                z9.P((z9) this.b, i10);
                break;
            case 11:
                ((xw) this.b).i((lh.o) view, false);
                break;
            case 12:
                mh.r rVar = (mh.r) this.b;
                fr0 fr0Var = rVar.S;
                org.telegram.ui.ActionBar.o2 o2Var = fr0Var.a;
                if (view instanceof p7) {
                    MessageObject messageObject = ((p7) view).getMessageObject();
                    if (!fr0Var.C.y1) {
                        i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        c6 c6Var = rVar.a;
                        b7 a2 = b7.a(rVar.f);
                        a2.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, c6Var, a2);
                        break;
                    } else if (!fr0Var.c(messageObject)) {
                        fr0Var.e(messageObject);
                        break;
                    } else {
                        fr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 13:
                Utilities.Callback callback = ((nh.y) this.b).c;
                if (callback != null) {
                    callback.run((nh.t) nh.t.a().get(i10));
                    break;
                }
                break;
            case 14:
                nh.t1 t1Var = (nh.t1) this.b;
                nh.k2 k2Var = t1Var.r;
                Object F = t1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = k2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                k2Var.dismiss();
                break;
            case 15:
                nh.y1 y1Var = (nh.y1) this.b;
                nh.k2 k2Var2 = y1Var.s;
                nh.x1 x1Var = y1Var.c;
                if (i10 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = x1Var.s;
                        ArrayList arrayList2 = x1Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) x1Var.s.get(i10);
                        if (document2 != k2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof nh.m1) && (p5Var = ((nh.m1) view).c) != null) {
                                document2 = p5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.f3) k2Var2).currentAccount;
                                document2 = p5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = k2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(x1Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                k2Var2.dismiss();
                                break;
                            }
                        } else {
                            sf.h hVar = k2Var2.A;
                            if (hVar != null) {
                                hVar.run();
                            }
                            k2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ja jaVar = (ja) this.b;
                ag.u0 u0Var2 = (ag.u0) ag.u0.c().get(i10);
                jaVar.h1.setTypeface(u0Var2.a);
                ag.h1 e11 = ag.h1.e(jaVar.B1);
                String str2 = u0Var2.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                k kVar2 = jaVar.F0;
                if (kVar2 instanceof f4) {
                    ((f4) kVar2).setTypeface(u0Var2);
                }
                jaVar.P0(false);
                break;
            case 17:
                oh.g.x0((oh.g) this.b, i10);
                break;
            case 18:
                k51 k51Var2 = ((oh.f) this.b).X;
                if (k51Var2 != null) {
                    k51Var2.G(i10 - 1);
                    break;
                }
                break;
            case 19:
                ph.j.A0((ph.j) this.b, i10);
                break;
            case 20:
                rf.a0 a0Var = (rf.a0) this.b;
                if (view instanceof l4) {
                    l4 l4Var = (l4) view;
                    if (l4Var.A) {
                        qx qxVar = a0Var.Q;
                        if (qxVar != null) {
                            qxVar.a.N4(l4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                qx qxVar2 = a0Var.Q;
                if (qxVar2 != null) {
                    fy fyVar = qxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!fyVar.h2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        fyVar.J3();
                        if (AndroidUtilities.isTablet() && fyVar.a0 != null) {
                            int i13 = 0;
                            while (true) {
                                ey[] eyVarArr = fyVar.a0;
                                if (i13 < eyVarArr.length) {
                                    nw nwVar = eyVarArr[i13].d;
                                    fyVar.l2.dialogId = longValue2;
                                    nwVar.s = longValue2;
                                    i13++;
                                } else {
                                    fyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (fyVar.j2 == null) {
                            if (fyVar.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
                                fyVar.presentFragment(new tn(bundle));
                                break;
                            }
                        } else if (fyVar.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
                            fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            fyVar.presentFragment(new tn(bundle));
                            break;
                        }
                    } else if (fyVar.h5(longValue2)) {
                        if (!fyVar.E2.isEmpty()) {
                            fyVar.P3(longValue2, fyVar.i3(longValue2, null));
                            fyVar.a5();
                            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            lVar.h(true);
                            break;
                        } else {
                            fyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                sf.d0 d0Var = (sf.d0) this.b;
                sf.a0 a0Var2 = d0Var.x;
                ni niVar = d0Var.b;
                f2.p0 adapter = d0Var.s.getAdapter();
                sf.b0 b0Var = d0Var.y;
                if (adapter == b0Var) {
                    ArrayList arrayList3 = b0Var.d;
                    int i14 = i10 - 1;
                    O = (i14 < 0 || i14 >= arrayList3.size()) ? null : arrayList3.get(i14);
                } else {
                    int S = a0Var2.S(i10);
                    int Q = a0Var2.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = a0Var2.O(S, Q);
                    }
                }
                if (O instanceof sf.r1) {
                    if (!UserConfig.getInstance(niVar.F1).isPremium()) {
                        if (niVar.b0 != null) {
                            new cg.p1(niVar.b0, d0Var.getContext(), niVar.F1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        sf.r1 r1Var = (sf.r1) O;
                        c5.a0(niVar.F1, r1Var.a(), niVar.n1(), new yu0(18, d0Var, r1Var));
                        break;
                    }
                }
                break;
            case 22:
                sf.f0 f0Var = (sf.f0) this.b;
                w41 G2 = f0Var.Z.G(i10 - 1);
                if (G2 != null) {
                    sf.w wVar = f0Var.V;
                    if (!wVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = sf.f0.c0;
                        if (i15 != -1) {
                            int i17 = sf.f0.d0;
                            if (i15 == -2) {
                                f0Var.a0 = false;
                                wVar.h = false;
                                f0Var.Z.N(true);
                                f0Var.T(true);
                                break;
                            }
                        } else {
                            f0Var.a0 = true;
                            wVar.h = true;
                            f0Var.Z.N(true);
                            f0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 23:
                sh.a aVar = (sh.a) this.b;
                int i18 = aVar.T.G(i10 - 1).d;
                if (i18 != 151) {
                    if (i18 == 150) {
                        aVar.Q(true);
                        break;
                    }
                } else {
                    aVar.Q(false);
                    break;
                }
                break;
            default:
                xf.j jVar = (xf.j) this.b;
                Runnable runnable = ((xf.a) jVar.A.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    jVar.c(false);
                    break;
                }
                break;
        }
    }
}
