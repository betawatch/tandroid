package ci;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import di.g1;
import di.h1;
import fi.a6;
import hi.l3;
import hi.l9;
import hi.m5;
import hi.o5;
import java.io.File;
import java.util.ArrayList;
import oi.b2;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.pv;
import org.telegram.messenger.qv;
import org.telegram.messenger.tr;
import org.telegram.messenger.v2;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.messenger.zv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.c60;
import org.telegram.ui.cx;
import org.telegram.ui.f60;
import org.telegram.ui.g30;
import org.telegram.ui.hk0;
import org.telegram.ui.ij0;
import org.telegram.ui.le0;
import org.telegram.ui.me0;
import org.telegram.ui.mm0;
import org.telegram.ui.pb1;
import org.telegram.ui.qm0;
import org.telegram.ui.qx;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        y10 y10Var;
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
                    if ((tVar.m(i13) != null || Math.abs(i13 - L0) <= h0Var.r * 9) && cz.c()) {
                        i iVar = new i(h0Var.getContext());
                        iVar.a = ((o) arrayList.get(i12)).d;
                        tVar.w0(iVar);
                        break;
                    } else {
                        h0Var.c.C0();
                        k5 k5Var = h0Var.f;
                        k5Var.b = L0 < i13 ? 0 : 1;
                        k5Var.k(i13, 0, false, false);
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
                l9 l9Var = (l9) obj;
                if (!l9Var.e.contains(Integer.valueOf(i12))) {
                    l9Var.e.add(Integer.valueOf(i12));
                } else if (l9Var.e.size() > 1) {
                    l9Var.e.remove(Integer.valueOf(i12));
                }
                org.telegram.messenger.g0.d0(l9Var.b, new ai.h0(l9Var, 26));
                break;
            case 4:
                o5 o5Var = ((m5) obj).b;
                if (o5Var.r && (y10Var = o5Var.f) != null) {
                    y10Var.a(Integer.valueOf(i12));
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
                ((b2) obj).Q.b4(i12);
                break;
            case 8:
                ((bn) obj).ha(i12);
                break;
            case 9:
                ((y10) obj).a(Integer.valueOf(i12));
                break;
            case 10:
                ((org.telegram.ui.Components.k) obj).a(Integer.valueOf(i12));
                break;
            case 11:
                org.telegram.ui.Components.p0 p0Var = (org.telegram.ui.Components.p0) obj;
                if (i12 == 0) {
                    p0Var.Z1 = !p0Var.Z1;
                } else if (i12 == 1) {
                    p0Var.a2 = !p0Var.a2;
                } else if (i12 == 2) {
                    p0Var.b2 = !p0Var.b2;
                }
                p0Var.T1.O(true);
                p0Var.J0();
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
                ((g30) obj).m1.x(i12, true);
                break;
            case 15:
                g30 g30Var = (g30) ((n20) obj).d;
                g30Var.K0(i12);
                g30Var.dismiss();
                break;
            case 16:
                ((k90) obj).S.k1(i12 + 8);
                break;
            case 17:
                cc0 cc0Var = (cc0) obj;
                if (cc0Var.e.getAdapter() instanceof nx) {
                    ty tyVar = ((nx) cc0Var.e.getAdapter()).c;
                    if ((i12 != 1 && i12 != 2) || !tyVar.x1) {
                        z10 = false;
                        if (i12 == 0 && tyVar.w1) {
                            tyVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        tyVar.Q(true, false, i12 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                cc0Var.e.x(i12, z10);
                break;
            case 18:
                r4 r4Var = (r4) obj;
                EditTextBoldCursor editTextBoldCursor = r4Var.n1;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                r4Var.o1.a(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                r4Var.dismiss();
                break;
            case 19:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i12, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 20:
                final jt0 jt0Var = (jt0) obj;
                fq0 fq0Var = jt0Var.a0;
                us0 us0Var = jt0Var.U;
                h6 h6Var = jt0Var.I1;
                long j3 = jt0Var.m1;
                SparseArray[] sparseArrayArr = jt0Var.c1;
                g2 g2Var = jt0Var.y1;
                if (i12 == 101) {
                    int i15 = 13;
                    if (!jt0.z0(jt0Var.getSelectedTab()) && jt0Var.getSelectedTab() != 13) {
                        if (jt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList2 = g2Var.getMessagesController().I1().j;
                            final ArrayList arrayList3 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                long j10 = ((pv) arrayList2.get(i16)).a;
                                if (us0Var.x.contains(Long.valueOf(j10))) {
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
                                        if (p10.t(c22)) {
                                            str = hd.N0(2131754249, null);
                                            z11 = z14;
                                        } else {
                                            str = p10.q(c22);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                            String a02 = arrayList3.size() == 1 ? hd.a0(null, null, z11 ? 2131752069 : 2131752065, str) : hd.G(arrayList3.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = a02;
                            t1Var.U = arrayList3.size() == 1 ? hd.a0(null, null, z11 ? 2131752070 : 2131752071, str) : hd.G(arrayList3.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            alertDialog$Builder.k(hd.N0(2131746125, null), new q1() { // from class: org.telegram.ui.Components.bq0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i17) {
                                    int i18 = r3;
                                    ArrayList arrayList4 = arrayList3;
                                    jt0 jt0Var2 = jt0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.y1;
                                            g2Var2.getMessagesController().R1().s(arrayList4, jt0Var2.m1);
                                            lc.b0(g2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(arrayList4.size(), "StoriesDeleted", new Object[0])).j();
                                            jt0Var2.V(false);
                                            break;
                                        default:
                                            jt0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                                jt0Var2.y1.getMessagesController().i0(((Long) arrayList4.get(i19)).longValue(), 0, null);
                                            }
                                            jt0Var2.V(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                            g2Var.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                t6.U(textView, m6.q7, null);
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
                            c5.y(g2Var, user, O0, encryptedChat, null, jt0Var.f1, null, jt0Var.c1, null, 0, 0, null, new hp0(jt0Var, 14), null, jt0Var.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (jt0Var.B0() && fq0Var != null && fq0Var.getCurrentList() != null) {
                            a6 currentList = fq0Var.getCurrentList();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                                TL_stories.StoryItem storyItem = ((gj) sparseArrayArr[0].valueAt(i17)).l;
                                if (storyItem != null) {
                                    arrayList4.add(storyItem.media);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                                String N0 = hd.N0(arrayList4.size() > 1 ? 2131751548 : 2131751552, null);
                                t1 t1Var2 = alertDialog$Builder2.a;
                                t1Var2.S = N0;
                                t1Var2.U = hd.G(arrayList4.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(hd.N0(2131751586, null), new tm(jt0Var, currentList, arrayList4, 5));
                                alertDialog$Builder2.h(hd.N0(2131752577, null), new xb0(i15));
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, jt0Var.getContext(), h6Var);
                                String N02 = hd.N0(arrayList5.size() > 1 ? 2131751477 : 2131751475, null);
                                t1 t1Var3 = alertDialog$Builder3.a;
                                t1Var3.S = N02;
                                t1Var3.U = hd.G(arrayList5.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(hd.N0(2131751586, null), new q1() { // from class: org.telegram.ui.Components.bq0
                                    @Override // org.telegram.ui.ActionBar.q1
                                    public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i172) {
                                        int i182 = i11;
                                        ArrayList arrayList42 = arrayList5;
                                        jt0 jt0Var2 = jt0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.y1;
                                                g2Var2.getMessagesController().R1().s(arrayList42, jt0Var2.m1);
                                                lc.b0(g2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(arrayList42.size(), "StoriesDeleted", new Object[0])).j();
                                                jt0Var2.V(false);
                                                break;
                                            default:
                                                jt0Var2.getClass();
                                                for (int i19 = 0; i19 < arrayList42.size(); i19++) {
                                                    jt0Var2.y1.getMessagesController().i0(((Long) arrayList42.get(i19)).longValue(), 0, null);
                                                }
                                                jt0Var2.V(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(hd.N0(2131752577, null), new xb0(14));
                                t1Var3.show();
                                t1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i12 == 100) {
                    if (jt0Var.h1 != null) {
                        np messagesController = g2Var.getMessagesController();
                        TLRPC.UserFull userFull = jt0Var.h1;
                        messagesController.getClass();
                        if (np.Q2(userFull)) {
                            l3 l3Var = jt0Var.H1;
                            if (l3Var != null) {
                                l3Var.v(hd.N0(2131750517, null));
                                jt0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (jt0Var.g1 != null) {
                        TLRPC.Chat O03 = g2Var.getMessagesController().O0(Long.valueOf(jt0Var.g1.id));
                        if (g2Var.getMessagesController().r2(O03)) {
                            l3 l3Var2 = jt0Var.H1;
                            if (l3Var2 != null) {
                                l3Var2.v((!v3.T(O03) || O03.megagroup) ? hd.N0(2131750518, null) : hd.N0(2131750519, null));
                                jt0Var.H1.z(view, true);
                                break;
                            }
                        }
                    }
                    if (jt0Var.u0()) {
                        l3 l3Var3 = jt0Var.H1;
                        if (l3Var3 != null) {
                            l3Var3.v(hd.N0(2131750520, "ForwardsRestrictedInfoBot"));
                            jt0Var.H1.z(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        cx cxVar = new cx(bundle);
                        cxVar.E2 = new jp0(jt0Var);
                        g2Var.presentFragment(cxVar);
                        break;
                    }
                } else if (i12 != 102) {
                    if (i12 == 103 || i12 == 104) {
                        if (jt0Var.getClosestTab() != 8) {
                            qv I1 = g2Var.getMessagesController().I1();
                            ArrayList arrayList6 = I1.j;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                long j11 = ((pv) arrayList6.get(i19)).a;
                                if (us0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList7.add(Long.valueOf(j11));
                                }
                            }
                            if (I1.n(arrayList7, i12 == 103, true)) {
                                int i20 = 0;
                                while (true) {
                                    ds0[] ds0VarArr = jt0Var.n0;
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
                                g2Var.showDialog(new ug.k0(33, g2Var.getCurrentAccount(), jt0Var.getContext(), g2Var, null));
                            }
                            jt0Var.V(true);
                            break;
                        } else {
                            sr0 sr0Var = jt0Var.f0;
                            if (sr0Var != null && sr0Var.s != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                    arrayList8.add(Integer.valueOf(((gj) sparseArrayArr[0].valueAt(i21)).e1()));
                                }
                                jt0Var.f1(arrayList8, i12 == 103);
                                jt0Var.V(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    gj gjVar = (gj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = gj.B0(gjVar.k);
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
                    bundle2.putInt("message_id", gjVar.e1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    bn bnVar = new bn(bundle2);
                    bnVar.d8 = gjVar.e1();
                    long j12 = jt0Var.G;
                    if (j12 != 0) {
                        qg.c.a(bnVar, tr.a(B0, j12));
                        bundle2.putInt("message_id", gjVar.e1());
                    }
                    g2Var.presentFragment(bnVar, false);
                    break;
                }
                break;
            case 21:
                o51 o51Var = (o51) obj;
                int i22 = o51Var.b.i.q;
                if (i22 == 2) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q()) {
                        org.telegram.messenger.h1.e().b(false);
                    }
                    o51Var.updateAppUpdateViews(i12, true);
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
                            ls.e().k(ls.T4, new Object[0]);
                        }
                    }
                    o51Var.updateAppUpdateViews(i12, true);
                    break;
                } else {
                    File g10 = org.telegram.messenger.t0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.g0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", o51Var.d, null, false);
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
                    o41 o41Var = qxVar.r;
                    if (o41Var != null) {
                        o41Var.A = i12;
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
                            iArr[i11] = cz.q().getInt(i5.c.i(i11, "keep_media_type_"), v2.b(i11));
                            i11++;
                        }
                    }
                    iArr[i23] = i12;
                    cz.q().edit().putInt("keep_media_type_" + i23, i12).apply();
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
                me0 me0Var = (me0) obj;
                ValueAnimator valueAnimator = me0Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pb1 pb1Var = me0Var.c;
                    if (!pb1Var.I) {
                        if (pb1Var.getCurrentPosition() == i12) {
                            Object c02 = me0Var.c0();
                            if (c02 instanceof le0) {
                                ((le0) c02).v();
                                break;
                            }
                        } else {
                            me0Var.s0(i12, true);
                            me0Var.c.A(i12);
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
                zv zvVar = (zv) view.getTag();
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
                    p12.b2(arrayList12, arrayList12.indexOf(zvVar), ij0Var);
                    break;
                } else {
                    PhotoViewer p13 = PhotoViewer.p1();
                    ArrayList arrayList13 = hk0Var.l1;
                    p13.b2(arrayList13, arrayList13.indexOf(zvVar), ij0Var);
                    break;
                }
            default:
                qm0 qm0Var = (qm0) obj;
                org.telegram.ui.ActionBar.g1 g1Var2 = qm0Var.J;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    qm0Var.J.d(true);
                }
                if (i12 == 0) {
                    c5.I(qm0Var.getParentActivity(), qm0Var.G.a(), new mm0(qm0Var, i10));
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
