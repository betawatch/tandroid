package ag;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dg.e1;
import dg.s0;
import eg.c2;
import eg.z3;
import f2.p0;
import fg.f1;
import fg.v0;
import java.util.ArrayList;
import java.util.HashSet;
import kh.v;
import lh.s3;
import lh.x1;
import mh.aa;
import mh.ja;
import mh.t9;
import mh.z9;
import oh.c7;
import oh.d6;
import oh.i9;
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
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.ht0;
import org.telegram.ui.hx;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.web.v1;
import org.telegram.ui.xn;
import org.telegram.ui.xw;
import qh.c1;
import qh.f9;
import qh.i1;
import qh.n1;
import qh.o1;
import qh.r;
import qh.u;
import qh.y1;
import uf.z;
import vf.a0;
import vf.c0;
import vf.f0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        j51 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        l5 l5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                Runnable runnable = ((a) oVar.B.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    oVar.c(false);
                    break;
                }
                break;
            case 1:
                ht0 ht0Var = (ht0) this.b;
                s0 s0Var = (s0) s0.c().get(i10);
                ht0Var.r1.setTypeface(s0Var.a);
                e1 e6 = e1.e(ht0Var.M1);
                String str = s0Var.a;
                e6.j = str;
                e6.a.edit().putString("typeface", str).apply();
                eg.j jVar = ht0Var.P0;
                if (jVar instanceof z3) {
                    ((z3) jVar).setTypeface(s0Var);
                }
                ht0Var.z0(false);
                break;
            case 2:
                c2 c2Var = (c2) this.b;
                c2Var.Y2.accept(Integer.valueOf(c2Var.X2.b(i10)));
                e1 e1Var = c2Var.X2;
                e1Var.c.put(Integer.valueOf(e1Var.f), Integer.valueOf(e1Var.b(i10)));
                e1Var.e = true;
                break;
            case 3:
                v0.W((v0) this.b, view);
                break;
            case 4:
                f1 f1Var = (f1) this.b;
                if (view != null) {
                    f1Var.w1(view, true);
                    f1Var.a3 = false;
                    f1Var.v0(0, view.getTop() - ((f1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 5:
                ((ga0) this.b).h(view);
                break;
            case 6:
                ((v) this.b).h(view);
                break;
            case 7:
                s3 s3Var = (s3) this.b;
                qh.d dVar = s3Var.Y;
                HashSet hashSet = s3Var.W;
                x51 x51Var = s3Var.a0;
                if (x51Var != null && (G = x51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i12 = savedStarGift.msg_id;
                        long j10 = i12 == 0 ? savedStarGift.saved_id : i12;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((x1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((x1) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                        break;
                    }
                }
                break;
            case 8:
                ja.x0((ja) this.b, i10);
                break;
            case 9:
                t9.P((t9) this.b, i10);
                break;
            case 10:
                z9.P((z9) this.b, i10);
                break;
            case 11:
                aa.P((aa) this.b, i10);
                break;
            case 12:
                ((hx) this.b).i((oh.o) view, false);
                break;
            case 13:
                ph.l lVar = (ph.l) this.b;
                or0 or0Var = lVar.T;
                p2 p2Var = or0Var.a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
                    if (!or0Var.D.z1) {
                        i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                        Context context = lVar.getContext();
                        int id2 = messageObject.getId();
                        d6 d6Var = lVar.a;
                        c7 a2 = c7.a(lVar.f);
                        a2.s += ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).p1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, d6Var, a2);
                        break;
                    } else if (!or0Var.c(messageObject)) {
                        or0Var.e(messageObject);
                        break;
                    } else {
                        or0Var.g(messageObject);
                        break;
                    }
                }
                break;
            case 14:
                Utilities.Callback callback = ((u) this.b).c;
                if (callback != null) {
                    callback.run((r) r.a().get(i10));
                    break;
                }
                break;
            case 15:
                i1 i1Var = (i1) this.b;
                y1 y1Var = i1Var.r;
                Object F = i1Var.c.F(i10);
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
            case 16:
                o1 o1Var = (o1) this.b;
                y1 y1Var2 = o1Var.s;
                n1 n1Var = o1Var.c;
                if (i10 >= 0) {
                    o1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = n1Var.s;
                        ArrayList arrayList2 = n1Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) n1Var.s.get(i10);
                        if (document2 != y1Var2.e) {
                            long longValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (document2 == null && (view instanceof c1) && (l5Var = ((c1) view).c) != null) {
                                document2 = l5Var.e;
                            }
                            if (document2 == null && longValue != 0) {
                                i11 = ((h3) y1Var2).currentAccount;
                                document2 = l5.f(i11, longValue);
                            }
                            if (document2 != null) {
                                Utilities.Callback3Return callback3Return2 = y1Var2.y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(n1Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                                }
                                y1Var2.dismiss();
                                break;
                            }
                        } else {
                            vf.g gVar = y1Var2.B;
                            if (gVar != null) {
                                gVar.run();
                            }
                            y1Var2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 17:
                f9 f9Var = (f9) this.b;
                s0 s0Var2 = (s0) s0.c().get(i10);
                f9Var.i1.setTypeface(s0Var2.a);
                e1 e10 = e1.e(f9Var.C1);
                String str2 = s0Var2.a;
                e10.j = str2;
                e10.a.edit().putString("typeface", str2).apply();
                eg.j jVar2 = f9Var.G0;
                if (jVar2 instanceof z3) {
                    ((z3) jVar2).setTypeface(s0Var2);
                }
                f9Var.P0(false);
                break;
            case 18:
                rh.g.x0((rh.g) this.b, i10);
                break;
            case 19:
                x51 x51Var2 = ((rh.f) this.b).Y;
                if (x51Var2 != null) {
                    x51Var2.G(i10 - 1);
                    break;
                }
                break;
            case 20:
                sh.j.A0((sh.j) this.b, i10);
                break;
            case 21:
                z zVar = (z) this.b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.B) {
                        ay ayVar = zVar.R;
                        if (ayVar != null) {
                            ayVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                ay ayVar2 = zVar.R;
                if (ayVar2 != null) {
                    py pyVar = ayVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!pyVar.i2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        pyVar.J3();
                        if (AndroidUtilities.isTablet() && pyVar.b0 != null) {
                            int i13 = 0;
                            while (true) {
                                oy[] oyVarArr = pyVar.b0;
                                if (i13 < oyVarArr.length) {
                                    xw xwVar = oyVarArr[i13].d;
                                    pyVar.m2.dialogId = longValue2;
                                    xwVar.s = longValue2;
                                    i13++;
                                } else {
                                    pyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (pyVar.k2 == null) {
                            if (pyVar.getMessagesController().checkCanOpenChat(bundle, pyVar)) {
                                pyVar.presentFragment(new xn(bundle));
                                break;
                            }
                        } else if (pyVar.getMessagesController().checkCanOpenChat(bundle, pyVar)) {
                            pyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            pyVar.presentFragment(new xn(bundle));
                            break;
                        }
                    } else if (pyVar.h5(longValue2)) {
                        if (!pyVar.F2.isEmpty()) {
                            pyVar.P3(longValue2, pyVar.i3(longValue2, null));
                            pyVar.a5();
                            kVar = ((p2) pyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            pyVar.O3(longValue2, 0L, true, null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                c0 c0Var = (c0) this.b;
                vf.z zVar2 = c0Var.x;
                mi miVar = c0Var.b;
                p0 adapter = c0Var.s.getAdapter();
                a0 a0Var = c0Var.y;
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
                if (O instanceof vf.o1) {
                    if (!UserConfig.getInstance(miVar.G1).isPremium()) {
                        if (miVar.c0 != null) {
                            new fg.n1(miVar.c0, c0Var.getContext(), miVar.G1, true, 31, false, null).show();
                            break;
                        }
                    } else {
                        vf.o1 o1Var2 = (vf.o1) O;
                        z4.a0(miVar.G1, o1Var2.a(), miVar.n1(), new v1(18, c0Var, o1Var2));
                        break;
                    }
                }
                break;
            case 23:
                f0 f0Var = (f0) this.b;
                j51 G2 = f0Var.a0.G(i10 - 1);
                if (G2 != null) {
                    vf.v vVar = f0Var.W;
                    if (!vVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = f0.d0;
                        if (i15 != -1) {
                            int i17 = f0.e0;
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
            default:
                vh.a aVar = (vh.a) this.b;
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
        }
    }
}
