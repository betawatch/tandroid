package eh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.r0;
import fh.d4;
import fh.f2;
import gh.ea;
import gh.fa;
import gh.oa;
import gh.y9;
import ih.e7;
import ih.f6;
import ih.m9;
import java.util.ArrayList;
import java.util.HashSet;
import kh.a2;
import kh.b2;
import kh.n2;
import kh.p1;
import kh.w1;
import kh.ya;
import kh.z;
import of.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.eb0;
import org.telegram.ui.lw;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import org.telegram.ui.vw;
import org.telegram.ui.xs0;
import pf.b0;
import pf.c0;
import pf.e0;
import pf.g0;
import pf.q1;
import xf.i0;
import xf.s0;
import yf.i1;
import yf.v2;
import zf.j0;
import zf.x0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        l41 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i10;
        k5 k5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.a) {
            case 0:
                ((l90) this.b).h(view);
                break;
            case 1:
                ((x) this.b).h(view);
                break;
            case 2:
                d4 d4Var = (d4) this.b;
                kh.d dVar = d4Var.X;
                HashSet hashSet = d4Var.V;
                z41 z41Var = d4Var.Z;
                if (z41Var != null && (G = z41Var.G(i9 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i11 = savedStarGift.msg_id;
                        long j10 = i11 == 0 ? savedStarGift.saved_id : i11;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((f2) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((f2) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 3:
                oa.w0((oa) this.b, i9);
                break;
            case 4:
                y9.O((y9) this.b, i9);
                break;
            case 5:
                ea.O((ea) this.b, i9);
                break;
            case 6:
                fa.O((fa) this.b, i9);
                break;
            case 7:
                ((vw) this.b).i((ih.q) view, false);
                break;
            case 8:
                jh.q qVar = (jh.q) this.b;
                uq0 uq0Var = qVar.S;
                o2 o2Var = uq0Var.a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
                    if (!uq0Var.C.y1) {
                        m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                        Context context = qVar.getContext();
                        int id2 = messageObject.getId();
                        f6 f6Var = qVar.a;
                        e7 a2 = e7.a(qVar.f);
                        a2.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, f6Var, a2);
                        break;
                    } else if (!uq0Var.c(messageObject)) {
                        uq0Var.e(messageObject);
                        break;
                    } else {
                        uq0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 9:
                Utilities.Callback callback = ((z) this.b).c;
                if (callback != null) {
                    callback.run((kh.u) kh.u.a().get(i9));
                    break;
                }
                break;
            case 10:
                w1 w1Var = (w1) this.b;
                n2 n2Var = w1Var.r;
                Object F = w1Var.c.F(i9);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = n2Var.y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var.dismiss();
                break;
            case 11:
                b2 b2Var = (b2) this.b;
                n2 n2Var2 = b2Var.s;
                a2 a2Var = b2Var.c;
                if (i9 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = a2Var.s;
                        ArrayList arrayList2 = a2Var.v;
                        TLRPC.Document document2 = i9 >= arrayList.size() ? null : (TLRPC.Document) a2Var.s.get(i9);
                        if (document2 != n2Var2.e) {
                            long longValue = i9 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i9)).longValue();
                            if (document2 == null && (view instanceof p1) && (k5Var = ((p1) view).c) != null) {
                                document2 = k5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i10 = ((f3) n2Var2).currentAccount;
                                document2 = k5.f(i10, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = n2Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(a2Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                n2Var2.dismiss();
                                break;
                            }
                        } else {
                            pf.h hVar = n2Var2.A;
                            if (hVar != null) {
                                hVar.run();
                            }
                            n2Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 12:
                ya yaVar = (ya) this.b;
                i0 i0Var = (i0) i0.c().get(i9);
                yaVar.h1.setTypeface(i0Var.a);
                s0 e10 = s0.e(yaVar.B1);
                String str = i0Var.a;
                e10.j = str;
                e10.a.edit().putString("typeface", str).apply();
                yf.j jVar = yaVar.F0;
                if (jVar instanceof v2) {
                    ((v2) jVar).setTypeface(i0Var);
                }
                yaVar.P0(false);
                break;
            case 13:
                lh.g.w0((lh.g) this.b, i9);
                break;
            case 14:
                z41 z41Var2 = ((lh.f) this.b).X;
                if (z41Var2 != null) {
                    z41Var2.G(i9 - 1);
                    break;
                }
                break;
            case 15:
                mh.l.z0((mh.l) this.b, i9);
                break;
            case 16:
                f0 f0Var = (f0) this.b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.A) {
                        ox oxVar = f0Var.Q;
                        if (oxVar != null) {
                            oxVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                ox oxVar2 = f0Var.Q;
                if (oxVar2 != null) {
                    dy dyVar = oxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!dyVar.h2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        dyVar.J3();
                        if (AndroidUtilities.isTablet() && dyVar.a0 != null) {
                            int i12 = 0;
                            while (true) {
                                cy[] cyVarArr = dyVar.a0;
                                if (i12 < cyVarArr.length) {
                                    lw lwVar = cyVarArr[i12].d;
                                    dyVar.l2.dialogId = longValue2;
                                    lwVar.s = longValue2;
                                    i12++;
                                } else {
                                    dyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (dyVar.j2 == null) {
                            if (dyVar.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
                                dyVar.presentFragment(new qn(bundle));
                                break;
                            }
                        } else if (dyVar.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
                            dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            dyVar.presentFragment(new qn(bundle));
                            break;
                        }
                    } else if (dyVar.h5(longValue2)) {
                        if (!dyVar.E2.isEmpty()) {
                            dyVar.P3(longValue2, dyVar.i3(longValue2, null));
                            dyVar.a5();
                            kVar = ((o2) dyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            dyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                e0 e0Var = (e0) this.b;
                b0 b0Var = e0Var.x;
                ki kiVar = e0Var.b;
                r0 adapter = e0Var.s.getAdapter();
                c0 c0Var = e0Var.y;
                if (adapter == c0Var) {
                    ArrayList arrayList3 = c0Var.d;
                    int i13 = i9 - 1;
                    O = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int S = b0Var.S(i9);
                    int Q = b0Var.Q(i9);
                    if (Q >= 0 && S >= 0) {
                        O = b0Var.O(S, Q);
                    }
                }
                if (O instanceof q1) {
                    if (!UserConfig.getInstance(kiVar.F1).isPremium()) {
                        if (kiVar.b0 != null) {
                            new x0(kiVar.b0, e0Var.getContext(), kiVar.F1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        q1 q1Var = (q1) O;
                        y4.a0(kiVar.F1, q1Var.a(), kiVar.n1(), new eb0(18, e0Var, q1Var));
                        break;
                    }
                }
                break;
            case 18:
                g0 g0Var = (g0) this.b;
                l41 G2 = g0Var.Z.G(i9 - 1);
                if (G2 != null) {
                    pf.x xVar = g0Var.V;
                    if (!xVar.h(G2)) {
                        int i14 = G2.d;
                        int i15 = g0.c0;
                        if (i14 != -1) {
                            int i16 = g0.d0;
                            if (i14 == -2) {
                                g0Var.a0 = false;
                                xVar.h = false;
                                g0Var.Z.N(true);
                                g0Var.S(true);
                                break;
                            }
                        } else {
                            g0Var.a0 = true;
                            xVar.h = true;
                            g0Var.Z.N(true);
                            g0Var.S(true);
                            break;
                        }
                    }
                }
                break;
            case 19:
                ph.a aVar = (ph.a) this.b;
                int i17 = aVar.T.G(i9 - 1).d;
                if (i17 != 151) {
                    if (i17 == 150) {
                        aVar.P(true);
                        break;
                    }
                } else {
                    aVar.P(false);
                    break;
                }
                break;
            case 20:
                uf.h hVar2 = (uf.h) this.b;
                Runnable runnable = ((uf.a) hVar2.A.get(i9)).c;
                if (runnable != null) {
                    runnable.run();
                    hVar2.c(false);
                    break;
                }
                break;
            case 21:
                xs0 xs0Var = (xs0) this.b;
                i0 i0Var2 = (i0) i0.c().get(i9);
                xs0Var.q1.setTypeface(i0Var2.a);
                s0 e11 = s0.e(xs0Var.L1);
                String str2 = i0Var2.a;
                e11.j = str2;
                e11.a.edit().putString("typeface", str2).apply();
                yf.j jVar2 = xs0Var.O0;
                if (jVar2 instanceof v2) {
                    ((v2) jVar2).setTypeface(i0Var2);
                }
                xs0Var.z0(false);
                break;
            case 22:
                i1 i1Var = (i1) this.b;
                i1Var.X2.accept(Integer.valueOf(i1Var.W2.b(i9)));
                s0 s0Var = i1Var.W2;
                s0Var.c.put(Integer.valueOf(s0Var.f), Integer.valueOf(s0Var.b(i9)));
                s0Var.e = true;
                break;
            case 23:
                j0.V((j0) this.b, view);
                break;
            default:
                zf.s0 s0Var2 = (zf.s0) this.b;
                if (view != null) {
                    s0Var2.w1(view, true);
                    s0Var2.Z2 = false;
                    s0Var2.v0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
        }
    }
}
