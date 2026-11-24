// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bvb extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qvb b;

    public bvb(qvb qvbVar, Context context) {
        this.b = qvbVar;
        this.a = context;
    }

    @Override // c6
    public final void b(int i) {
        int i2;
        TLRPC.ChatParticipants chatParticipants;
        pub pubVar;
        int i3;
        boolean z;
        nvb nvbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        qvb qvbVar = this.b;
        pub pubVar2 = qvbVar.s;
        ArrayList arrayList = qvbVar.b;
        HashSet hashSet = qvbVar.b0;
        long j = qvbVar.a;
        if (i == -1) {
            if (hashSet.size() <= 0) {
                qvbVar.finishFragment();
                return;
            }
            qvbVar.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i4 = 0;
        switch (i) {
            case 1:
                pub pubVar3 = qvbVar.getMessagesController().g4;
                pubVar3.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = pubVar3.getMessagesController().f1(j);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                pubVar3.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new wx9(pubVar3, (byte) 14));
                qvbVar.J = true;
                mu1 mu1Var = new mu1(ls6.k(j, "chat_id"));
                mu1Var.Ga = true;
                qvbVar.presentFragment(mu1Var);
                break;
            case 2:
                TLRPC.ChatFull L0 = qvbVar.getMessagesController().L0(j);
                TLRPC.ChatFull chatFull = qvbVar.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    L0.participants = chatParticipants;
                }
                if (L0 != null) {
                    vf6 vf6Var = new vf6();
                    if (L0.participants != null) {
                        while (i4 < L0.participants.participants.size()) {
                            vf6Var.k(null, L0.participants.participants.get(i4).user_id);
                            i4++;
                        }
                    }
                    long j2 = L0.id;
                    i2 = ((d) qvbVar).currentAccount;
                    zub zubVar = new zub(this, this.a, i2, vf6Var, L0.id, qvbVar, j2);
                    zubVar.f2 = new rz1((Object) this, j2, (byte) 12);
                    zubVar.show();
                    break;
                }
                break;
            case 3:
                vtb e0 = vtb.e0(j, 0L);
                qvbVar.presentFragment(e0);
                gl.d3(new qtb(e0, (byte) 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    qvbVar.D0 = true;
                    qvbVar.O0 = true;
                    pub pubVar4 = qvbVar.s;
                    long j3 = qvbVar.a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i == 4) {
                        pubVar = pubVar4;
                        i3 = intValue;
                        z = true;
                    } else {
                        pubVar = pubVar4;
                        i3 = intValue;
                        z = false;
                    }
                    pubVar.t(j3, i3, z, qvbVar);
                }
                qvbVar.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qvbVar.getNotificationsController().G(-j, ((Integer) it.next()).intValue(), qvbVar.C0);
                }
                qvbVar.C0();
                break;
            case 7:
                qvbVar.D0(hashSet, new cib(this, (byte) 13));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    TLRPC.TL_forumTopic f = pubVar2.f(j, ((Integer) arrayList2.get(i5)).intValue());
                    if (f != null) {
                        qvbVar.getMessagesController().q3(-j, f.id);
                        na7 messagesController = qvbVar.getMessagesController();
                        long j4 = -j;
                        int i6 = f.top_message;
                        TLRPC.Message message = f.topMessage;
                        messagesController.l3(j4, i6, 0, message != null ? message.date : 0, false, f.id, 0, true, 0);
                        qvbVar.getMessagesStorage().a2(f.top_message, 0, qvbVar.a, f.id);
                    }
                }
                qvbVar.C0();
                break;
            case 9:
            case 10:
                qvbVar.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    pubVar2.z(((Integer) arrayList3.get(i7)).intValue(), j, i == 9);
                }
                qvbVar.C0();
                break;
            case 11:
                TLRPC.Chat K0 = qvbVar.getMessagesController().K0(Long.valueOf(j));
                ij.r(qvbVar, false, K0, null, false, true, false, false, new kq8(this, K0, (byte) 28));
                break;
            case 12:
            case 13:
                int i8 = 0;
                while (true) {
                    if (i8 < qvbVar.O.getChildCount()) {
                        View childAt = qvbVar.O.getChildAt(i8);
                        if ((childAt instanceof nvb) && (tL_forumTopic = (nvbVar = (nvb) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i8++;
                        }
                    } else {
                        nvbVar = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i4 < arrayList.size()) {
                            if (arrayList.get(i4) == null || ((ivb) arrayList.get(i4)).c == null || ((ivb) arrayList.get(i4)).c.id != 1) {
                                i4++;
                            } else {
                                tL_forumTopic2 = ((ivb) arrayList.get(i4)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (qvbVar.y <= 0) {
                        qvbVar.F = true;
                        qvbVar.E = (byte) 2;
                    }
                    qvbVar.getMessagesController().g4.A(1, j, tL_forumTopic2.hidden);
                    if (nvbVar != null) {
                        qvbVar.d1 = nvbVar;
                    }
                    cvb cvbVar = qvbVar.O;
                    boolean z2 = !tL_forumTopic2.hidden;
                    int i9 = ovb.o3;
                    cvbVar.B1(z2, nvbVar);
                    qvbVar.Y0(true, true);
                    if (nvbVar != null) {
                        nvbVar.setTopicIcon(nvbVar.d5);
                    }
                }
                qvbVar.C0();
                break;
            case 14:
                if (hc2.N(qvbVar.getMessagesController().K0(Long.valueOf(j)))) {
                    lo0 lo0Var = new lo0(-j);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qvbVar.Y;
                    lo0Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        lo0Var.getMessagesController().E0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                    }
                    qvbVar.presentFragment(lo0Var);
                    break;
                } else {
                    qvbVar.getNotificationCenter().k(kk7.o3, Long.valueOf(-j));
                    break;
                }
            case 15:
                b89.E0(-j, qvbVar);
                break;
        }
    }
}
