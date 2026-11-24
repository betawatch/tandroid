// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cxb extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sxb b;

    public cxb(sxb sxbVar, Context context) {
        this.b = sxbVar;
        this.a = context;
    }

    @Override // c6
    public final void b(int i) {
        int i2;
        TLRPC.ChatParticipants chatParticipants;
        qwb qwbVar;
        int i3;
        boolean z;
        pxb pxbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        sxb sxbVar = this.b;
        qwb qwbVar2 = sxbVar.s;
        ArrayList arrayList = sxbVar.b;
        HashSet hashSet = sxbVar.b0;
        long j = sxbVar.a;
        if (i == -1) {
            if (hashSet.size() <= 0) {
                sxbVar.finishFragment();
                return;
            }
            sxbVar.D0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i4 = 0;
        switch (i) {
            case 1:
                qwb qwbVar3 = sxbVar.getMessagesController().g4;
                qwbVar3.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = qwbVar3.getMessagesController().g1(j);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                qwbVar3.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new go9(qwbVar3, (byte) 15));
                sxbVar.J = true;
                yv1 yv1Var = new yv1(kt6.k(j, "chat_id"));
                yv1Var.Ga = true;
                sxbVar.presentFragment(yv1Var);
                break;
            case 2:
                TLRPC.ChatFull M0 = sxbVar.getMessagesController().M0(j);
                TLRPC.ChatFull chatFull = sxbVar.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    M0.participants = chatParticipants;
                }
                if (M0 != null) {
                    vh6 vh6Var = new vh6();
                    if (M0.participants != null) {
                        while (i4 < M0.participants.participants.size()) {
                            vh6Var.k(null, M0.participants.participants.get(i4).user_id);
                            i4++;
                        }
                    }
                    long j2 = M0.id;
                    i2 = ((d) sxbVar).currentAccount;
                    axb axbVar = new axb(this, this.a, i2, vh6Var, M0.id, sxbVar, j2);
                    axbVar.f2 = new d12((Object) this, j2, (byte) 12);
                    axbVar.show();
                    break;
                }
                break;
            case 3:
                wvb f0 = wvb.f0(j, 0L);
                sxbVar.presentFragment(f0);
                gm.d3(new rvb(f0, (byte) 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    sxbVar.D0 = true;
                    sxbVar.O0 = true;
                    qwb qwbVar4 = sxbVar.s;
                    long j3 = sxbVar.a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i == 4) {
                        qwbVar = qwbVar4;
                        i3 = intValue;
                        z = true;
                    } else {
                        qwbVar = qwbVar4;
                        i3 = intValue;
                        z = false;
                    }
                    qwbVar.t(j3, i3, z, sxbVar);
                }
                sxbVar.D0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    sxbVar.getNotificationsController().G(-j, ((Integer) it.next()).intValue(), sxbVar.C0);
                }
                sxbVar.D0();
                break;
            case 7:
                sxbVar.E0(hashSet, new zcb(this, (byte) 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    TLRPC.TL_forumTopic f = qwbVar2.f(j, ((Integer) arrayList2.get(i5)).intValue());
                    if (f != null) {
                        sxbVar.getMessagesController().s3(-j, f.id);
                        oc7 messagesController = sxbVar.getMessagesController();
                        long j4 = -j;
                        int i6 = f.top_message;
                        TLRPC.Message message = f.topMessage;
                        messagesController.n3(j4, i6, 0, message != null ? message.date : 0, false, f.id, 0, true, 0);
                        sxbVar.getMessagesStorage().a2(f.top_message, 0, sxbVar.a, f.id);
                    }
                }
                sxbVar.D0();
                break;
            case 9:
            case 10:
                sxbVar.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    qwbVar2.z(((Integer) arrayList3.get(i7)).intValue(), j, i == 9);
                }
                sxbVar.D0();
                break;
            case 11:
                TLRPC.Chat L0 = sxbVar.getMessagesController().L0(Long.valueOf(j));
                ik.r(sxbVar, false, L0, null, false, true, false, false, new xr8(this, L0, (byte) 29));
                break;
            case 12:
            case 13:
                int i8 = 0;
                while (true) {
                    if (i8 < sxbVar.O.getChildCount()) {
                        View childAt = sxbVar.O.getChildAt(i8);
                        if ((childAt instanceof pxb) && (tL_forumTopic = (pxbVar = (pxb) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i8++;
                        }
                    } else {
                        pxbVar = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i4 < arrayList.size()) {
                            if (arrayList.get(i4) == null || ((jxb) arrayList.get(i4)).c == null || ((jxb) arrayList.get(i4)).c.id != 1) {
                                i4++;
                            } else {
                                tL_forumTopic2 = ((jxb) arrayList.get(i4)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (sxbVar.y <= 0) {
                        sxbVar.F = true;
                        sxbVar.E = (byte) 2;
                    }
                    sxbVar.getMessagesController().g4.A(1, j, tL_forumTopic2.hidden);
                    if (pxbVar != null) {
                        sxbVar.d1 = pxbVar;
                    }
                    dxb dxbVar = sxbVar.O;
                    boolean z2 = !tL_forumTopic2.hidden;
                    int i9 = qxb.o3;
                    dxbVar.B1(z2, pxbVar);
                    sxbVar.Z0(true, true);
                    if (pxbVar != null) {
                        pxbVar.setTopicIcon(pxbVar.d5);
                    }
                }
                sxbVar.D0();
                break;
            case 14:
                if (sd2.N(sxbVar.getMessagesController().L0(Long.valueOf(j)))) {
                    lp0 lp0Var = new lp0(-j);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sxbVar.Y;
                    lp0Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        lp0Var.getMessagesController().F0().b(lp0Var.S, lp0Var.U, new cp0(lp0Var, (byte) 0));
                    }
                    sxbVar.presentFragment(lp0Var);
                    break;
                } else {
                    sxbVar.getNotificationCenter().k(nm7.p3, Long.valueOf(-j));
                    break;
                }
            case 15:
                da9.F0(-j, sxbVar);
                break;
        }
    }
}
