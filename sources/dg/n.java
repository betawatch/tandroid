package dg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import lh.aa;
import lh.ja;
import lh.t9;
import lh.z9;
import nh.c7;
import nh.d6;
import nh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ix;
import org.telegram.ui.mt0;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.yw;
import org.telegram.ui.zn;
import ph.h9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        i51 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        l5 l5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.a) {
            case 0:
                mt0 mt0Var = (mt0) this.b;
                cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
                mt0Var.r1.setTypeface(t0Var.a);
                cg.f1 e = cg.f1.e(mt0Var.M1);
                String str = t0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                j jVar = mt0Var.P0;
                if (jVar instanceof b4) {
                    ((b4) jVar).setTypeface(t0Var);
                }
                mt0Var.z0(false);
                break;
            case 1:
                e2 e2Var = (e2) this.b;
                e2Var.Y2.accept(Integer.valueOf(e2Var.X2.b(i10)));
                cg.f1 f1Var = e2Var.X2;
                f1Var.c.put(Integer.valueOf(f1Var.f), Integer.valueOf(f1Var.b(i10)));
                f1Var.e = true;
                break;
            case 2:
                eg.v0.W((eg.v0) this.b, view);
                break;
            case 3:
                eg.g1 g1Var = (eg.g1) this.b;
                if (view != null) {
                    g1Var.v1(view, true);
                    g1Var.a3 = false;
                    g1Var.v0(0, view.getTop() - ((g1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 4:
                ((fa0) this.b).h(view);
                break;
            case 5:
                ((jh.v) this.b).h(view);
                break;
            case 6:
                kh.r3 r3Var = (kh.r3) this.b;
                ph.d dVar = r3Var.Y;
                HashSet hashSet = r3Var.W;
                w51 w51Var = r3Var.a0;
                if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i12 = savedStarGift.msg_id;
                        long j10 = i12 == 0 ? savedStarGift.saved_id : i12;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((kh.x1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((kh.x1) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 7:
                ja.x0((ja) this.b, i10);
                break;
            case 8:
                t9.P((t9) this.b, i10);
                break;
            case 9:
                z9.P((z9) this.b, i10);
                break;
            case 10:
                aa.P((aa) this.b, i10);
                break;
            case 11:
                ((ix) this.b).i((nh.p) view, false);
                break;
            case 12:
                oh.r rVar = (oh.r) this.b;
                nr0 nr0Var = rVar.T;
                org.telegram.ui.ActionBar.p2 p2Var = nr0Var.a;
                if (view instanceof q7) {
                    MessageObject messageObject = ((q7) view).getMessageObject();
                    if (!nr0Var.D.z1) {
                        i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        d6 d6Var = rVar.a;
                        c7 a2 = c7.a(rVar.f);
                        a2.s += ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).p1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, d6Var, a2);
                        break;
                    } else if (!nr0Var.c(messageObject)) {
                        nr0Var.e(messageObject);
                        break;
                    } else {
                        nr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 13:
                Utilities.Callback callback = ((ph.u) this.b).c;
                if (callback != null) {
                    callback.run((ph.r) ph.r.a().get(i10));
                    break;
                }
                break;
            case 14:
                ph.h1 h1Var = (ph.h1) this.b;
                ph.y1 y1Var = h1Var.r;
                Object F = h1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = y1Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                y1Var.dismiss();
                break;
            case 15:
                ph.n1 n1Var = (ph.n1) this.b;
                ph.y1 y1Var2 = n1Var.s;
                ph.m1 m1Var = n1Var.c;
                if (i10 >= 0) {
                    n1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = m1Var.s;
                        ArrayList arrayList2 = m1Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) m1Var.s.get(i10);
                        if (document2 != y1Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof ph.c1) && (l5Var = ((ph.c1) view).c) != null) {
                                document2 = l5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                                document2 = l5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = y1Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(m1Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                y1Var2.dismiss();
                                break;
                            }
                        } else {
                            uf.g gVar = y1Var2.B;
                            if (gVar != null) {
                                gVar.run();
                            }
                            y1Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 16:
                h9 h9Var = (h9) this.b;
                cg.t0 t0Var2 = (cg.t0) cg.t0.c().get(i10);
                h9Var.i1.setTypeface(t0Var2.a);
                cg.f1 e6 = cg.f1.e(h9Var.C1);
                String str2 = t0Var2.a;
                e6.j = str2;
                e6.a.edit().putString("typeface", str2).apply();
                j jVar2 = h9Var.G0;
                if (jVar2 instanceof b4) {
                    ((b4) jVar2).setTypeface(t0Var2);
                }
                h9Var.P0(false);
                break;
            case 17:
                qh.g.x0((qh.g) this.b, i10);
                break;
            case 18:
                w51 w51Var2 = ((qh.f) this.b).Y;
                if (w51Var2 != null) {
                    w51Var2.G(i10 - 1);
                    break;
                }
                break;
            case 19:
                rh.j.A0((rh.j) this.b, i10);
                break;
            case 20:
                tf.z zVar = (tf.z) this.b;
                if (view instanceof m4) {
                    m4 m4Var = (m4) view;
                    if (m4Var.B) {
                        cy cyVar = zVar.R;
                        if (cyVar != null) {
                            cyVar.a.N4(m4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                cy cyVar2 = zVar.R;
                if (cyVar2 != null) {
                    qy qyVar = cyVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!qyVar.i2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        qyVar.J3();
                        if (AndroidUtilities.isTablet() && qyVar.b0 != null) {
                            int i13 = 0;
                            while (true) {
                                py[] pyVarArr = qyVar.b0;
                                if (i13 < pyVarArr.length) {
                                    yw ywVar = pyVarArr[i13].d;
                                    qyVar.m2.dialogId = longValue2;
                                    ywVar.s = longValue2;
                                    i13++;
                                } else {
                                    qyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (qyVar.k2 == null) {
                            if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                                qyVar.presentFragment(new zn(bundle));
                                break;
                            }
                        } else if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                            qyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            qyVar.presentFragment(new zn(bundle));
                            break;
                        }
                    } else if (qyVar.h5(longValue2)) {
                        if (!qyVar.F2.isEmpty()) {
                            qyVar.P3(longValue2, qyVar.i3(longValue2, null));
                            qyVar.a5();
                            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            qyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                uf.c0 c0Var = (uf.c0) this.b;
                uf.z zVar2 = c0Var.x;
                li liVar = c0Var.b;
                f2.o0 adapter = c0Var.s.getAdapter();
                uf.a0 a0Var = c0Var.y;
                if (adapter == a0Var) {
                    ArrayList arrayList3 = a0Var.d;
                    int i14 = i10 - 1;
                    O = (i14 < 0 || i14 >= arrayList3.size()) ? null : arrayList3.get(i14);
                } else {
                    int S = zVar2.S(i10);
                    int Q = zVar2.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = zVar2.O(S, Q);
                    }
                }
                if (O instanceof uf.o1) {
                    if (!UserConfig.getInstance(liVar.G1).isPremium()) {
                        if (liVar.c0 != null) {
                            new eg.o1(liVar.c0, c0Var.getContext(), liVar.G1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        uf.o1 o1Var = (uf.o1) O;
                        z4.a0(liVar.G1, o1Var.a(), liVar.n1(), new ph.s1(16, c0Var, o1Var));
                        break;
                    }
                }
                break;
            case 22:
                uf.f0 f0Var = (uf.f0) this.b;
                i51 G2 = f0Var.a0.G(i10 - 1);
                if (G2 != null) {
                    uf.v vVar = f0Var.W;
                    if (!vVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = uf.f0.d0;
                        if (i15 != -1) {
                            int i17 = uf.f0.e0;
                            if (i15 == -2) {
                                f0Var.b0 = false;
                                vVar.h = false;
                                f0Var.a0.N(true);
                                f0Var.T(true);
                                break;
                            }
                        } else {
                            f0Var.b0 = true;
                            vVar.h = true;
                            f0Var.a0.N(true);
                            f0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 23:
                uh.a aVar = (uh.a) this.b;
                int i18 = aVar.U.G(i10 - 1).d;
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
                zf.h hVar = (zf.h) this.b;
                Runnable runnable = ((zf.a) hVar.B.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    hVar.c(false);
                    break;
                }
                break;
        }
    }
}
