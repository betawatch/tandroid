package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.z5;
import hi.m3;
import hi.m9;
import hi.n5;
import hi.p5;
import java.io.File;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ov;
import org.telegram.messenger.pv;
import org.telegram.messenger.sr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.c60;
import org.telegram.ui.cx;
import org.telegram.ui.f60;
import org.telegram.ui.g30;
import org.telegram.ui.hk0;
import org.telegram.ui.ij0;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.mm0;
import org.telegram.ui.pb1;
import org.telegram.ui.qm0;
import org.telegram.ui.qx;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        x10 x10Var;
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
                m9 m9Var = (m9) obj;
                if (!m9Var.e.contains(Integer.valueOf(i12))) {
                    m9Var.e.add(Integer.valueOf(i12));
                } else if (m9Var.e.size() > 1) {
                    m9Var.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(m9Var.b, new ai.g0(m9Var, 26));
                break;
            case 4:
                p5 p5Var = ((n5) obj).b;
                if (p5Var.r && (x10Var = p5Var.f) != null) {
                    x10Var.a(Integer.valueOf(i12));
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
                    aVar.j(i12);
                    break;
                }
                break;
            case 7:
                ((z1) obj).Q.b4(i12);
                break;
            case 8:
                ((bn) obj).ha(i12);
                break;
            case 9:
                ((x10) obj).a(Integer.valueOf(i12));
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
                ((c2) view).c(z12, true);
                break;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.V2.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.x.V(null, null);
                break;
            case 14:
                ((g30) obj).m1.x(i12, true);
                break;
            case 15:
                g30 g30Var = (g30) ((k20) obj).d;
                g30Var.K0(i12);
                g30Var.dismiss();
                break;
            case 16:
                ((i90) obj).S.k1(i12 + 8);
                break;
            case 17:
                bc0 bc0Var = (bc0) obj;
                if (bc0Var.e.getAdapter() instanceof lx) {
                    ry ryVar = ((lx) bc0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !ryVar.x1) {
                        z10 = false;
                        if (i12 == 0 && ryVar.w1) {
                            ryVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        ryVar.Q(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                bc0Var.e.x(i12, z10);
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
                final gt0 gt0Var = (gt0) obj;
                dq0 dq0Var = gt0Var.a0;
                rs0 rs0Var = gt0Var.U;
                i6 i6Var = gt0Var.I1;
                long j3 = gt0Var.m1;
                SparseArray[] sparseArrayArr = gt0Var.c1;
                h2 h2Var = gt0Var.y1;
                if (i12 == 101) {
                    int i15 = 13;
                    if (!gt0.z0(gt0Var.getSelectedTab()) && gt0Var.getSelectedTab() != 13) {
                        if (gt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = h2Var.getMessagesController().I1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                long j10 = ((ov) arrayList2.get(i16)).a;
                                if (rs0Var.x.contains(Long.valueOf(j10))) {
                                    arrayList3.add(Long.valueOf(j10));
                                }
                            }
                            String str = "";
                            if (arrayList3.isEmpty()) {
                                z11 = false;
                            } else {
                                Long l10 = (Long) arrayList3.get(0);
                                long longValue = l10.longValue();
                                boolean z14 = longValue == h2Var.getUserConfig().e();
                                z11 = z14;
                                if (longValue < 0) {
                                    TLRPC.Chat O02 = h2Var.getMessagesController().O0(Long.valueOf(-longValue));
                                    z11 = z14;
                                    if (O02 != null) {
                                        str = O02.title;
                                        z11 = z14;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User c22 = h2Var.getMessagesController().c2(l10);
                                    z11 = z14;
                                    if (c22 != null) {
                                        if (o10.t(c22)) {
                                            str = gd.M0(2131754250, null);
                                            z11 = z14;
                                        } else {
                                            str = o10.q(c22);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                            String a02 = arrayList3.size() == 1 ? gd.a0(null, null, z11 ? 2131752070 : 2131752066, str) : gd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = a02;
                            u1Var.U = arrayList3.size() == 1 ? gd.a0(null, null, z11 ? 2131752071 : 2131752072, str) : gd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(gd.M0(2131746126, null), new r1() { // from class: org.telegram.ui.Components.zp0
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i17) {
                                    int i18 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    gt0 gt0Var2 = gt0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                            h2Var2.getMessagesController().R1().s(arrayList4, gt0Var2.m1);
                                            lc.b0(h2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            gt0Var2.V(false);
                                            break;
                                        default:
                                            gt0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                                gt0Var2.y1.getMessagesController().i0(((Long) arrayList4.get(i19)).longValue(), 0, null);
                                            }
                                            gt0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                            h2Var.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                u6.U(textView, n6.q7, null);
                                break;
                            }
                        } else {
                            if (org.telegram.messenger.n5.C(j3)) {
                                encryptedChat = h2Var.getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                                user = null;
                                O0 = null;
                            } else if (org.telegram.messenger.n5.E(j3)) {
                                user = h2Var.getMessagesController().c2(Long.valueOf(j3));
                                O0 = null;
                                encryptedChat = null;
                            } else {
                                O0 = h2Var.getMessagesController().O0(Long.valueOf(-j3));
                                user = null;
                                encryptedChat = null;
                            }
                            b5.y(h2Var, user, O0, encryptedChat, null, gt0Var.f1, null, gt0Var.c1, null, 0, 0, null, new fp0(gt0Var, 14), null, gt0Var.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (gt0Var.B0() && dq0Var != null && dq0Var.getCurrentList() != null) {
                            z5 currentList = dq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem = ((fj) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                                String M0 = gd.M0(arrayList4.size() > 1 ? 2131751549 : 2131751553, null);
                                u1 u1Var2 = alertDialog$Builder2.a;
                                u1Var2.S = M0;
                                u1Var2.U = gd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(gd.M0(2131751587, null), new rm(gt0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(gd.M0(2131752578, null), new wb0(i15));
                                u1Var2.show();
                                u1Var2.i();
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, gt0Var.getContext(), i6Var);
                                String M02 = gd.M0(arrayList5.size() > 1 ? 2131751478 : 2131751476, null);
                                u1 u1Var3 = alertDialog$Builder3.a;
                                u1Var3.S = M02;
                                u1Var3.U = gd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(gd.M0(2131751587, null), new r1() { // from class: org.telegram.ui.Components.zp0
                                    @Override // org.telegram.ui.ActionBar.r1
                                    public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i172) {
                                        int i182 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        gt0 gt0Var2 = gt0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                h2Var2.getMessagesController().R1().s(arrayList42, gt0Var2.m1);
                                                lc.b0(h2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                gt0Var2.V(false);
                                                break;
                                            default:
                                                gt0Var2.getClass();
                                                for (int i19 = 0; i19 < arrayList42.size(); i19++) {
                                                    gt0Var2.y1.getMessagesController().i0(((Long) arrayList42.get(i19)).longValue(), 0, null);
                                                }
                                                gt0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(gd.M0(2131752578, null), new wb0(14));
                                u1Var3.show();
                                u1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (gt0Var.h1 != null) {
                        mp messagesController = h2Var.getMessagesController();
                        TLRPC.UserFull userFull = gt0Var.h1;
                        messagesController.getClass();
                        if (mp.Q2(userFull)) {
                            m3 m3Var = gt0Var.H1;
                            if (m3Var != null) {
                                m3Var.v(gd.M0(2131750518, null));
                                gt0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (gt0Var.g1 != null) {
                        TLRPC.Chat O03 = h2Var.getMessagesController().O0(Long.valueOf(gt0Var.g1.id));
                        if (h2Var.getMessagesController().r2(O03)) {
                            m3 m3Var2 = gt0Var.H1;
                            if (m3Var2 != null) {
                                m3Var2.v((!v3.T(O03) || O03.megagroup) ? gd.M0(2131750519, null) : gd.M0(2131750520, null));
                                gt0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (gt0Var.u0()) {
                        m3 m3Var3 = gt0Var.H1;
                        if (m3Var3 != null) {
                            m3Var3.v(gd.M0(2131750521, "ForwardsRestrictedInfoBot"));
                            gt0Var.H1.z(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        cx cxVar = new cx(bundle);
                        cxVar.E2 = new hp0(gt0Var);
                        h2Var.presentFragment(cxVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (gt0Var.getClosestTab() != 8) {
                            pv I1 = h2Var.getMessagesController().I1();
                            ArrayList arrayList6 = I1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                long j11 = ((ov) arrayList6.get(i19)).a;
                                if (rs0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (I1.n(arrayList7, i12 == 103, true)) {
                                int i20 = 0;
                                while (true) {
                                    bs0[] bs0VarArr = gt0Var.n0;
                                    if (i20 < bs0VarArr.length) {
                                        bs0 bs0Var = bs0VarArr[i20];
                                        if (bs0Var.F == 11) {
                                            bs0Var.x.h1(0, 0);
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                            } else {
                                h2Var.showDialog(new ug.l0(33, h2Var.getCurrentAccount(), gt0Var.getContext(), h2Var, null));
                            }
                            gt0Var.V(true);
                            break;
                        } else {
                            qr0 qr0Var = gt0Var.f0;
                            if (qr0Var != null && qr0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                    arrayList8.add(Integer.valueOf(((fj) sparseArrayArr[0].valueAt(i21)).e1()));
                                }
                                gt0Var.f1(arrayList8, i12 == 103);
                                gt0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    fj fjVar = (fj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = fj.B0(fjVar.k);
                    if (org.telegram.messenger.n5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (org.telegram.messenger.n5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat O04 = h2Var.getMessagesController().O0(Long.valueOf(-B0));
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
                    long j12 = gt0Var.G;
                    if (j12 != 0) {
                        qg.c.a(bnVar, sr.a(B0, j12));
                        bundle2.putInt("message_id", fjVar.e1());
                    }
                    h2Var.presentFragment(bnVar, false);
                    break;
                }
                break;
            case 21:
                l51 l51Var = (l51) obj;
                int i22 = l51Var.b.i.q;
                if (i22 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    l51Var.updateAppUpdateViews(i12, true);
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
                            ks.e().k(ks.S4, new Object[0]);
                        }
                    }
                    l51Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g10 = org.telegram.messenger.t0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", l51Var.d, null, false);
                        break;
                    }
                }
                break;
            case 22:
                ((org.telegram.ui.Components.voip.w0) obj).b.x(i12, true);
                break;
            case 23:
                bc1 bc1Var = (bc1) obj;
                if (bc1Var.V == null && view.getAlpha() != 0.0f) {
                    bc1Var.c(i12, true);
                    break;
                }
                break;
            case 24:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                break;
            case 25:
                qx qxVar = (qx) obj;
                if (qxVar.n != null && i12 != qxVar.s) {
                    l41 l41Var = qxVar.r;
                    if (l41Var != null) {
                        l41Var.A = i12;
                    }
                    qxVar.b(i12, true);
                    qxVar.n.a(Integer.valueOf(i12));
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
                    pb1 pb1Var = le0Var.c;
                    if (!pb1Var.I) {
                        if (pb1Var.getCurrentPosition() == i12) {
                            Object c02 = le0Var.c0();
                            if (c02 instanceof ke0) {
                                ((ke0) c02).v();
                                break;
                            }
                        } else {
                            le0Var.s0(i12, true);
                            le0Var.c.A(i12);
                            break;
                        }
                    }
                }
                break;
            case 28:
                hk0 hk0Var = (hk0) obj;
                ij0 ij0Var = hk0Var.E1;
                hk0Var.T0 = i12;
                if (i12 == 1) {
                    hk0Var.j0 = hk0Var.h0;
                } else if (i12 == 4) {
                    hk0Var.j0 = hk0Var.i0;
                } else if (i12 == 2) {
                    hk0Var.j0 = hk0Var.f0;
                } else if (i12 == 3) {
                    hk0Var.j0 = hk0Var.g0;
                } else {
                    hk0Var.j0 = hk0Var.e0;
                }
                yv yvVar = (yv) view.getTag();
                PhotoViewer.p1().I2(null, hk0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(hk0Var.k1);
                    PhotoViewer.p1().b2(arrayList9, 0, ij0Var);
                    break;
                } else if (i12 == 2) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(hk0Var.m1);
                    PhotoViewer.p1().b2(arrayList10, 0, ij0Var);
                    break;
                } else if (i12 == 3) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(hk0Var.n1);
                    PhotoViewer.p1().b2(arrayList11, 0, ij0Var);
                    break;
                } else if (i12 == 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    ArrayList arrayList12 = hk0Var.j1;
                    p12.b2(arrayList12, arrayList12.indexOf(yvVar), ij0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = hk0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(yvVar), ij0Var);
                    break;
                }
            default:
                qm0 qm0Var = (qm0) obj;
                org.telegram.ui.ActionBar.h1 h1Var = qm0Var.J;
                if (h1Var != null && h1Var.isShowing()) {
                    qm0Var.J.d(true);
                }
                if (i12 == 0) {
                    b5.I(qm0Var.getParentActivity(), qm0Var.G.a(), new mm0(qm0Var, i10));
                    break;
                } else {
                    qm0Var.a0(qm0Var.b, qm0Var.c, true, 0);
                    qm0Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
