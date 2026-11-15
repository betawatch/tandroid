package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ nk(int i7, long j3, long j10, np npVar) {
        this.a = i7;
        this.b = npVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar.L3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                    break;
                }
                break;
            default:
                np npVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        npVar2.J3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, npVar2.Q7, false, false, false);
                    }
                }
                long j10 = this.c;
                if (j10 != 0) {
                    npVar2.getMessagesStorage().q1(j10);
                }
                npVar2.d1.e(this.d);
                break;
        }
    }
}
