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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k4;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.cn;
import org.telegram.ui.d60;
import org.telegram.ui.dk0;
import org.telegram.ui.e30;
import org.telegram.ui.ej0;
import org.telegram.ui.g60;
import org.telegram.ui.ke0;
import org.telegram.ui.km0;
import org.telegram.ui.le0;
import org.telegram.ui.om0;
import org.telegram.ui.ox;
import org.telegram.ui.pb1;
import org.telegram.ui.sm0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yw;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                        si0 si0Var = q0Var.f;
                        si0Var.b = L0 < i13 ? 0 : 1;
                        si0Var.d(i13, 0, false, false);
                        break;
                    }
                }
                break;
            case 1:
                v1 v1Var = ((w1) obj).b2;
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
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i12 == 0) {
                    i0Var.V1 = !i0Var.V1;
                } else if (i12 == 1) {
                    i0Var.W1 = !i0Var.W1;
                } else if (i12 == 2) {
                    i0Var.X1 = !i0Var.X1;
                }
                i0Var.P1.O(true);
                i0Var.I0();
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
                chatAttachAlertPhotoLayout.b.R2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.U(null, null);
                break;
            case 12:
                ((e30) obj).i1.x(i12, true);
                break;
            case 13:
                e30 e30Var = (e30) ((b20) obj).d;
                e30Var.J0(i12);
                e30Var.dismiss();
                break;
            case 14:
                ((v80) obj).R.k1(i12 + 8);
                break;
            case 15:
                rb0 rb0Var = (rb0) obj;
                if (rb0Var.e.getAdapter() instanceof ax) {
                    hy hyVar = ((ax) rb0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !hyVar.w1) {
                        z9 = false;
                        if (i12 == 0 && hyVar.v1) {
                            hyVar.P(true, true, false);
                            break;
                        }
                    } else {
                        hyVar.P(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z9 = false;
                }
                rb0Var.e.x(i12, z9);
                break;
            case 16:
                k4 k4Var = (k4) obj;
                EditTextBoldCursor editTextBoldCursor = k4Var.j1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                k4Var.k1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                k4Var.dismiss();
                break;
            case 17:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 18:
                final zs0 zs0Var = (zs0) obj;
                tp0 tp0Var = zs0Var.W;
                ks0 ks0Var = zs0Var.T;
                g6 g6Var = zs0Var.H1;
                long j3 = zs0Var.l1;
                SparseArray[] sparseArrayArr = zs0Var.b1;
                f2 f2Var = zs0Var.x1;
                if (i12 == 101) {
                    if (!zs0.z0(zs0Var.getSelectedTab()) && zs0Var.getSelectedTab() != 13) {
                        if (zs0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = f2Var.getMessagesController().G1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                long j10 = ((uv) arrayList2.get(i15)).a;
                                if (ks0Var.x.contains(Long.valueOf(j10))) {
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
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zs0Var.getContext(), g6Var);
                            String a02 = arrayList3.size() == 1 ? id.a0(null, null, z10 ? 2131752081 : 2131752077, str) : id.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = a02;
                            u1Var.T = arrayList3.size() == 1 ? id.a0(null, null, z10 ? 2131752082 : 2131752083, str) : id.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(id.M0(2131746321, null), new r1() { // from class: org.telegram.ui.Components.np0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i16) {
                                    int i17 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    zs0 zs0Var2 = zs0Var;
                                    switch (i17) {
                                        case 0:
                                            org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var2.x1;
                                            f2Var2.getMessagesController().P1().s(arrayList4, zs0Var2.l1);
                                            hc.a0(f2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            zs0Var2.V(false);
                                            break;
                                        default:
                                            zs0Var2.getClass();
                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                zs0Var2.x1.getMessagesController().i0(((Long) arrayList4.get(i18)).longValue(), 0, null);
                                            }
                                            zs0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                            f2Var.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                s6.U(textView, l6.q7, null);
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
                            v4.y(f2Var, user, M0, encryptedChat, null, zs0Var.e1, null, zs0Var.b1, null, 0, 0, null, new to0(zs0Var, 14), null, zs0Var.H1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (zs0Var.B0() && tp0Var != null && tp0Var.getCurrentList() != null) {
                            k6 currentList = tp0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                                TL_stories.StoryItem storyItem = ((ij) sparseArrayArr[0].valueAt(i16)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, zs0Var.getContext(), g6Var);
                                String M03 = id.M0(arrayList4.size() > 1 ? 2131751560 : 2131751564, null);
                                u1 u1Var2 = alertDialog$Builder2.a;
                                u1Var2.R = M03;
                                u1Var2.T = id.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(id.M0(2131751598, null), new hr(zs0Var, currentList, arrayList4));
                                alertDialog$Builder2.h(id.M0(2131752589, null), new jl0(8));
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, zs0Var.getContext(), g6Var);
                                String M04 = id.M0(arrayList5.size() > 1 ? 2131751489 : 2131751487, null);
                                u1 u1Var3 = alertDialog$Builder3.a;
                                u1Var3.R = M04;
                                u1Var3.T = id.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(id.M0(2131751598, null), new r1() { // from class: org.telegram.ui.Components.np0
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i162) {
                                        int i172 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        zs0 zs0Var2 = zs0Var;
                                        switch (i172) {
                                            case 0:
                                                org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var2.x1;
                                                f2Var2.getMessagesController().P1().s(arrayList42, zs0Var2.l1);
                                                hc.a0(f2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                zs0Var2.V(false);
                                                break;
                                            default:
                                                zs0Var2.getClass();
                                                for (int i18 = 0; i18 < arrayList42.size(); i18++) {
                                                    zs0Var2.x1.getMessagesController().i0(((Long) arrayList42.get(i18)).longValue(), 0, null);
                                                }
                                                zs0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(id.M0(2131752589, null), new jl0(9));
                                u1Var3.show();
                                u1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (zs0Var.g1 != null) {
                        qp messagesController = f2Var.getMessagesController();
                        TLRPC.UserFull userFull = zs0Var.g1;
                        messagesController.getClass();
                        if (qp.K2(userFull)) {
                            m3 m3Var = zs0Var.G1;
                            if (m3Var != null) {
                                m3Var.u(id.M0(2131750534, null));
                                zs0Var.G1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (zs0Var.f1 != null) {
                        TLRPC.Chat M05 = f2Var.getMessagesController().M0(Long.valueOf(zs0Var.f1.id));
                        if (f2Var.getMessagesController().o2(M05)) {
                            m3 m3Var2 = zs0Var.G1;
                            if (m3Var2 != null) {
                                m3Var2.u((!t3.T(M05) || M05.megagroup) ? id.M0(2131750535, null) : id.M0(2131750536, null));
                                zs0Var.G1.y(view, true);
                                break;
                            }
                        }
                    }
                    if (zs0Var.u0()) {
                        m3 m3Var3 = zs0Var.G1;
                        if (m3Var3 != null) {
                            m3Var3.u(id.M0(2131750537, "ForwardsRestrictedInfoBot"));
                            zs0Var.G1.y(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        yw ywVar = new yw(bundle);
                        ywVar.D2 = new vo0(zs0Var);
                        f2Var.presentFragment(ywVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (zs0Var.getClosestTab() != 8) {
                            vv G1 = f2Var.getMessagesController().G1();
                            ArrayList arrayList6 = G1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                long j11 = ((uv) arrayList6.get(i18)).a;
                                if (ks0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (G1.n(arrayList7, i12 == 103, true)) {
                                int i19 = 0;
                                while (true) {
                                    ur0[] ur0VarArr = zs0Var.m0;
                                    if (i19 < ur0VarArr.length) {
                                        ur0 ur0Var = ur0VarArr[i19];
                                        if (ur0Var.E == 11) {
                                            ur0Var.x.h1(0, 0);
                                        } else {
                                            i19++;
                                        }
                                    }
                                }
                            } else {
                                f2Var.showDialog(new ug.i0(33, f2Var.getCurrentAccount(), zs0Var.getContext(), f2Var, null));
                            }
                            zs0Var.V(true);
                            break;
                        } else {
                            ir0 ir0Var = zs0Var.e0;
                            if (ir0Var != null && ir0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                    arrayList8.add(Integer.valueOf(((ij) sparseArrayArr[0].valueAt(i20)).e1()));
                                }
                                zs0Var.f1(arrayList8, i12 == 103);
                                zs0Var.V(false);
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
                    long j12 = zs0Var.F;
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
                cc1 cc1Var = (cc1) obj;
                if (cc1Var.U == null && view.getAlpha() != 0.0f) {
                    cc1Var.c(i12, true);
                    break;
                }
                break;
            case 22:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 23:
                ox oxVar = (ox) obj;
                if (oxVar.n != null && i12 != oxVar.s) {
                    y31 y31Var = oxVar.r;
                    if (y31Var != null) {
                        y31Var.z = i12;
                    }
                    oxVar.b(i12, true);
                    oxVar.n.a(Integer.valueOf(i12));
                    break;
                }
                break;
            case 24:
                g60 g60Var = (g60) obj;
                g60Var.Q.dismiss();
                int i22 = g60Var.c0;
                if (i22 >= 0) {
                    u2 u2Var = g60Var.d0;
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
                    d60 d60Var = g60Var.e0;
                    if (d60Var != null) {
                        d60Var.a(i12);
                        break;
                    }
                } else {
                    d60 d60Var2 = g60Var.e0;
                    if (d60Var2 != null) {
                        d60Var2.a(i12);
                        break;
                    }
                }
                break;
            case 25:
                le0 le0Var = (le0) obj;
                ValueAnimator valueAnimator = le0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pb1 pb1Var = le0Var.c;
                    if (!pb1Var.H) {
                        if (pb1Var.getCurrentPosition() == i12) {
                            Object c02 = le0Var.c0();
                            if (c02 instanceof ke0) {
                                ((ke0) c02).v();
                                break;
                            }
                        } else {
                            le0Var.s0(i12, true);
                            le0Var.c.E(i12);
                            break;
                        }
                    }
                }
                break;
            case 26:
                dk0 dk0Var = (dk0) obj;
                ej0 ej0Var = dk0Var.D1;
                dk0Var.S0 = i12;
                if (i12 == 1) {
                    dk0Var.i0 = dk0Var.g0;
                } else if (i12 == 4) {
                    dk0Var.i0 = dk0Var.h0;
                } else if (i12 == 2) {
                    dk0Var.i0 = dk0Var.e0;
                } else if (i12 == 3) {
                    dk0Var.i0 = dk0Var.f0;
                } else {
                    dk0Var.i0 = dk0Var.d0;
                }
                ew ewVar = (ew) view.getTag();
                PhotoViewer.p1().H2(null, dk0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(dk0Var.j1);
                    PhotoViewer.p1().a2(arrayList9, 0, ej0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(dk0Var.l1);
                    PhotoViewer.p1().a2(arrayList10, 0, ej0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(dk0Var.m1);
                    PhotoViewer.p1().a2(arrayList11, 0, ej0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = dk0Var.i1;
                    p12.a2(arrayList12, arrayList12.indexOf(ewVar), ej0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = dk0Var.k1;
                    p13.a2(arrayList13, arrayList13.indexOf(ewVar), ej0Var);
                    break;
                }
            case 27:
                om0 om0Var = (om0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = om0Var.I;
                if (g1Var != null && g1Var.isShowing()) {
                    om0Var.I.d(true);
                }
                if (i12 == 0) {
                    v4.I(om0Var.getParentActivity(), om0Var.F.a(), new km0(om0Var, i10));
                    break;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                zm0 zm0Var = (zm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = zm0Var.m0;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    zm0Var.m0.d(true);
                }
                if (i12 == 0) {
                    v4.I(zm0Var.getParentActivity(), zm0Var.U.a(), new sm0(zm0Var, r10));
                    break;
                } else {
                    zm0Var.j0(0, true);
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
