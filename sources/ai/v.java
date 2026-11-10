package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import bi.v1;
import bi.w1;
import di.k6;
import fi.m3;
import fi.n9;
import fi.q5;
import fi.s5;
import java.io.File;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ew;
import org.telegram.messenger.gz;
import org.telegram.messenger.hk;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u2;
import org.telegram.messenger.uv;
import org.telegram.messenger.vv;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j4;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.cn;
import org.telegram.ui.dc1;
import org.telegram.ui.e60;
import org.telegram.ui.ek0;
import org.telegram.ui.f30;
import org.telegram.ui.fj0;
import org.telegram.ui.h60;
import org.telegram.ui.le0;
import org.telegram.ui.lm0;
import org.telegram.ui.me0;
import org.telegram.ui.pm0;
import org.telegram.ui.px;
import org.telegram.ui.qb1;
import org.telegram.ui.tm0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, ij ijVar) {
        this.a = 29;
        this.b = i7;
        this.c = ijVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c20 c20Var;
        boolean z9;
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        int i7 = this.a;
        int i10 = 2;
        final int i11 = 0;
        Object obj = this.c;
        int i12 = this.b;
        switch (i7) {
            case 0:
                q0 q0Var = ((w) obj).h;
                v4.s sVar = q0Var.d;
                ArrayList arrayList = q0Var.n;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    q0Var.w = true;
                    q0Var.h.a(i12, true);
                    int i13 = ((t) arrayList.get(i12)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i13) != null || Math.abs(i13 - L0) <= q0Var.r * 9) && iz.c()) {
                        n nVar = new n(q0Var.getContext());
                        nVar.a = ((t) arrayList.get(i12)).d;
                        sVar.w0(nVar);
                        break;
                    } else {
                        q0Var.c.C0();
                        ri0 ri0Var = q0Var.f;
                        ri0Var.b = L0 < i13 ? 0 : 1;
                        ri0Var.d(i13, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                v1 v1Var = ((w1) obj).e2;
                int i14 = v1.w;
                v1Var.a(i12);
                break;
            case 2:
                ((v1) obj).a(i12);
                break;
            case 3:
                n9 n9Var = (n9) obj;
                if (!n9Var.e.contains(Integer.valueOf(i12))) {
                    n9Var.e.add(Integer.valueOf(i12));
                } else if (n9Var.e.size() > 1) {
                    n9Var.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(n9Var.b, new i(n9Var, 21));
                break;
            case 4:
                s5 s5Var = ((q5) obj).b;
                if (s5Var.r && (c20Var = s5Var.f) != null) {
                    c20Var.a(Integer.valueOf(i12));
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
                ((b2) obj).P.b4(i12);
                break;
            case 8:
                ((cn) obj).ga(i12);
                break;
            case 9:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i12 == 0) {
                    h0Var.Y1 = !h0Var.Y1;
                } else if (i12 == 1) {
                    h0Var.Z1 = !h0Var.Z1;
                } else if (i12 == 2) {
                    h0Var.a2 = !h0Var.a2;
                }
                h0Var.S1.O(true);
                h0Var.I0();
                break;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                boolean z11 = !zArr[i12];
                zArr[i12] = z11;
                ((c2) view).c(z11, true);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.U2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.U(null, null);
                break;
            case 12:
                ((f30) obj).l1.x(i12, true);
                break;
            case 13:
                f30 f30Var = (f30) ((a20) obj).d;
                f30Var.J0(i12);
                f30Var.dismiss();
                break;
            case 14:
                ((v80) obj).R.k1(i12 + 8);
                break;
            case 15:
                qb0 qb0Var = (qb0) obj;
                if (qb0Var.e.getAdapter() instanceof zw) {
                    gy gyVar = ((zw) qb0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !gyVar.w1) {
                        z9 = false;
                        if (i12 == 0 && gyVar.v1) {
                            gyVar.P(true, true, false);
                            break;
                        }
                    } else {
                        gyVar.P(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z9 = false;
                }
                qb0Var.e.x(i12, z9);
                break;
            case 16:
                j4 j4Var = (j4) obj;
                EditTextBoldCursor editTextBoldCursor = j4Var.m1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                j4Var.n1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                j4Var.dismiss();
                break;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 18:
                final ys0 ys0Var = (ys0) obj;
                sp0 sp0Var = ys0Var.W;
                js0 js0Var = ys0Var.T;
                h6 h6Var = ys0Var.H1;
                long j3 = ys0Var.l1;
                SparseArray[] sparseArrayArr = ys0Var.b1;
                f2 f2Var = ys0Var.x1;
                if (i12 == 101) {
                    if (!ys0.z0(ys0Var.getSelectedTab()) && ys0Var.getSelectedTab() != 13) {
                        if (ys0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = f2Var.getMessagesController().G1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                long j10 = ((uv) arrayList2.get(i15)).a;
                                if (js0Var.x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (arrayList3.isEmpty()) {
                                z10 = false;
                            } else {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                boolean z13 = longValue == f2Var.getUserConfig().e();
                                z10 = z13;
                                if (longValue < 0) {
                                    TLRPC.Chat M02 = f2Var.getMessagesController().M0(Long.valueOf(-longValue));
                                    z10 = z13;
                                    if (M02 != null) {
                                        str = M02.title;
                                        z10 = z13;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User a22 = f2Var.getMessagesController().a2(l10);
                                    z10 = z13;
                                    if (a22 != null) {
                                        if (t10.s(a22)) {
                                            str = id.M0(2131754252, null);
                                            z10 = z13;
                                        } else {
                                            str = t10.p(a22);
                                            z10 = z13;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), h6Var);
                            String a02 = arrayList3.size() == 1 ? id.a0(null, null, z10 ? 2131752081 : 2131752077, str) : id.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = a02;
                            u1Var.T = arrayList3.size() == 1 ? id.a0(null, null, z10 ? 2131752082 : 2131752083, str) : id.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(id.M0(2131746321, null), new r1() { // from class: org.telegram.ui.Components.mp0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i16) {
                                    int i17 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    ys0 ys0Var2 = ys0Var;
                                    switch (i17) {
                                        case 0:
                                            org.telegram.ui.ActionBar.f2 f2Var2 = ys0Var2.x1;
                                            f2Var2.getMessagesController().P1().s(arrayList4, ys0Var2.l1);
                                            gc.a0(f2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            ys0Var2.V(false);
                                            break;
                                        default:
                                            ys0Var2.getClass();
                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                ys0Var2.x1.getMessagesController().i0(((Long) arrayList4.get(i18)).longValue(), 0, null);
                                            }
                                            ys0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                            f2Var.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                t6.U(textView, m6.q7, null);
                                break;
                            }
                        } else {
                            if (m5.C(j3)) {
                                encryptedChat = f2Var.getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                                user = null;
                                M0 = null;
                            } else if (m5.E(j3)) {
                                user = f2Var.getMessagesController().a2(Long.valueOf(j3));
                                M0 = null;
                                encryptedChat = null;
                            } else {
                                M0 = f2Var.getMessagesController().M0(Long.valueOf(-j3));
                                user = null;
                                encryptedChat = null;
                            }
                            u4.y(f2Var, user, M0, encryptedChat, null, ys0Var.e1, null, ys0Var.b1, null, 0, 0, null, new so0(ys0Var, 14), null, ys0Var.H1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (ys0Var.B0() && sp0Var != null && sp0Var.getCurrentList() != null) {
                            k6 currentList = sp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                                TL_stories.StoryItem storyItem = ((ij) sparseArrayArr[0].valueAt(i16)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ys0Var.getContext(), h6Var);
                                String M03 = id.M0(arrayList4.size() > 1 ? 2131751560 : 2131751564, null);
                                u1 u1Var2 = alertDialog$Builder2.a;
                                u1Var2.R = M03;
                                u1Var2.T = id.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(id.M0(2131751598, null), new gr(ys0Var, currentList, arrayList4));
                                alertDialog$Builder2.h(id.M0(2131752589, null), new il0(8));
                                u1Var2.show();
                                u1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList5 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem2 = ((ij) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem2 != null) {
                                    arrayList5.add(storyItem2);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ys0Var.getContext(), h6Var);
                                String M04 = id.M0(arrayList5.size() > 1 ? 2131751489 : 2131751487, null);
                                u1 u1Var3 = alertDialog$Builder3.a;
                                u1Var3.R = M04;
                                u1Var3.T = id.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(id.M0(2131751598, null), new r1() { // from class: org.telegram.ui.Components.mp0
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i162) {
                                        int i172 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        ys0 ys0Var2 = ys0Var;
                                        switch (i172) {
                                            case 0:
                                                org.telegram.ui.ActionBar.f2 f2Var2 = ys0Var2.x1;
                                                f2Var2.getMessagesController().P1().s(arrayList42, ys0Var2.l1);
                                                gc.a0(f2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                ys0Var2.V(false);
                                                break;
                                            default:
                                                ys0Var2.getClass();
                                                for (int i18 = 0; i18 < arrayList42.size(); i18++) {
                                                    ys0Var2.x1.getMessagesController().i0(((Long) arrayList42.get(i18)).longValue(), 0, null);
                                                }
                                                ys0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(id.M0(2131752589, null), new il0(9));
                                u1Var3.show();
                                u1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (ys0Var.g1 != null) {
                        qp messagesController = f2Var.getMessagesController();
                        TLRPC.UserFull userFull = ys0Var.g1;
                        messagesController.getClass();
                        if (qp.K2(userFull)) {
                            m3 m3Var = ys0Var.G1;
                            if (m3Var != null) {
                                m3Var.u(id.M0(2131750534, null));
                                ys0Var.G1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ys0Var.f1 != null) {
                        TLRPC.Chat M05 = f2Var.getMessagesController().M0(Long.valueOf(ys0Var.f1.id));
                        if (f2Var.getMessagesController().o2(M05)) {
                            m3 m3Var2 = ys0Var.G1;
                            if (m3Var2 != null) {
                                m3Var2.u((!t3.T(M05) || M05.megagroup) ? id.M0(2131750535, null) : id.M0(2131750536, null));
                                ys0Var.G1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (ys0Var.u0()) {
                        m3 m3Var3 = ys0Var.G1;
                        if (m3Var3 != null) {
                            m3Var3.u(id.M0(2131750537, "ForwardsRestrictedInfoBot"));
                            ys0Var.G1.y(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        org.telegram.ui.zw zwVar = new org.telegram.ui.zw(bundle);
                        zwVar.D2 = new uo0(ys0Var);
                        f2Var.presentFragment(zwVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (ys0Var.getClosestTab() != 8) {
                            vv G1 = f2Var.getMessagesController().G1();
                            ArrayList arrayList6 = G1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                long j11 = ((uv) arrayList6.get(i18)).a;
                                if (js0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (G1.n(arrayList7, i12 == 103, true)) {
                                int i19 = 0;
                                while (true) {
                                    tr0[] tr0VarArr = ys0Var.m0;
                                    if (i19 < tr0VarArr.length) {
                                        tr0 tr0Var = tr0VarArr[i19];
                                        if (tr0Var.E == 11) {
                                            tr0Var.x.h1(0, 0);
                                        } else {
                                            i19++;
                                        }
                                    }
                                }
                            } else {
                                f2Var.showDialog(new ug.i0(33, f2Var.getCurrentAccount(), ys0Var.getContext(), f2Var, null));
                            }
                            ys0Var.V(true);
                            break;
                        } else {
                            hr0 hr0Var = ys0Var.e0;
                            if (hr0Var != null && hr0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                    arrayList8.add(Integer.valueOf(((ij) sparseArrayArr[0].valueAt(i20)).e1()));
                                }
                                ys0Var.f1(arrayList8, i12 == 103);
                                ys0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    ij ijVar = (ij) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = ij.B0(ijVar.k);
                    if (m5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (m5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat M06 = f2Var.getMessagesController().M0(Long.valueOf(-B0));
                        if (M06 != null && M06.migrated_to != null) {
                            bundle2.putLong("migrated_to", B0);
                            B0 = -M06.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -B0);
                    }
                    bundle2.putInt("message_id", ijVar.e1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    cn cnVar = new cn(bundle2);
                    cnVar.b8 = ijVar.e1();
                    long j12 = ys0Var.F;
                    if (j12 != 0) {
                        qg.d.a(cnVar, xr.a(B0, j12));
                        bundle2.putInt("message_id", ijVar.e1());
                    }
                    f2Var.presentFragment(cnVar, false);
                    break;
                }
                break;
            case 19:
                z41 z41Var = (z41) obj;
                int i21 = z41Var.b.i.q;
                if (i21 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    z41Var.updateAppUpdateViews(i12, true);
                    break;
                } else if (i21 == 3) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1 e10 = org.telegram.messenger.h1.e();
                        if (e10.j) {
                            HttpGetFileTask httpGetFileTask = e10.l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e10.j = false;
                            qs.e().k(qs.Q4, new Object[0]);
                        }
                    }
                    z41Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g10 = org.telegram.messenger.t0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", z41Var.d, null, false);
                        break;
                    }
                }
                break;
            case 20:
                ((org.telegram.ui.Components.voip.t0) obj).b.x(i12, true);
                break;
            case 21:
                dc1 dc1Var = (dc1) obj;
                if (dc1Var.U == null && view.getAlpha() != 0.0f) {
                    dc1Var.c(i12, true);
                    break;
                }
                break;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 23:
                px pxVar = (px) obj;
                if (pxVar.n != null && i12 != pxVar.s) {
                    x31 x31Var = pxVar.r;
                    if (x31Var != null) {
                        x31Var.z = i12;
                    }
                    pxVar.b(i12, true);
                    pxVar.n.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 24:
                h60 h60Var = (h60) obj;
                h60Var.Q.dismiss();
                int i22 = h60Var.c0;
                if (i22 >= 0) {
                    u2 u2Var = h60Var.d0;
                    int[] iArr = u2Var.c;
                    if (!u2Var.b) {
                        u2Var.b = true;
                        while (i11 < 4) {
                            iArr[i11] = iz.q().getInt(jg.g.j(i11, "keep_media_type_"), u2.b(i11));
                            i11++;
                        }
                    }
                    iArr[i22] = i12;
                    iz.q().edit().putInt("keep_media_type_" + i22, i12).apply();
                    e60 e60Var = h60Var.e0;
                    if (e60Var != null) {
                        e60Var.a(i12);
                        break;
                    }
                } else {
                    e60 e60Var2 = h60Var.e0;
                    if (e60Var2 != null) {
                        e60Var2.a(i12);
                        break;
                    }
                }
                break;
            case 25:
                me0 me0Var = (me0) obj;
                ValueAnimator valueAnimator = me0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    qb1 qb1Var = me0Var.c;
                    if (!qb1Var.H) {
                        if (qb1Var.getCurrentPosition() == i12) {
                            Object c02 = me0Var.c0();
                            if (c02 instanceof le0) {
                                ((le0) c02).v();
                                break;
                            }
                        } else {
                            me0Var.s0(i12, true);
                            me0Var.c.E(i12);
                            break;
                        }
                    }
                }
                break;
            case 26:
                ek0 ek0Var = (ek0) obj;
                fj0 fj0Var = ek0Var.D1;
                ek0Var.S0 = i12;
                if (i12 == 1) {
                    ek0Var.i0 = ek0Var.g0;
                } else if (i12 == 4) {
                    ek0Var.i0 = ek0Var.h0;
                } else if (i12 == 2) {
                    ek0Var.i0 = ek0Var.e0;
                } else if (i12 == 3) {
                    ek0Var.i0 = ek0Var.f0;
                } else {
                    ek0Var.i0 = ek0Var.d0;
                }
                ew ewVar = (ew) view.getTag();
                PhotoViewer.p1().H2(null, ek0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(ek0Var.j1);
                    PhotoViewer.p1().a2(arrayList9, 0, fj0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(ek0Var.l1);
                    PhotoViewer.p1().a2(arrayList10, 0, fj0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(ek0Var.m1);
                    PhotoViewer.p1().a2(arrayList11, 0, fj0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = ek0Var.i1;
                    p12.a2(arrayList12, arrayList12.indexOf(ewVar), fj0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = ek0Var.k1;
                    p13.a2(arrayList13, arrayList13.indexOf(ewVar), fj0Var);
                    break;
                }
            case 27:
                pm0 pm0Var = (pm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = pm0Var.I;
                if (g1Var != null && g1Var.isShowing()) {
                    pm0Var.I.d(true);
                }
                if (i12 == 0) {
                    u4.I(pm0Var.getParentActivity(), pm0Var.F.a(), new lm0(pm0Var, i10));
                    break;
                } else {
                    pm0Var.a0(pm0Var.b, pm0Var.c, true, 0);
                    pm0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                an0 an0Var = (an0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = an0Var.m0;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    an0Var.m0.d(true);
                }
                if (i12 == 0) {
                    u4.I(an0Var.getParentActivity(), an0Var.U.a(), new tm0(an0Var, r10));
                    break;
                } else {
                    an0Var.j0(0, true);
                    break;
                }
                break;
            default:
                ij ijVar2 = (ij) obj;
                int i23 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.h3(new hk(gz.C(i12), ij.B0(ijVar2.k), ijVar2.e1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
