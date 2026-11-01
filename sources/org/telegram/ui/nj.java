package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ un b;

    public nj(un unVar, Context context) {
        this.b = unVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User Z1;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.u11 u11Var;
        un unVar = this.b;
        SparseArray[] sparseArrayArr = unVar.o6;
        SparseArray[] sparseArrayArr2 = unVar.n6;
        SparseArray[] sparseArrayArr3 = unVar.m6;
        if (i10 != -2 && i10 != 75 && i10 != -1 && (u11Var = unVar.m0) != null && u11Var.y > 0.0f) {
            u11Var.c();
        }
        final int i19 = 0;
        if (i10 == -1) {
            if (unVar.Tc.f) {
                unVar.Na();
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (lVar.u()) {
                unVar.L7(false);
                return;
            }
            if (unVar.f4 == 5 && (unVar.K6.isEmpty() || unVar.r4 == 0)) {
                unVar.oc();
            } else if (unVar.f4 == 6 && unVar.Z.s()) {
                unVar.Ub(new Runnable(this) { // from class: org.telegram.ui.kj
                    public final /* synthetic */ nj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                nj njVar = this.b;
                                njVar.getClass();
                                un unVar2 = njVar.b;
                                Intent intent = new Intent(unVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", unVar2.d4.link);
                                unVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!unVar.j7(true, true)) {
                unVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (unVar.getUserConfig().e() == unVar.j6) {
                    unVar.getMessagesController().K4(true);
                    unVar.o1.e(false, true);
                    return;
                }
                org.telegram.messenger.y00 y00Var = unVar.getMessagesController().r7;
                long j12 = -unVar.j6;
                y00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = y00Var.getMessagesController().g1(j12);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                y00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.v1(y00Var, 7));
                nb1.M0(unVar);
                return;
            }
            org.telegram.messenger.kj kjVar = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j13 = 0;
                for (int i20 = 1; i20 >= 0; i20--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < sparseArrayArr2[i20].size(); i21++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                    }
                    if (unVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) sparseArrayArr2[i20].get(((Integer) arrayList.get(i22)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) un.U8(j13, kjVar2, arrayList.size() != 1 && ((user2 = unVar.f) == null || !user2.self)));
                        j13 = kjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.i0.g(spannableStringBuilder);
                    unVar.c8();
                    unVar.M3.j(58, 0L, null);
                }
                unVar.L7(false);
                return;
            }
            int i23 = 12;
            if (i10 != 12) {
                if (i10 == 11) {
                    unVar.wa(true);
                    return;
                }
                if (i10 == 69) {
                    un.I1(unVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j14 = unVar.j6;
                        if (org.telegram.messenger.w3.p0(unVar.e)) {
                            i18 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                            if (org.telegram.messenger.w3.A(i18, unVar.e, 24)) {
                                j14 = unVar.r4;
                                j11 = unVar.j6;
                                long j15 = j14;
                                i17 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                                rh.e6.y(i17, false).g0(j15, j11, false, false);
                                return;
                            }
                        }
                        j11 = 0;
                        long j152 = j14;
                        i17 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        rh.e6.y(i17, false).g0(j152, j11, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j16 = unVar.j6;
                        if (org.telegram.messenger.w3.p0(unVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                            if (org.telegram.messenger.w3.A(i16, unVar.e, 24)) {
                                j16 = unVar.r4;
                                j10 = unVar.j6;
                                long j17 = j16;
                                i15 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                                rh.e6.y(i15, false).C(j17, j10, new mg(this, j17, j10, 1));
                                return;
                            }
                        }
                        j10 = 0;
                        long j172 = j16;
                        i15 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        rh.e6.y(i15, false).C(j172, j10, new mg(this, j172, j10, 1));
                        return;
                    }
                    if (i10 == 28) {
                        if (unVar.xb == null) {
                            un.N1(unVar);
                            return;
                        } else {
                            unVar.C9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i24 = 1; i24 >= 0; i24--) {
                            for (int i25 = 0; i25 < sparseArrayArr3[i24].size(); i25++) {
                                arrayList2.add((org.telegram.messenger.kj) sparseArrayArr3[i24].valueAt(i25));
                            }
                            sparseArrayArr3[i24].clear();
                            sparseArrayArr2[i24].clear();
                            sparseArrayArr[i24].clear();
                        }
                        boolean z10 = unVar.v6 > 0;
                        unVar.u9();
                        unVar.Xc(0, true);
                        unVar.xd(false);
                        MediaController.g0(unVar.getParentActivity(), unVar.getAccountInstance(), arrayList2, new lj(i19, this, z10));
                        return;
                    }
                    if (i10 == 13) {
                        if (unVar.getParentActivity() == null) {
                            return;
                        }
                        unVar.showDialog(org.telegram.ui.Components.s4.U(unVar.getParentActivity(), unVar.h, unVar.xa).a);
                        return;
                    }
                    int i26 = 14;
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (unVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && org.telegram.messenger.w3.p0(unVar.e)) {
                            if (unVar.r4 == 0 || (Z1 = unVar.getMessagesController().Z1(Long.valueOf(unVar.r4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.s4.q(unVar, -1, Z1, unVar.e, true, new ng.d(i26, this, Z1), unVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = unVar.p8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (unVar.h != null || (((user = unVar.f) == null || org.telegram.messenger.i20.B(user) || org.telegram.messenger.i20.x(unVar.f)) && ((chatFull = unVar.p8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.s4.r(unVar, i10 == i11, unVar.e, unVar.f, unVar.h == null ? 0 : 1, true, false, z11, new i2.q(this, i10, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.s4.q(unVar, -1, unVar.f, unVar.e, z12, new mj(this, z12), unVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 17) {
                        if (unVar.f == null || unVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = unVar.Z1;
                        if (textView != null && textView.getTag() != null) {
                            unVar.Pb(((Integer) unVar.Z1.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", unVar.f.id);
                        bundle.putBoolean("addContact", true);
                        unVar.presentFragment(new ns(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        unVar.zc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            org.telegram.messenger.vi mediaDataController = unVar.getMediaDataController();
                            long j18 = unVar.f.id;
                            Pattern pattern = org.telegram.messenger.vi.R1;
                            mediaDataController.y0(j18, 0, null);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!org.telegram.messenger.w3.N(unVar.e)) {
                            unVar.getNotificationCenter().k(org.telegram.messenger.at.n3, Long.valueOf(unVar.j6));
                            return;
                        }
                        t5 t5Var = new t5(unVar.j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = unVar.R1;
                        t5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new k5(t5Var, 0));
                        }
                        unVar.presentFragment(t5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i27 = b01.s1;
                        int currentAccount = unVar.getCurrentAccount();
                        Activity parentActivity = unVar.getParentActivity();
                        long a2 = unVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        b01.J0(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) sparseArrayArr[i28].valueAt(i29);
                                unVar.getMediaDataController().d(2, kjVar3, kjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !unVar.p6);
                            }
                        }
                        unVar.L7(false);
                        return;
                    }
                    int i30 = 23;
                    if (i10 == 23) {
                        for (int i31 = 1; i31 >= 0; i31--) {
                            if (kjVar == null && sparseArrayArr3[i31].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i32 = 0; i32 < sparseArrayArr3[i31].size(); i32++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i31].keyAt(i32)));
                                }
                                kjVar = (org.telegram.messenger.kj) unVar.E6[i31].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i31].clear();
                            sparseArrayArr2[i31].clear();
                            sparseArrayArr[i31].clear();
                        }
                        if (kjVar == null || !kjVar.D4()) {
                            unVar.vc(kjVar, false);
                        } else {
                            unVar.t5 = kjVar;
                            unVar.Va(org.telegram.messenger.at.u1);
                        }
                        unVar.u9();
                        unVar.Xc(0, true);
                        unVar.xd(false);
                        return;
                    }
                    if (i10 == 64) {
                        i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        ag.h3 c10 = ag.i3.f(i13).c(unVar.Y8());
                        Activity parentActivity2 = unVar.getParentActivity();
                        i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        ag.z2.i0(parentActivity2, i14, unVar.e4, c10, unVar.getResourceProvider(), new ag.e0(i30, this, c10));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.a, unVar.getResourceProvider(), true, true);
                        b1Var.j(org.telegram.messenger.dd.L0(2131753953, null), R.drawable.input_attach, null);
                        b1Var.setOnClickListener(new a(this, i23));
                        org.telegram.ui.ActionBar.t0 t0Var = unVar.i0;
                        org.telegram.ui.ActionBar.x xVar = unVar.f0;
                        xVar.a();
                        t0Var.U(b1Var, xVar.m);
                        return;
                    }
                    if (i10 == 30) {
                        unVar.getSendMessagesHelper().r0(org.telegram.messenger.pz.b("/help", unVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        unVar.getSendMessagesHelper().r0(org.telegram.messenger.pz.b("/settings", unVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        unVar.Ga(unVar.X9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        unVar.getMessagesController().t7.J(unVar.a(), false, true);
                        if (unVar.getMessagesController().t7.K(unVar.a(), true)) {
                            return;
                        }
                        unVar.qd(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (unVar.f == null || unVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user3 = unVar.f;
                        boolean z13 = i10 == 33;
                        TLRPC.UserFull userFull = unVar.q8;
                        org.telegram.ui.Components.voip.n1.m(user3, z13, userFull != null && userFull.video_calls_available, unVar.getParentActivity(), unVar.getMessagesController().a2(unVar.f.id), unVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 27) {
                        unVar.Vb();
                        return;
                    }
                    if (i10 == 60) {
                        if (unVar.q4 == null) {
                            return;
                        }
                        org.telegram.messenger.y00 y00Var2 = unVar.getMessagesController().r7;
                        long j19 = unVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = unVar.q4;
                        int i33 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        y00Var2.z(i33, j19, true);
                        unVar.rd();
                        unVar.Gc(false);
                        unVar.qd(true);
                        return;
                    }
                    if (i10 == 61) {
                        nb1.M0(unVar);
                        return;
                    }
                    if (i10 == 65) {
                        org.telegram.messenger.i0.g(unVar.d4.link);
                        org.telegram.ui.Components.cc.a0(LaunchActivity.Q()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.kj
                            public final /* synthetic */ nj b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        nj njVar = this.b;
                                        njVar.getClass();
                                        un unVar2 = njVar.b;
                                        Intent intent = new Intent(unVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", unVar2.d4.link);
                                        unVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (unVar.Z.s()) {
                            unVar.Ub(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        Activity parentActivity3 = unVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = unVar.d4;
                        p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                        ag.i0.g0(parentActivity3, i12, tL_businessChatLink, p6Var);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.getResourceProvider());
                        String L0 = org.telegram.messenger.dd.L0(2131752707, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new y0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        unVar.showDialog(x1Var);
                        TextView textView2 = (TextView) x1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, unVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i10 == 75) {
                        if (!unVar.Z9() || unVar.v8() == null) {
                            return;
                        }
                        org.telegram.messenger.i0.v1(unVar.l1);
                        unVar.m0.requestLayout();
                        org.telegram.ui.Components.u11 u11Var2 = unVar.m0;
                        u11Var2.g();
                        u11Var2.a(1.0f, 0.0f);
                        return;
                    }
                    if (i10 == 73) {
                        ja1 f02 = ja1.f0(-unVar.j6, 0L);
                        f02.D = unVar;
                        unVar.presentFragment(f02);
                        return;
                    } else if (i10 == 888) {
                        unVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = h4.c1;
                            org.telegram.ui.Components.cc.a0(unVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    unVar.presentFragment(un.ma(-chat.linked_monoforum_id));
                }
            } else if (unVar.getParentActivity() != null) {
                unVar.R7(null, null, false);
            }
        }
    }
}
