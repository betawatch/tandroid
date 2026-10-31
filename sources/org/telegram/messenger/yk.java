package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ yk(int i10, long j10, long j11, vp vpVar) {
        this.a = i10;
        this.b = vpVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                vpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar.I3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    vpVar.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            default:
                vp vpVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        vpVar2.G3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, vpVar2.Q7, false, false, false);
                    }
                }
                long j11 = this.c;
                if (j11 != 0) {
                    vpVar2.getMessagesStorage().q1(j11);
                }
                vpVar2.c1.e(this.d);
                break;
        }
    }
}
