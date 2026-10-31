package bh;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bi.k2;
import java.io.File;
import java.util.ArrayList;
import kg.e1;
import kg.i1;
import kg.q0;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.fw;
import org.telegram.messenger.gs;
import org.telegram.messenger.gw;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k1;
import org.telegram.messenger.o5;
import org.telegram.messenger.pw;
import org.telegram.messenger.qz;
import org.telegram.messenger.rk;
import org.telegram.messenger.tz;
import org.telegram.messenger.video.o;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.messenger.y2;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.voip.e0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.a70;
import org.telegram.ui.ay;
import org.telegram.ui.b40;
import org.telegram.ui.co0;
import org.telegram.ui.d70;
import org.telegram.ui.et0;
import org.telegram.ui.hx0;
import org.telegram.ui.id1;
import org.telegram.ui.ix0;
import org.telegram.ui.lk0;
import org.telegram.ui.ll0;
import org.telegram.ui.lo0;
import org.telegram.ui.of0;
import org.telegram.ui.pf0;
import org.telegram.ui.py;
import org.telegram.ui.u61;
import org.telegram.ui.ud1;
import org.telegram.ui.un;
import org.telegram.ui.un0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yn0;
import org.telegram.ui.z;
import qh.g0;
import qh.q;
import rh.s0;
import rh.t0;
import s4.r;
import th.q4;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, jj jjVar) {
        this.a = 24;
        this.b = i10;
        this.c = jjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        TLRPC.Chat L0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        final int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                View.OnClickListener onClickListener = ((h) obj).b[i14];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 1:
                a aVar = ((k) obj).h;
                if (aVar != null) {
                    aVar.d(i14);
                    break;
                }
                break;
            case 2:
                ((k2) obj).P.b4(i14);
                break;
            case 3:
                ((un) obj).V9(i14);
                break;
            case 4:
                i0 i0Var = (i0) obj;
                if (i14 == 0) {
                    i0Var.V1 = !i0Var.V1;
                } else if (i14 == 1) {
                    i0Var.W1 = !i0Var.W1;
                } else if (i14 == 2) {
                    i0Var.X1 = !i0Var.X1;
                }
                i0Var.P1.O(true);
                i0Var.I0();
                break;
            case 5:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i14];
                zArr[i14] = z12;
                ((c2) view).c(z12, true);
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.R2.getActionBarMenuOnItemClick().b(i14);
                chatAttachAlertPhotoLayout.x.U(null, null);
                break;
            case 7:
                ((b40) obj).i1.x(i14, true);
                break;
            case 8:
                b40 b40Var = (b40) ((e1) obj).d;
                b40Var.J0(i14);
                b40Var.dismiss();
                break;
            case 9:
                ((n90) obj).R.f1(i14 + 8);
                break;
            case 10:
                jc0 jc0Var = (jc0) obj;
                if (jc0Var.e.getAdapter() instanceof ox) {
                    vy vyVar = ((ox) jc0Var.e.getAdapter()).c;
                    if ((i14 != 1 && i14 != 2) || !vyVar.w1) {
                        z10 = false;
                        if (i14 == 0 && vyVar.v1) {
                            vyVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        vyVar.Q(true, false, i14 == 1);
                        break;
                    }
                } else {
                    z10 = false;
                }
                jc0Var.e.x(i14, z10);
                break;
            case 11:
                h4 h4Var = (h4) obj;
                EditTextBoldCursor editTextBoldCursor = h4Var.j1;
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                h4Var.k1.a(Integer.valueOf(i14), editTextBoldCursor.getText().toString());
                h4Var.dismiss();
                break;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i14, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 13:
                final zt0 zt0Var = (zt0) obj;
                uq0 uq0Var = zt0Var.W;
                it0 it0Var = zt0Var.T;
                p6 p6Var = zt0Var.H1;
                long j10 = zt0Var.l1;
                SparseArray[] sparseArrayArr = zt0Var.b1;
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
                if (i14 == 101) {
                    if (!zt0.x0(zt0Var.getSelectedTab()) && zt0Var.getSelectedTab() != 13) {
                        if (zt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList = k2Var.getMessagesController().F1().j;
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                long j11 = ((fw) arrayList.get(i15)).a;
                                if (it0Var.x.contains(Long.valueOf(j11))) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                            }
                            String str = "";
                            if (arrayList2.isEmpty()) {
                                z11 = false;
                            } else {
                                Long l4 = (Long) arrayList2.get(0);
                                long longValue = l4.longValue();
                                boolean z14 = longValue == k2Var.getUserConfig().e();
                                z11 = z14;
                                if (longValue < 0) {
                                    TLRPC.Chat L02 = k2Var.getMessagesController().L0(Long.valueOf(-longValue));
                                    z11 = z14;
                                    if (L02 != null) {
                                        str = L02.title;
                                        z11 = z14;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User Z1 = k2Var.getMessagesController().Z1(l4);
                                    z11 = z14;
                                    if (Z1 != null) {
                                        if (h20.s(Z1)) {
                                            str = cd.L0(2131754252, null);
                                            z11 = z14;
                                        } else {
                                            str = h20.p(Z1);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                            String a02 = arrayList2.size() == 1 ? cd.a0(null, null, z11 ? 2131752081 : 2131752077, str) : cd.G(arrayList2.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = a02;
                            x1Var.T = arrayList2.size() == 1 ? cd.a0(null, null, z11 ? 2131752082 : 2131752083, str) : cd.G(arrayList2.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            String L03 = cd.L0(2131746336, null);
                            final int i16 = r10 ? 1 : 0;
                            alertDialog$Builder.k(L03, new u1() { // from class: org.telegram.ui.Components.oq0
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i17) {
                                    int i18 = i16;
                                    ArrayList arrayList3 = arrayList2;
                                    zt0 zt0Var2 = zt0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var2.x1;
                                            k2Var2.getMessagesController().O1().s(arrayList3, zt0Var2.l1);
                                            cc.a0(k2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.G(arrayList3.size(), "StoriesDeleted", new Object[0])).j();
                                            zt0Var2.T(false);
                                            break;
                                        default:
                                            zt0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                zt0Var2.x1.getMessagesController().i0(((Long) arrayList3.get(i19)).longValue(), 0, null);
                                            }
                                            zt0Var2.T(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            k2Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                a7.V(textView, t6.q7, null);
                                break;
                            }
                        } else {
                            if (o5.C(j10)) {
                                encryptedChat = k2Var.getMessagesController().Z0(Integer.valueOf((int) (j10 & 4294967295L)));
                                user = null;
                                L0 = null;
                            } else if (o5.E(j10)) {
                                user = k2Var.getMessagesController().Z1(Long.valueOf(j10));
                                L0 = null;
                                encryptedChat = null;
                            } else {
                                L0 = k2Var.getMessagesController().L0(Long.valueOf(-j10));
                                user = null;
                                encryptedChat = null;
                            }
                            s4.y(k2Var, user, L0, encryptedChat, null, zt0Var.e1, null, zt0Var.b1, null, 0, 0, null, new vp0(zt0Var, 12), null, zt0Var.H1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        int i17 = 26;
                        if (zt0Var.z0() && uq0Var != null && uq0Var.getCurrentList() != null) {
                            q4 currentList = uq0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                                TL_stories.StoryItem storyItem = ((jj) sparseArrayArr[0].valueAt(i18)).l;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                                String L04 = cd.L0(arrayList3.size() > 1 ? 2131751561 : 2131751565, null);
                                x1 x1Var2 = alertDialog$Builder2.a;
                                x1Var2.R = L04;
                                x1Var2.T = cd.G(arrayList3.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(cd.L0(2131751599, null), new androidx.car.app.utils.a(zt0Var, currentList, arrayList3, i17));
                                alertDialog$Builder2.h(cd.L0(2131752589, null), new au(25));
                                x1Var2.show();
                                x1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList4 = new ArrayList();
                            for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                                TL_stories.StoryItem storyItem2 = ((jj) sparseArrayArr[0].valueAt(i19)).l;
                                if (storyItem2 != null) {
                                    arrayList4.add(storyItem2);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                                String L05 = cd.L0(arrayList4.size() > 1 ? 2131751490 : 2131751488, null);
                                x1 x1Var3 = alertDialog$Builder3.a;
                                x1Var3.R = L05;
                                x1Var3.T = cd.G(arrayList4.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(cd.L0(2131751599, null), new u1() { // from class: org.telegram.ui.Components.oq0
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i172) {
                                        int i182 = i13;
                                        ArrayList arrayList32 = arrayList4;
                                        zt0 zt0Var2 = zt0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var2.x1;
                                                k2Var2.getMessagesController().O1().s(arrayList32, zt0Var2.l1);
                                                cc.a0(k2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.G(arrayList32.size(), "StoriesDeleted", new Object[0])).j();
                                                zt0Var2.T(false);
                                                break;
                                            default:
                                                zt0Var2.getClass();
                                                for (int i192 = 0; i192 < arrayList32.size(); i192++) {
                                                    zt0Var2.x1.getMessagesController().i0(((Long) arrayList32.get(i192)).longValue(), 0, null);
                                                }
                                                zt0Var2.T(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(cd.L0(2131752589, null), new au(i17));
                                x1Var3.show();
                                x1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i14 == 100) {
                    if (zt0Var.g1 != null) {
                        vp messagesController = k2Var.getMessagesController();
                        TLRPC.UserFull userFull = zt0Var.g1;
                        messagesController.getClass();
                        if (vp.I2(userFull)) {
                            q30 q30Var = zt0Var.G1;
                            if (q30Var != null) {
                                q30Var.setText(cd.L0(2131750536, null));
                                zt0Var.G1.f(view, true);
                                break;
                            }
                        }
                    }
                    if (zt0Var.f1 != null) {
                        TLRPC.Chat L06 = k2Var.getMessagesController().L0(Long.valueOf(zt0Var.f1.id));
                        if (k2Var.getMessagesController().n2(L06)) {
                            q30 q30Var2 = zt0Var.G1;
                            if (q30Var2 != null) {
                                q30Var2.setText((!w3.T(L06) || L06.megagroup) ? cd.L0(2131750537, null) : cd.L0(2131750538, null));
                                zt0Var.G1.f(view, true);
                                break;
                            }
                        }
                    }
                    if (zt0Var.s0()) {
                        q30 q30Var3 = zt0Var.G1;
                        if (q30Var3 != null) {
                            q30Var3.setText(cd.L0(2131750539, "ForwardsRestrictedInfoBot"));
                            zt0Var.G1.f(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        ay ayVar = new ay(bundle);
                        ayVar.C2 = new wp0(zt0Var);
                        k2Var.presentFragment(ayVar);
                        break;
                    }
                } else if (i14 != 102) {
                    if (i14 == 103 || i14 == 104) {
                        if (zt0Var.getClosestTab() != 8) {
                            gw F1 = k2Var.getMessagesController().F1();
                            ArrayList arrayList5 = F1.j;
                            ArrayList arrayList6 = new ArrayList();
                            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                long j12 = ((fw) arrayList5.get(i20)).a;
                                if (it0Var.x.contains(Long.valueOf(j12))) {
                                    arrayList6.add(Long.valueOf(j12));
                                }
                            }
                            if (F1.n(arrayList6, i14 == 103, true)) {
                                int i21 = 0;
                                while (true) {
                                    ss0[] ss0VarArr = zt0Var.m0;
                                    if (i21 < ss0VarArr.length) {
                                        ss0 ss0Var = ss0VarArr[i21];
                                        if (ss0Var.E == 11) {
                                            ss0Var.x.h1(0, 0);
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                            } else {
                                k2Var.showDialog(new q0(33, k2Var.getCurrentAccount(), zt0Var.getContext(), k2Var, null));
                            }
                            zt0Var.T(true);
                            break;
                        } else {
                            hs0 hs0Var = zt0Var.e0;
                            if (hs0Var != null && hs0Var.s != null) {
                                ArrayList arrayList7 = new ArrayList();
                                for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                    arrayList7.add(Integer.valueOf(((jj) sparseArrayArr[0].valueAt(i22)).f1()));
                                }
                                zt0Var.a1(arrayList7, i14 == 103);
                                zt0Var.T(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    jj jjVar = (jj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = jj.B0(jjVar.k);
                    if (o5.C(B0)) {
                        bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                    } else if (o5.E(B0)) {
                        bundle2.putLong("user_id", B0);
                    } else {
                        TLRPC.Chat L07 = k2Var.getMessagesController().L0(Long.valueOf(-B0));
                        if (L07 != null && L07.migrated_to != null) {
                            bundle2.putLong("migrated_to", B0);
                            B0 = -L07.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -B0);
                    }
                    bundle2.putInt("message_id", jjVar.f1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    un unVar = new un(bundle2);
                    unVar.b8 = jjVar.f1();
                    long j13 = zt0Var.F;
                    if (j13 != 0) {
                        gg.e.a(unVar, gs.a(B0, j13));
                        bundle2.putInt("message_id", jjVar.f1());
                    }
                    k2Var.presentFragment(unVar, false);
                    break;
                }
                break;
            case 14:
                b61 b61Var = (b61) obj;
                int i23 = b61Var.b.i.q;
                if (i23 == 2) {
                    if (((ApplicationLoaderImpl) w0.a).q()) {
                        k1.e().b(false);
                    }
                    b61Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i23 == 3) {
                    if (((ApplicationLoaderImpl) w0.a).q()) {
                        k1 e = k1.e();
                        if (e.j) {
                            HttpGetFileTask httpGetFileTask = e.l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e.j = false;
                            zs.e().k(zs.Q4, new Object[0]);
                        }
                    }
                    b61Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File g10 = w0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.i0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", b61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((e0) obj).b.x(i14, true);
                break;
            case 16:
                ud1 ud1Var = (ud1) obj;
                if (ud1Var.U == null && view.getAlpha() != 0.0f) {
                    ud1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                py pyVar = (py) obj;
                if (pyVar.n != null && i14 != pyVar.s) {
                    a51 a51Var = pyVar.r;
                    if (a51Var != null) {
                        a51Var.z = i14;
                    }
                    pyVar.b(i14, true);
                    pyVar.n.a(Integer.valueOf(i14));
                    break;
                }
                break;
            case 19:
                d70 d70Var = (d70) obj;
                d70Var.Q.dismiss();
                int i24 = d70Var.c0;
                if (i24 >= 0) {
                    y2 y2Var = d70Var.d0;
                    int[] iArr = y2Var.c;
                    if (!y2Var.b) {
                        y2Var.b = true;
                        while (i13 < 4) {
                            iArr[i13] = tz.q().getInt(i0.a.i(i13, "keep_media_type_"), y2.b(i13));
                            i13++;
                        }
                    }
                    iArr[i24] = i14;
                    tz.q().edit().putInt("keep_media_type_" + i24, i14).apply();
                    a70 a70Var = d70Var.e0;
                    if (a70Var != null) {
                        a70Var.a(i14);
                        break;
                    }
                } else {
                    a70 a70Var2 = d70Var.e0;
                    if (a70Var2 != null) {
                        a70Var2.a(i14);
                        break;
                    }
                }
                break;
            case 20:
                pf0 pf0Var = (pf0) obj;
                ValueAnimator valueAnimator = pf0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    id1 id1Var = pf0Var.c;
                    if (!id1Var.H) {
                        if (id1Var.getCurrentPosition() == i14) {
                            Object b02 = pf0Var.b0();
                            if (b02 instanceof of0) {
                                ((of0) b02).u();
                                break;
                            }
                        } else {
                            pf0Var.r0(i14, true);
                            pf0Var.c.E(i14);
                            break;
                        }
                    }
                }
                break;
            case 21:
                ll0 ll0Var = (ll0) obj;
                lk0 lk0Var = ll0Var.D1;
                ll0Var.S0 = i14;
                if (i14 == 1) {
                    ll0Var.i0 = ll0Var.g0;
                } else if (i14 == 4) {
                    ll0Var.i0 = ll0Var.h0;
                } else if (i14 == 2) {
                    ll0Var.i0 = ll0Var.e0;
                } else if (i14 == 3) {
                    ll0Var.i0 = ll0Var.f0;
                } else {
                    ll0Var.i0 = ll0Var.d0;
                }
                pw pwVar = (pw) view.getTag();
                PhotoViewer.v1().N2(null, ll0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(ll0Var.j1);
                    PhotoViewer.v1().f2(arrayList8, 0, lk0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(ll0Var.l1);
                    PhotoViewer.v1().f2(arrayList9, 0, lk0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(ll0Var.m1);
                    PhotoViewer.v1().f2(arrayList10, 0, lk0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList11 = ll0Var.i1;
                    v12.f2(arrayList11, arrayList11.indexOf(pwVar), lk0Var);
                    break;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList12 = ll0Var.k1;
                    v13.f2(arrayList12, arrayList12.indexOf(pwVar), lk0Var);
                    break;
                }
            case 22:
                yn0 yn0Var = (yn0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = yn0Var.I;
                if (k1Var != null && k1Var.isShowing()) {
                    yn0Var.I.d(true);
                }
                if (i14 == 0) {
                    s4.K(yn0Var.getParentActivity(), yn0Var.F.a(), new un0(yn0Var, i12));
                    break;
                } else {
                    yn0Var.Z(yn0Var.b, yn0Var.c, true, 0);
                    yn0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                lo0 lo0Var = (lo0) obj;
                org.telegram.ui.ActionBar.k1 k1Var2 = lo0Var.m0;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    lo0Var.m0.d(true);
                }
                if (i14 == 0) {
                    s4.K(lo0Var.getParentActivity(), lo0Var.U.a(), new co0(lo0Var, r10 ? 1 : 0));
                    break;
                } else {
                    lo0Var.i0(0, true);
                    break;
                }
                break;
            case 24:
                jj jjVar2 = (jj) obj;
                int i25 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.i0.g3(new rk(qz.C(i14), jj.B0(jjVar2.k), jjVar2.f1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i14 == 0) {
                    ix0 ix0Var = profileActivity.N;
                    if (!ix0Var.E1) {
                        if (zt0.F0(ix0Var.getClosestTab())) {
                            ix0 ix0Var2 = profileActivity.N;
                            profileActivity.N.V0(profileActivity, profileActivity.a(), ix0Var2.r1(ix0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().T4()) {
                            profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                            o8 D = o8.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new hx0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new i1((org.telegram.ui.ActionBar.k2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!zt0.F0(profileActivity.N.getClosestTab())) {
                    long e7 = profileActivity.getUserConfig().e();
                    o oVar = profileActivity.x5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.x5 = null;
                    }
                    wb.e();
                    boolean z15 = profileActivity.N.getClosestTab() == 9;
                    ArrayList arrayList13 = new ArrayList();
                    SparseArray<jj> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i10 = 0;
                        for (int i26 = 0; i26 < actionModeSelected.size(); i26++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected.valueAt(i26).l;
                            if (storyItem3 != null) {
                                arrayList13.add(storyItem3);
                                i10++;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    profileActivity.N.T(false);
                    if (z15) {
                        profileActivity.N.f1(8);
                    }
                    if (!arrayList13.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList13.size()];
                        for (int i27 = 0; i27 < arrayList13.size(); i27++) {
                            TL_stories.StoryItem storyItem4 = (TL_stories.StoryItem) arrayList13.get(i27);
                            zArr2[i27] = storyItem4.pinned;
                            storyItem4.pinned = z15;
                        }
                        profileActivity.getMessagesController().O1().q0(e7, arrayList13, false);
                        boolean[] zArr3 = {false};
                        boolean z16 = z15;
                        profileActivity.x5 = new o(profileActivity, e7, arrayList13, z16);
                        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(profileActivity, zArr3, arrayList13, zArr2, e7, 7);
                        (z16 ? cc.a0(profileActivity).L(R.raw.contact_check, cd.G(i10, "StorySavedTitle", new Object[0]), cd.L0(2131744510, null), cd.L0(2131743910, null), gVar).j() : cc.a0(profileActivity).J(R.raw.chats_archived, cd.G(i10, "StoryArchived", new Object[0]), cd.L0(2131743910, null), 5000, false, gVar).j()).v = new et0(15, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    ix0 ix0Var3 = profileActivity.N;
                    int r12 = ix0Var3.r1(ix0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().O1().w(r12, a2);
                    o oVar2 = profileActivity.x5;
                    if (oVar2 != null) {
                        oVar2.run();
                        profileActivity.x5 = null;
                    }
                    wb.e();
                    ArrayList arrayList14 = new ArrayList();
                    SparseArray<jj> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i28 = 0; i28 < actionModeSelected2.size(); i28++) {
                            TL_stories.StoryItem storyItem5 = actionModeSelected2.valueAt(i28).l;
                            if (storyItem5 != null) {
                                arrayList14.add(storyItem5);
                            }
                        }
                    }
                    profileActivity.N.T(false);
                    if (!arrayList14.isEmpty()) {
                        z zVar = new z(profileActivity, a2, r12, arrayList14);
                        profileActivity.getMessagesController().O1().f0(r12, a2, arrayList14);
                        cc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.i0.W2(cd.G(arrayList14.size(), "StoryRemovedFromAlbumTitle", w9)), cd.L0(2131743910, null), zVar).j();
                        break;
                    }
                }
                break;
            case 26:
                u61 u61Var = (u61) obj;
                u61Var.h0.E(i14);
                u61Var.o0(i14, true);
                break;
            case 27:
                ra raVar = (ra) obj;
                EditText editText = raVar.a;
                TextView[] textViewArr = raVar.N;
                TextView textView2 = textViewArr[i14];
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    String charSequence = textViewArr[i14].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    raVar.a();
                    raVar.a();
                    Runnable runnable = raVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
            case 28:
                g0 g0Var = ((q) obj).h;
                r rVar = g0Var.d;
                ArrayList arrayList15 = g0Var.n;
                if (i14 >= 0 && i14 < arrayList15.size()) {
                    g0Var.w = true;
                    g0Var.h.a(i14, true);
                    int i29 = ((qh.o) arrayList15.get(i14)).d;
                    int L08 = rVar.L0();
                    if ((rVar.m(i29) != null || Math.abs(i29 - L08) <= g0Var.r * 9) && tz.c()) {
                        qh.i iVar = new qh.i(g0Var.getContext());
                        iVar.a = ((qh.o) arrayList15.get(i14)).d;
                        rVar.w0(iVar);
                        break;
                    } else {
                        g0Var.c.C0();
                        vj0 vj0Var = g0Var.f;
                        vj0Var.b = L08 < i29 ? 0 : 1;
                        vj0Var.d(i29, 0, false, false);
                        break;
                    }
                }
                break;
            default:
                s0 s0Var = ((t0) obj).b2;
                int i30 = s0.w;
                s0Var.a(i14);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
