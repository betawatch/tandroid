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
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ft0;
import org.telegram.ui.gx;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.ww;
import org.telegram.ui.xn;
import org.telegram.ui.zx;
import ph.h9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        i51 G;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        l5 l5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.a) {
            case 0:
                ft0 ft0Var = (ft0) this.b;
                cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
                ft0Var.r1.setTypeface(t0Var.a);
                cg.f1 e = cg.f1.e(ft0Var.M1);
                String str = t0Var.a;
                e.j = str;
                e.a.edit().putString("typeface", str).apply();
                j jVar = ft0Var.P0;
                if (jVar instanceof b4) {
                    ((b4) jVar).setTypeface(t0Var);
                }
                ft0Var.z0(false);
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
                    g1Var.w1(view, true);
                    g1Var.a3 = false;
                    g1Var.v0(0, view.getTop() - ((g1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    break;
                }
                break;
            case 4:
                ((ea0) this.b).h(view);
                break;
            case 5:
                ((jh.v) this.b).h(view);
                break;
            case 6:
                kh.s3 s3Var = (kh.s3) this.b;
                ph.d dVar = s3Var.Y;
                HashSet hashSet = s3Var.W;
                w51 w51Var = s3Var.a0;
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
                ((gx) this.b).i((nh.p) view, false);
                break;
            case 12:
                oh.r rVar = (oh.r) this.b;
                nr0 nr0Var = rVar.T;
                org.telegram.ui.ActionBar.p2 p2Var = nr0Var.a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
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
                ph.i1 i1Var = (ph.i1) this.b;
                ph.y1 y1Var = i1Var.r;
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
            case 15:
                ph.o1 o1Var = (ph.o1) this.b;
                ph.y1 y1Var2 = o1Var.s;
                ph.n1 n1Var = o1Var.c;
                if (i10 >= 0) {
                    o1Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList = n1Var.s;
                        ArrayList arrayList2 = n1Var.v;
                        TLRPC.Document document2 = i10 >= arrayList.size() ? null : (TLRPC.Document) n1Var.s.get(i10);
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
                                    callback3Return2.run(n1Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
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
                rh.k.A0((rh.k) this.b, i10);
                break;
            case 20:
                tf.z zVar = (tf.z) this.b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.B) {
                        zx zxVar = zVar.R;
                        if (zxVar != null) {
                            zxVar.a.N4(n4Var.getDialogId(), view);
                            break;
                        }
                    }
                }
                zx zxVar2 = zVar.R;
                if (zxVar2 != null) {
                    oy oyVar = zxVar2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (!oyVar.i2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(longValue2)) {
                            bundle.putLong("user_id", longValue2);
                        } else {
                            bundle.putLong("chat_id", -longValue2);
                        }
                        oyVar.J3();
                        if (AndroidUtilities.isTablet() && oyVar.b0 != null) {
                            int i13 = 0;
                            while (true) {
                                ny[] nyVarArr = oyVar.b0;
                                if (i13 < nyVarArr.length) {
                                    ww wwVar = nyVarArr[i13].d;
                                    oyVar.m2.dialogId = longValue2;
                                    wwVar.s = longValue2;
                                    i13++;
                                } else {
                                    oyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (oyVar.k2 == null) {
                            if (oyVar.getMessagesController().checkCanOpenChat(bundle, oyVar)) {
                                oyVar.presentFragment(new xn(bundle));
                                break;
                            }
                        } else if (oyVar.getMessagesController().checkCanOpenChat(bundle, oyVar)) {
                            oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            oyVar.presentFragment(new xn(bundle));
                            break;
                        }
                    } else if (oyVar.h5(longValue2)) {
                        if (!oyVar.F2.isEmpty()) {
                            oyVar.P3(longValue2, oyVar.i3(longValue2, null));
                            oyVar.a5();
                            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                            kVar.h(true);
                            break;
                        } else {
                            oyVar.O3(longValue2, 0L, true, null);
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
                        uf.o1 o1Var2 = (uf.o1) O;
                        z4.a0(liVar.G1, o1Var2.a(), liVar.n1(), new org.telegram.ui.web.u1(18, c0Var, o1Var2));
                        break;
                    }
                }
                break;
            case 22:
                uf.e0 e0Var = (uf.e0) this.b;
                i51 G2 = e0Var.a0.G(i10 - 1);
                if (G2 != null) {
                    uf.v vVar = e0Var.W;
                    if (!vVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = uf.e0.d0;
                        if (i15 != -1) {
                            int i17 = uf.e0.e0;
                            if (i15 == -2) {
                                e0Var.b0 = false;
                                vVar.h = false;
                                e0Var.a0.N(true);
                                e0Var.T(true);
                                break;
                            }
                        } else {
                            e0Var.b0 = true;
                            vVar.h = true;
                            e0Var.a0.N(true);
                            e0Var.T(true);
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
                zf.i iVar = (zf.i) this.b;
                Runnable runnable = ((zf.a) iVar.B.get(i10)).c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    break;
                }
                break;
        }
    }
}
