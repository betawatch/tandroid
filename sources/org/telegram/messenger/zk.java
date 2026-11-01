package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ zk(int i10, long j10, long j11, wp wpVar) {
        this.a = i10;
        this.b = wpVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                wpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar.I3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    wpVar.getMessagesStorage().q1(j10);
                    break;
                }
                break;
            default:
                wp wpVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        wpVar2.G3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, wpVar2.Q7, false, false, false);
                    }
                }
                long j11 = this.c;
                if (j11 != 0) {
                    wpVar2.getMessagesStorage().q1(j11);
                }
                wpVar2.c1.e(this.d);
                break;
        }
    }
}
