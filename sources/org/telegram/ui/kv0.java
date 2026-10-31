package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_channels_getParticipants e;

    public /* synthetic */ kv0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = tL_channels_getParticipants;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                ProfileActivity profileActivity = this.b;
                profileActivity.getNotificationCenter().d(new kv0(profileActivity, this.c, this.d, this.e, 1));
                break;
            default:
                ProfileActivity profileActivity2 = this.b;
                if (this.c == null) {
                    RectF rectF2 = ProfileActivity.R6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().V3(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().P3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.C1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity2.B1.b();
                        profileActivity2.t2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.hs messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.a.c(new org.telegram.messenger.tr(messagesStorage, profileActivity2.e1, tL_channels_channelParticipants.participants, 2));
                    }
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = C1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.B1.h(C1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.t2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.t2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.B1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.A1 = false;
                profileActivity2.S4();
                profileActivity2.C5(true, false);
                break;
        }
    }
}
