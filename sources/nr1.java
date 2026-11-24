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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nr1 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yv1 b;

    public nr1(yv1 yv1Var, Context context) {
        this.b = yv1Var;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c6
    public final void b(int i) {
        int i2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User W1;
        int i3;
        ylb ylbVar;
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
        oyb oybVar;
        yv1 yv1Var = this.b;
        SparseArray[] sparseArrayArr = yv1Var.q6;
        SparseArray[] sparseArrayArr2 = yv1Var.p6;
        SparseArray[] sparseArrayArr3 = yv1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (oybVar = yv1Var.n0) != null && oybVar.y > 0.0f) {
            oybVar.d();
        }
        final byte b = 0;
        if (i == -1) {
            if (yv1Var.pd.f) {
                yv1Var.Ja();
                return;
            }
            aVar = ((d) yv1Var).actionBar;
            if (aVar.y()) {
                yv1Var.M5(false);
                return;
            }
            if (yv1Var.g4 == 5 && (yv1Var.M6.isEmpty() || yv1Var.s4 == 0)) {
                yv1Var.tc();
                return;
            }
            if (yv1Var.g4 == 6 && yv1Var.a0.z()) {
                yv1Var.Xb(new Runnable(this) { // from class: kr1
                    public final /* synthetic */ nr1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        nr1 nr1Var = this.b;
                        switch (b2) {
                            case 0:
                                nr1Var.b.finishFragment();
                                break;
                            default:
                                yv1 yv1Var2 = nr1Var.b;
                                Intent intent = new Intent(yv1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", yv1Var2.e4.link);
                                yv1Var2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
                return;
            } else {
                if (yv1Var.k5(true, true)) {
                    return;
                }
                yv1Var.finishFragment();
                return;
            }
        }
        byte b2 = 15;
        if (i == 59) {
            if (yv1Var.getUserConfig().e() == yv1Var.l6) {
                yv1Var.getMessagesController().V4(true);
                yv1Var.p1.e(false, true);
                return;
            }
            qwb qwbVar = yv1Var.getMessagesController().g4;
            long j3 = -yv1Var.l6;
            qwbVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = qwbVar.getMessagesController().g1(j3);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            qwbVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new go9(qwbVar, b2));
            sxb.M0(yv1Var);
            return;
        }
        k47 k47Var = null;
        if (i == 10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long j4 = 0;
            for (int i10 = 1; i10 >= 0; i10--) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArrayArr2[i10].size(); i11++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr2[i10].keyAt(i11)));
                }
                if (yv1Var.h == null) {
                    Collections.sort(arrayList);
                } else {
                    Collections.sort(arrayList, Collections.reverseOrder());
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    k47 k47Var2 = (k47) sparseArrayArr2[i10].get(((Integer) arrayList.get(i12)).intValue());
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    spannableStringBuilder.append((CharSequence) yv1.Y6(j4, k47Var2, arrayList.size() != 1 && ((user2 = yv1Var.f) == null || !user2.self)));
                    j4 = k47Var2.Z0();
                }
            }
            if (spannableStringBuilder.length() != 0) {
                gm.g(spannableStringBuilder);
                yv1Var.i6();
                yv1Var.N3.j(58, 0L, null);
            }
            yv1Var.M5(false);
            return;
        }
        if (i == 12) {
            if (yv1Var.getParentActivity() != null) {
                yv1Var.T5(null, null, false);
                return;
            }
            return;
        }
        if (i == 11) {
            yv1Var.qa(true);
            return;
        }
        if (i == 69) {
            yv1Var.Qb();
            return;
        }
        if (i == 70) {
            TLRPC.Chat chat = yv1Var.e;
            if (chat != null) {
                yv1Var.presentFragment(yv1.ga(-chat.linked_monoforum_id));
                return;
            }
            return;
        }
        if (i == 72) {
            long j5 = yv1Var.l6;
            if (sd2.p0(yv1Var.e)) {
                i9 = ((d) yv1Var).currentAccount;
                if (sd2.A(i9, yv1Var.e, 24)) {
                    j5 = yv1Var.s4;
                    j2 = yv1Var.l6;
                    long j6 = j5;
                    i8 = ((d) yv1Var).currentAccount;
                    jva.v(i8, false).g0(j6, j2, false, false);
                    return;
                }
            }
            j2 = 0;
            long j62 = j5;
            i8 = ((d) yv1Var).currentAccount;
            jva.v(i8, false).g0(j62, j2, false, false);
            return;
        }
        if (i == 71) {
            long j7 = yv1Var.l6;
            if (sd2.p0(yv1Var.e)) {
                i7 = ((d) yv1Var).currentAccount;
                if (sd2.A(i7, yv1Var.e, 24)) {
                    j7 = yv1Var.s4;
                    j = yv1Var.l6;
                    long j8 = j7;
                    i6 = ((d) yv1Var).currentAccount;
                    jva.v(i6, false).z(j8, j, new xn1(this, j8, j, (byte) 1));
                    return;
                }
            }
            j = 0;
            long j82 = j7;
            i6 = ((d) yv1Var).currentAccount;
            jva.v(i6, false).z(j82, j, new xn1(this, j82, j, (byte) 1));
            return;
        }
        if (i == 28) {
            if (yv1Var.Jb == null) {
                yv1Var.xc();
                return;
            } else {
                yv1Var.K7();
                return;
            }
        }
        byte b3 = 25;
        if (i == 25) {
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 1; i13 >= 0; i13--) {
                for (int i14 = 0; i14 < sparseArrayArr3[i13].size(); i14++) {
                    arrayList2.add((k47) sparseArrayArr3[i13].valueAt(i14));
                }
                sparseArrayArr3[i13].clear();
                sparseArrayArr2[i13].clear();
                sparseArrayArr[i13].clear();
            }
            boolean z = yv1Var.x6 > 0;
            yv1Var.C7();
            yv1Var.gd(0, true);
            yv1Var.Gd(false);
            MediaController.f0(yv1Var.getParentActivity(), yv1Var.getAccountInstance(), arrayList2, new lr1(b, this, z));
            return;
        }
        if (i == 13) {
            if (yv1Var.getParentActivity() != null) {
                yv1Var.showDialog(ik.S(yv1Var.getParentActivity(), yv1Var.h, yv1Var.Ba).a);
                return;
            }
            return;
        }
        if (i == 15 || i == 16 || i == 26) {
            if (yv1Var.getParentActivity() != null) {
                if (i == 15 && sd2.p0(yv1Var.e)) {
                    if (yv1Var.s4 == 0 || (W1 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.s4))) == null) {
                        return;
                    }
                    ik.q(yv1Var, -1, W1, yv1Var.e, true, new g11(this, W1, (byte) 17), yv1Var.getResourceProvider());
                    return;
                }
                TLRPC.ChatFull chatFull2 = yv1Var.r8;
                boolean z2 = chatFull2 != null && chatFull2.can_delete_channel;
                if (i != 26) {
                    if (i == 15) {
                        i2 = (yv1Var.h != null || (((user = yv1Var.f) == null || m9c.D(user) || m9c.z(yv1Var.f)) && ((chatFull = yv1Var.r8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                    }
                    ik.r(yv1Var, i == i2, yv1Var.e, yv1Var.f, yv1Var.h == null ? (byte) 0 : (byte) 1, true, false, z2, new ji(this, i, z2));
                    return;
                }
                boolean z3 = z2;
                ik.q(yv1Var, -1, yv1Var.f, yv1Var.e, z3, new mr1(this, z3), yv1Var.getResourceProvider());
                return;
            }
            return;
        }
        if (i == 17) {
            if (yv1Var.f == null || yv1Var.getParentActivity() == null) {
                return;
            }
            TextView textView = yv1Var.a2;
            if (textView != null && textView.getTag() != null) {
                yv1Var.Rb(((Integer) yv1Var.a2.getTag()).intValue(), null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", yv1Var.f.id);
            bundle.putBoolean("addContact", true);
            yv1Var.presentFragment(new tu2(bundle));
            return;
        }
        if (i == 18) {
            yv1Var.Hc(false);
            return;
        }
        if (i == 24) {
            try {
                hs6 mediaDataController = yv1Var.getMediaDataController();
                long j9 = yv1Var.f.id;
                Pattern pattern = hs6.U1;
                mediaDataController.z0(j9, 0, null);
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        if (i == 29) {
            if (!sd2.N(yv1Var.e)) {
                yv1Var.getNotificationCenter().k(nm7.p3, Long.valueOf(yv1Var.l6));
                return;
            }
            lp0 lp0Var = new lp0(yv1Var.l6);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = yv1Var.S1;
            lp0Var.U = tL_premium_boostsStatus;
            if (tL_premium_boostsStatus != null) {
                lp0Var.getMessagesController().F0().b(lp0Var.S, lp0Var.U, new cp0(lp0Var, (byte) 0));
            }
            yv1Var.presentFragment(lp0Var);
            return;
        }
        if (i == 21) {
            int i15 = da9.v1;
            int currentAccount = yv1Var.getCurrentAccount();
            Activity parentActivity = yv1Var.getParentActivity();
            long a = yv1Var.a();
            if (parentActivity != null) {
                da9.D0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                return;
            }
            return;
        }
        if (i == 22) {
            for (int i16 = 0; i16 < 2; i16++) {
                for (int i17 = 0; i17 < sparseArrayArr[i16].size(); i17++) {
                    k47 k47Var3 = (k47) sparseArrayArr[i16].valueAt(i17);
                    yv1Var.getMediaDataController().d(2, k47Var3, k47Var3.F0(), (int) (System.currentTimeMillis() / 1000), !yv1Var.r6);
                }
            }
            yv1Var.M5(false);
            return;
        }
        if (i == 23) {
            for (int i18 = 1; i18 >= 0; i18--) {
                if (k47Var == null && sparseArrayArr3[i18].size() == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr3[i18].size(); i19++) {
                        arrayList3.add(Integer.valueOf(sparseArrayArr3[i18].keyAt(i19)));
                    }
                    k47Var = (k47) yv1Var.G6[i18].get(((Integer) arrayList3.get(0)).intValue());
                }
                sparseArrayArr3[i18].clear();
                sparseArrayArr2[i18].clear();
                sparseArrayArr[i18].clear();
            }
            if (k47Var == null || !k47Var.C4()) {
                yv1Var.Cc(k47Var, false);
            } else {
                yv1Var.v5 = k47Var;
                yv1Var.Ta(nm7.t1);
            }
            yv1Var.C7();
            yv1Var.gd(0, true);
            yv1Var.Gd(false);
            return;
        }
        if (i == 64) {
            i4 = ((d) yv1Var).currentAccount;
            oz8 c = pz8.f(i4).c(yv1Var.e7());
            Activity parentActivity2 = yv1Var.getParentActivity();
            i5 = ((d) yv1Var).currentAccount;
            lz8.h0(parentActivity2, i5, yv1Var.f4, c, yv1Var.getResourceProvider(), new x0(this, c, b3));
            return;
        }
        byte b4 = 9;
        if (i == 14) {
            a8 a8Var = new a8(0, yv1Var.getResourceProvider(), this.a, true, true);
            a8Var.j(jb6.M0(2131753918, null), R.drawable.input_attach, null);
            a8Var.setOnClickListener(new k81(this, b4));
            r7 r7Var = yv1Var.j0;
            q6 q6Var = yv1Var.g0;
            q6Var.a();
            r7Var.U(a8Var, q6Var.m);
            return;
        }
        if (i == 30) {
            yv1Var.getSendMessagesHelper().q0(y5a.b("/help", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 31) {
            yv1Var.getSendMessagesHelper().q0(y5a.b("/settings", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            return;
        }
        if (i == 40) {
            yv1Var.Ba(yv1Var.i8() ? "" : null);
            return;
        }
        if (i == 62) {
            yv1Var.getMessagesController().i4.J(yv1Var.a(), false, true);
            if (yv1Var.getMessagesController().i4.K(yv1Var.a(), true)) {
                return;
            }
            yv1Var.zd(true);
            return;
        }
        if (i == 32 || i == 33) {
            if (yv1Var.f == null || yv1Var.getParentActivity() == null) {
                return;
            }
            TLRPC.User user3 = yv1Var.f;
            boolean z4 = i == 33;
            TLRPC.UserFull userFull = yv1Var.s8;
            sic.m(user3, z4, userFull != null && userFull.video_calls_available, yv1Var.getParentActivity(), yv1Var.getMessagesController().X1(yv1Var.f.id), yv1Var.getAccountInstance());
            return;
        }
        if (i == 27) {
            yv1Var.Zb();
            return;
        }
        if (i == 60) {
            if (yv1Var.r4 != null) {
                qwb qwbVar2 = yv1Var.getMessagesController().g4;
                long j10 = yv1Var.e.id;
                TLRPC.TL_forumTopic tL_forumTopic = yv1Var.r4;
                int i20 = tL_forumTopic.id;
                tL_forumTopic.closed = true;
                qwbVar2.z(i20, j10, true);
                yv1Var.Ad();
                yv1Var.Pc(false);
                yv1Var.zd(true);
                return;
            }
            return;
        }
        if (i == 61) {
            sxb.M0(yv1Var);
            return;
        }
        if (i == 65) {
            gm.g(yv1Var.e4.link);
            c41.b0(LaunchActivity.Q()).k(false).j();
            return;
        }
        if (i == 66) {
            Runnable runnable = new Runnable(this) { // from class: kr1
                public final /* synthetic */ nr1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = r2;
                    nr1 nr1Var = this.b;
                    switch (b22) {
                        case 0:
                            nr1Var.b.finishFragment();
                            break;
                        default:
                            yv1 yv1Var2 = nr1Var.b;
                            Intent intent = new Intent(yv1Var2.getParentActivity(), (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", yv1Var2.e4.link);
                            yv1Var2.startActivityForResult(intent, 500);
                            break;
                    }
                }
            };
            if (yv1Var.a0.z()) {
                yv1Var.Xb(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (i == 67) {
            Activity parentActivity3 = yv1Var.getParentActivity();
            i3 = ((d) yv1Var).currentAccount;
            TL_account.TL_businessChatLink tL_businessChatLink = yv1Var.e4;
            ylbVar = ((d) yv1Var).resourceProvider;
            m51.g0(parentActivity3, i3, tL_businessChatLink, ylbVar);
            return;
        }
        if (i == 68) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.getResourceProvider(), yv1Var.getParentActivity());
            String M0 = jb6.M0(2131752660, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131752661, null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new cd1(this, (byte) 9));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            yv1Var.showDialog(heVar);
            TextView textView2 = (TextView) heVar.c(-1);
            if (textView2 != null) {
                anb.X(textView2, cmb.p7, yv1Var.getResourceProvider());
                return;
            }
            return;
        }
        if (i == 75) {
            if (!yv1Var.k8() || yv1Var.C6() == null) {
                return;
            }
            gm.t1(yv1Var.m1);
            yv1Var.n0.requestLayout();
            oyb oybVar2 = yv1Var.n0;
            oybVar2.n();
            oybVar2.a(1.0f, 0.0f);
            return;
        }
        if (i == 73) {
            wvb f0 = wvb.f0(-yv1Var.l6, 0L);
            f0.E = yv1Var;
            yv1Var.presentFragment(f0);
        } else if (i == 888) {
            yv1Var.dumpCanvas();
        } else if (i == 889) {
            HashSet hashSet = o.d1;
            c41.b0(yv1Var).t("No rich message copied", null).j();
        }
    }
}
