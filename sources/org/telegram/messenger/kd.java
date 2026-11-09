package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;

    public /* synthetic */ kd(sd sdVar, int i7) {
        this.a = i7;
        this.b = sdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                sd sdVar = this.b;
                if (tL_error == null) {
                    sdVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    sdVar.getClass();
                    break;
                }
            case 1:
                sd sdVar2 = this.b;
                if (tL_error == null) {
                    sdVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    sdVar2.getClass();
                    break;
                }
            default:
                boolean z9 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                sd sdVar3 = this.b;
                if (!z9) {
                    sdVar3.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    sdVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
