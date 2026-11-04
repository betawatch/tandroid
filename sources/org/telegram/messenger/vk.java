package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ vk(hp hpVar, TLRPC.Chat chat, boolean z10, long j10) {
        this.b = hpVar;
        this.e = chat;
        this.c = z10;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        boolean z10 = chat.megagroup;
                        hp hpVar = this.b;
                        if (z10) {
                            qr messagesStorage = hpVar.getMessagesStorage();
                            long j11 = chat.id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.a.c(new wp(messagesStorage, j11, zArr, countDownLatch, 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e10) {
                                messagesStorage.o(e10, true);
                            }
                            if (zArr[0]) {
                            }
                        }
                        g0.h3(new yh(12, hpVar, tL_channels_channelParticipant));
                        hpVar.getMessagesStorage().m1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        boolean z11 = this.c;
                        long j12 = this.d;
                        if (z11 && Math.abs(hpVar.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            qr messagesStorage2 = hpVar.getMessagesStorage();
                            messagesStorage2.getClass();
                            j10 = j12;
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.a.c(new wp(messagesStorage2, j10, zArr2, countDownLatch2, 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e11) {
                                messagesStorage2.o(e11, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int j13 = hpVar.getUserConfig().j();
                                tL_messageService.id = j13;
                                tL_messageService.local_id = j13;
                                tL_messageService.date = tL_channels_channelParticipant.participant.date;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel;
                                tL_peerChannel.channel_id = j10;
                                tL_messageService.media_unread = true;
                                tL_messageService.unread = true;
                                tL_messageService.post = true;
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == hpVar.getUserConfig().e()) {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                                } else {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                                }
                                tL_messageService.action.users.add(Long.valueOf(hpVar.getUserConfig().e()));
                                tL_messageService.dialog_id = -j10;
                                hpVar.getUserConfig().v(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i3 = 0; i3 < tL_channels_channelParticipant.users.size(); i3++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i3);
                                    concurrentHashMap.put(Long.valueOf(user.id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new zi(hpVar.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != hpVar.getUserConfig().e()) {
                                    hpVar.getMessagesStorage().a.c(new hj(hpVar, arrayList, 2));
                                }
                                hpVar.getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                qr messagesStorage3 = hpVar.getMessagesStorage();
                                long j14 = j10;
                                messagesStorage3.a.c(new mp(2, tL_channels_channelParticipant.participant.inviter_id, j14, messagesStorage3));
                                g0.h3(new zl(hpVar, j14, arrayList3, tL_channels_channelParticipant, 5));
                                break;
                            }
                        } else {
                            j10 = j12;
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        qr messagesStorage32 = hpVar.getMessagesStorage();
                        long j142 = j10;
                        messagesStorage32.a.c(new mp(2, tL_channels_channelParticipant.participant.inviter_id, j142, messagesStorage32));
                        g0.h3(new zl(hpVar, j142, arrayList32, tL_channels_channelParticipant, 5));
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) this.e;
                if (tL_error == null) {
                    boolean z12 = tLObject instanceof TLRPC.Updates;
                    hp hpVar2 = this.b;
                    if (z12) {
                        hpVar2.O3((TLRPC.Updates) tLObject, false);
                    }
                    if (this.c && !l10.B(user2)) {
                        g0.i3(new dk(hpVar2, this.d, 10), 1000L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ vk(hp hpVar, boolean z10, TLRPC.User user, long j10) {
        this.b = hpVar;
        this.c = z10;
        this.e = user;
        this.d = j10;
    }
}
