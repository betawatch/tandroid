package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ lk(int i7, long j3, long j10, mp mpVar) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar.S3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                    break;
                }
                break;
            default:
                mp mpVar2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        mpVar2.Q3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, mpVar2.V7, false, false, false);
                    }
                }
                long j10 = this.c;
                if (j10 != 0) {
                    mpVar2.getMessagesStorage().q1(j10);
                }
                mpVar2.d1.e(this.d);
                break;
        }
    }
}
