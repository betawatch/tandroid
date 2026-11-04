package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ gk(int i3, long j10, long j11, hp hpVar) {
        this.a = i3;
        this.b = hpVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                hpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar.L3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    hpVar.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            default:
                hp hpVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        hpVar2.J3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, hpVar2.P7, false, false, false);
                    }
                }
                long j11 = this.c;
                if (j11 != 0) {
                    hpVar2.getMessagesStorage().q1(j11);
                }
                hpVar2.d1.e(this.d);
                break;
        }
    }
}
