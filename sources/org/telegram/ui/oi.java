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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wm b;

    public oi(wm wmVar, Context context) {
        this.b = wmVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        int i13;
        long j10;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.n01 n01Var;
        wm wmVar = this.b;
        SparseArray[] sparseArrayArr = wmVar.p6;
        SparseArray[] sparseArrayArr2 = wmVar.o6;
        SparseArray[] sparseArrayArr3 = wmVar.n6;
        if (i3 != -2 && i3 != 75 && i3 != -1 && (n01Var = wmVar.n0) != null && n01Var.y > 0.0f) {
            n01Var.c();
        }
        final int i18 = 0;
        if (i3 == -1) {
            if (wmVar.bd.f) {
                wmVar.Sa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (kVar.v()) {
                wmVar.N7(false);
                return;
            }
            if (wmVar.g4 == 5 && (wmVar.L6.isEmpty() || wmVar.s4 == 0)) {
                wmVar.tc();
            } else if (wmVar.g4 == 6 && wmVar.a0.t()) {
                wmVar.Zb(new Runnable(this) { // from class: org.telegram.ui.li
                    public final /* synthetic */ oi b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                oi oiVar = this.b;
                                oiVar.getClass();
                                wm wmVar2 = oiVar.b;
                                Intent intent = new Intent(wmVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", wmVar2.e4.link);
                                wmVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!wmVar.l7(true, true)) {
                wmVar.finishFragment();
            }
        } else {
            if (i3 == 59) {
                if (wmVar.getUserConfig().e() == wmVar.k6) {
                    wmVar.getMessagesController().N4(true);
                    wmVar.p1.e(false, true);
                    return;
                }
                org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().q7;
                long j12 = -wmVar.k6;
                c00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = c00Var.getMessagesController().h1(j12);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                c00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(c00Var, 7));
                m91.M0(wmVar);
                return;
            }
            org.telegram.messenger.zi ziVar = null;
            if (i3 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j13 = 0;
                for (int i19 = 1; i19 >= 0; i19--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = 0; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (wmVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) wm.X8(j13, ziVar2, arrayList.size() != 1 && ((user2 = wmVar.f) == null || !user2.self)));
                        j13 = ziVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    wmVar.f8();
                    wmVar.N3.j(58, 0L, null);
                }
                wmVar.N7(false);
                return;
            }
            int i22 = 12;
            if (i3 != 12) {
                if (i3 == 11) {
                    wmVar.Ba(true);
                    return;
                }
                if (i3 == 69) {
                    wm.I1(wmVar);
                    return;
                }
                if (i3 != 70) {
                    int i23 = 24;
                    if (i3 == 72) {
                        long j14 = wmVar.k6;
                        if (org.telegram.messenger.t3.p0(wmVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i17, wmVar.e, 24)) {
                                j14 = wmVar.s4;
                                j11 = wmVar.k6;
                                long j15 = j14;
                                i16 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                                ci.e9.y(i16, false).g0(j15, j11, false, false);
                                return;
                            }
                        }
                        j11 = 0;
                        long j152 = j14;
                        i16 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        ci.e9.y(i16, false).g0(j152, j11, false, false);
                        return;
                    }
                    if (i3 == 71) {
                        long j16 = wmVar.k6;
                        if (org.telegram.messenger.t3.p0(wmVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i15, wmVar.e, 24)) {
                                j16 = wmVar.s4;
                                j10 = wmVar.k6;
                                long j17 = j16;
                                i14 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                                ci.e9.y(i14, false).C(j17, j10, new ci.v4(this, j17, j10, 2));
                                return;
                            }
                        }
                        j10 = 0;
                        long j172 = j16;
                        i14 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        ci.e9.y(i14, false).C(j172, j10, new ci.v4(this, j172, j10, 2));
                        return;
                    }
                    if (i3 == 28) {
                        if (wmVar.yb == null) {
                            wm.N1(wmVar);
                            return;
                        } else {
                            wmVar.H9();
                            return;
                        }
                    }
                    if (i3 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i24 = 1; i24 >= 0; i24--) {
                            for (int i25 = 0; i25 < sparseArrayArr3[i24].size(); i25++) {
                                arrayList2.add((org.telegram.messenger.zi) sparseArrayArr3[i24].valueAt(i25));
                            }
                            sparseArrayArr3[i24].clear();
                            sparseArrayArr2[i24].clear();
                            sparseArrayArr[i24].clear();
                        }
                        boolean z10 = wmVar.w6 > 0;
                        wmVar.z9();
                        wmVar.cd(0, true);
                        wmVar.Cd(false);
                        MediaController.g0(wmVar.getParentActivity(), wmVar.getAccountInstance(), arrayList2, new mi(i18, this, z10));
                        return;
                    }
                    if (i3 == 13) {
                        if (wmVar.getParentActivity() == null) {
                            return;
                        }
                        wmVar.showDialog(org.telegram.ui.Components.t4.U(wmVar.getParentActivity(), wmVar.h, wmVar.ya).a);
                        return;
                    }
                    if (i3 == 15 || i3 == 16 || i3 == 26) {
                        if (wmVar.getParentActivity() == null) {
                            return;
                        }
                        if (i3 == 15 && org.telegram.messenger.t3.p0(wmVar.e)) {
                            if (wmVar.s4 == 0 || (a22 = wmVar.getMessagesController().a2(Long.valueOf(wmVar.s4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.t4.q(wmVar, -1, a22, wmVar.e, true, new mi.d4(i23, this, a22), wmVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = wmVar.q8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i3 != 26) {
                            if (i3 == 15) {
                                i10 = (wmVar.h != null || (((user = wmVar.f) == null || org.telegram.messenger.l10.B(user) || org.telegram.messenger.l10.x(wmVar.f)) && ((chatFull = wmVar.q8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.t4.r(wmVar, i3 == i10, wmVar.e, wmVar.f, wmVar.h == null ? 0 : 1, true, false, z11, new k2.q(this, i3, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.t4.q(wmVar, -1, wmVar.f, wmVar.e, z12, new ni(this, z12), wmVar.getResourceProvider());
                        return;
                    }
                    if (i3 == 17) {
                        if (wmVar.f == null || wmVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = wmVar.a2;
                        if (textView != null && textView.getTag() != null) {
                            wmVar.Ub(((Integer) wmVar.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wmVar.f.id);
                        bundle.putBoolean("addContact", true);
                        wmVar.presentFragment(new lr(bundle));
                        return;
                    }
                    if (i3 == 18) {
                        wmVar.Ec(false);
                        return;
                    }
                    if (i3 == 24) {
                        try {
                            org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
                            long j18 = wmVar.f.id;
                            Pattern pattern = org.telegram.messenger.li.S1;
                            mediaDataController.y0(j18, 0, null);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    if (i3 == 29) {
                        if (!org.telegram.messenger.t3.N(wmVar.e)) {
                            wmVar.getNotificationCenter().k(org.telegram.messenger.hs.n3, Long.valueOf(wmVar.k6));
                            return;
                        }
                        v5 v5Var = new v5(wmVar.k6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wmVar.S1;
                        v5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().G0().b(v5Var.S, v5Var.U, new n5(v5Var, 0));
                        }
                        wmVar.presentFragment(v5Var);
                        return;
                    }
                    if (i3 == 21) {
                        int i26 = ey0.t1;
                        int currentAccount = wmVar.getCurrentAccount();
                        Activity parentActivity = wmVar.getParentActivity();
                        long a10 = wmVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        ey0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i3 == 22) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            for (int i28 = 0; i28 < sparseArrayArr[i27].size(); i28++) {
                                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) sparseArrayArr[i27].valueAt(i28);
                                wmVar.getMediaDataController().d(2, ziVar3, ziVar3.F0(), (int) (System.currentTimeMillis() / 1000), !wmVar.q6);
                            }
                        }
                        wmVar.N7(false);
                        return;
                    }
                    if (i3 == 23) {
                        for (int i29 = 1; i29 >= 0; i29--) {
                            if (ziVar == null && sparseArrayArr3[i29].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i30 = 0; i30 < sparseArrayArr3[i29].size(); i30++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i29].keyAt(i30)));
                                }
                                ziVar = (org.telegram.messenger.zi) wmVar.F6[i29].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i29].clear();
                            sparseArrayArr2[i29].clear();
                            sparseArrayArr[i29].clear();
                        }
                        if (ziVar == null || !ziVar.E4()) {
                            wmVar.Ac(ziVar, false);
                        } else {
                            wmVar.u5 = ziVar;
                            wmVar.ab(org.telegram.messenger.hs.u1);
                        }
                        wmVar.z9();
                        wmVar.cd(0, true);
                        wmVar.Cd(false);
                        return;
                    }
                    if (i3 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        lg.t1 c2 = lg.u1.f(i12).c(wmVar.b9());
                        Activity parentActivity2 = wmVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        lg.r1.i0(parentActivity2, i13, wmVar.f4, c2, wmVar.getResourceProvider(), new mi.f(20, this, c2));
                        return;
                    }
                    if (i3 == 14) {
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.a, wmVar.getResourceProvider(), true, true);
                        y0Var.j(org.telegram.messenger.bd.M0(2131753953, null), R.drawable.input_attach, null);
                        y0Var.setOnClickListener(new a(this, i22));
                        org.telegram.ui.ActionBar.q0 q0Var = wmVar.j0;
                        org.telegram.ui.ActionBar.w wVar = wmVar.g0;
                        wVar.a();
                        q0Var.U(y0Var, wVar.m);
                        return;
                    }
                    if (i3 == 30) {
                        wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/help", wmVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i3 == 31) {
                        wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/settings", wmVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i3 == 40) {
                        wmVar.La(wmVar.ca() ? "" : null);
                        return;
                    }
                    if (i3 == 62) {
                        wmVar.getMessagesController().s7.J(wmVar.a(), false, true);
                        if (wmVar.getMessagesController().s7.K(wmVar.a(), true)) {
                            return;
                        }
                        wmVar.vd(true);
                        return;
                    }
                    if (i3 == 32 || i3 == 33) {
                        if (wmVar.f == null || wmVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user3 = wmVar.f;
                        boolean z13 = i3 == 33;
                        TLRPC.UserFull userFull = wmVar.r8;
                        org.telegram.ui.Components.voip.n1.m(user3, z13, userFull != null && userFull.video_calls_available, wmVar.getParentActivity(), wmVar.getMessagesController().b2(wmVar.f.id), wmVar.getAccountInstance());
                        return;
                    }
                    if (i3 == 27) {
                        wmVar.ac();
                        return;
                    }
                    if (i3 == 60) {
                        if (wmVar.r4 == null) {
                            return;
                        }
                        org.telegram.messenger.c00 c00Var2 = wmVar.getMessagesController().q7;
                        long j19 = wmVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = wmVar.r4;
                        int i31 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        c00Var2.z(i31, j19, true);
                        wmVar.wd();
                        wmVar.Lc(false);
                        wmVar.vd(true);
                        return;
                    }
                    if (i3 == 61) {
                        m91.M0(wmVar);
                        return;
                    }
                    if (i3 == 65) {
                        org.telegram.messenger.g0.g(wmVar.e4.link);
                        org.telegram.ui.Components.fc.a0(LaunchActivity.Q()).k(false).j();
                        return;
                    }
                    if (i3 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.li
                            public final /* synthetic */ oi b;

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
                                        oi oiVar = this.b;
                                        oiVar.getClass();
                                        wm wmVar2 = oiVar.b;
                                        Intent intent = new Intent(wmVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wmVar2.e4.link);
                                        wmVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (wmVar.a0.t()) {
                            wmVar.Zb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i3 == 67) {
                        Activity parentActivity3 = wmVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wmVar.e4;
                        e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                        lg.v.g0(parentActivity3, i11, tL_businessChatLink, e6Var);
                        return;
                    }
                    if (i3 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.getResourceProvider());
                        String M0 = org.telegram.messenger.bd.M0(2131752707, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new x0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        wmVar.showDialog(s1Var);
                        TextView textView2 = (TextView) s1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, wmVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i3 == 75) {
                        if (!wmVar.ea() || wmVar.y8() == null) {
                            return;
                        }
                        org.telegram.messenger.g0.v1(wmVar.m1);
                        wmVar.n0.requestLayout();
                        org.telegram.ui.Components.n01 n01Var2 = wmVar.n0;
                        n01Var2.g();
                        n01Var2.a(1.0f, 0.0f);
                        return;
                    }
                    if (i3 == 73) {
                        l81 f02 = l81.f0(-wmVar.k6, 0L);
                        f02.E = wmVar;
                        wmVar.presentFragment(f02);
                        return;
                    } else if (i3 == 888) {
                        wmVar.dumpCanvas();
                        return;
                    } else {
                        if (i3 == 889) {
                            HashSet hashSet = i4.d1;
                            org.telegram.ui.Components.fc.a0(wmVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = wmVar.e;
                if (chat != null) {
                    wmVar.presentFragment(wm.ra(-chat.linked_monoforum_id));
                }
            } else if (wmVar.getParentActivity() != null) {
                wmVar.U7(null, null, false);
            }
        }
    }
}
