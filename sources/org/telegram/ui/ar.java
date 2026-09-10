package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ar(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        switch (this.a) {
            case 0:
                wr wrVar = (wr) this.c;
                wrVar.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
                int i11 = this.b;
                int i12 = -100;
                if (peerId > 0) {
                    TLRPC.User user = wrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
                    i10 = (user == null || (userStatus2 = user.status) == null) ? 0 : user.self ? i11 + 50000 : userStatus2.expires;
                } else {
                    i10 = -100;
                }
                if (peerId2 > 0) {
                    TLRPC.User user2 = wrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
                    i12 = (user2 == null || (userStatus = user2.status) == null) ? 0 : user2.self ? i11 + 50000 : userStatus.expires;
                }
                if (i10 > 0 && i12 > 0) {
                    if (i10 <= i12) {
                        if (i10 >= i12) {
                            return 0;
                        }
                    }
                }
                if (i10 < 0 && i12 < 0) {
                    if (i10 <= i12) {
                        return i10 < i12 ? -1 : 0;
                    }
                }
                if ((i10 >= 0 || i12 <= 0) && (i10 != 0 || i12 == 0)) {
                    return ((i12 >= 0 || i10 <= 0) && (i12 != 0 || i10 == 0)) ? 0 : 1;
                }
            default:
                return org.telegram.ui.Components.b40.M((org.telegram.ui.Components.b40) this.c, this.b, (TLObject) obj, (TLObject) obj2);
        }
    }
}
