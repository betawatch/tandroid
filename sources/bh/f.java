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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.gw;
import org.telegram.messenger.hs;
import org.telegram.messenger.hw;
import org.telegram.messenger.i20;
import org.telegram.messenger.k1;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.qw;
import org.telegram.messenger.rz;
import org.telegram.messenger.sk;
import org.telegram.messenger.uz;
import org.telegram.messenger.video.o;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.messenger.y2;
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
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.i0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.voip.f0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.a40;
import org.telegram.ui.a70;
import org.telegram.ui.ao0;
import org.telegram.ui.d70;
import org.telegram.ui.gd1;
import org.telegram.ui.gx0;
import org.telegram.ui.hr0;
import org.telegram.ui.hx0;
import org.telegram.ui.jk0;
import org.telegram.ui.jl0;
import org.telegram.ui.jo0;
import org.telegram.ui.nf0;
import org.telegram.ui.of0;
import org.telegram.ui.oy;
import org.telegram.ui.s61;
import org.telegram.ui.sd1;
import org.telegram.ui.sn0;
import org.telegram.ui.un;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wn0;
import org.telegram.ui.z;
import org.telegram.ui.zx;
import qh.g0;
import qh.q;
import rh.s0;
import rh.t0;
import s4.r;
import th.q4;
import vh.o8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, kj kjVar) {
        this.a = 24;
        this.b = i10;
        this.c = kjVar;
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
                ((un) obj).aa(i14);
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
                ((a40) obj).i1.x(i14, true);
                break;
            case 8:
                a40 a40Var = (a40) ((e1) obj).d;
                a40Var.J0(i14);
                a40Var.dismiss();
                break;
            case 9:
                ((n90) obj).R.g1(i14 + 8);
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
                final au0 au0Var = (au0) obj;
                vq0 vq0Var = au0Var.W;
                jt0 jt0Var = au0Var.T;
                p6 p6Var = au0Var.H1;
                long j10 = au0Var.l1;
                SparseArray[] sparseArrayArr = au0Var.b1;
                org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
                if (i14 == 101) {
                    if (!au0.y0(au0Var.getSelectedTab()) && au0Var.getSelectedTab() != 13) {
                        if (au0Var.getSelectedTab() == 11) {
                            ArrayList arrayList = k2Var.getMessagesController().F1().j;
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                long j11 = ((gw) arrayList.get(i15)).a;
                                if (jt0Var.x.contains(Long.valueOf(j11))) {
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
                                        if (i20.s(Z1)) {
                                            str = dd.L0(2131754252, null);
                                            z11 = z14;
                                        } else {
                                            str = i20.p(Z1);
                                            z11 = z14;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                            String a02 = arrayList2.size() == 1 ? dd.a0(null, null, z11 ? 2131752081 : 2131752077, str) : dd.G(arrayList2.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = a02;
                            x1Var.T = arrayList2.size() == 1 ? dd.a0(null, null, z11 ? 2131752082 : 2131752083, str) : dd.G(arrayList2.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            String L03 = dd.L0(2131746336, null);
                            final int i16 = r10 ? 1 : 0;
                            alertDialog$Builder.k(L03, new u1() { // from class: org.telegram.ui.Components.pq0
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i17) {
                                    int i18 = i16;
                                    ArrayList arrayList3 = arrayList2;
                                    au0 au0Var2 = au0Var;
                                    switch (i18) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = au0Var2.x1;
                                            k2Var2.getMessagesController().O1().s(arrayList3, au0Var2.l1);
                                            cc.a0(k2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.dd.G(arrayList3.size(), "StoriesDeleted", new Object[0])).j();
                                            au0Var2.U(false);
                                            break;
                                        default:
                                            au0Var2.getClass();
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                au0Var2.x1.getMessagesController().i0(((Long) arrayList3.get(i19)).longValue(), 0, null);
                                            }
                                            au0Var2.U(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.h(dd.L0(2131752589, null), null);
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
                            s4.y(k2Var, user, L0, encryptedChat, null, au0Var.e1, null, au0Var.b1, null, 0, 0, null, new wp0(au0Var, 12), null, au0Var.H1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        int i17 = 26;
                        if (au0Var.A0() && vq0Var != null && vq0Var.getCurrentList() != null) {
                            q4 currentList = vq0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                                TL_stories.StoryItem storyItem = ((kj) sparseArrayArr[0].valueAt(i18)).l;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                                String L04 = dd.L0(arrayList3.size() > 1 ? 2131751561 : 2131751565, null);
                                x1 x1Var2 = alertDialog$Builder2.a;
                                x1Var2.R = L04;
                                x1Var2.T = dd.G(arrayList3.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(dd.L0(2131751599, null), new androidx.car.app.utils.a(au0Var, currentList, arrayList3, i17));
                                alertDialog$Builder2.h(dd.L0(2131752589, null), new au(25));
                                x1Var2.show();
                                x1Var2.i();
                                break;
                            }
                        } else {
                            final ArrayList arrayList4 = new ArrayList();
                            for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                                TL_stories.StoryItem storyItem2 = ((kj) sparseArrayArr[0].valueAt(i19)).l;
                                if (storyItem2 != null) {
                                    arrayList4.add(storyItem2);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                                String L05 = dd.L0(arrayList4.size() > 1 ? 2131751490 : 2131751488, null);
                                x1 x1Var3 = alertDialog$Builder3.a;
                                x1Var3.R = L05;
                                x1Var3.T = dd.G(arrayList4.size(), "DeleteStoriesSubtitle", new Object[0]);
                                alertDialog$Builder3.k(dd.L0(2131751599, null), new u1() { // from class: org.telegram.ui.Components.pq0
                                    @Override // org.telegram.ui.ActionBar.u1
                                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i172) {
                                        int i182 = i13;
                                        ArrayList arrayList32 = arrayList4;
                                        au0 au0Var2 = au0Var;
                                        switch (i182) {
                                            case 0:
                                                org.telegram.ui.ActionBar.k2 k2Var2 = au0Var2.x1;
                                                k2Var2.getMessagesController().O1().s(arrayList32, au0Var2.l1);
                                                cc.a0(k2Var2).Q(R.raw.ic_delete, 36, org.telegram.messenger.dd.G(arrayList32.size(), "StoriesDeleted", new Object[0])).j();
                                                au0Var2.U(false);
                                                break;
                                            default:
                                                au0Var2.getClass();
                                                for (int i192 = 0; i192 < arrayList32.size(); i192++) {
                                                    au0Var2.x1.getMessagesController().i0(((Long) arrayList32.get(i192)).longValue(), 0, null);
                                                }
                                                au0Var2.U(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.h(dd.L0(2131752589, null), new au(i17));
                                x1Var3.show();
                                x1Var3.i();
                                break;
                            }
                        }
                    }
                } else if (i14 == 100) {
                    if (au0Var.g1 != null) {
                        wp messagesController = k2Var.getMessagesController();
                        TLRPC.UserFull userFull = au0Var.g1;
                        messagesController.getClass();
                        if (wp.I2(userFull)) {
                            q30 q30Var = au0Var.G1;
                            if (q30Var != null) {
                                q30Var.setText(dd.L0(2131750536, null));
                                au0Var.G1.f(view, true);
                                break;
                            }
                        }
                    }
                    if (au0Var.f1 != null) {
                        TLRPC.Chat L06 = k2Var.getMessagesController().L0(Long.valueOf(au0Var.f1.id));
                        if (k2Var.getMessagesController().n2(L06)) {
                            q30 q30Var2 = au0Var.G1;
                            if (q30Var2 != null) {
                                q30Var2.setText((!w3.T(L06) || L06.megagroup) ? dd.L0(2131750537, null) : dd.L0(2131750538, null));
                                au0Var.G1.f(view, true);
                                break;
                            }
                        }
                    }
                    if (au0Var.t0()) {
                        q30 q30Var3 = au0Var.G1;
                        if (q30Var3 != null) {
                            q30Var3.setText(dd.L0(2131750539, "ForwardsRestrictedInfoBot"));
                            au0Var.G1.f(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        zx zxVar = new zx(bundle);
                        zxVar.C2 = new xp0(au0Var);
                        k2Var.presentFragment(zxVar);
                        break;
                    }
                } else if (i14 != 102) {
                    if (i14 == 103 || i14 == 104) {
                        if (au0Var.getClosestTab() != 8) {
                            hw F1 = k2Var.getMessagesController().F1();
                            ArrayList arrayList5 = F1.j;
                            ArrayList arrayList6 = new ArrayList();
                            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                long j12 = ((gw) arrayList5.get(i20)).a;
                                if (jt0Var.x.contains(Long.valueOf(j12))) {
                                    arrayList6.add(Long.valueOf(j12));
                                }
                            }
                            if (F1.n(arrayList6, i14 == 103, true)) {
                                int i21 = 0;
                                while (true) {
                                    ts0[] ts0VarArr = au0Var.m0;
                                    if (i21 < ts0VarArr.length) {
                                        ts0 ts0Var = ts0VarArr[i21];
                                        if (ts0Var.E == 11) {
                                            ts0Var.x.h1(0, 0);
                                        } else {
                                            i21++;
                                        }
                                    }
                                }
                            } else {
                                k2Var.showDialog(new q0(33, k2Var.getCurrentAccount(), au0Var.getContext(), k2Var, null));
                            }
                            au0Var.U(true);
                            break;
                        } else {
                            is0 is0Var = au0Var.e0;
                            if (is0Var != null && is0Var.s != null) {
                                ArrayList arrayList7 = new ArrayList();
                                for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                    arrayList7.add(Integer.valueOf(((kj) sparseArrayArr[0].valueAt(i22)).f1()));
                                }
                                au0Var.b1(arrayList7, i14 == 103);
                                au0Var.U(false);
                                break;
                            }
                        }
                    }
                } else if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                    kj kjVar = (kj) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                    Bundle bundle2 = new Bundle();
                    long B0 = kj.B0(kjVar.k);
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
                    bundle2.putInt("message_id", kjVar.f1());
                    bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                    un unVar = new un(bundle2);
                    unVar.b8 = kjVar.f1();
                    long j13 = au0Var.F;
                    if (j13 != 0) {
                        gg.e.a(unVar, hs.a(B0, j13));
                        bundle2.putInt("message_id", kjVar.f1());
                    }
                    k2Var.presentFragment(unVar, false);
                    break;
                }
                break;
            case 14:
                c61 c61Var = (c61) obj;
                int i23 = c61Var.b.i.q;
                if (i23 == 2) {
                    if (((ApplicationLoaderImpl) w0.a).q()) {
                        k1.e().b(false);
                    }
                    c61Var.updateAppUpdateViews(i14, true);
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
                            at.e().k(at.Q4, new Object[0]);
                        }
                    }
                    c61Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File g10 = w0.a.g();
                    if (g10 != null) {
                        org.telegram.messenger.i0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", c61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((f0) obj).b.x(i14, true);
                break;
            case 16:
                sd1 sd1Var = (sd1) obj;
                if (sd1Var.U == null && view.getAlpha() != 0.0f) {
                    sd1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                oy oyVar = (oy) obj;
                if (oyVar.n != null && i14 != oyVar.s) {
                    b51 b51Var = oyVar.r;
                    if (b51Var != null) {
                        b51Var.z = i14;
                    }
                    oyVar.b(i14, true);
                    oyVar.n.a(Integer.valueOf(i14));
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
                            iArr[i13] = uz.q().getInt(i0.a.i(i13, "keep_media_type_"), y2.b(i13));
                            i13++;
                        }
                    }
                    iArr[i24] = i14;
                    uz.q().edit().putInt("keep_media_type_" + i24, i14).apply();
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
                of0 of0Var = (of0) obj;
                ValueAnimator valueAnimator = of0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    gd1 gd1Var = of0Var.c;
                    if (!gd1Var.H) {
                        if (gd1Var.getCurrentPosition() == i14) {
                            Object c02 = of0Var.c0();
                            if (c02 instanceof nf0) {
                                ((nf0) c02).w();
                                break;
                            }
                        } else {
                            of0Var.s0(i14, true);
                            of0Var.c.E(i14);
                            break;
                        }
                    }
                }
                break;
            case 21:
                jl0 jl0Var = (jl0) obj;
                jk0 jk0Var = jl0Var.D1;
                jl0Var.S0 = i14;
                if (i14 == 1) {
                    jl0Var.i0 = jl0Var.g0;
                } else if (i14 == 4) {
                    jl0Var.i0 = jl0Var.h0;
                } else if (i14 == 2) {
                    jl0Var.i0 = jl0Var.e0;
                } else if (i14 == 3) {
                    jl0Var.i0 = jl0Var.f0;
                } else {
                    jl0Var.i0 = jl0Var.d0;
                }
                qw qwVar = (qw) view.getTag();
                PhotoViewer.v1().N2(null, jl0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(jl0Var.j1);
                    PhotoViewer.v1().f2(arrayList8, 0, jk0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(jl0Var.l1);
                    PhotoViewer.v1().f2(arrayList9, 0, jk0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(jl0Var.m1);
                    PhotoViewer.v1().f2(arrayList10, 0, jk0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList11 = jl0Var.i1;
                    v12.f2(arrayList11, arrayList11.indexOf(qwVar), jk0Var);
                    break;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList12 = jl0Var.k1;
                    v13.f2(arrayList12, arrayList12.indexOf(qwVar), jk0Var);
                    break;
                }
            case 22:
                wn0 wn0Var = (wn0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = wn0Var.I;
                if (k1Var != null && k1Var.isShowing()) {
                    wn0Var.I.d(true);
                }
                if (i14 == 0) {
                    s4.K(wn0Var.getParentActivity(), wn0Var.F.a(), new sn0(wn0Var, i12));
                    break;
                } else {
                    wn0Var.a0(wn0Var.b, wn0Var.c, true, 0);
                    wn0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                jo0 jo0Var = (jo0) obj;
                org.telegram.ui.ActionBar.k1 k1Var2 = jo0Var.m0;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    jo0Var.m0.d(true);
                }
                if (i14 == 0) {
                    s4.K(jo0Var.getParentActivity(), jo0Var.U.a(), new ao0(jo0Var, r10 ? 1 : 0));
                    break;
                } else {
                    jo0Var.j0(0, true);
                    break;
                }
                break;
            case 24:
                kj kjVar2 = (kj) obj;
                int i25 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.i0.g3(new sk(rz.C(i14), kj.B0(kjVar2.k), kjVar2.f1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i14 == 0) {
                    hx0 hx0Var = profileActivity.N;
                    if (!hx0Var.E1) {
                        if (au0.G0(hx0Var.getClosestTab())) {
                            hx0 hx0Var2 = profileActivity.N;
                            profileActivity.N.W0(profileActivity, profileActivity.a(), hx0Var2.s1(hx0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().T4()) {
                            profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                            o8 D = o8.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new gx0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new i1((org.telegram.ui.ActionBar.k2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!au0.G0(profileActivity.N.getClosestTab())) {
                    long e7 = profileActivity.getUserConfig().e();
                    o oVar = profileActivity.x5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.x5 = null;
                    }
                    wb.e();
                    boolean z15 = profileActivity.N.getClosestTab() == 9;
                    ArrayList arrayList13 = new ArrayList();
                    SparseArray<kj> actionModeSelected = profileActivity.N.getActionModeSelected();
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
                    profileActivity.N.U(false);
                    if (z15) {
                        profileActivity.N.g1(8);
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
                        (z16 ? cc.a0(profileActivity).L(R.raw.contact_check, dd.G(i10, "StorySavedTitle", new Object[0]), dd.L0(2131744510, null), dd.L0(2131743910, null), gVar).j() : cc.a0(profileActivity).J(R.raw.chats_archived, dd.G(i10, "StoryArchived", new Object[0]), dd.L0(2131743910, null), 5000, false, gVar).j()).v = new hr0(16, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    hx0 hx0Var3 = profileActivity.N;
                    int s12 = hx0Var3.s1(hx0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().O1().w(s12, a2);
                    o oVar2 = profileActivity.x5;
                    if (oVar2 != null) {
                        oVar2.run();
                        profileActivity.x5 = null;
                    }
                    wb.e();
                    ArrayList arrayList14 = new ArrayList();
                    SparseArray<kj> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i28 = 0; i28 < actionModeSelected2.size(); i28++) {
                            TL_stories.StoryItem storyItem5 = actionModeSelected2.valueAt(i28).l;
                            if (storyItem5 != null) {
                                arrayList14.add(storyItem5);
                            }
                        }
                    }
                    profileActivity.N.U(false);
                    if (!arrayList14.isEmpty()) {
                        z zVar = new z(profileActivity, a2, s12, arrayList14);
                        profileActivity.getMessagesController().O1().f0(s12, a2, arrayList14);
                        cc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.i0.W2(dd.G(arrayList14.size(), "StoryRemovedFromAlbumTitle", w9)), dd.L0(2131743910, null), zVar).j();
                        break;
                    }
                }
                break;
            case 26:
                s61 s61Var = (s61) obj;
                s61Var.h0.E(i14);
                s61Var.p0(i14, true);
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
                    if ((rVar.m(i29) != null || Math.abs(i29 - L08) <= g0Var.r * 9) && uz.c()) {
                        qh.i iVar = new qh.i(g0Var.getContext());
                        iVar.a = ((qh.o) arrayList15.get(i14)).d;
                        rVar.w0(iVar);
                        break;
                    } else {
                        g0Var.c.C0();
                        wj0 wj0Var = g0Var.f;
                        wj0Var.b = L08 < i29 ? 0 : 1;
                        wj0Var.d(i29, 0, false, false);
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
