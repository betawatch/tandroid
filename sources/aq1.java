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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class aq1 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ mu1 b;

    public aq1(mu1 mu1Var, Context context) {
        this.b = mu1Var;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c6
    public final void b(int i) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User V1;
        int i2;
        wjb wjbVar;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        TLRPC.User user2;
        a aVar;
        lwb lwbVar;
        mu1 mu1Var = this.b;
        SparseArray[] sparseArrayArr = mu1Var.q6;
        SparseArray[] sparseArrayArr2 = mu1Var.p6;
        SparseArray[] sparseArrayArr3 = mu1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (lwbVar = mu1Var.n0) != null && lwbVar.y > 0.0f) {
            lwbVar.d();
        }
        byte b = 6;
        final byte b2 = 0;
        if (i == -1) {
            if (mu1Var.ed.f) {
                mu1Var.xa();
                return;
            }
            aVar = ((d) mu1Var).actionBar;
            if (aVar.y()) {
                mu1Var.E5(false);
                return;
            }
            if (mu1Var.g4 == 5 && (mu1Var.M6.isEmpty() || mu1Var.s4 == 0)) {
                mu1Var.fc();
                return;
            }
            if (mu1Var.g4 == 6 && mu1Var.a0.A()) {
                mu1Var.Kb(new Runnable(this) { // from class: xp1
                    public final /* synthetic */ aq1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        aq1 aq1Var = this.b;
                        switch (b3) {
                            case 0:
                                aq1Var.b.finishFragment();
                                break;
                            default:
                                mu1 mu1Var2 = aq1Var.b;
                                Intent intent = new Intent(mu1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", mu1Var2.e4.link);
                                mu1Var2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
                return;
            } else {
                if (mu1Var.c5(true, true)) {
                    return;
                }
                mu1Var.finishFragment();
                return;
            }
        }
        byte b3 = 14;
        if (i == 59) {
            if (mu1Var.getUserConfig().e() == mu1Var.l6) {
                mu1Var.getMessagesController().S4(true);
                mu1Var.p1.e(false, true);
                return;
            }
            pub pubVar = mu1Var.getMessagesController().g4;
            long j3 = -mu1Var.l6;
            pubVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = pubVar.getMessagesController().f1(j3);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            pubVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new wx9(pubVar, b3));
            qvb.L0(mu1Var);
            return;
        }
        k27 k27Var = null;
        if (i == 10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long j4 = 0;
            for (int i9 = 1; i9 >= 0; i9--) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr2[i9].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr2[i9].keyAt(i10)));
                }
                if (mu1Var.h == null) {
                    Collections.sort(arrayList);
                } else {
                    Collections.sort(arrayList, Collections.reverseOrder());
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k27 k27Var2 = (k27) sparseArrayArr2[i9].get(((Integer) arrayList.get(i11)).intValue());
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    spannableStringBuilder.append((CharSequence) mu1.P6(j4, k27Var2, arrayList.size() != 1 && ((user2 = mu1Var.f) == null || !user2.self)));
                    j4 = k27Var2.Z0();
                }
            }
            if (spannableStringBuilder.length() != 0) {
                gl.g(spannableStringBuilder);
                mu1Var.Z5();
                mu1Var.N3.j(58, 0L, null);
            }
            mu1Var.E5(false);
            return;
        }
        if (i == 12) {
            if (mu1Var.getParentActivity() != null) {
                mu1Var.L5(null, null, false);
                return;
            }
            return;
        }
        if (i == 11) {
            mu1Var.ea(true);
            return;
        }
        if (i == 69) {
            mu1Var.Eb();
            return;
        }
        if (i == 70) {
            TLRPC.Chat chat = mu1Var.e;
            if (chat != null) {
                mu1Var.presentFragment(mu1.U9(-chat.linked_monoforum_id));
                return;
            }
            return;
        }
        byte b4 = 24;
        if (i == 72) {
            long j5 = mu1Var.l6;
            if (hc2.p0(mu1Var.e)) {
                i8 = ((d) mu1Var).currentAccount;
                if (hc2.A(i8, mu1Var.e, 24)) {
                    j5 = mu1Var.s4;
                    j2 = mu1Var.l6;
                    long j6 = j5;
                    i7 = ((d) mu1Var).currentAccount;
                    gta.v(i7, false).g0(j6, j2, false, false);
                    return;
                }
            }
            j2 = 0;
            long j62 = j5;
            i7 = ((d) mu1Var).currentAccount;
            gta.v(i7, false).g0(j62, j2, false, false);
            return;
        }
        if (i == 71) {
            long j7 = mu1Var.l6;
            if (hc2.p0(mu1Var.e)) {
                i6 = ((d) mu1Var).currentAccount;
                if (hc2.A(i6, mu1Var.e, 24)) {
                    j7 = mu1Var.s4;
                    j = mu1Var.l6;
                    long j8 = j7;
                    i5 = ((d) mu1Var).currentAccount;
                    gta.v(i5, false).z(j8, j, new um1(this, j8, j, (byte) 1));
                    return;
                }
            }
            j = 0;
            long j82 = j7;
            i5 = ((d) mu1Var).currentAccount;
            gta.v(i5, false).z(j82, j, new um1(this, j82, j, (byte) 1));
            return;
        }
        if (i == 28) {
            if (mu1Var.Bb == null) {
                mu1Var.jc();
                return;
            } else {
                mu1Var.A7();
                return;
            }
        }
        if (i == 25) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 1; i12 >= 0; i12--) {
                for (int i13 = 0; i13 < sparseArrayArr3[i12].size(); i13++) {
                    arrayList2.add((k27) sparseArrayArr3[i12].valueAt(i13));
                }
                sparseArrayArr3[i12].clear();
                sparseArrayArr2[i12].clear();
                sparseArrayArr[i12].clear();
            }
            boolean z = mu1Var.x6 > 0;
            mu1Var.s7();
            mu1Var.Sc(0, true);
            mu1Var.sd(false);
            MediaController.f0(mu1Var.getParentActivity(), mu1Var.getAccountInstance(), arrayList2, new yp1(b2, this, z));
            return;
        }
        if (i == 13) {
            if (mu1Var.getParentActivity() != null) {
                mu1Var.showDialog(ij.S(mu1Var.getParentActivity(), mu1Var.h, mu1Var.Ba).a);
                return;
            }
            return;
        }
        if (i == 15 || i == 16 || i == 26) {
            if (mu1Var.getParentActivity() != null) {
                if (i == 15 && hc2.p0(mu1Var.e)) {
                    if (mu1Var.s4 == 0 || (V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.s4))) == null) {
                        return;
                    }
                    ij.q(mu1Var, -1, V1, mu1Var.e, true, new q31(this, V1, (byte) 16), mu1Var.getResourceProvider());
                    return;
                }
                TLRPC.ChatFull chatFull2 = mu1Var.r8;
                boolean z2 = chatFull2 != null && chatFull2.can_delete_channel;
                if (i == 26 || (i == 15 && mu1Var.h == null && (!((user = mu1Var.f) == null || l7c.C(user) || l7c.y(mu1Var.f)) || ((chatFull = mu1Var.r8) != null && chatFull.can_delete_channel)))) {
                    ij.q(mu1Var, -1, mu1Var.f, mu1Var.e, z2, new zp1(this, z2), mu1Var.getResourceProvider());
                    return;
                } else {
                    ij.r(mu1Var, i == 15, mu1Var.e, mu1Var.f, mu1Var.h == null ? (byte) 0 : (byte) 1, true, false, z2, new jh(this, i, z2));
                    return;
                }
            }
            return;
        }
        if (i == 17) {
            if (mu1Var.f == null || mu1Var.getParentActivity() == null) {
                return;
            }
            TextView textView = mu1Var.a2;
            if (textView != null && textView.getTag() != null) {
                mu1Var.Fb(((Integer) mu1Var.a2.getTag()).intValue(), null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mu1Var.f.id);
            bundle.putBoolean("addContact", true);
            mu1Var.presentFragment(new it2(bundle));
            return;
        }
        if (i == 18) {
            mu1Var.tc(false);
            return;
        }
        if (i == 24) {
            try {
                hq6 mediaDataController = mu1Var.getMediaDataController();
                long j9 = mu1Var.f.id;
                Pattern pattern = hq6.U1;
                mediaDataController.z0(j9, 0, null);
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        if (i == 29) {
            if (!hc2.N(mu1Var.e)) {
                mu1Var.getNotificationCenter().k(kk7.o3, Long.valueOf(mu1Var.l6));
                return;
            }
            lo0 lo0Var = new lo0(mu1Var.l6);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = mu1Var.S1;
            lo0Var.U = tL_premium_boostsStatus;
            if (tL_premium_boostsStatus != null) {
                lo0Var.getMessagesController().E0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
            }
            mu1Var.presentFragment(lo0Var);
            return;
        }
        if (i == 21) {
            int i14 = b89.v1;
            int currentAccount = mu1Var.getCurrentAccount();
            Activity parentActivity = mu1Var.getParentActivity();
            long a = mu1Var.a();
            if (parentActivity != null) {
                b89.D0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                return;
            }
            return;
        }
        if (i == 22) {
            for (int i15 = 0; i15 < 2; i15++) {
                for (int i16 = 0; i16 < sparseArrayArr[i15].size(); i16++) {
                    k27 k27Var3 = (k27) sparseArrayArr[i15].valueAt(i16);
                    mu1Var.getMediaDataController().d(2, k27Var3, k27Var3.F0(), (int) (System.currentTimeMillis() / 1000), !mu1Var.r6);
                }
            }
            mu1Var.E5(false);
            return;
        }
        if (i == 23) {
            for (int i17 = 1; i17 >= 0; i17--) {
                if (k27Var == null && sparseArrayArr3[i17].size() == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i18 = 0; i18 < sparseArrayArr3[i17].size(); i18++) {
                        arrayList3.add(Integer.valueOf(sparseArrayArr3[i17].keyAt(i18)));
                    }
                    k27Var = (k27) mu1Var.G6[i17].get(((Integer) arrayList3.get(0)).intValue());
                }
                sparseArrayArr3[i17].clear();
                sparseArrayArr2[i17].clear();
                sparseArrayArr[i17].clear();
            }
            if (k27Var == null || !k27Var.C4()) {
                mu1Var.oc(k27Var, false);
            } else {
                mu1Var.v5 = k27Var;
                mu1Var.Ha(kk7.t1);
            }
            mu1Var.s7();
            mu1Var.Sc(0, true);
            mu1Var.sd(false);
            return;
        }
        if (i == 64) {
            i3 = ((d) mu1Var).currentAccount;
            nx8 c = ox8.f(i3).c(mu1Var.U6());
            Activity parentActivity2 = mu1Var.getParentActivity();
            i4 = ((d) mu1Var).currentAccount;
            kx8.g0(parentActivity2, i4, mu1Var.f4, c, mu1Var.getResourceProvider(), new x0(this, c, b4));
            return;
        }
        if (i == 14) {
            a8 a8Var = new a8(0, mu1Var.getResourceProvider(), this.a, true, true);
            a8Var.j(k96.M0(2131753950, null), R.drawable.input_attach, null);
            a8Var.setOnClickListener(new x91(this, b));
            r7 r7Var = mu1Var.j0;
            q6 q6Var = mu1Var.g0;
            q6Var.a();
            r7Var.U(a8Var, q6Var.m);
            return;
        }
        if (i == 30) {
            mu1Var.getSendMessagesHelper().q0(x3a.b("/help", mu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 31) {
            mu1Var.getSendMessagesHelper().q0(x3a.b("/settings", mu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 40) {
            mu1Var.pa(mu1Var.X7() ? "" : null);
            return;
        }
        if (i == 62) {
            mu1Var.getMessagesController().i4.J(mu1Var.a(), false, true);
            if (mu1Var.getMessagesController().i4.K(mu1Var.a(), true)) {
                return;
            }
            mu1Var.ld(true);
            return;
        }
        if (i == 32 || i == 33) {
            if (mu1Var.f == null || mu1Var.getParentActivity() == null) {
                return;
            }
            TLRPC.User user3 = mu1Var.f;
            boolean z3 = i == 33;
            TLRPC.UserFull userFull = mu1Var.s8;
            rgc.m(user3, z3, userFull != null && userFull.video_calls_available, mu1Var.getParentActivity(), mu1Var.getMessagesController().W1(mu1Var.f.id), mu1Var.getAccountInstance());
            return;
        }
        if (i == 27) {
            mu1Var.Lb();
            return;
        }
        if (i == 60) {
            if (mu1Var.r4 != null) {
                pub pubVar2 = mu1Var.getMessagesController().g4;
                long j10 = mu1Var.e.id;
                TLRPC.TL_forumTopic tL_forumTopic = mu1Var.r4;
                int i19 = tL_forumTopic.id;
                tL_forumTopic.closed = true;
                pubVar2.z(i19, j10, true);
                mu1Var.md();
                mu1Var.Bc(false);
                mu1Var.ld(true);
                return;
            }
            return;
        }
        if (i == 61) {
            qvb.L0(mu1Var);
            return;
        }
        if (i == 65) {
            gl.g(mu1Var.e4.link);
            u21.b0(LaunchActivity.Q()).k(false).j();
            return;
        }
        if (i == 66) {
            Runnable runnable = new Runnable(this) { // from class: xp1
                public final /* synthetic */ aq1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = r2;
                    aq1 aq1Var = this.b;
                    switch (b32) {
                        case 0:
                            aq1Var.b.finishFragment();
                            break;
                        default:
                            mu1 mu1Var2 = aq1Var.b;
                            Intent intent = new Intent(mu1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", mu1Var2.e4.link);
                            mu1Var2.startActivityForResult(intent, 500);
                            break;
                    }
                }
            };
            if (mu1Var.a0.A()) {
                mu1Var.Kb(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (i == 67) {
            Activity parentActivity3 = mu1Var.getParentActivity();
            i2 = ((d) mu1Var).currentAccount;
            TL_account.TL_businessChatLink tL_businessChatLink = mu1Var.e4;
            wjbVar = ((d) mu1Var).resourceProvider;
            f41.f0(parentActivity3, i2, tL_businessChatLink, wjbVar);
            return;
        }
        if (i == 68) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
            String M0 = k96.M0(2131752695, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752696, null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new rh1(this, (byte) 6));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            mu1Var.showDialog(hdVar);
            TextView textView2 = (TextView) hdVar.c(-1);
            if (textView2 != null) {
                zkb.X(textView2, bkb.p7, mu1Var.getResourceProvider());
                return;
            }
            return;
        }
        if (i == 75) {
            if (!mu1Var.Z7() || mu1Var.t6() == null) {
                return;
            }
            gl.t1(mu1Var.m1);
            mu1Var.n0.requestLayout();
            lwb lwbVar2 = mu1Var.n0;
            lwbVar2.n();
            lwbVar2.a(1.0f, 0.0f);
            return;
        }
        if (i == 73) {
            vtb e0 = vtb.e0(-mu1Var.l6, 0L);
            e0.E = mu1Var;
            mu1Var.presentFragment(e0);
        } else if (i == 888) {
            mu1Var.dumpCanvas();
        } else if (i == 889) {
            HashSet hashSet = o.d1;
            u21.b0(mu1Var).t("No rich message copied", null).j();
        }
    }
}
