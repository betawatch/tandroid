package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.a6;
import hi.ga;
import hi.u3;
import hi.x5;
import hi.z5;
import java.io.File;
import java.util.ArrayList;
import oi.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ov;
import org.telegram.messenger.pv;
import org.telegram.messenger.sr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.c60;
import org.telegram.ui.f30;
import org.telegram.ui.f60;
import org.telegram.ui.fk0;
import org.telegram.ui.gj0;
import org.telegram.ui.ke0;
import org.telegram.ui.km0;
import org.telegram.ui.le0;
import org.telegram.ui.nb1;
import org.telegram.ui.om0;
import org.telegram.ui.px;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w10 w10Var;
        boolean z10;
        TLRPC.Chat O0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i7 = this.a;
        int i10 = 2;
        final int i11 = 0;
        int i12 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                h0 h0Var = ((r) obj).h;
                v4.t tVar = h0Var.d;
                ArrayList arrayList = h0Var.n;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    h0Var.w = true;
                    h0Var.h.a(i12, true);
                    int i13 = ((o) arrayList.get(i12)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i13) != null || Math.abs(i13 - L0) <= h0Var.r * 9) && bz.c()) {
                        i iVar = new i(h0Var.getContext());
                        iVar.a = ((o) arrayList.get(i12)).d;
                        tVar.w0(iVar);
                        break;
                    } else {
                        h0Var.c.C0();
                        l5 l5Var = h0Var.f;
                        l5Var.b = L0 < i13 ? 0 : 1;
                        l5Var.k(i13, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                g1 g1Var = ((h1) obj).f2;
                int i14 = g1.w;
                g1Var.a(i12);
                break;
            case 2:
                ((g1) obj).a(i12);
                break;
            case 3:
                ga gaVar = (ga) obj;
                if (!gaVar.e.contains(Integer.valueOf(i12))) {
                    gaVar.e.add(Integer.valueOf(i12));
                } else if (gaVar.e.size() > 1) {
                    gaVar.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(gaVar.b, new ai.d0(gaVar, 26));
                break;
            case 4:
                z5 z5Var = ((x5) obj).b;
                if (z5Var.r && (w10Var = z5Var.f) != null) {
                    w10Var.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i12);
                    break;
                }
                break;
            case 7:
                ((b2) obj).Q.b4(i12);
                break;
            case 8:
                ((bn) obj).ha(i12);
                break;
            case 9:
                ((w10) obj).a(Integer.valueOf(i12));
                break;
            case 10:
                ((org.telegram.ui.Components.j) obj).a(Integer.valueOf(i12));
                break;
            case 11:
                org.telegram.ui.Components.o0 o0Var = (org.telegram.ui.Components.o0) obj;
                if (i12 == 0) {
                    o0Var.Z1 = !o0Var.Z1;
                } else if (i12 == 1) {
                    o0Var.a2 = !o0Var.a2;
                } else if (i12 == 2) {
                    o0Var.b2 = !o0Var.b2;
                }
                o0Var.T1.O(true);
                o0Var.J0();
                break;
            case 12:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((d2) view).c(z12, true);
                break;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.V2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.V(null, null);
                break;
            case 14:
                ((f30) obj).m1.x(i12, true);
                break;
            case 15:
                f30 f30Var = (f30) ((l20) obj).d;
                f30Var.K0(i12);
                f30Var.dismiss();
                break;
            case 16:
                ((h90) obj).S.k1(i12 + 8);
                break;
            case 17:
                zb0 zb0Var = (zb0) obj;
                if (zb0Var.e.getAdapter() instanceof kx) {
                    qy qyVar = ((kx) zb0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !qyVar.x1) {
                        z10 = false;
                        if (i12 == 0 && qyVar.w1) {
                            qyVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        qyVar.Q(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                zb0Var.e.x(i12, z10);
                break;
            case 18:
                q4 q4Var = (q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                q4Var.o1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                break;
            case 19:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 20:
                final it0 it0Var = (it0) obj;
                eq0 eq0Var = it0Var.a0;
                ts0 ts0Var = it0Var.U;
                i6 i6Var = it0Var.I1;
                long j3 = it0Var.m1;
                SparseArray[] sparseArrayArr = it0Var.c1;
                g2 g2Var = it0Var.y1;
                if (i12 == 101) {
                    int i15 = 13;
                    if (!it0.z0(it0Var.getSelectedTab()) && it0Var.getSelectedTab() != 13) {
                        if (it0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = g2Var.getMessagesController().I1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                long j10 = ((ov) arrayList2.get(i16)).a;
                                if (ts0Var.x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (arrayList3.isEmpty()) {
                                z11 = false;
                            } else {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                boolean z14 = longValue == g2Var.getUserConfig().e();
                                z11 = z14;
                                if (longValue < 0) {
                                    TLRPC.Chat O02 = g2Var.getMessagesController().O0(Long.valueOf(-longValue));
                                    z11 = z14;
                                    if (O02 != null) {
                                        str = O02.title;
                                        z11 = z14;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User c22 = g2Var.getMessagesController().c2(l10);
                                    z11 = z14;
                                    if (c22 != null) {
                                        if (n10.t(c22)) {
                                            str = gd.N0(2131754249, null);
                                            z11 = z14;
                                        } else {
                                            str = n10.q(c22);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                            String a02 = arrayList3.size() == 1 ? gd.a0(null, null, z11 ? 2131752069 : 2131752065, str) : gd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = a02;
                            t1Var.U = arrayList3.size() == 1 ? gd.a0(null, null, z11 ? 2131752070 : 2131752071, str) : gd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(gd.N0(2131746125, null), new q1() { // from class: org.telegram.ui.Components.aq0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i17) {
                                    int i18 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    it0 it0Var2 = it0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                            g2Var2.getMessagesController().R1().s(arrayList4, it0Var2.m1);
                                            kc.b0(g2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            it0Var2.V(false);
                                            break;
                                        default:
                                            it0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                                it0Var2.y1.getMessagesController().i0(((Long) arrayList4.get(i19)).longValue(), 0, null);
                                            }
                                            it0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            g2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                u6.U(textView, n6.q7, null);
                                break;
                            }
                        } else {
                            if (n5.C(j3)) {
                                encryptedChat = g2Var.getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                                user = null;
                                O0 = null;
                            } else if (n5.E(j3)) {
                                user = g2Var.getMessagesController().c2(Long.valueOf(j3));
                                O0 = null;
                                encryptedChat = null;
                            } else {
                                O0 = g2Var.getMessagesController().O0(Long.valueOf(-j3));
                                user = null;
                                encryptedChat = null;
                            }
                            b5.y(g2Var, user, O0, encryptedChat, null, it0Var.f1, null, it0Var.c1, null, 0, 0, null, new gp0(it0Var, 14), null, it0Var.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (it0Var.B0() && eq0Var != null && eq0Var.getCurrentList() != null) {
                            a6 currentList = eq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem = ((fj) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                                String N0 = gd.N0(arrayList4.size() > 1 ? 2131751548 : 2131751552, null);
                                t1 t1Var2 = alertDialog$Builder2.a;
                                t1Var2.S = N0;
                                t1Var2.U = gd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(gd.N0(2131751586, null), new rm(it0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(gd.N0(2131752577, null), new ub0(i15));
                                t1Var2.show();
                                t1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList5 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                                TL_stories.StoryItem storyItem2 = ((fj) sparseArrayArr[0].valueAt(i18)).l;
                                if (storyItem2 != null) {
                                    arrayList5.add(storyItem2);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, it0Var.getContext(), i6Var);
                                String N02 = gd.N0(arrayList5.size() > 1 ? 2131751477 : 2131751475, null);
                                t1 t1Var3 = alertDialog$Builder3.a;
                                t1Var3.S = N02;
                                t1Var3.U = gd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(gd.N0(2131751586, null), new q1() { // from class: org.telegram.ui.Components.aq0
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i172) {
                                        int i182 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        it0 it0Var2 = it0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                g2Var2.getMessagesController().R1().s(arrayList42, it0Var2.m1);
                                                kc.b0(g2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                it0Var2.V(false);
                                                break;
                                            default:
                                                it0Var2.getClass();
                                                for (int i19 = 0; i19 < arrayList42.size(); i19++) {
                                                    it0Var2.y1.getMessagesController().i0(((Long) arrayList42.get(i19)).longValue(), 0, null);
                                                }
                                                it0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(gd.N0(2131752577, null), new ub0(14));
                                t1Var3.show();
                                t1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (it0Var.h1 != null) {
                        mp messagesController = g2Var.getMessagesController();
                        TLRPC.UserFull userFull = it0Var.h1;
                        messagesController.getClass();
                        if (mp.Q2(userFull)) {
                            u3 u3Var = it0Var.H1;
                            if (u3Var != null) {
                                u3Var.v(gd.N0(2131750517, null));
                                it0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (it0Var.g1 != null) {
                        TLRPC.Chat O03 = g2Var.getMessagesController().O0(Long.valueOf(it0Var.g1.id));
                        if (g2Var.getMessagesController().r2(O03)) {
                            u3 u3Var2 = it0Var.H1;
                            if (u3Var2 != null) {
                                u3Var2.v((!v3.T(O03) || O03.megagroup) ? gd.N0(2131750518, null) : gd.N0(2131750519, null));
                                it0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (it0Var.u0()) {
                        u3 u3Var3 = it0Var.H1;
                        if (u3Var3 != null) {
                            u3Var3.v(gd.N0(2131750520, "ForwardsRestrictedInfoBot"));
                            it0Var.H1.z(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        bx bxVar = new bx(bundle);
                        bxVar.E2 = new ip0(it0Var);
                        g2Var.presentFragment(bxVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (it0Var.getClosestTab() != 8) {
                            pv I1 = g2Var.getMessagesController().I1();
                            ArrayList arrayList6 = I1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                long j11 = ((ov) arrayList6.get(i19)).a;
                                if (ts0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (I1.n(arrayList7, i12 == 103, true)) {
                                int i20 = 0;
                                while (true) {
                                    ds0[] ds0VarArr = it0Var.n0;
                                    if (i20 < ds0VarArr.length) {
                                        ds0 ds0Var = ds0VarArr[i20];
                                        if (ds0Var.F == 11) {
                                            ds0Var.x.h1(0, 0);
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                            } else {
                                g2Var.showDialog(new ug.k0(33, g2Var.getCurrentAccount(), it0Var.getContext(), g2Var, null));
                            }
                            it0Var.V(true);
                            break;
                        } else {
                            rr0 rr0Var = it0Var.f0;
                            if (rr0Var != null && rr0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                    arrayList8.add(Integer.valueOf(((fj) sparseArrayArr[0].valueAt(i21)).e1()));
                                }
                                it0Var.f1(arrayList8, i12 == 103);
                                it0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    fj fjVar = (fj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = fj.B0(fjVar.k);
                    if (n5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (n5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat O04 = g2Var.getMessagesController().O0(Long.valueOf(-B0));
                        if (O04 != null && O04.migrated_to != null) {
                            bundle2.putLong("migrated_to", B0);
                            B0 = -O04.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -B0);
                    }
                    bundle2.putInt("message_id", fjVar.e1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    bn bnVar = new bn(bundle2);
                    bnVar.d8 = fjVar.e1();
                    long j12 = it0Var.G;
                    if (j12 != 0) {
                        qg.c.a(bnVar, sr.a(B0, j12));
                        bundle2.putInt("message_id", fjVar.e1());
                    }
                    g2Var.presentFragment(bnVar, false);
                    break;
                }
                break;
            case 21:
                n51 n51Var = (n51) obj;
                int i22 = n51Var.b.i.q;
                if (i22 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    n51Var.updateAppUpdateViews(i12, true);
                    break;
                } else if (i22 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.j) {
                            HttpGetFileTask httpGetFileTask = e10.l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.j = false;
                            ks.e().k(ks.T4, new Object[0]);
                        }
                    }
                    n51Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g10 = org.telegram.messenger.t0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", n51Var.d, null, false);
                        break;
                    }
                }
                break;
            case 22:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i12, true);
                break;
            case 23:
                zb1 zb1Var = (zb1) obj;
                if (zb1Var.V == null && view.getAlpha() != 0.0f) {
                    zb1Var.c(i12, true);
                    break;
                }
                break;
            case 24:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 25:
                px pxVar = (px) obj;
                if (pxVar.n != null && i12 != pxVar.s) {
                    n41 n41Var = pxVar.r;
                    if (n41Var != null) {
                        n41Var.A = i12;
                    }
                    pxVar.b(i12, true);
                    pxVar.n.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 26:
                f60 f60Var = (f60) obj;
                f60Var.R.dismiss();
                int i23 = f60Var.d0;
                if (i23 >= 0) {
                    v2 v2Var = f60Var.e0;
                    int[] iArr = v2Var.c;
                    if (!v2Var.b) {
                        v2Var.b = true;
                        while (i11 < 4) {
                            iArr[i11] = bz.q().getInt(i5.c.i(i11, "keep_media_type_"), v2.b(i11));
                            i11++;
                        }
                    }
                    iArr[i23] = i12;
                    bz.q().edit().putInt("keep_media_type_" + i23, i12).apply();
                    c60 c60Var = f60Var.f0;
                    if (c60Var != null) {
                        c60Var.a(i12);
                        break;
                    }
                } else {
                    c60 c60Var2 = f60Var.f0;
                    if (c60Var2 != null) {
                        c60Var2.a(i12);
                        break;
                    }
                }
                break;
            case 27:
                le0 le0Var = (le0) obj;
                ValueAnimator valueAnimator = le0Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    nb1 nb1Var = le0Var.c;
                    if (!nb1Var.I) {
                        if (nb1Var.getCurrentPosition() == i12) {
                            Object c02 = le0Var.c0();
                            if (c02 instanceof ke0) {
                                ((ke0) c02).v();
                                break;
                            }
                        } else {
                            le0Var.s0(i12, true);
                            le0Var.c.C(i12);
                            break;
                        }
                    }
                }
                break;
            case 28:
                fk0 fk0Var = (fk0) obj;
                gj0 gj0Var = fk0Var.E1;
                fk0Var.T0 = i12;
                if (i12 == 1) {
                    fk0Var.j0 = fk0Var.h0;
                } else if (i12 == 4) {
                    fk0Var.j0 = fk0Var.i0;
                } else if (i12 == 2) {
                    fk0Var.j0 = fk0Var.f0;
                } else if (i12 == 3) {
                    fk0Var.j0 = fk0Var.g0;
                } else {
                    fk0Var.j0 = fk0Var.e0;
                }
                yv yvVar = (yv) view.getTag();
                PhotoViewer.p1().J2(null, fk0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(fk0Var.k1);
                    PhotoViewer.p1().c2(arrayList9, 0, gj0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(fk0Var.m1);
                    PhotoViewer.p1().c2(arrayList10, 0, gj0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(fk0Var.n1);
                    PhotoViewer.p1().c2(arrayList11, 0, gj0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = fk0Var.j1;
                    p12.c2(arrayList12, arrayList12.indexOf(yvVar), gj0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = fk0Var.l1;
                    p13.c2(arrayList13, arrayList13.indexOf(yvVar), gj0Var);
                    break;
                }
            default:
                om0 om0Var = (om0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = om0Var.J;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    om0Var.J.d(true);
                }
                if (i12 == 0) {
                    b5.I(om0Var.getParentActivity(), om0Var.G.a(), new km0(om0Var, i10));
                    break;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
