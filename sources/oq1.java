// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oq1 extends d6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zu1 b;

    public oq1(zu1 zu1Var, Context context) {
        this.b = zu1Var;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d6
    public final void b(int i) {
        int i2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User X1;
        int i3;
        vnb vnbVar;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        long j2;
        int i8;
        int i9;
        TLRPC.User user2;
        a aVar;
        n0c n0cVar;
        zu1 zu1Var = this.b;
        SparseArray[] sparseArrayArr = zu1Var.q6;
        SparseArray[] sparseArrayArr2 = zu1Var.p6;
        SparseArray[] sparseArrayArr3 = zu1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (n0cVar = zu1Var.n0) != null && n0cVar.y > 0.0f) {
            n0cVar.d();
        }
        final byte b = 0;
        if (i == -1) {
            if (zu1Var.sd.f) {
                zu1Var.Ka();
                return;
            }
            aVar = ((e) zu1Var).actionBar;
            if (aVar.z()) {
                zu1Var.L5(false);
                return;
            }
            if (zu1Var.g4 == 5 && (zu1Var.M6.isEmpty() || zu1Var.s4 == 0)) {
                zu1Var.tc();
                return;
            }
            if (zu1Var.g4 == 6 && zu1Var.a0.B()) {
                zu1Var.Xb(new Runnable(this) { // from class: lq1
                    public final /* synthetic */ oq1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        oq1 oq1Var = this.b;
                        switch (b2) {
                            case 0:
                                oq1Var.b.finishFragment();
                                break;
                            default:
                                zu1 zu1Var2 = oq1Var.b;
                                Intent intent = new Intent(zu1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", zu1Var2.e4.link);
                                zu1Var2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
                return;
            } else {
                if (zu1Var.j5(true, true)) {
                    return;
                }
                zu1Var.finishFragment();
                return;
            }
        }
        byte b2 = 15;
        if (i == 59) {
            if (zu1Var.getUserConfig().e() == zu1Var.l6) {
                zu1Var.getMessagesController().b5(true);
                zu1Var.p1.e(false, true);
                return;
            }
            qyb qybVar = zu1Var.getMessagesController().h4;
            long j3 = -zu1Var.l6;
            qybVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = qybVar.getMessagesController().h1(j3);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            qybVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new yp9(qybVar, b2));
            tzb.M0(zu1Var);
            return;
        }
        r47 r47Var = null;
        if (i == 10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long j4 = 0;
            for (int i10 = 1; i10 >= 0; i10--) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArrayArr2[i10].size(); i11++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr2[i10].keyAt(i11)));
                }
                if (zu1Var.h == null) {
                    Collections.sort(arrayList);
                } else {
                    Collections.sort(arrayList, Collections.reverseOrder());
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    r47 r47Var2 = (r47) sparseArrayArr2[i10].get(((Integer) arrayList.get(i12)).intValue());
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    spannableStringBuilder.append((CharSequence) zu1.Y6(j4, r47Var2, arrayList.size() != 1 && ((user2 = zu1Var.f) == null || !user2.self)));
                    j4 = r47Var2.Z0();
                }
            }
            if (spannableStringBuilder.length() != 0) {
                hl.g(spannableStringBuilder);
                zu1Var.i6();
                zu1Var.N3.j(58, 0L, null);
            }
            zu1Var.L5(false);
            return;
        }
        if (i == 12) {
            if (zu1Var.getParentActivity() != null) {
                zu1Var.T5(null, null, false);
                return;
            }
            return;
        }
        if (i == 11) {
            zu1Var.ra(true);
            return;
        }
        if (i == 69) {
            zu1Var.Rb();
            return;
        }
        if (i == 70) {
            TLRPC.Chat chat = zu1Var.e;
            if (chat != null) {
                zu1Var.presentFragment(zu1.ha(-chat.linked_monoforum_id));
                return;
            }
            return;
        }
        byte b3 = 24;
        if (i == 72) {
            long j5 = zu1Var.l6;
            if (xc2.p0(zu1Var.e)) {
                i9 = ((e) zu1Var).currentAccount;
                if (xc2.A(i9, zu1Var.e, 24)) {
                    j5 = zu1Var.s4;
                    j2 = zu1Var.l6;
                    long j6 = j5;
                    i8 = ((e) zu1Var).currentAccount;
                    jxa.v(i8, false).h0(j6, j2, false, false);
                    return;
                }
            }
            j2 = 0;
            long j62 = j5;
            i8 = ((e) zu1Var).currentAccount;
            jxa.v(i8, false).h0(j62, j2, false, false);
            return;
        }
        if (i == 71) {
            long j7 = zu1Var.l6;
            if (xc2.p0(zu1Var.e)) {
                i7 = ((e) zu1Var).currentAccount;
                if (xc2.A(i7, zu1Var.e, 24)) {
                    j7 = zu1Var.s4;
                    j = zu1Var.l6;
                    long j8 = j7;
                    i6 = ((e) zu1Var).currentAccount;
                    jxa.v(i6, false).z(j8, j, new sm1(this, j8, j, (byte) 1));
                    return;
                }
            }
            j = 0;
            long j82 = j7;
            i6 = ((e) zu1Var).currentAccount;
            jxa.v(i6, false).z(j82, j, new sm1(this, j82, j, (byte) 1));
            return;
        }
        if (i == 28) {
            if (zu1Var.Mb == null) {
                zu1Var.xc();
                return;
            } else {
                zu1Var.K7();
                return;
            }
        }
        if (i == 25) {
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 1; i13 >= 0; i13--) {
                for (int i14 = 0; i14 < sparseArrayArr3[i13].size(); i14++) {
                    arrayList2.add((r47) sparseArrayArr3[i13].valueAt(i14));
                }
                sparseArrayArr3[i13].clear();
                sparseArrayArr2[i13].clear();
                sparseArrayArr[i13].clear();
            }
            boolean z = zu1Var.x6 > 0;
            zu1Var.C7();
            zu1Var.gd(0, true);
            zu1Var.Gd(false);
            MediaController.i0(zu1Var.getParentActivity(), zu1Var.getAccountInstance(), arrayList2, new mq1(b, this, z));
            return;
        }
        if (i == 13) {
            if (zu1Var.getParentActivity() != null) {
                zu1Var.showDialog(jj.S(zu1Var.getParentActivity(), zu1Var.h, zu1Var.Ba).a);
                return;
            }
            return;
        }
        if (i == 15 || i == 16 || i == 26) {
            if (zu1Var.getParentActivity() != null) {
                if (i == 15 && xc2.p0(zu1Var.e)) {
                    if (zu1Var.s4 == 0 || (X1 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.s4))) == null) {
                        return;
                    }
                    jj.q(zu1Var, -1, X1, zu1Var.e, true, new h01(this, X1, (byte) 17), zu1Var.getResourceProvider());
                    return;
                }
                TLRPC.ChatFull chatFull2 = zu1Var.r8;
                boolean z2 = chatFull2 != null && chatFull2.can_delete_channel;
                if (i != 26) {
                    if (i == 15) {
                        i2 = (zu1Var.h != null || (((user = zu1Var.f) == null || lbc.D(user) || lbc.z(zu1Var.f)) && ((chatFull = zu1Var.r8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                    }
                    jj.r(zu1Var, i == i2, zu1Var.e, zu1Var.f, zu1Var.h == null ? (byte) 0 : (byte) 1, true, false, z2, new wg(this, i, z2));
                    return;
                }
                boolean z3 = z2;
                jj.q(zu1Var, -1, zu1Var.f, zu1Var.e, z3, new nq1(this, z3), zu1Var.getResourceProvider());
                return;
            }
            return;
        }
        if (i == 17) {
            if (zu1Var.f == null || zu1Var.getParentActivity() == null) {
                return;
            }
            TextView textView = zu1Var.a2;
            if (textView != null && textView.getTag() != null) {
                zu1Var.Sb(((Integer) zu1Var.a2.getTag()).intValue(), null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", zu1Var.f.id);
            bundle.putBoolean("addContact", true);
            zu1Var.presentFragment(new cu2(bundle));
            return;
        }
        if (i == 18) {
            zu1Var.Hc(false);
            return;
        }
        if (i == 24) {
            try {
                ls6 mediaDataController = zu1Var.getMediaDataController();
                long j9 = zu1Var.f.id;
                Pattern pattern = ls6.U1;
                mediaDataController.z0(j9, 0, null);
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        if (i == 29) {
            if (!xc2.N(zu1Var.e)) {
                zu1Var.getNotificationCenter().k(jn7.p3, Long.valueOf(zu1Var.l6));
                return;
            }
            lo0 lo0Var = new lo0(zu1Var.l6);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zu1Var.S1;
            lo0Var.U = tL_premium_boostsStatus;
            if (tL_premium_boostsStatus != null) {
                lo0Var.getMessagesController().G0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
            }
            zu1Var.presentFragment(lo0Var);
            return;
        }
        if (i == 21) {
            int i15 = nb9.v1;
            int currentAccount = zu1Var.getCurrentAccount();
            Activity parentActivity = zu1Var.getParentActivity();
            long a = zu1Var.a();
            if (parentActivity != null) {
                nb9.E0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                return;
            }
            return;
        }
        if (i == 22) {
            for (int i16 = 0; i16 < 2; i16++) {
                for (int i17 = 0; i17 < sparseArrayArr[i16].size(); i17++) {
                    r47 r47Var3 = (r47) sparseArrayArr[i16].valueAt(i17);
                    zu1Var.getMediaDataController().d(2, r47Var3, r47Var3.F0(), (int) (System.currentTimeMillis() / 1000), !zu1Var.r6);
                }
            }
            zu1Var.L5(false);
            return;
        }
        if (i == 23) {
            for (int i18 = 1; i18 >= 0; i18--) {
                if (r47Var == null && sparseArrayArr3[i18].size() == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr3[i18].size(); i19++) {
                        arrayList3.add(Integer.valueOf(sparseArrayArr3[i18].keyAt(i19)));
                    }
                    r47Var = (r47) zu1Var.G6[i18].get(((Integer) arrayList3.get(0)).intValue());
                }
                sparseArrayArr3[i18].clear();
                sparseArrayArr2[i18].clear();
                sparseArrayArr[i18].clear();
            }
            if (r47Var == null || !r47Var.C4()) {
                zu1Var.Cc(r47Var, false);
            } else {
                zu1Var.v5 = r47Var;
                zu1Var.Ua(jn7.t1);
            }
            zu1Var.C7();
            zu1Var.gd(0, true);
            zu1Var.Gd(false);
            return;
        }
        if (i == 64) {
            i4 = ((e) zu1Var).currentAccount;
            a19 c = b19.f(i4).c(zu1Var.e7());
            Activity parentActivity2 = zu1Var.getParentActivity();
            i5 = ((e) zu1Var).currentAccount;
            x09.g0(parentActivity2, i5, zu1Var.f4, c, zu1Var.getResourceProvider(), new y0(this, c, b3));
            return;
        }
        byte b4 = 8;
        if (i == 14) {
            b8 b8Var = new b8(0, zu1Var.getResourceProvider(), this.a, true, true);
            b8Var.j(ob6.M0(2131753946, null), R.drawable.input_attach, null);
            b8Var.setOnClickListener(new r81(this, b4));
            s7 s7Var = zu1Var.j0;
            r6 r6Var = zu1Var.g0;
            r6Var.a();
            s7Var.U(b8Var, r6Var.m);
            return;
        }
        if (i == 30) {
            zu1Var.getSendMessagesHelper().q0(p7a.b("/help", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 31) {
            zu1Var.getSendMessagesHelper().q0(p7a.b("/settings", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 40) {
            zu1Var.Ca(zu1Var.j8() ? "" : null);
            return;
        }
        if (i == 62) {
            zu1Var.getMessagesController().j4.J(zu1Var.a(), false, true);
            if (zu1Var.getMessagesController().j4.K(zu1Var.a(), true)) {
                return;
            }
            zu1Var.zd(true);
            return;
        }
        if (i == 32 || i == 33) {
            if (zu1Var.f == null || zu1Var.getParentActivity() == null) {
                return;
            }
            TLRPC.User user3 = zu1Var.f;
            boolean z4 = i == 33;
            TLRPC.UserFull userFull = zu1Var.s8;
            xkc.m(user3, z4, userFull != null && userFull.video_calls_available, zu1Var.getParentActivity(), zu1Var.getMessagesController().Y1(zu1Var.f.id), zu1Var.getAccountInstance());
            return;
        }
        if (i == 27) {
            zu1Var.Zb();
            return;
        }
        if (i == 60) {
            if (zu1Var.r4 != null) {
                qyb qybVar2 = zu1Var.getMessagesController().h4;
                long j10 = zu1Var.e.id;
                TLRPC.TL_forumTopic tL_forumTopic = zu1Var.r4;
                int i20 = tL_forumTopic.id;
                tL_forumTopic.closed = true;
                qybVar2.z(i20, j10, true);
                zu1Var.Ad();
                zu1Var.Pc(false);
                zu1Var.zd(true);
                return;
            }
            return;
        }
        if (i == 61) {
            tzb.M0(zu1Var);
            return;
        }
        if (i == 65) {
            hl.g(zu1Var.e4.link);
            d31.b0(LaunchActivity.Q()).k(false).j();
            return;
        }
        if (i == 66) {
            Runnable runnable = new Runnable(this) { // from class: lq1
                public final /* synthetic */ oq1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = r2;
                    oq1 oq1Var = this.b;
                    switch (b22) {
                        case 0:
                            oq1Var.b.finishFragment();
                            break;
                        default:
                            zu1 zu1Var2 = oq1Var.b;
                            Intent intent = new Intent(zu1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", zu1Var2.e4.link);
                            zu1Var2.startActivityForResult(intent, 500);
                            break;
                    }
                }
            };
            if (zu1Var.a0.B()) {
                zu1Var.Xb(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (i == 67) {
            Activity parentActivity3 = zu1Var.getParentActivity();
            i3 = ((e) zu1Var).currentAccount;
            TL_account.TL_businessChatLink tL_businessChatLink = zu1Var.e4;
            vnbVar = ((e) zu1Var).resourceProvider;
            n41.f0(parentActivity3, i3, tL_businessChatLink, vnbVar);
            return;
        }
        if (i == 68) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.getResourceProvider(), zu1Var.getParentActivity());
            String M0 = ob6.M0(2131752688, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131752689, null);
            alertDialog$Builder.j(ob6.M0(2131746048, null), new rd1(this, (byte) 8));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            zu1Var.showDialog(idVar);
            TextView textView2 = (TextView) idVar.c(-1);
            if (textView2 != null) {
                yob.X(textView2, aob.q7, zu1Var.getResourceProvider());
                return;
            }
            return;
        }
        if (i == 75) {
            if (!zu1Var.l8() || zu1Var.C6() == null) {
                return;
            }
            hl.t1(zu1Var.m1);
            zu1Var.n0.requestLayout();
            n0c n0cVar2 = zu1Var.n0;
            n0cVar2.n();
            n0cVar2.a(1.0f, 0.0f);
            return;
        }
        if (i == 73) {
            wxb e0 = wxb.e0(-zu1Var.l6, 0L);
            e0.E = zu1Var;
            zu1Var.presentFragment(e0);
        } else if (i == 888) {
            zu1Var.dumpCanvas();
        } else if (i == 889) {
            HashSet hashSet = o.d1;
            d31.b0(zu1Var).t("No rich message copied", null).j();
        }
    }
}
