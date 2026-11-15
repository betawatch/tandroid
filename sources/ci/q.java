package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.h1;
import di.i1;
import fi.c6;
import hi.l3;
import hi.l9;
import hi.o5;
import hi.r5;
import java.io.File;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cw;
import org.telegram.messenger.ez;
import org.telegram.messenger.fk;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.sv;
import org.telegram.messenger.t3;
import org.telegram.messenger.tv;
import org.telegram.messenger.u2;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.a60;
import org.telegram.ui.an;
import org.telegram.ui.d30;
import org.telegram.ui.d60;
import org.telegram.ui.ek0;
import org.telegram.ui.fj0;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.km0;
import org.telegram.ui.lb1;
import org.telegram.ui.nx;
import org.telegram.ui.om0;
import org.telegram.ui.sm0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yb1;
import org.telegram.ui.yw;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i7, gj gjVar) {
        this.a = 29;
        this.b = i7;
        this.c = gjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z10 z10Var;
        boolean z10;
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i7 = this.a;
        int i10 = 2;
        final int i11 = 0;
        Object obj = this.c;
        int i12 = this.b;
        switch (i7) {
            case 0:
                g0 g0Var = ((r) obj).h;
                v4.s sVar = g0Var.d;
                ArrayList arrayList = g0Var.n;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    g0Var.w = true;
                    g0Var.h.a(i12, true);
                    int i13 = ((o) arrayList.get(i12)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i13) != null || Math.abs(i13 - L0) <= g0Var.r * 9) && gz.c()) {
                        i iVar = new i(g0Var.getContext());
                        iVar.a = ((o) arrayList.get(i12)).d;
                        sVar.w0(iVar);
                        break;
                    } else {
                        g0Var.c.C0();
                        wi0 wi0Var = g0Var.f;
                        wi0Var.b = L0 < i13 ? 0 : 1;
                        wi0Var.d(i13, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                h1 h1Var = ((i1) obj).f2;
                int i14 = h1.w;
                h1Var.a(i12);
                break;
            case 2:
                ((h1) obj).a(i12);
                break;
            case 3:
                l9 l9Var = (l9) obj;
                if (!l9Var.e.contains(Integer.valueOf(i12))) {
                    l9Var.e.add(Integer.valueOf(i12));
                } else if (l9Var.e.size() > 1) {
                    l9Var.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(l9Var.b, new ai.g0(l9Var, 25));
                break;
            case 4:
                r5 r5Var = ((o5) obj).b;
                if (r5Var.r && (z10Var = r5Var.f) != null) {
                    z10Var.a(Integer.valueOf(i12));
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
                    aVar.g(i12);
                    break;
                }
                break;
            case 7:
                ((z1) obj).Q.b4(i12);
                break;
            case 8:
                ((an) obj).ha(i12);
                break;
            case 9:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj;
                if (i12 == 0) {
                    f0Var.Z1 = !f0Var.Z1;
                } else if (i12 == 1) {
                    f0Var.a2 = !f0Var.a2;
                } else if (i12 == 2) {
                    f0Var.b2 = !f0Var.b2;
                }
                f0Var.T1.O(true);
                f0Var.I0();
                break;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((c2) view).c(z12, true);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.V2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.V(null, null);
                break;
            case 12:
                ((d30) obj).m1.x(i12, true);
                break;
            case 13:
                d30 d30Var = (d30) ((d20) obj).d;
                d30Var.J0(i12);
                d30Var.dismiss();
                break;
            case 14:
                ((y80) obj).S.k1(i12 + 8);
                break;
            case 15:
                qb0 qb0Var = (qb0) obj;
                if (qb0Var.e.getAdapter() instanceof fx) {
                    ly lyVar = ((fx) qb0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !lyVar.x1) {
                        z10 = false;
                        if (i12 == 0 && lyVar.w1) {
                            lyVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        lyVar.Q(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                qb0Var.e.x(i12, z10);
                break;
            case 16:
                i4 i4Var = (i4) obj;
                EditTextBoldCursor editTextBoldCursor = i4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                i4Var.o1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                i4Var.dismiss();
                break;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 18:
                final ys0 ys0Var = (ys0) obj;
                vp0 vp0Var = ys0Var.a0;
                js0 js0Var = ys0Var.U;
                e6 e6Var = ys0Var.I1;
                long j3 = ys0Var.m1;
                SparseArray[] sparseArrayArr = ys0Var.c1;
                e2 e2Var = ys0Var.y1;
                if (i12 == 101) {
                    int i15 = 13;
                    if (!ys0.z0(ys0Var.getSelectedTab()) && ys0Var.getSelectedTab() != 13) {
                        if (ys0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = e2Var.getMessagesController().G1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                long j10 = ((sv) arrayList2.get(i16)).a;
                                if (js0Var.x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (arrayList3.isEmpty()) {
                                z11 = false;
                            } else {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                boolean z14 = longValue == e2Var.getUserConfig().e();
                                z11 = z14;
                                if (longValue < 0) {
                                    TLRPC.Chat M02 = e2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z11 = z14;
                                    if (M02 != null) {
                                        str = M02.title;
                                        z11 = z14;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User a22 = e2Var.getMessagesController().a2(l10);
                                    z11 = z14;
                                    if (a22 != null) {
                                        if (q10.s(a22)) {
                                            str = hd.M0(2131754252, null);
                                            z11 = z14;
                                        } else {
                                            str = q10.p(a22);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                            String a02 = arrayList3.size() == 1 ? hd.a0(null, null, z11 ? 2131752081 : 2131752077, str) : hd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = a02;
                            t1Var.U = arrayList3.size() == 1 ? hd.a0(null, null, z11 ? 2131752082 : 2131752083, str) : hd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(hd.M0(2131746321, null), new q1() { // from class: org.telegram.ui.Components.pp0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i17) {
                                    int i18 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    ys0 ys0Var2 = ys0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var2.y1;
                                            e2Var2.getMessagesController().P1().s(arrayList4, ys0Var2.m1);
                                            cc.a0(e2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            ys0Var2.V(false);
                                            break;
                                        default:
                                            ys0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                                ys0Var2.y1.getMessagesController().i0(((Long) arrayList4.get(i19)).longValue(), 0, null);
                                            }
                                            ys0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            e2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                q6.U(textView, j6.q7, null);
                                break;
                            }
                        } else {
                            if (m5.C(j3)) {
                                encryptedChat = e2Var.getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                                user = null;
                                M0 = null;
                            } else if (m5.E(j3)) {
                                user = e2Var.getMessagesController().a2(Long.valueOf(j3));
                                M0 = null;
                                encryptedChat = null;
                            } else {
                                M0 = e2Var.getMessagesController().M0(Long.valueOf(-j3));
                                user = null;
                                encryptedChat = null;
                            }
                            t4.y(e2Var, user, M0, encryptedChat, null, ys0Var.f1, null, ys0Var.c1, null, 0, 0, null, new wo0(ys0Var, 14), null, ys0Var.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (ys0Var.B0() && vp0Var != null && vp0Var.getCurrentList() != null) {
                            c6 currentList = vp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem = ((gj) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                                String M03 = hd.M0(arrayList4.size() > 1 ? 2131751560 : 2131751564, null);
                                t1 t1Var2 = alertDialog$Builder2.a;
                                t1Var2.S = M03;
                                t1Var2.U = hd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(hd.M0(2131751598, null), new km(ys0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(hd.M0(2131752589, null), new rb0(12));
                                t1Var2.show();
                                t1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList5 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                                TL_stories.StoryItem storyItem2 = ((gj) sparseArrayArr[0].valueAt(i18)).l;
                                if (storyItem2 != null) {
                                    arrayList5.add(storyItem2);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ys0Var.getContext(), e6Var);
                                String M04 = hd.M0(arrayList5.size() > 1 ? 2131751489 : 2131751487, null);
                                t1 t1Var3 = alertDialog$Builder3.a;
                                t1Var3.S = M04;
                                t1Var3.U = hd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(hd.M0(2131751598, null), new q1() { // from class: org.telegram.ui.Components.pp0
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i172) {
                                        int i182 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        ys0 ys0Var2 = ys0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var2.y1;
                                                e2Var2.getMessagesController().P1().s(arrayList42, ys0Var2.m1);
                                                cc.a0(e2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                ys0Var2.V(false);
                                                break;
                                            default:
                                                ys0Var2.getClass();
                                                for (int i19 = 0; i19 < arrayList42.size(); i19++) {
                                                    ys0Var2.y1.getMessagesController().i0(((Long) arrayList42.get(i19)).longValue(), 0, null);
                                                }
                                                ys0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(hd.M0(2131752589, null), new rb0(i15));
                                t1Var3.show();
                                t1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (ys0Var.h1 != null) {
                        np messagesController = e2Var.getMessagesController();
                        TLRPC.UserFull userFull = ys0Var.h1;
                        messagesController.getClass();
                        if (np.K2(userFull)) {
                            l3 l3Var = ys0Var.H1;
                            if (l3Var != null) {
                                l3Var.u(hd.M0(2131750534, null));
                                ys0Var.H1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ys0Var.g1 != null) {
                        TLRPC.Chat M05 = e2Var.getMessagesController().M0(Long.valueOf(ys0Var.g1.id));
                        if (e2Var.getMessagesController().o2(M05)) {
                            l3 l3Var2 = ys0Var.H1;
                            if (l3Var2 != null) {
                                l3Var2.u((!t3.T(M05) || M05.megagroup) ? hd.M0(2131750535, null) : hd.M0(2131750536, null));
                                ys0Var.H1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ys0Var.u0()) {
                        l3 l3Var3 = ys0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.u(hd.M0(2131750537, "ForwardsRestrictedInfoBot"));
                            ys0Var.H1.y(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        yw ywVar = new yw(bundle);
                        ywVar.E2 = new yo0(ys0Var);
                        e2Var.presentFragment(ywVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (ys0Var.getClosestTab() != 8) {
                            tv G1 = e2Var.getMessagesController().G1();
                            ArrayList arrayList6 = G1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                long j11 = ((sv) arrayList6.get(i19)).a;
                                if (js0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (G1.n(arrayList7, i12 == 103, true)) {
                                int i20 = 0;
                                while (true) {
                                    tr0[] tr0VarArr = ys0Var.n0;
                                    if (i20 < tr0VarArr.length) {
                                        tr0 tr0Var = tr0VarArr[i20];
                                        if (tr0Var.F == 11) {
                                            tr0Var.x.h1(0, 0);
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                            } else {
                                e2Var.showDialog(new ug.j0(33, e2Var.getCurrentAccount(), ys0Var.getContext(), e2Var, null));
                            }
                            ys0Var.V(true);
                            break;
                        } else {
                            ir0 ir0Var = ys0Var.f0;
                            if (ir0Var != null && ir0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                    arrayList8.add(Integer.valueOf(((gj) sparseArrayArr[0].valueAt(i21)).e1()));
                                }
                                ys0Var.f1(arrayList8, i12 == 103);
                                ys0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    gj gjVar = (gj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = gj.B0(gjVar.k);
                    if (m5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (m5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat M06 = e2Var.getMessagesController().M0(Long.valueOf(-B0));
                        if (M06 != null && M06.migrated_to != null) {
                            bundle2.putLong("migrated_to", B0);
                            B0 = -M06.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -B0);
                    }
                    bundle2.putInt("message_id", gjVar.e1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    an anVar = new an(bundle2);
                    anVar.c8 = gjVar.e1();
                    long j12 = ys0Var.G;
                    if (j12 != 0) {
                        qg.c.a(anVar, ur.a(B0, j12));
                        bundle2.putInt("message_id", gjVar.e1());
                    }
                    e2Var.presentFragment(anVar, false);
                    break;
                }
                break;
            case 19:
                b51 b51Var = (b51) obj;
                int i22 = b51Var.b.i.q;
                if (i22 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    b51Var.updateAppUpdateViews(i12, true);
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
                            ns.e().k(ns.Q4, new Object[0]);
                        }
                    }
                    b51Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g10 = org.telegram.messenger.t0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", b51Var.d, null, false);
                        break;
                    }
                }
                break;
            case 20:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i12, true);
                break;
            case 21:
                yb1 yb1Var = (yb1) obj;
                if (yb1Var.V == null && view.getAlpha() != 0.0f) {
                    yb1Var.c(i12, true);
                    break;
                }
                break;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 23:
                nx nxVar = (nx) obj;
                if (nxVar.n != null && i12 != nxVar.s) {
                    b41 b41Var = nxVar.r;
                    if (b41Var != null) {
                        b41Var.z = i12;
                    }
                    nxVar.b(i12, true);
                    nxVar.n.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 24:
                d60 d60Var = (d60) obj;
                d60Var.R.dismiss();
                int i23 = d60Var.d0;
                if (i23 >= 0) {
                    u2 u2Var = d60Var.e0;
                    int[] iArr = u2Var.c;
                    if (!u2Var.b) {
                        u2Var.b = true;
                        while (i11 < 4) {
                            iArr[i11] = gz.q().getInt(i5.c.i(i11, "keep_media_type_"), u2.b(i11));
                            i11++;
                        }
                    }
                    iArr[i23] = i12;
                    gz.q().edit().putInt("keep_media_type_" + i23, i12).apply();
                    a60 a60Var = d60Var.f0;
                    if (a60Var != null) {
                        a60Var.a(i12);
                        break;
                    }
                } else {
                    a60 a60Var2 = d60Var.f0;
                    if (a60Var2 != null) {
                        a60Var2.a(i12);
                        break;
                    }
                }
                break;
            case 25:
                je0 je0Var = (je0) obj;
                ValueAnimator valueAnimator = je0Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    lb1 lb1Var = je0Var.c;
                    if (!lb1Var.I) {
                        if (lb1Var.getCurrentPosition() == i12) {
                            Object c02 = je0Var.c0();
                            if (c02 instanceof ie0) {
                                ((ie0) c02).v();
                                break;
                            }
                        } else {
                            je0Var.s0(i12, true);
                            je0Var.c.C(i12);
                            break;
                        }
                    }
                }
                break;
            case 26:
                ek0 ek0Var = (ek0) obj;
                fj0 fj0Var = ek0Var.E1;
                ek0Var.T0 = i12;
                if (i12 == 1) {
                    ek0Var.j0 = ek0Var.h0;
                } else if (i12 == 4) {
                    ek0Var.j0 = ek0Var.i0;
                } else if (i12 == 2) {
                    ek0Var.j0 = ek0Var.f0;
                } else if (i12 == 3) {
                    ek0Var.j0 = ek0Var.g0;
                } else {
                    ek0Var.j0 = ek0Var.e0;
                }
                cw cwVar = (cw) view.getTag();
                PhotoViewer.p1().I2(null, ek0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(ek0Var.k1);
                    PhotoViewer.p1().b2(arrayList9, 0, fj0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(ek0Var.m1);
                    PhotoViewer.p1().b2(arrayList10, 0, fj0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(ek0Var.n1);
                    PhotoViewer.p1().b2(arrayList11, 0, fj0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = ek0Var.j1;
                    p12.b2(arrayList12, arrayList12.indexOf(cwVar), fj0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = ek0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(cwVar), fj0Var);
                    break;
                }
            case 27:
                om0 om0Var = (om0) obj;
                g1 g1Var = om0Var.J;
                if (g1Var != null && g1Var.isShowing()) {
                    om0Var.J.d(true);
                }
                if (i12 == 0) {
                    t4.I(om0Var.getParentActivity(), om0Var.G.a(), new km0(om0Var, i10));
                    break;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                zm0 zm0Var = (zm0) obj;
                g1 g1Var2 = zm0Var.n0;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    zm0Var.n0.d(true);
                }
                if (i12 == 0) {
                    t4.I(zm0Var.getParentActivity(), zm0Var.V.a(), new sm0(zm0Var, r9));
                    break;
                } else {
                    zm0Var.j0(0, true);
                    break;
                }
                break;
            default:
                gj gjVar2 = (gj) obj;
                int i24 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new fk(ez.C(i12), gj.B0(gjVar2.k), gjVar2.e1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
