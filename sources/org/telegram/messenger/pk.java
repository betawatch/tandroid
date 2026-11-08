package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ pk(int i7, long j3, long j10, qp qpVar) {
        this.a = i7;
        this.b = qpVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                qpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar.L3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                    break;
                }
                break;
            default:
                qp qpVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        qpVar2.J3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, qpVar2.P7, false, false, false);
                    }
                }
                long j10 = this.c;
                if (j10 != 0) {
                    qpVar2.getMessagesStorage().q1(j10);
                }
                qpVar2.c1.e(this.d);
                break;
        }
    }
}
