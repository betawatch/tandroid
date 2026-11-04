package bi;

import ai.v2;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import ci.o1;
import ci.p1;
import gi.l3;
import gi.o5;
import gi.o9;
import gi.q5;
import java.io.File;
import java.util.ArrayList;
import mi.c2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h1;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.mv;
import org.telegram.messenger.nv;
import org.telegram.messenger.pr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.u2;
import org.telegram.messenger.wv;
import org.telegram.messenger.yj;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.yw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.de0;
import org.telegram.ui.dm0;
import org.telegram.ui.ee0;
import org.telegram.ui.fb1;
import org.telegram.ui.hm0;
import org.telegram.ui.jx;
import org.telegram.ui.lm0;
import org.telegram.ui.sb1;
import org.telegram.ui.sm0;
import org.telegram.ui.uw;
import org.telegram.ui.v50;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wm;
import org.telegram.ui.x20;
import org.telegram.ui.y50;
import org.telegram.ui.yj0;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i3, zi ziVar) {
        this.a = 29;
        this.b = i3;
        this.c = ziVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u10 u10Var;
        boolean z10;
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i3 = this.a;
        int i10 = 2;
        final int i11 = 0;
        Object obj = this.c;
        int i12 = this.b;
        switch (i3) {
            case 0:
                h0 h0Var = ((r) obj).h;
                u4.s sVar = h0Var.d;
                ArrayList arrayList = h0Var.n;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    h0Var.w = true;
                    h0Var.h.a(i12, true);
                    int i13 = ((o) arrayList.get(i12)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i13) != null || Math.abs(i13 - L0) <= h0Var.r * 9) && az.c()) {
                        i iVar = new i(h0Var.getContext());
                        iVar.a = ((o) arrayList.get(i12)).d;
                        sVar.w0(iVar);
                        break;
                    } else {
                        h0Var.c.C0();
                        vi0 vi0Var = h0Var.f;
                        vi0Var.b = L0 < i13 ? 0 : 1;
                        vi0Var.d(i13, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                o1 o1Var = ((p1) obj).c2;
                int i14 = o1.w;
                o1Var.a(i12);
                break;
            case 2:
                ((o1) obj).a(i12);
                break;
            case 3:
                o9 o9Var = (o9) obj;
                if (!o9Var.e.contains(Integer.valueOf(i12))) {
                    o9Var.e.add(Integer.valueOf(i12));
                } else if (o9Var.e.size() > 1) {
                    o9Var.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(o9Var.b, new v2(o9Var, 24));
                break;
            case 4:
                q5 q5Var = ((o5) obj).b;
                if (q5Var.r && (u10Var = q5Var.f) != null) {
                    u10Var.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 5:
                View.OnClickListener onClickListener = ((mh.e) obj).b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 6:
                mh.a aVar = ((mh.h) obj).h;
                if (aVar != null) {
                    aVar.d(i12);
                    break;
                }
                break;
            case 7:
                ((c2) obj).Q.b4(i12);
                break;
            case 8:
                ((wm) obj).fa(i12);
                break;
            case 9:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 == 0) {
                    g0Var.W1 = !g0Var.W1;
                } else if (i12 == 1) {
                    g0Var.X1 = !g0Var.X1;
                } else if (i12 == 2) {
                    g0Var.Y1 = !g0Var.Y1;
                }
                g0Var.Q1.O(true);
                g0Var.I0();
                break;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.S2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.U(null, null);
                break;
            case 12:
                ((x20) obj).j1.x(i12, true);
                break;
            case 13:
                x20 x20Var = (x20) ((w10) obj).d;
                x20Var.J0(i12);
                x20Var.dismiss();
                break;
            case 14:
                ((r80) obj).S.i1(i12 + 8);
                break;
            case 15:
                lb0 lb0Var = (lb0) obj;
                if (lb0Var.e.getAdapter() instanceof yw) {
                    ey eyVar = ((yw) lb0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !eyVar.x1) {
                        z10 = false;
                        if (i12 == 0 && eyVar.w1) {
                            eyVar.P(true, true, false);
                            break;
                        }
                    } else {
                        eyVar.P(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                lb0Var.e.x(i12, z10);
                break;
            case 16:
                i4 i4Var = (i4) obj;
                EditTextBoldCursor editTextBoldCursor = i4Var.k1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                i4Var.l1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                i4Var.dismiss();
                break;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 18:
                final ws0 ws0Var = (ws0) obj;
                tp0 tp0Var = ws0Var.a0;
                hs0 hs0Var = ws0Var.U;
                e6 e6Var = ws0Var.I1;
                long j10 = ws0Var.m1;
                SparseArray[] sparseArrayArr = ws0Var.c1;
                d2 d2Var = ws0Var.y1;
                if (i12 == 101) {
                    if (!ws0.z0(ws0Var.getSelectedTab()) && ws0Var.getSelectedTab() != 13) {
                        if (ws0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = d2Var.getMessagesController().G1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                long j11 = ((mv) arrayList2.get(i15)).a;
                                if (hs0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            String str = "";
                            if (arrayList3.isEmpty()) {
                                z11 = false;
                            } else {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                boolean z14 = longValue == d2Var.getUserConfig().e();
                                z11 = z14;
                                if (longValue < 0) {
                                    TLRPC.Chat M02 = d2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z11 = z14;
                                    if (M02 != null) {
                                        str = M02.title;
                                        z11 = z14;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User a22 = d2Var.getMessagesController().a2(l10);
                                    z11 = z14;
                                    if (a22 != null) {
                                        if (l10.s(a22)) {
                                            str = bd.M0(2131754252, null);
                                            z11 = z14;
                                        } else {
                                            str = l10.p(a22);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                            String a02 = arrayList3.size() == 1 ? bd.a0(null, null, z11 ? 2131752081 : 2131752077, str) : bd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = a02;
                            s1Var.U = arrayList3.size() == 1 ? bd.a0(null, null, z11 ? 2131752082 : 2131752083, str) : bd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.np0
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i16) {
                                    int i17 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    ws0 ws0Var2 = ws0Var;
                                    switch (i17) {
                                        case 0:
                                            org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var2.y1;
                                            d2Var2.getMessagesController().P1().s(arrayList4, ws0Var2.m1);
                                            fc.a0(d2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            ws0Var2.V(false);
                                            break;
                                        default:
                                            ws0Var2.getClass();
                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                ws0Var2.y1.getMessagesController().i0(((Long) arrayList4.get(i18)).longValue(), 0, null);
                                            }
                                            ws0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            d2Var.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                r6.V(textView, k6.q7, null);
                                break;
                            }
                        } else {
                            if (m5.C(j10)) {
                                encryptedChat = d2Var.getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L)));
                                user = null;
                                M0 = null;
                            } else if (m5.E(j10)) {
                                user = d2Var.getMessagesController().a2(Long.valueOf(j10));
                                M0 = null;
                                encryptedChat = null;
                            } else {
                                M0 = d2Var.getMessagesController().M0(Long.valueOf(-j10));
                                user = null;
                                encryptedChat = null;
                            }
                            t4.y(d2Var, user, M0, encryptedChat, null, ws0Var.f1, null, ws0Var.c1, null, 0, 0, null, new uo0(ws0Var, 14), null, ws0Var.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (ws0Var.B0() && tp0Var != null && tp0Var.getCurrentList() != null) {
                            ei.k6 currentList = tp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                                TL_stories.StoryItem storyItem = ((zi) sparseArrayArr[0].valueAt(i16)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                                String M03 = bd.M0(arrayList4.size() > 1 ? 2131751561 : 2131751565, null);
                                s1 s1Var2 = alertDialog$Builder2.a;
                                s1Var2.S = M03;
                                s1Var2.U = bd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(bd.M0(2131751599, null), new hr(ws0Var, currentList, arrayList4));
                                alertDialog$Builder2.h(bd.M0(2131752589, null), new lf0(9));
                                s1Var2.show();
                                s1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList5 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem2 = ((zi) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem2 != null) {
                                    arrayList5.add(storyItem2);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ws0Var.getContext(), e6Var);
                                String M04 = bd.M0(arrayList5.size() > 1 ? 2131751490 : 2131751488, null);
                                s1 s1Var3 = alertDialog$Builder3.a;
                                s1Var3.S = M04;
                                s1Var3.U = bd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Components.np0
                                    @Override // org.telegram.ui.ActionBar.p1
                                    public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i162) {
                                        int i172 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        ws0 ws0Var2 = ws0Var;
                                        switch (i172) {
                                            case 0:
                                                org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var2.y1;
                                                d2Var2.getMessagesController().P1().s(arrayList42, ws0Var2.m1);
                                                fc.a0(d2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                ws0Var2.V(false);
                                                break;
                                            default:
                                                ws0Var2.getClass();
                                                for (int i18 = 0; i18 < arrayList42.size(); i18++) {
                                                    ws0Var2.y1.getMessagesController().i0(((Long) arrayList42.get(i18)).longValue(), 0, null);
                                                }
                                                ws0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(bd.M0(2131752589, null), new lf0(10));
                                s1Var3.show();
                                s1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (ws0Var.h1 != null) {
                        hp messagesController = d2Var.getMessagesController();
                        TLRPC.UserFull userFull = ws0Var.h1;
                        messagesController.getClass();
                        if (hp.K2(userFull)) {
                            l3 l3Var = ws0Var.H1;
                            if (l3Var != null) {
                                l3Var.u(bd.M0(2131750535, null));
                                ws0Var.H1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ws0Var.g1 != null) {
                        TLRPC.Chat M05 = d2Var.getMessagesController().M0(Long.valueOf(ws0Var.g1.id));
                        if (d2Var.getMessagesController().o2(M05)) {
                            l3 l3Var2 = ws0Var.H1;
                            if (l3Var2 != null) {
                                l3Var2.u((!t3.T(M05) || M05.megagroup) ? bd.M0(2131750536, null) : bd.M0(2131750537, null));
                                ws0Var.H1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ws0Var.u0()) {
                        l3 l3Var3 = ws0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.u(bd.M0(2131750538, "ForwardsRestrictedInfoBot"));
                            ws0Var.H1.y(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        uw uwVar = new uw(bundle);
                        uwVar.D2 = new wo0(ws0Var);
                        d2Var.presentFragment(uwVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (ws0Var.getClosestTab() != 8) {
                            nv G1 = d2Var.getMessagesController().G1();
                            ArrayList arrayList6 = G1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                long j12 = ((mv) arrayList6.get(i18)).a;
                                if (hs0Var.x.contains(Long.valueOf(j12))) {
                                    arrayList7.add(Long.valueOf(j12));
                                }
                            }
                            if (G1.n(arrayList7, i12 == 103, true)) {
                                int i19 = 0;
                                while (true) {
                                    rr0[] rr0VarArr = ws0Var.n0;
                                    if (i19 < rr0VarArr.length) {
                                        rr0 rr0Var = rr0VarArr[i19];
                                        if (rr0Var.F == 11) {
                                            rr0Var.x.h1(0, 0);
                                        } else {
                                            i19++;
                                        }
                                    }
                                }
                            } else {
                                d2Var.showDialog(new vg.i0(33, d2Var.getCurrentAccount(), ws0Var.getContext(), d2Var, null));
                            }
                            ws0Var.V(true);
                            break;
                        } else {
                            gr0 gr0Var = ws0Var.f0;
                            if (gr0Var != null && gr0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                    arrayList8.add(Integer.valueOf(((zi) sparseArrayArr[0].valueAt(i20)).f1()));
                                }
                                ws0Var.d1(arrayList8, i12 == 103);
                                ws0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    zi ziVar = (zi) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = zi.B0(ziVar.k);
                    if (m5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (m5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat M06 = d2Var.getMessagesController().M0(Long.valueOf(-B0));
                        if (M06 != null && M06.migrated_to != null) {
                            bundle2.putLong("migrated_to", B0);
                            B0 = -M06.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -B0);
                    }
                    bundle2.putInt("message_id", ziVar.f1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    wm wmVar = new wm(bundle2);
                    wmVar.c8 = ziVar.f1();
                    long j13 = ws0Var.G;
                    if (j13 != 0) {
                        rg.c.a(wmVar, pr.a(B0, j13));
                        bundle2.putInt("message_id", ziVar.f1());
                    }
                    d2Var.presentFragment(wmVar, false);
                    break;
                }
                break;
            case 19:
                s41 s41Var = (s41) obj;
                int i21 = s41Var.b.i.q;
                if (i21 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        h1.e().b(false);
                    }
                    s41Var.updateAppUpdateViews(i12, true);
                    break;
                } else if (i21 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        h1 e10 = h1.e();
                        if (e10.j) {
                            HttpGetFileTask httpGetFileTask = e10.l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.j = false;
                            hs.e().k(hs.Q4, new Object[0]);
                        }
                    }
                    s41Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g7 = org.telegram.messenger.t0.a.g();
                    if (g7 != null) {
                        org.telegram.messenger.g0.t2(g7, "Telegram.apk", "application/vnd.android.package-archive", s41Var.d, null, false);
                        break;
                    }
                }
                break;
            case 20:
                ((org.telegram.ui.Components.voip.f0) obj).b.x(i12, true);
                break;
            case 21:
                sb1 sb1Var = (sb1) obj;
                if (sb1Var.V == null && view.getAlpha() != 0.0f) {
                    sb1Var.c(i12, true);
                    break;
                }
                break;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 23:
                jx jxVar = (jx) obj;
                if (jxVar.n != null && i12 != jxVar.s) {
                    r31 r31Var = jxVar.r;
                    if (r31Var != null) {
                        r31Var.z = i12;
                    }
                    jxVar.b(i12, true);
                    jxVar.n.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 24:
                y50 y50Var = (y50) obj;
                y50Var.R.dismiss();
                int i22 = y50Var.d0;
                if (i22 >= 0) {
                    u2 u2Var = y50Var.e0;
                    int[] iArr = u2Var.c;
                    if (!u2Var.b) {
                        u2Var.b = true;
                        while (i11 < 4) {
                            iArr[i11] = az.q().getInt(k2.p1.i(i11, "keep_media_type_"), u2.b(i11));
                            i11++;
                        }
                    }
                    iArr[i22] = i12;
                    az.q().edit().putInt("keep_media_type_" + i22, i12).apply();
                    v50 v50Var = y50Var.f0;
                    if (v50Var != null) {
                        v50Var.a(i12);
                        break;
                    }
                } else {
                    v50 v50Var2 = y50Var.f0;
                    if (v50Var2 != null) {
                        v50Var2.a(i12);
                        break;
                    }
                }
                break;
            case 25:
                ee0 ee0Var = (ee0) obj;
                ValueAnimator valueAnimator = ee0Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    fb1 fb1Var = ee0Var.c;
                    if (!fb1Var.I) {
                        if (fb1Var.getCurrentPosition() == i12) {
                            Object c02 = ee0Var.c0();
                            if (c02 instanceof de0) {
                                ((de0) c02).v();
                                break;
                            }
                        } else {
                            ee0Var.s0(i12, true);
                            ee0Var.c.D(i12);
                            break;
                        }
                    }
                }
                break;
            case 26:
                yj0 yj0Var = (yj0) obj;
                zi0 zi0Var = yj0Var.E1;
                yj0Var.T0 = i12;
                if (i12 == 1) {
                    yj0Var.j0 = yj0Var.h0;
                } else if (i12 == 4) {
                    yj0Var.j0 = yj0Var.i0;
                } else if (i12 == 2) {
                    yj0Var.j0 = yj0Var.f0;
                } else if (i12 == 3) {
                    yj0Var.j0 = yj0Var.g0;
                } else {
                    yj0Var.j0 = yj0Var.e0;
                }
                wv wvVar = (wv) view.getTag();
                PhotoViewer.v1().N2(null, yj0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(yj0Var.k1);
                    PhotoViewer.v1().f2(arrayList9, 0, zi0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(yj0Var.m1);
                    PhotoViewer.v1().f2(arrayList10, 0, zi0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(yj0Var.n1);
                    PhotoViewer.v1().f2(arrayList11, 0, zi0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList12 = yj0Var.j1;
                    v12.f2(arrayList12, arrayList12.indexOf(wvVar), zi0Var);
                    break;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList13 = yj0Var.l1;
                    v13.f2(arrayList13, arrayList13.indexOf(wvVar), zi0Var);
                    break;
                }
            case 27:
                hm0 hm0Var = (hm0) obj;
                f1 f1Var = hm0Var.J;
                if (f1Var != null && f1Var.isShowing()) {
                    hm0Var.J.d(true);
                }
                if (i12 == 0) {
                    t4.K(hm0Var.getParentActivity(), hm0Var.G.a(), new dm0(hm0Var, i10));
                    break;
                } else {
                    hm0Var.a0(hm0Var.b, hm0Var.c, true, 0);
                    hm0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                sm0 sm0Var = (sm0) obj;
                f1 f1Var2 = sm0Var.n0;
                if (f1Var2 != null && f1Var2.isShowing()) {
                    sm0Var.n0.d(true);
                }
                if (i12 == 0) {
                    t4.K(sm0Var.getParentActivity(), sm0Var.V.a(), new lm0(sm0Var, r10));
                    break;
                } else {
                    sm0Var.j0(0, true);
                    break;
                }
                break;
            default:
                zi ziVar2 = (zi) obj;
                int i23 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new yj(yy.C(i12), zi.B0(ziVar2.k), ziVar2.f1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
