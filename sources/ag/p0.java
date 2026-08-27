package ag;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gh.y3;
import hh.ea;
import hh.fa;
import hh.oa;
import hh.x9;
import java.util.ArrayList;
import java.util.HashSet;
import jh.b6;
import jh.b7;
import jh.i9;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.ib0;
import org.telegram.ui.ow;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import org.telegram.ui.ys0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        n41 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        k5 k5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.a) {
            case 0:
                i1.W((i1) this.b, view);
                break;
            case 1:
                w1 w1Var = (w1) this.b;
                if (view != null) {
                    w1Var.w1(view, true);
                    w1Var.Z2 = false;
                    w1Var.v0(0, view.getTop() - ((w1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 2:
                ((p90) this.b).h(view);
                break;
            case 3:
                ((fh.v) this.b).h(view);
                break;
            case 4:
                y3 y3Var = (y3) this.b;
                lh.d dVar = y3Var.X;
                HashSet hashSet = y3Var.V;
                b51 b51Var = y3Var.Z;
                if (b51Var != null && (G = b51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i12 = savedStarGift.msg_id;
                        long j10 = i12 == 0 ? savedStarGift.saved_id : i12;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((gh.b2) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((gh.b2) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 5:
                oa.x0((oa) this.b, i10);
                break;
            case 6:
                x9.P((x9) this.b, i10);
                break;
            case 7:
                ea.P((ea) this.b, i10);
                break;
            case 8:
                fa.P((fa) this.b, i10);
                break;
            case 9:
                ((yw) this.b).i((jh.o) view, false);
                break;
            case 10:
                kh.r rVar = (kh.r) this.b;
                vq0 vq0Var = rVar.S;
                org.telegram.ui.ActionBar.n2 n2Var = vq0Var.a;
                if (view instanceof o7) {
                    MessageObject messageObject = ((o7) view).getMessageObject();
                    if (!vq0Var.C.y1) {
                        i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        b6 b6Var = rVar.a;
                        b7 a2 = b7.a(rVar.f);
                        a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, b6Var, a2);
                        break;
                    } else if (!vq0Var.c(messageObject)) {
                        vq0Var.e(messageObject);
                        break;
                    } else {
                        vq0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 11:
                Utilities.Callback callback = ((lh.z) this.b).c;
                if (callback != null) {
                    callback.run((lh.u) lh.u.a().get(i10));
                    break;
                }
                break;
            case 12:
                lh.u1 u1Var = (lh.u1) this.b;
                lh.l2 l2Var = u1Var.r;
                Object F = u1Var.c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = l2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                l2Var.dismiss();
                break;
            case 13:
                lh.z1 z1Var = (lh.z1) this.b;
                lh.l2 l2Var2 = z1Var.s;
                lh.y1 y1Var = z1Var.c;
                if (i10 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = y1Var.s;
                        ArrayList arrayList2 = y1Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) y1Var.s.get(i10);
                        if (document2 != l2Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof lh.n1) && (k5Var = ((lh.n1) view).c) != null) {
                                document2 = k5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((org.telegram.ui.ActionBar.e3) l2Var2).currentAccount;
                                document2 = k5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = l2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(y1Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                l2Var2.dismiss();
                                break;
                            }
                        } else {
                            qf.i iVar = l2Var2.A;
                            if (iVar != null) {
                                iVar.run();
                            }
                            l2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 14:
                va vaVar = (va) this.b;
                yf.i0 i0Var = (yf.i0) yf.i0.c().get(i10);
                vaVar.h1.setTypeface(i0Var.a);
                yf.r0 e9 = yf.r0.e(vaVar.B1);
                String str = i0Var.a;
                e9.j = str;
                e9.a.edit().putString("typeface", str).apply();
                zf.j jVar = vaVar.F0;
                if (jVar instanceof zf.v2) {
                    ((zf.v2) jVar).setTypeface(i0Var);
                }
                vaVar.P0(false);
                break;
            case 15:
                mh.g.x0((mh.g) this.b, i10);
                break;
            case 16:
                b51 b51Var2 = ((mh.f) this.b).X;
                if (b51Var2 != null) {
                    b51Var2.G(i10 - 1);
                    break;
                }
                break;
            case 17:
                nh.k.A0((nh.k) this.b, i10);
                break;
            case 18:
                pf.z zVar = (pf.z) this.b;
                if (view instanceof k4) {
                    k4 k4Var = (k4) view;
                    if (k4Var.A) {
                        rx rxVar = zVar.Q;
                        if (rxVar != null) {
                            rxVar.a.N4(k4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                rx rxVar2 = zVar.Q;
                if (rxVar2 != null) {
                    gy gyVar = rxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!gyVar.h2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        gyVar.J3();
                        if (AndroidUtilities.isTablet() && gyVar.a0 != null) {
                            int i13 = 0;
                            while (true) {
                                fy[] fyVarArr = gyVar.a0;
                                if (i13 < fyVarArr.length) {
                                    ow owVar = fyVarArr[i13].d;
                                    gyVar.l2.dialogId = longValue2;
                                    owVar.s = longValue2;
                                    i13++;
                                } else {
                                    gyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (gyVar.j2 == null) {
                            if (gyVar.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                                gyVar.presentFragment(new rn(bundle));
                                break;
                            }
                        } else if (gyVar.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                            gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            gyVar.presentFragment(new rn(bundle));
                            break;
                        }
                    } else if (gyVar.h5(longValue2)) {
                        if (!gyVar.E2.isEmpty()) {
                            gyVar.P3(longValue2, gyVar.i3(longValue2, null));
                            gyVar.a5();
                            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            gyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                qf.e0 e0Var = (qf.e0) this.b;
                qf.b0 b0Var = e0Var.x;
                gi giVar = e0Var.b;
                f2.q0 adapter = e0Var.s.getAdapter();
                qf.c0 c0Var = e0Var.y;
                if (adapter == c0Var) {
                    ArrayList arrayList3 = c0Var.d;
                    int i14 = i10 - 1;
                    O = (i14 < 0 || i14 >= arrayList3.size()) ? null : arrayList3.get(i14);
                } else {
                    int S = b0Var.S(i10);
                    int Q = b0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = b0Var.O(S, Q);
                    }
                }
                if (O instanceof qf.p1) {
                    if (!UserConfig.getInstance(giVar.F1).isPremium()) {
                        if (giVar.b0 != null) {
                            new g2(giVar.b0, e0Var.getContext(), giVar.F1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        qf.p1 p1Var = (qf.p1) O;
                        y4.a0(giVar.F1, p1Var.a(), giVar.n1(), new ib0(18, e0Var, p1Var));
                        break;
                    }
                }
                break;
            case 20:
                qf.g0 g0Var = (qf.g0) this.b;
                n41 G2 = g0Var.Z.G(i10 - 1);
                if (G2 != null) {
                    qf.x xVar = g0Var.V;
                    if (!xVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = qf.g0.c0;
                        if (i15 != -1) {
                            int i17 = qf.g0.d0;
                            if (i15 == -2) {
                                g0Var.a0 = false;
                                xVar.h = false;
                                g0Var.Z.N(true);
                                g0Var.T(true);
                                break;
                            }
                        } else {
                            g0Var.a0 = true;
                            xVar.h = true;
                            g0Var.Z.N(true);
                            g0Var.T(true);
                            break;
                        }
                    }
                }
                break;
            case 21:
                qh.a aVar = (qh.a) this.b;
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
            case 22:
                vf.i iVar2 = (vf.i) this.b;
                Runnable runnable = ((vf.a) iVar2.A.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar2.c(false);
                    break;
                }
                break;
            case 23:
                ys0 ys0Var = (ys0) this.b;
                yf.i0 i0Var2 = (yf.i0) yf.i0.c().get(i10);
                ys0Var.q1.setTypeface(i0Var2.a);
                yf.r0 e10 = yf.r0.e(ys0Var.L1);
                String str2 = i0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                zf.j jVar2 = ys0Var.O0;
                if (jVar2 instanceof zf.v2) {
                    ((zf.v2) jVar2).setTypeface(i0Var2);
                }
                ys0Var.z0(false);
                break;
            default:
                zf.i1 i1Var = (zf.i1) this.b;
                i1Var.X2.accept(Integer.valueOf(i1Var.W2.b(i10)));
                yf.r0 r0Var = i1Var.W2;
                r0Var.c.put(Integer.valueOf(r0Var.f), Integer.valueOf(r0Var.b(i10)));
                r0Var.e = true;
                break;
        }
    }
}
