package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_channels_getParticipants e;

    public /* synthetic */ hx0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i9) {
        this.a = i9;
        this.b = profileActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = tL_channels_getParticipants;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getNotificationCenter().doOnIdle(new hx0(profileActivity, this.c, this.d, this.e, 1));
                break;
            default:
                ProfileActivity profileActivity2 = this.b;
                if (this.c == null) {
                    profileActivity2.getClass();
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.z1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity2.y1.b();
                        profileActivity2.q2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        profileActivity2.getMessagesStorage().updateChannelUsers(profileActivity2.b1, tL_channels_channelParticipants.participants);
                    }
                    for (int i9 = 0; i9 < tL_channels_channelParticipants.participants.size(); i9++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i9);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = peerId;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.y1.h(peerId) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.q2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.q2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.y1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.x1 = false;
                profileActivity2.F4();
                profileActivity2.e5(true, false);
                break;
        }
    }
}
