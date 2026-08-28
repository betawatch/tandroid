package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kq(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i9;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        switch (this.a) {
            case 0:
                jr jrVar = (jr) this.c;
                jrVar.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
                int i10 = this.b;
                int i11 = -100;
                if (peerId > 0) {
                    TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
                    i9 = (user == null || (userStatus2 = user.status) == null) ? 0 : user.self ? i10 + 50000 : userStatus2.expires;
                } else {
                    i9 = -100;
                }
                if (peerId2 > 0) {
                    TLRPC.User user2 = jrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
                    i11 = (user2 == null || (userStatus = user2.status) == null) ? 0 : user2.self ? i10 + 50000 : userStatus.expires;
                }
                if (i9 > 0 && i11 > 0) {
                    if (i9 <= i11) {
                        if (i9 >= i11) {
                            return 0;
                        }
                    }
                }
                if (i9 < 0 && i11 < 0) {
                    if (i9 <= i11) {
                        return i9 < i11 ? -1 : 0;
                    }
                }
                if ((i9 >= 0 || i11 <= 0) && (i9 != 0 || i11 == 0)) {
                    return ((i11 >= 0 || i9 <= 0) && (i11 != 0 || i9 == 0)) ? 0 : 1;
                }
            default:
                return org.telegram.ui.Components.b30.L((org.telegram.ui.Components.b30) this.c, this.b, (TLObject) obj, (TLObject) obj2);
        }
    }
}
