// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dzb extends d6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ tzb b;

    public dzb(tzb tzbVar, Context context) {
        this.b = tzbVar;
        this.a = context;
    }

    @Override // d6
    public final void b(int i) {
        int i2;
        TLRPC.ChatParticipants chatParticipants;
        qyb qybVar;
        int i3;
        boolean z;
        qzb qzbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        tzb tzbVar = this.b;
        qyb qybVar2 = tzbVar.s;
        ArrayList arrayList = tzbVar.b;
        HashSet hashSet = tzbVar.b0;
        long j = tzbVar.a;
        if (i == -1) {
            if (hashSet.size() <= 0) {
                tzbVar.finishFragment();
                return;
            }
            tzbVar.D0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i4 = 0;
        switch (i) {
            case 1:
                qyb qybVar3 = tzbVar.getMessagesController().g4;
                qybVar3.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = qybVar3.getMessagesController().h1(j);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                qybVar3.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new yp9(qybVar3, (byte) 15));
                tzbVar.J = true;
                zu1 zu1Var = new zu1(qu6.k(j, "chat_id"));
                zu1Var.Ga = true;
                tzbVar.presentFragment(zu1Var);
                break;
            case 2:
                TLRPC.ChatFull N0 = tzbVar.getMessagesController().N0(j);
                TLRPC.ChatFull chatFull = tzbVar.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    N0.participants = chatParticipants;
                }
                if (N0 != null) {
                    zh6 zh6Var = new zh6();
                    if (N0.participants != null) {
                        while (i4 < N0.participants.participants.size()) {
                            zh6Var.k(N0.participants.participants.get(i4).user_id, null);
                            i4++;
                        }
                    }
                    long j2 = N0.id;
                    i2 = ((e) tzbVar).currentAccount;
                    bzb bzbVar = new bzb(this, this.a, i2, zh6Var, N0.id, tzbVar, j2);
                    bzbVar.f2 = new i02((Object) this, j2, (byte) 12);
                    bzbVar.show();
                    break;
                }
                break;
            case 3:
                wxb e0 = wxb.e0(j, 0L);
                tzbVar.presentFragment(e0);
                hl.d3(new rxb(e0, (byte) 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    tzbVar.D0 = true;
                    tzbVar.O0 = true;
                    qyb qybVar4 = tzbVar.s;
                    long j3 = tzbVar.a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i == 4) {
                        qybVar = qybVar4;
                        i3 = intValue;
                        z = true;
                    } else {
                        qybVar = qybVar4;
                        i3 = intValue;
                        z = false;
                    }
                    qybVar.t(j3, i3, z, tzbVar);
                }
                tzbVar.D0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    tzbVar.getNotificationsController().G(-j, ((Integer) it.next()).intValue(), tzbVar.C0);
                }
                tzbVar.D0();
                break;
            case 7:
                tzbVar.E0(hashSet, new azb(this, (byte) 0));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    TLRPC.TL_forumTopic f = qybVar2.f(j, ((Integer) arrayList2.get(i5)).intValue());
                    if (f != null) {
                        tzbVar.getMessagesController().w3(-j, f.id);
                        uc7 messagesController = tzbVar.getMessagesController();
                        long j4 = -j;
                        int i6 = f.top_message;
                        TLRPC.Message message = f.topMessage;
                        messagesController.r3(j4, i6, 0, message != null ? message.date : 0, false, f.id, 0, true, 0);
                        tzbVar.getMessagesStorage().a2(f.top_message, 0, tzbVar.a, f.id);
                    }
                }
                tzbVar.D0();
                break;
            case 9:
            case 10:
                tzbVar.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    qybVar2.z(((Integer) arrayList3.get(i7)).intValue(), j, i == 9);
                }
                tzbVar.D0();
                break;
            case 11:
                TLRPC.Chat M0 = tzbVar.getMessagesController().M0(Long.valueOf(j));
                jj.r(tzbVar, false, M0, null, false, true, false, false, new yw9(this, M0, (byte) 14));
                break;
            case 12:
            case 13:
                int i8 = 0;
                while (true) {
                    if (i8 < tzbVar.O.getChildCount()) {
                        View childAt = tzbVar.O.getChildAt(i8);
                        if ((childAt instanceof qzb) && (tL_forumTopic = (qzbVar = (qzb) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i8++;
                        }
                    } else {
                        qzbVar = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i4 < arrayList.size()) {
                            if (arrayList.get(i4) == null || ((kzb) arrayList.get(i4)).c == null || ((kzb) arrayList.get(i4)).c.id != 1) {
                                i4++;
                            } else {
                                tL_forumTopic2 = ((kzb) arrayList.get(i4)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (tzbVar.y <= 0) {
                        tzbVar.F = true;
                        tzbVar.E = (byte) 2;
                    }
                    tzbVar.getMessagesController().g4.A(1, j, tL_forumTopic2.hidden);
                    if (qzbVar != null) {
                        tzbVar.d1 = qzbVar;
                    }
                    ezb ezbVar = tzbVar.O;
                    boolean z2 = !tL_forumTopic2.hidden;
                    int i9 = rzb.o3;
                    ezbVar.C1(z2, qzbVar);
                    tzbVar.Z0(true, true);
                    if (qzbVar != null) {
                        qzbVar.setTopicIcon(qzbVar.d5);
                    }
                }
                tzbVar.D0();
                break;
            case 14:
                if (xc2.N(tzbVar.getMessagesController().M0(Long.valueOf(j)))) {
                    lo0 lo0Var = new lo0(-j);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = tzbVar.Y;
                    lo0Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        lo0Var.getMessagesController().G0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                    }
                    tzbVar.presentFragment(lo0Var);
                    break;
                } else {
                    tzbVar.getNotificationCenter().k(jn7.p3, Long.valueOf(-j));
                    break;
                }
            case 15:
                nb9.G0(-j, tzbVar);
                break;
        }
    }
}
